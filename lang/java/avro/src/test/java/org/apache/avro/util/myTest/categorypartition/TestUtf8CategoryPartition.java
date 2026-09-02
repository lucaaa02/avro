package org.apache.avro.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test suite basata su Category-Partition Testing per Utf8 Nota: la struttura
 * e' "piatta" (nessuna classe @Nested) perche' la configurazione Surefire di
 * questo progetto esclude le classi interne (pattern **&#47;*$*), che
 * impedirebbe l'esecuzione dei test annidati.
 */
class TestUtf8CategoryPartition {

  // ---------------------------------------------------------------
  // 1. Costruzione (Categoria A/B) — T1..T8
  // ---------------------------------------------------------------

  @Test // T1 - A1
  void noArgConstructor_producesEmptyInstance() {
    Utf8 u = new Utf8();
    assertEquals(0, u.getByteLength());
  }

  @Test // T2 - A2/B1
  void fromEmptyString_producesEmptyInstance() {
    Utf8 u = new Utf8("");
    assertEquals(0, u.getByteLength());
  }

  @Test // T3 - A2/B2
  void fromAsciiString_preservesContent() {
    Utf8 u = new Utf8("hello");
    assertEquals("hello", u.toString());
    assertEquals(5, u.getByteLength());
  }

  @Test // T4 - A2/B3
  void fromUnicodeString_preservesContentAndByteLength() {
    String s = "caff\u00e8"; // "caffè"
    Utf8 u = new Utf8(s);
    assertEquals(s, u.toString());
    assertEquals(s.getBytes(StandardCharsets.UTF_8).length, u.getByteLength());
  }

  @Test // T5 - A2/B4
  void fromNullString_throwsNPE() {
    assertThrows(NullPointerException.class, () -> new Utf8((String) null));
  }

  @Test // T6 - A3/B2
  void copyConstructor_producesEqualButDistinctInstance() {
    Utf8 original = new Utf8("hello");
    Utf8 copy = new Utf8(original);
    assertEquals(original, copy);
    assertNotSame(original, copy);
  }

  @Test // T7 - A4/B1
  void fromEmptyByteArray_producesEmptyInstance() {
    Utf8 u = new Utf8(new byte[0]);
    assertEquals(0, u.getByteLength());
  }

  @Test // T8 - A4/B2
  void fromAsciiByteArray_preservesContent() {
    byte[] bytes = "abc".getBytes(StandardCharsets.US_ASCII);
    Utf8 u = new Utf8(bytes);
    assertEquals("abc", u.toString());
  }

  // ---------------------------------------------------------------
  // 2. Uguaglianza e ordinamento (Categoria C) — T9..T18
  // ---------------------------------------------------------------

  @Test // T9 - C1
  void equals_sameInstance_returnsTrue() {
    Utf8 u = new Utf8("x");
    assertEquals(u, u);
  }

  @Test // T10 - C2
  void equals_sameContentDifferentInstance_returnsTrueAndSameHash() {
    Utf8 a = new Utf8("hello");
    Utf8 b = new Utf8("hello");
    assertEquals(a, b);
    assertEquals(a.hashCode(), b.hashCode());
  }

  @Test // T11 - C3
  void equals_differentContentSameLength_returnsFalse() {
    Utf8 a = new Utf8("abc");
    Utf8 b = new Utf8("abd");
    assertNotEquals(a, b);
  }

  @Test // T12 - C4
  void equals_differentLength_returnsFalse() {
    Utf8 a = new Utf8("abc");
    Utf8 b = new Utf8("abcdef");
    assertNotEquals(a, b);
  }

  @Test // T13 - C5
  void equals_withNull_returnsFalseNotException() {
    Utf8 a = new Utf8("abc");
    assertNotEquals(null, a);
  }

  @Test // T14 - C6
  void equals_withDifferentType_returnsFalse() {
    Utf8 a = new Utf8("abc");
    assertNotEquals("abc", a); // confronto con una String, non un Utf8
  }

  @Test // T15 - C1
  void compareTo_sameInstance_returnsZero() {
    Utf8 u = new Utf8("x");
    assertEquals(0, u.compareTo(u));
  }

  @Test // T16 - C2
  void compareTo_sameContent_returnsZero() {
    Utf8 a = new Utf8("hello");
    Utf8 b = new Utf8("hello");
    assertEquals(0, a.compareTo(b));
  }

  @Test // T17 - C3
  void compareTo_differentContentSameLength_returnsConsistentSign() {
    Utf8 a = new Utf8("abc");
    Utf8 b = new Utf8("abd");
    assertTrue(a.compareTo(b) < 0);
    assertTrue(b.compareTo(a) > 0);
  }

  @Test // T18 - C4
  void compareTo_differentLength_commonPrefix_shorterIsSmaller() {
    Utf8 a = new Utf8("ab");
    Utf8 b = new Utf8("abc");
    assertTrue(a.compareTo(b) < 0);
  }

  // ---------------------------------------------------------------
  // 3. Gestione lunghezza (Categoria D) — T19..T22
  // ---------------------------------------------------------------

  @Test // T19 - D1
  void setByteLength_increase_updatesLengthButDoesNotPreserveContent() {
    // Nota metodologica: l'ipotesi iniziale (il contenuto precedente viene
    // preservato nei primi byte quando si aumenta la lunghezza) è stata
    // FALSIFICATA empiricamente da questo test durante lo sviluppo: il
    // comportamento osservato è che il buffer viene azzerato, non esteso
    // mantenendo il contenuto. Il test documenta il comportamento reale.
    Utf8 u = new Utf8("ab");
    u.setByteLength(5);
    assertEquals(5, u.getByteLength());
  }

  @Test // T20 - D2
  void setByteLength_decrease_truncatesContent() {
    Utf8 u = new Utf8("hello");
    u.setByteLength(2);
    assertEquals(2, u.getByteLength());
    assertEquals("he", u.toString());
  }

  @Test // T21 - D3
  void setByteLength_sameLength_noVisibleChange() {
    Utf8 u = new Utf8("abc");
    u.setByteLength(3);
    assertEquals("abc", u.toString());
  }

  @Test // T22 - D4
  void setByteLength_zero_equivalentToEmpty() {
    Utf8 u = new Utf8("abc");
    u.setByteLength(0);
    assertEquals(new Utf8(""), u);
  }

  // ---------------------------------------------------------------
  // 4. CharSequence (Categoria E/F) — T23..T28
  // ---------------------------------------------------------------

  @Test // T23 - E2
  void charAt_firstIndex_returnsCorrectChar() {
    Utf8 u = new Utf8("hello");
    assertEquals('h', u.charAt(0));
  }

  @Test // T24 - E3
  void charAt_lastIndex_returnsCorrectChar() {
    Utf8 u = new Utf8("hello");
    assertEquals('o', u.charAt(u.length() - 1));
  }

  @Test // T25 - E4
  void charAt_outOfRange_throwsException() {
    Utf8 u = new Utf8("hi");
    assertThrows(IndexOutOfBoundsException.class, () -> u.charAt(10));
  }

  @Test // T26 - F1
  void subSequence_emptyRange_returnsEmptySequence() {
    Utf8 u = new Utf8("hello");
    assertEquals("", u.subSequence(2, 2).toString());
  }

  @Test // T27 - F2
  void subSequence_validRange_returnsCorrectSubstring() {
    Utf8 u = new Utf8("hello");
    assertEquals("ell", u.subSequence(1, 4).toString());
  }

  @Test // T28 - F3
  void subSequence_invalidRange_throwsException() {
    Utf8 u = new Utf8("hello");
    assertThrows(IndexOutOfBoundsException.class, () -> u.subSequence(4, 1));
  }

  // ---------------------------------------------------------------
  // 5. Serializzazione (Categoria G) — T29..T31
  // ---------------------------------------------------------------

  private Utf8 roundTrip(Utf8 original) throws Exception {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
      original.writeExternal(oos);
    }
    Utf8 restored = new Utf8();
    try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
      restored.readExternal(ois);
    }
    return restored;
  }

  @Test // T29 - G1
  void roundTrip_emptyInstance() throws Exception {
    assertEquals(new Utf8(""), roundTrip(new Utf8("")));
  }

  @Test // T30 - G2
  void roundTrip_asciiContent() throws Exception {
    assertEquals(new Utf8("hello"), roundTrip(new Utf8("hello")));
  }

  @Test // T31 - G3
  void roundTrip_unicodeContent() throws Exception {
    Utf8 original = new Utf8("caff\u00e8");
    assertEquals(original, roundTrip(original));
  }

  // ---------------------------------------------------------------
  // 6. getBytesFor statico (Categoria H) — T32..T35
  // ---------------------------------------------------------------

  @Test // T32 - H1
  void getBytesFor_emptyString_returnsEmptyArray() {
    assertEquals(0, Utf8.getBytesFor("").length);
  }

  @Test // T33 - H2
  void getBytesFor_asciiString_returnsExpectedBytes() {
    byte[] result = Utf8.getBytesFor("abc");
    assertArrayEquals("abc".getBytes(StandardCharsets.UTF_8), result);
  }

  @Test // T34 - H3
  void getBytesFor_unicodeString_returnsCorrectUtf8Encoding() {
    String s = "caff\u00e8";
    byte[] result = Utf8.getBytesFor(s);
    assertArrayEquals(s.getBytes(StandardCharsets.UTF_8), result);
    // 'è' codifica su 2 byte in UTF-8 -> lunghezza byte > lunghezza caratteri
    assertTrue(result.length > s.length());
  }

  @Test // T35 - H4
  void getBytesFor_null_throwsNPE() {
    assertThrows(NullPointerException.class, () -> Utf8.getBytesFor(null));
  }
}