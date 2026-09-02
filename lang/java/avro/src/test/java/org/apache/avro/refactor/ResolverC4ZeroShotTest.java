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
package org.apache.avro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;

import org.apache.avro.generic.GenericData;
import org.junit.jupiter.api.Test;

public class ResolverC4ZeroShotTest {

  @Test
  public void testPrimitiveDoNothing() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.INT);

    C4Resolver.Action action = C4Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C4Resolver.Action.Type.DO_NOTHING, action.type);
  }

  @Test
  public void testPrimitivePromote() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema.create(Schema.Type.LONG);

    C4Resolver.Action action = C4Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C4Resolver.Action.Type.PROMOTE, action.type);
  }

  @Test
  public void testPrimitiveIncompatibleError() {
    Schema writer = Schema.create(Schema.Type.STRING);
    Schema reader = Schema.create(Schema.Type.INT);

    C4Resolver.Action action = C4Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C4Resolver.Action.Type.ERROR, action.type);
    assertTrue(action instanceof C4Resolver.ErrorAction);
    assertEquals(C4Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES, ((C4Resolver.ErrorAction) action).error);
  }

  @Test
  public void testFixedSuccess() {
    Schema writer = Schema.createFixed("MyFixed", "doc", "ns", 10);
    Schema reader = Schema.createFixed("MyFixed", "doc", "ns", 10);

    C4Resolver.Action action = C4Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C4Resolver.Action.Type.DO_NOTHING, action.type);
  }

  @Test
  public void testFixedNamesDontMatch() {
    Schema writer = Schema.createFixed("FixedA", "doc", "ns", 10);
    Schema reader = Schema.createFixed("FixedB", "doc", "ns", 10);

    C4Resolver.Action action = C4Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C4Resolver.Action.Type.ERROR, action.type);
    assertEquals(C4Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH, ((C4Resolver.ErrorAction) action).error);
  }

  @Test
  public void testFixedSizesDontMatch() {
    Schema writer = Schema.createFixed("MyFixed", "doc", "ns", 10);
    Schema reader = Schema.createFixed("MyFixed", "doc", "ns", 12);

    C4Resolver.Action action = C4Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C4Resolver.Action.Type.ERROR, action.type);
    assertEquals(C4Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH, ((C4Resolver.ErrorAction) action).error);
  }

  @Test
  public void testArrayContainer() {
    Schema writer = Schema.createArray(Schema.create(Schema.Type.INT));
    Schema reader = Schema.createArray(Schema.create(Schema.Type.LONG));

    C4Resolver.Action action = C4Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C4Resolver.Action.Type.CONTAINER, action.type);
    assertTrue(action instanceof C4Resolver.Container);
    assertEquals(C4Resolver.Action.Type.PROMOTE, ((C4Resolver.Container) action).elementAction.type);
  }

  @Test
  public void testMapContainer() {
    Schema writer = Schema.createMap(Schema.create(Schema.Type.STRING));
    Schema reader = Schema.createMap(Schema.create(Schema.Type.STRING));

    C4Resolver.Action action = C4Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C4Resolver.Action.Type.CONTAINER, action.type);
    assertTrue(action instanceof C4Resolver.Container);
    assertEquals(C4Resolver.Action.Type.DO_NOTHING, ((C4Resolver.Container) action).elementAction.type);
  }

  @Test
  public void testEnumAdjustMatching() {
    Schema writer = Schema.createEnum("MyEnum", "doc", "ns", Arrays.asList("A", "B"));
    Schema reader = Schema.createEnum("MyEnum", "doc", "ns", Arrays.asList("A", "B"));

    C4Resolver.Action action = C4Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C4Resolver.Action.Type.ENUM, action.type);
    assertTrue(((C4Resolver.EnumAdjust) action).noAdjustmentsNeeded);
  }

  @Test
  public void testEnumNamesDontMatch() {
    Schema writer = Schema.createEnum("EnumA", "doc", "ns", Arrays.asList("A"));
    Schema reader = Schema.createEnum("EnumB", "doc", "ns", Arrays.asList("A"));

    C4Resolver.Action action = C4Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C4Resolver.Action.Type.ERROR, action.type);
    assertEquals(C4Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH, ((C4Resolver.ErrorAction) action).error);
  }

  @Test
  public void testRecordAdjustSuccess() {
    Schema writer = Schema.createRecord("MyRecord", "doc", "ns", false,
        Arrays.asList(new Schema.Field("f1", Schema.create(Schema.Type.INT), "doc", null)));
    Schema reader = Schema.createRecord("MyRecord", "doc", "ns", false,
        Arrays.asList(new Schema.Field("f1", Schema.create(Schema.Type.INT), "doc", null)));

    C4Resolver.Action action = C4Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C4Resolver.Action.Type.RECORD, action.type);
    assertTrue(((C4Resolver.RecordAdjust) action).noReorder());
  }

  @Test
  public void testRecordMissingRequiredField() {
    Schema writer = Schema.createRecord("MyRecord", "doc", "ns", false, Collections.emptyList());
    Schema reader = Schema.createRecord("MyRecord", "doc", "ns", false,
        Arrays.asList(new Schema.Field("f1", Schema.create(Schema.Type.INT), "doc", null)));

    C4Resolver.Action action = C4Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C4Resolver.Action.Type.ERROR, action.type);
    assertEquals(C4Resolver.ErrorAction.ErrorType.MISSING_REQUIRED_FIELD, ((C4Resolver.ErrorAction) action).error);
  }

  @Test
  public void testWriterUnionEquiv() {
    Schema writer = Schema
        .createUnion(Arrays.asList(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.STRING)));
    Schema reader = Schema
        .createUnion(Arrays.asList(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.STRING)));

    C4Resolver.Action action = C4Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C4Resolver.Action.Type.WRITER_UNION, action.type);
    assertTrue(((C4Resolver.WriterUnion) action).unionEquiv);
  }

  @Test
  public void testReaderUnionMatch() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema
        .createUnion(Arrays.asList(Schema.create(Schema.Type.STRING), Schema.create(Schema.Type.INT)));

    C4Resolver.Action action = C4Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C4Resolver.Action.Type.READER_UNION, action.type);
    assertEquals(1, ((C4Resolver.ReaderUnion) action).firstMatch);
  }

  @Test
  public void testReaderUnionNoMatchingBranch() {
    Schema writer = Schema.create(Schema.Type.INT);
    Schema reader = Schema
        .createUnion(Arrays.asList(Schema.create(Schema.Type.STRING), Schema.create(Schema.Type.BYTES)));

    C4Resolver.Action action = C4Resolver.resolve(writer, reader);
    assertNotNull(action);
    assertEquals(C4Resolver.Action.Type.ERROR, action.type);
    assertEquals(C4Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH, ((C4Resolver.ErrorAction) action).error);
  }

  @Test
  public void testPromoteIsValidThrowsOnSameType() {
    Schema schema = Schema.create(Schema.Type.INT);
    assertThrows(IllegalArgumentException.class, () -> {
      C4Resolver.Promote.isValid(schema, schema);
    });
  }

  @Test
  public void testErrorActionToStringMissingField() {
    Schema writer = Schema.createRecord("WriterRec", "doc", "ns", false, Collections.emptyList());
    Schema reader = Schema.createRecord("ReaderRec", "doc", "ns", false,
        Arrays.asList(new Schema.Field("missingField", Schema.create(Schema.Type.INT), "doc", null)));

    C4Resolver.Action action = C4Resolver.resolve(writer, reader);
    assertEquals(C4Resolver.Action.Type.ERROR, action.type);
    String str = action.toString();
    assertTrue(str.contains("missing required field missingField"));
  }
}