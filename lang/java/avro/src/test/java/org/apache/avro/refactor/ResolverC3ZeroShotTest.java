package org.apache.avro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import org.apache.avro.C3Resolver.Action;
import org.apache.avro.C3Resolver.Container;
import org.apache.avro.C3Resolver.DoNothing;
import org.apache.avro.C3Resolver.EnumAdjust;
import org.apache.avro.C3Resolver.ErrorAction;
import org.apache.avro.C3Resolver.Promote;
import org.apache.avro.C3Resolver.ReaderUnion;
import org.apache.avro.C3Resolver.RecordAdjust;
import org.apache.avro.C3Resolver.Skip;
import org.apache.avro.C3Resolver.WriterUnion;
import org.apache.avro.generic.GenericData;
import org.junit.jupiter.api.Test;

public class ResolverC3ZeroShotTest {

  @Test
  public void testResolvePrimitiveDoNothing() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.INT);
    Action action = C3Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(Action.Type.DO_NOTHING, action.type);
    assertTrue(action instanceof DoNothing);
  }

  @Test
  public void testResolvePromoteIntToLong() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.LONG);
    Action action = C3Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(Action.Type.PROMOTE, action.type);
    assertTrue(action instanceof Promote);
  }

  @Test
  public void testResolveIncompatiblePrimitives() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.STRING);
    Action action = C3Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(Action.Type.ERROR, action.type);
    assertTrue(action instanceof ErrorAction);
    assertEquals(ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES, ((ErrorAction) action).error);
  }

  @Test
  public void testResolveFixedMatching() {
    Schema writer = Schema.createFixed("MyFixed", null, null, 10);
    Schema reader = Schema.createFixed("MyFixed", null, null, 10);
    Action action = C3Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(Action.Type.DO_NOTHING, action.type);
  }

  @Test
  public void testResolveFixedNameMismatch() {
    Schema writer = Schema.createFixed("FixedA", null, null, 10);
    Schema reader = Schema.createFixed("FixedB", null, null, 10);
    Action action = C3Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(Action.Type.ERROR, action.type);
    assertEquals(ErrorAction.ErrorType.NAMES_DONT_MATCH, ((ErrorAction) action).error);
  }

  @Test
  public void testResolveFixedSizeMismatch() {
    Schema writer = Schema.createFixed("MyFixed", null, null, 10);
    Schema reader = Schema.createFixed("MyFixed", null, null, 20);
    Action action = C3Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(Action.Type.ERROR, action.type);
    assertEquals(ErrorAction.ErrorType.SIZES_DONT_MATCH, ((ErrorAction) action).error);
  }

  @Test
  public void testResolveArray() {
    Schema writer = Schema.createArray(Schema.create(Schema.Type.INT));
    Schema reader = Schema.createArray(Schema.create(Schema.Type.LONG));
    Action action = C3Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(Action.Type.CONTAINER, action.type);
    assertTrue(action instanceof Container);
    Container container = (Container) action;
    assertEquals(Action.Type.PROMOTE, container.elementAction.type);
  }

  @Test
  public void testResolveMap() {
    Schema writer = Schema.createMap(Schema.create(Schema.Type.STRING));
    Schema reader = Schema.createMap(Schema.create(Schema.Type.STRING));
    Action action = C3Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(Action.Type.CONTAINER, action.type);
    assertTrue(action instanceof Container);
    Container container = (Container) action;
    assertEquals(Action.Type.DO_NOTHING, container.elementAction.type);
  }

  @Test
  public void testResolveEnumMatching() {
    Schema writer = Schema.createEnum("MyEnum", null, null, Arrays.asList("A", "B"));
    Schema reader = Schema.createEnum("MyEnum", null, null, Arrays.asList("A", "B"));
    Action action = C3Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(Action.Type.ENUM, action.type);
    assertTrue(action instanceof EnumAdjust);
  }

  @Test
  public void testResolveEnumNameMismatch() {
    Schema writer = Schema.createEnum("EnumA", null, null, Arrays.asList("A"));
    Schema reader = Schema.createEnum("EnumB", null, null, Arrays.asList("A"));
    Action action = C3Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(Action.Type.ERROR, action.type);
    assertEquals(ErrorAction.ErrorType.NAMES_DONT_MATCH, ((ErrorAction) action).error);
  }

  @Test
  public void testResolveRecordMatching() {
    Schema writer = Schema.createRecord("MyRecord", null, null, false,
        Arrays.asList(new Schema.Field("f1", Schema.create(Schema.Type.INT), null, null)));
    Schema reader = Schema.createRecord("MyRecord", null, null, false,
        Arrays.asList(new Schema.Field("f1", Schema.create(Schema.Type.INT), null, null)));
    Action action = C3Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(Action.Type.RECORD, action.type);
    assertTrue(action instanceof RecordAdjust);
  }

  @Test
  public void testResolveRecordMissingRequiredField() {
    Schema writer = Schema.createRecord("MyRecord", null, null, false, Collections.emptyList());
    Schema reader = Schema.createRecord("MyRecord", null, null, false,
        Arrays.asList(new Schema.Field("f1", Schema.create(Schema.Type.INT), null, null)));
    Action action = C3Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(Action.Type.ERROR, action.type);
    assertEquals(ErrorAction.ErrorType.MISSING_REQUIRED_FIELD, ((ErrorAction) action).error);
  }

  @Test
  public void testResolveWriterUnion() {
    Schema writer = Schema
        .createUnion(Arrays.asList(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.STRING)));
    Schema reader = Schema
        .createUnion(Arrays.asList(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.STRING)));
    Action action = C3Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(Action.Type.WRITER_UNION, action.type);
    assertTrue(action instanceof WriterUnion);
  }

  @Test
  public void testResolveReaderUnion() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema
        .createUnion(Arrays.asList(Schema.create(Schema.Type.STRING), Schema.create(Schema.Type.INT)));
    Action action = C3Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(Action.Type.READER_UNION, action.type);
    assertTrue(action instanceof ReaderUnion);
    assertEquals(1, ((ReaderUnion) action).firstMatch);
  }

  @Test
  public void testResolveReaderUnionNoMatch() {
    Schema writer = Schema.create(Schema.Type.BYTES);
    Schema reader = Schema
        .createUnion(Arrays.asList(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.STRING)));

    C3Resolver.Action action = C3Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(C3Resolver.Action.Type.READER_UNION, action.type);
    assertTrue(action instanceof C3Resolver.ReaderUnion);
  }

  @Test
  public void testPromoteIsValidThrowsWhenSameType() {
    Schema schema = Schema.create(Schema.Type.INT);
    assertThrows(IllegalArgumentException.class, () -> Promote.isValid(schema, schema));
  }
}