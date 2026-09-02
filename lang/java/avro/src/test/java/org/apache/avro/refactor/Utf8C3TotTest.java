package org.apache.avro.util;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class Utf8C3TotTest {

  @Test
  void testConstructorsAndGetters() {
    C3Utf8 empty = new C3Utf8();
    assertEquals(0, empty.getByteLength());
    assertEquals("", empty.toString());

    C3Utf8 strUtf8 = new C3Utf8("hello");
    assertEquals(5, strUtf8.getByteLength());
    assertEquals("hello", strUtf8.toString());

    C3Utf8 copyUtf8 = new C3Utf8(strUtf8);
    assertEquals(strUtf8, copyUtf8);

    C3Utf8 byteUtf8 = new C3Utf8("world".getBytes(StandardCharsets.UTF_8));
    assertEquals("world", byteUtf8.toString());
  }

  @Test
  void testSetMethods() {
    C3Utf8 utf8 = new C3Utf8();
    utf8.set("avro");
    assertEquals("avro", utf8.toString());

    C3Utf8 other = new C3Utf8("test");
    utf8.set(other);
    assertEquals("test", utf8.toString());

    utf8.setByteLength(10);
    assertEquals(10, utf8.getByteLength());
  }

  @Test
  void testEqualsAndHashCode() {
    C3Utf8 u1 = new C3Utf8("short");
    C3Utf8 u2 = new C3Utf8("short");
    C3Utf8 u3 = new C3Utf8("different");
    C3Utf8 long1 = new C3Utf8("vectorizedstring");
    C3Utf8 long2 = new C3Utf8("vectorizedstring");

    assertEquals(u1, u2);
    assertEquals(u1.hashCode(), u2.hashCode());
    assertNotEquals(u1, u3);
    assertEquals(long1, long2);
    assertEquals(long1.hashCode(), long2.hashCode());
    assertNotEquals(u1, "notAUtf8");
    assertEquals(u1, u1);
  }

  @Test
  void testCompareToAndSequences() {
    C3Utf8 u1 = new C3Utf8("apple");
    C3Utf8 u2 = new C3Utf8("banana");
    assertTrue(u1.compareTo(u2) < 0);

    assertEquals(0, C3Utf8.compareSequences("abc", "abc"));
    assertTrue(C3Utf8.compareSequences(null, "abc") > 0);
    assertTrue(C3Utf8.compareSequences("abc", null) < 0);
    assertEquals(0, C3Utf8.compareSequences(null, null));
    assertTrue(C3Utf8.compareSequences("a", "b") < 0);
  }

  @Test
  void testCharSequenceMethods() {
    C3Utf8 utf8 = new C3Utf8("apache");
    assertEquals(6, utf8.length());
    assertEquals('p', utf8.charAt(1));
    assertEquals("ap", utf8.subSequence(0, 2).toString());
  }

  @Test
  void testSerialization() throws IOException, ClassNotFoundException {
    C3Utf8 original = new C3Utf8("serialize");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);

    original.writeExternal(oos);
    oos.flush();

    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bais);

    C3Utf8 deserialized = new C3Utf8();
    deserialized.readExternal(ois);

    assertEquals(original, deserialized);
  }

  @Test
  void testBytesForUtility() {
    byte[] bytes = C3Utf8.getBytesFor("test");
    assertNotNull(bytes);
    assertEquals("test", new String(bytes, StandardCharsets.UTF_8));
  }
}