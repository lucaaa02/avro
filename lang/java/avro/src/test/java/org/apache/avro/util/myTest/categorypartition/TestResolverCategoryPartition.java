/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.avro.util;

import org.apache.avro.Resolver;
import org.apache.avro.Schema;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Test manuali basati su Category-Partition per org.apache.avro.Resolver.
 */
public class TestResolverCategoryPartition {

  // ---------------------------------------------------------------
  // Gruppo 1: tipi primitivi uguali -> DoNothing (T01-T08)
  // ---------------------------------------------------------------

  @Test
  public void t01_nullToNull_doNothing() {
    Schema w = Schema.create(Schema.Type.NULL);
    Schema r = Schema.create(Schema.Type.NULL);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.DoNothing);
  }

  @Test
  public void t02_booleanToBoolean_doNothing() {
    Schema w = Schema.create(Schema.Type.BOOLEAN);
    Schema r = Schema.create(Schema.Type.BOOLEAN);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.DoNothing);
  }

  @Test
  public void t03_intToInt_doNothing() {
    Schema w = Schema.create(Schema.Type.INT);
    Schema r = Schema.create(Schema.Type.INT);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.DoNothing);
  }

  @Test
  public void t04_longToLong_doNothing() {
    Schema w = Schema.create(Schema.Type.LONG);
    Schema r = Schema.create(Schema.Type.LONG);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.DoNothing);
  }

  @Test
  public void t05_floatToFloat_doNothing() {
    Schema w = Schema.create(Schema.Type.FLOAT);
    Schema r = Schema.create(Schema.Type.FLOAT);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.DoNothing);
  }

  @Test
  public void t06_doubleToDouble_doNothing() {
    Schema w = Schema.create(Schema.Type.DOUBLE);
    Schema r = Schema.create(Schema.Type.DOUBLE);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.DoNothing);
  }

  @Test
  public void t07_stringToString_doNothing() {
    Schema w = Schema.create(Schema.Type.STRING);
    Schema r = Schema.create(Schema.Type.STRING);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.DoNothing);
  }

  @Test
  public void t08_bytesToBytes_doNothing() {
    Schema w = Schema.create(Schema.Type.BYTES);
    Schema r = Schema.create(Schema.Type.BYTES);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.DoNothing);
  }

  // ---------------------------------------------------------------
  // Gruppo 2: promozioni numeriche valide -> Promote (T09-T15)
  // ---------------------------------------------------------------

  @Test
  public void t09_intToLong_promote() {
    Schema w = Schema.create(Schema.Type.INT);
    Schema r = Schema.create(Schema.Type.LONG);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.Promote);
  }

  @Test
  public void t10_intToFloat_promote() {
    Schema w = Schema.create(Schema.Type.INT);
    Schema r = Schema.create(Schema.Type.FLOAT);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.Promote);
  }

  @Test
  public void t11_intToDouble_promote() {
    Schema w = Schema.create(Schema.Type.INT);
    Schema r = Schema.create(Schema.Type.DOUBLE);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.Promote);
  }

  @Test
  public void t12_longToFloat_promote() {
    Schema w = Schema.create(Schema.Type.LONG);
    Schema r = Schema.create(Schema.Type.FLOAT);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.Promote);
  }

  @Test
  public void t13_floatToDouble_promote() {
    Schema w = Schema.create(Schema.Type.FLOAT);
    Schema r = Schema.create(Schema.Type.DOUBLE);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.Promote);
  }

  @Test
  public void t14_stringToBytes_promote() {
    Schema w = Schema.create(Schema.Type.STRING);
    Schema r = Schema.create(Schema.Type.BYTES);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.Promote);
  }

  @Test
  public void t15_bytesToString_promote() {
    Schema w = Schema.create(Schema.Type.BYTES);
    Schema r = Schema.create(Schema.Type.STRING);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.Promote);
  }

  // ---------------------------------------------------------------
  // Gruppo 3: combinazioni incompatibili -> ErrorAction (T16-T18)
  // ---------------------------------------------------------------

  @Test
  public void t16_longToInt_error() {
    // promozione "all'indietro": non ammessa
    Schema w = Schema.create(Schema.Type.LONG);
    Schema r = Schema.create(Schema.Type.INT);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.ErrorAction);
  }

  @Test
  public void t17_stringToInt_error() {
    Schema w = Schema.create(Schema.Type.STRING);
    Schema r = Schema.create(Schema.Type.INT);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.ErrorAction);
  }

  @Test
  public void t18_booleanToString_error() {
    Schema w = Schema.create(Schema.Type.BOOLEAN);
    Schema r = Schema.create(Schema.Type.STRING);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.ErrorAction);
  }

  // ---------------------------------------------------------------
  // Gruppo 4: FIXED (T19-T21)
  // ---------------------------------------------------------------

  @Test
  public void t19_fixedStessoNomeStessaSize_doNothing() {
    Schema w = Schema.createFixed("F", null, null, 4);
    Schema r = Schema.createFixed("F", null, null, 4);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.DoNothing);
  }

  @Test
  public void t20_fixedNomeDiverso_error() {
    Schema w = Schema.createFixed("F1", null, null, 4);
    Schema r = Schema.createFixed("F2", null, null, 4);
    Resolver.Action a = Resolver.resolve(w, r);
    assertTrue(a instanceof Resolver.ErrorAction);
    // Il campo pubblico dentro Resolver.ErrorAction si chiama "error", non
    // "errorType" come suggeriva la documentazione: verificato leggendo
    // Resolver.java.
    assertEquals(Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH, ((Resolver.ErrorAction) a).error);
  }

  @Test
  public void t21_fixedSizeDiversa_error() {
    Schema w = Schema.createFixed("F", null, null, 4);
    Schema r = Schema.createFixed("F", null, null, 8);
    Resolver.Action a = Resolver.resolve(w, r);
    assertTrue(a instanceof Resolver.ErrorAction);
    assertEquals(Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH, ((Resolver.ErrorAction) a).error);
  }

  // ---------------------------------------------------------------
  // Gruppo 5: ARRAY / MAP -> Container (T22-T24)
  // ---------------------------------------------------------------

  @Test
  public void t22_arrayStessoTipo_container() {
    Schema w = Schema.createArray(Schema.create(Schema.Type.INT));
    Schema r = Schema.createArray(Schema.create(Schema.Type.INT));
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.Container);
  }

  @Test
  public void t23_mapStessoTipo_container() {
    Schema w = Schema.createMap(Schema.create(Schema.Type.STRING));
    Schema r = Schema.createMap(Schema.create(Schema.Type.STRING));
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.Container);
  }

  @Test
  public void t24_arrayConElementoDaPromuovere_containerConPromoteInterno() {
    Schema w = Schema.createArray(Schema.create(Schema.Type.INT));
    Schema r = Schema.createArray(Schema.create(Schema.Type.LONG));
    Resolver.Action a = Resolver.resolve(w, r);
    assertTrue(a instanceof Resolver.Container);
    assertTrue(((Resolver.Container) a).elementAction instanceof Resolver.Promote);
  }

  // ---------------------------------------------------------------
  // Gruppo 6: ENUM (T25-T26)
  // ---------------------------------------------------------------

  @Test
  public void t25_enumStessiSimboli_enumAdjustSenzaErrore() {
    Schema w = Schema.createEnum("E", null, null, Arrays.asList("A", "B", "C"));
    Schema r = Schema.createEnum("E", null, null, Arrays.asList("A", "B", "C"));
    Resolver.Action a = Resolver.resolve(w, r);
    assertTrue(a instanceof Resolver.EnumAdjust);
  }

  @Test
  public void t26_enumNomeDiverso_error() {
    Schema w = Schema.createEnum("E1", null, null, Arrays.asList("A"));
    Schema r = Schema.createEnum("E2", null, null, Arrays.asList("A"));
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.ErrorAction);
  }

  // ---------------------------------------------------------------
  // Gruppo 7: RECORD (T27-T29)
  // ---------------------------------------------------------------

  private Schema recordOf(String name, List<Schema.Field> fields) {
    Schema s = Schema.createRecord(name, null, "test", false);
    s.setFields(fields);
    return s;
  }

  @Test
  public void t27_recordStessiCampi_recordAdjust() {
    Schema w = recordOf("R", Arrays.asList(new Schema.Field("a", Schema.create(Schema.Type.INT), null, (Object) null)));
    Schema r = recordOf("R", Arrays.asList(new Schema.Field("a", Schema.create(Schema.Type.INT), null, (Object) null)));
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.RecordAdjust);
  }

  @Test
  public void t28_recordConCampoInPiuNelWriter_contieneSkip() {
    Schema w = recordOf("R", Arrays.asList(new Schema.Field("a", Schema.create(Schema.Type.INT), null, (Object) null),
        new Schema.Field("b", Schema.create(Schema.Type.STRING), null, (Object) null)));
    Schema r = recordOf("R", Arrays.asList(new Schema.Field("a", Schema.create(Schema.Type.INT), null, (Object) null)));
    Resolver.Action a = Resolver.resolve(w, r);
    assertTrue(a instanceof Resolver.RecordAdjust);

    Resolver.RecordAdjust ra = (Resolver.RecordAdjust) a;
    boolean hasSkip = false;
    for (Resolver.Action fieldAction : ra.fieldActions) {
      if (fieldAction instanceof Resolver.Skip) {
        hasSkip = true;
      }
    }
    assertTrue("Il campo 'b' scritto ma assente nel reader deve produrre uno Skip", hasSkip);
  }

  @Test
  public void t29_recordConCampoInPiuNelReaderSenzaDefault_error() {
    Schema w = recordOf("R", Arrays.asList(new Schema.Field("a", Schema.create(Schema.Type.INT), null, (Object) null)));
    Schema r = recordOf("R", Arrays.asList(new Schema.Field("a", Schema.create(Schema.Type.INT), null, (Object) null),
        new Schema.Field("b", Schema.create(Schema.Type.STRING), null, (Object) null)));
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.ErrorAction);
  }

  // ---------------------------------------------------------------
  // Gruppo 8: UNION (T30-T32)
  // ---------------------------------------------------------------

  @Test
  public void t30_readerUnioneWriterNo_readerUnion() {
    Schema w = Schema.create(Schema.Type.INT);
    Schema r = Schema.createUnion(Arrays.asList(Schema.create(Schema.Type.NULL), Schema.create(Schema.Type.INT)));
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.ReaderUnion);
  }

  @Test
  public void t31_writerUnioneReaderNo_writerUnion() {
    Schema w = Schema.createUnion(Arrays.asList(Schema.create(Schema.Type.NULL), Schema.create(Schema.Type.INT)));
    Schema r = Schema.create(Schema.Type.INT);
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.WriterUnion);
  }

  @Test
  public void t32_readerUnioneSenzaBranchCompatibile_error() {
    Schema w = Schema.create(Schema.Type.STRING);
    Schema r = Schema.createUnion(Arrays.asList(Schema.create(Schema.Type.NULL), Schema.create(Schema.Type.INT)));
    assertTrue(Resolver.resolve(w, r) instanceof Resolver.ErrorAction);
  }
}