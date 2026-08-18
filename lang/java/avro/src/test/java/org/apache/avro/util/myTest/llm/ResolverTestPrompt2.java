package org.apache.avro;

import java.util.Arrays;
import java.util.Collections;

import org.apache.avro.generic.GenericData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Versione appiattita del test generato da Gemini (Prompt 2 - zero-shot con codice sorgente).
// La struttura originale usava @Nested, incompatibile con la configurazione Surefire
// del progetto (pattern di esclusione **/*$* sulle classi interne).
@DisplayName("Test unitari per org.apache.avro.Resolver (Prompt 2 - Gemini, con codice sorgente)")
class ResolverTestPrompt2 {

  // ---------------- 1. Tipi Primitivi e DoNothing ----------------

  @ParameterizedTest(name = "Tipo primitivo identico: {0}")
  @CsvSource({ "NULL", "BOOLEAN", "INT", "LONG", "FLOAT", "DOUBLE", "STRING", "BYTES" })
  void testIdenticalPrimitivesReturnDoNothing(Schema.Type type) {
    Schema writer = Schema.create(type);
    Schema reader = Schema.create(type);

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.DoNothing.class, action);
    assertEquals(Resolver.Action.Type.DO_NOTHING, action.type);
    assertEquals(writer, action.writer);
    assertEquals(reader, action.reader);
  }

  // ---------------- 2. Promozioni dei Tipi Primitivi (Promote) ----------------

  @ParameterizedTest(name = "Promozione valida: {0} -> {1}")
  @CsvSource({ "INT, LONG", "INT, FLOAT", "INT, DOUBLE", "LONG, FLOAT", "LONG, DOUBLE", "FLOAT, DOUBLE",
      "STRING, BYTES", "BYTES, STRING" })
  void testValidPromotions(Schema.Type wType, Schema.Type rType) {
    Schema writer = Schema.create(wType);
    Schema reader = Schema.create(rType);

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.Promote.class, action);
    assertEquals(Resolver.Action.Type.PROMOTE, action.type);
    assertTrue(Resolver.Promote.isValid(writer, reader));
  }

  @ParameterizedTest(name = "Incompatibilità tra tipi primitivi: {0} -> {1}")
  @CsvSource({ "LONG, INT", "FLOAT, INT", "DOUBLE, FLOAT", "INT, STRING", "BOOLEAN, INT" })
  void testIncompatibleTypesReturnErrorAction(Schema.Type wType, Schema.Type rType) {
    Schema writer = Schema.create(wType);
    Schema reader = Schema.create(rType);

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.ErrorAction.class, action);
    Resolver.ErrorAction errorAction = (Resolver.ErrorAction) action;
    assertEquals(Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES, errorAction.error);
    assertTrue(errorAction.toString().contains("Found " + writer.getFullName()));
  }

  @Test
  @DisplayName("Promote.isValid lancia IllegalArgumentException per schemi dello stesso tipo")
  void testPromoteIsValidThrowsExceptionForSameTypes() {
    Schema s = Schema.create(Schema.Type.INT);
    assertThrows(IllegalArgumentException.class, () -> Resolver.Promote.isValid(s, s));
  }

  // ---------------- 3. Schema Fixed ----------------

  @Test
  @DisplayName("Fixed identico restituisce DoNothing")
  void testIdenticalFixed() {
    Schema writer = Schema.createFixed("Hash", null, "com.example", 16);
    Schema reader = Schema.createFixed("Hash", null, "com.example", 16);

    Resolver.Action action = Resolver.resolve(writer, reader);
    assertInstanceOf(Resolver.DoNothing.class, action);
  }

  @Test
  @DisplayName("Fixed con nomi diversi restituisce ErrorAction NAMES_DONT_MATCH")
  void testFixedNamesDontMatch() {
    Schema writer = Schema.createFixed("Hash1", null, "com.example", 16);
    Schema reader = Schema.createFixed("Hash2", null, "com.example", 16);

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.ErrorAction.class, action);
    Resolver.ErrorAction errorAction = (Resolver.ErrorAction) action;
    assertEquals(Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH, errorAction.error);
  }

  @Test
  @DisplayName("Fixed con dimensioni diverse restituisce ErrorAction SIZES_DONT_MATCH")
  void testFixedSizesDontMatch() {
    Schema writer = Schema.createFixed("Hash", null, "com.example", 16);
    Schema reader = Schema.createFixed("Hash", null, "com.example", 32);

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.ErrorAction.class, action);
    Resolver.ErrorAction errorAction = (Resolver.ErrorAction) action;
    assertEquals(Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH, errorAction.error);
  }

  // ---------------- 4. Contenitori (Array e Map) ----------------

  @Test
  @DisplayName("Array con elementi compatibili (con promozione interna)")
  void testArrayResolution() {
    Schema writer = Schema.createArray(Schema.create(Schema.Type.INT));
    Schema reader = Schema.createArray(Schema.create(Schema.Type.LONG));

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.Container.class, action);
    assertEquals(Resolver.Action.Type.CONTAINER, action.type);
    Resolver.Container container = (Resolver.Container) action;
    assertInstanceOf(Resolver.Promote.class, container.elementAction);
  }

  @Test
  @DisplayName("Mappa con valori compatibili")
  void testMapResolution() {
    Schema writer = Schema.createMap(Schema.create(Schema.Type.STRING));
    Schema reader = Schema.createMap(Schema.create(Schema.Type.BYTES));

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.Container.class, action);
    Resolver.Container container = (Resolver.Container) action;
    assertInstanceOf(Resolver.Promote.class, container.elementAction);
  }

  // ---------------- 5. Enum e Aggiustamenti (EnumAdjust) ----------------

  @Test
  @DisplayName("Enum identico senza aggiustamenti necessari")
  void testIdenticalEnum() {
    Schema writer = Schema.createEnum("Status", null, "com.example", Arrays.asList("A", "B", "C"));
    Schema reader = Schema.createEnum("Status", null, "com.example", Arrays.asList("A", "B", "C"));

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.EnumAdjust.class, action);
    Resolver.EnumAdjust enumAdjust = (Resolver.EnumAdjust) action;
    assertTrue(enumAdjust.noAdjustmentsNeeded);
    assertArrayEquals(new int[] { 0, 1, 2 }, enumAdjust.adjustments);
  }

  @Test
  @DisplayName("Enum con simboli riordinati")
  void testReorderedEnum() {
    Schema writer = Schema.createEnum("Status", null, "com.example", Arrays.asList("A", "B"));
    Schema reader = Schema.createEnum("Status", null, "com.example", Arrays.asList("B", "A"));

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.EnumAdjust.class, action);
    Resolver.EnumAdjust enumAdjust = (Resolver.EnumAdjust) action;
    assertFalse(enumAdjust.noAdjustmentsNeeded);
    assertArrayEquals(new int[] { 1, 0 }, enumAdjust.adjustments);
  }

  @Test
  @DisplayName("Enum con valore di default per simbolo mancante nel reader")
  void testEnumWithDefaultValue() {
    Schema writer = Schema.createEnum("Status", null, "com.example", Arrays.asList("A", "UNKNOWN"));
    Schema reader = Schema.createEnum("Status", null, "com.example", Arrays.asList("A", "OTHER"), "OTHER");

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.EnumAdjust.class, action);
    Resolver.EnumAdjust enumAdjust = (Resolver.EnumAdjust) action;
    assertArrayEquals(new int[] { 0, 1 }, enumAdjust.adjustments);
  }

  @Test
  @DisplayName("Enum con nomi non corrispondenti restituisce ErrorAction NAMES_DONT_MATCH")
  void testEnumNamesDontMatch() {
    Schema writer = Schema.createEnum("Status1", null, "com.example", Arrays.asList("A", "B"));
    Schema reader = Schema.createEnum("Status2", null, "com.example", Arrays.asList("A", "B"));

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.ErrorAction.class, action);
    assertEquals(Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH, ((Resolver.ErrorAction) action).error);
  }

  // ---------------- 6. Risoluzione dei Record (RecordAdjust, Skip, Defaults)
  // ----------------

  @Test
  @DisplayName("Record identico senza riordinamento")
  void testIdenticalRecord() {
    Schema writer = SchemaBuilder.record("User").namespace("com.example").fields().requiredInt("id")
        .requiredString("name").endRecord();

    Schema reader = SchemaBuilder.record("User").namespace("com.example").fields().requiredInt("id")
        .requiredString("name").endRecord();

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.RecordAdjust.class, action);
    Resolver.RecordAdjust recordAdjust = (Resolver.RecordAdjust) action;
    assertTrue(recordAdjust.noReorder());
    assertEquals(2, recordAdjust.fieldActions.length);
    assertEquals(2, recordAdjust.firstDefault);
    assertNotNull(recordAdjust.instanceSupplier);
  }

  @Test
  @DisplayName("Campo extra nello scrittore che viene ignorato (Skip)")
  void testRecordWriterHasExtraField() {
    Schema writer = SchemaBuilder.record("User").fields().requiredInt("id").requiredString("extraField").endRecord();

    Schema reader = SchemaBuilder.record("User").fields().requiredInt("id").endRecord();

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.RecordAdjust.class, action);
    Resolver.RecordAdjust recordAdjust = (Resolver.RecordAdjust) action;

    assertEquals(2, recordAdjust.fieldActions.length);
    assertInstanceOf(Resolver.DoNothing.class, recordAdjust.fieldActions[0]);
    assertInstanceOf(Resolver.Skip.class, recordAdjust.fieldActions[1]);

    Resolver.Skip skip = (Resolver.Skip) recordAdjust.fieldActions[1];
    assertEquals(Schema.Type.STRING, skip.writer.getType());
    assertNull(skip.reader);
  }

  @Test
  @DisplayName("Campo mancante nello scrittore gestito con valore di default nel lettore")
  void testRecordReaderHasDefaultValueForMissingField() {
    Schema writer = SchemaBuilder.record("User").fields().requiredInt("id").endRecord();

    Schema reader = SchemaBuilder.record("User").fields().requiredInt("id").name("age").type().intType().intDefault(30)
        .endRecord();

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.RecordAdjust.class, action);
    Resolver.RecordAdjust recordAdjust = (Resolver.RecordAdjust) action;

    assertEquals(1, recordAdjust.firstDefault);
    assertEquals(1, recordAdjust.defaults.length);
    assertEquals(30, recordAdjust.defaults[0]);
  }

  @Test
  @DisplayName("Campo obbligatorio mancante nello scrittore e senza default restituisce ErrorAction MISSING_REQUIRED_FIELD")
  void testRecordMissingRequiredFieldReturnsErrorAction() {
    Schema writer = SchemaBuilder.record("User").fields().requiredInt("id").endRecord();

    Schema reader = SchemaBuilder.record("User").fields().requiredInt("id").requiredString("missingRequired")
        .endRecord();

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.ErrorAction.class, action);
    Resolver.ErrorAction errorAction = (Resolver.ErrorAction) action;
    assertEquals(Resolver.ErrorAction.ErrorType.MISSING_REQUIRED_FIELD, errorAction.error);
    assertTrue(errorAction.toString().contains("missing required field missingRequired"));
  }

  @Test
  @DisplayName("Gestione della ricorsione nei record tramite la mappa seen")
  void testRecursiveRecordResolution() {
    Schema writerNode = SchemaBuilder.record("Node").fields().requiredInt("value").name("next").type().optional()
        .type("Node").endRecord();

    Schema readerNode = SchemaBuilder.record("Node").fields().requiredInt("value").name("next").type().optional()
        .type("Node").endRecord();

    Resolver.Action action = Resolver.resolve(writerNode, readerNode);

    assertInstanceOf(Resolver.RecordAdjust.class, action);
    Resolver.RecordAdjust recordAdjust = (Resolver.RecordAdjust) action;
    assertEquals(2, recordAdjust.fieldActions.length);
  }

  // ---------------- 7. Risoluzione delle Unioni (WriterUnion e ReaderUnion)
  // ----------------

  @Test
  @DisplayName("Scrittore Union con Lettore Union equivalente (WriterUnion)")
  void testEquivalentUnions() {
    Schema writer = Schema.createUnion(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.STRING));
    Schema reader = Schema.createUnion(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.STRING));

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.WriterUnion.class, action);
    Resolver.WriterUnion writerUnion = (Resolver.WriterUnion) action;
    assertTrue(writerUnion.unionEquiv);
    assertEquals(2, writerUnion.actions.length);
    assertInstanceOf(Resolver.DoNothing.class, writerUnion.actions[0]);
    assertInstanceOf(Resolver.DoNothing.class, writerUnion.actions[1]);
  }

  @Test
  @DisplayName("Scrittore Union con Lettore Non-Union o Union differente")
  void testWriterUnionWithNonEquivalentReader() {
    Schema writer = Schema.createUnion(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.LONG));
    Schema reader = Schema.create(Schema.Type.DOUBLE);

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.WriterUnion.class, action);
    Resolver.WriterUnion writerUnion = (Resolver.WriterUnion) action;
    assertFalse(writerUnion.unionEquiv);
    assertEquals(2, writerUnion.actions.length);
    assertInstanceOf(Resolver.Promote.class, writerUnion.actions[0]);
    assertInstanceOf(Resolver.Promote.class, writerUnion.actions[1]);
  }

  @Test
  @DisplayName("Lettore Union e Scrittore Non-Union (ReaderUnion) - Trovato match esatto")
  void testReaderUnionExactMatch() {
    Schema writer = Schema.create(Schema.Type.STRING);
    Schema reader = Schema.createUnion(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.STRING));

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.ReaderUnion.class, action);
    Resolver.ReaderUnion readerUnion = (Resolver.ReaderUnion) action;
    assertEquals(1, readerUnion.firstMatch);
    assertInstanceOf(Resolver.DoNothing.class, readerUnion.actualAction);
  }

  @Test
  @DisplayName("Lettore Union e Scrittore Non-Union (ReaderUnion) - Trovato match tramite promozione numerica")
  void testReaderUnionPromotionMatch() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.createUnion(Schema.create(Schema.Type.STRING), Schema.create(Schema.Type.LONG));

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.ReaderUnion.class, action);
    Resolver.ReaderUnion readerUnion = (Resolver.ReaderUnion) action;
    assertEquals(1, readerUnion.firstMatch);
    assertInstanceOf(Resolver.Promote.class, readerUnion.actualAction);
  }

  @Test
  @DisplayName("Lettore Union senza alcun match con lo Scrittore restituisce ErrorAction NO_MATCHING_BRANCH")
  void testReaderUnionNoMatchReturnsErrorAction() {
    Schema writer = Schema.create(Schema.Type.BOOLEAN);
    Schema reader = Schema.createUnion(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.STRING));

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.ErrorAction.class, action);
    Resolver.ErrorAction errorAction = (Resolver.ErrorAction) action;
    assertEquals(Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH, errorAction.error);
  }

  @Test
  @DisplayName("ReaderUnion.resolve lancia IllegalArgumentException se lo scrittore è una Union")
  void testReaderUnionResolveThrowsIfWriterIsUnion() {
    Schema writerUnion = Schema.createUnion(Schema.create(Schema.Type.INT));
    Schema readerUnion = Schema.createUnion(Schema.create(Schema.Type.INT));

    assertThrows(IllegalArgumentException.class,
        () -> Resolver.ReaderUnion.resolve(writerUnion, readerUnion, GenericData.get(), Collections.emptyMap()));
  }

  // ---------------- 8. Aliases e Integrazione Generica ----------------

  @Test
  @DisplayName("Applicazione degli alias prima della risoluzione del record")
  void testAliasResolution() {
    Schema writer = SchemaBuilder.record("OldUser").fields().requiredInt("id").endRecord();

    Schema reader = SchemaBuilder.record("NewUser").aliases("OldUser").fields().requiredInt("id").endRecord();

    Resolver.Action action = Resolver.resolve(writer, reader);

    assertInstanceOf(Resolver.RecordAdjust.class, action);
    assertEquals("NewUser", action.reader.getName());
  }

  @Test
  @DisplayName("Verifica gestione dei LogicalType e Conversioni nell'Azione")
  void testActionWithNullReader() {
    Schema writer = Schema.create(Schema.Type.STRING);
    Resolver.Skip skip = new Resolver.Skip(writer, GenericData.get());

    assertNull(skip.reader);
    assertNull(skip.logicalType);
    assertNull(skip.conversion);
  }

  @Test
  @DisplayName("ErrorAction.toString gestisce tutti i tipi di errore")
  void testErrorActionToString() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.STRING);
    GenericData data = GenericData.get();

    Resolver.ErrorAction errIncompatible = new Resolver.ErrorAction(writer, reader, data,
        Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES);
    assertTrue(errIncompatible.toString().contains("Found int, expecting string"));

    Resolver.ErrorAction errUnknown = new Resolver.ErrorAction(writer, reader, data, null);
    assertThrows(NullPointerException.class, errUnknown::toString);
  }
}