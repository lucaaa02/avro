package org.apache.avro.util;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static org.junit.jupiter.api.Assertions.*;

public class Utf8C1TotTest {

  @Test
  void testConstructorsAndBasicGetters() {
    C1Utf8 emptyUtf8 = new C1Utf8();
    assertEquals(0, emptyUtf8.getByteLength());
    assertEquals("", emptyUtf8.toString());

    C1Utf8 stringUtf8 = new C1Utf8("hello");
    assertEquals(5, stringUtf8.getByteLength());
    assertEquals("hello", stringUtf8.toString());

    C1Utf8 copyUtf8 = new C1Utf8(stringUtf8);
    assertEquals(stringUtf8, copyUtf8);

    C1Utf8 byteUtf8 = new C1Utf8(new byte[] { 97, 98, 99 });
    assertEquals(3, byteUtf8.getByteLength());
    assertEquals("abc", byteUtf8.toString());
  }

  @Test
  void testSettersAndMutations() {
    C1Utf8 utf8 = new C1Utf8();
    utf8.setFromString("world");
    assertEquals("world", utf8.toString());
    assertEquals(5, utf8.getByteLength());

    C1Utf8 other = new C1Utf8("test");
    utf8.setFromUtf8(other);
    assertEquals("test", utf8.toString());

    utf8.setByteLength(2);
    assertEquals(2, utf8.getByteLength());
  }

  @Test
  void testHashCodeStaleBufferBehavior() {
    C1Utf8 utf8 = new C1Utf8("longstringvalue");
    int initialHash = utf8.hashCode();

    utf8.setByteLength(4); // reduces length while internal buffer holds trailing capacity
    int reducedHash = utf8.hashCode();
    assertNotEquals(initialHash, reducedHash);
  }

  @Test
  void testEqualsAndCompareTo() {
    C1Utf8 u1 = new C1Utf8("abc");
    C1Utf8 u2 = new C1Utf8("abc");
    C1Utf8 u3 = new C1Utf8("def");

    assertEquals(u1, u2);
    assertNotEquals(u1, u3);
    assertEquals(0, u1.compareTo(u2));
    assertTrue(u1.compareTo(u3) < 0);
  }

  @Test
  void testCharSequenceInterface() {
    C1Utf8 utf8 = new C1Utf8("apache");
    assertEquals(6, utf8.length());
    assertEquals('p', utf8.charAt(1));
    assertEquals("pac", utf8.subSequence(1, 4).toString());
  }

  @Test
  void testCompareSequencesEdgeCases() {
    assertEquals(0, C1Utf8.compareSequences("abc", "abc"));
    assertTrue(C1Utf8.compareSequences(null, "abc") > 0);
    assertTrue(C1Utf8.compareSequences("abc", null) < 0);
    assertEquals(0, C1Utf8.compareSequences((CharSequence) null, (CharSequence) null));
  }

  @Test
  void testExternalizableLifecycle() throws IOException, ClassNotFoundException {
    C1Utf8 original = new C1Utf8("serialization-test");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);
    original.writeExternal(oos);
    oos.flush();

    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bais);
    C1Utf8 deserialized = new C1Utf8();
    deserialized.readExternal(ois);

    assertEquals(original, deserialized);
  }

  @Test
  void testSystemLimitExceptionHandling() {
    assertThrows(UnsupportedOperationException.class, () -> {
      new C1Utf8().setByteLength(Integer.MAX_VALUE);
    });
  }
}