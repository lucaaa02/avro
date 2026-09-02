package org.apache.avro;

import org.apache.avro.generic.GenericData;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ResolverC3TotTest {

  @Test
  void testResolvePrimitiveDoNothing() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.INT);
    C3Resolver.Action action = C3Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C3Resolver.Action.Type.DO_NOTHING, action.type);
  }

  @Test
  void testResolveWithExplicitData() {
    Schema writer = Schema.create(Schema.Type.STRING);
    Schema reader = Schema.create(Schema.Type.STRING);
    GenericData data = GenericData.get();
    C3Resolver.Action action = C3Resolver.resolve(writer, reader, data);
    assertNotNull(action);
    assertEquals(C3Resolver.Action.Type.DO_NOTHING, action.type);
  }

  @Test
  void testPromoteIsValidValidCase() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.LONG);
    assertTrue(C3Resolver.Promote.isValid(writer, reader));
  }

  @Test
  void testPromoteIsValidSameTypeThrowsException() {
    Schema schema = Schema.create(Schema.Type.INT);
    assertThrows(IllegalArgumentException.class, () -> {
      C3Resolver.Promote.isValid(schema, schema);
    });
  }

  @Test
  void testPromoteResolveIncompatible() {
    Schema writer = Schema.create(Schema.Type.STRING);
    Schema reader = Schema.create(Schema.Type.INT);
    C3Resolver.Action action = C3Resolver.Promote.resolve(writer, reader, GenericData.get());
    assertEquals(C3Resolver.Action.Type.ERROR, action.type);
    assertEquals(C3Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES, ((C3Resolver.ErrorAction) action).error);
  }

  @Test
  void testFixedSizesDontMatch() {
    Schema writer = Schema.createFixed("MyFixed", null, null, 4);
    Schema reader = Schema.createFixed("MyFixed", null, null, 8);
    C3Resolver.Action action = C3Resolver.resolve(writer, reader);
    assertEquals(C3Resolver.Action.Type.ERROR, action.type);
    assertEquals(C3Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH, ((C3Resolver.ErrorAction) action).error);
  }

  @Test
  void testReaderUnionWriterUnionException() {
    Schema writerUnion = Schema.createUnion(Schema.create(Schema.Type.INT));
    Schema reader = Schema.create(Schema.Type.LONG);
    assertThrows(IllegalArgumentException.class, () -> {
      C3Resolver.ReaderUnion.resolve(writerUnion, reader, GenericData.get(), new HashMap<>());
    });
  }

  @Test
  void testErrorActionToString() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.BOOLEAN);
    C3Resolver.ErrorAction errorAction = new C3Resolver.ErrorAction(writer, reader, GenericData.get(),
        C3Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES);
    String msg = errorAction.toString();
    assertNotNull(msg);
    assertTrue(msg.contains("expecting"));
  }
}