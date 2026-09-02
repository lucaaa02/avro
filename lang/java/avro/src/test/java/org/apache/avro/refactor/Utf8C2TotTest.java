package org.apache.avro.util;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class Utf8C2TotTest {

  @Test
  public void testDefaultConstructor() {
    C2Utf8 utf8 = new C2Utf8();
    assertEquals("", utf8.toString());
    assertEquals(0, utf8.getByteLength());
    assertEquals(1, utf8.hashCode());
  }

  @Test
  public void testStringConstructorAndGetters() {
    C2Utf8 utf8 = new C2Utf8("Hello");
    assertEquals("Hello", utf8.toString());
    assertEquals(5, utf8.getByteLength());
    assertArrayEquals("Hello".getBytes(StandardCharsets.UTF_8), utf8.getBytes());
  }

  @Test
  public void testCopyConstructor() {
    C2Utf8 original = new C2Utf8("Avro");
    C2Utf8 copy = new C2Utf8(original);
    assertEquals(original, copy);
    assertEquals(original.hashCode(), copy.hashCode());
  }

  @Test
  public void testByteArrayConstructor() {
    byte[] data = "Test".getBytes(StandardCharsets.UTF_8);
    C2Utf8 utf8 = new C2Utf8(data);
    assertEquals("Test", utf8.toString());
    assertEquals(4, utf8.getByteLength());
  }

  @Test
  public void testSetByteLength() {
    C2Utf8 utf8 = new C2Utf8("Initial");
    utf8.setByteLength(10);
    assertEquals(10, utf8.getByteLength());
    assertTrue(utf8.getBytes().length >= 10);
  }

  @Test
  public void testSetString() {
    C2Utf8 utf8 = new C2Utf8();
    utf8.set("NewValue");
    assertEquals("NewValue", utf8.toString());
    assertEquals(8, utf8.getByteLength());
  }

  @Test
  public void testSetUtf8() {
    C2Utf8 source = new C2Utf8("Source");
    C2Utf8 target = new C2Utf8();
    target.set(source);
    assertEquals(source, target);
  }

  @Test
  public void testEqualsAndHashCode() {
    C2Utf8 u1 = new C2Utf8("Short"); // length <= 7
    C2Utf8 u2 = new C2Utf8("Short");
    C2Utf8 u3 = new C2Utf8("LongerStringThanSeven"); // length > 7
    C2Utf8 u4 = new C2Utf8("LongerStringThanSeven");

    assertEquals(u1, u2);
    assertEquals(u1.hashCode(), u2.hashCode());
    assertEquals(u3, u4);
    assertEquals(u3.hashCode(), u4.hashCode());
    assertNotEquals(u1, u3);
    assertNotEquals(u1, "Short");
  }

  @Test
  public void testCompareTo() {
    C2Utf8 u1 = new C2Utf8("Apple");
    C2Utf8 u2 = new C2Utf8("Banana");
    assertTrue(u1.compareTo(u2) < 0);
    assertTrue(u2.compareTo(u1) > 0);
    assertEquals(0, u1.compareTo(new C2Utf8("Apple")));
  }

  @Test
  public void testCharSequenceMethods() {
    C2Utf8 utf8 = new C2Utf8("Avro");
    assertEquals('v', utf8.charAt(1));
    assertEquals(4, utf8.length());
    assertEquals("vr", utf8.subSequence(1, 3).toString());
  }

  @Test
  public void testStaticGetBytesFor() {
    byte[] bytes = C2Utf8.getBytesFor("Avro");
    assertArrayEquals("Avro".getBytes(StandardCharsets.UTF_8), bytes);
  }

  @Test
  public void testCompareSequences() {
    assertEquals(0, C2Utf8.compareSequences("abc", "abc"));
    assertTrue(C2Utf8.compareSequences(null, "abc") > 0);
    assertTrue(C2Utf8.compareSequences("abc", null) < 0);
    assertEquals(0, C2Utf8.compareSequences(null, null));
    assertTrue(C2Utf8.compareSequences("abc", "abd") < 0);
  }

  @Test
  public void testExternalizableReadWrite() throws IOException, ClassNotFoundException {
    C2Utf8 original = new C2Utf8("ExternalizableTest");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);

    original.writeExternal(oos);
    oos.flush();

    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bais);

    C2Utf8 deserialized = new C2Utf8();
    deserialized.readExternal(ois);

    assertEquals(original, deserialized);
  }

  @Test
  public void testMaxStringLengthException() {
    assertThrows(UnsupportedOperationException.class, () -> {
      new C2Utf8() {
        {
          setByteLength(Integer.MAX_VALUE);
        }
      };
    });
  }
}