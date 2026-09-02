package org.apache.avro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.avro.generic.GenericData;
import org.junit.jupiter.api.Test;

public class ResolverC1ZeroShotTest {

  @Test
  public void testResolvePrimitiveSameType() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.INT);

    C1Resolver.Action action = C1Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.DO_NOTHING, action.type);
    assertTrue(action instanceof C1Resolver.DoNothing);
    assertEquals(writer, action.writer);
    assertEquals(reader, action.reader);
  }

  @Test
  public void testResolvePromoteIntToLong() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.LONG);

    C1Resolver.Action action = C1Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.PROMOTE, action.type);
    assertTrue(action instanceof C1Resolver.Promote);
  }

  @Test
  public void testResolveIncompatiblePrimitives() {
    Schema writer = Schema.create(Schema.Type.STRING);
    Schema reader = Schema.create(Schema.Type.INT);

    C1Resolver.Action action = C1Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.ERROR, action.type);
    assertTrue(action instanceof C1Resolver.ErrorAction);
    assertEquals(C1Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES,
        ((C1Resolver.ErrorAction) action).errorType);
  }

  @Test
  public void testResolveFixedSameSizeAndName() {
    Schema writer = Schema.createFixed("MyFixed", "doc", null, 10);
    Schema reader = Schema.createFixed("MyFixed", "doc", null, 10);

    C1Resolver.Action action = C1Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.DO_NOTHING, action.type);
  }

  @Test
  public void testResolveFixedSizesDontMatch() {
    Schema writer = Schema.createFixed("MyFixed", "doc", null, 10);
    Schema reader = Schema.createFixed("MyFixed", "doc", null, 20);

    C1Resolver.Action action = C1Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.ERROR, action.type);
    assertEquals(C1Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH, ((C1Resolver.ErrorAction) action).errorType);
  }

  @Test
  public void testResolveFixedNamesDontMatch() {
    Schema writer = Schema.createFixed("FixedA", "doc", null, 10);
    Schema reader = Schema.createFixed("FixedB", "doc", null, 10);

    C1Resolver.Action action = C1Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.ERROR, action.type);
    assertEquals(C1Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH, ((C1Resolver.ErrorAction) action).errorType);
  }

  @Test
  public void testResolveArray() {
    Schema writer = Schema.createArray(Schema.create(Schema.Type.INT));
    Schema reader = Schema.createArray(Schema.create(Schema.Type.LONG));

    C1Resolver.Action action = C1Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.CONTAINER, action.type);
    assertTrue(action instanceof C1Resolver.Container);
    C1Resolver.Container container = (C1Resolver.Container) action;
    assertEquals(C1Resolver.Action.Type.PROMOTE, container.elementAction.type);
  }

  @Test
  public void testResolveMap() {
    Schema writer = Schema.createMap(Schema.create(Schema.Type.STRING));
    Schema reader = Schema.createMap(Schema.create(Schema.Type.STRING));

    C1Resolver.Action action = C1Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.CONTAINER, action.type);
    assertTrue(action instanceof C1Resolver.Container);
  }

  @Test
  public void testResolveEnumMatching() {
    Schema writer = Schema.createEnum("MyEnum", "doc", null, Arrays.asList("A", "B"));
    Schema reader = Schema.createEnum("MyEnum", "doc", null, Arrays.asList("B", "A"));

    C1Resolver.Action action = C1Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.ENUM, action.type);
    assertTrue(action instanceof C1Resolver.EnumAdjust);
  }

  @Test
  public void testResolveEnumNamesDontMatch() {
    Schema writer = Schema.createEnum("EnumA", "doc", null, Arrays.asList("A"));
    Schema reader = Schema.createEnum("EnumB", "doc", null, Arrays.asList("A"));

    C1Resolver.Action action = C1Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.ERROR, action.type);
    assertEquals(C1Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH, ((C1Resolver.ErrorAction) action).errorType);
  }

  @Test
  public void testResolveRecordMatching() {
    Schema writer = Schema.createRecord("MyRecord", "doc", null, false,
        Collections.singletonList(new Schema.Field("f1", Schema.create(Schema.Type.INT), "doc", null)));
    Schema reader = Schema.createRecord("MyRecord", "doc", null, false,
        Collections.singletonList(new Schema.Field("f1", Schema.create(Schema.Type.LONG), "doc", null)));

    C1Resolver.Action action = C1Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.RECORD, action.type);
    assertTrue(action instanceof C1Resolver.RecordAdjust);
  }

  @Test
  public void testResolveRecordMissingRequiredField() {
    Schema writer = Schema.createRecord("MyRecord", "doc", null, false, Collections.emptyList());
    Schema reader = Schema.createRecord("MyRecord", "doc", null, false,
        Collections.singletonList(new Schema.Field("f1", Schema.create(Schema.Type.INT), "doc", null)));

    C1Resolver.Action action = C1Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.ERROR, action.type);
    assertEquals(C1Resolver.ErrorAction.ErrorType.MISSING_REQUIRED_FIELD, ((C1Resolver.ErrorAction) action).errorType);
  }

  @Test
  public void testResolveWriterUnion() {
    Schema writer = Schema
        .createUnion(Arrays.asList(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.STRING)));
    Schema reader = Schema
        .createUnion(Arrays.asList(Schema.create(Schema.Type.LONG), Schema.create(Schema.Type.STRING)));

    C1Resolver.Action action = C1Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.WRITER_UNION, action.type);
    assertTrue(action instanceof C1Resolver.WriterUnion);
  }

  @Test
  public void testResolveReaderUnion() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema
        .createUnion(Arrays.asList(Schema.create(Schema.Type.STRING), Schema.create(Schema.Type.LONG)));

    C1Resolver.Action action = C1Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.READER_UNION, action.type);
    assertTrue(action instanceof C1Resolver.ReaderUnion);
  }

  @Test
  public void testResolveReaderUnionNoMatchingBranch() {
    Schema writer = Schema.create(Schema.Type.BYTES);
    Schema reader = Schema
        .createUnion(Arrays.asList(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.STRING)));

    C1Resolver.Action action = C1Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.READER_UNION, action.type);
    assertTrue(action instanceof C1Resolver.ReaderUnion);
  }

  @Test
  public void testPromoteIsValidThrowsOnSameType() {
    Schema schema = Schema.create(Schema.Type.INT);
    assertThrows(IllegalArgumentException.class, () -> {
      C1Resolver.Promote.isValid(schema, schema);
    });
  }

  @Test
  public void testErrorActionToString() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.STRING);
    C1Resolver.ErrorAction errorAction = new C1Resolver.ErrorAction(writer, reader, new GenericData(),
        C1Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES);

    String str = errorAction.toString();
    assertNotNull(str);
  }
}