package org.apache.avro;

import org.apache.avro.generic.GenericData;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResolverC1TotTest {

  @Test
  void testResolvePrimitiveDoNothing() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.INT);
    C1Resolver.Action action = C1Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.DO_NOTHING, action.type);
  }

  @Test
  void testResolveWithExplicitGenericData() {
    Schema writer = Schema.create(Schema.Type.LONG);
    Schema reader = Schema.create(Schema.Type.LONG);
    C1Resolver.Action action = C1Resolver.resolve(writer, reader, GenericData.get());
    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.DO_NOTHING, action.type);
  }

  @Test
  void testPromoteIntToLong() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.LONG);
    C1Resolver.Action action = C1Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C1Resolver.Action.Type.PROMOTE, action.type);
  }

  @Test
  void testIncompatibleSchemaTypesError() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.BOOLEAN);
    C1Resolver.Action action = C1Resolver.resolve(writer, reader);
    assertEquals(C1Resolver.Action.Type.ERROR, action.type);
    assertEquals(C1Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES,
        ((C1Resolver.ErrorAction) action).errorType);
    assertNotNull(action.toString());
  }

  @Test
  void testFixedSizesMismatchError() {
    Schema writer = Schema.createFixed("TestFixed", null, null, 4);
    Schema reader = Schema.createFixed("TestFixed", null, null, 8);
    C1Resolver.Action action = C1Resolver.resolve(writer, reader);
    assertEquals(C1Resolver.Action.Type.ERROR, action.type);
    assertEquals(C1Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH, ((C1Resolver.ErrorAction) action).errorType);
  }

  @Test
  void testReaderUnionNoMatchingBranchError() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.createUnion(Schema.create(Schema.Type.BOOLEAN), Schema.create(Schema.Type.STRING));
    C1Resolver.Action action = C1Resolver.resolve(writer, reader);
    assertEquals(C1Resolver.Action.Type.ERROR, action.type);
    assertEquals(C1Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH, ((C1Resolver.ErrorAction) action).errorType);
  }

  @Test
  void testRecordMissingRequiredFieldError() {
    Schema writer = Schema.createRecord("MyRecord", null, null, false, List.of());
    Schema reader = Schema.createRecord("MyRecord", null, null, false,
        List.of(new Schema.Field("requiredField", Schema.create(Schema.Type.INT), null, null)));
    C1Resolver.Action action = C1Resolver.resolve(writer, reader);
    assertEquals(C1Resolver.Action.Type.ERROR, action.type);
    assertEquals(C1Resolver.ErrorAction.ErrorType.MISSING_REQUIRED_FIELD, ((C1Resolver.ErrorAction) action).errorType);
  }
}