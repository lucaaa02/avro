package org.apache.avro;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResolverTestPrompt3 {

  // Categoria: tipi primitivi uguali (DoNothing)
  @Test
  public void testEqualPrimitiveTypes() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.INT);

    Resolver.Action action = Resolver.resolve(writer, reader);

    Assertions.assertEquals(Resolver.Action.Type.DO_NOTHING, action.type);
    Assertions.assertTrue(action instanceof Resolver.DoNothing);
  }

  // Categoria: promozioni numeriche valide (Promote)
  @Test
  public void testValidNumericPromotion() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.LONG);

    Resolver.Action action = Resolver.resolve(writer, reader);

    Assertions.assertEquals(Resolver.Action.Type.PROMOTE, action.type);
    Assertions.assertTrue(action instanceof Resolver.Promote);
  }

  // Categoria: combinazioni incompatibili (ErrorAction)
  @Test
  public void testIncompatibleTypes() {
    Schema writer = Schema.create(Schema.Type.STRING);
    Schema reader = Schema.create(Schema.Type.INT);

    Resolver.Action action = Resolver.resolve(writer, reader);

    Assertions.assertEquals(Resolver.Action.Type.ERROR, action.type);
    Assertions.assertTrue(action instanceof Resolver.ErrorAction);
    Resolver.ErrorAction errorAction = (Resolver.ErrorAction) action;
    Assertions.assertEquals(Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES, errorAction.error);
  }

  // Categoria: FIXED (nome/size uguali - DoNothing)
  @Test
  public void testFixedSameNameAndSize() {
    Schema writer = Schema.createFixed("MyFixed", null, "com.example", 16);
    Schema reader = Schema.createFixed("MyFixed", null, "com.example", 16);

    Resolver.Action action = Resolver.resolve(writer, reader);

    Assertions.assertEquals(Resolver.Action.Type.DO_NOTHING, action.type);
  }

  // Categoria: FIXED (nomi diversi - ErrorAction)
  @Test
  public void testFixedDifferentNames() {
    Schema writer = Schema.createFixed("FixedA", null, "com.example", 16);
    Schema reader = Schema.createFixed("FixedB", null, "com.example", 16);

    Resolver.Action action = Resolver.resolve(writer, reader);

    Assertions.assertEquals(Resolver.Action.Type.ERROR, action.type);
    Resolver.ErrorAction errorAction = (Resolver.ErrorAction) action;
    Assertions.assertEquals(Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH, errorAction.error);
  }

  // Categoria: FIXED (size diverse - ErrorAction)
  @Test
  public void testFixedDifferentSizes() {
    Schema writer = Schema.createFixed("MyFixed", null, "com.example", 16);
    Schema reader = Schema.createFixed("MyFixed", null, "com.example", 32);

    Resolver.Action action = Resolver.resolve(writer, reader);

    Assertions.assertEquals(Resolver.Action.Type.ERROR, action.type);
    Resolver.ErrorAction errorAction = (Resolver.ErrorAction) action;
    Assertions.assertEquals(Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH, errorAction.error);
  }

  // Categoria: ARRAY/MAP (Container)
  @Test
  public void testContainerArrayAndMap() {
    Schema writerArray = Schema.createArray(Schema.create(Schema.Type.INT));
    Schema readerArray = Schema.createArray(Schema.create(Schema.Type.LONG));

    Resolver.Action arrayAction = Resolver.resolve(writerArray, readerArray);

    Assertions.assertEquals(Resolver.Action.Type.CONTAINER, arrayAction.type);
    Assertions.assertTrue(arrayAction instanceof Resolver.Container);
    Resolver.Container containerArray = (Resolver.Container) arrayAction;
    Assertions.assertEquals(Resolver.Action.Type.PROMOTE, containerArray.elementAction.type);

    Schema writerMap = Schema.createMap(Schema.create(Schema.Type.STRING));
    Schema readerMap = Schema.createMap(Schema.create(Schema.Type.STRING));

    Resolver.Action mapAction = Resolver.resolve(writerMap, readerMap);

    Assertions.assertEquals(Resolver.Action.Type.CONTAINER, mapAction.type);
    Resolver.Container containerMap = (Resolver.Container) mapAction;
    Assertions.assertEquals(Resolver.Action.Type.DO_NOTHING, containerMap.elementAction.type);
  }

  // Categoria: ENUM (simboli uguali)
  @Test
  public void testEnumSameSymbols() {
    Schema writer = Schema.createEnum("Colors", null, "com.example", Arrays.asList("RED", "GREEN", "BLUE"));
    Schema reader = Schema.createEnum("Colors", null, "com.example", Arrays.asList("RED", "GREEN", "BLUE"));

    Resolver.Action action = Resolver.resolve(writer, reader);

    Assertions.assertEquals(Resolver.Action.Type.ENUM, action.type);
    Resolver.EnumAdjust enumAdjust = (Resolver.EnumAdjust) action;
    Assertions.assertTrue(enumAdjust.noAdjustmentsNeeded);
  }

  // Categoria: ENUM (nome diverso - ErrorAction)
  @Test
  public void testEnumDifferentNames() {
    Schema writer = Schema.createEnum("EnumA", null, "com.example", Arrays.asList("A", "B"));
    Schema reader = Schema.createEnum("EnumB", null, "com.example", Arrays.asList("A", "B"));

    Resolver.Action action = Resolver.resolve(writer, reader);

    Assertions.assertEquals(Resolver.Action.Type.ERROR, action.type);
    Resolver.ErrorAction errorAction = (Resolver.ErrorAction) action;
    Assertions.assertEquals(Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH, errorAction.error);
  }

  // Categoria: RECORD (campi rimossi/aggiunti con default valido)
  @Test
  public void testRecordFieldAddedWithDefaultAndRemoved() {
    Schema.Field wField1 = new Schema.Field("f1", Schema.create(Schema.Type.INT), null, null);
    Schema.Field wField2 = new Schema.Field("f2", Schema.create(Schema.Type.STRING), null, null);
    Schema writer = Schema.createRecord("TestRecord", null, "com.example", false, Arrays.asList(wField1, wField2));

    Schema.Field rField1 = new Schema.Field("f1", Schema.create(Schema.Type.INT), null, null);
    Schema.Field rField3 = new Schema.Field("f3", Schema.create(Schema.Type.BOOLEAN), null, true);
    Schema reader = Schema.createRecord("TestRecord", null, "com.example", false, Arrays.asList(rField1, rField3));

    Resolver.Action action = Resolver.resolve(writer, reader);

    Assertions.assertEquals(Resolver.Action.Type.RECORD, action.type);
    Resolver.RecordAdjust recordAdjust = (Resolver.RecordAdjust) action;
    Assertions.assertEquals(2, recordAdjust.fieldActions.length);
    Assertions.assertEquals(Resolver.Action.Type.DO_NOTHING, recordAdjust.fieldActions[0].type);
    Assertions.assertEquals(Resolver.Action.Type.SKIP, recordAdjust.fieldActions[1].type);
  }

  // Categoria: RECORD (campo aggiunto senza default - MISSING_REQUIRED_FIELD)
  @Test
  public void testRecordFieldAddedWithoutDefault() {
    Schema.Field wField = new Schema.Field("f1", Schema.create(Schema.Type.INT), null, null);
    Schema writer = Schema.createRecord("TestRecord", null, "com.example", false, Collections.singletonList(wField));

    Schema.Field rField1 = new Schema.Field("f1", Schema.create(Schema.Type.INT), null, null);
    Schema.Field rField2 = new Schema.Field("f2", Schema.create(Schema.Type.STRING), null, null);
    Schema reader = Schema.createRecord("TestRecord", null, "com.example", false, Arrays.asList(rField1, rField2));

    Resolver.Action action = Resolver.resolve(writer, reader);

    Assertions.assertEquals(Resolver.Action.Type.ERROR, action.type);
    Resolver.ErrorAction errorAction = (Resolver.ErrorAction) action;
    Assertions.assertEquals(Resolver.ErrorAction.ErrorType.MISSING_REQUIRED_FIELD, errorAction.error);
  }

  // Categoria: UNION (solo lato reader - ReaderUnion)
  @Test
  public void testUnionOnReaderSideOnly() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema
        .createUnion(Arrays.asList(Schema.create(Schema.Type.STRING), Schema.create(Schema.Type.INT)));

    Resolver.Action action = Resolver.resolve(writer, reader);

    Assertions.assertEquals(Resolver.Action.Type.READER_UNION, action.type);
    Resolver.ReaderUnion readerUnion = (Resolver.ReaderUnion) action;
    Assertions.assertEquals(1, readerUnion.firstMatch);
    Assertions.assertEquals(Resolver.Action.Type.DO_NOTHING, readerUnion.actualAction.type);
  }

  // Categoria: UNION (solo lato writer - WriterUnion)
  @Test
  public void testUnionOnWriterSideOnly() {
    Schema writer = Schema.createUnion(Arrays.asList(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.LONG)));
    Schema reader = Schema.create(Schema.Type.LONG);

    Resolver.Action action = Resolver.resolve(writer, reader);

    Assertions.assertEquals(Resolver.Action.Type.WRITER_UNION, action.type);
    Resolver.WriterUnion writerUnion = (Resolver.WriterUnion) action;
    Assertions.assertEquals(2, writerUnion.actions.length);
    Assertions.assertEquals(Resolver.Action.Type.PROMOTE, writerUnion.actions[0].type);
    Assertions.assertEquals(Resolver.Action.Type.DO_NOTHING, writerUnion.actions[1].type);
  }
}