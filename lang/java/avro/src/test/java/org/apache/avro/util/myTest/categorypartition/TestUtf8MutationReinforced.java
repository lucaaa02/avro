package org.apache.avro.util;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test manuali "MT" (mutation-testing-reinforced) per {@link Utf8}, scritti per
 * uccidere i 12 mutanti sopravvissuti alla suite BB
 * (TestUtf8CategoryPartition), individuati da PIT (punto 4b della consegna).
 *
 * Ogni metodo indica in commento la riga/mutante PIT che intende uccidere.
 * Nota: la struttura e' "piatta" (nessuna classe @Nested) per lo stesso motivo
 * di TestUtf8CategoryPartition (Surefire esclude **&#47;*$*).
 */
class TestUtf8MutationReinforced {

  // ---------------------------------------------------------------
  // Riga 120 - setByteLength: "return this" sostituito con "return null"
  // ---------------------------------------------------------------

  @Test // riga 120: setByteLength deve restituire l'istanza stessa, mai null
  void setByteLength_returnValue_isNotNullAndIsSameInstance() {
    Utf8 u = new Utf8("abc");
    Utf8 returned = u.setByteLength(5);
    assertNotNull(returned);
    assertSame(u, returned);
  }

  // ---------------------------------------------------------------
  // Riga 148 - toString: "length == 0" forzato sempre false
  //
  // Tentativo iniziale FALSIFICATO empiricamente: un test che confrontava
  // per identita' (assertSame("", u.toString())) NON uccide il mutante,
  // perche' new String(bytes,0,0,UTF_8) puo' essere ottimizzato dalla JDK e
  // restituire comunque il letterale internato per un range vuoto - il
  // valore di ritorno da solo non e' quindi un osservabile affidabile.
  //
  // Osservabile affidabile: lo stato INTERNO. Usando il costruttore
  // Utf8(byte[]) - che, a differenza di Utf8(String), NON pre-imposta il
  // campo cache "string" - il campo resta null finche' nessuno lo tocca. Se
  // il controllo length==0 e' disabilitato, il codice cade nel ramo
  // successivo e SCRIVE il campo "string" (anche se il valore scritto
  // "equals" a ""); il codice originale, ritornando subito, non lo tocca
  // mai. Verifichiamo il campo via reflection.
  // ---------------------------------------------------------------

  @Test // riga 148: il campo cache "string" non deve essere scritto per il ramo vuoto
  void toString_emptyInstance_doesNotPopulateInternalStringCache() throws Exception {
    Utf8 u = new Utf8(new byte[0]);
    u.toString();
    Field stringField = Utf8.class.getDeclaredField("string");
    stringField.setAccessible(true);
    assertNull(stringField.get(u));
  }

  // ---------------------------------------------------------------
  // Riga 160 - equals: "!(o instanceof Utf8)" forzato sempre false
  //
  // NOTA IMPORTANTE: il test gia' presente in TestUtf8CategoryPartition
  // (equals_withDifferentType_returnsFalse) usa assertNotEquals("abc", u),
  // che secondo il contratto di JUnit 5 puo' invocare String.equals(Utf8)
  // anziche' Utf8.equals(String) - String.equals ritorna sempre false per un
  // argomento non-String, quindi quel test non esercita affatto il metodo
  // equals() di Utf8. Qui invochiamo esplicitamente u.equals(...).
  // ---------------------------------------------------------------

  @Test // riga 160: equals invocato direttamente su Utf8 con argomento non-Utf8
  void equals_calledDirectlyWithNonUtf8Object_returnsFalse() {
    Utf8 u = new Utf8("abc");
    assertFalse(u.equals("abc"));
    assertFalse(u.equals(new Object()));
  }

  // ---------------------------------------------------------------
  // Riga 167 - equals: "length > 7" -> boundary alterato (>=) e
  // comparison check forzato sempre false (ramo veloce Arrays.equals mai
  // preso, si usa sempre il loop manuale)
  //
  // Il ramo veloce (Arrays.equals) e il loop manuale calcolano lo stesso
  // risultato di uguaglianza per lunghezze coerenti: i due mutanti a questa
  // riga sono probabili mutanti equivalenti (nessuna differenza osservabile
  // nel valore di ritorno). I test seguenti verificano comunque la
  // correttezza di equals() esattamente sul confine (7 e 8 byte, con
  // differenza sull'ultimo byte), cosi' da avere evidenza empirica diretta
  // dall'esecuzione di PIT sull'effettiva uccidibilita' di questi mutanti.
  // ---------------------------------------------------------------

  @Test // riga 167 (confine, ramo lento: length==7): differenza sull'ultimo byte
  void equals_length7_differsOnlyInLastByte_returnsFalse() {
    Utf8 a = new Utf8("ABCDEFG");
    Utf8 b = new Utf8("ABCDEFX");
    assertEquals(7, a.getByteLength());
    assertNotEquals(a, b);
  }

  @Test // riga 167 (confine, ramo veloce: length==8): differenza sull'ultimo byte
  void equals_length8_differsOnlyInLastByte_returnsFalse() {
    Utf8 a = new Utf8("ABCDEFGH");
    Utf8 b = new Utf8("ABCDEFGX");
    assertEquals(8, a.getByteLength());
    assertNotEquals(a, b);
  }

  // ---------------------------------------------------------------
  // Riga 168 - equals: "return Arrays.equals(...)" con valore booleano
  // forzato sempre a false
  //
  // Il test precedente (length==8, contenuto diverso) non uccide questo
  // mutante: in entrambi i casi (originale e mutato) il risultato atteso e'
  // gia' false. Serve un caso POSITIVO nello stesso ramo (length>7) in cui
  // il risultato corretto e' true.
  // ---------------------------------------------------------------

  @Test // riga 168: stesso contenuto, ramo veloce (length==8), deve dare true
  void equals_length8_sameContent_returnsTrue() {
    Utf8 a = new Utf8("ABCDEFGH");
    Utf8 b = new Utf8("ABCDEFGH");
    assertEquals(8, a.getByteLength());
    assertTrue(a.equals(b));
  }

  // ---------------------------------------------------------------
  // Riga 179 - hashCode: "h == 0" forzato sempre false
  //
  // Se disabilitato, hashCode() ritorna sempre il valore CORRENTE del campo
  // hash senza mai ricalcolarlo. Per un'istanza appena costruita con
  // new Utf8(String) (che non pre-inizializza hash), il campo vale 0 di
  // default: il mutante ritornerebbe percio' 0 anziche' il valore corretto.
  // Asseriamo il valore ESATTO calcolato a mano (non solo "!= 0").
  // ---------------------------------------------------------------

  @Test // riga 179/188/189/194: hashCode di un carattere ASCII, valore atteso calcolato
        // a mano
  void hashCode_singleAsciiChar_matchesHandComputedValue() {
    // h = 1; h = 1*31 + 'A'(65) = 96
    assertEquals(96, new Utf8("A").hashCode());
  }

  @Test // riga 179/188/189/194: due caratteri, valore atteso calcolato a mano
  void hashCode_twoAsciiChars_matchesHandComputedValue() {
    // h = 1; h = 1*31+65 = 96; h = 96*31+66 = 3042
    assertEquals(3042, new Utf8("AB").hashCode());
  }

  // ---------------------------------------------------------------
  // Riga 184 - hashCode: "length > 7 && bytes.length == length" -> boundary
  // alterato (>=) e comparison check forzato sempre false (ramo veloce
  // Arrays.hashCode mai preso, si usa sempre il loop manuale)
  //
  // Arrays.hashCode(byte[]) applica ESATTAMENTE la stessa formula (h=1;
  // h=h*31+b per ogni elemento) del loop manuale quando l'array e'
  // esattamente dimensionato: anche questi due mutanti sono probabili
  // equivalenti. Il test seguente verifica pero' un caso rilevante che il
  // ramo lento deve gestire correttamente da solo: un array di supporto piu'
  // grande della lunghezza logica (bytes.length != length), scenario in cui
  // SOLO il loop manuale puo' escludere i byte "stale" oltre la lunghezza
  // logica.
  // ---------------------------------------------------------------

  @Test // riga 184 (confine, ramo lento: length==7): valore atteso calcolato a mano
  void hashCode_sevenAsciiChars_matchesHandComputedValue() {
    // Calcolato con overflow a 32 bit (wraparound) della formula h=h*31+b.
    assertEquals(1254501667, new Utf8("ABCDEFG").hashCode());
  }

  @Test // riga 184 (confine, ramo veloce: length==8): valore atteso calcolato a mano
  void hashCode_eightAsciiChars_matchesHandComputedValue() {
    assertEquals(234846085, new Utf8("ABCDEFGH").hashCode());
  }

  @Test // riga 184: array di supporto con capacita' residua (bytes.length != length)
  void hashCode_afterShrinkWithSpareCapacity_ignoresStaleTrailingBytes() {
    // "ABCDEFGHIJ" (10 byte) ridotto a lunghezza 8: setByteLength non
    // rialloca mai in riduzione, quindi bytes.length resta 10 mentre
    // length diventa 8 (bytes.length != length). Il valore atteso e' quello
    // di un'istanza "ABCDEFGH" esattamente dimensionata: solo il loop
    // manuale (o un controllo corretto della capacita') puo' ignorare i due
    // byte residui 'I' e 'J'.
    Utf8 spare = new Utf8("ABCDEFGHIJ");
    spare.setByteLength(8);
    assertEquals(234846085, spare.hashCode());
    assertEquals(new Utf8("ABCDEFGH").hashCode(), spare.hashCode());
  }

  // ---------------------------------------------------------------
  // Riga 188 - hashCode: "i < length" forzato sempre false (loop manuale mai
  // eseguito, h resta a 1)
  //
  // Coperto dagli stessi test su stringhe corte sopra: se il loop non gira
  // mai, h resta 1 (il valore di inizializzazione a riga 187) anziche' il
  // valore corretto calcolato a mano.
  // ---------------------------------------------------------------

  @Test // riga 188: hashCode di stringa non vuota deve differire dal valore di
        // inizializzazione 1
  void hashCode_nonEmptyShortString_differsFromLoopInitialValue() {
    int h = new Utf8("A").hashCode();
    assertNotEquals(1, h);
    assertEquals(96, h);
  }

  // ---------------------------------------------------------------
  // Riga 189 - hashCode: "h = h*31 + bytes[i]" -> moltiplicazione sostituita
  // con divisione, addizione sostituita con sottrazione
  //
  // Con h iniziale 1 e un solo byte non nullo (es. 'A'=65):
  // - originale: h = 1*31 + 65 = 96
  // - div(h*31->h/31): h = 1/31 + 65 = 0 + 65 = 65
  // - sub(+b->-b): h = 1*31 - 65 = -34
  // Tutti e tre i valori sono diversi tra loro: il test sul singolo
  // carattere sopra (hashCode_singleAsciiChar_matchesHandComputedValue,
  // atteso 96) uccide gia' entrambi i mutanti. Aggiungiamo qui un caso a due
  // byte per rinforzare la copertura su piu' iterazioni del loop.
  // ---------------------------------------------------------------

  @Test // riga 189: due iterazioni del loop, valore atteso calcolato a mano
  void hashCode_twoAsciiChars_distinguishesMultiplyAndAddMutants() {
    // div: h = 1/31+65 = 65; poi h = 65/31+66 = 2+66 = 68
    // sub: h = 1*31-65 = -34; poi h = -34*31-66 = -1054-66 = -1120
    // originale: 3042 (vedi test dedicato sopra)
    int h = new Utf8("AB").hashCode();
    assertEquals(3042, h);
    assertNotEquals(68, h);
    assertNotEquals(-1120, h);
  }

  // ---------------------------------------------------------------
  // Riga 194 - hashCode: "return h" sostituito con "return 0"
  //
  // Coperto da tutti i test hashCode_* sopra che asseriscono un valore
  // esatto diverso da zero; aggiungiamo un caso esplicito e minimale.
  // ---------------------------------------------------------------

  @Test // riga 194: hashCode di istanza non vuota non deve mai essere 0
  void hashCode_nonEmptyInstance_isNeverZero() {
    assertNotEquals(0, new Utf8("A").hashCode());
    assertNotEquals(0, new Utf8("ABCDEFGH").hashCode());
  }
}
