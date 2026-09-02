import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopResolverC2Test7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3501");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType13 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction14 = new org.apache.avro.C2Resolver.ErrorAction(schema10, schema11, genericData12, errorType13);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion15 = new org.apache.avro.C2Resolver.ReaderUnion(schema6, schema7, genericData8, 100, (org.apache.avro.C2Resolver.Action) errorAction14);
        org.apache.avro.Schema schema16 = errorAction14.writer;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction14.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction18 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType17);
        org.apache.avro.C2Resolver.ErrorAction errorAction19 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType17);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType20 = errorAction19.error;
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType13.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertNull(schema16);
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType20.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3502");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType10 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction11 = new org.apache.avro.C2Resolver.ErrorAction(schema7, schema8, genericData9, errorType10);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = errorAction11.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema4, schema5, genericData6, errorType12);
        org.apache.avro.C2Resolver.Action.Type type14 = errorAction13.type;
        org.apache.avro.C2Resolver.Action.Type type15 = errorAction13.type;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion16 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (byte) 0, (org.apache.avro.C2Resolver.Action) errorAction13);
        java.lang.Class<?> wildcardClass17 = errorAction13.getClass();
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType10.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type14.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type15.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3503");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.Schema schema17 = null;
        org.apache.avro.generic.GenericData genericData18 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.Schema schema20 = null;
        org.apache.avro.generic.GenericData genericData21 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing22 = new org.apache.avro.C2Resolver.DoNothing(schema19, schema20, genericData21);
        org.apache.avro.C2Resolver.Container container23 = new org.apache.avro.C2Resolver.Container(schema16, schema17, genericData18, (org.apache.avro.C2Resolver.Action) doNothing22);
        org.apache.avro.Conversion<?> wildcardConversion24 = doNothing22.conversion;
        org.apache.avro.Conversion<?> wildcardConversion25 = doNothing22.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion26 = new org.apache.avro.C2Resolver.ReaderUnion(schema12, schema13, genericData14, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing22);
        int int27 = readerUnion26.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion28 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, (int) (byte) -1, (org.apache.avro.C2Resolver.Action) readerUnion26);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion29 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, 10, (org.apache.avro.C2Resolver.Action) readerUnion28);
        org.apache.avro.Schema schema30 = readerUnion29.writer;
        org.apache.avro.Conversion<?> wildcardConversion31 = readerUnion29.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion32 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 100, (org.apache.avro.C2Resolver.Action) readerUnion29);
        java.lang.Class<?> wildcardClass33 = readerUnion32.getClass();
        org.junit.Assert.assertNull(wildcardConversion24);
        org.junit.Assert.assertNull(wildcardConversion25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNull(schema30);
        org.junit.Assert.assertNull(wildcardConversion31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3504");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType12);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType15);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction18 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType17);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType19 = errorAction18.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction20 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType19);
        org.apache.avro.Schema schema21 = errorAction20.writer;
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType19.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(schema21);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3505");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.generic.GenericData genericData4 = null;
        org.apache.avro.C2Resolver.Skip skip5 = new org.apache.avro.C2Resolver.Skip(schema3, genericData4);
        org.apache.avro.C2Resolver.Action.Type type6 = skip5.type;
        org.apache.avro.LogicalType logicalType7 = skip5.logicalType;
        org.apache.avro.C2Resolver.Container container8 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) skip5);
        org.apache.avro.Conversion<?> wildcardConversion9 = skip5.conversion;
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.C2Resolver.Action.Type.SKIP + "'", type6.equals(org.apache.avro.C2Resolver.Action.Type.SKIP));
        org.junit.Assert.assertNull(logicalType7);
        org.junit.Assert.assertNull(wildcardConversion9);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3506");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction10 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) errorAction10);
        org.apache.avro.Schema schema12 = errorAction10.writer;
        org.apache.avro.Schema schema13 = errorAction10.writer;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction10.error;
        org.apache.avro.Conversion<?> wildcardConversion15 = errorAction10.conversion;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType16 = errorAction10.error;
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) errorAction10);
        org.apache.avro.Schema schema18 = container17.writer;
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH + "'", errorType9.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH));
        org.junit.Assert.assertNull(schema12);
        org.junit.Assert.assertNull(schema13);
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH));
        org.junit.Assert.assertNull(wildcardConversion15);
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH + "'", errorType16.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH));
        org.junit.Assert.assertNull(schema18);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3507");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType12);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction15 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType14);
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType14);
        org.apache.avro.LogicalType logicalType17 = errorAction16.logicalType;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType18 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction19 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType18);
        org.apache.avro.Schema schema20 = errorAction19.reader;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType21 = errorAction19.error;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = errorAction19.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(logicalType17);
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType18.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(schema20);
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType21.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3508");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.LogicalType logicalType12 = container11.logicalType;
        org.apache.avro.C2Resolver.Action action13 = container11.elementAction;
        org.apache.avro.Conversion<?> wildcardConversion14 = action13.conversion;
        org.apache.avro.Schema schema15 = action13.writer;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion16 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (byte) -1, action13);
        org.apache.avro.C2Resolver.Action action17 = readerUnion16.actualAction;
        int int18 = readerUnion16.firstMatch;
        org.apache.avro.Conversion<?> wildcardConversion19 = readerUnion16.conversion;
        org.apache.avro.C2Resolver.Action.Type type20 = readerUnion16.type;
        int int21 = readerUnion16.firstMatch;
        org.junit.Assert.assertNull(logicalType12);
        org.junit.Assert.assertNotNull(action13);
        org.junit.Assert.assertNull(wildcardConversion14);
        org.junit.Assert.assertNull(schema15);
        org.junit.Assert.assertNotNull(action17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(wildcardConversion19);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type20.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3509");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.Action action15 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion16 = new org.apache.avro.C2Resolver.ReaderUnion(schema11, schema12, genericData13, (int) ' ', action15);
        int int17 = readerUnion16.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, 0, (org.apache.avro.C2Resolver.Action) readerUnion16);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion19 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, (int) (byte) 0, (org.apache.avro.C2Resolver.Action) readerUnion18);
        org.apache.avro.Schema schema20 = readerUnion18.reader;
        org.apache.avro.C2Resolver.Container container21 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion18);
        org.apache.avro.C2Resolver.Action action22 = container21.elementAction;
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNull(schema20);
        org.junit.Assert.assertNotNull(action22);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3510");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType6 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction7 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType6);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType8 = errorAction7.error;
        org.apache.avro.C2Resolver.Container container9 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) errorAction7);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType10 = errorAction7.error;
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType6.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType8.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType10.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3511");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.generic.GenericData genericData15 = null;
        org.apache.avro.Schema schema17 = null;
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.generic.GenericData genericData19 = null;
        org.apache.avro.Schema schema20 = null;
        org.apache.avro.Schema schema21 = null;
        org.apache.avro.generic.GenericData genericData22 = null;
        org.apache.avro.C2Resolver.Action action24 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion25 = new org.apache.avro.C2Resolver.ReaderUnion(schema20, schema21, genericData22, (int) ' ', action24);
        org.apache.avro.C2Resolver.Container container26 = new org.apache.avro.C2Resolver.Container(schema17, schema18, genericData19, action24);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion27 = new org.apache.avro.C2Resolver.ReaderUnion(schema13, schema14, genericData15, (int) '4', (org.apache.avro.C2Resolver.Action) container26);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion28 = new org.apache.avro.C2Resolver.ReaderUnion(schema9, schema10, genericData11, (int) (short) 1, (org.apache.avro.C2Resolver.Action) container26);
        org.apache.avro.C2Resolver.Action action29 = readerUnion28.actualAction;
        org.apache.avro.C2Resolver.Action action30 = readerUnion28.actualAction;
        org.apache.avro.C2Resolver.Container container31 = new org.apache.avro.C2Resolver.Container(schema6, schema7, genericData8, action30);
        org.apache.avro.C2Resolver.Container container32 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, action30);
        org.apache.avro.LogicalType logicalType33 = container32.logicalType;
        org.apache.avro.C2Resolver.Action action34 = container32.elementAction;
        org.apache.avro.C2Resolver.Container container35 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) container32);
        org.apache.avro.LogicalType logicalType36 = container32.logicalType;
        org.junit.Assert.assertNotNull(action29);
        org.junit.Assert.assertNotNull(action30);
        org.junit.Assert.assertNull(logicalType33);
        org.junit.Assert.assertNotNull(action34);
        org.junit.Assert.assertNull(logicalType36);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3512");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing14 = new org.apache.avro.C2Resolver.DoNothing(schema11, schema12, genericData13);
        org.apache.avro.C2Resolver.Container container15 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion16 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, 35, (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion17 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 0, (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.C2Resolver.Action action18 = readerUnion17.actualAction;
        org.apache.avro.C2Resolver.Action action19 = readerUnion17.actualAction;
        org.apache.avro.C2Resolver.Action action20 = readerUnion17.actualAction;
        org.apache.avro.LogicalType logicalType21 = readerUnion17.logicalType;
        org.junit.Assert.assertNotNull(action18);
        org.junit.Assert.assertNotNull(action19);
        org.junit.Assert.assertNotNull(action20);
        org.junit.Assert.assertNull(logicalType21);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3513");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.C2Resolver.Action action7 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion8 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, (int) ' ', action7);
        int int9 = readerUnion8.firstMatch;
        org.apache.avro.C2Resolver.Action.Type type10 = readerUnion8.type;
        org.apache.avro.C2Resolver.Action action11 = readerUnion8.actualAction;
        org.apache.avro.Schema schema12 = readerUnion8.writer;
        org.apache.avro.C2Resolver.Container container13 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion8);
        org.apache.avro.C2Resolver.Action.Type type14 = readerUnion8.type;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type10.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertNull(action11);
        org.junit.Assert.assertNull(schema12);
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type14.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3514");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.C2Resolver.Skip skip6 = new org.apache.avro.C2Resolver.Skip(schema4, genericData5);
        org.apache.avro.C2Resolver.Action.Type type7 = skip6.type;
        org.apache.avro.Schema schema8 = skip6.reader;
        org.apache.avro.LogicalType logicalType9 = skip6.logicalType;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion10 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 52, (org.apache.avro.C2Resolver.Action) skip6);
        org.apache.avro.LogicalType logicalType11 = readerUnion10.logicalType;
        org.apache.avro.Schema schema12 = readerUnion10.reader;
        int int13 = readerUnion10.firstMatch;
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.C2Resolver.Action.Type.SKIP + "'", type7.equals(org.apache.avro.C2Resolver.Action.Type.SKIP));
        org.junit.Assert.assertNull(schema8);
        org.junit.Assert.assertNull(logicalType9);
        org.junit.Assert.assertNull(logicalType11);
        org.junit.Assert.assertNull(schema12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3515");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType6 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction7 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType6);
        org.apache.avro.C2Resolver.ErrorAction errorAction8 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType6);
        java.lang.Class<?> wildcardClass9 = errorType6.getClass();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType6.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3516");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion15 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, 100, (org.apache.avro.C2Resolver.Action) container14);
        org.apache.avro.C2Resolver.Container container16 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion15);
        int int17 = readerUnion15.firstMatch;
        int int18 = readerUnion15.firstMatch;
        org.apache.avro.C2Resolver.Action action19 = readerUnion15.actualAction;
        org.apache.avro.Schema schema20 = readerUnion15.reader;
        org.apache.avro.Schema schema21 = readerUnion15.reader;
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(action19);
        org.junit.Assert.assertNull(schema20);
        org.junit.Assert.assertNull(schema21);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3517");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.generic.GenericData genericData15 = null;
        org.apache.avro.Schema schema17 = null;
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.generic.GenericData genericData19 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing20 = new org.apache.avro.C2Resolver.DoNothing(schema17, schema18, genericData19);
        org.apache.avro.Schema schema21 = doNothing20.reader;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema13, schema14, genericData15, 1, (org.apache.avro.C2Resolver.Action) doNothing20);
        org.apache.avro.LogicalType logicalType23 = readerUnion22.logicalType;
        int int24 = readerUnion22.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion25 = new org.apache.avro.C2Resolver.ReaderUnion(schema9, schema10, genericData11, (int) (short) 0, (org.apache.avro.C2Resolver.Action) readerUnion22);
        org.apache.avro.C2Resolver.Container container26 = new org.apache.avro.C2Resolver.Container(schema6, schema7, genericData8, (org.apache.avro.C2Resolver.Action) readerUnion25);
        org.apache.avro.C2Resolver.Container container27 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) readerUnion25);
        org.apache.avro.C2Resolver.Container container28 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion25);
        int int29 = readerUnion25.firstMatch;
        org.junit.Assert.assertNull(schema21);
        org.junit.Assert.assertNull(logicalType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3518");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing18 = new org.apache.avro.C2Resolver.DoNothing(schema15, schema16, genericData17);
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema12, schema13, genericData14, (org.apache.avro.C2Resolver.Action) doNothing18);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion20 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, 35, (org.apache.avro.C2Resolver.Action) doNothing18);
        org.apache.avro.Schema schema21 = readerUnion20.reader;
        int int22 = readerUnion20.firstMatch;
        org.apache.avro.C2Resolver.Action action23 = readerUnion20.actualAction;
        org.apache.avro.C2Resolver.Action action24 = readerUnion20.actualAction;
        org.apache.avro.Conversion<?> wildcardConversion25 = readerUnion20.conversion;
        org.apache.avro.C2Resolver.Action action26 = readerUnion20.actualAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion27 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (byte) 0, action26);
        int int28 = readerUnion27.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion29 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (byte) 1, (org.apache.avro.C2Resolver.Action) readerUnion27);
        java.lang.Class<?> wildcardClass30 = readerUnion27.getClass();
        org.junit.Assert.assertNull(schema21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(action23);
        org.junit.Assert.assertNotNull(action24);
        org.junit.Assert.assertNull(wildcardConversion25);
        org.junit.Assert.assertNotNull(action26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3519");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction10 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType9);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType11 = errorAction10.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction12 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType11);
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType11);
        org.apache.avro.Schema schema14 = errorAction13.reader;
        org.apache.avro.C2Resolver.Action.Type type15 = errorAction13.type;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType16 = errorAction13.error;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = errorAction13.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType9.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType11.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(schema14);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type15.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType16.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3520");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion15 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, 35, (org.apache.avro.C2Resolver.Action) doNothing13);
        int int16 = readerUnion15.firstMatch;
        int int17 = readerUnion15.firstMatch;
        int int18 = readerUnion15.firstMatch;
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion15);
        org.apache.avro.Conversion<?> wildcardConversion20 = container19.conversion;
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNull(wildcardConversion20);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3521");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.C2Resolver.Action action19 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion20 = new org.apache.avro.C2Resolver.ReaderUnion(schema15, schema16, genericData17, (int) ' ', action19);
        int int21 = readerUnion20.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema11, schema12, genericData13, 0, (org.apache.avro.C2Resolver.Action) readerUnion20);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion23 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, (int) (byte) 0, (org.apache.avro.C2Resolver.Action) readerUnion22);
        int int24 = readerUnion23.firstMatch;
        org.apache.avro.C2Resolver.Action action25 = readerUnion23.actualAction;
        org.apache.avro.C2Resolver.Container container26 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) readerUnion23);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion27 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) -1, (org.apache.avro.C2Resolver.Action) readerUnion23);
        org.apache.avro.C2Resolver.Action action28 = readerUnion23.actualAction;
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(action25);
        org.junit.Assert.assertNotNull(action28);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3522");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType12);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction15 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType14);
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType14);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType18 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction19 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType18);
        org.apache.avro.Schema schema20 = errorAction19.writer;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType21 = errorAction19.error;
        org.apache.avro.Schema schema22 = errorAction19.writer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = errorAction19.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType18.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(schema20);
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType21.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(schema22);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3523");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType12);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType15);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction16.error;
        org.apache.avro.Schema schema18 = errorAction16.reader;
        org.apache.avro.C2Resolver.Action.Type type19 = errorAction16.type;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType20 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType21 = errorAction16.error;
        org.apache.avro.C2Resolver.Action.Type type22 = errorAction16.type;
        org.apache.avro.C2Resolver.Container container23 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) errorAction16);
        org.apache.avro.C2Resolver.Container container24 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) errorAction16);
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type19.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType20.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType21.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type22.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3524");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.generic.GenericData genericData20 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing21 = new org.apache.avro.C2Resolver.DoNothing(schema18, schema19, genericData20);
        org.apache.avro.C2Resolver.Container container22 = new org.apache.avro.C2Resolver.Container(schema15, schema16, genericData17, (org.apache.avro.C2Resolver.Action) doNothing21);
        org.apache.avro.Conversion<?> wildcardConversion23 = doNothing21.conversion;
        org.apache.avro.Conversion<?> wildcardConversion24 = doNothing21.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion25 = new org.apache.avro.C2Resolver.ReaderUnion(schema11, schema12, genericData13, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing21);
        org.apache.avro.C2Resolver.Action action26 = readerUnion25.actualAction;
        int int27 = readerUnion25.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion28 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, 0, (org.apache.avro.C2Resolver.Action) readerUnion25);
        org.apache.avro.C2Resolver.Action action29 = readerUnion28.actualAction;
        org.apache.avro.C2Resolver.Container container30 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) readerUnion28);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion31 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 100, (org.apache.avro.C2Resolver.Action) container30);
        org.apache.avro.Schema schema32 = readerUnion31.writer;
        org.junit.Assert.assertNull(wildcardConversion23);
        org.junit.Assert.assertNull(wildcardConversion24);
        org.junit.Assert.assertNotNull(action26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(action29);
        org.junit.Assert.assertNull(schema32);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3525");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.Schema schema14 = doNothing13.reader;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion15 = new org.apache.avro.C2Resolver.ReaderUnion(schema6, schema7, genericData8, 1, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.LogicalType logicalType16 = readerUnion15.logicalType;
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) readerUnion15);
        org.apache.avro.C2Resolver.Action action18 = container17.elementAction;
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) container17);
        org.apache.avro.C2Resolver.Action.Type type20 = container17.type;
        org.apache.avro.Conversion<?> wildcardConversion21 = container17.conversion;
        org.apache.avro.C2Resolver.Action action22 = container17.elementAction;
        org.apache.avro.C2Resolver.Action action23 = container17.elementAction;
        org.junit.Assert.assertNull(schema14);
        org.junit.Assert.assertNull(logicalType16);
        org.junit.Assert.assertNotNull(action18);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type20.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNull(wildcardConversion21);
        org.junit.Assert.assertNotNull(action22);
        org.junit.Assert.assertNotNull(action23);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3526");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing9 = new org.apache.avro.C2Resolver.DoNothing(schema6, schema7, genericData8);
        org.apache.avro.LogicalType logicalType10 = doNothing9.logicalType;
        org.apache.avro.Schema schema11 = doNothing9.writer;
        org.apache.avro.C2Resolver.Container container12 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) doNothing9);
        org.apache.avro.Schema schema13 = doNothing9.reader;
        org.apache.avro.LogicalType logicalType14 = doNothing9.logicalType;
        org.apache.avro.LogicalType logicalType15 = doNothing9.logicalType;
        org.apache.avro.C2Resolver.Action.Type type16 = doNothing9.type;
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) doNothing9);
        org.junit.Assert.assertNull(logicalType10);
        org.junit.Assert.assertNull(schema11);
        org.junit.Assert.assertNull(schema13);
        org.junit.Assert.assertNull(logicalType14);
        org.junit.Assert.assertNull(logicalType15);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.avro.C2Resolver.Action.Type.DO_NOTHING + "'", type16.equals(org.apache.avro.C2Resolver.Action.Type.DO_NOTHING));
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3527");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing18 = new org.apache.avro.C2Resolver.DoNothing(schema15, schema16, genericData17);
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema12, schema13, genericData14, (org.apache.avro.C2Resolver.Action) doNothing18);
        org.apache.avro.Conversion<?> wildcardConversion20 = doNothing18.conversion;
        org.apache.avro.Conversion<?> wildcardConversion21 = doNothing18.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing18);
        int int23 = readerUnion22.firstMatch;
        org.apache.avro.C2Resolver.Action action24 = readerUnion22.actualAction;
        int int25 = readerUnion22.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion26 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, 0, (org.apache.avro.C2Resolver.Action) readerUnion22);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion27 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) 'a', (org.apache.avro.C2Resolver.Action) readerUnion26);
        org.apache.avro.C2Resolver.Action.Type type28 = readerUnion26.type;
        org.apache.avro.C2Resolver.Action.Type type29 = readerUnion26.type;
        org.apache.avro.C2Resolver.Action action30 = readerUnion26.actualAction;
        java.lang.Class<?> wildcardClass31 = readerUnion26.getClass();
        org.junit.Assert.assertNull(wildcardConversion20);
        org.junit.Assert.assertNull(wildcardConversion21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNotNull(action24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type28.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type29.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertNotNull(action30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3528");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.generic.GenericData genericData20 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing21 = new org.apache.avro.C2Resolver.DoNothing(schema18, schema19, genericData20);
        org.apache.avro.C2Resolver.Container container22 = new org.apache.avro.C2Resolver.Container(schema15, schema16, genericData17, (org.apache.avro.C2Resolver.Action) doNothing21);
        org.apache.avro.C2Resolver.Container container23 = new org.apache.avro.C2Resolver.Container(schema12, schema13, genericData14, (org.apache.avro.C2Resolver.Action) doNothing21);
        org.apache.avro.C2Resolver.Action.Type type24 = container23.type;
        org.apache.avro.LogicalType logicalType25 = container23.logicalType;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion26 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, (int) (short) 1, (org.apache.avro.C2Resolver.Action) container23);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion27 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) ' ', (org.apache.avro.C2Resolver.Action) container23);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion28 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 0, (org.apache.avro.C2Resolver.Action) readerUnion27);
        org.apache.avro.Schema schema29 = readerUnion27.writer;
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type24.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNull(logicalType25);
        org.junit.Assert.assertNull(schema29);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3529");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing18 = new org.apache.avro.C2Resolver.DoNothing(schema15, schema16, genericData17);
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema12, schema13, genericData14, (org.apache.avro.C2Resolver.Action) doNothing18);
        org.apache.avro.Conversion<?> wildcardConversion20 = doNothing18.conversion;
        org.apache.avro.Conversion<?> wildcardConversion21 = doNothing18.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing18);
        org.apache.avro.LogicalType logicalType23 = readerUnion22.logicalType;
        org.apache.avro.C2Resolver.Action action24 = readerUnion22.actualAction;
        org.apache.avro.Schema schema25 = action24.reader;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion26 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (byte) 100, action24);
        org.apache.avro.Schema schema27 = readerUnion26.writer;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion28 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 97, (org.apache.avro.C2Resolver.Action) readerUnion26);
        org.junit.Assert.assertNull(wildcardConversion20);
        org.junit.Assert.assertNull(wildcardConversion21);
        org.junit.Assert.assertNull(logicalType23);
        org.junit.Assert.assertNotNull(action24);
        org.junit.Assert.assertNull(schema25);
        org.junit.Assert.assertNull(schema27);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3530");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.Conversion<?> wildcardConversion12 = doNothing10.conversion;
        org.apache.avro.Conversion<?> wildcardConversion13 = doNothing10.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion14 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.C2Resolver.Action action15 = readerUnion14.actualAction;
        int int16 = readerUnion14.firstMatch;
        org.apache.avro.Schema schema17 = readerUnion14.reader;
        org.apache.avro.LogicalType logicalType18 = readerUnion14.logicalType;
        org.apache.avro.C2Resolver.Action.Type type19 = readerUnion14.type;
        org.junit.Assert.assertNull(wildcardConversion12);
        org.junit.Assert.assertNull(wildcardConversion13);
        org.junit.Assert.assertNotNull(action15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNull(schema17);
        org.junit.Assert.assertNull(logicalType18);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type19.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3531");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.generic.GenericData genericData15 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType16 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction17 = new org.apache.avro.C2Resolver.ErrorAction(schema13, schema14, genericData15, errorType16);
        org.apache.avro.C2Resolver.Container container18 = new org.apache.avro.C2Resolver.Container(schema10, schema11, genericData12, (org.apache.avro.C2Resolver.Action) errorAction17);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion19 = new org.apache.avro.C2Resolver.ReaderUnion(schema6, schema7, genericData8, 1, (org.apache.avro.C2Resolver.Action) errorAction17);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType20 = errorAction17.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType21 = errorAction17.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction22 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType21);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType23 = errorAction22.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction24 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType23);
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType16.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType20.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType21.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType23.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3532");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.generic.GenericData genericData15 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing16 = new org.apache.avro.C2Resolver.DoNothing(schema13, schema14, genericData15);
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema10, schema11, genericData12, (org.apache.avro.C2Resolver.Action) doNothing16);
        org.apache.avro.C2Resolver.Action.Type type18 = container17.type;
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) container17);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion20 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, 0, (org.apache.avro.C2Resolver.Action) container19);
        org.apache.avro.C2Resolver.Action action21 = readerUnion20.actualAction;
        org.apache.avro.LogicalType logicalType22 = readerUnion20.logicalType;
        org.apache.avro.C2Resolver.Container container23 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion20);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type18.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNotNull(action21);
        org.junit.Assert.assertNull(logicalType22);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3533");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing11 = new org.apache.avro.C2Resolver.DoNothing(schema8, schema9, genericData10);
        org.apache.avro.Schema schema12 = doNothing11.reader;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion13 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, 1, (org.apache.avro.C2Resolver.Action) doNothing11);
        org.apache.avro.LogicalType logicalType14 = readerUnion13.logicalType;
        int int15 = readerUnion13.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion16 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 0, (org.apache.avro.C2Resolver.Action) readerUnion13);
        org.apache.avro.Conversion<?> wildcardConversion17 = readerUnion13.conversion;
        org.apache.avro.C2Resolver.Action.Type type18 = readerUnion13.type;
        org.apache.avro.C2Resolver.Action.Type type19 = readerUnion13.type;
        org.junit.Assert.assertNull(schema12);
        org.junit.Assert.assertNull(logicalType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(wildcardConversion17);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type18.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type19.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3534");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.Schema schema15 = container14.writer;
        org.apache.avro.C2Resolver.Action action16 = container14.elementAction;
        org.apache.avro.Conversion<?> wildcardConversion17 = container14.conversion;
        org.apache.avro.Conversion<?> wildcardConversion18 = container14.conversion;
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) container14);
        org.apache.avro.C2Resolver.Action action20 = container14.elementAction;
        org.apache.avro.C2Resolver.Action action21 = container14.elementAction;
        org.apache.avro.C2Resolver.Action.Type type22 = container14.type;
        org.apache.avro.C2Resolver.Action action23 = container14.elementAction;
        org.apache.avro.LogicalType logicalType24 = action23.logicalType;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion25 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 1, action23);
        org.junit.Assert.assertNull(schema15);
        org.junit.Assert.assertNotNull(action16);
        org.junit.Assert.assertNull(wildcardConversion17);
        org.junit.Assert.assertNull(wildcardConversion18);
        org.junit.Assert.assertNotNull(action20);
        org.junit.Assert.assertNotNull(action21);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type22.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNotNull(action23);
        org.junit.Assert.assertNull(logicalType24);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3535");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.generic.GenericData genericData20 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing21 = new org.apache.avro.C2Resolver.DoNothing(schema18, schema19, genericData20);
        org.apache.avro.C2Resolver.Container container22 = new org.apache.avro.C2Resolver.Container(schema15, schema16, genericData17, (org.apache.avro.C2Resolver.Action) doNothing21);
        org.apache.avro.Conversion<?> wildcardConversion23 = doNothing21.conversion;
        org.apache.avro.Conversion<?> wildcardConversion24 = doNothing21.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion25 = new org.apache.avro.C2Resolver.ReaderUnion(schema11, schema12, genericData13, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing21);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion26 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, 35, (org.apache.avro.C2Resolver.Action) readerUnion25);
        org.apache.avro.LogicalType logicalType27 = readerUnion26.logicalType;
        org.apache.avro.Conversion<?> wildcardConversion28 = readerUnion26.conversion;
        org.apache.avro.C2Resolver.Action action29 = readerUnion26.actualAction;
        org.apache.avro.C2Resolver.Container container30 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) readerUnion26);
        org.apache.avro.C2Resolver.Action action31 = container30.elementAction;
        org.apache.avro.Schema schema32 = container30.writer;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion33 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 0, (org.apache.avro.C2Resolver.Action) container30);
        org.junit.Assert.assertNull(wildcardConversion23);
        org.junit.Assert.assertNull(wildcardConversion24);
        org.junit.Assert.assertNull(logicalType27);
        org.junit.Assert.assertNull(wildcardConversion28);
        org.junit.Assert.assertNotNull(action29);
        org.junit.Assert.assertNotNull(action31);
        org.junit.Assert.assertNull(schema32);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3536");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.generic.GenericData genericData15 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing16 = new org.apache.avro.C2Resolver.DoNothing(schema13, schema14, genericData15);
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema10, schema11, genericData12, (org.apache.avro.C2Resolver.Action) doNothing16);
        org.apache.avro.C2Resolver.Container container18 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing16);
        org.apache.avro.C2Resolver.Action.Type type19 = container18.type;
        org.apache.avro.LogicalType logicalType20 = container18.logicalType;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion21 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, (int) (short) 1, (org.apache.avro.C2Resolver.Action) container18);
        org.apache.avro.C2Resolver.Container container22 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) container18);
        org.apache.avro.Conversion<?> wildcardConversion23 = container22.conversion;
        org.apache.avro.Schema schema24 = container22.reader;
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type19.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNull(logicalType20);
        org.junit.Assert.assertNull(wildcardConversion23);
        org.junit.Assert.assertNull(schema24);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3537");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.C2Resolver.Action.Type type12 = container11.type;
        org.apache.avro.C2Resolver.Action.Type type13 = container11.type;
        org.apache.avro.C2Resolver.Action action14 = container11.elementAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion15 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 1, action14);
        org.apache.avro.Conversion<?> wildcardConversion16 = action14.conversion;
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type12.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type13.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNotNull(action14);
        org.junit.Assert.assertNull(wildcardConversion16);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3538");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType11 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction12 = new org.apache.avro.C2Resolver.ErrorAction(schema8, schema9, genericData10, errorType11);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion13 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (short) 0, (org.apache.avro.C2Resolver.Action) errorAction12);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion14 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (byte) -1, (org.apache.avro.C2Resolver.Action) errorAction12);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = errorAction12.error;
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType11.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3539");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType12);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction15 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType14);
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType14);
        org.apache.avro.C2Resolver.ErrorAction errorAction17 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType14);
        org.apache.avro.LogicalType logicalType18 = errorAction17.logicalType;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType19 = errorAction17.error;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = errorAction17.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(logicalType18);
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType19.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3540");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.Action action11 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion12 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, (int) ' ', action11);
        org.apache.avro.C2Resolver.Container container13 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, action11);
        org.apache.avro.Schema schema14 = container13.writer;
        org.apache.avro.C2Resolver.Action action15 = container13.elementAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion16 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 10, (org.apache.avro.C2Resolver.Action) container13);
        org.apache.avro.C2Resolver.Action action17 = readerUnion16.actualAction;
        java.lang.Class<?> wildcardClass18 = readerUnion16.getClass();
        org.junit.Assert.assertNull(schema14);
        org.junit.Assert.assertNull(action15);
        org.junit.Assert.assertNotNull(action17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3541");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing9 = new org.apache.avro.C2Resolver.DoNothing(schema6, schema7, genericData8);
        org.apache.avro.C2Resolver.Container container10 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) doNothing9);
        org.apache.avro.C2Resolver.Action action11 = container10.elementAction;
        org.apache.avro.Conversion<?> wildcardConversion12 = container10.conversion;
        org.apache.avro.C2Resolver.Action action13 = container10.elementAction;
        org.apache.avro.C2Resolver.Action action14 = container10.elementAction;
        org.apache.avro.Conversion<?> wildcardConversion15 = container10.conversion;
        org.apache.avro.C2Resolver.Action action16 = container10.elementAction;
        org.apache.avro.Conversion<?> wildcardConversion17 = container10.conversion;
        org.apache.avro.C2Resolver.Action.Type type18 = container10.type;
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) container10);
        org.junit.Assert.assertNotNull(action11);
        org.junit.Assert.assertNull(wildcardConversion12);
        org.junit.Assert.assertNotNull(action13);
        org.junit.Assert.assertNotNull(action14);
        org.junit.Assert.assertNull(wildcardConversion15);
        org.junit.Assert.assertNotNull(action16);
        org.junit.Assert.assertNull(wildcardConversion17);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type18.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3542");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion12 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 35, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.Schema schema13 = readerUnion12.reader;
        int int14 = readerUnion12.firstMatch;
        org.apache.avro.C2Resolver.Action.Type type15 = readerUnion12.type;
        org.apache.avro.C2Resolver.Action action16 = readerUnion12.actualAction;
        org.apache.avro.C2Resolver.Action.Type type17 = readerUnion12.type;
        org.apache.avro.LogicalType logicalType18 = readerUnion12.logicalType;
        org.apache.avro.C2Resolver.Action action19 = readerUnion12.actualAction;
        org.junit.Assert.assertNull(schema13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type15.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertNotNull(action16);
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type17.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertNull(logicalType18);
        org.junit.Assert.assertNotNull(action19);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3543");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType3 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction4 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType3);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType5 = errorAction4.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType6 = errorAction4.error;
        org.apache.avro.Conversion<?> wildcardConversion7 = errorAction4.conversion;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType8 = errorAction4.error;
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType3.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType5.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType6.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(wildcardConversion7);
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType8.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3544");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.Schema schema15 = container14.writer;
        org.apache.avro.C2Resolver.Action action16 = container14.elementAction;
        org.apache.avro.Schema schema17 = container14.writer;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, (int) 'a', (org.apache.avro.C2Resolver.Action) container14);
        org.apache.avro.C2Resolver.Action action19 = container14.elementAction;
        org.apache.avro.C2Resolver.Container container20 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) container14);
        org.apache.avro.C2Resolver.Action action21 = container14.elementAction;
        org.junit.Assert.assertNull(schema15);
        org.junit.Assert.assertNotNull(action16);
        org.junit.Assert.assertNull(schema17);
        org.junit.Assert.assertNotNull(action19);
        org.junit.Assert.assertNotNull(action21);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3545");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType18 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction19 = new org.apache.avro.C2Resolver.ErrorAction(schema15, schema16, genericData17, errorType18);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType20 = errorAction19.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction21 = new org.apache.avro.C2Resolver.ErrorAction(schema12, schema13, genericData14, errorType20);
        org.apache.avro.C2Resolver.ErrorAction errorAction22 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType20);
        org.apache.avro.LogicalType logicalType23 = errorAction22.logicalType;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType24 = errorAction22.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType25 = errorAction22.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction26 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType25);
        org.apache.avro.C2Resolver.ErrorAction errorAction27 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType25);
        org.apache.avro.C2Resolver.Container container28 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) errorAction27);
        org.apache.avro.Schema schema29 = errorAction27.writer;
        java.lang.Class<?> wildcardClass30 = errorAction27.getClass();
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType18.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType20.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(logicalType23);
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType24.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType25.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(schema29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3546");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.generic.GenericData genericData16 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing17 = new org.apache.avro.C2Resolver.DoNothing(schema14, schema15, genericData16);
        org.apache.avro.C2Resolver.Container container18 = new org.apache.avro.C2Resolver.Container(schema11, schema12, genericData13, (org.apache.avro.C2Resolver.Action) doNothing17);
        org.apache.avro.C2Resolver.Action action19 = container18.elementAction;
        org.apache.avro.LogicalType logicalType20 = action19.logicalType;
        org.apache.avro.C2Resolver.Container container21 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, action19);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (short) 100, (org.apache.avro.C2Resolver.Action) container21);
        org.apache.avro.C2Resolver.Action action23 = readerUnion22.actualAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion24 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 1, (org.apache.avro.C2Resolver.Action) readerUnion22);
        org.junit.Assert.assertNotNull(action19);
        org.junit.Assert.assertNull(logicalType20);
        org.junit.Assert.assertNotNull(action23);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3547");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.generic.GenericData genericData15 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing16 = new org.apache.avro.C2Resolver.DoNothing(schema13, schema14, genericData15);
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema10, schema11, genericData12, (org.apache.avro.C2Resolver.Action) doNothing16);
        org.apache.avro.C2Resolver.Container container18 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing16);
        org.apache.avro.Schema schema19 = container18.writer;
        org.apache.avro.C2Resolver.Container container20 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) container18);
        org.apache.avro.C2Resolver.Action action21 = container20.elementAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 1, action21);
        org.apache.avro.C2Resolver.Action.Type type23 = readerUnion22.type;
        org.apache.avro.C2Resolver.Action action24 = readerUnion22.actualAction;
        org.apache.avro.C2Resolver.Action action25 = readerUnion22.actualAction;
        org.apache.avro.LogicalType logicalType26 = readerUnion22.logicalType;
        org.apache.avro.LogicalType logicalType27 = readerUnion22.logicalType;
        org.apache.avro.Schema schema28 = readerUnion22.reader;
        org.junit.Assert.assertNull(schema19);
        org.junit.Assert.assertNotNull(action21);
        org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type23.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertNotNull(action24);
        org.junit.Assert.assertNotNull(action25);
        org.junit.Assert.assertNull(logicalType26);
        org.junit.Assert.assertNull(logicalType27);
        org.junit.Assert.assertNull(schema28);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3548");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing11 = new org.apache.avro.C2Resolver.DoNothing(schema8, schema9, genericData10);
        org.apache.avro.LogicalType logicalType12 = doNothing11.logicalType;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion13 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (short) 10, (org.apache.avro.C2Resolver.Action) doNothing11);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion14 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 1, (org.apache.avro.C2Resolver.Action) readerUnion13);
        int int15 = readerUnion13.firstMatch;
        org.apache.avro.C2Resolver.Action action16 = readerUnion13.actualAction;
        org.junit.Assert.assertNull(logicalType12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(action16);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3549");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing14 = new org.apache.avro.C2Resolver.DoNothing(schema11, schema12, genericData13);
        org.apache.avro.C2Resolver.Container container15 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.Conversion<?> wildcardConversion16 = doNothing14.conversion;
        org.apache.avro.Conversion<?> wildcardConversion17 = doNothing14.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion19 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 35, (org.apache.avro.C2Resolver.Action) readerUnion18);
        org.apache.avro.LogicalType logicalType20 = readerUnion19.logicalType;
        org.apache.avro.Conversion<?> wildcardConversion21 = readerUnion19.conversion;
        org.apache.avro.C2Resolver.Action action22 = readerUnion19.actualAction;
        org.apache.avro.C2Resolver.Action action23 = readerUnion19.actualAction;
        org.apache.avro.LogicalType logicalType24 = action23.logicalType;
        org.junit.Assert.assertNull(wildcardConversion16);
        org.junit.Assert.assertNull(wildcardConversion17);
        org.junit.Assert.assertNull(logicalType20);
        org.junit.Assert.assertNull(wildcardConversion21);
        org.junit.Assert.assertNotNull(action22);
        org.junit.Assert.assertNotNull(action23);
        org.junit.Assert.assertNull(logicalType24);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3550");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.generic.GenericData genericData20 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing21 = new org.apache.avro.C2Resolver.DoNothing(schema18, schema19, genericData20);
        org.apache.avro.C2Resolver.Container container22 = new org.apache.avro.C2Resolver.Container(schema15, schema16, genericData17, (org.apache.avro.C2Resolver.Action) doNothing21);
        org.apache.avro.Conversion<?> wildcardConversion23 = doNothing21.conversion;
        org.apache.avro.Conversion<?> wildcardConversion24 = doNothing21.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion25 = new org.apache.avro.C2Resolver.ReaderUnion(schema11, schema12, genericData13, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing21);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion26 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, 35, (org.apache.avro.C2Resolver.Action) readerUnion25);
        org.apache.avro.LogicalType logicalType27 = readerUnion26.logicalType;
        org.apache.avro.Conversion<?> wildcardConversion28 = readerUnion26.conversion;
        org.apache.avro.C2Resolver.Action action29 = readerUnion26.actualAction;
        org.apache.avro.C2Resolver.Container container30 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, action29);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion31 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) '4', (org.apache.avro.C2Resolver.Action) container30);
        int int32 = readerUnion31.firstMatch;
        org.junit.Assert.assertNull(wildcardConversion23);
        org.junit.Assert.assertNull(wildcardConversion24);
        org.junit.Assert.assertNull(logicalType27);
        org.junit.Assert.assertNull(wildcardConversion28);
        org.junit.Assert.assertNotNull(action29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3551");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction10 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType9);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType11 = errorAction10.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction12 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType11);
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType11);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = errorAction13.error;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = errorAction13.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType9.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType11.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3552");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.generic.GenericData genericData15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.Schema schema17 = null;
        org.apache.avro.generic.GenericData genericData18 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.Schema schema20 = null;
        org.apache.avro.generic.GenericData genericData21 = null;
        org.apache.avro.Schema schema22 = null;
        org.apache.avro.Schema schema23 = null;
        org.apache.avro.generic.GenericData genericData24 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType25 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction26 = new org.apache.avro.C2Resolver.ErrorAction(schema22, schema23, genericData24, errorType25);
        org.apache.avro.C2Resolver.Container container27 = new org.apache.avro.C2Resolver.Container(schema19, schema20, genericData21, (org.apache.avro.C2Resolver.Action) errorAction26);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType28 = errorAction26.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction29 = new org.apache.avro.C2Resolver.ErrorAction(schema16, schema17, genericData18, errorType28);
        org.apache.avro.C2Resolver.ErrorAction errorAction30 = new org.apache.avro.C2Resolver.ErrorAction(schema13, schema14, genericData15, errorType28);
        org.apache.avro.C2Resolver.ErrorAction errorAction31 = new org.apache.avro.C2Resolver.ErrorAction(schema10, schema11, genericData12, errorType28);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType32 = errorAction31.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction33 = new org.apache.avro.C2Resolver.ErrorAction(schema7, schema8, genericData9, errorType32);
        org.apache.avro.C2Resolver.ErrorAction errorAction34 = new org.apache.avro.C2Resolver.ErrorAction(schema4, schema5, genericData6, errorType32);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion35 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) '4', (org.apache.avro.C2Resolver.Action) errorAction34);
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType25.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType28 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType28.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType32 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType32.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3553");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.Conversion<?> wildcardConversion12 = container11.conversion;
        org.apache.avro.C2Resolver.Action action13 = container11.elementAction;
        org.apache.avro.LogicalType logicalType14 = container11.logicalType;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion15 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 0, (org.apache.avro.C2Resolver.Action) container11);
        org.apache.avro.C2Resolver.Action.Type type16 = container11.type;
        org.apache.avro.C2Resolver.Action action17 = container11.elementAction;
        org.junit.Assert.assertNull(wildcardConversion12);
        org.junit.Assert.assertNotNull(action13);
        org.junit.Assert.assertNull(logicalType14);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type16.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNotNull(action17);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3554");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.generic.GenericData genericData15 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing16 = new org.apache.avro.C2Resolver.DoNothing(schema13, schema14, genericData15);
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema10, schema11, genericData12, (org.apache.avro.C2Resolver.Action) doNothing16);
        org.apache.avro.Conversion<?> wildcardConversion18 = doNothing16.conversion;
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing16);
        org.apache.avro.C2Resolver.Action action20 = container19.elementAction;
        org.apache.avro.C2Resolver.Container container21 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) container19);
        org.apache.avro.Conversion<?> wildcardConversion22 = container19.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion23 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 100, (org.apache.avro.C2Resolver.Action) container19);
        org.apache.avro.C2Resolver.Action action24 = container19.elementAction;
        org.junit.Assert.assertNull(wildcardConversion18);
        org.junit.Assert.assertNotNull(action20);
        org.junit.Assert.assertNull(wildcardConversion22);
        org.junit.Assert.assertNotNull(action24);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3555");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.generic.GenericData genericData20 = null;
        org.apache.avro.Schema schema21 = null;
        org.apache.avro.Schema schema22 = null;
        org.apache.avro.generic.GenericData genericData23 = null;
        org.apache.avro.Schema schema24 = null;
        org.apache.avro.Schema schema25 = null;
        org.apache.avro.generic.GenericData genericData26 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType27 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction28 = new org.apache.avro.C2Resolver.ErrorAction(schema24, schema25, genericData26, errorType27);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType29 = errorAction28.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction30 = new org.apache.avro.C2Resolver.ErrorAction(schema21, schema22, genericData23, errorType29);
        org.apache.avro.C2Resolver.ErrorAction errorAction31 = new org.apache.avro.C2Resolver.ErrorAction(schema18, schema19, genericData20, errorType29);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType32 = errorAction31.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction33 = new org.apache.avro.C2Resolver.ErrorAction(schema15, schema16, genericData17, errorType32);
        org.apache.avro.C2Resolver.ErrorAction errorAction34 = new org.apache.avro.C2Resolver.ErrorAction(schema12, schema13, genericData14, errorType32);
        org.apache.avro.C2Resolver.ErrorAction errorAction35 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType32);
        org.apache.avro.C2Resolver.ErrorAction errorAction36 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType32);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType37 = errorAction36.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType38 = errorAction36.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction39 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType38);
        org.apache.avro.C2Resolver.ErrorAction errorAction40 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType38);
        org.junit.Assert.assertTrue("'" + errorType27 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType27.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType29 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType29.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType32 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType32.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType37 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType37.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType38 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType38.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3556");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType7 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction8 = new org.apache.avro.C2Resolver.ErrorAction(schema4, schema5, genericData6, errorType7);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = errorAction8.error;
        org.apache.avro.C2Resolver.Action.Type type10 = errorAction8.type;
        org.apache.avro.C2Resolver.Action.Type type11 = errorAction8.type;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion12 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 35, (org.apache.avro.C2Resolver.Action) errorAction8);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType13 = errorAction8.error;
        org.apache.avro.Conversion<?> wildcardConversion14 = errorAction8.conversion;
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType7.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType9.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type10.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type11.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType13.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertNull(wildcardConversion14);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3557");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.generic.GenericData genericData16 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing17 = new org.apache.avro.C2Resolver.DoNothing(schema14, schema15, genericData16);
        org.apache.avro.C2Resolver.Container container18 = new org.apache.avro.C2Resolver.Container(schema11, schema12, genericData13, (org.apache.avro.C2Resolver.Action) doNothing17);
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, (org.apache.avro.C2Resolver.Action) doNothing17);
        org.apache.avro.C2Resolver.Action.Type type20 = container19.type;
        org.apache.avro.LogicalType logicalType21 = container19.logicalType;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (short) 1, (org.apache.avro.C2Resolver.Action) container19);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion23 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) ' ', (org.apache.avro.C2Resolver.Action) container19);
        org.apache.avro.Schema schema24 = container19.reader;
        org.apache.avro.Schema schema25 = container19.writer;
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type20.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNull(logicalType21);
        org.junit.Assert.assertNull(schema24);
        org.junit.Assert.assertNull(schema25);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3558");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.Conversion<?> wildcardConversion15 = doNothing13.conversion;
        org.apache.avro.Conversion<?> wildcardConversion16 = doNothing13.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion17 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.LogicalType logicalType18 = readerUnion17.logicalType;
        org.apache.avro.C2Resolver.Action action19 = readerUnion17.actualAction;
        org.apache.avro.C2Resolver.Container container20 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion17);
        org.apache.avro.Conversion<?> wildcardConversion21 = readerUnion17.conversion;
        org.apache.avro.C2Resolver.Action.Type type22 = readerUnion17.type;
        org.apache.avro.C2Resolver.Action action23 = readerUnion17.actualAction;
        org.apache.avro.LogicalType logicalType24 = readerUnion17.logicalType;
        org.apache.avro.LogicalType logicalType25 = readerUnion17.logicalType;
        org.junit.Assert.assertNull(wildcardConversion15);
        org.junit.Assert.assertNull(wildcardConversion16);
        org.junit.Assert.assertNull(logicalType18);
        org.junit.Assert.assertNotNull(action19);
        org.junit.Assert.assertNull(wildcardConversion21);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type22.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertNotNull(action23);
        org.junit.Assert.assertNull(logicalType24);
        org.junit.Assert.assertNull(logicalType25);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3559");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.Action action15 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion16 = new org.apache.avro.C2Resolver.ReaderUnion(schema11, schema12, genericData13, (int) ' ', action15);
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, action15);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) '4', (org.apache.avro.C2Resolver.Action) container17);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion19 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (byte) 10, (org.apache.avro.C2Resolver.Action) readerUnion18);
        org.apache.avro.Schema schema20 = readerUnion19.writer;
        org.apache.avro.Schema schema21 = readerUnion19.reader;
        int int22 = readerUnion19.firstMatch;
        org.apache.avro.Schema schema23 = readerUnion19.reader;
        int int24 = readerUnion19.firstMatch;
        org.junit.Assert.assertNull(schema20);
        org.junit.Assert.assertNull(schema21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNull(schema23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3560");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion15 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, 35, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.Schema schema16 = readerUnion15.reader;
        int int17 = readerUnion15.firstMatch;
        org.apache.avro.C2Resolver.Container container18 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion15);
        org.apache.avro.C2Resolver.Action action19 = container18.elementAction;
        org.apache.avro.Conversion<?> wildcardConversion20 = container18.conversion;
        org.junit.Assert.assertNull(schema16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(action19);
        org.junit.Assert.assertNull(wildcardConversion20);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3561");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion15 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, 35, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.Schema schema16 = readerUnion15.reader;
        int int17 = readerUnion15.firstMatch;
        org.apache.avro.C2Resolver.Action action18 = readerUnion15.actualAction;
        org.apache.avro.C2Resolver.Action action19 = readerUnion15.actualAction;
        org.apache.avro.C2Resolver.Container container20 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion15);
        int int21 = readerUnion15.firstMatch;
        int int22 = readerUnion15.firstMatch;
        org.apache.avro.Schema schema23 = readerUnion15.reader;
        org.apache.avro.C2Resolver.Action action24 = readerUnion15.actualAction;
        org.junit.Assert.assertNull(schema16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(action18);
        org.junit.Assert.assertNotNull(action19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNull(schema23);
        org.junit.Assert.assertNotNull(action24);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3562");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.generic.GenericData genericData16 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing17 = new org.apache.avro.C2Resolver.DoNothing(schema14, schema15, genericData16);
        org.apache.avro.C2Resolver.Container container18 = new org.apache.avro.C2Resolver.Container(schema11, schema12, genericData13, (org.apache.avro.C2Resolver.Action) doNothing17);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion19 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, 100, (org.apache.avro.C2Resolver.Action) container18);
        org.apache.avro.C2Resolver.Container container20 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) readerUnion19);
        int int21 = readerUnion19.firstMatch;
        org.apache.avro.Schema schema22 = readerUnion19.reader;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion23 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 35, (org.apache.avro.C2Resolver.Action) readerUnion19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNull(schema22);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3563");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing7 = new org.apache.avro.C2Resolver.DoNothing(schema4, schema5, genericData6);
        org.apache.avro.Schema schema8 = doNothing7.reader;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion9 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 1, (org.apache.avro.C2Resolver.Action) doNothing7);
        int int10 = readerUnion9.firstMatch;
        org.apache.avro.C2Resolver.Action action11 = readerUnion9.actualAction;
        org.apache.avro.C2Resolver.Action action12 = readerUnion9.actualAction;
        org.apache.avro.Conversion<?> wildcardConversion13 = readerUnion9.conversion;
        org.junit.Assert.assertNull(schema8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(action11);
        org.junit.Assert.assertNotNull(action12);
        org.junit.Assert.assertNull(wildcardConversion13);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3564");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType12);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType15);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction16.error;
        org.apache.avro.Schema schema18 = errorAction16.reader;
        org.apache.avro.C2Resolver.Action.Type type19 = errorAction16.type;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType20 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType21 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction22 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType21);
        org.apache.avro.C2Resolver.ErrorAction errorAction23 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType21);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType24 = errorAction23.error;
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type19.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType20.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType21.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType24.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3565");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.Schema schema11 = doNothing10.reader;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion12 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, 1, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.LogicalType logicalType13 = readerUnion12.logicalType;
        int int14 = readerUnion12.firstMatch;
        org.apache.avro.C2Resolver.Action.Type type15 = readerUnion12.type;
        org.apache.avro.C2Resolver.Action.Type type16 = readerUnion12.type;
        org.apache.avro.C2Resolver.Action.Type type17 = readerUnion12.type;
        org.apache.avro.C2Resolver.Container container18 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion12);
        org.apache.avro.Schema schema19 = readerUnion12.reader;
        org.junit.Assert.assertNull(schema11);
        org.junit.Assert.assertNull(logicalType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type15.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type16.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type17.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertNull(schema19);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3566");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.Conversion<?> wildcardConversion12 = doNothing10.conversion;
        org.apache.avro.Conversion<?> wildcardConversion13 = doNothing10.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion14 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.Schema schema15 = readerUnion14.reader;
        org.apache.avro.Conversion<?> wildcardConversion16 = readerUnion14.conversion;
        int int17 = readerUnion14.firstMatch;
        org.apache.avro.C2Resolver.Action action18 = readerUnion14.actualAction;
        org.junit.Assert.assertNull(wildcardConversion12);
        org.junit.Assert.assertNull(wildcardConversion13);
        org.junit.Assert.assertNull(schema15);
        org.junit.Assert.assertNull(wildcardConversion16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(action18);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3567");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing9 = new org.apache.avro.C2Resolver.DoNothing(schema6, schema7, genericData8);
        org.apache.avro.C2Resolver.Container container10 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) doNothing9);
        org.apache.avro.C2Resolver.Action action11 = container10.elementAction;
        org.apache.avro.Conversion<?> wildcardConversion12 = container10.conversion;
        org.apache.avro.C2Resolver.Action action13 = container10.elementAction;
        org.apache.avro.C2Resolver.Action action14 = container10.elementAction;
        org.apache.avro.Conversion<?> wildcardConversion15 = container10.conversion;
        org.apache.avro.LogicalType logicalType16 = container10.logicalType;
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) container10);
        org.apache.avro.C2Resolver.Action action18 = container17.elementAction;
        org.apache.avro.Schema schema19 = action18.writer;
        org.apache.avro.LogicalType logicalType20 = action18.logicalType;
        org.junit.Assert.assertNotNull(action11);
        org.junit.Assert.assertNull(wildcardConversion12);
        org.junit.Assert.assertNotNull(action13);
        org.junit.Assert.assertNotNull(action14);
        org.junit.Assert.assertNull(wildcardConversion15);
        org.junit.Assert.assertNull(logicalType16);
        org.junit.Assert.assertNotNull(action18);
        org.junit.Assert.assertNull(schema19);
        org.junit.Assert.assertNull(logicalType20);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3568");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.C2Resolver.Action.Type type15 = container14.type;
        org.apache.avro.C2Resolver.Container container16 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) container14);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion17 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 0, (org.apache.avro.C2Resolver.Action) container16);
        org.apache.avro.C2Resolver.Action action18 = readerUnion17.actualAction;
        org.apache.avro.LogicalType logicalType19 = readerUnion17.logicalType;
        org.apache.avro.C2Resolver.Action action20 = readerUnion17.actualAction;
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type15.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNotNull(action18);
        org.junit.Assert.assertNull(logicalType19);
        org.junit.Assert.assertNotNull(action20);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3569");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.Conversion<?> wildcardConversion12 = container11.conversion;
        org.apache.avro.C2Resolver.Action action13 = container11.elementAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion14 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 10, action13);
        org.apache.avro.Schema schema15 = action13.reader;
        org.junit.Assert.assertNull(wildcardConversion12);
        org.junit.Assert.assertNotNull(action13);
        org.junit.Assert.assertNull(schema15);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3570");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema12, schema13, genericData14, errorType15);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction16.error;
        org.apache.avro.C2Resolver.Action.Type type18 = errorAction16.type;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType19 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType20 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction21 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType20);
        org.apache.avro.C2Resolver.ErrorAction errorAction22 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType20);
        org.apache.avro.C2Resolver.ErrorAction errorAction23 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType20);
        org.apache.avro.C2Resolver.ErrorAction errorAction24 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = errorAction24.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type18.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType19.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType20.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3571");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing14 = new org.apache.avro.C2Resolver.DoNothing(schema11, schema12, genericData13);
        org.apache.avro.C2Resolver.Container container15 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.Conversion<?> wildcardConversion16 = doNothing14.conversion;
        org.apache.avro.Conversion<?> wildcardConversion17 = doNothing14.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion19 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 35, (org.apache.avro.C2Resolver.Action) readerUnion18);
        org.apache.avro.C2Resolver.Action action20 = readerUnion18.actualAction;
        org.apache.avro.Conversion<?> wildcardConversion21 = readerUnion18.conversion;
        org.apache.avro.C2Resolver.Action action22 = readerUnion18.actualAction;
        org.apache.avro.LogicalType logicalType23 = readerUnion18.logicalType;
        org.apache.avro.Schema schema24 = readerUnion18.reader;
        org.junit.Assert.assertNull(wildcardConversion16);
        org.junit.Assert.assertNull(wildcardConversion17);
        org.junit.Assert.assertNotNull(action20);
        org.junit.Assert.assertNull(wildcardConversion21);
        org.junit.Assert.assertNotNull(action22);
        org.junit.Assert.assertNull(logicalType23);
        org.junit.Assert.assertNull(schema24);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3572");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction10 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType9);
        org.apache.avro.C2Resolver.ErrorAction errorAction11 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType9);
        org.apache.avro.C2Resolver.ErrorAction errorAction12 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType9);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType13 = errorAction12.error;
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType9.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType13.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3573");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing18 = new org.apache.avro.C2Resolver.DoNothing(schema15, schema16, genericData17);
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema12, schema13, genericData14, (org.apache.avro.C2Resolver.Action) doNothing18);
        org.apache.avro.Conversion<?> wildcardConversion20 = doNothing18.conversion;
        org.apache.avro.Conversion<?> wildcardConversion21 = doNothing18.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing18);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion23 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, 35, (org.apache.avro.C2Resolver.Action) readerUnion22);
        int int24 = readerUnion22.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion25 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (-1), (org.apache.avro.C2Resolver.Action) readerUnion22);
        org.apache.avro.C2Resolver.Action action26 = readerUnion25.actualAction;
        org.apache.avro.C2Resolver.Action action27 = readerUnion25.actualAction;
        org.junit.Assert.assertNull(wildcardConversion20);
        org.junit.Assert.assertNull(wildcardConversion21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(action26);
        org.junit.Assert.assertNotNull(action27);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3574");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType6 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction7 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType6);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType8 = errorAction7.error;
        org.apache.avro.C2Resolver.Action.Type type9 = errorAction7.type;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType10 = errorAction7.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType11 = errorAction7.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = errorAction7.error;
        org.apache.avro.C2Resolver.Container container13 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) errorAction7);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction7.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = errorAction7.error;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = errorAction7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType6.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType8.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type9.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType10.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType11.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3575");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.Action action11 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion12 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, (int) ' ', action11);
        org.apache.avro.C2Resolver.Container container13 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, action11);
        org.apache.avro.Schema schema14 = container13.writer;
        org.apache.avro.C2Resolver.Action action15 = container13.elementAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion16 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 10, (org.apache.avro.C2Resolver.Action) container13);
        org.apache.avro.C2Resolver.Action action17 = readerUnion16.actualAction;
        int int18 = readerUnion16.firstMatch;
        org.apache.avro.C2Resolver.Action action19 = readerUnion16.actualAction;
        org.junit.Assert.assertNull(schema14);
        org.junit.Assert.assertNull(action15);
        org.junit.Assert.assertNotNull(action17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(action19);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3576");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.Action action15 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion16 = new org.apache.avro.C2Resolver.ReaderUnion(schema11, schema12, genericData13, (int) ' ', action15);
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, action15);
        org.apache.avro.Schema schema18 = container17.writer;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion19 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (short) -1, (org.apache.avro.C2Resolver.Action) container17);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion20 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) '#', (org.apache.avro.C2Resolver.Action) readerUnion19);
        org.apache.avro.C2Resolver.Action action21 = readerUnion19.actualAction;
        org.apache.avro.C2Resolver.Action.Type type22 = action21.type;
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertNotNull(action21);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type22.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3577");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.C2Resolver.Action action3 = null;
        org.apache.avro.C2Resolver.Container container4 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, action3);
        org.apache.avro.Conversion<?> wildcardConversion5 = container4.conversion;
        org.apache.avro.Schema schema6 = container4.reader;
        org.apache.avro.C2Resolver.Action action7 = container4.elementAction;
        org.apache.avro.LogicalType logicalType8 = container4.logicalType;
        org.apache.avro.C2Resolver.Action action9 = container4.elementAction;
        org.apache.avro.C2Resolver.Action action10 = container4.elementAction;
        org.apache.avro.Schema schema11 = container4.writer;
        org.junit.Assert.assertNull(wildcardConversion5);
        org.junit.Assert.assertNull(schema6);
        org.junit.Assert.assertNull(action7);
        org.junit.Assert.assertNull(logicalType8);
        org.junit.Assert.assertNull(action9);
        org.junit.Assert.assertNull(action10);
        org.junit.Assert.assertNull(schema11);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3578");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.C2Resolver.Action.Type type12 = container11.type;
        org.apache.avro.C2Resolver.Action.Type type13 = container11.type;
        org.apache.avro.C2Resolver.Action action14 = container11.elementAction;
        org.apache.avro.LogicalType logicalType15 = container11.logicalType;
        org.apache.avro.C2Resolver.Action action16 = container11.elementAction;
        org.apache.avro.C2Resolver.Action action17 = container11.elementAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 32, action17);
        org.apache.avro.Schema schema19 = action17.reader;
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type12.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type13.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNotNull(action14);
        org.junit.Assert.assertNull(logicalType15);
        org.junit.Assert.assertNotNull(action16);
        org.junit.Assert.assertNotNull(action17);
        org.junit.Assert.assertNull(schema19);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3579");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.Schema schema17 = null;
        org.apache.avro.generic.GenericData genericData18 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.Schema schema20 = null;
        org.apache.avro.generic.GenericData genericData21 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing22 = new org.apache.avro.C2Resolver.DoNothing(schema19, schema20, genericData21);
        org.apache.avro.C2Resolver.Container container23 = new org.apache.avro.C2Resolver.Container(schema16, schema17, genericData18, (org.apache.avro.C2Resolver.Action) doNothing22);
        org.apache.avro.Conversion<?> wildcardConversion24 = doNothing22.conversion;
        org.apache.avro.Conversion<?> wildcardConversion25 = doNothing22.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion26 = new org.apache.avro.C2Resolver.ReaderUnion(schema12, schema13, genericData14, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing22);
        int int27 = readerUnion26.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion28 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, (int) (byte) -1, (org.apache.avro.C2Resolver.Action) readerUnion26);
        int int29 = readerUnion26.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion30 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (short) 1, (org.apache.avro.C2Resolver.Action) readerUnion26);
        org.apache.avro.Schema schema31 = readerUnion26.reader;
        int int32 = readerUnion26.firstMatch;
        org.apache.avro.C2Resolver.Action action33 = readerUnion26.actualAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion34 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) -1, action33);
        org.apache.avro.Schema schema35 = readerUnion34.writer;
        org.apache.avro.LogicalType logicalType36 = readerUnion34.logicalType;
        org.junit.Assert.assertNull(wildcardConversion24);
        org.junit.Assert.assertNull(wildcardConversion25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertNull(schema31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNotNull(action33);
        org.junit.Assert.assertNull(schema35);
        org.junit.Assert.assertNull(logicalType36);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3580");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType3 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction4 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType3);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType5 = errorAction4.error;
        org.apache.avro.LogicalType logicalType6 = errorAction4.logicalType;
        org.apache.avro.Conversion<?> wildcardConversion7 = errorAction4.conversion;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = errorAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType3.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType5.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(logicalType6);
        org.junit.Assert.assertNull(wildcardConversion7);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3581");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.Action action11 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion12 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, (int) ' ', action11);
        org.apache.avro.C2Resolver.Container container13 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, action11);
        org.apache.avro.Schema schema14 = container13.writer;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion15 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) -1, (org.apache.avro.C2Resolver.Action) container13);
        org.apache.avro.C2Resolver.Action.Type type16 = container13.type;
        java.lang.Class<?> wildcardClass17 = container13.getClass();
        org.junit.Assert.assertNull(schema14);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type16.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3582");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.C2Resolver.Action action8 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion9 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) ' ', action8);
        int int10 = readerUnion9.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion11 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 0, (org.apache.avro.C2Resolver.Action) readerUnion9);
        org.apache.avro.C2Resolver.Action action12 = readerUnion9.actualAction;
        int int13 = readerUnion9.firstMatch;
        org.apache.avro.Schema schema14 = readerUnion9.writer;
        org.apache.avro.C2Resolver.Action action15 = readerUnion9.actualAction;
        org.apache.avro.C2Resolver.Action action16 = readerUnion9.actualAction;
        int int17 = readerUnion9.firstMatch;
        org.apache.avro.C2Resolver.Action.Type type18 = readerUnion9.type;
        org.apache.avro.LogicalType logicalType19 = readerUnion9.logicalType;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNull(action12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNull(schema14);
        org.junit.Assert.assertNull(action15);
        org.junit.Assert.assertNull(action16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type18.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertNull(logicalType19);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3583");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.Schema schema15 = container14.writer;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion16 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, (int) (short) 10, (org.apache.avro.C2Resolver.Action) container14);
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) container14);
        org.apache.avro.C2Resolver.Action action18 = container14.elementAction;
        org.apache.avro.Schema schema19 = container14.writer;
        org.apache.avro.C2Resolver.Action action20 = container14.elementAction;
        org.junit.Assert.assertNull(schema15);
        org.junit.Assert.assertNotNull(action18);
        org.junit.Assert.assertNull(schema19);
        org.junit.Assert.assertNotNull(action20);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3584");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.generic.GenericData genericData16 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing17 = new org.apache.avro.C2Resolver.DoNothing(schema14, schema15, genericData16);
        org.apache.avro.Schema schema18 = doNothing17.reader;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion19 = new org.apache.avro.C2Resolver.ReaderUnion(schema10, schema11, genericData12, 1, (org.apache.avro.C2Resolver.Action) doNothing17);
        org.apache.avro.LogicalType logicalType20 = readerUnion19.logicalType;
        org.apache.avro.C2Resolver.Container container21 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) readerUnion19);
        org.apache.avro.C2Resolver.Action action22 = container21.elementAction;
        org.apache.avro.C2Resolver.Container container23 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) container21);
        org.apache.avro.Schema schema24 = container23.writer;
        org.apache.avro.C2Resolver.Action action25 = container23.elementAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion26 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 35, action25);
        int int27 = readerUnion26.firstMatch;
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertNull(logicalType20);
        org.junit.Assert.assertNotNull(action22);
        org.junit.Assert.assertNull(schema24);
        org.junit.Assert.assertNotNull(action25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3585");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType12);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType15);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction16.error;
        org.apache.avro.Schema schema18 = errorAction16.reader;
        org.apache.avro.Schema schema19 = errorAction16.writer;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType20 = errorAction16.error;
        org.apache.avro.Schema schema21 = errorAction16.writer;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType22 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction23 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType22);
        org.apache.avro.C2Resolver.ErrorAction errorAction24 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType22);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType25 = errorAction24.error;
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertNull(schema19);
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType20.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(schema21);
        org.junit.Assert.assertTrue("'" + errorType22 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType22.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType25.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3586");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.C2Resolver.Action action6 = null;
        org.apache.avro.C2Resolver.Container container7 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, action6);
        org.apache.avro.Conversion<?> wildcardConversion8 = container7.conversion;
        org.apache.avro.C2Resolver.Action.Type type9 = container7.type;
        org.apache.avro.Conversion<?> wildcardConversion10 = container7.conversion;
        org.apache.avro.Schema schema11 = container7.reader;
        org.apache.avro.C2Resolver.Action.Type type12 = container7.type;
        org.apache.avro.C2Resolver.Container container13 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) container7);
        org.junit.Assert.assertNull(wildcardConversion8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type9.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNull(wildcardConversion10);
        org.junit.Assert.assertNull(schema11);
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type12.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3587");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType12);
        org.apache.avro.C2Resolver.ErrorAction errorAction14 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType12);
        org.apache.avro.Conversion<?> wildcardConversion15 = errorAction14.conversion;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType16 = errorAction14.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction17 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType16);
        org.apache.avro.C2Resolver.ErrorAction errorAction18 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType16);
        org.apache.avro.Conversion<?> wildcardConversion19 = errorAction18.conversion;
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertNull(wildcardConversion15);
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType16.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertNull(wildcardConversion19);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3588");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.Conversion<?> wildcardConversion15 = container14.conversion;
        org.apache.avro.C2Resolver.Action action16 = container14.elementAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion17 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, 10, action16);
        org.apache.avro.C2Resolver.Container container18 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion17);
        org.apache.avro.C2Resolver.Action action19 = container18.elementAction;
        org.apache.avro.C2Resolver.Action action20 = container18.elementAction;
        org.apache.avro.C2Resolver.Action action21 = container18.elementAction;
        org.apache.avro.C2Resolver.Action action22 = container18.elementAction;
        org.junit.Assert.assertNull(wildcardConversion15);
        org.junit.Assert.assertNotNull(action16);
        org.junit.Assert.assertNotNull(action19);
        org.junit.Assert.assertNotNull(action20);
        org.junit.Assert.assertNotNull(action21);
        org.junit.Assert.assertNotNull(action22);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3589");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing9 = new org.apache.avro.C2Resolver.DoNothing(schema6, schema7, genericData8);
        org.apache.avro.C2Resolver.Container container10 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) doNothing9);
        org.apache.avro.Conversion<?> wildcardConversion11 = container10.conversion;
        org.apache.avro.C2Resolver.Action action12 = container10.elementAction;
        org.apache.avro.C2Resolver.Container container13 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) container10);
        org.apache.avro.C2Resolver.Action action14 = container10.elementAction;
        java.lang.Class<?> wildcardClass15 = action14.getClass();
        org.junit.Assert.assertNull(wildcardConversion11);
        org.junit.Assert.assertNotNull(action12);
        org.junit.Assert.assertNotNull(action14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3590");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.C2Resolver.Action action16 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion17 = new org.apache.avro.C2Resolver.ReaderUnion(schema12, schema13, genericData14, (int) ' ', action16);
        int int18 = readerUnion17.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion19 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, 0, (org.apache.avro.C2Resolver.Action) readerUnion17);
        org.apache.avro.C2Resolver.Action action20 = readerUnion17.actualAction;
        int int21 = readerUnion17.firstMatch;
        org.apache.avro.LogicalType logicalType22 = readerUnion17.logicalType;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion23 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) '4', (org.apache.avro.C2Resolver.Action) readerUnion17);
        org.apache.avro.Schema schema24 = readerUnion23.reader;
        org.apache.avro.C2Resolver.Action action25 = readerUnion23.actualAction;
        int int26 = readerUnion23.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion27 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 1, (org.apache.avro.C2Resolver.Action) readerUnion23);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNull(action20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNull(logicalType22);
        org.junit.Assert.assertNull(schema24);
        org.junit.Assert.assertNotNull(action25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3591");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.C2Resolver.Action action4 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion5 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) ' ', action4);
        org.apache.avro.C2Resolver.Action.Type type6 = readerUnion5.type;
        org.apache.avro.LogicalType logicalType7 = readerUnion5.logicalType;
        org.apache.avro.Conversion<?> wildcardConversion8 = readerUnion5.conversion;
        org.apache.avro.Schema schema9 = readerUnion5.reader;
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type6.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertNull(logicalType7);
        org.junit.Assert.assertNull(wildcardConversion8);
        org.junit.Assert.assertNull(schema9);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3592");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.Conversion<?> wildcardConversion12 = doNothing10.conversion;
        org.apache.avro.Conversion<?> wildcardConversion13 = doNothing10.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion14 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.LogicalType logicalType15 = readerUnion14.logicalType;
        org.apache.avro.C2Resolver.Action action16 = readerUnion14.actualAction;
        org.apache.avro.C2Resolver.Action action17 = readerUnion14.actualAction;
        org.apache.avro.C2Resolver.Action action18 = readerUnion14.actualAction;
        org.apache.avro.Schema schema19 = readerUnion14.reader;
        org.apache.avro.Schema schema20 = readerUnion14.reader;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = schema20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardConversion12);
        org.junit.Assert.assertNull(wildcardConversion13);
        org.junit.Assert.assertNull(logicalType15);
        org.junit.Assert.assertNotNull(action16);
        org.junit.Assert.assertNotNull(action17);
        org.junit.Assert.assertNotNull(action18);
        org.junit.Assert.assertNull(schema19);
        org.junit.Assert.assertNull(schema20);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3593");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing14 = new org.apache.avro.C2Resolver.DoNothing(schema11, schema12, genericData13);
        org.apache.avro.C2Resolver.Container container15 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.Conversion<?> wildcardConversion16 = doNothing14.conversion;
        org.apache.avro.Conversion<?> wildcardConversion17 = doNothing14.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.LogicalType logicalType19 = readerUnion18.logicalType;
        org.apache.avro.C2Resolver.Action action20 = readerUnion18.actualAction;
        org.apache.avro.Schema schema21 = action20.reader;
        org.apache.avro.C2Resolver.Action.Type type22 = action20.type;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion23 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 100, action20);
        java.lang.Class<?> wildcardClass24 = readerUnion23.getClass();
        org.junit.Assert.assertNull(wildcardConversion16);
        org.junit.Assert.assertNull(wildcardConversion17);
        org.junit.Assert.assertNull(logicalType19);
        org.junit.Assert.assertNotNull(action20);
        org.junit.Assert.assertNull(schema21);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.avro.C2Resolver.Action.Type.DO_NOTHING + "'", type22.equals(org.apache.avro.C2Resolver.Action.Type.DO_NOTHING));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3594");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.Conversion<?> wildcardConversion15 = doNothing13.conversion;
        org.apache.avro.Schema schema16 = doNothing13.writer;
        org.apache.avro.Schema schema17 = doNothing13.reader;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, (int) (byte) 1, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.Conversion<?> wildcardConversion19 = doNothing13.conversion;
        org.apache.avro.C2Resolver.Container container20 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.C2Resolver.Action action21 = container20.elementAction;
        org.junit.Assert.assertNull(wildcardConversion15);
        org.junit.Assert.assertNull(schema16);
        org.junit.Assert.assertNull(schema17);
        org.junit.Assert.assertNull(wildcardConversion19);
        org.junit.Assert.assertNotNull(action21);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3595");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing12 = new org.apache.avro.C2Resolver.DoNothing(schema9, schema10, genericData11);
        org.apache.avro.C2Resolver.Container container13 = new org.apache.avro.C2Resolver.Container(schema6, schema7, genericData8, (org.apache.avro.C2Resolver.Action) doNothing12);
        org.apache.avro.Conversion<?> wildcardConversion14 = doNothing12.conversion;
        org.apache.avro.Schema schema15 = doNothing12.writer;
        org.apache.avro.C2Resolver.Container container16 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) doNothing12);
        org.apache.avro.Conversion<?> wildcardConversion17 = container16.conversion;
        org.apache.avro.C2Resolver.Container container18 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) container16);
        java.lang.Class<?> wildcardClass19 = container18.getClass();
        org.junit.Assert.assertNull(wildcardConversion14);
        org.junit.Assert.assertNull(schema15);
        org.junit.Assert.assertNull(wildcardConversion17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3596");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType12);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction15 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType14);
        org.apache.avro.C2Resolver.Container container16 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) errorAction15);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction15.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType18 = errorAction15.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction19 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType18);
        org.apache.avro.Conversion<?> wildcardConversion20 = errorAction19.conversion;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType21 = errorAction19.error;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = errorAction19.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType18.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(wildcardConversion20);
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType21.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3597");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.Action action15 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion16 = new org.apache.avro.C2Resolver.ReaderUnion(schema11, schema12, genericData13, (int) ' ', action15);
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, action15);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) '4', (org.apache.avro.C2Resolver.Action) container17);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion19 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 1, (org.apache.avro.C2Resolver.Action) container17);
        org.apache.avro.C2Resolver.Action action20 = readerUnion19.actualAction;
        int int21 = readerUnion19.firstMatch;
        org.apache.avro.C2Resolver.Action action22 = readerUnion19.actualAction;
        org.apache.avro.Schema schema23 = action22.writer;
        org.junit.Assert.assertNotNull(action20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(action22);
        org.junit.Assert.assertNull(schema23);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3598");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType12);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction15 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType14);
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType14);
        org.apache.avro.Schema schema17 = errorAction16.reader;
        org.apache.avro.C2Resolver.Action.Type type18 = errorAction16.type;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType19 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction20 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType19);
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(schema17);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type18.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType19.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3599");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.C2Resolver.Action action3 = null;
        org.apache.avro.C2Resolver.Container container4 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, action3);
        org.apache.avro.Conversion<?> wildcardConversion5 = container4.conversion;
        org.apache.avro.Schema schema6 = container4.reader;
        org.apache.avro.LogicalType logicalType7 = container4.logicalType;
        org.apache.avro.Schema schema8 = container4.writer;
        org.apache.avro.Conversion<?> wildcardConversion9 = container4.conversion;
        org.apache.avro.C2Resolver.Action action10 = container4.elementAction;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Conversion<?> wildcardConversion11 = action10.conversion;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardConversion5);
        org.junit.Assert.assertNull(schema6);
        org.junit.Assert.assertNull(logicalType7);
        org.junit.Assert.assertNull(schema8);
        org.junit.Assert.assertNull(wildcardConversion9);
        org.junit.Assert.assertNull(action10);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3600");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction10 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType9);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType11 = errorAction10.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction12 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType11);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType13 = errorAction12.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction12.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction15 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType14);
        java.lang.Class<?> wildcardClass16 = errorType14.getClass();
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType9.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType11.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType13.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3601");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType10 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction11 = new org.apache.avro.C2Resolver.ErrorAction(schema7, schema8, genericData9, errorType10);
        org.apache.avro.Schema schema12 = errorAction11.reader;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType13 = errorAction11.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction14 = new org.apache.avro.C2Resolver.ErrorAction(schema4, schema5, genericData6, errorType13);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion15 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (byte) 0, (org.apache.avro.C2Resolver.Action) errorAction14);
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType10.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertNull(schema12);
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType13.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3602");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction10 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType9);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType11 = errorAction10.error;
        org.apache.avro.C2Resolver.Action.Type type12 = errorAction10.type;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType13 = errorAction10.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction10.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = errorAction10.error;
        org.apache.avro.Conversion<?> wildcardConversion16 = errorAction10.conversion;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction10.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction18 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType17);
        org.apache.avro.C2Resolver.ErrorAction errorAction19 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType17);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType20 = errorAction19.error;
        org.apache.avro.C2Resolver.Action.Type type21 = errorAction19.type;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType22 = errorAction19.error;
        org.apache.avro.LogicalType logicalType23 = errorAction19.logicalType;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType24 = errorAction19.error;
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType9.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType11.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type12.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType13.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(wildcardConversion16);
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType20.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type21.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType22 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType22.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(logicalType23);
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType24.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3603");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.C2Resolver.Action action3 = null;
        org.apache.avro.C2Resolver.Container container4 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, action3);
        org.apache.avro.Conversion<?> wildcardConversion5 = container4.conversion;
        org.apache.avro.C2Resolver.Action action6 = container4.elementAction;
        org.apache.avro.C2Resolver.Action action7 = container4.elementAction;
        org.apache.avro.C2Resolver.Action action8 = container4.elementAction;
        org.apache.avro.Conversion<?> wildcardConversion9 = container4.conversion;
        org.apache.avro.Schema schema10 = container4.writer;
        org.apache.avro.Conversion<?> wildcardConversion11 = container4.conversion;
        org.junit.Assert.assertNull(wildcardConversion5);
        org.junit.Assert.assertNull(action6);
        org.junit.Assert.assertNull(action7);
        org.junit.Assert.assertNull(action8);
        org.junit.Assert.assertNull(wildcardConversion9);
        org.junit.Assert.assertNull(schema10);
        org.junit.Assert.assertNull(wildcardConversion11);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3604");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.C2Resolver.Action action4 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion5 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 100, action4);
        int int6 = readerUnion5.firstMatch;
        org.apache.avro.C2Resolver.Action action7 = readerUnion5.actualAction;
        org.apache.avro.C2Resolver.Action action8 = readerUnion5.actualAction;
        org.apache.avro.C2Resolver.Action action9 = readerUnion5.actualAction;
        int int10 = readerUnion5.firstMatch;
        org.apache.avro.Schema schema11 = readerUnion5.writer;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(action7);
        org.junit.Assert.assertNull(action8);
        org.junit.Assert.assertNull(action9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(schema11);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3605");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing11 = new org.apache.avro.C2Resolver.DoNothing(schema8, schema9, genericData10);
        org.apache.avro.LogicalType logicalType12 = doNothing11.logicalType;
        org.apache.avro.LogicalType logicalType13 = doNothing11.logicalType;
        org.apache.avro.LogicalType logicalType14 = doNothing11.logicalType;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion15 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (byte) 1, (org.apache.avro.C2Resolver.Action) doNothing11);
        org.apache.avro.Schema schema16 = readerUnion15.writer;
        int int17 = readerUnion15.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 100, (org.apache.avro.C2Resolver.Action) readerUnion15);
        org.apache.avro.C2Resolver.Action action19 = readerUnion18.actualAction;
        org.junit.Assert.assertNull(logicalType12);
        org.junit.Assert.assertNull(logicalType13);
        org.junit.Assert.assertNull(logicalType14);
        org.junit.Assert.assertNull(schema16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(action19);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3606");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing12 = new org.apache.avro.C2Resolver.DoNothing(schema9, schema10, genericData11);
        org.apache.avro.LogicalType logicalType13 = doNothing12.logicalType;
        org.apache.avro.Schema schema14 = doNothing12.writer;
        org.apache.avro.C2Resolver.Container container15 = new org.apache.avro.C2Resolver.Container(schema6, schema7, genericData8, (org.apache.avro.C2Resolver.Action) doNothing12);
        org.apache.avro.Schema schema16 = container15.writer;
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) container15);
        org.apache.avro.C2Resolver.Container container18 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) container15);
        org.junit.Assert.assertNull(logicalType13);
        org.junit.Assert.assertNull(schema14);
        org.junit.Assert.assertNull(schema16);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3607");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType12);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction13.error;
        org.apache.avro.C2Resolver.Action.Type type15 = errorAction13.type;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType16 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction18 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType17);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType19 = errorAction18.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction20 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType19);
        org.apache.avro.C2Resolver.ErrorAction errorAction21 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType19);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType22 = errorAction21.error;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = errorAction21.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type15.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType16.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType19.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType22 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType22.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3608");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType6 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction7 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType6);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType8 = errorAction7.error;
        org.apache.avro.C2Resolver.Action.Type type9 = errorAction7.type;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType10 = errorAction7.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction11 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType10);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = errorAction11.error;
        org.apache.avro.Schema schema13 = errorAction11.reader;
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType6.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType8.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type9.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType10.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(schema13);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3609");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema6, schema7, genericData8, (org.apache.avro.C2Resolver.Action) errorAction13);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType15);
        org.apache.avro.C2Resolver.ErrorAction errorAction17 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType15);
        org.apache.avro.Schema schema18 = errorAction17.reader;
        org.apache.avro.C2Resolver.Action.Type type19 = errorAction17.type;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType20 = errorAction17.error;
        java.lang.Class<?> wildcardClass21 = errorType20.getClass();
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type19.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType20.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3610");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.generic.GenericData genericData20 = null;
        org.apache.avro.Schema schema21 = null;
        org.apache.avro.Schema schema22 = null;
        org.apache.avro.generic.GenericData genericData23 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing24 = new org.apache.avro.C2Resolver.DoNothing(schema21, schema22, genericData23);
        org.apache.avro.C2Resolver.Container container25 = new org.apache.avro.C2Resolver.Container(schema18, schema19, genericData20, (org.apache.avro.C2Resolver.Action) doNothing24);
        org.apache.avro.C2Resolver.Action.Type type26 = container25.type;
        org.apache.avro.C2Resolver.Container container27 = new org.apache.avro.C2Resolver.Container(schema15, schema16, genericData17, (org.apache.avro.C2Resolver.Action) container25);
        org.apache.avro.C2Resolver.Container container28 = new org.apache.avro.C2Resolver.Container(schema12, schema13, genericData14, (org.apache.avro.C2Resolver.Action) container27);
        org.apache.avro.C2Resolver.Action action29 = container28.elementAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion30 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, (int) (byte) 1, action29);
        org.apache.avro.C2Resolver.Action action31 = readerUnion30.actualAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion32 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, 52, (org.apache.avro.C2Resolver.Action) readerUnion30);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion33 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) 'a', (org.apache.avro.C2Resolver.Action) readerUnion32);
        org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type26.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNotNull(action29);
        org.junit.Assert.assertNotNull(action31);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3611");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema12, schema13, genericData14, errorType15);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction16.error;
        org.apache.avro.LogicalType logicalType18 = errorAction16.logicalType;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType19 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction20 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType19);
        org.apache.avro.C2Resolver.ErrorAction errorAction21 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType19);
        org.apache.avro.C2Resolver.ErrorAction errorAction22 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType19);
        org.apache.avro.C2Resolver.ErrorAction errorAction23 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType19);
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(logicalType18);
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType19.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3612");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing11 = new org.apache.avro.C2Resolver.DoNothing(schema8, schema9, genericData10);
        org.apache.avro.LogicalType logicalType12 = doNothing11.logicalType;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion13 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (short) 10, (org.apache.avro.C2Resolver.Action) doNothing11);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion14 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 1, (org.apache.avro.C2Resolver.Action) readerUnion13);
        org.apache.avro.C2Resolver.Action action15 = readerUnion13.actualAction;
        org.apache.avro.C2Resolver.Action.Type type16 = readerUnion13.type;
        org.junit.Assert.assertNull(logicalType12);
        org.junit.Assert.assertNotNull(action15);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type16.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3613");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing11 = new org.apache.avro.C2Resolver.DoNothing(schema8, schema9, genericData10);
        org.apache.avro.Schema schema12 = doNothing11.reader;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion13 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, 1, (org.apache.avro.C2Resolver.Action) doNothing11);
        org.apache.avro.LogicalType logicalType14 = readerUnion13.logicalType;
        int int15 = readerUnion13.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion16 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 0, (org.apache.avro.C2Resolver.Action) readerUnion13);
        org.apache.avro.Schema schema17 = readerUnion13.reader;
        int int18 = readerUnion13.firstMatch;
        org.apache.avro.LogicalType logicalType19 = readerUnion13.logicalType;
        org.apache.avro.Schema schema20 = readerUnion13.writer;
        org.apache.avro.C2Resolver.Action action21 = readerUnion13.actualAction;
        org.junit.Assert.assertNull(schema12);
        org.junit.Assert.assertNull(logicalType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(schema17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(logicalType19);
        org.junit.Assert.assertNull(schema20);
        org.junit.Assert.assertNotNull(action21);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3614");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.generic.GenericData genericData20 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing21 = new org.apache.avro.C2Resolver.DoNothing(schema18, schema19, genericData20);
        org.apache.avro.C2Resolver.Container container22 = new org.apache.avro.C2Resolver.Container(schema15, schema16, genericData17, (org.apache.avro.C2Resolver.Action) doNothing21);
        org.apache.avro.C2Resolver.Container container23 = new org.apache.avro.C2Resolver.Container(schema12, schema13, genericData14, (org.apache.avro.C2Resolver.Action) doNothing21);
        org.apache.avro.C2Resolver.Action.Type type24 = container23.type;
        org.apache.avro.LogicalType logicalType25 = container23.logicalType;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion26 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, (int) (short) 1, (org.apache.avro.C2Resolver.Action) container23);
        org.apache.avro.C2Resolver.Action action27 = container23.elementAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion28 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, 52, action27);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion29 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 52, action27);
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type24.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNull(logicalType25);
        org.junit.Assert.assertNotNull(action27);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3615");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType3 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction4 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType3);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType5 = errorAction4.error;
        org.apache.avro.C2Resolver.Action.Type type6 = errorAction4.type;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType7 = errorAction4.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType8 = errorAction4.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = errorAction4.error;
        org.apache.avro.Schema schema10 = errorAction4.reader;
        org.apache.avro.Schema schema11 = errorAction4.reader;
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType3.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType5 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType5.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type6.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType7.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType8.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType9.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(schema10);
        org.junit.Assert.assertNull(schema11);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3616");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType11 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction12 = new org.apache.avro.C2Resolver.ErrorAction(schema8, schema9, genericData10, errorType11);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion13 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (short) 0, (org.apache.avro.C2Resolver.Action) errorAction12);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion14 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) '#', (org.apache.avro.C2Resolver.Action) errorAction12);
        org.apache.avro.C2Resolver.Action action15 = readerUnion14.actualAction;
        java.lang.Class<?> wildcardClass16 = readerUnion14.getClass();
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType11.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNotNull(action15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3617");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.C2Resolver.Action.Type type15 = container14.type;
        org.apache.avro.C2Resolver.Container container16 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) container14);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion17 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 0, (org.apache.avro.C2Resolver.Action) container16);
        org.apache.avro.C2Resolver.Action action18 = readerUnion17.actualAction;
        org.apache.avro.LogicalType logicalType19 = readerUnion17.logicalType;
        int int20 = readerUnion17.firstMatch;
        org.apache.avro.Schema schema21 = readerUnion17.writer;
        org.apache.avro.LogicalType logicalType22 = readerUnion17.logicalType;
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type15.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNotNull(action18);
        org.junit.Assert.assertNull(logicalType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(schema21);
        org.junit.Assert.assertNull(logicalType22);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3618");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.Action action10 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion11 = new org.apache.avro.C2Resolver.ReaderUnion(schema6, schema7, genericData8, (int) ' ', action10);
        org.apache.avro.C2Resolver.Container container12 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, action10);
        org.apache.avro.Schema schema13 = container12.writer;
        org.apache.avro.C2Resolver.Action action14 = container12.elementAction;
        org.apache.avro.Schema schema15 = container12.writer;
        org.apache.avro.C2Resolver.Action action16 = container12.elementAction;
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) container12);
        org.apache.avro.C2Resolver.Action action18 = container17.elementAction;
        org.junit.Assert.assertNull(schema13);
        org.junit.Assert.assertNull(action14);
        org.junit.Assert.assertNull(schema15);
        org.junit.Assert.assertNull(action16);
        org.junit.Assert.assertNotNull(action18);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3619");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.Schema schema20 = null;
        org.apache.avro.generic.GenericData genericData21 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing22 = new org.apache.avro.C2Resolver.DoNothing(schema19, schema20, genericData21);
        org.apache.avro.Schema schema23 = doNothing22.reader;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion24 = new org.apache.avro.C2Resolver.ReaderUnion(schema15, schema16, genericData17, 1, (org.apache.avro.C2Resolver.Action) doNothing22);
        org.apache.avro.LogicalType logicalType25 = readerUnion24.logicalType;
        org.apache.avro.C2Resolver.Container container26 = new org.apache.avro.C2Resolver.Container(schema12, schema13, genericData14, (org.apache.avro.C2Resolver.Action) readerUnion24);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion27 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, (int) (short) -1, (org.apache.avro.C2Resolver.Action) container26);
        org.apache.avro.Conversion<?> wildcardConversion28 = readerUnion27.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion29 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, 1, (org.apache.avro.C2Resolver.Action) readerUnion27);
        org.apache.avro.C2Resolver.Action action30 = readerUnion27.actualAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion31 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 100, action30);
        org.junit.Assert.assertNull(schema23);
        org.junit.Assert.assertNull(logicalType25);
        org.junit.Assert.assertNull(wildcardConversion28);
        org.junit.Assert.assertNotNull(action30);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3620");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType3 = null;
        org.apache.avro.C2Resolver.ErrorAction errorAction4 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType3);
        org.apache.avro.Conversion<?> wildcardConversion5 = errorAction4.conversion;
        org.apache.avro.LogicalType logicalType6 = errorAction4.logicalType;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType7 = errorAction4.error;
        org.apache.avro.LogicalType logicalType8 = errorAction4.logicalType;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = errorAction4.error;
        org.junit.Assert.assertNull(wildcardConversion5);
        org.junit.Assert.assertNull(logicalType6);
        org.junit.Assert.assertNull(errorType7);
        org.junit.Assert.assertNull(logicalType8);
        org.junit.Assert.assertNull(errorType9);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3621");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.generic.GenericData genericData16 = null;
        org.apache.avro.Schema schema17 = null;
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.generic.GenericData genericData19 = null;
        org.apache.avro.C2Resolver.Action action21 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema17, schema18, genericData19, (int) ' ', action21);
        org.apache.avro.C2Resolver.Container container23 = new org.apache.avro.C2Resolver.Container(schema14, schema15, genericData16, action21);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion24 = new org.apache.avro.C2Resolver.ReaderUnion(schema10, schema11, genericData12, (int) '4', (org.apache.avro.C2Resolver.Action) container23);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion25 = new org.apache.avro.C2Resolver.ReaderUnion(schema6, schema7, genericData8, (int) (short) 1, (org.apache.avro.C2Resolver.Action) container23);
        org.apache.avro.C2Resolver.Action action26 = readerUnion25.actualAction;
        org.apache.avro.C2Resolver.Action action27 = readerUnion25.actualAction;
        org.apache.avro.C2Resolver.Container container28 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, action27);
        org.apache.avro.C2Resolver.Container container29 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, action27);
        org.apache.avro.LogicalType logicalType30 = container29.logicalType;
        org.apache.avro.C2Resolver.Action.Type type31 = container29.type;
        org.apache.avro.LogicalType logicalType32 = container29.logicalType;
        org.junit.Assert.assertNotNull(action26);
        org.junit.Assert.assertNotNull(action27);
        org.junit.Assert.assertNull(logicalType30);
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type31.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNull(logicalType32);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3622");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion12 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 35, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.Schema schema13 = readerUnion12.reader;
        int int14 = readerUnion12.firstMatch;
        org.apache.avro.Schema schema15 = readerUnion12.reader;
        int int16 = readerUnion12.firstMatch;
        org.apache.avro.Conversion<?> wildcardConversion17 = readerUnion12.conversion;
        org.junit.Assert.assertNull(schema13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNull(schema15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNull(wildcardConversion17);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3623");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.Schema schema17 = null;
        org.apache.avro.generic.GenericData genericData18 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.Schema schema20 = null;
        org.apache.avro.generic.GenericData genericData21 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType22 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction23 = new org.apache.avro.C2Resolver.ErrorAction(schema19, schema20, genericData21, errorType22);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType24 = errorAction23.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType25 = errorAction23.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction26 = new org.apache.avro.C2Resolver.ErrorAction(schema16, schema17, genericData18, errorType25);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion27 = new org.apache.avro.C2Resolver.ReaderUnion(schema12, schema13, genericData14, (int) (short) 100, (org.apache.avro.C2Resolver.Action) errorAction26);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType28 = errorAction26.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction29 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType28);
        org.apache.avro.C2Resolver.ErrorAction errorAction30 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType28);
        org.apache.avro.C2Resolver.ErrorAction errorAction31 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType28);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType32 = errorAction31.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction33 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = errorAction33.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType22 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType22.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType24.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType25.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType28 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType28.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType32 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType32.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3624");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing18 = new org.apache.avro.C2Resolver.DoNothing(schema15, schema16, genericData17);
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema12, schema13, genericData14, (org.apache.avro.C2Resolver.Action) doNothing18);
        org.apache.avro.Conversion<?> wildcardConversion20 = doNothing18.conversion;
        org.apache.avro.Conversion<?> wildcardConversion21 = doNothing18.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing18);
        int int23 = readerUnion22.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion24 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (byte) -1, (org.apache.avro.C2Resolver.Action) readerUnion22);
        int int25 = readerUnion22.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion26 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 1, (org.apache.avro.C2Resolver.Action) readerUnion22);
        org.apache.avro.Schema schema27 = readerUnion22.reader;
        int int28 = readerUnion22.firstMatch;
        org.apache.avro.Schema schema29 = readerUnion22.writer;
        int int30 = readerUnion22.firstMatch;
        org.apache.avro.C2Resolver.Action.Type type31 = readerUnion22.type;
        org.junit.Assert.assertNull(wildcardConversion20);
        org.junit.Assert.assertNull(wildcardConversion21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNull(schema27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertNull(schema29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type31.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3625");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction10 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType9);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType11 = errorAction10.error;
        org.apache.avro.Schema schema12 = errorAction10.writer;
        org.apache.avro.C2Resolver.Container container13 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) errorAction10);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction10.error;
        org.apache.avro.LogicalType logicalType15 = errorAction10.logicalType;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType16 = errorAction10.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction17 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType16);
        org.apache.avro.Schema schema18 = errorAction17.writer;
        org.apache.avro.Schema schema19 = errorAction17.writer;
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType9.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType11.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(schema12);
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(logicalType15);
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType16.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertNull(schema19);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3626");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction15 = new org.apache.avro.C2Resolver.ErrorAction(schema11, schema12, genericData13, errorType14);
        org.apache.avro.C2Resolver.Container container16 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, (org.apache.avro.C2Resolver.Action) errorAction15);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction15.error;
        org.apache.avro.LogicalType logicalType18 = errorAction15.logicalType;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType19 = errorAction15.error;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion20 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (-1), (org.apache.avro.C2Resolver.Action) errorAction15);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion21 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 32, (org.apache.avro.C2Resolver.Action) readerUnion20);
        org.apache.avro.Schema schema22 = readerUnion21.writer;
        int int23 = readerUnion21.firstMatch;
        org.apache.avro.Schema schema24 = readerUnion21.writer;
        org.apache.avro.C2Resolver.Action action25 = readerUnion21.actualAction;
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(logicalType18);
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType19.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(schema22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNull(schema24);
        org.junit.Assert.assertNotNull(action25);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3627");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema12, schema13, genericData14, errorType15);
        org.apache.avro.C2Resolver.ErrorAction errorAction17 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType15);
        org.apache.avro.C2Resolver.ErrorAction errorAction18 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType15);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType19 = errorAction18.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction20 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType19);
        org.apache.avro.C2Resolver.Container container21 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) errorAction20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = errorAction20.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType19.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3628");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.C2Resolver.Action action4 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion5 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (-1), action4);
        int int6 = readerUnion5.firstMatch;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3629");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType12);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction15 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType14);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType16 = errorAction15.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction15.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction18 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType17);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType19 = errorAction18.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction20 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType19);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType21 = errorAction20.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType22 = errorAction20.error;
        org.apache.avro.LogicalType logicalType23 = errorAction20.logicalType;
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType16.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType19.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType21.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType22 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType22.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(logicalType23);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3630");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.generic.GenericData genericData15 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing16 = new org.apache.avro.C2Resolver.DoNothing(schema13, schema14, genericData15);
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema10, schema11, genericData12, (org.apache.avro.C2Resolver.Action) doNothing16);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema6, schema7, genericData8, 35, (org.apache.avro.C2Resolver.Action) doNothing16);
        org.apache.avro.C2Resolver.Action action19 = readerUnion18.actualAction;
        org.apache.avro.C2Resolver.Container container20 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, action19);
        org.apache.avro.Conversion<?> wildcardConversion21 = action19.conversion;
        org.apache.avro.C2Resolver.Container container22 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, action19);
        org.apache.avro.C2Resolver.Action.Type type23 = container22.type;
        org.apache.avro.LogicalType logicalType24 = container22.logicalType;
        org.junit.Assert.assertNotNull(action19);
        org.junit.Assert.assertNull(wildcardConversion21);
        org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type23.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNull(logicalType24);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3631");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.Conversion<?> wildcardConversion12 = doNothing10.conversion;
        org.apache.avro.Conversion<?> wildcardConversion13 = doNothing10.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion14 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.Schema schema15 = readerUnion14.reader;
        org.apache.avro.C2Resolver.Action action16 = readerUnion14.actualAction;
        org.apache.avro.Schema schema17 = action16.writer;
        org.junit.Assert.assertNull(wildcardConversion12);
        org.junit.Assert.assertNull(wildcardConversion13);
        org.junit.Assert.assertNull(schema15);
        org.junit.Assert.assertNotNull(action16);
        org.junit.Assert.assertNull(schema17);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3632");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing14 = new org.apache.avro.C2Resolver.DoNothing(schema11, schema12, genericData13);
        org.apache.avro.C2Resolver.Container container15 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.Conversion<?> wildcardConversion16 = doNothing14.conversion;
        org.apache.avro.Conversion<?> wildcardConversion17 = doNothing14.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.LogicalType logicalType19 = readerUnion18.logicalType;
        org.apache.avro.C2Resolver.Action action20 = readerUnion18.actualAction;
        org.apache.avro.Schema schema21 = action20.reader;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (byte) 100, action20);
        int int23 = readerUnion22.firstMatch;
        java.lang.Class<?> wildcardClass24 = readerUnion22.getClass();
        org.junit.Assert.assertNull(wildcardConversion16);
        org.junit.Assert.assertNull(wildcardConversion17);
        org.junit.Assert.assertNull(logicalType19);
        org.junit.Assert.assertNotNull(action20);
        org.junit.Assert.assertNull(schema21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3633");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction10 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType9);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType11 = errorAction10.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = errorAction10.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType12);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction13.error;
        org.apache.avro.Schema schema15 = errorAction13.reader;
        org.apache.avro.Schema schema16 = errorAction13.writer;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType18 = errorAction13.error;
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) errorAction13);
        org.apache.avro.Schema schema20 = errorAction13.reader;
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType9.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType11.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(schema15);
        org.junit.Assert.assertNull(schema16);
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType18.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(schema20);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3634");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion15 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, 35, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.Schema schema16 = readerUnion15.reader;
        int int17 = readerUnion15.firstMatch;
        org.apache.avro.C2Resolver.Container container18 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion15);
        org.apache.avro.C2Resolver.Action action19 = container18.elementAction;
        org.apache.avro.C2Resolver.Action.Type type20 = container18.type;
        org.apache.avro.Schema schema21 = container18.writer;
        org.apache.avro.C2Resolver.Action action22 = container18.elementAction;
        org.apache.avro.C2Resolver.Action action23 = container18.elementAction;
        org.junit.Assert.assertNull(schema16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(action19);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type20.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNull(schema21);
        org.junit.Assert.assertNotNull(action22);
        org.junit.Assert.assertNotNull(action23);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3635");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing6 = new org.apache.avro.C2Resolver.DoNothing(schema3, schema4, genericData5);
        org.apache.avro.LogicalType logicalType7 = doNothing6.logicalType;
        org.apache.avro.Schema schema8 = doNothing6.writer;
        org.apache.avro.C2Resolver.Container container9 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) doNothing6);
        org.apache.avro.LogicalType logicalType10 = container9.logicalType;
        org.apache.avro.Schema schema11 = container9.writer;
        org.apache.avro.C2Resolver.Action action12 = container9.elementAction;
        org.apache.avro.C2Resolver.Action action13 = container9.elementAction;
        org.junit.Assert.assertNull(logicalType7);
        org.junit.Assert.assertNull(schema8);
        org.junit.Assert.assertNull(logicalType10);
        org.junit.Assert.assertNull(schema11);
        org.junit.Assert.assertNotNull(action12);
        org.junit.Assert.assertNotNull(action13);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3636");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType6 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction7 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType6);
        org.apache.avro.Schema schema8 = errorAction7.reader;
        org.apache.avro.LogicalType logicalType9 = errorAction7.logicalType;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType10 = errorAction7.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction11 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType10);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = errorAction11.error;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = errorAction11.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType6.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertNull(schema8);
        org.junit.Assert.assertNull(logicalType9);
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType10.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3637");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType7 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction8 = new org.apache.avro.C2Resolver.ErrorAction(schema4, schema5, genericData6, errorType7);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = errorAction8.error;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion10 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (byte) 10, (org.apache.avro.C2Resolver.Action) errorAction8);
        int int11 = readerUnion10.firstMatch;
        int int12 = readerUnion10.firstMatch;
        int int13 = readerUnion10.firstMatch;
        int int14 = readerUnion10.firstMatch;
        org.apache.avro.Conversion<?> wildcardConversion15 = readerUnion10.conversion;
        org.apache.avro.C2Resolver.Action action16 = readerUnion10.actualAction;
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType7.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType9.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(wildcardConversion15);
        org.junit.Assert.assertNotNull(action16);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3638");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.C2Resolver.Action action12 = container11.elementAction;
        org.apache.avro.C2Resolver.Action action13 = container11.elementAction;
        org.apache.avro.C2Resolver.Action action14 = container11.elementAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion15 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 32, action14);
        org.apache.avro.Schema schema16 = readerUnion15.reader;
        org.junit.Assert.assertNotNull(action12);
        org.junit.Assert.assertNotNull(action13);
        org.junit.Assert.assertNotNull(action14);
        org.junit.Assert.assertNull(schema16);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3639");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing9 = new org.apache.avro.C2Resolver.DoNothing(schema6, schema7, genericData8);
        org.apache.avro.C2Resolver.Container container10 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) doNothing9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) doNothing9);
        org.apache.avro.C2Resolver.Action.Type type12 = container11.type;
        org.apache.avro.C2Resolver.Action.Type type13 = container11.type;
        org.apache.avro.C2Resolver.Action action14 = container11.elementAction;
        org.apache.avro.C2Resolver.Action action15 = container11.elementAction;
        org.apache.avro.C2Resolver.Action.Type type16 = container11.type;
        org.apache.avro.LogicalType logicalType17 = container11.logicalType;
        org.apache.avro.C2Resolver.Action action18 = container11.elementAction;
        java.lang.Class<?> wildcardClass19 = container11.getClass();
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type12.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type13.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNotNull(action14);
        org.junit.Assert.assertNotNull(action15);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type16.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNull(logicalType17);
        org.junit.Assert.assertNotNull(action18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3640");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.generic.GenericData genericData16 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing17 = new org.apache.avro.C2Resolver.DoNothing(schema14, schema15, genericData16);
        org.apache.avro.C2Resolver.Container container18 = new org.apache.avro.C2Resolver.Container(schema11, schema12, genericData13, (org.apache.avro.C2Resolver.Action) doNothing17);
        org.apache.avro.Conversion<?> wildcardConversion19 = doNothing17.conversion;
        org.apache.avro.Conversion<?> wildcardConversion20 = doNothing17.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion21 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing17);
        org.apache.avro.LogicalType logicalType22 = readerUnion21.logicalType;
        org.apache.avro.C2Resolver.Action action23 = readerUnion21.actualAction;
        org.apache.avro.C2Resolver.Action action24 = readerUnion21.actualAction;
        org.apache.avro.Conversion<?> wildcardConversion25 = readerUnion21.conversion;
        org.apache.avro.C2Resolver.Action action26 = readerUnion21.actualAction;
        org.apache.avro.C2Resolver.Action action27 = readerUnion21.actualAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion28 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, (-1), (org.apache.avro.C2Resolver.Action) readerUnion21);
        org.apache.avro.C2Resolver.Container container29 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion28);
        org.apache.avro.LogicalType logicalType30 = readerUnion28.logicalType;
        org.junit.Assert.assertNull(wildcardConversion19);
        org.junit.Assert.assertNull(wildcardConversion20);
        org.junit.Assert.assertNull(logicalType22);
        org.junit.Assert.assertNotNull(action23);
        org.junit.Assert.assertNotNull(action24);
        org.junit.Assert.assertNull(wildcardConversion25);
        org.junit.Assert.assertNotNull(action26);
        org.junit.Assert.assertNotNull(action27);
        org.junit.Assert.assertNull(logicalType30);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3641");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.generic.GenericData genericData15 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing16 = new org.apache.avro.C2Resolver.DoNothing(schema13, schema14, genericData15);
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema10, schema11, genericData12, (org.apache.avro.C2Resolver.Action) doNothing16);
        org.apache.avro.Conversion<?> wildcardConversion18 = doNothing16.conversion;
        org.apache.avro.Conversion<?> wildcardConversion19 = doNothing16.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion20 = new org.apache.avro.C2Resolver.ReaderUnion(schema6, schema7, genericData8, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing16);
        org.apache.avro.LogicalType logicalType21 = readerUnion20.logicalType;
        org.apache.avro.C2Resolver.Action action22 = readerUnion20.actualAction;
        org.apache.avro.C2Resolver.Action action23 = readerUnion20.actualAction;
        org.apache.avro.Conversion<?> wildcardConversion24 = readerUnion20.conversion;
        org.apache.avro.C2Resolver.Action action25 = readerUnion20.actualAction;
        org.apache.avro.C2Resolver.Action.Type type26 = readerUnion20.type;
        org.apache.avro.C2Resolver.Container container27 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) readerUnion20);
        org.apache.avro.C2Resolver.Container container28 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion20);
        org.apache.avro.Schema schema29 = container28.writer;
        org.apache.avro.C2Resolver.Action action30 = container28.elementAction;
        org.junit.Assert.assertNull(wildcardConversion18);
        org.junit.Assert.assertNull(wildcardConversion19);
        org.junit.Assert.assertNull(logicalType21);
        org.junit.Assert.assertNotNull(action22);
        org.junit.Assert.assertNotNull(action23);
        org.junit.Assert.assertNull(wildcardConversion24);
        org.junit.Assert.assertNotNull(action25);
        org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type26.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertNull(schema29);
        org.junit.Assert.assertNotNull(action30);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3642");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType12);
        org.apache.avro.C2Resolver.ErrorAction errorAction14 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType12);
        org.apache.avro.C2Resolver.ErrorAction errorAction15 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType12);
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType12);
        org.apache.avro.LogicalType logicalType17 = errorAction16.logicalType;
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH));
        org.junit.Assert.assertNull(logicalType17);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3643");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.generic.GenericData genericData15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.Schema schema17 = null;
        org.apache.avro.generic.GenericData genericData18 = null;
        org.apache.avro.Schema schema20 = null;
        org.apache.avro.Schema schema21 = null;
        org.apache.avro.generic.GenericData genericData22 = null;
        org.apache.avro.Schema schema23 = null;
        org.apache.avro.Schema schema24 = null;
        org.apache.avro.generic.GenericData genericData25 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType26 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction27 = new org.apache.avro.C2Resolver.ErrorAction(schema23, schema24, genericData25, errorType26);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType28 = errorAction27.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType29 = errorAction27.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction30 = new org.apache.avro.C2Resolver.ErrorAction(schema20, schema21, genericData22, errorType29);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion31 = new org.apache.avro.C2Resolver.ReaderUnion(schema16, schema17, genericData18, (int) (short) 100, (org.apache.avro.C2Resolver.Action) errorAction30);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType32 = errorAction30.error;
        org.apache.avro.C2Resolver.Container container33 = new org.apache.avro.C2Resolver.Container(schema13, schema14, genericData15, (org.apache.avro.C2Resolver.Action) errorAction30);
        org.apache.avro.LogicalType logicalType34 = errorAction30.logicalType;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType35 = errorAction30.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction36 = new org.apache.avro.C2Resolver.ErrorAction(schema10, schema11, genericData12, errorType35);
        org.apache.avro.C2Resolver.ErrorAction errorAction37 = new org.apache.avro.C2Resolver.ErrorAction(schema7, schema8, genericData9, errorType35);
        org.apache.avro.C2Resolver.Action.Type type38 = errorAction37.type;
        org.apache.avro.C2Resolver.Container container39 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) errorAction37);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion40 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (byte) 0, (org.apache.avro.C2Resolver.Action) errorAction37);
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType26.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType28 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType28.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType29 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType29.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType32 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType32.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(logicalType34);
        org.junit.Assert.assertTrue("'" + errorType35 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType35.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + type38 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type38.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3644");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion15 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, 35, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.Schema schema16 = readerUnion15.reader;
        org.apache.avro.LogicalType logicalType17 = readerUnion15.logicalType;
        org.apache.avro.C2Resolver.Container container18 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion15);
        int int19 = readerUnion15.firstMatch;
        org.junit.Assert.assertNull(schema16);
        org.junit.Assert.assertNull(logicalType17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3645");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.Action action10 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion11 = new org.apache.avro.C2Resolver.ReaderUnion(schema6, schema7, genericData8, (int) ' ', action10);
        int int12 = readerUnion11.firstMatch;
        org.apache.avro.LogicalType logicalType13 = readerUnion11.logicalType;
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) readerUnion11);
        org.apache.avro.C2Resolver.Container container15 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) container14);
        org.apache.avro.C2Resolver.Action action16 = container14.elementAction;
        org.apache.avro.Schema schema17 = action16.reader;
        org.apache.avro.Schema schema18 = action16.reader;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNull(logicalType13);
        org.junit.Assert.assertNotNull(action16);
        org.junit.Assert.assertNull(schema17);
        org.junit.Assert.assertNull(schema18);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3646");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType7 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction8 = new org.apache.avro.C2Resolver.ErrorAction(schema4, schema5, genericData6, errorType7);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = errorAction8.error;
        org.apache.avro.C2Resolver.Action.Type type10 = errorAction8.type;
        org.apache.avro.C2Resolver.Action.Type type11 = errorAction8.type;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion12 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 35, (org.apache.avro.C2Resolver.Action) errorAction8);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType13 = errorAction8.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction8.error;
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType7.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType9.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type10.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type11.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType13.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3647");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.generic.GenericData genericData15 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing16 = new org.apache.avro.C2Resolver.DoNothing(schema13, schema14, genericData15);
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema10, schema11, genericData12, (org.apache.avro.C2Resolver.Action) doNothing16);
        org.apache.avro.Conversion<?> wildcardConversion18 = doNothing16.conversion;
        org.apache.avro.Conversion<?> wildcardConversion19 = doNothing16.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion20 = new org.apache.avro.C2Resolver.ReaderUnion(schema6, schema7, genericData8, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing16);
        org.apache.avro.C2Resolver.Action action21 = readerUnion20.actualAction;
        int int22 = readerUnion20.firstMatch;
        org.apache.avro.LogicalType logicalType23 = readerUnion20.logicalType;
        org.apache.avro.C2Resolver.Container container24 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) readerUnion20);
        org.apache.avro.Conversion<?> wildcardConversion25 = container24.conversion;
        org.apache.avro.C2Resolver.Container container26 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) container24);
        org.apache.avro.Conversion<?> wildcardConversion27 = container26.conversion;
        org.junit.Assert.assertNull(wildcardConversion18);
        org.junit.Assert.assertNull(wildcardConversion19);
        org.junit.Assert.assertNotNull(action21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNull(logicalType23);
        org.junit.Assert.assertNull(wildcardConversion25);
        org.junit.Assert.assertNull(wildcardConversion27);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3648");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType7 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction8 = new org.apache.avro.C2Resolver.ErrorAction(schema4, schema5, genericData6, errorType7);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion9 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 0, (org.apache.avro.C2Resolver.Action) errorAction8);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType10 = errorAction8.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType11 = errorAction8.error;
        org.apache.avro.Schema schema12 = errorAction8.writer;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType13 = errorAction8.error;
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType7.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType10.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType11.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(schema12);
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType13.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3649");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing9 = new org.apache.avro.C2Resolver.DoNothing(schema6, schema7, genericData8);
        org.apache.avro.C2Resolver.Container container10 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) doNothing9);
        org.apache.avro.C2Resolver.Action action11 = container10.elementAction;
        org.apache.avro.LogicalType logicalType12 = action11.logicalType;
        org.apache.avro.C2Resolver.Container container13 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, action11);
        org.apache.avro.C2Resolver.Action action14 = container13.elementAction;
        org.apache.avro.Schema schema15 = container13.reader;
        org.apache.avro.Conversion<?> wildcardConversion16 = container13.conversion;
        org.apache.avro.Schema schema17 = container13.reader;
        org.junit.Assert.assertNotNull(action11);
        org.junit.Assert.assertNull(logicalType12);
        org.junit.Assert.assertNotNull(action14);
        org.junit.Assert.assertNull(schema15);
        org.junit.Assert.assertNull(wildcardConversion16);
        org.junit.Assert.assertNull(schema17);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3650");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion12 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 35, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.Schema schema13 = readerUnion12.reader;
        int int14 = readerUnion12.firstMatch;
        org.apache.avro.C2Resolver.Action.Type type15 = readerUnion12.type;
        org.apache.avro.Schema schema16 = readerUnion12.writer;
        org.apache.avro.Schema schema17 = readerUnion12.writer;
        org.apache.avro.LogicalType logicalType18 = readerUnion12.logicalType;
        org.junit.Assert.assertNull(schema13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type15.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertNull(schema16);
        org.junit.Assert.assertNull(schema17);
        org.junit.Assert.assertNull(logicalType18);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3651");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType3 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction4 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType3);
        org.apache.avro.Conversion<?> wildcardConversion5 = errorAction4.conversion;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType6 = errorAction4.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType7 = errorAction4.error;
        org.junit.Assert.assertTrue("'" + errorType3 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType3.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(wildcardConversion5);
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType6.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType7.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3652");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing6 = new org.apache.avro.C2Resolver.DoNothing(schema3, schema4, genericData5);
        org.apache.avro.C2Resolver.Container container7 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) doNothing6);
        org.apache.avro.C2Resolver.Action action8 = container7.elementAction;
        org.apache.avro.Conversion<?> wildcardConversion9 = container7.conversion;
        org.apache.avro.C2Resolver.Action action10 = container7.elementAction;
        org.apache.avro.C2Resolver.Action action11 = container7.elementAction;
        org.apache.avro.Schema schema12 = container7.writer;
        org.junit.Assert.assertNotNull(action8);
        org.junit.Assert.assertNull(wildcardConversion9);
        org.junit.Assert.assertNotNull(action10);
        org.junit.Assert.assertNotNull(action11);
        org.junit.Assert.assertNull(schema12);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3653");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.Schema schema15 = doNothing13.reader;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion16 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, (int) (short) 100, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.C2Resolver.Action action17 = readerUnion16.actualAction;
        org.apache.avro.C2Resolver.Action action18 = readerUnion16.actualAction;
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion16);
        org.apache.avro.C2Resolver.Action action20 = container19.elementAction;
        org.junit.Assert.assertNull(schema15);
        org.junit.Assert.assertNotNull(action17);
        org.junit.Assert.assertNotNull(action18);
        org.junit.Assert.assertNotNull(action20);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3654");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing11 = new org.apache.avro.C2Resolver.DoNothing(schema8, schema9, genericData10);
        org.apache.avro.LogicalType logicalType12 = doNothing11.logicalType;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion13 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (short) 10, (org.apache.avro.C2Resolver.Action) doNothing11);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion14 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 1, (org.apache.avro.C2Resolver.Action) doNothing11);
        org.apache.avro.Schema schema15 = doNothing11.reader;
        org.junit.Assert.assertNull(logicalType12);
        org.junit.Assert.assertNull(schema15);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3655");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing18 = new org.apache.avro.C2Resolver.DoNothing(schema15, schema16, genericData17);
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema12, schema13, genericData14, (org.apache.avro.C2Resolver.Action) doNothing18);
        org.apache.avro.Conversion<?> wildcardConversion20 = doNothing18.conversion;
        org.apache.avro.Conversion<?> wildcardConversion21 = doNothing18.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing18);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion23 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, 35, (org.apache.avro.C2Resolver.Action) readerUnion22);
        int int24 = readerUnion22.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion25 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (-1), (org.apache.avro.C2Resolver.Action) readerUnion22);
        org.apache.avro.Conversion<?> wildcardConversion26 = readerUnion25.conversion;
        org.apache.avro.Conversion<?> wildcardConversion27 = readerUnion25.conversion;
        org.junit.Assert.assertNull(wildcardConversion20);
        org.junit.Assert.assertNull(wildcardConversion21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNull(wildcardConversion26);
        org.junit.Assert.assertNull(wildcardConversion27);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3656");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.Schema schema12 = container11.writer;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion13 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 10, (org.apache.avro.C2Resolver.Action) container11);
        org.apache.avro.LogicalType logicalType14 = container11.logicalType;
        org.apache.avro.C2Resolver.Action action15 = container11.elementAction;
        org.apache.avro.C2Resolver.Action action16 = container11.elementAction;
        org.apache.avro.LogicalType logicalType17 = action16.logicalType;
        org.junit.Assert.assertNull(schema12);
        org.junit.Assert.assertNull(logicalType14);
        org.junit.Assert.assertNotNull(action15);
        org.junit.Assert.assertNotNull(action16);
        org.junit.Assert.assertNull(logicalType17);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3657");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.generic.GenericData genericData16 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing17 = new org.apache.avro.C2Resolver.DoNothing(schema14, schema15, genericData16);
        org.apache.avro.C2Resolver.Container container18 = new org.apache.avro.C2Resolver.Container(schema11, schema12, genericData13, (org.apache.avro.C2Resolver.Action) doNothing17);
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, (org.apache.avro.C2Resolver.Action) doNothing17);
        org.apache.avro.C2Resolver.Action.Type type20 = container19.type;
        org.apache.avro.LogicalType logicalType21 = container19.logicalType;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (short) 1, (org.apache.avro.C2Resolver.Action) container19);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion23 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) ' ', (org.apache.avro.C2Resolver.Action) container19);
        org.apache.avro.C2Resolver.Action action24 = readerUnion23.actualAction;
        org.apache.avro.Schema schema25 = readerUnion23.writer;
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type20.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNull(logicalType21);
        org.junit.Assert.assertNotNull(action24);
        org.junit.Assert.assertNull(schema25);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3658");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction10 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType9);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType11 = errorAction10.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = errorAction10.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType12);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = errorAction13.error;
        org.apache.avro.Conversion<?> wildcardConversion16 = errorAction13.conversion;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction18 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType17);
        org.apache.avro.C2Resolver.Action.Type type19 = errorAction18.type;
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType9.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType11.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(wildcardConversion16);
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type19.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3659");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing14 = new org.apache.avro.C2Resolver.DoNothing(schema11, schema12, genericData13);
        org.apache.avro.C2Resolver.Container container15 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.Conversion<?> wildcardConversion16 = doNothing14.conversion;
        org.apache.avro.Conversion<?> wildcardConversion17 = doNothing14.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.LogicalType logicalType19 = readerUnion18.logicalType;
        org.apache.avro.C2Resolver.Action action20 = readerUnion18.actualAction;
        org.apache.avro.C2Resolver.Action action21 = readerUnion18.actualAction;
        org.apache.avro.C2Resolver.Action action22 = readerUnion18.actualAction;
        org.apache.avro.Schema schema23 = readerUnion18.reader;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion24 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 10, (org.apache.avro.C2Resolver.Action) readerUnion18);
        org.apache.avro.C2Resolver.Action.Type type25 = readerUnion18.type;
        org.junit.Assert.assertNull(wildcardConversion16);
        org.junit.Assert.assertNull(wildcardConversion17);
        org.junit.Assert.assertNull(logicalType19);
        org.junit.Assert.assertNotNull(action20);
        org.junit.Assert.assertNotNull(action21);
        org.junit.Assert.assertNotNull(action22);
        org.junit.Assert.assertNull(schema23);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type25.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3660");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType7 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction8 = new org.apache.avro.C2Resolver.ErrorAction(schema4, schema5, genericData6, errorType7);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion9 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 100, (org.apache.avro.C2Resolver.Action) errorAction8);
        org.apache.avro.C2Resolver.Action action10 = readerUnion9.actualAction;
        org.apache.avro.C2Resolver.Action action11 = readerUnion9.actualAction;
        org.apache.avro.C2Resolver.Action action12 = readerUnion9.actualAction;
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType7.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertNotNull(action10);
        org.junit.Assert.assertNotNull(action11);
        org.junit.Assert.assertNotNull(action12);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3661");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing14 = new org.apache.avro.C2Resolver.DoNothing(schema11, schema12, genericData13);
        org.apache.avro.C2Resolver.Container container15 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion16 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, 35, (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion17 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 0, (org.apache.avro.C2Resolver.Action) doNothing14);
        int int18 = readerUnion17.firstMatch;
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3662");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.generic.GenericData genericData16 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing17 = new org.apache.avro.C2Resolver.DoNothing(schema14, schema15, genericData16);
        org.apache.avro.C2Resolver.Container container18 = new org.apache.avro.C2Resolver.Container(schema11, schema12, genericData13, (org.apache.avro.C2Resolver.Action) doNothing17);
        org.apache.avro.Conversion<?> wildcardConversion19 = doNothing17.conversion;
        org.apache.avro.Conversion<?> wildcardConversion20 = doNothing17.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion21 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing17);
        org.apache.avro.LogicalType logicalType22 = readerUnion21.logicalType;
        org.apache.avro.C2Resolver.Action action23 = readerUnion21.actualAction;
        org.apache.avro.C2Resolver.Action action24 = readerUnion21.actualAction;
        org.apache.avro.Conversion<?> wildcardConversion25 = readerUnion21.conversion;
        org.apache.avro.C2Resolver.Action action26 = readerUnion21.actualAction;
        org.apache.avro.C2Resolver.Action action27 = readerUnion21.actualAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion28 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, (-1), (org.apache.avro.C2Resolver.Action) readerUnion21);
        org.apache.avro.C2Resolver.Container container29 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion28);
        org.apache.avro.Conversion<?> wildcardConversion30 = container29.conversion;
        org.apache.avro.Conversion<?> wildcardConversion31 = container29.conversion;
        java.lang.Class<?> wildcardClass32 = container29.getClass();
        org.junit.Assert.assertNull(wildcardConversion19);
        org.junit.Assert.assertNull(wildcardConversion20);
        org.junit.Assert.assertNull(logicalType22);
        org.junit.Assert.assertNotNull(action23);
        org.junit.Assert.assertNotNull(action24);
        org.junit.Assert.assertNull(wildcardConversion25);
        org.junit.Assert.assertNotNull(action26);
        org.junit.Assert.assertNotNull(action27);
        org.junit.Assert.assertNull(wildcardConversion30);
        org.junit.Assert.assertNull(wildcardConversion31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3663");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.C2Resolver.Action action4 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion5 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 35, action4);
        int int6 = readerUnion5.firstMatch;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3664");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.Conversion<?> wildcardConversion15 = doNothing13.conversion;
        org.apache.avro.Conversion<?> wildcardConversion16 = doNothing13.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion17 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing13);
        int int18 = readerUnion17.firstMatch;
        org.apache.avro.C2Resolver.Action action19 = readerUnion17.actualAction;
        org.apache.avro.C2Resolver.Action.Type type20 = readerUnion17.type;
        int int21 = readerUnion17.firstMatch;
        org.apache.avro.Conversion<?> wildcardConversion22 = readerUnion17.conversion;
        org.apache.avro.C2Resolver.Container container23 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion17);
        org.apache.avro.C2Resolver.Action action24 = container23.elementAction;
        org.apache.avro.LogicalType logicalType25 = container23.logicalType;
        org.junit.Assert.assertNull(wildcardConversion15);
        org.junit.Assert.assertNull(wildcardConversion16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(action19);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type20.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNull(wildcardConversion22);
        org.junit.Assert.assertNotNull(action24);
        org.junit.Assert.assertNull(logicalType25);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3665");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion12 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 100, (org.apache.avro.C2Resolver.Action) container11);
        org.apache.avro.Schema schema13 = container11.reader;
        org.apache.avro.C2Resolver.Action action14 = container11.elementAction;
        org.apache.avro.C2Resolver.Action.Type type15 = container11.type;
        org.junit.Assert.assertNull(schema13);
        org.junit.Assert.assertNotNull(action14);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type15.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3666");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing9 = new org.apache.avro.C2Resolver.DoNothing(schema6, schema7, genericData8);
        org.apache.avro.C2Resolver.Container container10 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) doNothing9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) doNothing9);
        org.apache.avro.Conversion<?> wildcardConversion12 = container11.conversion;
        org.apache.avro.C2Resolver.Action action13 = container11.elementAction;
        org.apache.avro.C2Resolver.Action.Type type14 = action13.type;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        org.junit.Assert.assertNull(wildcardConversion12);
        org.junit.Assert.assertNotNull(action13);
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.avro.C2Resolver.Action.Type.DO_NOTHING + "'", type14.equals(org.apache.avro.C2Resolver.Action.Type.DO_NOTHING));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3667");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType7 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction8 = new org.apache.avro.C2Resolver.ErrorAction(schema4, schema5, genericData6, errorType7);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion9 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 100, (org.apache.avro.C2Resolver.Action) errorAction8);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType10 = errorAction8.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType11 = errorAction8.error;
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType7.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType10.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType11.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3668");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.generic.GenericData genericData16 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing17 = new org.apache.avro.C2Resolver.DoNothing(schema14, schema15, genericData16);
        org.apache.avro.C2Resolver.Container container18 = new org.apache.avro.C2Resolver.Container(schema11, schema12, genericData13, (org.apache.avro.C2Resolver.Action) doNothing17);
        org.apache.avro.Conversion<?> wildcardConversion19 = doNothing17.conversion;
        org.apache.avro.Conversion<?> wildcardConversion20 = doNothing17.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion21 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing17);
        int int22 = readerUnion21.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion23 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, (int) (byte) -1, (org.apache.avro.C2Resolver.Action) readerUnion21);
        int int24 = readerUnion21.firstMatch;
        org.apache.avro.C2Resolver.Action action25 = readerUnion21.actualAction;
        org.apache.avro.C2Resolver.Action action26 = readerUnion21.actualAction;
        org.apache.avro.Schema schema27 = readerUnion21.writer;
        org.apache.avro.C2Resolver.Action action28 = readerUnion21.actualAction;
        org.apache.avro.C2Resolver.Container container29 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, action28);
        org.apache.avro.LogicalType logicalType30 = action28.logicalType;
        org.junit.Assert.assertNull(wildcardConversion19);
        org.junit.Assert.assertNull(wildcardConversion20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(action25);
        org.junit.Assert.assertNotNull(action26);
        org.junit.Assert.assertNull(schema27);
        org.junit.Assert.assertNotNull(action28);
        org.junit.Assert.assertNull(logicalType30);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3669");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType18 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction19 = new org.apache.avro.C2Resolver.ErrorAction(schema15, schema16, genericData17, errorType18);
        org.apache.avro.C2Resolver.ErrorAction errorAction20 = new org.apache.avro.C2Resolver.ErrorAction(schema12, schema13, genericData14, errorType18);
        org.apache.avro.C2Resolver.ErrorAction errorAction21 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType18);
        org.apache.avro.C2Resolver.ErrorAction errorAction22 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType18);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType23 = errorAction22.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType24 = errorAction22.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction25 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType24);
        org.apache.avro.C2Resolver.ErrorAction errorAction26 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType24);
        org.apache.avro.Conversion<?> wildcardConversion27 = errorAction26.conversion;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType28 = errorAction26.error;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = errorAction26.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType18.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType23.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType24.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertNull(wildcardConversion27);
        org.junit.Assert.assertTrue("'" + errorType28 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType28.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3670");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType6 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction7 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType6);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType8 = errorAction7.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = errorAction7.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction10 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType9);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType11 = errorAction10.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = errorAction10.error;
        org.apache.avro.Schema schema13 = errorAction10.writer;
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType6.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType8 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType8.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType9.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType11.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(schema13);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3671");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType7 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction8 = new org.apache.avro.C2Resolver.ErrorAction(schema4, schema5, genericData6, errorType7);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = errorAction8.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType10 = errorAction8.error;
        org.apache.avro.C2Resolver.Action.Type type11 = errorAction8.type;
        org.apache.avro.LogicalType logicalType12 = errorAction8.logicalType;
        org.apache.avro.C2Resolver.Action.Type type13 = errorAction8.type;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion14 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (-1), (org.apache.avro.C2Resolver.Action) errorAction8);
        org.junit.Assert.assertTrue("'" + errorType7 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType7.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType9.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType10.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type11.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertNull(logicalType12);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type13.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3672");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.generic.GenericData genericData20 = null;
        org.apache.avro.C2Resolver.Action action22 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion23 = new org.apache.avro.C2Resolver.ReaderUnion(schema18, schema19, genericData20, (int) ' ', action22);
        org.apache.avro.C2Resolver.Container container24 = new org.apache.avro.C2Resolver.Container(schema15, schema16, genericData17, action22);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion25 = new org.apache.avro.C2Resolver.ReaderUnion(schema11, schema12, genericData13, (int) '4', (org.apache.avro.C2Resolver.Action) container24);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion26 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, (int) (byte) 10, (org.apache.avro.C2Resolver.Action) readerUnion25);
        org.apache.avro.Schema schema27 = readerUnion25.writer;
        org.apache.avro.Schema schema28 = readerUnion25.reader;
        org.apache.avro.C2Resolver.Action action29 = readerUnion25.actualAction;
        org.apache.avro.C2Resolver.Container container30 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) readerUnion25);
        org.apache.avro.Conversion<?> wildcardConversion31 = readerUnion25.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion32 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 100, (org.apache.avro.C2Resolver.Action) readerUnion25);
        org.apache.avro.LogicalType logicalType33 = readerUnion25.logicalType;
        org.junit.Assert.assertNull(schema27);
        org.junit.Assert.assertNull(schema28);
        org.junit.Assert.assertNotNull(action29);
        org.junit.Assert.assertNull(wildcardConversion31);
        org.junit.Assert.assertNull(logicalType33);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3673");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction10 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType9);
        org.apache.avro.C2Resolver.Action.Type type11 = errorAction10.type;
        org.apache.avro.Schema schema12 = errorAction10.reader;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType13 = errorAction10.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction14 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType13);
        org.apache.avro.C2Resolver.ErrorAction errorAction15 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType13);
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH + "'", errorType9.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH));
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type11.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertNull(schema12);
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH + "'", errorType13.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH));
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3674");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.generic.GenericData genericData15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.Schema schema17 = null;
        org.apache.avro.generic.GenericData genericData18 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing19 = new org.apache.avro.C2Resolver.DoNothing(schema16, schema17, genericData18);
        org.apache.avro.C2Resolver.Container container20 = new org.apache.avro.C2Resolver.Container(schema13, schema14, genericData15, (org.apache.avro.C2Resolver.Action) doNothing19);
        org.apache.avro.C2Resolver.Action.Type type21 = container20.type;
        org.apache.avro.C2Resolver.Container container22 = new org.apache.avro.C2Resolver.Container(schema10, schema11, genericData12, (org.apache.avro.C2Resolver.Action) container20);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion23 = new org.apache.avro.C2Resolver.ReaderUnion(schema6, schema7, genericData8, 0, (org.apache.avro.C2Resolver.Action) container22);
        org.apache.avro.C2Resolver.Action action24 = readerUnion23.actualAction;
        org.apache.avro.C2Resolver.Container container25 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, action24);
        org.apache.avro.C2Resolver.Action.Type type26 = action24.type;
        org.apache.avro.C2Resolver.Container container27 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, action24);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type21.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNotNull(action24);
        org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type26.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3675");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.generic.GenericData genericData16 = null;
        org.apache.avro.Schema schema17 = null;
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.generic.GenericData genericData19 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing20 = new org.apache.avro.C2Resolver.DoNothing(schema17, schema18, genericData19);
        org.apache.avro.C2Resolver.Container container21 = new org.apache.avro.C2Resolver.Container(schema14, schema15, genericData16, (org.apache.avro.C2Resolver.Action) doNothing20);
        org.apache.avro.Conversion<?> wildcardConversion22 = doNothing20.conversion;
        org.apache.avro.Conversion<?> wildcardConversion23 = doNothing20.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion24 = new org.apache.avro.C2Resolver.ReaderUnion(schema10, schema11, genericData12, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing20);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion25 = new org.apache.avro.C2Resolver.ReaderUnion(schema6, schema7, genericData8, 35, (org.apache.avro.C2Resolver.Action) readerUnion24);
        org.apache.avro.LogicalType logicalType26 = readerUnion25.logicalType;
        org.apache.avro.Conversion<?> wildcardConversion27 = readerUnion25.conversion;
        org.apache.avro.C2Resolver.Action action28 = readerUnion25.actualAction;
        org.apache.avro.C2Resolver.Container container29 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) readerUnion25);
        org.apache.avro.C2Resolver.Container container30 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) container29);
        org.apache.avro.C2Resolver.Action action31 = container29.elementAction;
        org.apache.avro.Schema schema32 = action31.reader;
        org.apache.avro.Schema schema33 = action31.reader;
        org.junit.Assert.assertNull(wildcardConversion22);
        org.junit.Assert.assertNull(wildcardConversion23);
        org.junit.Assert.assertNull(logicalType26);
        org.junit.Assert.assertNull(wildcardConversion27);
        org.junit.Assert.assertNotNull(action28);
        org.junit.Assert.assertNotNull(action31);
        org.junit.Assert.assertNull(schema32);
        org.junit.Assert.assertNull(schema33);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3676");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType9 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction10 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType9);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType11 = errorAction10.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = errorAction10.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType13 = errorAction10.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction14 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType13);
        org.apache.avro.C2Resolver.ErrorAction errorAction15 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType13);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType16 = errorAction15.error;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = errorAction15.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType9.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType11.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType13.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType16.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3677");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType11 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction12 = new org.apache.avro.C2Resolver.ErrorAction(schema8, schema9, genericData10, errorType11);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion13 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, 100, (org.apache.avro.C2Resolver.Action) errorAction12);
        org.apache.avro.C2Resolver.Action action14 = readerUnion13.actualAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion15 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 52, action14);
        int int16 = readerUnion15.firstMatch;
        int int17 = readerUnion15.firstMatch;
        org.apache.avro.C2Resolver.Action action18 = readerUnion15.actualAction;
        org.apache.avro.LogicalType logicalType19 = action18.logicalType;
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType11.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertNotNull(action14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(action18);
        org.junit.Assert.assertNull(logicalType19);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3678");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing18 = new org.apache.avro.C2Resolver.DoNothing(schema15, schema16, genericData17);
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema12, schema13, genericData14, (org.apache.avro.C2Resolver.Action) doNothing18);
        org.apache.avro.Conversion<?> wildcardConversion20 = doNothing18.conversion;
        org.apache.avro.Conversion<?> wildcardConversion21 = doNothing18.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing18);
        org.apache.avro.LogicalType logicalType23 = readerUnion22.logicalType;
        org.apache.avro.C2Resolver.Action action24 = readerUnion22.actualAction;
        org.apache.avro.C2Resolver.Action action25 = readerUnion22.actualAction;
        int int26 = readerUnion22.firstMatch;
        org.apache.avro.C2Resolver.Action action27 = readerUnion22.actualAction;
        int int28 = readerUnion22.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion29 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (short) 10, (org.apache.avro.C2Resolver.Action) readerUnion22);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion30 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 52, (org.apache.avro.C2Resolver.Action) readerUnion29);
        org.apache.avro.C2Resolver.Action action31 = readerUnion30.actualAction;
        org.junit.Assert.assertNull(wildcardConversion20);
        org.junit.Assert.assertNull(wildcardConversion21);
        org.junit.Assert.assertNull(logicalType23);
        org.junit.Assert.assertNotNull(action24);
        org.junit.Assert.assertNotNull(action25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(action27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertNotNull(action31);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3679");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing12 = new org.apache.avro.C2Resolver.DoNothing(schema9, schema10, genericData11);
        org.apache.avro.C2Resolver.Container container13 = new org.apache.avro.C2Resolver.Container(schema6, schema7, genericData8, (org.apache.avro.C2Resolver.Action) doNothing12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) doNothing12);
        org.apache.avro.Schema schema15 = container14.writer;
        org.apache.avro.C2Resolver.Container container16 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) container14);
        org.apache.avro.C2Resolver.Action action17 = container14.elementAction;
        org.apache.avro.C2Resolver.Action action18 = container14.elementAction;
        org.apache.avro.C2Resolver.Action action19 = container14.elementAction;
        org.junit.Assert.assertNull(schema15);
        org.junit.Assert.assertNotNull(action17);
        org.junit.Assert.assertNotNull(action18);
        org.junit.Assert.assertNotNull(action19);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3680");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing14 = new org.apache.avro.C2Resolver.DoNothing(schema11, schema12, genericData13);
        org.apache.avro.C2Resolver.Container container15 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.LogicalType logicalType16 = container15.logicalType;
        org.apache.avro.C2Resolver.Action action17 = container15.elementAction;
        org.apache.avro.Conversion<?> wildcardConversion18 = action17.conversion;
        org.apache.avro.Schema schema19 = action17.writer;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion20 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (byte) -1, action17);
        org.apache.avro.C2Resolver.Action action21 = readerUnion20.actualAction;
        int int22 = readerUnion20.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion23 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 10, (org.apache.avro.C2Resolver.Action) readerUnion20);
        org.apache.avro.Schema schema24 = readerUnion20.reader;
        org.junit.Assert.assertNull(logicalType16);
        org.junit.Assert.assertNotNull(action17);
        org.junit.Assert.assertNull(wildcardConversion18);
        org.junit.Assert.assertNull(schema19);
        org.junit.Assert.assertNotNull(action21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(schema24);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3681");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.Action action11 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion12 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, (int) ' ', action11);
        org.apache.avro.C2Resolver.Container container13 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, action11);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion14 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) '4', (org.apache.avro.C2Resolver.Action) container13);
        int int15 = readerUnion14.firstMatch;
        org.apache.avro.C2Resolver.Action action16 = readerUnion14.actualAction;
        org.apache.avro.Schema schema17 = action16.reader;
        java.lang.Class<?> wildcardClass18 = action16.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(action16);
        org.junit.Assert.assertNull(schema17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3682");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType12);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType15);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction16.error;
        org.apache.avro.Schema schema18 = errorAction16.reader;
        org.apache.avro.Schema schema19 = errorAction16.writer;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType20 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType21 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType22 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType23 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction24 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType23);
        org.apache.avro.C2Resolver.ErrorAction errorAction25 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType23);
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(schema18);
        org.junit.Assert.assertNull(schema19);
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType20.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType21.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType22 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType22.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType23 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType23.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3683");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.generic.GenericData genericData20 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType21 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction22 = new org.apache.avro.C2Resolver.ErrorAction(schema18, schema19, genericData20, errorType21);
        org.apache.avro.C2Resolver.Container container23 = new org.apache.avro.C2Resolver.Container(schema15, schema16, genericData17, (org.apache.avro.C2Resolver.Action) errorAction22);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType24 = errorAction22.error;
        org.apache.avro.LogicalType logicalType25 = errorAction22.logicalType;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType26 = errorAction22.error;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion27 = new org.apache.avro.C2Resolver.ReaderUnion(schema11, schema12, genericData13, (-1), (org.apache.avro.C2Resolver.Action) errorAction22);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion28 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, 32, (org.apache.avro.C2Resolver.Action) readerUnion27);
        int int29 = readerUnion27.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion30 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, (int) ' ', (org.apache.avro.C2Resolver.Action) readerUnion27);
        int int31 = readerUnion30.firstMatch;
        org.apache.avro.C2Resolver.Container container32 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion30);
        org.apache.avro.C2Resolver.Action action33 = container32.elementAction;
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType21.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType24.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(logicalType25);
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType26.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertNotNull(action33);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3684");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.C2Resolver.Skip skip6 = new org.apache.avro.C2Resolver.Skip(schema4, genericData5);
        org.apache.avro.C2Resolver.Action.Type type7 = skip6.type;
        org.apache.avro.Schema schema8 = skip6.reader;
        org.apache.avro.LogicalType logicalType9 = skip6.logicalType;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion10 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 52, (org.apache.avro.C2Resolver.Action) skip6);
        org.apache.avro.LogicalType logicalType11 = readerUnion10.logicalType;
        org.apache.avro.Schema schema12 = readerUnion10.reader;
        org.apache.avro.C2Resolver.Action.Type type13 = readerUnion10.type;
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.C2Resolver.Action.Type.SKIP + "'", type7.equals(org.apache.avro.C2Resolver.Action.Type.SKIP));
        org.junit.Assert.assertNull(schema8);
        org.junit.Assert.assertNull(logicalType9);
        org.junit.Assert.assertNull(logicalType11);
        org.junit.Assert.assertNull(schema12);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type13.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3685");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType13 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction14 = new org.apache.avro.C2Resolver.ErrorAction(schema10, schema11, genericData12, errorType13);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = errorAction14.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema7, schema8, genericData9, errorType15);
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) errorAction16);
        org.apache.avro.LogicalType logicalType18 = errorAction16.logicalType;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion19 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (byte) 0, (org.apache.avro.C2Resolver.Action) errorAction16);
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType13.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(logicalType18);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3686");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing14 = new org.apache.avro.C2Resolver.DoNothing(schema11, schema12, genericData13);
        org.apache.avro.C2Resolver.Container container15 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.Conversion<?> wildcardConversion16 = doNothing14.conversion;
        org.apache.avro.Conversion<?> wildcardConversion17 = doNothing14.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.LogicalType logicalType19 = readerUnion18.logicalType;
        org.apache.avro.Schema schema20 = readerUnion18.writer;
        org.apache.avro.C2Resolver.Action.Type type21 = readerUnion18.type;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 10, (org.apache.avro.C2Resolver.Action) readerUnion18);
        int int23 = readerUnion18.firstMatch;
        org.apache.avro.C2Resolver.Action.Type type24 = readerUnion18.type;
        org.junit.Assert.assertNull(wildcardConversion16);
        org.junit.Assert.assertNull(wildcardConversion17);
        org.junit.Assert.assertNull(logicalType19);
        org.junit.Assert.assertNull(schema20);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type21.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type24.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3687");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType6 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction7 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType6);
        org.apache.avro.C2Resolver.ErrorAction errorAction8 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = errorAction8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType6.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3688");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.generic.GenericData genericData4 = null;
        org.apache.avro.C2Resolver.Skip skip5 = new org.apache.avro.C2Resolver.Skip(schema3, genericData4);
        org.apache.avro.C2Resolver.Action.Type type6 = skip5.type;
        org.apache.avro.Schema schema7 = skip5.reader;
        org.apache.avro.LogicalType logicalType8 = skip5.logicalType;
        org.apache.avro.Schema schema9 = skip5.reader;
        org.apache.avro.C2Resolver.Container container10 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) skip5);
        org.apache.avro.C2Resolver.Action action11 = container10.elementAction;
        org.apache.avro.C2Resolver.Action action12 = container10.elementAction;
        org.apache.avro.Schema schema13 = container10.writer;
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.C2Resolver.Action.Type.SKIP + "'", type6.equals(org.apache.avro.C2Resolver.Action.Type.SKIP));
        org.junit.Assert.assertNull(schema7);
        org.junit.Assert.assertNull(logicalType8);
        org.junit.Assert.assertNull(schema9);
        org.junit.Assert.assertNotNull(action11);
        org.junit.Assert.assertNotNull(action12);
        org.junit.Assert.assertNull(schema13);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3689");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing6 = new org.apache.avro.C2Resolver.DoNothing(schema3, schema4, genericData5);
        org.apache.avro.C2Resolver.Container container7 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) doNothing6);
        org.apache.avro.LogicalType logicalType8 = container7.logicalType;
        org.apache.avro.LogicalType logicalType9 = container7.logicalType;
        org.apache.avro.C2Resolver.Action action10 = container7.elementAction;
        org.apache.avro.Schema schema11 = action10.reader;
        org.junit.Assert.assertNull(logicalType8);
        org.junit.Assert.assertNull(logicalType9);
        org.junit.Assert.assertNotNull(action10);
        org.junit.Assert.assertNull(schema11);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3690");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.Action action14 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion15 = new org.apache.avro.C2Resolver.ReaderUnion(schema10, schema11, genericData12, (int) ' ', action14);
        org.apache.avro.C2Resolver.Container container16 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, action14);
        org.apache.avro.Schema schema17 = container16.writer;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, (int) (short) -1, (org.apache.avro.C2Resolver.Action) container16);
        int int19 = readerUnion18.firstMatch;
        org.apache.avro.C2Resolver.Container container20 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion18);
        org.apache.avro.C2Resolver.Action.Type type21 = readerUnion18.type;
        org.apache.avro.Schema schema22 = readerUnion18.writer;
        org.junit.Assert.assertNull(schema17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type21.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertNull(schema22);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3691");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion12 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 35, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.Schema schema13 = readerUnion12.reader;
        int int14 = readerUnion12.firstMatch;
        org.apache.avro.C2Resolver.Action action15 = readerUnion12.actualAction;
        org.apache.avro.C2Resolver.Action action16 = readerUnion12.actualAction;
        org.apache.avro.Conversion<?> wildcardConversion17 = readerUnion12.conversion;
        org.apache.avro.LogicalType logicalType18 = readerUnion12.logicalType;
        int int19 = readerUnion12.firstMatch;
        org.apache.avro.C2Resolver.Action action20 = readerUnion12.actualAction;
        org.apache.avro.LogicalType logicalType21 = readerUnion12.logicalType;
        org.apache.avro.C2Resolver.Action action22 = readerUnion12.actualAction;
        org.junit.Assert.assertNull(schema13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(action15);
        org.junit.Assert.assertNotNull(action16);
        org.junit.Assert.assertNull(wildcardConversion17);
        org.junit.Assert.assertNull(logicalType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(action20);
        org.junit.Assert.assertNull(logicalType21);
        org.junit.Assert.assertNotNull(action22);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3692");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.generic.GenericData genericData15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.Schema schema17 = null;
        org.apache.avro.generic.GenericData genericData18 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.Schema schema20 = null;
        org.apache.avro.generic.GenericData genericData21 = null;
        org.apache.avro.Schema schema22 = null;
        org.apache.avro.Schema schema23 = null;
        org.apache.avro.generic.GenericData genericData24 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType25 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction26 = new org.apache.avro.C2Resolver.ErrorAction(schema22, schema23, genericData24, errorType25);
        org.apache.avro.C2Resolver.ErrorAction errorAction27 = new org.apache.avro.C2Resolver.ErrorAction(schema19, schema20, genericData21, errorType25);
        org.apache.avro.C2Resolver.ErrorAction errorAction28 = new org.apache.avro.C2Resolver.ErrorAction(schema16, schema17, genericData18, errorType25);
        org.apache.avro.C2Resolver.ErrorAction errorAction29 = new org.apache.avro.C2Resolver.ErrorAction(schema13, schema14, genericData15, errorType25);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType30 = errorAction29.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType31 = errorAction29.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction32 = new org.apache.avro.C2Resolver.ErrorAction(schema10, schema11, genericData12, errorType31);
        org.apache.avro.C2Resolver.ErrorAction errorAction33 = new org.apache.avro.C2Resolver.ErrorAction(schema7, schema8, genericData9, errorType31);
        org.apache.avro.C2Resolver.ErrorAction errorAction34 = new org.apache.avro.C2Resolver.ErrorAction(schema4, schema5, genericData6, errorType31);
        org.apache.avro.C2Resolver.Action.Type type35 = errorAction34.type;
        org.apache.avro.LogicalType logicalType36 = errorAction34.logicalType;
        org.apache.avro.Conversion<?> wildcardConversion37 = errorAction34.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion38 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (byte) 10, (org.apache.avro.C2Resolver.Action) errorAction34);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType39 = errorAction34.error;
        org.apache.avro.LogicalType logicalType40 = errorAction34.logicalType;
        org.junit.Assert.assertTrue("'" + errorType25 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType25.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType30 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType30.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType31 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType31.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + type35 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type35.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertNull(logicalType36);
        org.junit.Assert.assertNull(wildcardConversion37);
        org.junit.Assert.assertTrue("'" + errorType39 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType39.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertNull(logicalType40);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3693");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType18 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction19 = new org.apache.avro.C2Resolver.ErrorAction(schema15, schema16, genericData17, errorType18);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion20 = new org.apache.avro.C2Resolver.ReaderUnion(schema11, schema12, genericData13, (int) (short) 0, (org.apache.avro.C2Resolver.Action) errorAction19);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion21 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, (int) '#', (org.apache.avro.C2Resolver.Action) errorAction19);
        org.apache.avro.C2Resolver.Container container22 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) errorAction19);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion23 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) ' ', (org.apache.avro.C2Resolver.Action) errorAction19);
        org.apache.avro.C2Resolver.Action action24 = readerUnion23.actualAction;
        org.apache.avro.Schema schema25 = readerUnion23.writer;
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType18.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNotNull(action24);
        org.junit.Assert.assertNull(schema25);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3694");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.generic.GenericData genericData15 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType16 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction17 = new org.apache.avro.C2Resolver.ErrorAction(schema13, schema14, genericData15, errorType16);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType18 = errorAction17.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType19 = errorAction17.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction20 = new org.apache.avro.C2Resolver.ErrorAction(schema10, schema11, genericData12, errorType19);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion21 = new org.apache.avro.C2Resolver.ReaderUnion(schema6, schema7, genericData8, (int) (short) 100, (org.apache.avro.C2Resolver.Action) errorAction20);
        org.apache.avro.Conversion<?> wildcardConversion22 = errorAction20.conversion;
        org.apache.avro.Conversion<?> wildcardConversion23 = errorAction20.conversion;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType24 = errorAction20.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction25 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType24);
        org.apache.avro.C2Resolver.ErrorAction errorAction26 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType24);
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType16.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType18.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType19.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(wildcardConversion22);
        org.junit.Assert.assertNull(wildcardConversion23);
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType24.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3695");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType10 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction11 = new org.apache.avro.C2Resolver.ErrorAction(schema7, schema8, genericData9, errorType10);
        org.apache.avro.C2Resolver.ErrorAction errorAction12 = new org.apache.avro.C2Resolver.ErrorAction(schema4, schema5, genericData6, errorType10);
        org.apache.avro.Conversion<?> wildcardConversion13 = errorAction12.conversion;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction12.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = errorAction12.error;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion16 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 1, (org.apache.avro.C2Resolver.Action) errorAction12);
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType10.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertNull(wildcardConversion13);
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3696");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing6 = new org.apache.avro.C2Resolver.DoNothing(schema3, schema4, genericData5);
        org.apache.avro.C2Resolver.Container container7 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) doNothing6);
        org.apache.avro.C2Resolver.Action action8 = container7.elementAction;
        org.apache.avro.Schema schema9 = container7.writer;
        org.apache.avro.Conversion<?> wildcardConversion10 = container7.conversion;
        org.apache.avro.C2Resolver.Action.Type type11 = container7.type;
        org.apache.avro.C2Resolver.Action action12 = container7.elementAction;
        org.apache.avro.C2Resolver.Action action13 = container7.elementAction;
        org.apache.avro.C2Resolver.Action action14 = container7.elementAction;
        java.lang.Class<?> wildcardClass15 = action14.getClass();
        org.junit.Assert.assertNotNull(action8);
        org.junit.Assert.assertNull(schema9);
        org.junit.Assert.assertNull(wildcardConversion10);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.C2Resolver.Action.Type.CONTAINER + "'", type11.equals(org.apache.avro.C2Resolver.Action.Type.CONTAINER));
        org.junit.Assert.assertNotNull(action12);
        org.junit.Assert.assertNotNull(action13);
        org.junit.Assert.assertNotNull(action14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3697");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.C2Resolver.Action action19 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion20 = new org.apache.avro.C2Resolver.ReaderUnion(schema15, schema16, genericData17, (int) ' ', action19);
        org.apache.avro.C2Resolver.Container container21 = new org.apache.avro.C2Resolver.Container(schema12, schema13, genericData14, action19);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, (int) '4', (org.apache.avro.C2Resolver.Action) container21);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion23 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (byte) 10, (org.apache.avro.C2Resolver.Action) readerUnion22);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion24 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) '4', (org.apache.avro.C2Resolver.Action) readerUnion22);
        org.apache.avro.C2Resolver.Action action25 = readerUnion22.actualAction;
        org.junit.Assert.assertNotNull(action25);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3698");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.Schema schema17 = null;
        org.apache.avro.generic.GenericData genericData18 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing19 = new org.apache.avro.C2Resolver.DoNothing(schema16, schema17, genericData18);
        org.apache.avro.LogicalType logicalType20 = doNothing19.logicalType;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion21 = new org.apache.avro.C2Resolver.ReaderUnion(schema12, schema13, genericData14, (int) (short) 10, (org.apache.avro.C2Resolver.Action) doNothing19);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, 1, (org.apache.avro.C2Resolver.Action) readerUnion21);
        org.apache.avro.C2Resolver.Action action23 = readerUnion21.actualAction;
        int int24 = readerUnion21.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion25 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) 'a', (org.apache.avro.C2Resolver.Action) readerUnion21);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion26 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (-1), (org.apache.avro.C2Resolver.Action) readerUnion21);
        org.junit.Assert.assertNull(logicalType20);
        org.junit.Assert.assertNotNull(action23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3699");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing14 = new org.apache.avro.C2Resolver.DoNothing(schema11, schema12, genericData13);
        org.apache.avro.C2Resolver.Container container15 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.Conversion<?> wildcardConversion16 = doNothing14.conversion;
        org.apache.avro.Conversion<?> wildcardConversion17 = doNothing14.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion19 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 35, (org.apache.avro.C2Resolver.Action) readerUnion18);
        org.apache.avro.C2Resolver.Action action20 = readerUnion18.actualAction;
        org.apache.avro.LogicalType logicalType21 = readerUnion18.logicalType;
        org.junit.Assert.assertNull(wildcardConversion16);
        org.junit.Assert.assertNull(wildcardConversion17);
        org.junit.Assert.assertNotNull(action20);
        org.junit.Assert.assertNull(logicalType21);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3700");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.generic.GenericData genericData15 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType16 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction17 = new org.apache.avro.C2Resolver.ErrorAction(schema13, schema14, genericData15, errorType16);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType18 = errorAction17.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType19 = errorAction17.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction20 = new org.apache.avro.C2Resolver.ErrorAction(schema10, schema11, genericData12, errorType19);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion21 = new org.apache.avro.C2Resolver.ReaderUnion(schema6, schema7, genericData8, (int) (short) 100, (org.apache.avro.C2Resolver.Action) errorAction20);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType22 = errorAction20.error;
        org.apache.avro.C2Resolver.Container container23 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) errorAction20);
        org.apache.avro.LogicalType logicalType24 = errorAction20.logicalType;
        org.apache.avro.Schema schema25 = errorAction20.writer;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType26 = errorAction20.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType27 = errorAction20.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction28 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType27);
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType16.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType18.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType19.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType22 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType22.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(logicalType24);
        org.junit.Assert.assertNull(schema25);
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType26.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType27 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType27.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3701");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType12 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction13 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType12);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType14 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = errorAction13.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType15);
        org.apache.avro.C2Resolver.ErrorAction errorAction17 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType15);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType18 = errorAction17.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction19 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType18);
        org.apache.avro.C2Resolver.Action.Type type20 = errorAction19.type;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType21 = errorAction19.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType22 = errorAction19.error;
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType12.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType14.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType18.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type20.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType21.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType22 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType22.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3702");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing14 = new org.apache.avro.C2Resolver.DoNothing(schema11, schema12, genericData13);
        org.apache.avro.C2Resolver.Container container15 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.Conversion<?> wildcardConversion16 = doNothing14.conversion;
        org.apache.avro.Conversion<?> wildcardConversion17 = doNothing14.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.LogicalType logicalType19 = readerUnion18.logicalType;
        org.apache.avro.C2Resolver.Action action20 = readerUnion18.actualAction;
        org.apache.avro.C2Resolver.Action action21 = readerUnion18.actualAction;
        org.apache.avro.Conversion<?> wildcardConversion22 = readerUnion18.conversion;
        org.apache.avro.C2Resolver.Action action23 = readerUnion18.actualAction;
        org.apache.avro.C2Resolver.Action action24 = readerUnion18.actualAction;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion25 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (-1), (org.apache.avro.C2Resolver.Action) readerUnion18);
        org.apache.avro.Schema schema26 = readerUnion18.reader;
        org.junit.Assert.assertNull(wildcardConversion16);
        org.junit.Assert.assertNull(wildcardConversion17);
        org.junit.Assert.assertNull(logicalType19);
        org.junit.Assert.assertNotNull(action20);
        org.junit.Assert.assertNotNull(action21);
        org.junit.Assert.assertNull(wildcardConversion22);
        org.junit.Assert.assertNotNull(action23);
        org.junit.Assert.assertNotNull(action24);
        org.junit.Assert.assertNull(schema26);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3703");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.generic.GenericData genericData20 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType21 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction22 = new org.apache.avro.C2Resolver.ErrorAction(schema18, schema19, genericData20, errorType21);
        org.apache.avro.C2Resolver.Container container23 = new org.apache.avro.C2Resolver.Container(schema15, schema16, genericData17, (org.apache.avro.C2Resolver.Action) errorAction22);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType24 = errorAction22.error;
        org.apache.avro.LogicalType logicalType25 = errorAction22.logicalType;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType26 = errorAction22.error;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion27 = new org.apache.avro.C2Resolver.ReaderUnion(schema11, schema12, genericData13, (-1), (org.apache.avro.C2Resolver.Action) errorAction22);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion28 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, 32, (org.apache.avro.C2Resolver.Action) readerUnion27);
        org.apache.avro.C2Resolver.Container container29 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) readerUnion28);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion30 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 1, (org.apache.avro.C2Resolver.Action) container29);
        org.apache.avro.C2Resolver.Action.Type type31 = readerUnion30.type;
        int int32 = readerUnion30.firstMatch;
        org.apache.avro.Schema schema33 = readerUnion30.writer;
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType21.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType24.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(logicalType25);
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType26.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type31.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(schema33);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3704");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing14 = new org.apache.avro.C2Resolver.DoNothing(schema11, schema12, genericData13);
        org.apache.avro.C2Resolver.Container container15 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.Conversion<?> wildcardConversion16 = doNothing14.conversion;
        org.apache.avro.Conversion<?> wildcardConversion17 = doNothing14.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion19 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 35, (org.apache.avro.C2Resolver.Action) readerUnion18);
        org.apache.avro.Conversion<?> wildcardConversion20 = readerUnion19.conversion;
        org.apache.avro.Conversion<?> wildcardConversion21 = readerUnion19.conversion;
        int int22 = readerUnion19.firstMatch;
        int int23 = readerUnion19.firstMatch;
        org.junit.Assert.assertNull(wildcardConversion16);
        org.junit.Assert.assertNull(wildcardConversion17);
        org.junit.Assert.assertNull(wildcardConversion20);
        org.junit.Assert.assertNull(wildcardConversion21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3705");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema12, schema13, genericData14, errorType15);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction16.error;
        org.apache.avro.C2Resolver.Action.Type type18 = errorAction16.type;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType19 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType20 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction21 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType20);
        org.apache.avro.C2Resolver.ErrorAction errorAction22 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType20);
        org.apache.avro.C2Resolver.ErrorAction errorAction23 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType20);
        org.apache.avro.C2Resolver.ErrorAction errorAction24 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType20);
        java.lang.Class<?> wildcardClass25 = errorType20.getClass();
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type18.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType19.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType20.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3706");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.C2Resolver.Action action9 = null;
        org.apache.avro.C2Resolver.Container container10 = new org.apache.avro.C2Resolver.Container(schema6, schema7, genericData8, action9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, action9);
        org.apache.avro.LogicalType logicalType12 = container11.logicalType;
        org.apache.avro.C2Resolver.Action action13 = container11.elementAction;
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) container11);
        org.apache.avro.C2Resolver.Action action15 = container14.elementAction;
        org.apache.avro.Schema schema16 = container14.writer;
        org.apache.avro.Schema schema17 = container14.reader;
        org.junit.Assert.assertNull(logicalType12);
        org.junit.Assert.assertNull(action13);
        org.junit.Assert.assertNotNull(action15);
        org.junit.Assert.assertNull(schema16);
        org.junit.Assert.assertNull(schema17);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3707");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.generic.GenericData genericData16 = null;
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.generic.GenericData genericData20 = null;
        org.apache.avro.C2Resolver.Action action22 = null;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion23 = new org.apache.avro.C2Resolver.ReaderUnion(schema18, schema19, genericData20, (int) ' ', action22);
        int int24 = readerUnion23.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion25 = new org.apache.avro.C2Resolver.ReaderUnion(schema14, schema15, genericData16, 0, (org.apache.avro.C2Resolver.Action) readerUnion23);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion26 = new org.apache.avro.C2Resolver.ReaderUnion(schema10, schema11, genericData12, (int) (byte) 0, (org.apache.avro.C2Resolver.Action) readerUnion25);
        org.apache.avro.Schema schema27 = readerUnion25.reader;
        org.apache.avro.C2Resolver.Container container28 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) readerUnion25);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion29 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, 0, (org.apache.avro.C2Resolver.Action) readerUnion25);
        org.apache.avro.C2Resolver.Container container30 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion25);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNull(schema27);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3708");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing12 = new org.apache.avro.C2Resolver.DoNothing(schema9, schema10, genericData11);
        org.apache.avro.C2Resolver.Container container13 = new org.apache.avro.C2Resolver.Container(schema6, schema7, genericData8, (org.apache.avro.C2Resolver.Action) doNothing12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema3, schema4, genericData5, (org.apache.avro.C2Resolver.Action) doNothing12);
        org.apache.avro.LogicalType logicalType15 = container14.logicalType;
        org.apache.avro.C2Resolver.Action action16 = container14.elementAction;
        org.apache.avro.C2Resolver.Action action17 = container14.elementAction;
        org.apache.avro.Schema schema18 = action17.reader;
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, action17);
        org.junit.Assert.assertNull(logicalType15);
        org.junit.Assert.assertNotNull(action16);
        org.junit.Assert.assertNotNull(action17);
        org.junit.Assert.assertNull(schema18);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3709");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing14 = new org.apache.avro.C2Resolver.DoNothing(schema11, schema12, genericData13);
        org.apache.avro.C2Resolver.Container container15 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.C2Resolver.Action action16 = container15.elementAction;
        org.apache.avro.Schema schema17 = container15.writer;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, 10, (org.apache.avro.C2Resolver.Action) container15);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion19 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 0, (org.apache.avro.C2Resolver.Action) container15);
        org.apache.avro.Schema schema20 = readerUnion19.reader;
        int int21 = readerUnion19.firstMatch;
        org.apache.avro.C2Resolver.Action action22 = readerUnion19.actualAction;
        org.junit.Assert.assertNotNull(action16);
        org.junit.Assert.assertNull(schema17);
        org.junit.Assert.assertNull(schema20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(action22);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3710");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing7 = new org.apache.avro.C2Resolver.DoNothing(schema4, schema5, genericData6);
        org.apache.avro.LogicalType logicalType8 = doNothing7.logicalType;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion9 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 10, (org.apache.avro.C2Resolver.Action) doNothing7);
        java.lang.Class<?> wildcardClass10 = doNothing7.getClass();
        org.junit.Assert.assertNull(logicalType8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3711");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing14 = new org.apache.avro.C2Resolver.DoNothing(schema11, schema12, genericData13);
        org.apache.avro.C2Resolver.Container container15 = new org.apache.avro.C2Resolver.Container(schema8, schema9, genericData10, (org.apache.avro.C2Resolver.Action) doNothing14);
        org.apache.avro.Conversion<?> wildcardConversion16 = doNothing14.conversion;
        org.apache.avro.Conversion<?> wildcardConversion17 = doNothing14.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion18 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing14);
        int int19 = readerUnion18.firstMatch;
        org.apache.avro.C2Resolver.Action action20 = readerUnion18.actualAction;
        int int21 = readerUnion18.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 0, (org.apache.avro.C2Resolver.Action) readerUnion18);
        org.apache.avro.Schema schema23 = readerUnion22.writer;
        org.apache.avro.C2Resolver.Action.Type type24 = readerUnion22.type;
        int int25 = readerUnion22.firstMatch;
        org.junit.Assert.assertNull(wildcardConversion16);
        org.junit.Assert.assertNull(wildcardConversion17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(action20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNull(schema23);
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type24.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3712");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType6 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction7 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType6);
        org.apache.avro.C2Resolver.Action.Type type8 = errorAction7.type;
        org.apache.avro.Schema schema9 = errorAction7.reader;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType10 = errorAction7.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction11 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType10);
        java.lang.Class<?> wildcardClass12 = errorType10.getClass();
        org.junit.Assert.assertTrue("'" + errorType6 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH + "'", errorType6.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH));
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.C2Resolver.Action.Type.ERROR + "'", type8.equals(org.apache.avro.C2Resolver.Action.Type.ERROR));
        org.junit.Assert.assertNull(schema9);
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH + "'", errorType10.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NO_MATCHING_BRANCH));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3713");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing18 = new org.apache.avro.C2Resolver.DoNothing(schema15, schema16, genericData17);
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema12, schema13, genericData14, (org.apache.avro.C2Resolver.Action) doNothing18);
        org.apache.avro.Conversion<?> wildcardConversion20 = doNothing18.conversion;
        org.apache.avro.Conversion<?> wildcardConversion21 = doNothing18.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing18);
        int int23 = readerUnion22.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion24 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, (int) (byte) -1, (org.apache.avro.C2Resolver.Action) readerUnion22);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion25 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, 10, (org.apache.avro.C2Resolver.Action) readerUnion24);
        org.apache.avro.Schema schema26 = readerUnion25.writer;
        org.apache.avro.Conversion<?> wildcardConversion27 = readerUnion25.conversion;
        org.apache.avro.Conversion<?> wildcardConversion28 = readerUnion25.conversion;
        org.junit.Assert.assertNull(wildcardConversion20);
        org.junit.Assert.assertNull(wildcardConversion21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNull(schema26);
        org.junit.Assert.assertNull(wildcardConversion27);
        org.junit.Assert.assertNull(wildcardConversion28);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3714");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.generic.GenericData genericData11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType15 = org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.C2Resolver.ErrorAction errorAction16 = new org.apache.avro.C2Resolver.ErrorAction(schema12, schema13, genericData14, errorType15);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType17 = errorAction16.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction18 = new org.apache.avro.C2Resolver.ErrorAction(schema9, schema10, genericData11, errorType17);
        org.apache.avro.C2Resolver.ErrorAction errorAction19 = new org.apache.avro.C2Resolver.ErrorAction(schema6, schema7, genericData8, errorType17);
        org.apache.avro.Schema schema20 = errorAction19.reader;
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType21 = errorAction19.error;
        org.apache.avro.C2Resolver.ErrorAction errorAction22 = new org.apache.avro.C2Resolver.ErrorAction(schema3, schema4, genericData5, errorType21);
        org.apache.avro.C2Resolver.ErrorAction errorAction23 = new org.apache.avro.C2Resolver.ErrorAction(schema0, schema1, genericData2, errorType21);
        org.apache.avro.C2Resolver.ErrorAction.ErrorType errorType24 = errorAction23.error;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = errorAction23.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType15.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType17.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(schema20);
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType21.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType24 + "' != '" + org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType24.equals(org.apache.avro.C2Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3715");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.generic.GenericData genericData14 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing18 = new org.apache.avro.C2Resolver.DoNothing(schema15, schema16, genericData17);
        org.apache.avro.C2Resolver.Container container19 = new org.apache.avro.C2Resolver.Container(schema12, schema13, genericData14, (org.apache.avro.C2Resolver.Action) doNothing18);
        org.apache.avro.Conversion<?> wildcardConversion20 = doNothing18.conversion;
        org.apache.avro.Conversion<?> wildcardConversion21 = doNothing18.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion22 = new org.apache.avro.C2Resolver.ReaderUnion(schema8, schema9, genericData10, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing18);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion23 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, 35, (org.apache.avro.C2Resolver.Action) readerUnion22);
        org.apache.avro.C2Resolver.Action action24 = readerUnion22.actualAction;
        org.apache.avro.Schema schema25 = action24.reader;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion26 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 10, action24);
        int int27 = readerUnion26.firstMatch;
        org.junit.Assert.assertNull(wildcardConversion20);
        org.junit.Assert.assertNull(wildcardConversion21);
        org.junit.Assert.assertNotNull(action24);
        org.junit.Assert.assertNull(schema25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3716");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing6 = new org.apache.avro.C2Resolver.DoNothing(schema3, schema4, genericData5);
        org.apache.avro.C2Resolver.Container container7 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) doNothing6);
        org.apache.avro.LogicalType logicalType8 = container7.logicalType;
        org.apache.avro.C2Resolver.Action action9 = container7.elementAction;
        org.apache.avro.LogicalType logicalType10 = action9.logicalType;
        org.apache.avro.Schema schema11 = action9.reader;
        org.junit.Assert.assertNull(logicalType8);
        org.junit.Assert.assertNotNull(action9);
        org.junit.Assert.assertNull(logicalType10);
        org.junit.Assert.assertNull(schema11);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3717");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.generic.GenericData genericData4 = null;
        org.apache.avro.C2Resolver.Skip skip5 = new org.apache.avro.C2Resolver.Skip(schema3, genericData4);
        org.apache.avro.C2Resolver.Action.Type type6 = skip5.type;
        org.apache.avro.Schema schema7 = skip5.reader;
        org.apache.avro.LogicalType logicalType8 = skip5.logicalType;
        org.apache.avro.Schema schema9 = skip5.reader;
        org.apache.avro.C2Resolver.Container container10 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) skip5);
        org.apache.avro.C2Resolver.Action action11 = container10.elementAction;
        org.apache.avro.Schema schema12 = container10.writer;
        org.apache.avro.C2Resolver.Action action13 = container10.elementAction;
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.C2Resolver.Action.Type.SKIP + "'", type6.equals(org.apache.avro.C2Resolver.Action.Type.SKIP));
        org.junit.Assert.assertNull(schema7);
        org.junit.Assert.assertNull(logicalType8);
        org.junit.Assert.assertNull(schema9);
        org.junit.Assert.assertNotNull(action11);
        org.junit.Assert.assertNull(schema12);
        org.junit.Assert.assertNotNull(action13);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3718");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing11 = new org.apache.avro.C2Resolver.DoNothing(schema8, schema9, genericData10);
        org.apache.avro.Schema schema12 = doNothing11.reader;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion13 = new org.apache.avro.C2Resolver.ReaderUnion(schema4, schema5, genericData6, 1, (org.apache.avro.C2Resolver.Action) doNothing11);
        int int14 = readerUnion13.firstMatch;
        org.apache.avro.C2Resolver.Action action15 = readerUnion13.actualAction;
        org.apache.avro.Schema schema16 = readerUnion13.reader;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion17 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) '#', (org.apache.avro.C2Resolver.Action) readerUnion13);
        int int18 = readerUnion13.firstMatch;
        org.apache.avro.C2Resolver.Action action19 = readerUnion13.actualAction;
        org.junit.Assert.assertNull(schema12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(action15);
        org.junit.Assert.assertNull(schema16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(action19);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3719");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.Schema schema12 = container11.writer;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion13 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 10, (org.apache.avro.C2Resolver.Action) container11);
        org.apache.avro.LogicalType logicalType14 = container11.logicalType;
        org.apache.avro.C2Resolver.Action action15 = container11.elementAction;
        org.apache.avro.C2Resolver.Action action16 = container11.elementAction;
        org.apache.avro.C2Resolver.Action action17 = container11.elementAction;
        org.apache.avro.Schema schema18 = container11.writer;
        org.junit.Assert.assertNull(schema12);
        org.junit.Assert.assertNull(logicalType14);
        org.junit.Assert.assertNotNull(action15);
        org.junit.Assert.assertNotNull(action16);
        org.junit.Assert.assertNotNull(action17);
        org.junit.Assert.assertNull(schema18);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3720");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing10 = new org.apache.avro.C2Resolver.DoNothing(schema7, schema8, genericData9);
        org.apache.avro.C2Resolver.Container container11 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.Conversion<?> wildcardConversion12 = doNothing10.conversion;
        org.apache.avro.Conversion<?> wildcardConversion13 = doNothing10.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion14 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing10);
        org.apache.avro.LogicalType logicalType15 = readerUnion14.logicalType;
        org.apache.avro.C2Resolver.Action action16 = readerUnion14.actualAction;
        org.apache.avro.C2Resolver.Action action17 = readerUnion14.actualAction;
        int int18 = readerUnion14.firstMatch;
        int int19 = readerUnion14.firstMatch;
        org.apache.avro.C2Resolver.Action action20 = readerUnion14.actualAction;
        org.apache.avro.Schema schema21 = readerUnion14.reader;
        org.apache.avro.C2Resolver.Action.Type type22 = readerUnion14.type;
        org.apache.avro.C2Resolver.Action action23 = readerUnion14.actualAction;
        org.apache.avro.LogicalType logicalType24 = action23.logicalType;
        org.junit.Assert.assertNull(wildcardConversion12);
        org.junit.Assert.assertNull(wildcardConversion13);
        org.junit.Assert.assertNull(logicalType15);
        org.junit.Assert.assertNotNull(action16);
        org.junit.Assert.assertNotNull(action17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(action20);
        org.junit.Assert.assertNull(schema21);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type22.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertNotNull(action23);
        org.junit.Assert.assertNull(logicalType24);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3721");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.generic.GenericData genericData13 = null;
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.generic.GenericData genericData17 = null;
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.Schema schema20 = null;
        org.apache.avro.generic.GenericData genericData21 = null;
        org.apache.avro.Schema schema22 = null;
        org.apache.avro.Schema schema23 = null;
        org.apache.avro.generic.GenericData genericData24 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing25 = new org.apache.avro.C2Resolver.DoNothing(schema22, schema23, genericData24);
        org.apache.avro.C2Resolver.Container container26 = new org.apache.avro.C2Resolver.Container(schema19, schema20, genericData21, (org.apache.avro.C2Resolver.Action) doNothing25);
        org.apache.avro.Conversion<?> wildcardConversion27 = doNothing25.conversion;
        org.apache.avro.Conversion<?> wildcardConversion28 = doNothing25.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion29 = new org.apache.avro.C2Resolver.ReaderUnion(schema15, schema16, genericData17, (int) '#', (org.apache.avro.C2Resolver.Action) doNothing25);
        int int30 = readerUnion29.firstMatch;
        org.apache.avro.C2Resolver.Action action31 = readerUnion29.actualAction;
        int int32 = readerUnion29.firstMatch;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion33 = new org.apache.avro.C2Resolver.ReaderUnion(schema11, schema12, genericData13, 0, (org.apache.avro.C2Resolver.Action) readerUnion29);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion34 = new org.apache.avro.C2Resolver.ReaderUnion(schema7, schema8, genericData9, (int) 'a', (org.apache.avro.C2Resolver.Action) readerUnion33);
        org.apache.avro.C2Resolver.ReaderUnion readerUnion35 = new org.apache.avro.C2Resolver.ReaderUnion(schema3, schema4, genericData5, (int) (short) 100, (org.apache.avro.C2Resolver.Action) readerUnion34);
        org.apache.avro.Schema schema36 = readerUnion35.reader;
        org.apache.avro.C2Resolver.Action.Type type37 = readerUnion35.type;
        org.apache.avro.C2Resolver.Container container38 = new org.apache.avro.C2Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.C2Resolver.Action) readerUnion35);
        org.apache.avro.Schema schema39 = readerUnion35.writer;
        org.junit.Assert.assertNull(wildcardConversion27);
        org.junit.Assert.assertNull(wildcardConversion28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(action31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNull(schema36);
        org.junit.Assert.assertTrue("'" + type37 + "' != '" + org.apache.avro.C2Resolver.Action.Type.READER_UNION + "'", type37.equals(org.apache.avro.C2Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertNull(schema39);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverC2Test7.test3722");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.generic.GenericData genericData12 = null;
        org.apache.avro.C2Resolver.DoNothing doNothing13 = new org.apache.avro.C2Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.C2Resolver.Container container14 = new org.apache.avro.C2Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.C2Resolver.Action) doNothing13);
        org.apache.avro.C2Resolver.Action action15 = container14.elementAction;
        org.apache.avro.LogicalType logicalType16 = action15.logicalType;
        org.apache.avro.C2Resolver.Container container17 = new org.apache.avro.C2Resolver.Container(schema4, schema5, genericData6, action15);
        org.apache.avro.LogicalType logicalType18 = container17.logicalType;
        org.apache.avro.Conversion<?> wildcardConversion19 = container17.conversion;
        org.apache.avro.Conversion<?> wildcardConversion20 = container17.conversion;
        org.apache.avro.C2Resolver.ReaderUnion readerUnion21 = new org.apache.avro.C2Resolver.ReaderUnion(schema0, schema1, genericData2, (int) '#', (org.apache.avro.C2Resolver.Action) container17);
        org.apache.avro.Schema schema22 = readerUnion21.reader;
        org.junit.Assert.assertNotNull(action15);
        org.junit.Assert.assertNull(logicalType16);
        org.junit.Assert.assertNull(logicalType18);
        org.junit.Assert.assertNull(wildcardConversion19);
        org.junit.Assert.assertNull(wildcardConversion20);
        org.junit.Assert.assertNull(schema22);
    }
}

