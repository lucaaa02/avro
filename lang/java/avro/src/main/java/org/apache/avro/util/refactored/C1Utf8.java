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
// VARIANTE C1 - refactoring LLM SENZA alcun test allegato al prompt.
// Cambiamenti applicati (nessuna informazione su cosa sia testato):
//  1) set(String)/set(Utf8) rinominati in setFromString/setFromUtf8 (evita
//     l'overload ambiguo, nome piu' esplicito) - CAMBIA la firma pubblica.
//  2) equals: le due strategie (loop manuale per stringhe corte,
//     Arrays.equals per quelle lunghe) unificate in una sola chiamata a
//     Arrays.equals con range espliciti (comportamento IDENTICO per
//     qualunque lunghezza, la doppia strategia era una micro-ottimizzazione
//     ridondante).
//  3) hashCode: rimossa la condizione "bytes.length == length" dal ramo
//     veloce, ritenuta ridondante rispetto a "length > 7" senza contesto sui
//     test - introduce un BUG LATENTE quando il buffer interno ha capacita'
//     residua (bytes.length != length dopo una setByteLength in riduzione):
//     Arrays.hashCode(bytes) include allora byte "stale" oltre la lunghezza
//     logica, producendo un hashCode sbagliato.
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
 * A C1Utf8 string. Unlike {@link String}, instances are mutable. This is more
 * efficient than {@link String} when reading or writing a sequence of values,
 * as a single instance may be reused.
 */
public class C1Utf8 implements Comparable<C1Utf8>, CharSequence, Externalizable {

  private static final byte[] EMPTY = new byte[0];

  private byte[] bytes;
  private int hash;
  private int length;
  private String string;

  public C1Utf8() {
    this.bytes = EMPTY;
    this.hash = 1;
  }

  public C1Utf8(String string) {
    byte[] bytes = getBytesFor(string);
    int length = bytes.length;
    SystemLimitException.checkMaxStringLength(length);
    this.bytes = bytes;
    this.length = length;
    this.string = string;
  }

  public C1Utf8(C1Utf8 other) {
    this.length = other.length;
    this.bytes = Arrays.copyOf(other.bytes, other.length);
    this.string = other.string;
    this.hash = other.hash;
  }

  public C1Utf8(byte[] bytes) {
    int length = bytes.length;
    SystemLimitException.checkMaxStringLength(length);
    this.bytes = bytes;
    this.length = length;
  }

  C1Utf8(String string, int length) {
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
   * same as the current length, the cached contents of this C1Utf8 object will be
   * wiped out. After calling this method, no assumptions should be made about the
   * internal state (e.g., contents, hashcode, equality, etc.) of this C1Utf8
   * String other than the internal buffer being large enough to accommodate a
   * String of the new length. This should be called immediately before reading a
   * String from the underlying data source.
   *
   * @param newLength the new length of the underlying buffer
   * @return a reference to this object.
   * @see org.apache.avro.io.BinaryDecoder#readString(C1Utf8)
   */
  public C1Utf8 setByteLength(int newLength) {
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
  public C1Utf8 setFromString(String string) {
    byte[] bytes = getBytesFor(string);
    int length = bytes.length;
    SystemLimitException.checkMaxStringLength(length);
    this.bytes = bytes;
    this.length = length;
    this.string = string;
    this.hash = 0;
    return this;
  }

  public C1Utf8 setFromUtf8(C1Utf8 other) {
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
    if (!(o instanceof C1Utf8))
      return false;
    C1Utf8 that = (C1Utf8) o;
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
      if (length > 7) {
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

  @Override
  public int compareTo(C1Utf8 that) {
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
      char a = cs1.charAt(i);
      char b = cs2.charAt(i);
      if (a != b) {
        return a - b;
      }
    }

    return cs1.length() - cs2.length();
  }
}
