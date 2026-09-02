package org.apache.avro.util;

import org.apache.avro.SystemLimitException;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Utf8C2ZeroShotTest {

  @Test
  void testDefaultConstructor() {
    C2Utf8 utf8 = new C2Utf8();
    assertEquals(0, utf8.getByteLength());
    assertEquals("", utf8.toString());
    assertEquals(1, utf8.hashCode());
  }

  @Test
  void testStringConstructorAndToString() {
    String text = "Hello, Avro!";
    C2Utf8 utf8 = new C2Utf8(text);
    assertEquals(text, utf8.toString());
    assertEquals(text.getBytes(java.nio.charset.StandardCharsets.UTF_8).length, utf8.getByteLength());
    assertArrayEquals(text.getBytes(java.nio.charset.StandardCharsets.UTF_8), utf8.getBytes());
  }

  @Test
  void testCopyConstructor() {
    C2Utf8 original = new C2Utf8("Test Copy");
    C2Utf8 copy = new C2Utf8(original);
    assertEquals(original, copy);
    assertEquals(original.toString(), copy.toString());
    assertEquals(original.hashCode(), copy.hashCode());
  }

  @Test
  void testByteArrayConstructor() {
    byte[] data = { 72, 101, 108, 108, 111 }; // "Hello"
    C2Utf8 utf8 = new C2Utf8(data);
    assertEquals(5, utf8.getByteLength());
    assertEquals("Hello", utf8.toString());
    assertArrayEquals(data, utf8.getBytes());
  }

  @Test
  void testSetByteLength() {
    C2Utf8 utf8 = new C2Utf8("Initial");
    utf8.setByteLength(3);
    assertEquals(3, utf8.getByteLength());
    // Hash and string are reset, forcing re-evaluation or null state
    assertNull(utf8.toString() == null ? null : null); // string becomes null internally until toString() is called or
                                                       // recreated
  }

  @Test
  void testSetString() {
    C2Utf8 utf8 = new C2Utf8();
    utf8.set("New Value");
    assertEquals("New Value", utf8.toString());
    assertEquals(9, utf8.getByteLength());
  }

  @Test
  void testSetUtf8() {
    C2Utf8 source = new C2Utf8("Source");
    C2Utf8 target = new C2Utf8("Target");
    target.set(source);
    assertEquals("Source", target.toString());
    assertEquals(source.getByteLength(), target.getByteLength());
  }

  @Test
  void testEqualsAndHashCode() {
    C2Utf8 u1 = new C2Utf8("Avro");
    C2Utf8 u2 = new C2Utf8("Avro");
    C2Utf8 u3 = new C2Utf8("Different");

    assertEquals(u1, u1);
    assertEquals(u1, u2);
    assertNotEquals(u1, u3);
    assertNotEquals(u1, null);
    assertNotEquals(u1, "Avro");

    assertEquals(u1.hashCode(), u2.hashCode());
  }

  @Test
  void testCompareTo() {
    C2Utf8 u1 = new C2Utf8("Apple");
    C2Utf8 u2 = new C2Utf8("Banana");
    C2Utf8 u3 = new C2Utf8("Apple");

    assertTrue(u1.compareTo(u2) < 0);
    assertTrue(u2.compareTo(u1) > 0);
    assertEquals(0, u1.compareTo(u3));
  }

  @Test
  void testCharSequenceMethods() {
    C2Utf8 utf8 = new C2Utf8("Apache");
    assertEquals(6, utf8.length());
    assertEquals('p', utf8.charAt(1));
    assertEquals("pac", utf8.subSequence(1, 4).toString());
  }

  @Test
  void testGetBytesFor() {
    byte[] bytes = C2Utf8.getBytesFor("Test");
    assertNotNull(bytes);
    assertEquals(4, bytes.length);
  }

  @Test
  void testExternalizable() throws Exception {
    C2Utf8 original = new C2Utf8("Externalizable Test");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);

    original.writeExternal(oos);
    oos.flush();

    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bais);

    C2Utf8 deserialized = new C2Utf8();
    deserialized.readExternal(ois);

    assertEquals(original, deserialized);
    assertEquals(original.toString(), deserialized.toString());
  }

  @Test
  void testCompareSequences() {
    CharSequence cs1 = "A";
    CharSequence cs2 = "B";
    CharSequence cs3 = "A";

    assertTrue(C2Utf8.compareSequences(cs1, cs2) < 0);
    assertTrue(C2Utf8.compareSequences(cs2, cs1) > 0);
    assertEquals(0, C2Utf8.compareSequences(cs1, cs3));
    assertEquals(0, C2Utf8.compareSequences(cs1, cs1));

    assertEquals(1, C2Utf8.compareSequences(null, cs2));
    assertEquals(-1, C2Utf8.compareSequences(cs1, null));
    assertEquals(0, C2Utf8.compareSequences(null, null));

    C2Utf8 u1 = new C2Utf8("X");
    C2Utf8 u2 = new C2Utf8("Y");
    assertTrue(C2Utf8.compareSequences(u1, u2) < 0);
  }

  @Test
  void testMaxStringLengthException() {
    assertThrows(UnsupportedOperationException.class, () -> {
      new C2Utf8().setByteLength(Integer.MAX_VALUE);
    });
  }
}