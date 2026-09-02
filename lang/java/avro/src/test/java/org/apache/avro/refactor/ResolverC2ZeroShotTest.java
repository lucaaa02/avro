package org.apache.avro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.apache.avro.C2Resolver.Action;
import org.apache.avro.C2Resolver.Container;
import org.apache.avro.C2Resolver.DoNothing;
import org.apache.avro.C2Resolver.EnumAdjust;
import org.apache.avro.C2Resolver.ErrorAction;
import org.apache.avro.C2Resolver.Promote;
import org.apache.avro.C2Resolver.ReaderUnion;
import org.apache.avro.C2Resolver.RecordAdjust;
import org.apache.avro.C2Resolver.Skip;
import org.apache.avro.C2Resolver.WriterUnion;
import org.apache.avro.generic.GenericData;
import org.junit.jupiter.api.Test;

public class ResolverC2ZeroShotTest {

  @Test
  public void testPrimitiveDoNothing() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.INT);

    Action action = C2Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.DO_NOTHING, action.type);
    assertTrue(action instanceof DoNothing);
    assertEquals(writer, action.writer);
    assertEquals(reader, action.reader);
  }

  @Test
  public void testPrimitivePromoteValid() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.LONG);

    Action action = C2Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.PROMOTE, action.type);
    assertTrue(action instanceof Promote);
    assertEquals(writer, action.writer);
    assertEquals(reader, action.reader);
  }

  @Test
  public void testPrimitivePromoteInvalid() {
    Schema writer = Schema.create(Schema.Type.LONG);
    Schema reader = Schema.create(Schema.Type.INT);

    Action action = C2Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.ERROR, action.type);
    assertTrue(action instanceof ErrorAction);
    assertEquals(ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES, ((ErrorAction) action).error);
  }

  @Test
  public void testFixedMatch() {
    Schema writer = Schema.createFixed("MyFixed", "doc", "ns", 10);
    Schema reader = Schema.createFixed("MyFixed", "doc", "ns", 10);

    Action action = C2Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.DO_NOTHING, action.type);
  }

  @Test
  public void testFixedNamesDontMatch() {
    Schema writer = Schema.createFixed("FixedA", "doc", "ns", 10);
    Schema reader = Schema.createFixed("FixedB", "doc", "ns", 10);

    Action action = C2Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.ERROR, action.type);
    assertEquals(ErrorAction.ErrorType.NAMES_DONT_MATCH, ((ErrorAction) action).error);
  }

  @Test
  public void testFixedSizesDontMatch() {
    Schema writer = Schema.createFixed("MyFixed", "doc", "ns", 10);
    Schema reader = Schema.createFixed("MyFixed", "doc", "ns", 12);

    Action action = C2Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.ERROR, action.type);
    assertEquals(ErrorAction.ErrorType.SIZES_DONT_MATCH, ((ErrorAction) action).error);
  }

  @Test
  public void testArrayResolution() {
    Schema writer = Schema.createArray(Schema.create(Schema.Type.INT));
    Schema reader = Schema.createArray(Schema.create(Schema.Type.LONG));

    Action action = C2Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.CONTAINER, action.type);
    assertTrue(action instanceof Container);
    Container container = (Container) action;
    assertNotNull(container.elementAction);
    assertEquals(Action.Type.PROMOTE, container.elementAction.type);
  }

  @Test
  public void testMapResolution() {
    Schema writer = Schema.createMap(Schema.create(Schema.Type.STRING));
    Schema reader = Schema.createMap(Schema.create(Schema.Type.STRING));

    Action action = C2Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.CONTAINER, action.type);
    assertTrue(action instanceof Container);
    Container container = (Container) action;
    assertNotNull(container.elementAction);
    assertEquals(Action.Type.DO_NOTHING, container.elementAction.type);
  }

  @Test
  public void testEnumResolution() {
    Schema writer = Schema.createEnum("MyEnum", "doc", "ns", Arrays.asList("A", "B"));
    Schema reader = Schema.createEnum("MyEnum", "doc", "ns", Arrays.asList("A", "B", "C"));

    Action action = C2Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.ENUM, action.type);
    assertTrue(action instanceof EnumAdjust);
    EnumAdjust enumAdjust = (EnumAdjust) action;
    assertNotNull(enumAdjust.adjustments);
    assertTrue(enumAdjust.noAdjustmentsNeeded);
  }

  @Test
  public void testEnumNamesDontMatch() {
    Schema writer = Schema.createEnum("EnumA", "doc", "ns", Arrays.asList("A"));
    Schema reader = Schema.createEnum("EnumB", "doc", "ns", Arrays.asList("A"));

    Action action = C2Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.ERROR, action.type);
    assertEquals(ErrorAction.ErrorType.NAMES_DONT_MATCH, ((ErrorAction) action).error);
  }

  @Test
  public void testRecordResolutionMatchingFields() {
    Schema writer = Schema.createRecord("MyRecord", "doc", "ns", false,
        Arrays.asList(new Schema.Field("f1", Schema.create(Schema.Type.INT), "doc", null)));
    Schema reader = Schema.createRecord("MyRecord", "doc", "ns", false,
        Arrays.asList(new Schema.Field("f1", Schema.create(Schema.Type.INT), "doc", null)));

    Action action = C2Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.RECORD, action.type);
    assertTrue(action instanceof RecordAdjust);
    RecordAdjust recordAdjust = (RecordAdjust) action;
    assertEquals(1, recordAdjust.fieldActions.length);
    assertEquals(Action.Type.DO_NOTHING, recordAdjust.fieldActions[0].type);
    assertTrue(recordAdjust.noReorder());
  }

  @Test
  public void testRecordMissingRequiredField() {
    Schema writer = Schema.createRecord("MyRecord", "doc", "ns", false, Collections.emptyList());
    Schema reader = Schema.createRecord("MyRecord", "doc", "ns", false,
        Arrays.asList(new Schema.Field("f1", Schema.create(Schema.Type.INT), "doc", (Object) null)));

    Action action = C2Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.ERROR, action.type);
    assertEquals(ErrorAction.ErrorType.MISSING_REQUIRED_FIELD, ((ErrorAction) action).error);
    assertNotNull(action.toString());
  }

  @Test
  public void testRecordWithDefaults() {
    Schema writer = Schema.createRecord("MyRecord", "doc", "ns", false, Collections.emptyList());
    Schema reader = Schema.createRecord("MyRecord", "doc", "ns", false,
        Arrays.asList(new Schema.Field("f1", Schema.create(Schema.Type.INT), "doc", 42)));

    Action action = C2Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.RECORD, action.type);
    RecordAdjust recordAdjust = (RecordAdjust) action;
    assertEquals(0, recordAdjust.fieldActions.length);
    assertEquals(1, recordAdjust.defaults.length);
    assertEquals(42, recordAdjust.defaults[0]);
  }

  @Test
  public void testRecordWithSkip() {
    Schema writer = Schema.createRecord("MyRecord", "doc", "ns", false,
        Arrays.asList(new Schema.Field("f1", Schema.create(Schema.Type.INT), "doc", null)));
    Schema reader = Schema.createRecord("MyRecord", "doc", "ns", false, Collections.emptyList());

    Action action = C2Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.RECORD, action.type);
    RecordAdjust recordAdjust = (RecordAdjust) action;
    assertEquals(1, recordAdjust.fieldActions.length);
    assertTrue(recordAdjust.fieldActions[0] instanceof Skip);
    assertNull(recordAdjust.fieldActions[0].reader);
  }

  @Test
  public void testWriterUnionResolutionEquivalent() {
    Schema w1 = Schema.create(Schema.Type.INT);
    Schema w2 = Schema.create(Schema.Type.STRING);
    Schema writer = Schema.createUnion(Arrays.asList(w1, w2));
    Schema reader = Schema.createUnion(Arrays.asList(w1, w2));

    Action action = C2Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.WRITER_UNION, action.type);
    assertTrue(action instanceof WriterUnion);
    WriterUnion wu = (WriterUnion) action;
    assertTrue(wu.unionEquiv);
    assertEquals(2, wu.actions.length);
  }

  @Test
  public void testReaderUnionResolution() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema
        .createUnion(Arrays.asList(Schema.create(Schema.Type.STRING), Schema.create(Schema.Type.INT)));

    Action action = C2Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.READER_UNION, action.type);
    assertTrue(action instanceof ReaderUnion);
    ReaderUnion ru = (ReaderUnion) action;
    assertEquals(1, ru.firstMatch);
    assertEquals(Action.Type.DO_NOTHING, ru.actualAction.type);
  }

  @Test
  public void testReaderUnionNoMatchingBranch() {
    Schema writer = Schema.create(Schema.Type.BYTES);
    Schema reader = Schema.createUnion(Arrays.asList(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.LONG)));

    Action action = C2Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.ERROR, action.type);
    assertEquals(ErrorAction.ErrorType.NO_MATCHING_BRANCH, ((ErrorAction) action).error);
  }

  @Test
  public void testPromoteInvalidExplicitUsage() {
    Schema s1 = Schema.create(Schema.Type.INT);
    Schema s2 = Schema.create(Schema.Type.INT);
    GenericData data = GenericData.get();

    assertThrows(IllegalArgumentException.class, () -> {
      Promote.resolve(s1, s2, data);
    });
  }

  @Test
  public void testWriterUnionArgumentValidation() {
    Schema w1 = Schema.create(Schema.Type.INT);
    Schema w2 = Schema.create(Schema.Type.STRING);
    Schema writerUnion = Schema.createUnion(Arrays.asList(w1, w2));
    Schema reader = Schema.create(Schema.Type.INT);
    GenericData data = GenericData.get();

    assertThrows(IllegalArgumentException.class, () -> {
      ReaderUnion.resolve(writerUnion, reader, data, new java.util.HashMap<>());
    });
  }

  @Test
  public void testErrorActionToStringVariants() {
    Schema w = Schema.create(Schema.Type.INT);
    Schema r = Schema.create(Schema.Type.STRING);
    GenericData data = GenericData.get();

    ErrorAction ea1 = new ErrorAction(w, r, data, ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES);
    assertNotNull(ea1.toString());

    ErrorAction ea2 = new ErrorAction(w, r, data, ErrorAction.ErrorType.NO_MATCHING_BRANCH);
    assertNotNull(ea2.toString());
  }
}