package org.apache.avro.util.myTest.llm;

import org.apache.avro.util.Utf8;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Versione appiattita del test generato da Gemini (Prompt 2 - zero-shot con codice sorgente su Utf8).
// Struttura originale con @Nested appiattita per compatibilità con la configurazione Surefire del progetto.
@DisplayName("Test per org.apache.avro.util.Utf8 (Prompt 2 - Gemini, con codice sorgente)")
class Utf8TestPrompt2 {

  // ---------------- Costruttori ----------------

  @Test
  @DisplayName("Costruttore vuoto di default")
  void testEmptyConstructor() {
    Utf8 utf8 = new Utf8();
    assertEquals(0, utf8.getByteLength());
    assertEquals(0, utf8.getBytes().length);
    assertEquals("", utf8.toString());
    assertEquals(1, utf8.hashCode());
  }

  @Test
  @DisplayName("Costruttore da String")
  void testStringConstructor() {
    String input = "Hello, World! \uD83C\uDF0D";
    Utf8 utf8 = new Utf8(input);

    assertEquals(input, utf8.toString());
    assertEquals(input.getBytes(StandardCharsets.UTF_8).length, utf8.getByteLength());
  }

  @Test
  @DisplayName("Costruttore di copia (Copy Constructor)")
  void testCopyConstructor() {
    Utf8 original = new Utf8("Test String");
    Utf8 copy = new Utf8(original);

    assertEquals(original, copy);
    assertEquals(original.toString(), copy.toString());
    assertEquals(original.getByteLength(), copy.getByteLength());

    assertNotSame(original.getBytes(), copy.getBytes());
  }

  @Test
  @DisplayName("Costruttore da array di byte")
  void testByteArrayConstructor() {
    byte[] bytes = "Avro".getBytes(StandardCharsets.UTF_8);
    Utf8 utf8 = new Utf8(bytes);

    assertEquals("Avro", utf8.toString());
    assertEquals(bytes.length, utf8.getByteLength());
    assertSame(bytes, utf8.getBytes());
  }

  // ---------------- Mutabilità e Riuso del Buffer ----------------

  @Test
  @DisplayName("set(String) aggiorna correttamente il contenuto e l'hash")
  void testSetString() {
    Utf8 utf8 = new Utf8("Prima");
    int initialHash = utf8.hashCode();

    utf8.set("Seconda");
    assertEquals("Seconda", utf8.toString());
    assertNotEquals(initialHash, utf8.hashCode());
  }

  @Test
  @DisplayName("set(Utf8) copia i byte correttamente ed espande il buffer se necessario")
  void testSetUtf8() {
    Utf8 u1 = new Utf8("Corto");
    Utf8 u2 = new Utf8("Stringa Molto Più Lunga Per Ridimensionare");

    u1.set(u2);
    assertEquals(u2.toString(), u1.toString());
    assertEquals(u2.getByteLength(), u1.getByteLength());
    assertTrue(u1.getBytes().length >= u2.getByteLength());
  }

  @Test
  @DisplayName("setByteLength ridimensiona e invalida la stringa e l'hash memorizzati")
  void testSetByteLength() {
    Utf8 utf8 = new Utf8("Hello World");
    utf8.toString(); // Forziamo il caching della stringa

    utf8.setByteLength(20);
    assertEquals(20, utf8.getByteLength());
    assertEquals(20, utf8.getBytes().length);

    byte[] input = "New Data".getBytes(StandardCharsets.UTF_8);
    System.arraycopy(input, 0, utf8.getBytes(), 0, input.length);
    utf8.setByteLength(input.length);

    assertEquals("New Data", utf8.toString());
  }

  // ---------------- Equals e HashCode ----------------

  @Test
  @DisplayName("Equals per stringhe brevi (length <= 7)")
  void testEqualsShortStrings() {
    Utf8 u1 = new Utf8("Short");
    Utf8 u2 = new Utf8("Short");
    Utf8 u3 = new Utf8("Other");

    assertEquals(u1, u1);
    assertEquals(u1, u2);
    assertNotEquals(u1, u3);
    assertNotEquals(u1, null);
    assertNotEquals(u1, "Short");
  }

