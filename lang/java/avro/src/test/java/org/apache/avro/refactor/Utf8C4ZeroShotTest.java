package org.apache.avro.util;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class Utf8C4ZeroShotTest {

  @Test
  public void testDefaultConstructor() {
    C4Utf8 utf8 = new C4Utf8();
    assertEquals(0, utf8.getByteLength());
    assertEquals("", utf8.toString());
    assertNotNull(utf8.getBytes());
  }

  @Test
  public void testStringConstructor() {
    C4Utf8 utf8 = new C4Utf8("hello");
    assertEquals(5, utf8.getByteLength());
    assertEquals("hello", utf8.toString());
    assertArrayEquals("hello".getBytes(StandardCharsets.UTF_8), utf8.getBytes());
  }

  @Test
  public void testCopyConstructor() {
    C4Utf8 original = new C4Utf8("test");
    C4Utf8 copy = new C4Utf8(original);
    assertEquals(original, copy);
    assertEquals(original.hashCode(), copy.hashCode());
  }

  @Test
  public void testByteArrayConstructor() {
    byte[] data = "world".getBytes(StandardCharsets.UTF_8);
    C4Utf8 utf8 = new C4Utf8(data);
    assertEquals(5, utf8.getByteLength());
    assertEquals("world", utf8.toString());
  }

  @Test
  public void testSetByteLengthExpansion() {
    C4Utf8 utf8 = new C4Utf8("abc");
    utf8.setByteLength(10);
    assertEquals(10, utf8.getByteLength());
    assertTrue(utf8.getBytes().length >= 10);
  }

  @Test
  public void testSetByteLengthShrinkAndHashCodeStaleBytes() {
    C4Utf8 utf8 = new C4Utf8("longerstring");
    int initialHash = utf8.hashCode();

    utf8.setByteLength(4);
    int shrunkHash = utf8.hashCode();
    assertNotEquals(0, shrunkHash);
  }

  @Test
  public void testSetString() {
    C4Utf8 utf8 = new C4Utf8();
    utf8.set("avro");
    assertEquals(4, utf8.getByteLength());
    assertEquals("avro", utf8.toString());
  }

  @Test
  public void testSetC4Utf8() {
    C4Utf8 other = new C4Utf8("data");
    C4Utf8 utf8 = new C4Utf8();
    utf8.set(other);
    assertEquals(other, utf8);
    assertEquals("data", utf8.toString());
  }

  @Test
  public void testEqualsAndHashCode() {
    C4Utf8 u1 = new C4Utf8("abc");
    C4Utf8 u2 = new C4Utf8("abc");
    C4Utf8 u3 = new C4Utf8("def");

    assertEquals(u1, u1);
    assertEquals(u1, u2);
    assertEquals(u1.hashCode(), u2.hashCode());
    assertNotEquals(u1, u3);
    assertNotEquals(u1, "abc");
    assertNotEquals(u1, null);
  }

  @Test
  public void testCompareTo() {
    C4Utf8 u1 = new C4Utf8("apple");
    C4Utf8 u2 = new C4Utf8("banana");
    C4Utf8 u3 = new C4Utf8("apple");

    assertTrue(u1.compareTo(u2) < 0);
    assertTrue(u2.compareTo(u1) > 0);
    assertEquals(0, u1.compareTo(u3));
  }

  @Test
  public void testCharSequenceMethods() {
    C4Utf8 utf8 = new C4Utf8("apache");
    assertEquals(6, utf8.length());
    assertEquals('p', utf8.charAt(1));
    assertEquals("pac", utf8.subSequence(1, 4).toString());
  }

  @Test
  public void testGetBytesFor() {
    byte[] bytes = C4Utf8.getBytesFor("test");
    assertArrayEquals("test".getBytes(StandardCharsets.UTF_8), bytes);
  }

  @Test
  public void testExternalizable() throws IOException, ClassNotFoundException {
    C4Utf8 original = new C4Utf8("external");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);

    original.writeExternal(oos);
    oos.flush();

    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bais);

    C4Utf8 deserialized = new C4Utf8();
    deserialized.readExternal(ois);

    assertEquals(original, deserialized);
    assertEquals("external", deserialized.toString());
  }

  @Test
  public void testCompareSequences() {
    CharSequence cs1 = "abc";
    CharSequence cs2 = "abd";
    CharSequence cs3 = new C4Utf8("abc");

    assertTrue(C4Utf8.compareSequences(cs1, cs2) < 0);
    assertEquals(0, C4Utf8.compareSequences(cs1, cs3));
    assertEquals(0, C4Utf8.compareSequences(null, null));
    assertTrue(C4Utf8.compareSequences(null, cs1) > 0);
    assertTrue(C4Utf8.compareSequences(cs1, null) < 0);
    assertEquals(0, C4Utf8.compareSequences(cs1, cs1));
  }
}