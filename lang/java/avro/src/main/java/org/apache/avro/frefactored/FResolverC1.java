package org.apache.avro;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.avro.generic.GenericData;
import org.apache.avro.Schema.Field;
import org.apache.avro.Schema.SeenPair;
import org.apache.avro.FResolverC1.ErrorAction.ErrorType;

public class FResolverC1 {

  private FResolverC1() {
    // Utility class; prevent instantiation.
  }

  public static Action resolve(Schema writer, Schema reader, GenericData data) {
    return resolve(Schema.applyAliases(writer, reader), reader, data, new HashMap<>());
  }

  public static Action resolve(Schema writer, Schema reader) {
    return resolve(writer, reader, GenericData.get());
  }

  private static Action resolve(Schema w, Schema r, GenericData d, Map<SeenPair, Action> seen) {
    final Schema.Type wType = w.getType();
    final Schema.Type rType = r.getType();

    if (wType == Schema.Type.UNION) {
      return WriterUnion.resolve(w, r, d, seen);
    }

    if (wType == rType) {
      switch (wType) {
      case NULL:
      case BOOLEAN:
      case INT:
      case LONG:
      case FLOAT:
      case DOUBLE:
      case STRING:
      case BYTES:
        return new DoNothing(w, r, d);

      case FIXED:
        if (w.getName() != null && !w.getName().equals(r.getName())) {
          return new ErrorAction(w, r, d, ErrorType.NAMES_DONT_MATCH);
        } else if (w.getFixedSize() != r.getFixedSize()) {
          return new ErrorAction(w, r, d, ErrorType.SIZES_DONT_MATCH);
        } else {
          return new DoNothing(w, r, d);
        }

      case ARRAY:
        Action et = resolve(w.getElementType(), r.getElementType(), d, seen);
        return new Container(w, r, d, et);

      case MAP:
        Action vt = resolve(w.getValueType(), r.getValueType(), d, seen);
        return new Container(w, r, d, vt);

      case ENUM:
        return EnumAdjust.resolve(w, r, d);

      case RECORD:
        return RecordAdjust.resolve(w, r, d, seen);

      default:
        throw new IllegalArgumentException("Unknown type for schema: " + wType);
      }
    } else if (rType == Schema.Type.UNION) {
      return ReaderUnion.resolve(w, r, d, seen);
    } else {
      return Promote.resolve(w, r, d);
    }
  }

  public abstract static class Action {
    public enum Type {
      DO_NOTHING, ERROR, PROMOTE, CONTAINER, ENUM, SKIP, RECORD, WRITER_UNION, READER_UNION
    }

    public final Schema writer;
    public final Schema reader;
    public final Type type;

    public final LogicalType logicalType;

    public final Conversion<?> conversion;

    protected Action(Schema w, Schema r, GenericData data, Type t) {
      this.writer = w;
      this.reader = r;
      this.type = t;
      if (r == null) {
        this.logicalType = null;
        this.conversion = null;
      } else {
        this.logicalType = r.getLogicalType();
        this.conversion = data.getConversionFor(logicalType);
      }
    }
  }

  public static class DoNothing extends Action {
    public DoNothing(Schema w, Schema r, GenericData d) {
      super(w, r, d, Action.Type.DO_NOTHING);
    }
  }

  public static class ErrorAction extends Action {
    public enum ErrorType {
      INCOMPATIBLE_SCHEMA_TYPES, NAMES_DONT_MATCH, SIZES_DONT_MATCH, MISSING_REQUIRED_FIELD, NO_MATCHING_BRANCH
    }

    public final ErrorType error;

    public ErrorAction(Schema w, Schema r, GenericData d, ErrorType e) {
      super(w, r, d, Action.Type.ERROR);
      this.error = e;
    }

    @Override
    public String toString() {
      switch (this.error) {
      case INCOMPATIBLE_SCHEMA_TYPES:
      case NAMES_DONT_MATCH:
      case SIZES_DONT_MATCH:
      case NO_MATCHING_BRANCH:
        return "Found " + writer.getFullName() + ", expecting " + reader.getFullName();

      case MISSING_REQUIRED_FIELD: {
        final List<Field> rfields = reader.getFields();
        String fname = "<oops>";
        for (Field rf : rfields) {
          if (writer.getField(rf.name()) == null && rf.defaultValue() == null) {
            fname = rf.name();
          }
        }
        return ("Found " + writer.getFullName() + ", expecting " + reader.getFullName() + ", missing required field "
            + fname);
      }
      default:
        throw new IllegalArgumentException("Unknown error.");
      }
    }
  }

