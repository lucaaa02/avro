package org.apache.avro.util;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class Utf8C3ZeroShotTest {

  @Test
  void testDefaultConstructor() {
    C3Utf8 utf8 = new C3Utf8();
    assertEquals(0, utf8.getByteLength());
    assertEquals("", utf8.toString());
    assertNotNull(utf8.getBytes());
  }

  @Test
  void testStringConstructorAndToString() {
    C3Utf8 utf8 = new C3Utf8("Hello, Avro!");
    assertEquals("Hello, Avro!", utf8.toString());
    assertEquals(12, utf8.getByteLength());
    assertEquals("Hello, Avro!".getBytes(StandardCharsets.UTF_8).length, utf8.getBytes().length);
  }

  @Test
  void testCopyConstructor() {
    C3Utf8 original = new C3Utf8("Test Copy");
    C3Utf8 copy = new C3Utf8(original);
    assertEquals(original, copy);
    assertEquals(original.toString(), copy.toString());
    assertEquals(original.getByteLength(), copy.getByteLength());
  }

  @Test
  void testByteArrayConstructor() {
    byte[] bytes = "Byte Array".getBytes(StandardCharsets.UTF_8);
    C3Utf8 utf8 = new C3Utf8(bytes);
    assertEquals("Byte Array", utf8.toString());
    assertEquals(bytes.length, utf8.getByteLength());
  }

  @Test
  void testSetString() {
    C3Utf8 utf8 = new C3Utf8();
    utf8.set("New String");
    assertEquals("New String", utf8.toString());
    assertEquals(10, utf8.getByteLength());
  }

  @Test
  void testSetUtf8() {
    C3Utf8 source = new C3Utf8("Source");
    C3Utf8 target = new C3Utf8();
    target.set(source);
    assertEquals(source, target);
    assertEquals("Source", target.toString());
  }

  @Test
  void testSetByteLengthIncreaseAndDecrease() {
    C3Utf8 utf8 = new C3Utf8("Short");
    int oldLength = utf8.getByteLength();
    utf8.setByteLength(3);
    assertEquals(3, utf8.getByteLength());

    utf8.setByteLength(20);
    assertEquals(20, utf8.getByteLength());
    assertTrue(utf8.getBytes().length >= 20);
  }

  @Test
  void testSetByteLengthException() {
    C3Utf8 utf8 = new C3Utf8();
    assertThrows(Exception.class, () -> utf8.setByteLength(-1));
  }

  @Test
  void testEqualsAndHashCodeShortStrings() {
    C3Utf8 u1 = new C3Utf8("abc");
    C3Utf8 u2 = new C3Utf8("abc");
    C3Utf8 u3 = new C3Utf8("def");

    assertEquals(u1, u1);
    assertEquals(u1, u2);
    assertEquals(u1.hashCode(), u2.hashCode());
    assertNotEquals(u1, u3);
    assertNotEquals(u1, "abc");
    assertNotEquals(u1, null);
  }

  @Test
  void testEqualsAndHashCodeLongStringsVectorized() {
    C3Utf8 u1 = new C3Utf8("longerStringOne");
    C3Utf8 u2 = new C3Utf8("longerStringOne");
    C3Utf8 u3 = new C3Utf8("longerStringTwo");

    assertEquals(u1, u2);
    assertEquals(u1.hashCode(), u2.hashCode());
    assertNotEquals(u1, u3);
  }

  @Test
  void testCompareTo() {
    C3Utf8 u1 = new C3Utf8("apple");
    C3Utf8 u2 = new C3Utf8("banana");
    C3Utf8 u3 = new C3Utf8("apple");

    assertTrue(u1.compareTo(u2) < 0);
    assertTrue(u2.compareTo(u1) > 0);
    assertEquals(0, u1.compareTo(u3));
  }

  @Test
  void testCharSequenceMethods() {
    C3Utf8 utf8 = new C3Utf8("CharSequence");
    assertEquals(12, utf8.length());
    assertEquals('C', utf8.charAt(0));
    assertEquals('r', utf8.charAt(3));
    assertEquals("Char", utf8.subSequence(0, 4).toString());
  }

  @Test
  void testGetBytesFor() {
    byte[] bytes = C3Utf8.getBytesFor("StaticTest");
    assertNotNull(bytes);
    assertEquals("StaticTest", new String(bytes, StandardCharsets.UTF_8));
  }

  @Test
  void testExternalizableSerialization() throws Exception {
    C3Utf8 original = new C3Utf8("ExternalizableTest");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);

    original.writeExternal(oos);
    oos.flush();

    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bais);

    C3Utf8 deserialized = new C3Utf8();
    deserialized.readExternal(ois);

    assertEquals(original, deserialized);
    assertEquals("ExternalizableTest", deserialized.toString());
  }

  @Test
  void testCompareSequences() {
    CharSequence cs1 = "abc";
    CharSequence cs2 = "abd";
    CharSequence cs3 = "abc";

    assertEquals(0, C3Utf8.compareSequences(cs1, cs1));
    assertEquals(0, C3Utf8.compareSequences(cs1, cs3));
    assertTrue(C3Utf8.compareSequences(cs1, cs2) < 0);
    assertTrue(C3Utf8.compareSequences(cs2, cs1) > 0);

    // Null and identity checks
    assertEquals(1, C3Utf8.compareSequences(null, cs1));
    assertEquals(-1, C3Utf8.compareSequences(cs1, null));
    assertEquals(0, C3Utf8.compareSequences(null, null));

    // Comparable vs regular CharSequence paths
    C3Utf8 u1 = new C3Utf8("xyz");
    StringBuilder sb = new StringBuilder("xyz");
    assertEquals(0, C3Utf8.compareSequences(u1, sb));
  }
}