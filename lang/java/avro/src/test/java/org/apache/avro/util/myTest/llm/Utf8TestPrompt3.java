/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.avro.util.myTest.llm;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;

import org.apache.avro.util.Utf8;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Test generato da Gemini (Prompt 3 - con vincoli di progetto espliciti) su Utf8.
public class Utf8TestPrompt3 {

  // Copre il costruttore di default senza argomenti
  @Test
  public void testEmptyConstructor() {
    Utf8 u = new Utf8();
    Assertions.assertEquals(0, u.getByteLength());
    Assertions.assertEquals(0, u.getBytes().length);
    Assertions.assertEquals("", u.toString());
  }

  // Copre la creazione da Stringa standard
  @Test
  public void testStringConstructor() {
    String original = "hello";
    Utf8 u = new Utf8(original);
    Assertions.assertEquals(5, u.getByteLength());
    Assertions.assertEquals("hello", u.toString());
    Assertions.assertArrayEquals(original.getBytes(StandardCharsets.UTF_8), u.getBytes());
  }

  // Copre la creazione da array di byte
  @Test
  public void testByteArrayConstructor() {
    byte[] bytes = "test".getBytes(StandardCharsets.UTF_8);
    Utf8 u = new Utf8(bytes);
    Assertions.assertEquals(4, u.getByteLength());
    Assertions.assertEquals("test", u.toString());
    Assertions.assertSame(bytes, u.getBytes());
  }

  // Copre il costruttore di copia da un'altra istanza Utf8
  @Test
  public void testCopyConstructor() {
    Utf8 original = new Utf8("copy-me");
    Utf8 copy = new Utf8(original);
    Assertions.assertEquals(original.getByteLength(), copy.getByteLength());
    Assertions.assertEquals(original.toString(), copy.toString());
    Assertions.assertNotSame(original.getBytes(), copy.getBytes());
    Assertions.assertArrayEquals(original.getBytes(), copy.getBytes());
  }

  // Copre la modifica e la lettura tramite set(String) e getBytes/getByteLength
  @Test
  public void testSetString() {
    Utf8 u = new Utf8();
    u.set("apache");
    Assertions.assertEquals(6, u.getByteLength());
    Assertions.assertEquals("apache", u.toString());
  }

  // Copre la modifica e la copia tramite set(Utf8)
  @Test
  public void testSetUtf8() {
    Utf8 source = new Utf8("source");
    Utf8 target = new Utf8("initial");
    target.set(source);
    Assertions.assertEquals("source", target.toString());
    Assertions.assertEquals(source.getByteLength(), target.getByteLength());
  }

  // Copre la riallocazione del buffer interno quando la nuova lunghezza supera
  // quella attuale
  @Test
  public void testSetByteLengthExpansion() {
    Utf8 u = new Utf8("small");
    int oldCapacity = u.getBytes().length;
    u.setByteLength(20);
    Assertions.assertEquals(20, u.getByteLength());
    Assertions.assertTrue(u.getBytes().length >= 20);
    Assertions.assertNotEquals(oldCapacity, u.getBytes().length);
  }

  // Copre il ridimensionamento della lunghezza senza riallocare il buffer se già
  // capiente
  @Test
  public void testSetByteLengthShrinkage() {
    Utf8 u = new Utf8("a-very-long-string-content");
    byte[] initialBytes = u.getBytes();
    u.setByteLength(5);
    Assertions.assertEquals(5, u.getByteLength());
    // Il buffer interno non deve variare se può contenere la nuova dimensione
    Assertions.assertSame(initialBytes, u.getBytes());
  }

  // Copre la corretta implementazione dell'interfaccia CharSequence (charAt,
  // length, subSequence)
  @Test
  public void testCharSequenceMethods() {
    Utf8 u = new Utf8("CharSequenceTest");
    Assertions.assertEquals(16, u.length());
    Assertions.assertEquals('C', u.charAt(0));
    Assertions.assertEquals('S', u.charAt(4));
    Assertions.assertEquals("Sequence", u.subSequence(4, 12).toString());
  }