  public static class Promote extends Action {
    private Promote(Schema w, Schema r, GenericData d) {
      super(w, r, d, Action.Type.PROMOTE);
    }

    public static Action resolve(Schema w, Schema r, GenericData d) {
      if (isValid(w, r)) {
        return new Promote(w, r, d);
      } else {
        return new ErrorAction(w, r, d, ErrorType.INCOMPATIBLE_SCHEMA_TYPES);
      }
    }

    public static boolean isValid(Schema w, Schema r) {
      if (w.getType() == r.getType()) {
        throw new IllegalArgumentException("Only use when reader and writer are different.");
      }
      Schema.Type wt = w.getType();
      Schema.Type rt = r.getType();

      if (rt == Schema.Type.LONG) {
        return wt == Schema.Type.INT;
      } else if (rt == Schema.Type.FLOAT) {
        return wt == Schema.Type.INT || wt == Schema.Type.LONG;
      } else if (rt == Schema.Type.DOUBLE) {
        return wt == Schema.Type.INT || wt == Schema.Type.LONG || wt == Schema.Type.FLOAT;
      } else if (rt == Schema.Type.BYTES || rt == Schema.Type.STRING) {
        return wt == Schema.Type.STRING || wt == Schema.Type.BYTES;
      }
      return false;
    }
  }

  public static class Container extends Action {
    public final Action elementAction;

    public Container(Schema w, Schema r, GenericData d, Action e) {
      super(w, r, d, Action.Type.CONTAINER);
      this.elementAction = e;
    }
  }

  public static class EnumAdjust extends Action {
    public final int[] adjustments;
    public final Object[] values;
    public final boolean noAdjustmentsNeeded;

    private EnumAdjust(Schema w, Schema r, GenericData d, int[] adj, Object[] values) {
      super(w, r, d, Action.Type.ENUM);
      this.adjustments = adj;
      boolean noAdj;
      int rsymCount = r.getEnumSymbols().size();
      int count = Math.min(rsymCount, adj.length);
      noAdj = (adj.length <= rsymCount);
      for (int i = 0; noAdj && i < count; i++) {
        noAdj &= (i == adj[i]);
      }
      this.noAdjustmentsNeeded = noAdj;
      this.values = values;
    }

    public static Action resolve(Schema w, Schema r, GenericData d) {
      if (w.getName() != null && !w.getName().equals(r.getName())) {
        return new ErrorAction(w, r, d, ErrorType.NAMES_DONT_MATCH);
      }

      final List<String> wsymbols = w.getEnumSymbols();
      final List<String> rsymbols = r.getEnumSymbols();
      final int defaultIndex = (r.getEnumDefault() == null ? -1 : rsymbols.indexOf(r.getEnumDefault()));
      int[] adjustments = new int[wsymbols.size()];
      Object[] values = new Object[wsymbols.size()];
      Object defaultValue = (defaultIndex == -1) ? null : d.createEnum(r.getEnumDefault(), r);
      for (int i = 0; i < adjustments.length; i++) {
        int j = rsymbols.indexOf(wsymbols.get(i));
        if (j < 0) {
          j = defaultIndex;
        }
        adjustments[i] = j;
        values[i] = (j == defaultIndex) ? defaultValue : d.createEnum(rsymbols.get(j), r);
      }
      return new EnumAdjust(w, r, d, adjustments, values);
    }
  }

  public static class Skip extends Action {
    public Skip(Schema w, GenericData d) {
      super(w, null, d, Action.Type.SKIP);
    }
  }

  public static class RecordAdjust extends Action {
    public final Action[] fieldActions;

    public final Field[] readerOrder;

    public final int firstDefault;

    public final Object[] defaults;

    public final GenericData.InstanceSupplier instanceSupplier;

    public boolean noReorder() {
      boolean result = true;
      for (int i = 0; result && i < readerOrder.length; i++) {
        result &= (i == readerOrder[i].pos());
      }
      return result;
    }

    private RecordAdjust(Schema w, Schema r, GenericData d, Action[] fa, Field[] ro, int firstD, Object[] defaults) {
      super(w, r, d, Action.Type.RECORD);
      this.fieldActions = fa;
      this.readerOrder = ro;
      this.firstDefault = firstD;
      this.defaults = defaults;
      this.instanceSupplier = d.getNewRecordSupplier(r);
    }

