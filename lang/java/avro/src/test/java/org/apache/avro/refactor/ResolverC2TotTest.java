package org.apache.avro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import org.apache.avro.C2Resolver.Action;
import org.apache.avro.generic.GenericData;
import org.junit.jupiter.api.Test;

public class ResolverC2TotTest {

  @Test
  void testResolvePrimitiveDoNothing() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.INT);
    Action action = C2Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(Action.Type.DO_NOTHING, action.type);
  }

  @Test
  void testResolvePrimitivePromotion() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.LONG);
    Action action = C2Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(Action.Type.PROMOTE, action.type);
  }

  @Test
  void testResolveIncompatibleTypes() {
    Schema writer = Schema.create(Schema.Type.STRING);
    Schema reader = Schema.create(Schema.Type.INT);
    Action action = C2Resolver.resolve(writer, reader);
    assertEquals(Action.Type.ERROR, action.type);
    assertEquals(C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES, ((C2Resolver.ErrorAction) action).error);
  }

  @Test
  void testResolveFixedSizeMismatch() {
    Schema writer = Schema.createFixed("MyFixed", "doc", "ns", 4);
    Schema reader = Schema.createFixed("MyFixed", "doc", "ns", 8);
    Action action = C2Resolver.resolve(writer, reader);
    assertEquals(Action.Type.ERROR, action.type);
    assertEquals(C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH, ((C2Resolver.ErrorAction) action).error);
  }

  @Test
  void testReaderUnionNoMatchingBranch() {
    Schema writer = Schema.create(Schema.Type.STRING);
    Schema reader = Schema.createUnion(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.LONG));
    Action action = C2Resolver.resolve(writer, reader);
    assertEquals(Action.Type.ERROR, action.type);
    assertEquals(C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH, ((C2Resolver.ErrorAction) action).error);
  }

  @Test
  void testRecordMissingRequiredField() {
    Schema writer = Schema.createRecord("MyRecord", "doc", "ns", false,
        Collections.singletonList(new Schema.Field("field1", Schema.create(Schema.Type.INT))));
    Schema reader = Schema.createRecord("MyRecord", "doc", "ns", false,
        java.util.Arrays.asList(new Schema.Field("field1", Schema.create(Schema.Type.INT)),
            new Schema.Field("field2", Schema.create(Schema.Type.STRING)) // Missing default value
        ));
    Action action = C2Resolver.resolve(writer, reader, GenericData.get());
    assertEquals(Action.Type.ERROR, action.type);
    assertEquals(C2Resolver.ErrorAction.ErrorType.MISSING_REQUIRED_FIELD, ((C2Resolver.ErrorAction) action).error);
  }
}