  // Copre l'uguaglianza sia per stringhe corte (<= 7 byte) che lunghe (> 7 byte)
  @Test
  public void testEquals() {
    Utf8 short1 = new Utf8("short");
    Utf8 short2 = new Utf8("short");
    Utf8 short3 = new Utf8("other");
    Utf8 long1 = new Utf8("a-long-string-for-vectorized-equals");
    Utf8 long2 = new Utf8("a-long-string-for-vectorized-equals");
    Utf8 long3 = new Utf8("a-long-string-for-vectorized-different");
    // Identità e riflessività
    Assertions.assertEquals(short1, short1);
    Assertions.assertEquals(short1, short2);
    Assertions.assertNotEquals(short1, short3);
    // Gestione stringhe lunghe (>7 byte)
    Assertions.assertEquals(long1, long2);
    Assertions.assertNotEquals(long1, long3);
    // Tipi diversi o null
    Assertions.assertNotEquals(short1, "short");
    Assertions.assertNotEquals(short1, null);
  }

  // Copre la generazione dell'hashCode per stringhe corte e lunghe
  @Test
  public void testHashCode() {
    Utf8 u1 = new Utf8("hash-code-test");
    Utf8 u2 = new Utf8("hash-code-test");
    Assertions.assertEquals(u1.hashCode(), u2.hashCode());
    Assertions.assertNotEquals(0, u1.hashCode());
    // Verifica il caching dell'hashCode
    int initialHash = u1.hashCode();
    Assertions.assertEquals(initialHash, u1.hashCode());
  }

  // Copre la comparazione lessicografica tramite compareTo
  @Test
  public void testCompareTo() {
    Utf8 a = new Utf8("apple");
    Utf8 b = new Utf8("banana");
    Utf8 aCopy = new Utf8("apple");
    Assertions.assertTrue(a.compareTo(b) < 0);
    Assertions.assertTrue(b.compareTo(a) > 0);
    Assertions.assertEquals(0, a.compareTo(aCopy));
  }

  // Copre il metodo statico compareSequences con istanze identiche, null e tipi
  // misti
  @Test
  public void testCompareSequences() {
    CharSequence cs1 = new Utf8("abc");
    CharSequence cs2 = new Utf8("abc");
    CharSequence cs3 = "abd";
    Assertions.assertEquals(0, Utf8.compareSequences(cs1, cs1));
    Assertions.assertEquals(0, Utf8.compareSequences(cs1, cs2));
    Assertions.assertTrue(Utf8.compareSequences(cs1, cs3) < 0);
    // Casi limite con null
    Assertions.assertTrue(Utf8.compareSequences(null, cs1) > 0);
    Assertions.assertTrue(Utf8.compareSequences(cs1, null) < 0);
  }

  // Copre la serializzazione/deserializzazione Externalizable (writeExternal e
  // readExternal)
  @Test
  public void testExternalizable() throws IOException, ClassNotFoundException {
    Utf8 original = new Utf8("externalizable-test");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
      original.writeExternal(oos);
    }
    Utf8 deserialized = new Utf8();
    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    try (ObjectInputStream ois = new ObjectInputStream(bais)) {
      deserialized.readExternal(ois);
    }
    Assertions.assertEquals(original, deserialized);
    Assertions.assertEquals(original.toString(), deserialized.toString());
  }

  // Copre il comportamento limite con stringa vuota
  @Test
  public void testEmptyString() {
    Utf8 u = new Utf8("");
    Assertions.assertEquals(0, u.getByteLength());
    Assertions.assertEquals("", u.toString());
    Assertions.assertEquals(0, u.length());
  }

  // Copre caratteri speciali e multi-byte UTF-8 (es. emoji, ideogrammi)
  @Test
  public void testMultiByteUtf8Characters() {
    String multiByteStr = "Ciao, \u4e16\u754c! \uD83C\uDF55";
    Utf8 u = new Utf8(multiByteStr);
    byte[] expectedBytes = multiByteStr.getBytes(StandardCharsets.UTF_8);
    Assertions.assertEquals(expectedBytes.length, u.getByteLength());
    Assertions.assertEquals(multiByteStr, u.toString());
    Assertions.assertEquals(multiByteStr.length(), u.length());
    Assertions.assertArrayEquals(expectedBytes, u.getBytes());
  }

  // Copre la funzione statica di utilità getBytesFor
  @Test
  public void testGetBytesFor() {
    byte[] bytes = Utf8.getBytesFor("test-string");
    Assertions.assertArrayEquals("test-string".getBytes(StandardCharsets.UTF_8), bytes);
  }
}