    static Action resolve(Schema writeSchema, Schema readSchema, GenericData data, Map<SeenPair, Action> seen) {
      final SeenPair writeReadPair = new SeenPair(writeSchema, readSchema);
      Action result = seen.get(writeReadPair);
      if (result != null) {
        return result;
      }

      final List<Field> writeFields = writeSchema.getFields();
      final List<Field> readFields = readSchema.getFields();

      int firstDefault = 0;
      for (Schema.Field writeField : writeFields) {
        if (readSchema.getField(writeField.name()) != null) {
          ++firstDefault;
        }
      }
      final Action[] actions = new Action[writeFields.size()];
      final Field[] reordered = new Field[readFields.size()];
      final Object[] defaults = new Object[reordered.length - firstDefault];
      result = new RecordAdjust(writeSchema, readSchema, data, actions, reordered, firstDefault, defaults);
      seen.put(writeReadPair, result);

      int i = 0;
      int ridx = 0;
      for (Field writeField : writeFields) {
        final Field readField = readSchema.getField(writeField.name());
        if (readField != null) {
          reordered[ridx++] = readField;
          actions[i++] = FResolverC1.resolve(writeField.schema(), readField.schema(), data, seen);
        } else {
          actions[i++] = new Skip(writeField.schema(), data);
        }
      }
      for (Field readField : readFields) {
        final Field writeField = writeSchema.getField(readField.name());
        if (writeField == null) {
          if (readField.defaultValue() == null) {
            result = new ErrorAction(writeSchema, readSchema, data, ErrorType.MISSING_REQUIRED_FIELD);
            seen.put(writeReadPair, result);
            return result;
          } else {
            defaults[ridx - firstDefault] = data.getDefaultValue(readField);
            reordered[ridx++] = readField;
          }
        }
      }
      return result;
    }
  }

  public static class WriterUnion extends Action {
    public final Action[] actions;
    public final boolean unionEquiv;

    private WriterUnion(Schema w, Schema r, GenericData d, boolean ue, Action[] a) {
      super(w, r, d, Action.Type.WRITER_UNION);
      unionEquiv = ue;
      actions = a;
    }

    public static Action resolve(Schema writeSchema, Schema readSchema, GenericData data, Map<SeenPair, Action> seen) {
      boolean unionEquivalent = unionEquiv(writeSchema, readSchema, new HashMap<>());
      final List<Schema> writeTypes = writeSchema.getTypes();
      final List<Schema> readTypes = (unionEquivalent ? readSchema.getTypes() : null);
      int writeTypeLength = writeTypes.size();
      final Action[] actions = new Action[writeTypeLength];
      for (int i = 0; i < writeTypeLength; i++) {
        actions[i] = FResolverC1.resolve(writeTypes.get(i), (unionEquivalent ? readTypes.get(i) : readSchema), data,
            seen);
      }
      return new WriterUnion(writeSchema, readSchema, data, unionEquivalent, actions);
    }
  }

  public static class ReaderUnion extends Action {
    public final int firstMatch;
    public final Action actualAction;

    public ReaderUnion(Schema w, Schema r, GenericData d, int firstMatch, Action actual) {
      super(w, r, d, Action.Type.READER_UNION);
      this.firstMatch = firstMatch;
      this.actualAction = actual;
    }

    public static Action resolve(Schema w, Schema r, GenericData d, Map<SeenPair, Action> seen) {
      if (w.getType() == Schema.Type.UNION) {
        throw new IllegalArgumentException("Writer schema is union.");
      }
      int i = firstMatchingBranch(w, r, d, seen);
      if (0 <= i) {
        return new ReaderUnion(w, r, d, i, FResolverC1.resolve(w, r.getTypes().get(i), d, seen));
      }
      return new ErrorAction(w, r, d, ErrorType.NO_MATCHING_BRANCH);
    }

    private static int firstMatchingBranch(Schema w, Schema r, GenericData d, Map<SeenPair, Action> seen) {
      final Schema.Type vt = w.getType();

      int exactMatchIndex = findExactBranchMatch(w, r, d, seen, vt);
      if (exactMatchIndex >= 0) {
        return exactMatchIndex;
      }

      return findPromotionBranchMatch(vt, r);
    }

    private static int findExactBranchMatch(Schema w, Schema r, GenericData d, Map<SeenPair, Action> seen,
        Schema.Type vt) {
      int j = 0;
      int structureMatch = -1;
      for (Schema b : r.getTypes()) {
        if (vt == b.getType()) {
          if (vt == Schema.Type.RECORD || vt == Schema.Type.ENUM || vt == Schema.Type.FIXED) {
            final String vname = w.getFullName();
            final String bname = b.getFullName();
            if (vname != null && vname.equals(bname)) {
              return j;
            }

            if (vt == Schema.Type.RECORD && !hasMatchError(RecordAdjust.resolve(w, b, d, seen))) {
              final String vShortName = w.getName();
              final String bShortName = b.getName();
              if ((structureMatch < 0) || (vShortName != null && vShortName.equals(bShortName))) {
                structureMatch = j;
              }
            }
          } else {
            return j;
          }
        }
        j++;
      }

      return structureMatch;
    }

