import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopUtf8C2ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopUtf8C2ErrorTest0.test01");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_3 = new org.apache.avro.util.C2Utf8(byteArray2);
        int int4 = c2Utf8_3.length();
        org.apache.avro.util.C2Utf8 c2Utf8_5 = new org.apache.avro.util.C2Utf8(c2Utf8_3);
        byte[] byteArray6 = c2Utf8_5.getBytes();
        org.apache.avro.util.C2Utf8 c2Utf8_7 = new org.apache.avro.util.C2Utf8();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_11 = new org.apache.avro.util.C2Utf8(byteArray10);
        int int12 = c2Utf8_11.length();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_16 = new org.apache.avro.util.C2Utf8(byteArray15);
        int int17 = c2Utf8_16.length();
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_21 = new org.apache.avro.util.C2Utf8(byteArray20);
        int int22 = c2Utf8_21.getByteLength();
        int int23 = c2Utf8_16.compareTo(c2Utf8_21);
        org.apache.avro.util.C2Utf8 c2Utf8_25 = c2Utf8_16.setByteLength((int) ' ');
        int int26 = c2Utf8_11.compareTo(c2Utf8_25);
        int int27 = c2Utf8_11.length();
        org.apache.avro.util.C2Utf8 c2Utf8_28 = c2Utf8_7.set(c2Utf8_11);
        java.util.stream.IntStream intStream29 = c2Utf8_7.codePoints();
        org.apache.avro.util.C2Utf8 c2Utf8_30 = c2Utf8_5.set(c2Utf8_7);
        org.apache.avro.util.C2Utf8 c2Utf8_32 = c2Utf8_5.set("hi!");
        org.apache.avro.util.C2Utf8 c2Utf8_34 = c2Utf8_32.setByteLength((int) '#');
        org.apache.avro.util.C2Utf8 c2Utf8_36 = c2Utf8_34.setByteLength((int) '\ufffd');
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_40 = new org.apache.avro.util.C2Utf8(byteArray39);
        int int41 = c2Utf8_40.length();
        byte[] byteArray42 = c2Utf8_40.getBytes();
        org.apache.avro.util.C2Utf8 c2Utf8_43 = new org.apache.avro.util.C2Utf8(byteArray42);
        byte[] byteArray44 = c2Utf8_43.getBytes();
        org.apache.avro.util.C2Utf8 c2Utf8_45 = new org.apache.avro.util.C2Utf8(byteArray44);
        java.util.stream.IntStream intStream46 = c2Utf8_45.codePoints();
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_50 = new org.apache.avro.util.C2Utf8(byteArray49);
        int int51 = c2Utf8_50.length();
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_55 = new org.apache.avro.util.C2Utf8(byteArray54);
        int int56 = c2Utf8_55.getByteLength();
        int int57 = c2Utf8_50.compareTo(c2Utf8_55);
        org.apache.avro.util.C2Utf8 c2Utf8_59 = c2Utf8_50.setByteLength((int) ' ');
        java.lang.String str60 = c2Utf8_50.toString();
        org.apache.avro.util.C2Utf8 c2Utf8_61 = c2Utf8_45.set(c2Utf8_50);
        java.lang.String str62 = c2Utf8_50.toString();
        org.apache.avro.util.C2Utf8 c2Utf8_63 = c2Utf8_36.set(c2Utf8_50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on c2Utf8_63 and c2Utf8_16", c2Utf8_63.equals(c2Utf8_16) ? c2Utf8_63.hashCode() == c2Utf8_16.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopUtf8C2ErrorTest0.test02");
        org.apache.avro.util.C2Utf8 c2Utf8_0 = new org.apache.avro.util.C2Utf8();
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_4 = new org.apache.avro.util.C2Utf8(byteArray3);
        int int5 = c2Utf8_4.length();
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_9 = new org.apache.avro.util.C2Utf8(byteArray8);
        int int10 = c2Utf8_9.length();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_14 = new org.apache.avro.util.C2Utf8(byteArray13);
        int int15 = c2Utf8_14.getByteLength();
        int int16 = c2Utf8_9.compareTo(c2Utf8_14);
        org.apache.avro.util.C2Utf8 c2Utf8_18 = c2Utf8_9.setByteLength((int) ' ');
        int int19 = c2Utf8_4.compareTo(c2Utf8_18);
        int int20 = c2Utf8_4.length();
        org.apache.avro.util.C2Utf8 c2Utf8_21 = c2Utf8_0.set(c2Utf8_4);
        int int22 = c2Utf8_21.length();
        org.apache.avro.util.C2Utf8 c2Utf8_24 = c2Utf8_21.set("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_28 = new org.apache.avro.util.C2Utf8(byteArray27);
        int int29 = c2Utf8_28.length();
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_33 = new org.apache.avro.util.C2Utf8(byteArray32);
        int int34 = c2Utf8_33.getByteLength();
        int int35 = c2Utf8_28.compareTo(c2Utf8_33);
        org.apache.avro.util.C2Utf8 c2Utf8_37 = c2Utf8_28.setByteLength((int) ' ');
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_41 = new org.apache.avro.util.C2Utf8(byteArray40);
        int int42 = c2Utf8_41.length();
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_46 = new org.apache.avro.util.C2Utf8(byteArray45);
        int int47 = c2Utf8_46.length();
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_51 = new org.apache.avro.util.C2Utf8(byteArray50);
        int int52 = c2Utf8_51.getByteLength();
        int int53 = c2Utf8_46.compareTo(c2Utf8_51);
        org.apache.avro.util.C2Utf8 c2Utf8_55 = c2Utf8_46.setByteLength((int) ' ');
        int int56 = c2Utf8_41.compareTo(c2Utf8_55);
        org.apache.avro.util.C2Utf8 c2Utf8_57 = new org.apache.avro.util.C2Utf8();
        org.apache.avro.util.C2Utf8 c2Utf8_58 = c2Utf8_55.set(c2Utf8_57);
        boolean boolean59 = c2Utf8_37.equals((java.lang.Object) c2Utf8_57);
        org.apache.avro.util.C2Utf8 c2Utf8_61 = c2Utf8_37.setByteLength((int) 'a');
        org.apache.avro.util.C2Utf8 c2Utf8_63 = c2Utf8_37.setByteLength((int) '\001');
        java.util.stream.IntStream intStream64 = c2Utf8_63.codePoints();
        org.apache.avro.util.C2Utf8 c2Utf8_65 = c2Utf8_24.set(c2Utf8_63);
        org.apache.avro.util.C2Utf8 c2Utf8_67 = c2Utf8_24.set("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        java.lang.String str68 = c2Utf8_24.toString();
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_72 = new org.apache.avro.util.C2Utf8(byteArray71);
        int int73 = c2Utf8_72.length();
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_77 = new org.apache.avro.util.C2Utf8(byteArray76);
        int int78 = c2Utf8_77.length();
        byte[] byteArray81 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_82 = new org.apache.avro.util.C2Utf8(byteArray81);
        int int83 = c2Utf8_82.getByteLength();
        int int84 = c2Utf8_77.compareTo(c2Utf8_82);
        org.apache.avro.util.C2Utf8 c2Utf8_86 = c2Utf8_77.setByteLength((int) ' ');
        int int87 = c2Utf8_72.compareTo(c2Utf8_86);
        int int88 = c2Utf8_72.length();
        org.apache.avro.util.C2Utf8 c2Utf8_90 = c2Utf8_72.setByteLength((int) '4');
        org.apache.avro.util.C2Utf8 c2Utf8_91 = c2Utf8_24.set(c2Utf8_72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on c2Utf8_91 and c2Utf8_72", c2Utf8_91.equals(c2Utf8_72) ? c2Utf8_91.hashCode() == c2Utf8_72.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopUtf8C2ErrorTest0.test03");
        org.apache.avro.util.C2Utf8 c2Utf8_1 = new org.apache.avro.util.C2Utf8("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_5 = new org.apache.avro.util.C2Utf8(byteArray4);
        int int6 = c2Utf8_5.length();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_10 = new org.apache.avro.util.C2Utf8(byteArray9);
        int int11 = c2Utf8_10.length();
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_15 = new org.apache.avro.util.C2Utf8(byteArray14);
        int int16 = c2Utf8_15.getByteLength();
        int int17 = c2Utf8_10.compareTo(c2Utf8_15);
        org.apache.avro.util.C2Utf8 c2Utf8_19 = c2Utf8_10.setByteLength((int) ' ');
        int int20 = c2Utf8_5.compareTo(c2Utf8_19);
        int int21 = c2Utf8_19.getByteLength();
        java.lang.CharSequence charSequence24 = c2Utf8_19.subSequence((int) '\000', (int) (byte) 1);
        org.apache.avro.util.C2Utf8 c2Utf8_25 = new org.apache.avro.util.C2Utf8(c2Utf8_19);
        org.apache.avro.util.C2Utf8 c2Utf8_26 = c2Utf8_1.set(c2Utf8_25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on c2Utf8_26 and c2Utf8_10", c2Utf8_26.equals(c2Utf8_10) ? c2Utf8_26.hashCode() == c2Utf8_10.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopUtf8C2ErrorTest0.test04");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_3 = new org.apache.avro.util.C2Utf8(byteArray2);
        int int4 = c2Utf8_3.length();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_8 = new org.apache.avro.util.C2Utf8(byteArray7);
        int int9 = c2Utf8_8.length();
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_13 = new org.apache.avro.util.C2Utf8(byteArray12);
        int int14 = c2Utf8_13.getByteLength();
        int int15 = c2Utf8_8.compareTo(c2Utf8_13);
        org.apache.avro.util.C2Utf8 c2Utf8_17 = c2Utf8_8.setByteLength((int) ' ');
        int int18 = c2Utf8_3.compareTo(c2Utf8_17);
        int int19 = c2Utf8_17.getByteLength();
        org.apache.avro.util.C2Utf8 c2Utf8_21 = c2Utf8_17.setByteLength(0);
        int int22 = c2Utf8_17.getByteLength();
        java.lang.String str23 = c2Utf8_17.toString();
        org.apache.avro.util.C2Utf8 c2Utf8_24 = new org.apache.avro.util.C2Utf8();
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_28 = new org.apache.avro.util.C2Utf8(byteArray27);
        int int29 = c2Utf8_28.length();
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_33 = new org.apache.avro.util.C2Utf8(byteArray32);
        int int34 = c2Utf8_33.length();
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_38 = new org.apache.avro.util.C2Utf8(byteArray37);
        int int39 = c2Utf8_38.getByteLength();
        int int40 = c2Utf8_33.compareTo(c2Utf8_38);
        org.apache.avro.util.C2Utf8 c2Utf8_42 = c2Utf8_33.setByteLength((int) ' ');
        int int43 = c2Utf8_28.compareTo(c2Utf8_42);
        int int44 = c2Utf8_28.length();
        org.apache.avro.util.C2Utf8 c2Utf8_45 = c2Utf8_24.set(c2Utf8_28);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_49 = new org.apache.avro.util.C2Utf8(byteArray48);
        int int50 = c2Utf8_49.length();
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_54 = new org.apache.avro.util.C2Utf8(byteArray53);
        int int55 = c2Utf8_54.getByteLength();
        int int56 = c2Utf8_49.compareTo(c2Utf8_54);
        int int57 = c2Utf8_28.compareTo(c2Utf8_49);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_61 = new org.apache.avro.util.C2Utf8(byteArray60);
        int int62 = c2Utf8_61.length();
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_66 = new org.apache.avro.util.C2Utf8(byteArray65);
        int int67 = c2Utf8_66.length();
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_71 = new org.apache.avro.util.C2Utf8(byteArray70);
        int int72 = c2Utf8_71.getByteLength();
        int int73 = c2Utf8_66.compareTo(c2Utf8_71);
        org.apache.avro.util.C2Utf8 c2Utf8_75 = c2Utf8_66.setByteLength((int) ' ');
        int int76 = c2Utf8_61.compareTo(c2Utf8_75);
        org.apache.avro.util.C2Utf8 c2Utf8_77 = new org.apache.avro.util.C2Utf8();
        org.apache.avro.util.C2Utf8 c2Utf8_78 = c2Utf8_75.set(c2Utf8_77);
        boolean boolean79 = c2Utf8_49.equals((java.lang.Object) c2Utf8_78);
        int int80 = c2Utf8_49.getByteLength();
        int int81 = c2Utf8_49.length();
        org.apache.avro.util.C2Utf8 c2Utf8_83 = c2Utf8_49.setByteLength((int) '\n');
        org.apache.avro.util.C2Utf8 c2Utf8_84 = c2Utf8_17.set(c2Utf8_83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on c2Utf8_84 and c2Utf8_83", c2Utf8_84.equals(c2Utf8_83) ? c2Utf8_84.hashCode() == c2Utf8_83.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopUtf8C2ErrorTest0.test05");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_3 = new org.apache.avro.util.C2Utf8(byteArray2);
        int int4 = c2Utf8_3.length();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_8 = new org.apache.avro.util.C2Utf8(byteArray7);
        int int9 = c2Utf8_8.getByteLength();
        int int10 = c2Utf8_3.compareTo(c2Utf8_8);
        org.apache.avro.util.C2Utf8 c2Utf8_11 = new org.apache.avro.util.C2Utf8();
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_15 = new org.apache.avro.util.C2Utf8(byteArray14);
        int int16 = c2Utf8_15.length();
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_20 = new org.apache.avro.util.C2Utf8(byteArray19);
        int int21 = c2Utf8_20.length();
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_25 = new org.apache.avro.util.C2Utf8(byteArray24);
        int int26 = c2Utf8_25.getByteLength();
        int int27 = c2Utf8_20.compareTo(c2Utf8_25);
        org.apache.avro.util.C2Utf8 c2Utf8_29 = c2Utf8_20.setByteLength((int) ' ');
        int int30 = c2Utf8_15.compareTo(c2Utf8_29);
        int int31 = c2Utf8_15.length();
        org.apache.avro.util.C2Utf8 c2Utf8_32 = c2Utf8_11.set(c2Utf8_15);
        org.apache.avro.util.C2Utf8 c2Utf8_33 = c2Utf8_3.set(c2Utf8_15);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_37 = new org.apache.avro.util.C2Utf8(byteArray36);
        int int38 = c2Utf8_37.getByteLength();
        org.apache.avro.util.C2Utf8 c2Utf8_39 = c2Utf8_3.set(c2Utf8_37);
        int int40 = c2Utf8_39.length();
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_44 = new org.apache.avro.util.C2Utf8(byteArray43);
        int int45 = c2Utf8_44.length();
        org.apache.avro.util.C2Utf8 c2Utf8_46 = new org.apache.avro.util.C2Utf8(c2Utf8_44);
        java.util.stream.IntStream intStream47 = c2Utf8_44.codePoints();
        int int48 = org.apache.avro.util.C2Utf8.compareSequences((java.lang.CharSequence) c2Utf8_39, (java.lang.CharSequence) c2Utf8_44);
        org.apache.avro.util.C2Utf8 c2Utf8_49 = new org.apache.avro.util.C2Utf8(c2Utf8_39);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_53 = new org.apache.avro.util.C2Utf8(byteArray52);
        int int54 = c2Utf8_53.length();
        int int55 = c2Utf8_53.length();
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_59 = new org.apache.avro.util.C2Utf8(byteArray58);
        int int60 = c2Utf8_59.length();
        byte[] byteArray61 = c2Utf8_59.getBytes();
        java.lang.CharSequence charSequence64 = c2Utf8_59.subSequence((int) '\000', (int) (byte) 0);
        java.lang.String str65 = c2Utf8_59.toString();
        boolean boolean67 = c2Utf8_59.equals((java.lang.Object) true);
        int int68 = org.apache.avro.util.C2Utf8.compareSequences((java.lang.CharSequence) c2Utf8_53, (java.lang.CharSequence) c2Utf8_59);
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_72 = new org.apache.avro.util.C2Utf8(byteArray71);
        int int73 = c2Utf8_72.length();
        byte[] byteArray74 = c2Utf8_72.getBytes();
        java.lang.CharSequence charSequence77 = c2Utf8_72.subSequence((int) '\000', (int) (byte) 0);
        org.apache.avro.util.C2Utf8 c2Utf8_79 = c2Utf8_72.setByteLength((int) (byte) 100);
        java.lang.String str80 = c2Utf8_79.toString();
        org.apache.avro.util.C2Utf8 c2Utf8_81 = c2Utf8_53.set(c2Utf8_79);
        java.util.stream.IntStream intStream82 = c2Utf8_79.codePoints();
        org.apache.avro.util.C2Utf8 c2Utf8_84 = c2Utf8_79.setByteLength((int) (byte) 10);
        int int85 = c2Utf8_79.getByteLength();
        org.apache.avro.util.C2Utf8 c2Utf8_86 = new org.apache.avro.util.C2Utf8(c2Utf8_79);
        boolean boolean87 = c2Utf8_39.equals((java.lang.Object) c2Utf8_79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on c2Utf8_79 and c2Utf8_86", c2Utf8_79.equals(c2Utf8_86) ? c2Utf8_79.hashCode() == c2Utf8_86.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopUtf8C2ErrorTest0.test06");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_3 = new org.apache.avro.util.C2Utf8(byteArray2);
        int int4 = c2Utf8_3.length();
        byte[] byteArray5 = c2Utf8_3.getBytes();
        java.lang.CharSequence charSequence8 = c2Utf8_3.subSequence((int) '\000', (int) (byte) 0);
        org.apache.avro.util.C2Utf8 c2Utf8_10 = c2Utf8_3.setByteLength((int) (byte) 100);
        java.lang.String str11 = c2Utf8_10.toString();
        java.lang.String str12 = c2Utf8_10.toString();
        java.util.stream.IntStream intStream13 = c2Utf8_10.chars();
        org.apache.avro.util.C2Utf8 c2Utf8_15 = c2Utf8_10.setByteLength(97);
        org.apache.avro.util.C2Utf8 c2Utf8_16 = new org.apache.avro.util.C2Utf8(c2Utf8_15);
        int int17 = c2Utf8_16.getByteLength();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on c2Utf8_3 and c2Utf8_16", c2Utf8_3.equals(c2Utf8_16) ? c2Utf8_3.hashCode() == c2Utf8_16.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopUtf8C2ErrorTest0.test07");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_3 = new org.apache.avro.util.C2Utf8(byteArray2);
        int int4 = c2Utf8_3.length();
        byte[] byteArray5 = c2Utf8_3.getBytes();
        java.lang.CharSequence charSequence8 = c2Utf8_3.subSequence((int) '\000', (int) (byte) 0);
        org.apache.avro.util.C2Utf8 c2Utf8_10 = c2Utf8_3.setByteLength((int) (byte) 100);
        java.lang.String str11 = c2Utf8_10.toString();
        java.lang.String str12 = c2Utf8_10.toString();
        java.util.stream.IntStream intStream13 = c2Utf8_10.chars();
        org.apache.avro.util.C2Utf8 c2Utf8_15 = c2Utf8_10.setByteLength(97);
        org.apache.avro.util.C2Utf8 c2Utf8_16 = new org.apache.avro.util.C2Utf8(c2Utf8_15);
        java.util.stream.IntStream intStream17 = c2Utf8_16.chars();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on c2Utf8_3 and c2Utf8_16", c2Utf8_3.equals(c2Utf8_16) ? c2Utf8_3.hashCode() == c2Utf8_16.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopUtf8C2ErrorTest0.test08");
        org.apache.avro.util.C2Utf8 c2Utf8_1 = new org.apache.avro.util.C2Utf8("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        int int2 = c2Utf8_1.getByteLength();
        java.lang.String str3 = c2Utf8_1.toString();
        org.apache.avro.util.C2Utf8 c2Utf8_4 = new org.apache.avro.util.C2Utf8(c2Utf8_1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_8 = new org.apache.avro.util.C2Utf8(byteArray7);
        org.apache.avro.util.C2Utf8 c2Utf8_9 = new org.apache.avro.util.C2Utf8(c2Utf8_8);
        int int11 = org.apache.avro.util.C2Utf8.compareSequences((java.lang.CharSequence) c2Utf8_9, (java.lang.CharSequence) "");
        int int12 = org.apache.avro.util.C2Utf8.compareSequences((java.lang.CharSequence) c2Utf8_1, (java.lang.CharSequence) c2Utf8_9);
        org.apache.avro.util.C2Utf8 c2Utf8_14 = new org.apache.avro.util.C2Utf8("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        java.lang.String str15 = c2Utf8_14.toString();
        org.apache.avro.util.C2Utf8 c2Utf8_16 = c2Utf8_1.set(c2Utf8_14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on c2Utf8_16 and c2Utf8_14", c2Utf8_16.equals(c2Utf8_14) ? c2Utf8_16.hashCode() == c2Utf8_14.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopUtf8C2ErrorTest0.test09");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_3 = new org.apache.avro.util.C2Utf8(byteArray2);
        int int4 = c2Utf8_3.length();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_8 = new org.apache.avro.util.C2Utf8(byteArray7);
        int int9 = c2Utf8_8.length();
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_13 = new org.apache.avro.util.C2Utf8(byteArray12);
        int int14 = c2Utf8_13.getByteLength();
        int int15 = c2Utf8_8.compareTo(c2Utf8_13);
        org.apache.avro.util.C2Utf8 c2Utf8_17 = c2Utf8_8.setByteLength((int) ' ');
        int int18 = c2Utf8_3.compareTo(c2Utf8_17);
        int int19 = c2Utf8_3.length();
        int int20 = c2Utf8_3.getByteLength();
        org.apache.avro.util.C2Utf8 c2Utf8_21 = new org.apache.avro.util.C2Utf8(c2Utf8_3);
        org.apache.avro.util.C2Utf8 c2Utf8_23 = c2Utf8_21.setByteLength(4);
        java.util.stream.IntStream intStream24 = c2Utf8_23.chars();
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_28 = new org.apache.avro.util.C2Utf8(byteArray27);
        int int29 = c2Utf8_28.length();
        int int30 = c2Utf8_28.length();
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_34 = new org.apache.avro.util.C2Utf8(byteArray33);
        int int35 = c2Utf8_34.length();
        byte[] byteArray36 = c2Utf8_34.getBytes();
        java.lang.CharSequence charSequence39 = c2Utf8_34.subSequence((int) '\000', (int) (byte) 0);
        java.lang.String str40 = c2Utf8_34.toString();
        boolean boolean42 = c2Utf8_34.equals((java.lang.Object) true);
        int int43 = org.apache.avro.util.C2Utf8.compareSequences((java.lang.CharSequence) c2Utf8_28, (java.lang.CharSequence) c2Utf8_34);
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_47 = new org.apache.avro.util.C2Utf8(byteArray46);
        int int48 = c2Utf8_47.length();
        byte[] byteArray49 = c2Utf8_47.getBytes();
        java.lang.CharSequence charSequence52 = c2Utf8_47.subSequence((int) '\000', (int) (byte) 0);
        org.apache.avro.util.C2Utf8 c2Utf8_54 = c2Utf8_47.setByteLength((int) (byte) 100);
        java.lang.String str55 = c2Utf8_54.toString();
        org.apache.avro.util.C2Utf8 c2Utf8_56 = c2Utf8_28.set(c2Utf8_54);
        org.apache.avro.util.C2Utf8 c2Utf8_58 = c2Utf8_54.set("");
        org.apache.avro.util.C2Utf8 c2Utf8_60 = c2Utf8_58.setByteLength(94);
        org.apache.avro.util.C2Utf8 c2Utf8_62 = c2Utf8_58.setByteLength((int) ' ');
        int int63 = org.apache.avro.util.C2Utf8.compareSequences((java.lang.CharSequence) c2Utf8_23, (java.lang.CharSequence) c2Utf8_62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on c2Utf8_8 and c2Utf8_62", c2Utf8_8.equals(c2Utf8_62) ? c2Utf8_8.hashCode() == c2Utf8_62.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopUtf8C2ErrorTest0.test10");
        org.apache.avro.util.C2Utf8 c2Utf8_0 = new org.apache.avro.util.C2Utf8();
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_4 = new org.apache.avro.util.C2Utf8(byteArray3);
        int int5 = c2Utf8_4.length();
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_9 = new org.apache.avro.util.C2Utf8(byteArray8);
        int int10 = c2Utf8_9.length();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_14 = new org.apache.avro.util.C2Utf8(byteArray13);
        int int15 = c2Utf8_14.getByteLength();
        int int16 = c2Utf8_9.compareTo(c2Utf8_14);
        org.apache.avro.util.C2Utf8 c2Utf8_18 = c2Utf8_9.setByteLength((int) ' ');
        int int19 = c2Utf8_4.compareTo(c2Utf8_18);
        int int20 = c2Utf8_4.length();
        org.apache.avro.util.C2Utf8 c2Utf8_21 = c2Utf8_0.set(c2Utf8_4);
        org.apache.avro.util.C2Utf8 c2Utf8_22 = new org.apache.avro.util.C2Utf8(c2Utf8_0);
        org.apache.avro.util.C2Utf8 c2Utf8_24 = c2Utf8_0.set("");
        byte[] byteArray25 = c2Utf8_24.getBytes();
        org.apache.avro.util.C2Utf8 c2Utf8_26 = new org.apache.avro.util.C2Utf8(byteArray25);
        org.apache.avro.util.C2Utf8 c2Utf8_28 = c2Utf8_26.setByteLength((int) 'h');
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_32 = new org.apache.avro.util.C2Utf8(byteArray31);
        int int33 = c2Utf8_32.length();
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_37 = new org.apache.avro.util.C2Utf8(byteArray36);
        int int38 = c2Utf8_37.length();
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_42 = new org.apache.avro.util.C2Utf8(byteArray41);
        int int43 = c2Utf8_42.getByteLength();
        int int44 = c2Utf8_37.compareTo(c2Utf8_42);
        org.apache.avro.util.C2Utf8 c2Utf8_46 = c2Utf8_37.setByteLength((int) ' ');
        int int47 = c2Utf8_32.compareTo(c2Utf8_46);
        int int48 = c2Utf8_32.length();
        byte[] byteArray49 = c2Utf8_32.getBytes();
        java.util.stream.IntStream intStream50 = c2Utf8_32.codePoints();
        org.apache.avro.util.C2Utf8 c2Utf8_52 = c2Utf8_32.set("\000\000\000\000\000\000\000\000\000\000");
        org.apache.avro.util.C2Utf8 c2Utf8_53 = c2Utf8_26.set(c2Utf8_52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on c2Utf8_53 and c2Utf8_52", c2Utf8_53.equals(c2Utf8_52) ? c2Utf8_53.hashCode() == c2Utf8_52.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopUtf8C2ErrorTest0.test11");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_3 = new org.apache.avro.util.C2Utf8(byteArray2);
        int int4 = c2Utf8_3.length();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_8 = new org.apache.avro.util.C2Utf8(byteArray7);
        int int9 = c2Utf8_8.length();
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_13 = new org.apache.avro.util.C2Utf8(byteArray12);
        int int14 = c2Utf8_13.getByteLength();
        int int15 = c2Utf8_8.compareTo(c2Utf8_13);
        org.apache.avro.util.C2Utf8 c2Utf8_17 = c2Utf8_8.setByteLength((int) ' ');
        int int18 = c2Utf8_3.compareTo(c2Utf8_17);
        org.apache.avro.util.C2Utf8 c2Utf8_19 = new org.apache.avro.util.C2Utf8();
        org.apache.avro.util.C2Utf8 c2Utf8_20 = c2Utf8_17.set(c2Utf8_19);
        org.apache.avro.util.C2Utf8 c2Utf8_22 = c2Utf8_19.set("\000\000\000\000\000\000\000\000\000\000");
        int int23 = c2Utf8_22.length();
        org.apache.avro.util.C2Utf8 c2Utf8_25 = c2Utf8_22.set("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.apache.avro.util.C2Utf8 c2Utf8_26 = new org.apache.avro.util.C2Utf8();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_30 = new org.apache.avro.util.C2Utf8(byteArray29);
        int int31 = c2Utf8_30.length();
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_35 = new org.apache.avro.util.C2Utf8(byteArray34);
        int int36 = c2Utf8_35.length();
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_40 = new org.apache.avro.util.C2Utf8(byteArray39);
        int int41 = c2Utf8_40.getByteLength();
        int int42 = c2Utf8_35.compareTo(c2Utf8_40);
        org.apache.avro.util.C2Utf8 c2Utf8_44 = c2Utf8_35.setByteLength((int) ' ');
        int int45 = c2Utf8_30.compareTo(c2Utf8_44);
        int int46 = c2Utf8_30.length();
        org.apache.avro.util.C2Utf8 c2Utf8_47 = c2Utf8_26.set(c2Utf8_30);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_51 = new org.apache.avro.util.C2Utf8(byteArray50);
        int int52 = c2Utf8_51.length();
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_56 = new org.apache.avro.util.C2Utf8(byteArray55);
        int int57 = c2Utf8_56.getByteLength();
        int int58 = c2Utf8_51.compareTo(c2Utf8_56);
        int int59 = c2Utf8_30.compareTo(c2Utf8_51);
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_63 = new org.apache.avro.util.C2Utf8(byteArray62);
        int int64 = c2Utf8_63.length();
        int int65 = c2Utf8_63.length();
        org.apache.avro.util.C2Utf8 c2Utf8_66 = c2Utf8_30.set(c2Utf8_63);
        org.apache.avro.util.C2Utf8 c2Utf8_68 = c2Utf8_66.set("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        java.util.stream.IntStream intStream69 = c2Utf8_68.chars();
        org.apache.avro.util.C2Utf8 c2Utf8_70 = c2Utf8_22.set(c2Utf8_68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on c2Utf8_70 and c2Utf8_68", c2Utf8_70.equals(c2Utf8_68) ? c2Utf8_70.hashCode() == c2Utf8_68.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopUtf8C2ErrorTest0.test12");
        byte[] byteArray1 = org.apache.avro.util.C2Utf8.getBytesFor("\000");
        org.apache.avro.util.C2Utf8 c2Utf8_2 = new org.apache.avro.util.C2Utf8(byteArray1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_6 = new org.apache.avro.util.C2Utf8(byteArray5);
        int int7 = c2Utf8_6.length();
        byte[] byteArray8 = c2Utf8_6.getBytes();
        org.apache.avro.util.C2Utf8 c2Utf8_9 = new org.apache.avro.util.C2Utf8(byteArray8);
        byte[] byteArray10 = c2Utf8_9.getBytes();
        java.lang.Object obj11 = null;
        boolean boolean12 = c2Utf8_9.equals(obj11);
        org.apache.avro.util.C2Utf8 c2Utf8_13 = c2Utf8_2.set(c2Utf8_9);
        int int14 = c2Utf8_2.getByteLength();
        org.apache.avro.util.C2Utf8 c2Utf8_15 = new org.apache.avro.util.C2Utf8(c2Utf8_2);
        java.util.stream.IntStream intStream16 = c2Utf8_15.codePoints();
        org.apache.avro.util.C2Utf8 c2Utf8_18 = c2Utf8_15.set("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        java.lang.Object obj19 = null;
        boolean boolean20 = c2Utf8_15.equals(obj19);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_24 = new org.apache.avro.util.C2Utf8(byteArray23);
        int int25 = c2Utf8_24.length();
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_29 = new org.apache.avro.util.C2Utf8(byteArray28);
        int int30 = c2Utf8_29.length();
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C2Utf8 c2Utf8_34 = new org.apache.avro.util.C2Utf8(byteArray33);
        int int35 = c2Utf8_34.getByteLength();
        int int36 = c2Utf8_29.compareTo(c2Utf8_34);
        org.apache.avro.util.C2Utf8 c2Utf8_38 = c2Utf8_29.setByteLength((int) ' ');
        int int39 = c2Utf8_24.compareTo(c2Utf8_38);
        char char41 = c2Utf8_38.charAt(0);
        org.apache.avro.util.C2Utf8 c2Utf8_42 = new org.apache.avro.util.C2Utf8(c2Utf8_38);
        org.apache.avro.util.C2Utf8 c2Utf8_43 = new org.apache.avro.util.C2Utf8(c2Utf8_42);
        int int44 = c2Utf8_43.length();
        org.apache.avro.util.C2Utf8 c2Utf8_46 = c2Utf8_43.setByteLength(32);
        org.apache.avro.util.C2Utf8 c2Utf8_48 = c2Utf8_46.set("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.apache.avro.util.C2Utf8 c2Utf8_49 = c2Utf8_15.set(c2Utf8_48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on c2Utf8_49 and c2Utf8_29", c2Utf8_49.equals(c2Utf8_29) ? c2Utf8_49.hashCode() == c2Utf8_29.hashCode() : true);
    }
}