  @Test
  @DisplayName("Equals per stringhe lunghe (length > 7) - test di vettorializzazione")
  void testEqualsLongStrings() {
    Utf8 u1 = new Utf8("Questa è una stringa più lunga di 7 byte");
    Utf8 u2 = new Utf8("Questa è una stringa più lunga di 7 byte");
    Utf8 u3 = new Utf8("Questa è una stringa più lunga di 7 byte!");

    assertEquals(u1, u2);
    assertNotEquals(u1, u3);
  }

  @Test
  @DisplayName("Coerenza dell'hashCode")
  void testHashCodeConsistency() {
    Utf8 u1 = new Utf8("Coerenza Hash");
    Utf8 u2 = new Utf8("Coerenza Hash");

    assertEquals(u1.hashCode(), u2.hashCode());
    assertEquals(1, new Utf8("").hashCode());
  }

  // ---------------- CharSequence e Comparable ----------------

  @Test
  @DisplayName("Metodi CharSequence (length, charAt, subSequence)")
  void testCharSequenceMethods() {
    Utf8 utf8 = new Utf8("Apache Avro");

    assertEquals(11, utf8.length());
    assertEquals('A', utf8.charAt(0));
    assertEquals('v', utf8.charAt(8));
    assertEquals("Avro", utf8.subSequence(7, 11).toString());
  }

  @Test
  @DisplayName("Confronto naturale tramite compareTo")
  void testCompareTo() {
    Utf8 u1 = new Utf8("abc");
    Utf8 u2 = new Utf8("def");
    Utf8 u3 = new Utf8("abc");

    assertTrue(u1.compareTo(u2) < 0);
    assertTrue(u2.compareTo(u1) > 0);
    assertEquals(0, u1.compareTo(u3));
  }

  @ParameterizedTest
  @CsvSource({ "abc, abc, 0", "abc, def, -3", "def, abc, 3", "abc, abcd, -1" })
  @DisplayName("Confronto statico compareSequences con stesse tipologie")
  void testCompareSequences(String s1, String s2, int expectedSign) {
    int result = Utf8.compareSequences(s1, s2);
    assertEquals(Integer.signum(expectedSign), Integer.signum(result));
  }

  @Test
  @DisplayName("compareSequences con tipi CharSequence misti e valori null")
  void testCompareSequencesMixedTypesAndNulls() {
    Utf8 u1 = new Utf8("test");
    StringBuilder sb = new StringBuilder("test");

    assertEquals(0, Utf8.compareSequences(u1, u1));
    assertEquals(0, Utf8.compareSequences(u1, sb));
    assertTrue(Utf8.compareSequences(null, u1) > 0);
    assertTrue(Utf8.compareSequences(u1, null) < 0);
  }

  // ---------------- Serializzazione Externalizable ----------------

  @Test
  @DisplayName("Scrittura e lettura tramite Externalizable")
  void testExternalizable() throws Exception {
    Utf8 original = new Utf8("Test Serializzazione Externalizable");

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
      original.writeExternal(oos);
    }

    Utf8 deserialized = new Utf8();
    try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
      deserialized.readExternal(ois);
    }

    assertEquals(original, deserialized);
    assertEquals(original.toString(), deserialized.toString());
  }

  // ---------------- Utility e Casi Limite ----------------

  @Test
  @DisplayName("getBytesFor estrae byte UTF-8 corretti")
  void testGetBytesFor() {
    byte[] bytes = Utf8.getBytesFor("Avro");
    assertArrayEquals(new byte[] { 'A', 'v', 'r', 'o' }, bytes);
  }

  @ParameterizedTest
  @ValueSource(strings = { "", "A", "\uD83D\uDE00", "Apache Avro Open Source Project" })
  @DisplayName("Gestione caratteri multibyte e Unicode")
  void testUnicodeHandling(String input) {
    Utf8 utf8 = new Utf8(input);
    assertEquals(input, utf8.toString());
    assertEquals(input.getBytes(StandardCharsets.UTF_8).length, utf8.getByteLength());
  }
}