    private static int findPromotionBranchMatch(Schema.Type vt, Schema r) {
      int j = 0;
      for (Schema b : r.getTypes()) {
        Schema.Type bt = b.getType();

        if (vt == Schema.Type.INT) {
          if (bt == Schema.Type.LONG || bt == Schema.Type.DOUBLE || bt == Schema.Type.FLOAT) {
            return j;
          }
        } else if (vt == Schema.Type.LONG) {
          if (bt == Schema.Type.DOUBLE || bt == Schema.Type.FLOAT) {
            return j;
          }
        } else if (vt == Schema.Type.FLOAT) {
          if (bt == Schema.Type.DOUBLE) {
            return j;
          }
        } else if (vt == Schema.Type.STRING) {
          if (bt == Schema.Type.BYTES) {
            return j;
          }
        } else if (vt == Schema.Type.BYTES) {
          if (bt == Schema.Type.STRING) {
            return j;
          }
        }

        j++;
      }
      return -1;
    }

    private static boolean hasMatchError(Action action) {
      if (action instanceof ErrorAction) {
        return true;
      }
      for (Action a : ((RecordAdjust) action).fieldActions) {
        if (a instanceof ErrorAction) {
          return true;
        }
      }
      return false;
    }
  }

  private static boolean unionEquiv(Schema write, Schema read, Map<SeenPair, Boolean> seen) {
    final Schema.Type wt = write.getType();
    if (wt != read.getType()) {
      return false;
    }

    if ((wt == Schema.Type.RECORD || wt == Schema.Type.FIXED || wt == Schema.Type.ENUM)
        && !(write.getName() == null || write.getName().equals(read.getName()))) {
      return false;
    }

    switch (wt) {
    case NULL:
    case BOOLEAN:
    case INT:
    case LONG:
    case FLOAT:
    case DOUBLE:
    case STRING:
    case BYTES:
      return true;

    case ARRAY:
      return unionEquivArray(write, read, seen);

    case MAP:
      return unionEquivMap(write, read, seen);

    case FIXED:
      return unionEquivFixed(write, read);

    case ENUM:
      return unionEquivEnum(write, read);

    case UNION:
      return unionEquivUnion(write, read, seen);

    case RECORD:
      return unionEquivRecord(write, read, seen);

    default:
      throw new IllegalArgumentException("Unknown schema type: " + write.getType());
    }
  }

  private static boolean unionEquivArray(Schema write, Schema read, Map<SeenPair, Boolean> seen) {
    return unionEquiv(write.getElementType(), read.getElementType(), seen);
  }

  private static boolean unionEquivMap(Schema write, Schema read, Map<SeenPair, Boolean> seen) {
    return unionEquiv(write.getValueType(), read.getValueType(), seen);
  }

  private static boolean unionEquivFixed(Schema write, Schema read) {
    return write.getFixedSize() == read.getFixedSize();
  }

  private static boolean unionEquivEnum(Schema write, Schema read) {
    final List<String> ws = write.getEnumSymbols();
    final List<String> rs = read.getEnumSymbols();
    return ws.equals(rs);
  }

  private static boolean unionEquivUnion(Schema write, Schema read, Map<SeenPair, Boolean> seen) {
    final List<Schema> wb = write.getTypes();
    final List<Schema> rb = read.getTypes();
    if (wb.size() != rb.size()) {
      return false;
    }
    for (int i = 0; i < wb.size(); i++) {
      if (!unionEquiv(wb.get(i), rb.get(i), seen)) {
        return false;
      }
    }
    return true;
  }

  private static boolean unionEquivRecord(Schema write, Schema read, Map<SeenPair, Boolean> seen) {
    final SeenPair wsc = new SeenPair(write, read);
    if (!seen.containsKey(wsc)) {
      seen.put(wsc, true);
      final List<Field> wb = write.getFields();
      final List<Field> rb = read.getFields();
      if (wb.size() != rb.size()) {
        seen.put(wsc, false);
      } else {
        for (int i = 0; i < wb.size(); i++) {
          if (!wb.get(i).name().equals(rb.get(i).name()) || !unionEquiv(wb.get(i).schema(), rb.get(i).schema(), seen)) {
            seen.put(wsc, false);
            break;
          }
        }
      }
    }
    return seen.get(wsc);
  }
}
