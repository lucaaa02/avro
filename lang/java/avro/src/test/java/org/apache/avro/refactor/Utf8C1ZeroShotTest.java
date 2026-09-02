package org.apache.avro.util;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class Utf8C1ZeroShotTest {

  @Test
  public void testDefaultConstructor() {
    C1Utf8 utf8 = new C1Utf8();
    assertEquals(0, utf8.getByteLength());
    assertEquals("", utf8.toString());
    assertNotNull(utf8.getBytes());
    assertEquals(1, utf8.hashCode());
  }

  @Test
  public void testStringConstructorTypical() {
    String text = "Hello, Avro!";
    C1Utf8 utf8 = new C1Utf8(text);
    assertEquals(text.length(), utf8.getByteLength());
    assertEquals(text, utf8.toString());
    assertArrayEquals(text.getBytes(StandardCharsets.UTF_8), utf8.getBytes());
  }

  @Test
  public void testStringConstructorEmpty() {
    C1Utf8 utf8 = new C1Utf8("");
    assertEquals(0, utf8.getByteLength());
    assertEquals("", utf8.toString());
  }

  @Test
  public void testCopyConstructor() {
    C1Utf8 original = new C1Utf8("TestString");
    C1Utf8 copy = new C1Utf8(original);

    assertEquals(original, copy);
    assertEquals(original.getByteLength(), copy.getByteLength());
    assertEquals(original.toString(), copy.toString());
    assertEquals(original.hashCode(), copy.hashCode());
  }

  @Test
  public void testByteArrayConstructor() {
    byte[] bytes = "ByteArray".getBytes(StandardCharsets.UTF_8);
    C1Utf8 utf8 = new C1Utf8(bytes);
    assertEquals(bytes.length, utf8.getByteLength());
    assertArrayEquals(bytes, utf8.getBytes());
    assertEquals("ByteArray", utf8.toString());
  }

  @Test
  public void testSetByteLength() {
    C1Utf8 utf8 = new C1Utf8("Short");
    utf8.setByteLength(10);
    assertEquals(10, utf8.getByteLength());
    assertTrue(utf8.getBytes().length >= 10);
  }

  @Test
  public void testSetByteLengthException() {
    C1Utf8 utf8 = new C1Utf8();
    assertThrows(UnsupportedOperationException.class, () -> {
      utf8.setByteLength(Integer.MAX_VALUE);
    });
  }

  @Test
  public void testSetFromString() {
    C1Utf8 utf8 = new C1Utf8();
    utf8.setFromString("NewValue");
    assertEquals("NewValue", utf8.toString());
    assertEquals(8, utf8.getByteLength());
  }

  @Test
  public void testSetFromUtf8() {
    C1Utf8 source = new C1Utf8("SourceText");
    C1Utf8 target = new C1Utf8();
    target.setFromUtf8(source);

    assertEquals(source, target);
    assertEquals("SourceText", target.toString());
  }

  @Test
  public void testToStringCachingAndBoundaryLengths() {
    // Length <= 7 (short string strategy in original, uniform in C1)
    C1Utf8 shortStr = new C1Utf8("abc");
    assertEquals("abc", shortStr.toString());
    assertEquals("abc", shortStr.toString()); // Hit cached string branch

    // Length > 7
    C1Utf8 longStr = new C1Utf8("abcdefgh");
    assertEquals("abcdefgh", longStr.toString());
    assertEquals("abcdefgh", longStr.toString());
  }

  @Test
  public void testEqualsAndHashCodeContract() {
    C1Utf8 utf1 = new C1Utf8("Avro");
    C1Utf8 utf2 = new C1Utf8("Avro");
    C1Utf8 utf3 = new C1Utf8("Different");

    assertEquals(utf1, utf1); // Reflexive
    assertEquals(utf1, utf2); // Symmetric
    assertEquals(utf1.hashCode(), utf2.hashCode());

    assertNotEquals(utf1, utf3);
    assertNotEquals(utf1, null);
    assertNotEquals(utf1, "Avro"); // Different type

    // Test hash code branching for length > 7 and length <= 7
    C1Utf8 shortHash = new C1Utf8("12345"); // length 5 <= 7
    C1Utf8 longHash = new C1Utf8("12345678"); // length 8 > 7
    assertNotEquals(0, shortHash.hashCode());
    assertNotEquals(0, longHash.hashCode());
  }

  @Test
  public void testCompareTo() {
    C1Utf8 a = new C1Utf8("Apple");
    C1Utf8 b = new C1Utf8("Banana");
    C1Utf8 a2 = new C1Utf8("Apple");

    assertTrue(a.compareTo(b) < 0);
    assertTrue(b.compareTo(a) > 0);
    assertEquals(0, a.compareTo(a2));
  }

  @Test
  public void testCharSequenceMethods() {
    C1Utf8 utf8 = new C1Utf8("HelloWorld");
    assertEquals(10, utf8.length());
    assertEquals('H', utf8.charAt(0));
    assertEquals('d', utf8.charAt(9));
    assertEquals("World", utf8.subSequence(5, 10).toString());

    assertThrows(StringIndexOutOfBoundsException.class, () -> utf8.charAt(-1));
    assertThrows(StringIndexOutOfBoundsException.class, () -> utf8.charAt(10));
  }

  @Test
  public void testGetBytesForStatic() {
    byte[] expected = "Test".getBytes(StandardCharsets.UTF_8);
    assertArrayEquals(expected, C1Utf8.getBytesFor("Test"));
  }

  @Test
  public void testExternalizableSerialization() throws Exception {
    C1Utf8 original = new C1Utf8("ExternalizableTest");

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);
    original.writeExternal(oos);
    oos.flush();

    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bais);

    C1Utf8 deserialized = new C1Utf8();
    deserialized.readExternal(ois);

    assertEquals(original, deserialized);
    assertEquals("ExternalizableTest", deserialized.toString());
  }

  @Test
  public void testCompareSequences() {
    CharSequence cs1 = "A";
    CharSequence cs2 = "B";
    CharSequence csNull = null;
    C1Utf8 u1 = new C1Utf8("A");
    C1Utf8 u2 = new C1Utf8("A");

    assertEquals(0, C1Utf8.compareSequences(cs1, cs1));
    assertEquals(0, C1Utf8.compareSequences(u1, u2));
    assertTrue(C1Utf8.compareSequences(cs1, cs2) < 0);
    assertTrue(C1Utf8.compareSequences(cs2, cs1) > 0);

    // Null handling
    assertTrue(C1Utf8.compareSequences(csNull, cs1) > 0);
    assertTrue(C1Utf8.compareSequences(cs1, csNull) < 0);
    assertEquals(0, C1Utf8.compareSequences(csNull, csNull));
  }
}