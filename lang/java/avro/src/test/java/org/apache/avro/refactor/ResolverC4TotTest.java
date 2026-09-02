package org.apache.avro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.avro.C4Resolver.Action;
import org.apache.avro.C4Resolver.DoNothing;
import org.apache.avro.C4Resolver.ErrorAction;
import org.apache.avro.C4Resolver.ErrorAction.ErrorType;
import org.apache.avro.C4Resolver.Promote;
import org.apache.avro.generic.GenericData;
import org.junit.jupiter.api.Test;

public class ResolverC4TotTest {

  @Test
  public void testResolvePrimitiveDoNothing() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.INT);
    Action action = C4Resolver.resolve(writer, reader, GenericData.get());

    assertNotNull(action);
    assertEquals(Action.Type.DO_NOTHING, action.type);
    assertTrue(action instanceof DoNothing);
  }

  @Test
  public void testResolvePrimitiveDefaultData() {
    Schema writer = Schema.create(Schema.Type.BOOLEAN);
    Schema reader = Schema.create(Schema.Type.BOOLEAN);
    Action action = C4Resolver.resolve(writer, reader);

    assertNotNull(action);
    assertEquals(Action.Type.DO_NOTHING, action.type);
  }

  @Test
  public void testResolveFixedSizeMismatch() {
    Schema writer = Schema.createFixed("MyFixed", "doc", "ns", 5);
    Schema reader = Schema.createFixed("MyFixed", "doc", "ns", 10);
    Action action = C4Resolver.resolve(writer, reader, GenericData.get());

    assertNotNull(action);
    assertEquals(Action.Type.ERROR, action.type);
    assertTrue(action instanceof ErrorAction);
    assertEquals(ErrorType.SIZES_DONT_MATCH, ((ErrorAction) action).error);
  }

  @Test
  public void testResolveIncompatibleTypes() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.STRING);
    Action action = C4Resolver.resolve(writer, reader, GenericData.get());

    assertNotNull(action);
    assertEquals(Action.Type.ERROR, action.type);
    assertEquals(ErrorType.INCOMPATIBLE_SCHEMA_TYPES, ((ErrorAction) action).error);
  }

  @Test
  public void testResolveMissingRequiredField() {
    List<Schema.Field> writerFields = new ArrayList<>();
    Schema writerRecord = Schema.createRecord("MyRecord", "doc", "ns", false, writerFields);

    List<Schema.Field> readerFields = new ArrayList<>();
    readerFields.add(new Schema.Field("reqField", Schema.create(Schema.Type.INT), "doc", null));
    Schema readerRecord = Schema.createRecord("MyRecord", "doc", "ns", false, readerFields);

    Action action = C4Resolver.resolve(writerRecord, readerRecord, GenericData.get());

    assertNotNull(action);
    assertEquals(Action.Type.ERROR, action.type);
    assertEquals(ErrorType.MISSING_REQUIRED_FIELD, ((ErrorAction) action).error);
  }

  @Test
  public void testPromoteSameTypeException() {
    Schema schema = Schema.create(Schema.Type.INT);
    assertThrows(IllegalArgumentException.class, () -> {
      Promote.isValid(schema, schema);
    });
  }
}