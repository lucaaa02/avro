import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopUtf8C1ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopUtf8C1ErrorTest0.test1");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C1Utf8 c1Utf8_3 = new org.apache.avro.util.C1Utf8(byteArray2);
        int int4 = c1Utf8_3.getByteLength();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C1Utf8 c1Utf8_8 = new org.apache.avro.util.C1Utf8(byteArray7);
        int int9 = c1Utf8_8.length();
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C1Utf8 c1Utf8_13 = new org.apache.avro.util.C1Utf8(byteArray12);
        int int14 = c1Utf8_13.getByteLength();
        int int15 = c1Utf8_8.compareTo(c1Utf8_13);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C1Utf8 c1Utf8_19 = new org.apache.avro.util.C1Utf8(byteArray18);
        int int20 = c1Utf8_19.length();
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C1Utf8 c1Utf8_24 = new org.apache.avro.util.C1Utf8(byteArray23);
        int int25 = c1Utf8_24.getByteLength();
        int int26 = c1Utf8_19.compareTo(c1Utf8_24);
        org.apache.avro.util.C1Utf8 c1Utf8_27 = c1Utf8_8.setFromUtf8(c1Utf8_24);
        org.apache.avro.util.C1Utf8 c1Utf8_29 = c1Utf8_24.setByteLength((int) (short) 0);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C1Utf8 c1Utf8_33 = new org.apache.avro.util.C1Utf8(byteArray32);
        int int34 = c1Utf8_33.length();
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C1Utf8 c1Utf8_38 = new org.apache.avro.util.C1Utf8(byteArray37);
        int int39 = c1Utf8_38.getByteLength();
        int int40 = c1Utf8_33.compareTo(c1Utf8_38);
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C1Utf8 c1Utf8_44 = new org.apache.avro.util.C1Utf8(byteArray43);
        int int45 = c1Utf8_44.length();
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C1Utf8 c1Utf8_49 = new org.apache.avro.util.C1Utf8(byteArray48);
        int int50 = c1Utf8_49.getByteLength();
        int int51 = c1Utf8_44.compareTo(c1Utf8_49);
        org.apache.avro.util.C1Utf8 c1Utf8_52 = c1Utf8_33.setFromUtf8(c1Utf8_49);
        org.apache.avro.util.C1Utf8 c1Utf8_54 = c1Utf8_49.setByteLength((int) (short) 0);
        int int55 = c1Utf8_49.length();
        int int56 = c1Utf8_49.getByteLength();
        java.util.stream.IntStream intStream57 = c1Utf8_49.chars();
        int int58 = org.apache.avro.util.C1Utf8.compareSequences((java.lang.CharSequence) c1Utf8_29, (java.lang.CharSequence) c1Utf8_49);
        boolean boolean59 = c1Utf8_3.equals((java.lang.Object) int58);
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C1Utf8 c1Utf8_63 = new org.apache.avro.util.C1Utf8(byteArray62);
        int int64 = c1Utf8_63.length();
        org.apache.avro.util.C1Utf8 c1Utf8_65 = new org.apache.avro.util.C1Utf8(c1Utf8_63);
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C1Utf8 c1Utf8_69 = new org.apache.avro.util.C1Utf8(byteArray68);
        boolean boolean70 = c1Utf8_65.equals((java.lang.Object) byteArray68);
        int int71 = org.apache.avro.util.C1Utf8.compareSequences((java.lang.CharSequence) c1Utf8_3, (java.lang.CharSequence) c1Utf8_65);
        byte[] byteArray72 = c1Utf8_3.getBytes();
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.avro.util.C1Utf8 c1Utf8_76 = new org.apache.avro.util.C1Utf8(byteArray75);
        int int77 = c1Utf8_76.length();
        org.apache.avro.util.C1Utf8 c1Utf8_78 = new org.apache.avro.util.C1Utf8(c1Utf8_76);
        boolean boolean80 = c1Utf8_76.equals((java.lang.Object) 100L);
        java.util.stream.IntStream intStream81 = c1Utf8_76.codePoints();
        boolean boolean83 = c1Utf8_76.equals((java.lang.Object) true);
        org.apache.avro.util.C1Utf8 c1Utf8_85 = c1Utf8_76.setByteLength((int) (short) 0);
        int int86 = c1Utf8_3.compareTo(c1Utf8_85);
        org.apache.avro.util.C1Utf8 c1Utf8_88 = c1Utf8_3.setFromString("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.apache.avro.util.C1Utf8 c1Utf8_90 = c1Utf8_88.setByteLength((int) (byte) 10);
        org.apache.avro.util.C1Utf8 c1Utf8_91 = new org.apache.avro.util.C1Utf8(c1Utf8_88);
        java.util.stream.IntStream intStream92 = c1Utf8_88.chars();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on c1Utf8_88 and c1Utf8_91", c1Utf8_88.equals(c1Utf8_91) ? c1Utf8_88.hashCode() == c1Utf8_91.hashCode() : true);
    }
}

