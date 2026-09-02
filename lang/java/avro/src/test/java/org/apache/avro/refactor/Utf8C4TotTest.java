package org.apache.avro.util;

import org.apache.avro.SystemLimitException;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static org.junit.jupiter.api.Assertions.*;

public class Utf8C4TotTest {

  @Test
  void testDefaultConstructor() {
    C4Utf8 utf8 = new C4Utf8();
    assertEquals(0, utf8.getByteLength());
    assertEquals("", utf8.toString());
  }

  @Test
  void testStringConstructor() {
    C4Utf8 utf8 = new C4Utf8("Avro");
    assertEquals(4, utf8.getByteLength());
    assertEquals("Avro", utf8.toString());
  }

  @Test
  void testCopyConstructor() {
    C4Utf8 original = new C4Utf8("Test");
    C4Utf8 copy = new C4Utf8(original);
    assertEquals(original, copy);
    assertEquals(original.hashCode(), copy.hashCode());
  }

  @Test
  void testSetString() {
    C4Utf8 utf8 = new C4Utf8();
    utf8.set("Hello");
    assertEquals(5, utf8.getByteLength());
    assertEquals("Hello", utf8.toString());
  }

  @Test
  void testEqualsAndHashCode() {
    C4Utf8 u1 = new C4Utf8("Data");
    C4Utf8 u2 = new C4Utf8("Data");
    C4Utf8 u3 = new C4Utf8("Different");

    assertEquals(u1, u2);
    assertEquals(u1.hashCode(), u2.hashCode());
    assertNotEquals(u1, u3);
  }

  @Test
  void testHashCode_afterShrinkWithSpareCapacity_ignoresStaleTrailingBytes() {
    C4Utf8 utf8 = new C4Utf8("LongerString");
    utf8.setByteLength(4); // Shrink length, leaving spare capacity
    int hash1 = utf8.hashCode();

    C4Utf8 utf8Short = new C4Utf8("Long");
    int hash2 = utf8Short.hashCode();

    assertEquals(hash2, hash1);
  }

  @Test
  void testCompareTo() {
    C4Utf8 u1 = new C4Utf8("Apple");
    C4Utf8 u2 = new C4Utf8("Banana");
    assertTrue(u1.compareTo(u2) < 0);
  }

  @Test
  void testCompareSequencesNulls() {
    C4Utf8 u1 = new C4Utf8("Test");
    assertEquals(1, C4Utf8.compareSequences(null, u1));
    assertEquals(-1, C4Utf8.compareSequences(u1, null));
    assertEquals(0, C4Utf8.compareSequences(null, null));
  }

  @Test
  void testExternalizable() throws IOException, ClassNotFoundException {
    C4Utf8 original = new C4Utf8("External");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try (ObjectOutputStream out = new ObjectOutputStream(baos)) {
      original.writeExternal(out);
    }

    C4Utf8 deserialized = new C4Utf8();
    try (ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
      deserialized.readExternal(in);
    }

    assertEquals(original, deserialized);
  }

  @Test
  void testCharSequenceMethods() {
    C4Utf8 utf8 = new C4Utf8("Avro");
    assertEquals(4, utf8.length());
    assertEquals('v', utf8.charAt(1));
    assertEquals("vr", utf8.subSequence(1, 3).toString());
  }
}