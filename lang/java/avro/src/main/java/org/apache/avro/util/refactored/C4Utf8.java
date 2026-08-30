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
package org.apache.avro.util;

// ===================================================================
// VARIANTE C4 - refactoring LLM con BB + riepilogo coverage gap + la
// suite "MT" (TestUtf8MutationReinforced.java, mutation-testing-
// reinforced) allegata al prompt. A differenza di Resolver, per Utf8
// questa suite ESISTE (12 mutanti PIT uccisi al punto 4b), quindi C4
// PUO' differire da C3 (per Resolver erano identiche).
// Rispetto a C3: la suite MT rende ESPLICITO, con un test dedicato
// (hashCode_afterShrinkWithSpareCapacity_ignoresStaleTrailingBytes), il
// motivo d'essere della guardia "bytes.length == length" in hashCode()
// (distinguere un buffer esattamente dimensionato da uno con capacita'
// residua dopo una setByteLength in riduzione) e conferma, con due test
// di boundary dedicati (length 7/8), che il merge di equals() applicato
// in C1 e' comportamentalmente sicuro. Il refactor puo' quindi:
//  1) riapplicare con fiducia il merge di equals() (identico a C1/C2);
//  2) NON rimuovere la guardia di hashCode(), ma renderne esplicito
//     l'intento tramite un metodo privato estratto isExactlySized(...),
//     preservando ESATTAMENTE la stessa condizione booleana originale
//     (nessun bug, solo leggibilita' informata dal test MT);
//  3) mantenere il refactor di compareSequences() gia' introdotto in C3
//     (area non toccata dalla suite MT, nessuna nuova informazione).
// ===================================================================

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.apache.avro.SystemLimitException;
import org.apache.avro.io.BinaryData;

/**
 * A C4Utf8 string. Unlike {@link String}, instances are mutable. This is more
 * efficient than {@link String} when reading or writing a sequence of values,
 * as a single instance may be reused.
 */
public class C4Utf8 implements Comparable<C4Utf8>, CharSequence, Externalizable {

  private static final byte[] EMPTY = new byte[0];

  private byte[] bytes;
  private int hash;
  private int length;
  private String string;

  public C4Utf8() {
    this.bytes = EMPTY;
    this.hash = 1;
  }

  public C4Utf8(String string) {
    byte[] bytes = getBytesFor(string);
    int length = bytes.length;
    SystemLimitException.checkMaxStringLength(length);
    this.bytes = bytes;
    this.length = length;
    this.string = string;
  }

  public C4Utf8(C4Utf8 other) {
    this.length = other.length;
    this.bytes = Arrays.copyOf(other.bytes, other.length);
    this.string = other.string;
    this.hash = other.hash;
  }

  public C4Utf8(byte[] bytes) {
    int length = bytes.length;
    SystemLimitException.checkMaxStringLength(length);
    this.bytes = bytes;
    this.length = length;
  }

  C4Utf8(String string, int length) {
    this(string);
    this.length = length;
  }

  /**
   * Return UTF-8 encoded bytes. Only valid through {@link #getByteLength()}
   * assuming the bytes have been fully copied into the underlying buffer from the
   * source.
   *
   * @see #setByteLength(int)
   * @return a reference to the underlying byte array
   */
  public byte[] getBytes() {
    return bytes;
  }

  /** Return length in bytes. */
  public int getByteLength() {
    return length;
  }

  /**
   * Set length in bytes. When calling this method, even if the new length is the
   * same as the current length, the cached contents of this C4Utf8 object will be
   * wiped out. After calling this method, no assumptions should be made about the
   * internal state (e.g., contents, hashcode, equality, etc.) of this C4Utf8
   * String other than the internal buffer being large enough to accommodate a
   * String of the new length. This should be called immediately before reading a
   * String from the underlying data source.
   *
   * @param newLength the new length of the underlying buffer
   * @return a reference to this object.
   * @see org.apache.avro.io.BinaryDecoder#readString(C4Utf8)
   */
  public C4Utf8 setByteLength(int newLength) {
    SystemLimitException.checkMaxStringLength(newLength);

    // Note that if the buffer size increases, the internal buffer is zero-ed out.
    // If the buffer is large enough, just the length pointer moves and the old
    // contents remain. For consistency's sake, we could zero-out the buffer in
    // both cases, but would be a perf hit.
    if (this.bytes.length < newLength) {
      this.bytes = new byte[newLength];
    }
    this.length = newLength;
    this.string = null;
    this.hash = 0;
    return this;
  }

