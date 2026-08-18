import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopResolverTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverTest7.test3501");
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
        org.apache.avro.Resolver.Action action15 = null;
        org.apache.avro.Resolver.ReaderUnion readerUnion16 = new org.apache.avro.Resolver.ReaderUnion(schema11, schema12, genericData13, (int) ' ', action15);
        org.apache.avro.Resolver.Container container17 = new org.apache.avro.Resolver.Container(schema8, schema9, genericData10, action15);
        org.apache.avro.Resolver.ReaderUnion readerUnion18 = new org.apache.avro.Resolver.ReaderUnion(schema4, schema5, genericData6, (int) '4', (org.apache.avro.Resolver.Action) container17);
        org.apache.avro.Resolver.ReaderUnion readerUnion19 = new org.apache.avro.Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (byte) 10, (org.apache.avro.Resolver.Action) readerUnion18);
        org.apache.avro.Schema schema20 = readerUnion19.writer;
        org.apache.avro.Resolver.Action.Type type21 = readerUnion19.type;
        org.apache.avro.LogicalType logicalType22 = readerUnion19.logicalType;
        org.apache.avro.Schema schema23 = readerUnion19.writer;
        org.apache.avro.Resolver.Action action24 = readerUnion19.actualAction;
        org.junit.Assert.assertNull(schema20);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.avro.Resolver.Action.Type.READER_UNION + "'", type21.equals(org.apache.avro.Resolver.Action.Type.READER_UNION));
        org.junit.Assert.assertNull(logicalType22);
        org.junit.Assert.assertNull(schema23);
        org.junit.Assert.assertNotNull(action24);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverTest7.test3502");
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
        org.apache.avro.Resolver.ErrorAction.ErrorType errorType21 = org.apache.avro.Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH;
        org.apache.avro.Resolver.ErrorAction errorAction22 = new org.apache.avro.Resolver.ErrorAction(schema18, schema19, genericData20, errorType21);
        org.apache.avro.Resolver.ErrorAction errorAction23 = new org.apache.avro.Resolver.ErrorAction(schema15, schema16, genericData17, errorType21);
        org.apache.avro.Resolver.ErrorAction errorAction24 = new org.apache.avro.Resolver.ErrorAction(schema12, schema13, genericData14, errorType21);
        org.apache.avro.Resolver.ErrorAction errorAction25 = new org.apache.avro.Resolver.ErrorAction(schema9, schema10, genericData11, errorType21);
        org.apache.avro.Resolver.ErrorAction.ErrorType errorType26 = errorAction25.error;
        org.apache.avro.Resolver.ErrorAction.ErrorType errorType27 = errorAction25.error;
        org.apache.avro.Resolver.ErrorAction errorAction28 = new org.apache.avro.Resolver.ErrorAction(schema6, schema7, genericData8, errorType27);
        org.apache.avro.Resolver.ErrorAction errorAction29 = new org.apache.avro.Resolver.ErrorAction(schema3, schema4, genericData5, errorType27);
        org.apache.avro.Resolver.ErrorAction errorAction30 = new org.apache.avro.Resolver.ErrorAction(schema0, schema1, genericData2, errorType27);
        org.apache.avro.Resolver.Action.Type type31 = errorAction30.type;
        org.apache.avro.Resolver.Action.Type type32 = errorAction30.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = errorAction30.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.getFullName()\" because \"this.writer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + errorType21 + "' != '" + org.apache.avro.Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType21.equals(org.apache.avro.Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType26 + "' != '" + org.apache.avro.Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType26.equals(org.apache.avro.Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType27 + "' != '" + org.apache.avro.Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType27.equals(org.apache.avro.Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.apache.avro.Resolver.Action.Type.ERROR + "'", type31.equals(org.apache.avro.Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + type32 + "' != '" + org.apache.avro.Resolver.Action.Type.ERROR + "'", type32.equals(org.apache.avro.Resolver.Action.Type.ERROR));
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverTest7.test3503");
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
        org.apache.avro.Resolver.DoNothing doNothing13 = new org.apache.avro.Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.Resolver.Container container14 = new org.apache.avro.Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.Resolver.Action) doNothing13);
        org.apache.avro.Resolver.Action action15 = container14.elementAction;
        org.apache.avro.LogicalType logicalType16 = action15.logicalType;
        org.apache.avro.Resolver.Container container17 = new org.apache.avro.Resolver.Container(schema4, schema5, genericData6, action15);
        org.apache.avro.Resolver.ReaderUnion readerUnion18 = new org.apache.avro.Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 100, (org.apache.avro.Resolver.Action) container17);
        org.apache.avro.Resolver.Action action19 = readerUnion18.actualAction;
        int int20 = readerUnion18.firstMatch;
        org.apache.avro.Resolver.Action action21 = readerUnion18.actualAction;
        org.apache.avro.Schema schema22 = action21.reader;
        org.junit.Assert.assertNotNull(action15);
        org.junit.Assert.assertNull(logicalType16);
        org.junit.Assert.assertNotNull(action19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(action21);
        org.junit.Assert.assertNull(schema22);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverTest7.test3504");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.generic.GenericData genericData9 = null;
        org.apache.avro.Resolver.ErrorAction.ErrorType errorType10 = org.apache.avro.Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES;
        org.apache.avro.Resolver.ErrorAction errorAction11 = new org.apache.avro.Resolver.ErrorAction(schema7, schema8, genericData9, errorType10);
        org.apache.avro.Resolver.ErrorAction.ErrorType errorType12 = errorAction11.error;
        org.apache.avro.Resolver.Action.Type type13 = errorAction11.type;
        org.apache.avro.Resolver.ErrorAction.ErrorType errorType14 = errorAction11.error;
        org.apache.avro.Resolver.ErrorAction.ErrorType errorType15 = errorAction11.error;
        org.apache.avro.Resolver.ErrorAction.ErrorType errorType16 = errorAction11.error;
        org.apache.avro.Resolver.Container container17 = new org.apache.avro.Resolver.Container(schema4, schema5, genericData6, (org.apache.avro.Resolver.Action) errorAction11);
        org.apache.avro.Resolver.ErrorAction.ErrorType errorType18 = errorAction11.error;
        org.apache.avro.Resolver.ErrorAction.ErrorType errorType19 = errorAction11.error;
        org.apache.avro.Resolver.ReaderUnion readerUnion20 = new org.apache.avro.Resolver.ReaderUnion(schema0, schema1, genericData2, 1, (org.apache.avro.Resolver.Action) errorAction11);
        org.apache.avro.Conversion<?> wildcardConversion21 = errorAction11.conversion;
        org.junit.Assert.assertTrue("'" + errorType10 + "' != '" + org.apache.avro.Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType10.equals(org.apache.avro.Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType12 + "' != '" + org.apache.avro.Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType12.equals(org.apache.avro.Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.apache.avro.Resolver.Action.Type.ERROR + "'", type13.equals(org.apache.avro.Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType14 + "' != '" + org.apache.avro.Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType14.equals(org.apache.avro.Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType15 + "' != '" + org.apache.avro.Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType15.equals(org.apache.avro.Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType16 + "' != '" + org.apache.avro.Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType16.equals(org.apache.avro.Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType18 + "' != '" + org.apache.avro.Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType18.equals(org.apache.avro.Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertTrue("'" + errorType19 + "' != '" + org.apache.avro.Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES + "'", errorType19.equals(org.apache.avro.Resolver.ErrorAction.ErrorType.INCOMPATIBLE_SCHEMA_TYPES));
        org.junit.Assert.assertNull(wildcardConversion21);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverTest7.test3505");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.generic.GenericData genericData6 = null;
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.generic.GenericData genericData10 = null;
        org.apache.avro.Resolver.Action action12 = null;
        org.apache.avro.Resolver.ReaderUnion readerUnion13 = new org.apache.avro.Resolver.ReaderUnion(schema8, schema9, genericData10, (int) ' ', action12);
        int int14 = readerUnion13.firstMatch;
        org.apache.avro.Resolver.ReaderUnion readerUnion15 = new org.apache.avro.Resolver.ReaderUnion(schema4, schema5, genericData6, 0, (org.apache.avro.Resolver.Action) readerUnion13);
        org.apache.avro.Resolver.Action action16 = readerUnion13.actualAction;
        int int17 = readerUnion13.firstMatch;
        org.apache.avro.Schema schema18 = readerUnion13.writer;
        org.apache.avro.Resolver.ReaderUnion readerUnion19 = new org.apache.avro.Resolver.ReaderUnion(schema0, schema1, genericData2, (int) (short) 100, (org.apache.avro.Resolver.Action) readerUnion13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNull(action16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNull(schema18);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverTest7.test3506");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.generic.GenericData genericData2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.generic.GenericData genericData5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.generic.GenericData genericData8 = null;
        org.apache.avro.Resolver.ErrorAction.ErrorType errorType9 = org.apache.avro.Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH;
        org.apache.avro.Resolver.ErrorAction errorAction10 = new org.apache.avro.Resolver.ErrorAction(schema6, schema7, genericData8, errorType9);
        org.apache.avro.Resolver.ErrorAction.ErrorType errorType11 = errorAction10.error;
        org.apache.avro.Resolver.Action.Type type12 = errorAction10.type;
        org.apache.avro.Resolver.ErrorAction.ErrorType errorType13 = errorAction10.error;
        org.apache.avro.Resolver.ErrorAction errorAction14 = new org.apache.avro.Resolver.ErrorAction(schema3, schema4, genericData5, errorType13);
        org.apache.avro.Resolver.ErrorAction errorAction15 = new org.apache.avro.Resolver.ErrorAction(schema0, schema1, genericData2, errorType13);
        org.junit.Assert.assertTrue("'" + errorType9 + "' != '" + org.apache.avro.Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType9.equals(org.apache.avro.Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType11 + "' != '" + org.apache.avro.Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType11.equals(org.apache.avro.Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.Resolver.Action.Type.ERROR + "'", type12.equals(org.apache.avro.Resolver.Action.Type.ERROR));
        org.junit.Assert.assertTrue("'" + errorType13 + "' != '" + org.apache.avro.Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH + "'", errorType13.equals(org.apache.avro.Resolver.ErrorAction.ErrorType.SIZES_DONT_MATCH));
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverTest7.test3507");
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
        org.apache.avro.Resolver.ErrorAction.ErrorType errorType17 = org.apache.avro.Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH;
        org.apache.avro.Resolver.ErrorAction errorAction18 = new org.apache.avro.Resolver.ErrorAction(schema14, schema15, genericData16, errorType17);
        org.apache.avro.Resolver.Container container19 = new org.apache.avro.Resolver.Container(schema11, schema12, genericData13, (org.apache.avro.Resolver.Action) errorAction18);
        org.apache.avro.Resolver.ErrorAction.ErrorType errorType20 = errorAction18.error;
        org.apache.avro.LogicalType logicalType21 = errorAction18.logicalType;
        org.apache.avro.Resolver.ErrorAction.ErrorType errorType22 = errorAction18.error;
        org.apache.avro.Resolver.ReaderUnion readerUnion23 = new org.apache.avro.Resolver.ReaderUnion(schema7, schema8, genericData9, (-1), (org.apache.avro.Resolver.Action) errorAction18);
        org.apache.avro.Resolver.ReaderUnion readerUnion24 = new org.apache.avro.Resolver.ReaderUnion(schema3, schema4, genericData5, 32, (org.apache.avro.Resolver.Action) readerUnion23);
        org.apache.avro.Resolver.Action action25 = readerUnion24.actualAction;
        org.apache.avro.Resolver.Container container26 = new org.apache.avro.Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.Resolver.Action) readerUnion24);
        org.junit.Assert.assertTrue("'" + errorType17 + "' != '" + org.apache.avro.Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType17.equals(org.apache.avro.Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertTrue("'" + errorType20 + "' != '" + org.apache.avro.Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType20.equals(org.apache.avro.Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNull(logicalType21);
        org.junit.Assert.assertTrue("'" + errorType22 + "' != '" + org.apache.avro.Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH + "'", errorType22.equals(org.apache.avro.Resolver.ErrorAction.ErrorType.NAMES_DONT_MATCH));
        org.junit.Assert.assertNotNull(action25);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopResolverTest7.test3508");
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
        org.apache.avro.Resolver.DoNothing doNothing13 = new org.apache.avro.Resolver.DoNothing(schema10, schema11, genericData12);
        org.apache.avro.Resolver.Container container14 = new org.apache.avro.Resolver.Container(schema7, schema8, genericData9, (org.apache.avro.Resolver.Action) doNothing13);
        org.apache.avro.Conversion<?> wildcardConversion15 = doNothing13.conversion;
        org.apache.avro.Conversion<?> wildcardConversion16 = doNothing13.conversion;
        org.apache.avro.Resolver.ReaderUnion readerUnion17 = new org.apache.avro.Resolver.ReaderUnion(schema3, schema4, genericData5, (int) '#', (org.apache.avro.Resolver.Action) doNothing13);
        org.apache.avro.LogicalType logicalType18 = readerUnion17.logicalType;
        org.apache.avro.Resolver.Action action19 = readerUnion17.actualAction;
        org.apache.avro.Resolver.Container container20 = new org.apache.avro.Resolver.Container(schema0, schema1, genericData2, (org.apache.avro.Resolver.Action) readerUnion17);
        org.apache.avro.Resolver.Action action21 = container20.elementAction;
        org.apache.avro.Resolver.Action action22 = container20.elementAction;
        org.junit.Assert.assertNull(wildcardConversion15);
        org.junit.Assert.assertNull(wildcardConversion16);
        org.junit.Assert.assertNull(logicalType18);
        org.junit.Assert.assertNotNull(action19);
        org.junit.Assert.assertNotNull(action21);
        org.junit.Assert.assertNotNull(action22);
    }
}