  /** Set to the contents of a String. */
  public C4Utf8 set(String string) {
    byte[] bytes = getBytesFor(string);
    int length = bytes.length;
    SystemLimitException.checkMaxStringLength(length);
    this.bytes = bytes;
    this.length = length;
    this.string = string;
    this.hash = 0;
    return this;
  }

  public C4Utf8 set(C4Utf8 other) {
    if (this.bytes.length < other.length) {
      this.bytes = new byte[other.length];
    }
    this.length = other.length;
    System.arraycopy(other.bytes, 0, bytes, 0, length);
    this.string = other.string;
    this.hash = other.hash;
    return this;
  }

  @Override
  public String toString() {
    if (this.length == 0)
      return "";
    if (this.string == null) {
      this.string = new String(bytes, 0, length, StandardCharsets.UTF_8);
    }
    return this.string;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof C4Utf8))
      return false;
    C4Utf8 that = (C4Utf8) o;
    if (!(this.length == that.length))
      return false;
    // Arrays.equals with explicit ranges is correct (and vectorized on JDK 9+)
    // for any length, so the short-string manual loop is redundant.
    return Arrays.equals(this.bytes, 0, this.length, that.bytes, 0, that.length);
  }

  @Override
  public int hashCode() {
    int h = hash;
    if (h == 0) {
      byte[] bytes = this.bytes;
      int length = this.length;
      // If the array is filled, use the underlying JDK hash functionality.
      // Starting with JDK 21, the underlying implementation is vectorized.
      if (length > 7 && isExactlySized(bytes, length)) {
        h = Arrays.hashCode(bytes);
      } else {
        h = 1;
        for (int i = 0; i < length; i++) {
          h = h * 31 + bytes[i];
        }
      }
      this.hash = h;
    }
    return h;
  }

  /**
   * Returns true iff {@code bytes} has no spare trailing capacity beyond
   * {@code length} (i.e. {@link Arrays#hashCode(byte[])} over the whole array is
   * equivalent to hashing only the first {@code length} bytes).
   */
  private static boolean isExactlySized(byte[] bytes, int length) {
    return bytes.length == length;
  }

  @Override
  public int compareTo(C4Utf8 that) {
    return BinaryData.compareBytes(this.bytes, 0, this.length, that.bytes, 0, that.length);
  }

  // CharSequence implementation
  @Override
  public char charAt(int index) {
    return toString().charAt(index);
  }

  @Override
  public int length() {
    return toString().length();
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return toString().subSequence(start, end);
  }

  /** Gets the UTF-8 bytes for a String */
  public static byte[] getBytesFor(String str) {
    return str.getBytes(StandardCharsets.UTF_8);
  }

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeInt(bytes.length);
    out.write(bytes);
  }

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    setByteLength(in.readInt());
    in.readFully(bytes);
  }

  public static int compareSequences(CharSequence cs1, CharSequence cs2) {
    if (cs1 == cs2) {
      return 0;
    }

    if (cs1 == null || cs2 == null) {
      return cs1 == null ? 1 : -1;
    }

    if (cs1.getClass() == cs2.getClass() && cs1 instanceof Comparable) {
      return ((Comparable<Object>) cs1).compareTo(cs2);
    }

    for (int i = 0, len = Math.min(cs1.length(), cs2.length()); i < len; i++) {
      int cmp = Character.compare(cs1.charAt(i), cs2.charAt(i));
      if (cmp != 0) {
        return cmp;
      }
    }

    return cs1.length() - cs2.length();
  }
}
