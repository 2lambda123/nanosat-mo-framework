package esa.nmf.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((int) (byte) -1, (int) (short) 10, 2, (int) 'a');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-281431993483167L) + "'", long4.equals((-281431993483167L)));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey(1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521729L + "'", long1 == 1125912808521729L);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.ccsds.moims.mo.com.structures.ObjectType objectType0 = null;
        try {
            esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType0, (java.lang.Long) 281474993487882L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        esa.mo.com.impl.util.COMServicesProvider cOMServicesProvider0 = null;
        try {
            esa.mo.mc.impl.provider.AlertManager alertManager1 = new esa.mo.mc.impl.provider.AlertManager(cOMServicesProvider0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalAccessError; message: tried to access field org.ccsds.moims.mo.mc.aggregation.structures.GenerationMode.randoop_classUsedFlag from class org.ccsds.moims.mo.mal.structures.Enumeration");
        } catch (java.lang.IllegalAccessError e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("1", (int) (short) 1);
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey(2);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("[281475010265086, 281474993487880, 281475010265081, 281474993487888, -1, 281475010265079, 281474993487875, -1, 100, 281475010265086, 281474993487878, 281474993487886, 281474993487883, 10, 281474993487887, 281474993487873, 281474993487888]", 0);
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((int) (short) -1, (-18), (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-75682021376L) + "'", long4.equals((-75682021376L)));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((int) '#', 5, (-2), (-5));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-5L) + "'", long4.equals((-5L)));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey(11);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11L + "'", long1 == 11L);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.ccsds.moims.mo.mal.structures.URIList uRIList0 = new org.ccsds.moims.mo.mal.structures.URIList();
        java.lang.Integer int1 = uRIList0.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort2 = uRIList0.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.URI uRI4 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet5 = uRI4.getAreaVersion();
        java.lang.String str6 = uRI4.toString();
        double double7 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uRI4);
        try {
            uRIList0.add(5, uRI4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-18) + "'", int1.equals((-18)));
        org.junit.Assert.assertNotNull(uShort2);
        org.junit.Assert.assertNotNull(uOctet5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521828L + "'", long1 == 1125912808521828L);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((-7), 14, (int) (short) 0, 6);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1970264707432442L) + "'", long4.equals((-1970264707432442L)));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("13.0", 16);
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((-5), (int) (byte) 10, 0, (-10));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-10L) + "'", long4.equals((-10L)));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey(17);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 17L + "'", long1 == 17L);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        try {
            esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281475010265086L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UShort argument must not be greater than 65535");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(objectType2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey(7);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7L + "'", long1 == 7L);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey(8);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521736L + "'", long1 == 1125912808521736L);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl6 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl7 = mCServicesConsumer0.getAlertService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
        org.junit.Assert.assertNull(checkConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521728L + "'", long1 == 1125912808521728L);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((int) 'a', 13, (-5), 6);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-83886074L) + "'", long4.equals((-83886074L)));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl2 = mCServicesConsumer0.getCheckService();
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(checkConsumerServiceImpl2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.ccsds.moims.mo.mal.structures.FineTime fineTime1 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str2 = fineTime1.toString();
        boolean boolean4 = fineTime1.equals((java.lang.Object) 1);
        long long5 = fineTime1.getValue();
        org.ccsds.moims.mo.mal.structures.UShort uShort6 = fineTime1.getServiceNumber();
        double double7 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uShort6);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32" + "'", str2.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertNotNull(uShort6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(11, 13, (int) (short) -1, 17);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-16777199L) + "'", long4.equals((-16777199L)));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.ccsds.moims.mo.com.structures.ObjectType objectType0 = null;
        try {
            java.lang.Long long2 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        keyParts0.objectInstance = 281474993487876L;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts4 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType5 = keyParts4.objectType;
        keyParts0.objectType = objectType5;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType5, (java.lang.Long) 281474993487886L);
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertNotNull(objectType5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl7 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("-1", 17);
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(65535, 7, (int) (short) 255, (int) '#');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-281440633749469L) + "'", long4.equals((-281440633749469L)));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("10", (int) ' ');
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 281474993487879L, 281474993487879L, 10L, 10L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        org.ccsds.moims.mo.mal.structures.OctetList octetList10 = new org.ccsds.moims.mo.mal.structures.OctetList();
        boolean boolean11 = longList8.equals((java.lang.Object) octetList10);
        boolean boolean13 = octetList10.equals((java.lang.Object) 10);
        org.ccsds.moims.mo.mal.structures.UShort uShort14 = octetList10.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet15 = octetList10.getAreaVersion();
        double double16 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uOctet15);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(uShort14);
        org.junit.Assert.assertNotNull(uOctet15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        strList3.ensureCapacity((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = strList3.getClass();
        strList3.ensureCapacity((int) (byte) 1);
        java.lang.Short[] shortArray14 = new java.lang.Short[] { (short) 100, (short) 10, (short) 10, (short) -1 };
        java.util.ArrayList<java.lang.Short> shortList15 = new java.util.ArrayList<java.lang.Short>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Short>) shortList15, shortArray14);
        shortList15.ensureCapacity((int) 'a');
        boolean boolean19 = strList3.remove((java.lang.Object) 'a');
        strList3.trimToSize();
        org.ccsds.moims.mo.mal.structures.Time time22 = new org.ccsds.moims.mo.mal.structures.Time((long) '4');
        org.ccsds.moims.mo.mal.structures.UShort uShort23 = time22.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper mCServicesHelper24 = new esa.mo.mc.impl.util.MCServicesHelper();
        boolean boolean25 = uShort23.equals((java.lang.Object) mCServicesHelper24);
        esa.mo.mc.impl.util.MCServicesHelper mCServicesHelper26 = new esa.mo.mc.impl.util.MCServicesHelper();
        org.ccsds.moims.mo.mal.structures.Time time28 = new org.ccsds.moims.mo.mal.structures.Time((long) '4');
        org.ccsds.moims.mo.mal.structures.UShort uShort29 = time28.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper mCServicesHelper30 = new esa.mo.mc.impl.util.MCServicesHelper();
        boolean boolean31 = uShort29.equals((java.lang.Object) mCServicesHelper30);
        org.ccsds.moims.mo.mal.structures.Time time33 = new org.ccsds.moims.mo.mal.structures.Time((long) '4');
        org.ccsds.moims.mo.mal.structures.UShort uShort34 = time33.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper mCServicesHelper35 = new esa.mo.mc.impl.util.MCServicesHelper();
        boolean boolean36 = uShort34.equals((java.lang.Object) mCServicesHelper35);
        esa.mo.mc.impl.util.MCServicesHelper[] mCServicesHelperArray37 = new esa.mo.mc.impl.util.MCServicesHelper[] { mCServicesHelper24, mCServicesHelper26, mCServicesHelper30, mCServicesHelper35 };
        try {
            esa.mo.mc.impl.util.MCServicesHelper[] mCServicesHelperArray38 = strList3.toArray(mCServicesHelperArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(uShort23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(uShort29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(uShort34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(mCServicesHelperArray37);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob2 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray1);
        org.ccsds.moims.mo.mal.structures.Blob blob3 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray1);
        byte[] byteArray4 = blob3.getValue();
        org.ccsds.moims.mo.mal.structures.Blob blob7 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray4, 0, (int) (short) 255);
        org.ccsds.moims.mo.mal.structures.UShort uShort8 = blob7.getServiceNumber();
        double double9 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) blob7);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(uShort8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(100, (-2), (-9), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-150994934L) + "'", long4.equals((-150994934L)));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl2 = mCServicesConsumer0.getAggregationService();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey((int) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.ccsds.moims.mo.mc.check.structures.CheckDefinitionDetails checkDefinitionDetails0 = null;
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = esa.mo.mc.impl.provider.CheckManager.generateCheckObjectType(checkDefinitionDetails0);
        org.junit.Assert.assertNull(objectType1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl4 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey(5);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521733L + "'", long1 == 1125912808521733L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey(14);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 14L + "'", long1 == 14L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey((-5));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-5L) + "'", long1 == (-5L));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey(10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521738L + "'", long1 == 1125912808521738L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl7 = mCServicesConsumer0.getAggregationService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521729L + "'", long1 == 1125912808521729L);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(5, (-13), (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-54156853238L) + "'", long4.equals((-54156853238L)));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.ccsds.moims.mo.mal.structures.ULong uLong0 = new org.ccsds.moims.mo.mal.structures.ULong();
        java.lang.Long long1 = uLong0.getShortForm();
        java.lang.Class<?> wildcardClass2 = uLong0.getClass();
        org.ccsds.moims.mo.mal.structures.UShort uShort3 = uLong0.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet4 = uLong0.getAreaVersion();
        java.math.BigInteger bigInteger5 = uLong0.getValue();
        org.ccsds.moims.mo.mal.structures.UShort uShort6 = uLong0.getAreaNumber();
        double double7 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uShort6);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 281474993487886L + "'", long1.equals(281474993487886L));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(uShort3);
        org.junit.Assert.assertNotNull(uOctet4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(uShort6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts0.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType3 = keyParts0.sourceObjectType;
        try {
            esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType3, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UShort argument must not be greater than 65535");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(objectType3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey(11);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521739L + "'", long1 == 1125912808521739L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl3 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl4 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl4);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl6 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl6);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521738L + "'", long1 == 1125912808521738L);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey(18);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521746L + "'", long1 == 1125912808521746L);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts2 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType3 = keyParts2.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts4 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts4.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType7 = keyParts4.objectType;
        keyParts2.sourceObjectType = objectType7;
        keyParts0.objectType = objectType7;
        try {
            esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType7, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UShort argument must not be greater than 65535");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(objectType7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((int) '#', (int) (byte) -1, 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-4294967264L) + "'", long4.equals((-4294967264L)));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((int) (byte) 1, 11, (int) (short) -1, 3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-16777213L) + "'", long4.equals((-16777213L)));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl4 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl5 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl4);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey((int) (short) 255);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521983L + "'", long1 == 1125912808521983L);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((int) (byte) 1, (int) ' ', (int) (byte) 100, 9);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 281614093385737L + "'", long4.equals(281614093385737L));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey(16);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 16L + "'", long1 == 16L);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey(8);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey((-10));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-10L) + "'", long1 == (-10L));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(14, (int) (short) 1, (int) (short) 255, (int) '#');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3940658247106595L + "'", long4.equals(3940658247106595L));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((int) (short) 10, (int) (byte) 10, (int) (byte) 1, (-11));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-11L) + "'", long4.equals((-11L)));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey(7);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521735L + "'", long1 == 1125912808521735L);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((int) (short) 255, (int) '4', 2, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 71776342433071204L + "'", long4.equals(71776342433071204L));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts0.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType3 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType3, (java.lang.Long) 281474993487876L);
        org.junit.Assert.assertNotNull(objectType3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList6 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList6, floatArray5);
        int int8 = floatList6.size();
        java.util.ListIterator<java.lang.Float> floatItor9 = floatList6.listIterator();
        java.lang.String str10 = floatList6.toString();
        org.ccsds.moims.mo.mal.structures.OctetList octetList11 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray13 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList14 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList14, booleanArray13);
        boolean boolean17 = booleanList14.contains((java.lang.Object) (short) 10);
        boolean boolean18 = octetList11.removeAll((java.util.Collection<java.lang.Boolean>) booleanList14);
        boolean boolean19 = octetList11.isEmpty();
        boolean boolean20 = floatList6.remove((java.lang.Object) octetList11);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray21 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList22 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList22, uShortArray21);
        java.lang.Boolean[] booleanArray26 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList27 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList27, booleanArray26);
        boolean boolean29 = uShortList22.removeAll((java.util.Collection<java.lang.Boolean>) booleanList27);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor30 = uShortList22.listIterator();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 9, 0, 7, (-4), 6, 18, 4, 100, (-4), (-15), (-13), (-18), 9, 4, 18, 18, 18, (-4) };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.util.stream.Stream<java.lang.Integer> intStream52 = intList50.parallelStream();
        boolean boolean53 = uShortList22.contains((java.lang.Object) intStream52);
        java.lang.Object[] objArray54 = uShortList22.toArray();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer55 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl56 = mCServicesConsumer55.getParameterService();
        mCServicesConsumer55.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl58 = mCServicesConsumer55.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl59 = mCServicesConsumer55.getAggregationService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl60 = null;
        mCServicesConsumer55.setCheckService(checkConsumerServiceImpl60);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer62 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl63 = mCServicesConsumer62.getParameterService();
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray64 = new esa.mo.mc.impl.util.MCServicesConsumer[] { mCServicesConsumer55, mCServicesConsumer62 };
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray65 = uShortList22.toArray(mCServicesConsumerArray64);
        java.util.Iterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor66 = uShortList22.iterator();
        int int67 = octetList11.lastIndexOf((java.lang.Object) uShortItor66);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(floatItor9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1.0, 0.0, 100.0, -1.0, 0.0]" + "'", str10.equals("[-1.0, 0.0, 100.0, -1.0, 0.0]"));
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(uShortArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(uShortItor30);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(intStream52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl56);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl58);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl59);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl63);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray64);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray65);
        org.junit.Assert.assertNotNull(uShortItor66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("", 3);
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts0.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType3 = keyParts0.objectType;
        keyParts0.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts6 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType8 = keyParts7.objectType;
        keyParts6.objectType = objectType8;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType8, (java.lang.Long) 281474993487876L);
        keyParts0.sourceObjectType = objectType8;
        keyParts0.objectInstance = 281475010265084L;
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(objectType8);
    }
    
    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl3 = mCServicesConsumer0.getAggregationService();
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.ccsds.moims.mo.mal.structures.ULong uLong0 = new org.ccsds.moims.mo.mal.structures.ULong();
        java.lang.Long long1 = uLong0.getShortForm();
        java.math.BigInteger bigInteger2 = uLong0.getValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = uLong0.equals(obj3);
        org.ccsds.moims.mo.mal.structures.UShort uShort5 = uLong0.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort6 = uLong0.getAreaNumber();
        double double7 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uShort6);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 281474993487886L + "'", long1.equals(281474993487886L));
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uShort5);
        org.junit.Assert.assertNotNull(uShort6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((-10), 8, 4, (-11));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-11L) + "'", long4.equals((-11L)));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.ccsds.moims.mo.mal.structures.Union union1 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Boolean) false);
        byte[] byteArray3 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob4 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray3);
        org.ccsds.moims.mo.mal.structures.Blob blob5 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray3);
        byte[] byteArray6 = blob5.getValue();
        org.ccsds.moims.mo.mal.structures.Blob blob9 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray6, 0, (int) (short) 255);
        org.ccsds.moims.mo.mal.structures.Blob blob10 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray6);
        boolean boolean11 = union1.equals((java.lang.Object) byteArray6);
        org.ccsds.moims.mo.mal.structures.Blob blob14 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray6, (int) (short) 100, 18);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer15 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl16 = mCServicesConsumer15.getCheckService();
        boolean boolean17 = blob14.equals((java.lang.Object) checkConsumerServiceImpl16);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet18 = blob14.getAreaVersion();
        blob14.detach();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(checkConsumerServiceImpl16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(uOctet18);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(1, 5, (int) '4', 4);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 281497323962372L + "'", long4.equals(281497323962372L));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey((int) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521825L + "'", long1 == 1125912808521825L);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("[hi!, -4]", (int) '#');
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl3 = mCServicesConsumer0.getCheckService();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(checkConsumerServiceImpl3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.ccsds.moims.mo.mal.structures.ShortList shortList1 = new org.ccsds.moims.mo.mal.structures.ShortList((int) (byte) 10);
        java.lang.Integer int2 = shortList1.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.Union union4 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Integer) (-4));
        boolean boolean5 = shortList1.remove((java.lang.Object) (-4));
        org.ccsds.moims.mo.mal.structures.Element element6 = shortList1.createElement();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer7 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl8 = mCServicesConsumer7.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl9 = mCServicesConsumer7.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl10 = mCServicesConsumer7.getStatisticService();
        mCServicesConsumer7.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl12 = mCServicesConsumer7.getStatisticService();
        int int13 = shortList1.indexOf((java.lang.Object) statisticConsumerServiceImpl12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2.equals((-9)));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl8);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl9);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl10);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl3 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl4 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl5 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(alertConsumerServiceImpl3);
        org.junit.Assert.assertNull(actionConsumerServiceImpl4);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, 1.0d, 10.0d, 10.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        doubleList5.ensureCapacity((int) ' ');
        org.ccsds.moims.mo.mal.structures.Union union10 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Double) 0.0d);
        boolean boolean11 = doubleList5.contains((java.lang.Object) union10);
        java.lang.Integer int12 = union10.getTypeShortForm();
        java.lang.String str13 = union10.toString();
        double double14 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) union10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12.equals(5));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0.0" + "'", str13.equals("0.0"));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        try {
            org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("[1.0, 1.0]", 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"[1.0, 1.0]\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey((-13));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-13L) + "'", long1 == (-13L));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521728L + "'", long1 == 1125912808521728L);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        keyParts0.objectInstance = 281474993487876L;
        java.lang.Long long4 = keyParts0.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts5 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts6 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType7 = keyParts6.objectType;
        keyParts5.objectType = objectType7;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType7, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts12 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts13 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType14 = keyParts13.objectType;
        keyParts12.objectType = objectType14;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType14, (java.lang.Long) 281474993487889L);
        keyParts0.sourceObjectType = objectType14;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts20 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts20.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType23 = keyParts20.objectType;
        keyParts20.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts26 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts27 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType28 = keyParts27.objectType;
        keyParts26.objectType = objectType28;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType28, (java.lang.Long) 281474993487876L);
        keyParts20.sourceObjectType = objectType28;
        keyParts0.objectType = objectType28;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts34 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts35 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType36 = keyParts35.objectType;
        keyParts34.objectType = objectType36;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType36, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts41 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts42 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType43 = keyParts42.objectType;
        keyParts41.objectType = objectType43;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType43, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts48 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType49 = keyParts48.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts50 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts50.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType53 = keyParts50.objectType;
        keyParts48.sourceObjectType = objectType53;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts56 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts56.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType59 = keyParts56.objectType;
        keyParts56.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts62 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts63 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType64 = keyParts63.objectType;
        keyParts62.objectType = objectType64;
        java.lang.Long long66 = keyParts62.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts67 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType68 = keyParts67.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts69 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts69.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType72 = keyParts69.objectType;
        keyParts67.sourceObjectType = objectType72;
        keyParts62.sourceObjectType = objectType72;
        keyParts56.sourceObjectType = objectType72;
        org.ccsds.moims.mo.com.structures.ObjectType objectType76 = keyParts56.sourceObjectType;
        keyParts48.sourceObjectType = objectType76;
        keyParts0.objectType = objectType76;
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 281474993487876L + "'", long4.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66.equals((-1L)));
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertNotNull(objectType76);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType15 = keyParts14.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts16 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts16.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType19 = keyParts16.objectType;
        keyParts14.sourceObjectType = objectType19;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts22 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts22.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType25 = keyParts22.objectType;
        keyParts22.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts28 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts29 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType30 = keyParts29.objectType;
        keyParts28.objectType = objectType30;
        java.lang.Long long32 = keyParts28.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts33 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType34 = keyParts33.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts35 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts35.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType38 = keyParts35.objectType;
        keyParts33.sourceObjectType = objectType38;
        keyParts28.sourceObjectType = objectType38;
        keyParts22.sourceObjectType = objectType38;
        org.ccsds.moims.mo.com.structures.ObjectType objectType42 = keyParts22.sourceObjectType;
        keyParts14.sourceObjectType = objectType42;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts44 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts44.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType47 = keyParts44.objectType;
        keyParts44.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts50 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts51 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType52 = keyParts51.objectType;
        keyParts50.objectType = objectType52;
        java.lang.Long long54 = keyParts50.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts55 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType56 = keyParts55.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts57 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts57.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType60 = keyParts57.objectType;
        keyParts55.sourceObjectType = objectType60;
        keyParts50.sourceObjectType = objectType60;
        keyParts44.sourceObjectType = objectType60;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType60, (java.lang.Long) 2L);
        keyParts14.objectType = objectType60;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32.equals((-1L)));
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54.equals((-1L)));
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNotNull(objectType60);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("32", 0);
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.ccsds.moims.mo.mal.structures.StringList stringList0 = new org.ccsds.moims.mo.mal.structures.StringList();
        java.lang.Integer int1 = stringList0.getTypeShortForm();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        strList5.ensureCapacity((int) (byte) -1);
        java.util.stream.Stream<java.lang.String> strStream9 = strList5.stream();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.stream.Stream<java.lang.String> strStream14 = strList12.parallelStream();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        strList18.ensureCapacity((int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = strList18.getClass();
        strList18.ensureCapacity((int) (byte) 1);
        java.lang.Short[] shortArray29 = new java.lang.Short[] { (short) 100, (short) 10, (short) 10, (short) -1 };
        java.util.ArrayList<java.lang.Short> shortList30 = new java.util.ArrayList<java.lang.Short>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Short>) shortList30, shortArray29);
        shortList30.ensureCapacity((int) 'a');
        boolean boolean34 = strList18.remove((java.lang.Object) 'a');
        int int35 = strList18.size();
        java.util.stream.Stream<java.lang.String> strStream36 = strList18.parallelStream();
        java.util.stream.Stream[] streamArray38 = new java.util.stream.Stream[3];
        @SuppressWarnings("unchecked") java.util.stream.Stream<java.lang.String>[] strStreamArray39 = (java.util.stream.Stream<java.lang.String>[]) streamArray38;
        strStreamArray39[0] = strStream9;
        strStreamArray39[1] = strStream14;
        strStreamArray39[2] = strStream36;
        java.util.stream.Stream<java.lang.String>[] strStreamArray46 = stringList0.toArray(strStreamArray39);
        org.ccsds.moims.mo.mal.structures.URI uRI48 = new org.ccsds.moims.mo.mal.structures.URI("[4, 18, 18, 100, -18, 18, -18, -1]");
        org.ccsds.moims.mo.mal.structures.UShort uShort49 = uRI48.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.URIList uRIList50 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList50.trimToSize();
        java.lang.String str52 = uRIList50.toString();
        org.ccsds.moims.mo.mal.structures.URIList uRIList53 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList53.trimToSize();
        org.ccsds.moims.mo.mal.structures.UShort uShort55 = uRIList53.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.URI uRI56 = new org.ccsds.moims.mo.mal.structures.URI();
        boolean boolean57 = uRIList53.add(uRI56);
        boolean boolean58 = uRIList50.add(uRI56);
        org.ccsds.moims.mo.mal.structures.URI uRI59 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.Element element60 = uRI59.createElement();
        org.ccsds.moims.mo.mal.structures.URI uRI61 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet62 = uRI61.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet63 = uRI61.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.URI uRI64 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.URI[] uRIArray65 = new org.ccsds.moims.mo.mal.structures.URI[] { uRI48, uRI56, uRI59, uRI61, uRI64 };
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI> uRIList66 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.URI>) uRIList66, uRIArray65);
        java.util.Spliterator<org.ccsds.moims.mo.mal.structures.URI> uRISpliterator68 = uRIList66.spliterator();
        boolean boolean69 = stringList0.equals((java.lang.Object) uRISpliterator68);
        java.lang.Double[] doubleArray74 = new java.lang.Double[] { 10.0d, 1.0d, 10.0d, 10.0d };
        java.util.ArrayList<java.lang.Double> doubleList75 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList75, doubleArray74);
        doubleList75.ensureCapacity((int) ' ');
        doubleList75.trimToSize();
        doubleList75.ensureCapacity(9);
        boolean boolean82 = stringList0.contains((java.lang.Object) doubleList75);
        org.ccsds.moims.mo.mal.structures.UShort uShort83 = stringList0.getServiceNumber();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer84 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl85 = mCServicesConsumer84.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl86 = mCServicesConsumer84.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl87 = mCServicesConsumer84.getStatisticService();
        int int88 = stringList0.indexOf((java.lang.Object) mCServicesConsumer84);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-15) + "'", int1.equals((-15)));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(strStream36);
        org.junit.Assert.assertNotNull(streamArray38);
        org.junit.Assert.assertNotNull(strStreamArray39);
        org.junit.Assert.assertNotNull(strStreamArray46);
        org.junit.Assert.assertNotNull(uShort49);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "[]" + "'", str52.equals("[]"));
        org.junit.Assert.assertNotNull(uShort55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(uOctet62);
        org.junit.Assert.assertNotNull(uOctet63);
        org.junit.Assert.assertNotNull(uRIArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(uRISpliterator68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(uShort83);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl85);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl86);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl1 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl2 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(alertConsumerServiceImpl1);
        org.junit.Assert.assertNull(alertConsumerServiceImpl2);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl1 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl2 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl4 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(alertConsumerServiceImpl1);
        org.junit.Assert.assertNull(alertConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(15, 2, 14, (-9));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-9L) + "'", long4.equals((-9L)));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey((-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.ccsds.moims.mo.mal.structures.URIList uRIList0 = new org.ccsds.moims.mo.mal.structures.URIList();
        java.lang.Integer int1 = uRIList0.getTypeShortForm();
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 10, 100, 100, 18 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.stream.Stream<java.lang.Integer> intStream10 = intList8.stream();
        java.util.ListIterator<java.lang.Integer> intItor12 = intList8.listIterator((int) (byte) 1);
        java.util.Iterator<java.lang.Integer> intItor13 = intList8.iterator();
        int int14 = uRIList0.lastIndexOf((java.lang.Object) intItor13);
        org.ccsds.moims.mo.mal.structures.UShort uShort15 = uRIList0.getServiceNumber();
        double double16 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uShort15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-18) + "'", int1.equals((-18)));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(intItor12);
        org.junit.Assert.assertNotNull(intItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(uShort15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        keyParts0.objectInstance = 281474993487876L;
        java.lang.Long long4 = keyParts0.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts5 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts6 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType7 = keyParts6.objectType;
        keyParts5.objectType = objectType7;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType7, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts12 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts13 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType14 = keyParts13.objectType;
        keyParts12.objectType = objectType14;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType14, (java.lang.Long) 281474993487889L);
        keyParts0.sourceObjectType = objectType14;
        java.lang.Long long21 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType14, true);
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 281474993487876L + "'", long4.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 281474993487889L + "'", long21.equals(281474993487889L));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey((-7));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-7L) + "'", long1 == (-7L));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl1 = mCServicesConsumer0.getCheckService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl3 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl4 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(checkConsumerServiceImpl1);
        org.junit.Assert.assertNull(checkConsumerServiceImpl3);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey(9);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType1, (java.lang.Long) 281474993487884L);
        java.lang.Long long5 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType1, true);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType8 = keyParts7.objectType;
        keyParts7.objectInstance = 281474993487876L;
        java.lang.Long long11 = keyParts7.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts12 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts13 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType14 = keyParts13.objectType;
        keyParts12.objectType = objectType14;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType14, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts19 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts20 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType21 = keyParts20.objectType;
        keyParts19.objectType = objectType21;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType21, (java.lang.Long) 281474993487889L);
        keyParts7.sourceObjectType = objectType21;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType21, (java.lang.Long) (-83886074L));
        java.lang.Long long31 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType1, true);
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 281474993487884L + "'", long5.equals(281474993487884L));
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 281474993487876L + "'", long11.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 281474993487884L + "'", long31.equals(281474993487884L));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl3 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl6 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl7 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl8 = mCServicesConsumer0.getActionService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl10 = mCServicesConsumer0.getCheckService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(alertConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl6);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl7);
        org.junit.Assert.assertNull(actionConsumerServiceImpl8);
        org.junit.Assert.assertNull(checkConsumerServiceImpl10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey((int) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = null;
        mCServicesConsumer0.setParameterService(parameterConsumerServiceImpl8);
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl10 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl11 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl10);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl11);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(0, 6, 16, (-18));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-18L) + "'", long4.equals((-18L)));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.ccsds.moims.mo.mal.structures.LongList longList0 = new org.ccsds.moims.mo.mal.structures.LongList();
        org.ccsds.moims.mo.mal.structures.Element element1 = longList0.createElement();
        java.lang.Integer int2 = longList0.getTypeShortForm();
        int int3 = longList0.size();
        org.ccsds.moims.mo.mal.structures.Blob blob5 = new org.ccsds.moims.mo.mal.structures.Blob("[1.0, 1.0]");
        double double6 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) blob5);
        int int7 = longList0.lastIndexOf((java.lang.Object) blob5);
        org.ccsds.moims.mo.mal.structures.UShort uShort8 = longList0.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort9 = uShort8.getAreaNumber();
        org.junit.Assert.assertNotNull(element1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2.equals((-13)));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(uShort8);
        org.junit.Assert.assertNotNull(uShort9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((int) '4', (-5), (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-20937965471L) + "'", long4.equals((-20937965471L)));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey((-2));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("[10, 100, -1, 100, 10]", 6);
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(0, (-2), (-1), 3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-16777213L) + "'", long4.equals((-16777213L)));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((-13), (int) (short) 10, 2, 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3659131714011136L) + "'", long4.equals((-3659131714011136L)));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey(4);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl6 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl9 = mCServicesConsumer0.getAlertService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey(16);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521744L + "'", long1 == 1125912808521744L);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.ccsds.moims.mo.mal.structures.IntegerList integerList0 = new org.ccsds.moims.mo.mal.structures.IntegerList();
        java.util.stream.Stream<java.lang.Integer> intStream1 = integerList0.stream();
        java.lang.Integer int2 = integerList0.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.Element element3 = integerList0.createElement();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet4 = integerList0.getAreaVersion();
        int int5 = integerList0.size();
        org.ccsds.moims.mo.mal.structures.Element element6 = integerList0.createElement();
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray7 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList8 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList8, uShortArray7);
        java.lang.Boolean[] booleanArray12 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList13 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList13, booleanArray12);
        boolean boolean15 = uShortList8.removeAll((java.util.Collection<java.lang.Boolean>) booleanList13);
        byte[] byteArray18 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob19 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray18);
        org.ccsds.moims.mo.mal.structures.Blob blob20 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray18);
        org.ccsds.moims.mo.mal.structures.UShort uShort21 = blob20.getAreaNumber();
        uShortList8.add((int) (short) 0, uShort21);
        java.lang.Object[] objArray23 = uShortList8.toArray();
        org.ccsds.moims.mo.mal.structures.ShortList shortList25 = new org.ccsds.moims.mo.mal.structures.ShortList((int) (byte) 10);
        java.lang.Integer int26 = shortList25.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.Union union28 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Integer) (-4));
        boolean boolean29 = shortList25.remove((java.lang.Object) (-4));
        org.ccsds.moims.mo.mal.structures.Identifier identifier30 = new org.ccsds.moims.mo.mal.structures.Identifier();
        byte[] byteArray32 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob33 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray32);
        boolean boolean34 = identifier30.equals((java.lang.Object) blob33);
        org.ccsds.moims.mo.mal.structures.UShort uShort35 = blob33.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.StringList stringList36 = new org.ccsds.moims.mo.mal.structures.StringList();
        java.lang.Integer int37 = stringList36.getTypeShortForm();
        java.lang.Long long38 = stringList36.getShortForm();
        org.ccsds.moims.mo.mal.structures.URI uRI39 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet40 = uRI39.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.Element[] elementArray41 = new org.ccsds.moims.mo.mal.structures.Element[] { uShort35, stringList36, uOctet40 };
        org.ccsds.moims.mo.mal.structures.Element[] elementArray42 = shortList25.toArray(elementArray41);
        org.ccsds.moims.mo.mal.structures.URIList uRIList43 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList43.trimToSize();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet45 = uRIList43.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.OctetList octetList46 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray48 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList49 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList49, booleanArray48);
        boolean boolean52 = booleanList49.contains((java.lang.Object) (short) 10);
        boolean boolean53 = octetList46.removeAll((java.util.Collection<java.lang.Boolean>) booleanList49);
        boolean boolean54 = uRIList43.retainAll((java.util.Collection<java.lang.Boolean>) booleanList49);
        boolean boolean55 = shortList25.containsAll((java.util.Collection<java.lang.Boolean>) booleanList49);
        boolean boolean56 = uShortList8.retainAll((java.util.Collection<java.lang.Boolean>) booleanList49);
        java.util.stream.Stream<java.lang.Boolean> booleanStream57 = booleanList49.parallelStream();
        booleanList49.ensureCapacity((-7));
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer60 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl61 = mCServicesConsumer60.getParameterService();
        mCServicesConsumer60.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl63 = mCServicesConsumer60.getAlertService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl64 = mCServicesConsumer60.getActionService();
        boolean boolean65 = booleanList49.equals((java.lang.Object) mCServicesConsumer60);
        boolean boolean66 = integerList0.retainAll((java.util.Collection<java.lang.Boolean>) booleanList49);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2.equals((-11)));
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(uOctet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(uShortArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(uShort21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-9) + "'", int26.equals((-9)));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(uShort35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-15) + "'", int37.equals((-15)));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 281475010265073L + "'", long38.equals(281475010265073L));
        org.junit.Assert.assertNotNull(uOctet40);
        org.junit.Assert.assertNotNull(elementArray41);
        org.junit.Assert.assertNotNull(elementArray42);
        org.junit.Assert.assertNotNull(uOctet45);
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(booleanStream57);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl61);
        org.junit.Assert.assertNull(alertConsumerServiceImpl63);
        org.junit.Assert.assertNull(actionConsumerServiceImpl64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("12", (-7));
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.ccsds.moims.mo.mal.structures.UInteger uInteger0 = new org.ccsds.moims.mo.mal.structures.UInteger();
        java.lang.Integer int1 = uInteger0.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet2 = uInteger0.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.UShort uShort3 = uInteger0.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = uInteger0.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort5 = uInteger0.getAreaNumber();
        java.lang.String str6 = uInteger0.toString();
        org.ccsds.moims.mo.mal.structures.UShort uShort7 = uInteger0.getServiceNumber();
        java.lang.Integer int8 = uInteger0.getTypeShortForm();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer9 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl10 = mCServicesConsumer9.getParameterService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl11 = mCServicesConsumer9.getActionService();
        mCServicesConsumer9.closeConnections();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl13 = mCServicesConsumer9.getActionService();
        boolean boolean14 = uInteger0.equals((java.lang.Object) mCServicesConsumer9);
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl15 = mCServicesConsumer9.getAggregationService();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1.equals(12));
        org.junit.Assert.assertNotNull(uOctet2);
        org.junit.Assert.assertNotNull(uShort3);
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uShort5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        org.junit.Assert.assertNotNull(uShort7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8.equals(12));
        org.junit.Assert.assertNull(parameterConsumerServiceImpl10);
        org.junit.Assert.assertNull(actionConsumerServiceImpl11);
        org.junit.Assert.assertNull(actionConsumerServiceImpl13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl15);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 281474993487879L, 281474993487879L, 10L, 10L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        org.ccsds.moims.mo.mal.structures.OctetList octetList10 = new org.ccsds.moims.mo.mal.structures.OctetList();
        boolean boolean11 = longList8.equals((java.lang.Object) octetList10);
        java.util.stream.Stream<java.lang.Long> longStream12 = longList8.parallelStream();
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray13 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList14 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList14, uShortArray13);
        java.lang.Boolean[] booleanArray18 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList19 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList19, booleanArray18);
        boolean boolean21 = uShortList14.removeAll((java.util.Collection<java.lang.Boolean>) booleanList19);
        boolean boolean22 = longList8.removeAll((java.util.Collection<java.lang.Boolean>) booleanList19);
        longList8.ensureCapacity(11);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 10, 100, 100, 18 };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.util.stream.Stream<java.lang.Integer> intStream33 = intList31.stream();
        java.util.ListIterator<java.lang.Integer> intItor35 = intList31.listIterator((int) (byte) 1);
        java.util.Iterator<java.lang.Integer> intItor36 = intList31.iterator();
        java.util.stream.Stream<java.lang.Integer> intStream37 = intList31.stream();
        int int38 = longList8.indexOf((java.lang.Object) intStream37);
        longList8.ensureCapacity((int) (byte) 100);
        org.ccsds.moims.mo.mal.structures.Duration duration42 = new org.ccsds.moims.mo.mal.structures.Duration((double) ' ');
        org.ccsds.moims.mo.mal.structures.Element element43 = duration42.createElement();
        double double44 = duration42.getValue();
        java.lang.Long long45 = duration42.getShortForm();
        org.ccsds.moims.mo.mal.structures.Element element46 = duration42.createElement();
        org.ccsds.moims.mo.mal.structures.StringList stringList47 = new org.ccsds.moims.mo.mal.structures.StringList();
        org.ccsds.moims.mo.mal.structures.UShort uShort48 = stringList47.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.URIList uRIList49 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList49.trimToSize();
        int int51 = stringList47.lastIndexOf((java.lang.Object) uRIList49);
        org.ccsds.moims.mo.mal.structures.UShort uShort52 = uRIList49.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts53 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType54 = keyParts53.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts55 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType56 = keyParts55.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts57 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts57.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType60 = keyParts57.objectType;
        keyParts55.sourceObjectType = objectType60;
        keyParts53.objectType = objectType60;
        org.ccsds.moims.mo.com.structures.ObjectType objectType63 = keyParts53.objectType;
        boolean boolean64 = uShort52.equals((java.lang.Object) keyParts53);
        boolean boolean65 = duration42.equals((java.lang.Object) keyParts53);
        org.ccsds.moims.mo.com.structures.ObjectType objectType66 = keyParts53.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts67 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType68 = keyParts67.objectType;
        keyParts67.objectInstance = 281474993487876L;
        java.lang.Long long71 = keyParts67.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts72 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts73 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType74 = keyParts73.objectType;
        keyParts72.objectType = objectType74;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType74, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts79 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts80 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType81 = keyParts80.objectType;
        keyParts79.objectType = objectType81;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType81, (java.lang.Long) 281474993487889L);
        keyParts67.sourceObjectType = objectType81;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType81, (java.lang.Long) (-83886074L));
        keyParts53.sourceObjectType = objectType81;
        int int90 = longList8.lastIndexOf((java.lang.Object) keyParts53);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(uShortArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intStream33);
        org.junit.Assert.assertNotNull(intItor35);
        org.junit.Assert.assertNotNull(intItor36);
        org.junit.Assert.assertNotNull(intStream37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 32.0d + "'", double44 == 32.0d);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 281474993487875L + "'", long45.equals(281474993487875L));
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(uShort48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(uShort52);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 281474993487876L + "'", long71.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl6 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl7 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl8 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl9 = null;
        mCServicesConsumer0.setActionService(actionConsumerServiceImpl9);
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl11 = mCServicesConsumer0.getAggregationService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
        org.junit.Assert.assertNull(checkConsumerServiceImpl6);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl7);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl8);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey(13);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521741L + "'", long1 == 1125912808521741L);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.ccsds.moims.mo.mal.structures.DoubleList doubleList1 = new org.ccsds.moims.mo.mal.structures.DoubleList(9);
        java.lang.Integer int2 = doubleList1.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort3 = doubleList1.getAreaNumber();
        doubleList1.clear();
        org.ccsds.moims.mo.mal.structures.URI uRI5 = new org.ccsds.moims.mo.mal.structures.URI();
        java.lang.String str6 = uRI5.toString();
        java.lang.String str7 = uRI5.toString();
        boolean boolean8 = doubleList1.remove((java.lang.Object) uRI5);
        org.ccsds.moims.mo.mal.structures.Element element9 = uRI5.createElement();
        java.lang.Long long10 = uRI5.getShortForm();
        org.ccsds.moims.mo.mal.structures.Element element11 = uRI5.createElement();
        org.ccsds.moims.mo.mal.structures.UShort uShort12 = uRI5.getAreaNumber();
        double double13 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uShort12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2.equals((-5)));
        org.junit.Assert.assertNotNull(uShort3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 281474993487890L + "'", long10.equals(281474993487890L));
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(uShort12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("2", (int) (short) 255);
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("", (int) (short) 1);
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { (-1.0f) };
        java.util.ArrayList<java.lang.Float> floatList2 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList2, floatArray1);
        java.lang.Object obj4 = null;
        boolean boolean5 = floatList2.equals(obj4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        strList9.ensureCapacity((int) (byte) -1);
        java.util.stream.Stream<java.lang.String> strStream13 = strList9.stream();
        boolean boolean14 = floatList2.remove((java.lang.Object) strStream13);
        java.util.stream.Stream<java.lang.Float> floatStream15 = floatList2.parallelStream();
        java.lang.Object obj16 = null;
        int int17 = floatList2.indexOf(obj16);
        boolean boolean19 = floatList2.add((java.lang.Float) 100.0f);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer20 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl21 = mCServicesConsumer20.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl22 = mCServicesConsumer20.getActionService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl23 = mCServicesConsumer20.getStatisticService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl24 = mCServicesConsumer20.getAlertService();
        boolean boolean25 = floatList2.equals((java.lang.Object) mCServicesConsumer20);
        try {
            java.util.List<java.lang.Float> floatList28 = floatList2.subList((-7), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -7");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatStream15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl21);
        org.junit.Assert.assertNull(actionConsumerServiceImpl22);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl23);
        org.junit.Assert.assertNull(alertConsumerServiceImpl24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts2 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType3 = keyParts2.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts4 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts4.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType7 = keyParts4.objectType;
        keyParts2.sourceObjectType = objectType7;
        keyParts0.objectType = objectType7;
        org.ccsds.moims.mo.com.structures.ObjectType objectType10 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType10, (java.lang.Long) 17L);
        java.lang.Long long14 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType10, true);
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertNotNull(objectType10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 17L + "'", long14.equals(17L));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray0 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList1 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList1, uShortArray0);
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList6 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList6, booleanArray5);
        boolean boolean8 = uShortList1.removeAll((java.util.Collection<java.lang.Boolean>) booleanList6);
        byte[] byteArray11 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob12 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray11);
        org.ccsds.moims.mo.mal.structures.Blob blob13 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray11);
        org.ccsds.moims.mo.mal.structures.UShort uShort14 = blob13.getAreaNumber();
        uShortList1.add((int) (short) 0, uShort14);
        java.lang.Object[] objArray16 = uShortList1.toArray();
        org.ccsds.moims.mo.mal.structures.ShortList shortList18 = new org.ccsds.moims.mo.mal.structures.ShortList((int) (byte) 10);
        java.lang.Integer int19 = shortList18.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.Union union21 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Integer) (-4));
        boolean boolean22 = shortList18.remove((java.lang.Object) (-4));
        org.ccsds.moims.mo.mal.structures.Identifier identifier23 = new org.ccsds.moims.mo.mal.structures.Identifier();
        byte[] byteArray25 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob26 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray25);
        boolean boolean27 = identifier23.equals((java.lang.Object) blob26);
        org.ccsds.moims.mo.mal.structures.UShort uShort28 = blob26.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.StringList stringList29 = new org.ccsds.moims.mo.mal.structures.StringList();
        java.lang.Integer int30 = stringList29.getTypeShortForm();
        java.lang.Long long31 = stringList29.getShortForm();
        org.ccsds.moims.mo.mal.structures.URI uRI32 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet33 = uRI32.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.Element[] elementArray34 = new org.ccsds.moims.mo.mal.structures.Element[] { uShort28, stringList29, uOctet33 };
        org.ccsds.moims.mo.mal.structures.Element[] elementArray35 = shortList18.toArray(elementArray34);
        org.ccsds.moims.mo.mal.structures.URIList uRIList36 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList36.trimToSize();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet38 = uRIList36.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.OctetList octetList39 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray41 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList42 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList42, booleanArray41);
        boolean boolean45 = booleanList42.contains((java.lang.Object) (short) 10);
        boolean boolean46 = octetList39.removeAll((java.util.Collection<java.lang.Boolean>) booleanList42);
        boolean boolean47 = uRIList36.retainAll((java.util.Collection<java.lang.Boolean>) booleanList42);
        boolean boolean48 = shortList18.containsAll((java.util.Collection<java.lang.Boolean>) booleanList42);
        boolean boolean49 = uShortList1.retainAll((java.util.Collection<java.lang.Boolean>) booleanList42);
        org.ccsds.moims.mo.mal.structures.Identifier identifier51 = new org.ccsds.moims.mo.mal.structures.Identifier();
        byte[] byteArray53 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob54 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray53);
        boolean boolean55 = identifier51.equals((java.lang.Object) blob54);
        java.lang.String str56 = identifier51.toString();
        org.ccsds.moims.mo.mal.structures.UShort uShort57 = identifier51.getServiceNumber();
        double double58 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uShort57);
        org.ccsds.moims.mo.mal.structures.UShort uShort59 = uShort57.getServiceNumber();
        try {
            org.ccsds.moims.mo.mal.structures.UShort uShort60 = uShortList1.set((-2), uShort57);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(uShortArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(uShort14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-9) + "'", int19.equals((-9)));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(uShort28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-15) + "'", int30.equals((-15)));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 281475010265073L + "'", long31.equals(281475010265073L));
        org.junit.Assert.assertNotNull(uOctet33);
        org.junit.Assert.assertNotNull(elementArray34);
        org.junit.Assert.assertNotNull(elementArray35);
        org.junit.Assert.assertNotNull(uOctet38);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        org.junit.Assert.assertNotNull(uShort57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(uShort59);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.ccsds.moims.mo.mal.structures.LongList longList0 = new org.ccsds.moims.mo.mal.structures.LongList();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet1 = new org.ccsds.moims.mo.mal.structures.UOctet();
        boolean boolean2 = longList0.equals((java.lang.Object) uOctet1);
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) 100, (short) 10, (short) 10, (short) -1 };
        java.util.ArrayList<java.lang.Short> shortList8 = new java.util.ArrayList<java.lang.Short>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Short>) shortList8, shortArray7);
        shortList8.ensureCapacity((int) 'a');
        shortList8.clear();
        boolean boolean13 = shortList8.isEmpty();
        shortList8.clear();
        java.lang.Object[] objArray15 = shortList8.toArray();
        boolean boolean16 = longList0.remove((java.lang.Object) shortList8);
        java.lang.Short[] shortArray21 = new java.lang.Short[] { (short) 100, (short) 10, (short) 10, (short) -1 };
        java.util.ArrayList<java.lang.Short> shortList22 = new java.util.ArrayList<java.lang.Short>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Short>) shortList22, shortArray21);
        shortList22.ensureCapacity((int) 'a');
        org.ccsds.moims.mo.mal.structures.DoubleList doubleList27 = new org.ccsds.moims.mo.mal.structures.DoubleList(16);
        org.ccsds.moims.mo.mal.structures.Element element28 = doubleList27.createElement();
        boolean boolean29 = shortList22.contains((java.lang.Object) doubleList27);
        boolean boolean30 = shortList8.equals((java.lang.Object) doubleList27);
        boolean boolean32 = doubleList27.add((java.lang.Double) 1.0d);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer33 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl34 = mCServicesConsumer33.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl35 = mCServicesConsumer33.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl36 = mCServicesConsumer33.getStatisticService();
        mCServicesConsumer33.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl38 = mCServicesConsumer33.getParameterService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl39 = mCServicesConsumer33.getParameterService();
        mCServicesConsumer33.closeConnections();
        mCServicesConsumer33.closeConnections();
        boolean boolean42 = doubleList27.equals((java.lang.Object) mCServicesConsumer33);
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl43 = null;
        mCServicesConsumer33.setCheckService(checkConsumerServiceImpl43);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl34);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl35);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl36);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl38);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521738L + "'", long1 == 1125912808521738L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType1, (java.lang.Long) 281474993487884L);
        java.lang.Long long5 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType1, true);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType8 = keyParts7.objectType;
        keyParts7.objectInstance = 281474993487876L;
        java.lang.Long long11 = keyParts7.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts12 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts13 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType14 = keyParts13.objectType;
        keyParts12.objectType = objectType14;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType14, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts19 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts20 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType21 = keyParts20.objectType;
        keyParts19.objectType = objectType21;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType21, (java.lang.Long) 281474993487889L);
        keyParts7.sourceObjectType = objectType21;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType21, (java.lang.Long) (-83886074L));
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType31 = keyParts30.objectType;
        keyParts30.objectInstance = 281474993487876L;
        java.lang.Long long34 = keyParts30.objectInstance;
        org.ccsds.moims.mo.com.structures.ObjectType objectType35 = keyParts30.sourceObjectType;
        org.ccsds.moims.mo.com.structures.ObjectType objectType36 = keyParts30.sourceObjectType;
        java.lang.Long long37 = keyParts30.objectInstance;
        keyParts30.objectInstance = 281475010265077L;
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 281474993487884L + "'", long5.equals(281474993487884L));
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 281474993487876L + "'", long11.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 281474993487876L + "'", long34.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 281474993487876L + "'", long37.equals(281474993487876L));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.ccsds.moims.mo.mal.structures.URI uRI0 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet1 = uRI0.getAreaVersion();
        java.lang.String str2 = uRI0.toString();
        double double3 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uRI0);
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = uRI0.getServiceNumber();
        org.junit.Assert.assertNotNull(uOctet1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(uShort4);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey(65535);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808587263L + "'", long1 == 1125912808587263L);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("[100, 10, 10, -1]", (int) ' ');
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.ccsds.moims.mo.mal.structures.OctetList octetList0 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList3 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
        boolean boolean6 = booleanList3.contains((java.lang.Object) (short) 10);
        boolean boolean7 = octetList0.removeAll((java.util.Collection<java.lang.Boolean>) booleanList3);
        boolean boolean8 = octetList0.isEmpty();
        org.ccsds.moims.mo.mal.structures.Time time9 = new org.ccsds.moims.mo.mal.structures.Time();
        java.lang.String str10 = time9.toString();
        org.ccsds.moims.mo.mal.structures.Element element11 = time9.createElement();
        boolean boolean12 = octetList0.equals((java.lang.Object) time9);
        java.lang.Float[] floatArray15 = new java.lang.Float[] { 100.0f, 100.0f };
        java.util.ArrayList<java.lang.Float> floatList16 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList16, floatArray15);
        java.util.Spliterator<java.lang.Float> floatSpliterator18 = floatList16.spliterator();
        java.lang.Float float20 = floatList16.get(0);
        boolean boolean21 = octetList0.remove((java.lang.Object) 0);
        org.ccsds.moims.mo.mal.structures.UShort uShort22 = octetList0.getServiceNumber();
        boolean boolean24 = octetList0.add((java.lang.Byte) (byte) 10);
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 1, 10, 100, 100, 18 };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        java.util.stream.Stream<java.lang.Integer> intStream33 = intList31.stream();
        java.util.ListIterator<java.lang.Integer> intItor35 = intList31.listIterator((int) (byte) 1);
        java.util.Iterator<java.lang.Integer> intItor36 = intList31.iterator();
        java.util.stream.Stream<java.lang.Integer> intStream37 = intList31.parallelStream();
        boolean boolean38 = octetList0.remove((java.lang.Object) intList31);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray39 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList40 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList40, uShortArray39);
        java.lang.Boolean[] booleanArray44 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList45 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList45, booleanArray44);
        boolean boolean47 = uShortList40.removeAll((java.util.Collection<java.lang.Boolean>) booleanList45);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor48 = uShortList40.listIterator();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 9, 0, 7, (-4), 6, 18, 4, 100, (-4), (-15), (-13), (-18), 9, 4, 18, 18, 18, (-4) };
        java.util.ArrayList<java.lang.Integer> intList68 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        java.util.stream.Stream<java.lang.Integer> intStream70 = intList68.parallelStream();
        boolean boolean71 = uShortList40.contains((java.lang.Object) intStream70);
        java.lang.Object[] objArray72 = uShortList40.toArray();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer73 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl74 = mCServicesConsumer73.getParameterService();
        mCServicesConsumer73.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl76 = mCServicesConsumer73.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl77 = mCServicesConsumer73.getAggregationService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl78 = null;
        mCServicesConsumer73.setCheckService(checkConsumerServiceImpl78);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer80 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl81 = mCServicesConsumer80.getParameterService();
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray82 = new esa.mo.mc.impl.util.MCServicesConsumer[] { mCServicesConsumer73, mCServicesConsumer80 };
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray83 = uShortList40.toArray(mCServicesConsumerArray82);
        try {
            esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray84 = octetList0.toArray(mCServicesConsumerArray82);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
        }
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0" + "'", str10.equals("0"));
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(floatSpliterator18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20.equals(100.0f));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(uShort22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intStream33);
        org.junit.Assert.assertNotNull(intItor35);
        org.junit.Assert.assertNotNull(intItor36);
        org.junit.Assert.assertNotNull(intStream37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(uShortArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(uShortItor48);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(intStream70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl74);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl76);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl77);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl81);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray82);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray83);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts14.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType17 = keyParts14.objectType;
        keyParts14.objectInstance = (-281431993483167L);
        org.ccsds.moims.mo.mal.structures.Duration duration22 = new org.ccsds.moims.mo.mal.structures.Duration((double) ' ');
        org.ccsds.moims.mo.mal.structures.Element element23 = duration22.createElement();
        double double24 = duration22.getValue();
        java.lang.Long long25 = duration22.getShortForm();
        org.ccsds.moims.mo.mal.structures.Element element26 = duration22.createElement();
        org.ccsds.moims.mo.mal.structures.StringList stringList27 = new org.ccsds.moims.mo.mal.structures.StringList();
        org.ccsds.moims.mo.mal.structures.UShort uShort28 = stringList27.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.URIList uRIList29 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList29.trimToSize();
        int int31 = stringList27.lastIndexOf((java.lang.Object) uRIList29);
        org.ccsds.moims.mo.mal.structures.UShort uShort32 = uRIList29.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts33 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType34 = keyParts33.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts35 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType36 = keyParts35.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts37 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts37.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType40 = keyParts37.objectType;
        keyParts35.sourceObjectType = objectType40;
        keyParts33.objectType = objectType40;
        org.ccsds.moims.mo.com.structures.ObjectType objectType43 = keyParts33.objectType;
        boolean boolean44 = uShort32.equals((java.lang.Object) keyParts33);
        boolean boolean45 = duration22.equals((java.lang.Object) keyParts33);
        org.ccsds.moims.mo.mal.structures.ShortList shortList48 = new org.ccsds.moims.mo.mal.structures.ShortList((int) (byte) 10);
        java.lang.Integer int49 = shortList48.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort50 = shortList48.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.OctetList octetList51 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Integer int52 = octetList51.getTypeShortForm();
        java.lang.Object[] objArray53 = octetList51.toArray();
        int int54 = shortList48.indexOf((java.lang.Object) objArray53);
        java.util.Iterator<java.lang.Short> shortItor55 = shortList48.iterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts56 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType57 = keyParts56.objectType;
        keyParts56.objectInstance = 281474993487876L;
        java.lang.Long long60 = keyParts56.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts61 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts62 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType63 = keyParts62.objectType;
        keyParts61.objectType = objectType63;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType63, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts68 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts69 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType70 = keyParts69.objectType;
        keyParts68.objectType = objectType70;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType70, (java.lang.Long) 281474993487889L);
        keyParts56.sourceObjectType = objectType70;
        boolean boolean76 = shortList48.equals((java.lang.Object) keyParts56);
        java.lang.Long long77 = keyParts56.objectInstance;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 32.0d + "'", double24 == 32.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 281474993487875L + "'", long25.equals(281474993487875L));
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(uShort28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(uShort32);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(objectType40);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-9) + "'", int49.equals((-9)));
        org.junit.Assert.assertNotNull(uShort50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-7) + "'", int52.equals((-7)));
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(shortItor55);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 281474993487876L + "'", long60.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 281474993487876L + "'", long77.equals(281474993487876L));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 4, 18, 18, 100, (-18), 18, (-18), (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.lang.Boolean[] booleanArray12 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList13 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList13, booleanArray12);
        boolean boolean16 = booleanList13.contains((java.lang.Object) (short) 10);
        boolean boolean17 = intList9.containsAll((java.util.Collection<java.lang.Boolean>) booleanList13);
        java.lang.String str18 = intList9.toString();
        int int19 = intList9.size();
        java.lang.String str20 = intList9.toString();
        int int21 = intList9.size();
        boolean boolean23 = intList9.add((java.lang.Integer) 18);
        org.ccsds.moims.mo.mal.structures.Blob blob25 = new org.ccsds.moims.mo.mal.structures.Blob("[1.0, 1.0]");
        double double26 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) blob25);
        int int27 = intList9.lastIndexOf((java.lang.Object) double26);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[4, 18, 18, 100, -18, 18, -18, -1]" + "'", str18.equals("[4, 18, 18, 100, -18, 18, -18, -1]"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[4, 18, 18, 100, -18, 18, -18, -1]" + "'", str20.equals("[4, 18, 18, 100, -18, 18, -18, -1]"));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey(4);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521732L + "'", long1 == 1125912808521732L);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl1 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl2 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl3 = mCServicesConsumer0.getCheckService();
        org.junit.Assert.assertNull(checkConsumerServiceImpl1);
        org.junit.Assert.assertNull(alertConsumerServiceImpl2);
        org.junit.Assert.assertNull(checkConsumerServiceImpl3);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(7, (-5), 6, 13);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-21374173171L) + "'", long4.equals((-21374173171L)));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = null;
        mCServicesConsumer0.setParameterService(parameterConsumerServiceImpl8);
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl11 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl13 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl14 = mCServicesConsumer0.getAggregationService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl11);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl13);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl14);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = null;
        mCServicesConsumer0.setParameterService(parameterConsumerServiceImpl8);
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl10 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl11 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl10);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType15 = keyParts14.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts16 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts16.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType19 = keyParts16.objectType;
        keyParts14.sourceObjectType = objectType19;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts22 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts22.objectInstance = (-75682021376L);
        java.lang.Long long25 = keyParts22.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts27 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts27.objectInstance = (-75682021376L);
        keyParts27.objectInstance = 281475010265077L;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-75682021376L) + "'", long25.equals((-75682021376L)));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, 1.0d, 10.0d, 10.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        doubleList5.ensureCapacity((int) ' ');
        doubleList5.trimToSize();
        doubleList5.ensureCapacity(9);
        java.util.Spliterator<java.lang.Double> doubleSpliterator12 = doubleList5.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts13 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType14 = keyParts13.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts15 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType16 = keyParts15.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts17 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts17.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType20 = keyParts17.objectType;
        keyParts15.sourceObjectType = objectType20;
        keyParts13.objectType = objectType20;
        int int23 = doubleList5.lastIndexOf((java.lang.Object) keyParts13);
        java.lang.Float[] floatArray29 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList30 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList30, floatArray29);
        int int32 = floatList30.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime34 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str35 = fineTime34.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet36 = fineTime34.getAreaVersion();
        java.lang.String str37 = fineTime34.toString();
        boolean boolean38 = floatList30.remove((java.lang.Object) fineTime34);
        java.util.Spliterator<java.lang.Float> floatSpliterator39 = floatList30.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts40 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long41 = keyParts40.objectInstance;
        int int42 = floatList30.indexOf((java.lang.Object) keyParts40);
        keyParts40.objectInstance = 281474993487884L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType45 = keyParts40.objectType;
        keyParts13.sourceObjectType = objectType45;
        org.ccsds.moims.mo.com.structures.ObjectType objectType48 = null;
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleSpliterator12);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "32" + "'", str35.equals("32"));
        org.junit.Assert.assertNotNull(uOctet36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "32" + "'", str37.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(floatSpliterator39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(objectType45);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray19 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList20 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList20, floatArray19);
        int int22 = floatList20.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime24 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str25 = fineTime24.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet26 = fineTime24.getAreaVersion();
        java.lang.String str27 = fineTime24.toString();
        boolean boolean28 = floatList20.remove((java.lang.Object) fineTime24);
        java.util.Spliterator<java.lang.Float> floatSpliterator29 = floatList20.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long31 = keyParts30.objectInstance;
        int int32 = floatList20.indexOf((java.lang.Object) keyParts30);
        keyParts30.objectInstance = 281474993487884L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType36 = keyParts30.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType36, (java.lang.Long) (-3659131714011136L));
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "32" + "'", str25.equals("32"));
        org.junit.Assert.assertNotNull(uOctet26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "32" + "'", str27.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatSpliterator29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objectType36);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType1, (java.lang.Long) 281474993487884L);
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType1, (java.lang.Long) 17L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType8 = keyParts7.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType8, (java.lang.Long) 1125912808521736L);
        java.lang.Float[] floatArray17 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList18 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList18, floatArray17);
        int int20 = floatList18.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime22 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str23 = fineTime22.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet24 = fineTime22.getAreaVersion();
        java.lang.String str25 = fineTime22.toString();
        boolean boolean26 = floatList18.remove((java.lang.Object) fineTime22);
        java.util.Spliterator<java.lang.Float> floatSpliterator27 = floatList18.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts28 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long29 = keyParts28.objectInstance;
        int int30 = floatList18.indexOf((java.lang.Object) keyParts28);
        keyParts28.objectInstance = 281474993487884L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType33 = keyParts28.sourceObjectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts34 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType35 = keyParts34.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType35, (java.lang.Long) 281474993487884L);
        keyParts28.objectType = objectType35;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts39 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts40 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType41 = keyParts40.objectType;
        keyParts39.objectType = objectType41;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType41, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts46 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts47 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType48 = keyParts47.objectType;
        keyParts46.objectType = objectType48;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType48, (java.lang.Long) 281474993487889L);
        keyParts28.objectType = objectType41;
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "32" + "'", str23.equals("32"));
        org.junit.Assert.assertNotNull(uOctet24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "32" + "'", str25.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(floatSpliterator27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType48);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.ccsds.moims.mo.mal.structures.ShortList shortList1 = new org.ccsds.moims.mo.mal.structures.ShortList((int) (byte) 10);
        java.lang.Integer int2 = shortList1.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.Union union4 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Integer) (-4));
        boolean boolean5 = shortList1.remove((java.lang.Object) (-4));
        org.ccsds.moims.mo.mal.structures.Identifier identifier6 = new org.ccsds.moims.mo.mal.structures.Identifier();
        byte[] byteArray8 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob9 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray8);
        boolean boolean10 = identifier6.equals((java.lang.Object) blob9);
        org.ccsds.moims.mo.mal.structures.UShort uShort11 = blob9.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.StringList stringList12 = new org.ccsds.moims.mo.mal.structures.StringList();
        java.lang.Integer int13 = stringList12.getTypeShortForm();
        java.lang.Long long14 = stringList12.getShortForm();
        org.ccsds.moims.mo.mal.structures.URI uRI15 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet16 = uRI15.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.Element[] elementArray17 = new org.ccsds.moims.mo.mal.structures.Element[] { uShort11, stringList12, uOctet16 };
        org.ccsds.moims.mo.mal.structures.Element[] elementArray18 = shortList1.toArray(elementArray17);
        org.ccsds.moims.mo.mal.structures.URIList uRIList19 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList19.trimToSize();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet21 = uRIList19.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.OctetList octetList22 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray24 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList25 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList25, booleanArray24);
        boolean boolean28 = booleanList25.contains((java.lang.Object) (short) 10);
        boolean boolean29 = octetList22.removeAll((java.util.Collection<java.lang.Boolean>) booleanList25);
        boolean boolean30 = uRIList19.retainAll((java.util.Collection<java.lang.Boolean>) booleanList25);
        boolean boolean31 = shortList1.containsAll((java.util.Collection<java.lang.Boolean>) booleanList25);
        java.util.Spliterator<java.lang.Short> shortSpliterator32 = shortList1.spliterator();
        org.ccsds.moims.mo.mal.structures.UShort uShort33 = shortList1.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort34 = shortList1.getAreaNumber();
        java.util.Spliterator<java.lang.Short> shortSpliterator35 = shortList1.spliterator();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer36 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl37 = mCServicesConsumer36.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl38 = mCServicesConsumer36.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl39 = mCServicesConsumer36.getStatisticService();
        mCServicesConsumer36.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl41 = mCServicesConsumer36.getStatisticService();
        boolean boolean42 = shortList1.remove((java.lang.Object) statisticConsumerServiceImpl41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2.equals((-9)));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(uShort11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-15) + "'", int13.equals((-15)));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 281475010265073L + "'", long14.equals(281475010265073L));
        org.junit.Assert.assertNotNull(uOctet16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertNotNull(elementArray18);
        org.junit.Assert.assertNotNull(uOctet21);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shortSpliterator32);
        org.junit.Assert.assertNotNull(uShort33);
        org.junit.Assert.assertNotNull(uShort34);
        org.junit.Assert.assertNotNull(shortSpliterator35);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl37);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl38);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl39);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl3 = mCServicesConsumer0.getActionService();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(actionConsumerServiceImpl3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("14", (-1));
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey(255);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 255L + "'", long1 == 255L);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl7 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl9 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl10 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(checkConsumerServiceImpl7);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl8);
        org.junit.Assert.assertNull(alertConsumerServiceImpl9);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl10);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.ccsds.moims.mo.mal.structures.UInteger uInteger0 = new org.ccsds.moims.mo.mal.structures.UInteger();
        java.lang.Integer int1 = uInteger0.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet2 = uInteger0.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.UShort uShort3 = uInteger0.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = uInteger0.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort5 = uInteger0.getAreaNumber();
        java.lang.String str6 = uInteger0.toString();
        org.ccsds.moims.mo.mal.structures.UShort uShort7 = uInteger0.getServiceNumber();
        java.lang.Integer int8 = uInteger0.getTypeShortForm();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer9 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl10 = mCServicesConsumer9.getParameterService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl11 = mCServicesConsumer9.getActionService();
        mCServicesConsumer9.closeConnections();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl13 = mCServicesConsumer9.getActionService();
        boolean boolean14 = uInteger0.equals((java.lang.Object) mCServicesConsumer9);
        mCServicesConsumer9.closeConnections();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl16 = mCServicesConsumer9.getActionService();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1.equals(12));
        org.junit.Assert.assertNotNull(uOctet2);
        org.junit.Assert.assertNotNull(uShort3);
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uShort5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        org.junit.Assert.assertNotNull(uShort7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8.equals(12));
        org.junit.Assert.assertNull(parameterConsumerServiceImpl10);
        org.junit.Assert.assertNull(actionConsumerServiceImpl11);
        org.junit.Assert.assertNull(actionConsumerServiceImpl13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(actionConsumerServiceImpl16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts0.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType3 = keyParts0.objectType;
        org.ccsds.moims.mo.com.structures.ObjectType objectType4 = keyParts0.objectType;
        try {
            esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType4, (java.lang.Long) (-7L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UShort argument must not be greater than 65535");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(objectType4);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl1 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl2 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl3 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl4 = mCServicesConsumer0.getCheckService();
        org.junit.Assert.assertNull(checkConsumerServiceImpl1);
        org.junit.Assert.assertNull(checkConsumerServiceImpl2);
        org.junit.Assert.assertNull(alertConsumerServiceImpl3);
        org.junit.Assert.assertNull(checkConsumerServiceImpl4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        keyParts0.objectInstance = 281474993487876L;
        java.lang.Long long4 = keyParts0.objectInstance;
        org.ccsds.moims.mo.com.structures.ObjectType objectType5 = keyParts0.sourceObjectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts6 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType7 = keyParts6.objectType;
        keyParts0.sourceObjectType = objectType7;
        try {
            esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType7, (java.lang.Long) 281475010265086L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UShort argument must not be greater than 65535");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 281474993487876L + "'", long4.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(objectType7);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl4 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl5 = null;
        mCServicesConsumer0.setCheckService(checkConsumerServiceImpl5);
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl7 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl8 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl4);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl7);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("52", (-2));
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(7, (-13), 10, 9);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-55666802679L) + "'", long4.equals((-55666802679L)));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.ccsds.moims.mo.mal.structures.OctetList octetList0 = new org.ccsds.moims.mo.mal.structures.OctetList();
        octetList0.trimToSize();
        octetList0.ensureCapacity(1);
        octetList0.trimToSize();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        strList8.ensureCapacity((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = strList8.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        strList16.ensureCapacity((int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = strList16.getClass();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime22 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str23 = fineTime22.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet24 = fineTime22.getAreaVersion();
        java.lang.Class<?> wildcardClass25 = fineTime22.getClass();
        org.ccsds.moims.mo.mal.structures.ULong uLong26 = new org.ccsds.moims.mo.mal.structures.ULong();
        java.lang.Long long27 = uLong26.getShortForm();
        java.lang.Class<?> wildcardClass28 = uLong26.getClass();
        org.ccsds.moims.mo.mal.structures.ULong uLong29 = new org.ccsds.moims.mo.mal.structures.ULong();
        java.lang.Long long30 = uLong29.getShortForm();
        java.lang.Class<?> wildcardClass31 = uLong29.getClass();
        java.lang.reflect.Type[] typeArray32 = new java.lang.reflect.Type[] { wildcardClass12, wildcardClass20, wildcardClass25, wildcardClass28, wildcardClass31 };
        java.lang.reflect.Type[] typeArray33 = octetList0.toArray(typeArray32);
        java.lang.Long long34 = octetList0.getShortForm();
        java.lang.Long long35 = octetList0.getShortForm();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer36 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl37 = mCServicesConsumer36.getParameterService();
        mCServicesConsumer36.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl39 = mCServicesConsumer36.getAlertService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl40 = mCServicesConsumer36.getActionService();
        boolean boolean41 = octetList0.equals((java.lang.Object) mCServicesConsumer36);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "32" + "'", str23.equals("32"));
        org.junit.Assert.assertNotNull(uOctet24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 281474993487886L + "'", long27.equals(281474993487886L));
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 281474993487886L + "'", long30.equals(281474993487886L));
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 281475010265081L + "'", long34.equals(281475010265081L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 281475010265081L + "'", long35.equals(281475010265081L));
        org.junit.Assert.assertNull(parameterConsumerServiceImpl37);
        org.junit.Assert.assertNull(alertConsumerServiceImpl39);
        org.junit.Assert.assertNull(actionConsumerServiceImpl40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(18, 0, 12, 2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5066549782118402L + "'", long4.equals(5066549782118402L));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = null;
        mCServicesConsumer0.setStatisticService(statisticConsumerServiceImpl3);
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(13, (-13), (-15), (int) 'a');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-251658143L) + "'", long4.equals((-251658143L)));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey(100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        keyParts0.objectInstance = 281474993487876L;
        java.lang.Long long4 = keyParts0.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts5 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts6 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType7 = keyParts6.objectType;
        keyParts5.objectType = objectType7;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType7, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts12 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts13 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType14 = keyParts13.objectType;
        keyParts12.objectType = objectType14;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType14, (java.lang.Long) 281474993487889L);
        keyParts0.sourceObjectType = objectType14;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType14, (java.lang.Long) (-83886074L));
        java.lang.Long long23 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType14, true);
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 281474993487876L + "'", long4.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-83886074L) + "'", long23.equals((-83886074L)));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey((-7));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-7L) + "'", long1 == (-7L));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl1 = mCServicesConsumer0.getCheckService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl3 = mCServicesConsumer0.getActionService();
        mCServicesConsumer0.closeConnections();
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(checkConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray0 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList1 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList1, uShortArray0);
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList6 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList6, booleanArray5);
        boolean boolean8 = uShortList1.removeAll((java.util.Collection<java.lang.Boolean>) booleanList6);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor9 = uShortList1.listIterator();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 9, 0, 7, (-4), 6, 18, 4, 100, (-4), (-15), (-13), (-18), 9, 4, 18, 18, 18, (-4) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.util.stream.Stream<java.lang.Integer> intStream31 = intList29.parallelStream();
        boolean boolean32 = uShortList1.contains((java.lang.Object) intStream31);
        java.lang.Object[] objArray33 = uShortList1.toArray();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer34 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl35 = mCServicesConsumer34.getParameterService();
        mCServicesConsumer34.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl37 = mCServicesConsumer34.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl38 = mCServicesConsumer34.getAggregationService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl39 = null;
        mCServicesConsumer34.setCheckService(checkConsumerServiceImpl39);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer41 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl42 = mCServicesConsumer41.getParameterService();
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray43 = new esa.mo.mc.impl.util.MCServicesConsumer[] { mCServicesConsumer34, mCServicesConsumer41 };
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray44 = uShortList1.toArray(mCServicesConsumerArray43);
        java.lang.Object[] objArray45 = uShortList1.toArray();
        uShortList1.trimToSize();
        org.ccsds.moims.mo.mal.structures.URIList uRIList47 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList47.trimToSize();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet49 = uRIList47.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.OctetList octetList50 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray52 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList53 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList53, booleanArray52);
        boolean boolean56 = booleanList53.contains((java.lang.Object) (short) 10);
        boolean boolean57 = octetList50.removeAll((java.util.Collection<java.lang.Boolean>) booleanList53);
        boolean boolean58 = uRIList47.retainAll((java.util.Collection<java.lang.Boolean>) booleanList53);
        org.ccsds.moims.mo.mal.structures.URIList uRIList59 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList59.trimToSize();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet61 = uRIList59.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.OctetList octetList62 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray64 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList65 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList65, booleanArray64);
        boolean boolean68 = booleanList65.contains((java.lang.Object) (short) 10);
        boolean boolean69 = octetList62.removeAll((java.util.Collection<java.lang.Boolean>) booleanList65);
        boolean boolean70 = uRIList59.retainAll((java.util.Collection<java.lang.Boolean>) booleanList65);
        boolean boolean71 = uRIList47.removeAll((java.util.Collection<java.lang.Boolean>) booleanList65);
        booleanList65.ensureCapacity((-10));
        java.util.ListIterator<java.lang.Boolean> booleanItor75 = booleanList65.listIterator((int) (byte) 1);
        int int76 = booleanList65.size();
        boolean boolean77 = uShortList1.containsAll((java.util.Collection<java.lang.Boolean>) booleanList65);
        org.junit.Assert.assertNotNull(uShortArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(uShortItor9);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl35);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl37);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl38);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl42);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray43);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(uOctet49);
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(uOctet61);
        org.junit.Assert.assertNotNull(booleanArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(booleanItor75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(16, 8, (int) (byte) 10, 255);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4503634154881279L + "'", long4.equals(4503634154881279L));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl4 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl5 = null;
        mCServicesConsumer0.setCheckService(checkConsumerServiceImpl5);
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl7 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl4);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl7);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl8);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey(1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl4 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl5 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl6 = mCServicesConsumer0.getAggregationService();
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(checkConsumerServiceImpl4);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl5);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray0 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList1 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList1, uShortArray0);
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList6 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList6, booleanArray5);
        boolean boolean8 = uShortList1.removeAll((java.util.Collection<java.lang.Boolean>) booleanList6);
        byte[] byteArray11 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob12 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray11);
        org.ccsds.moims.mo.mal.structures.Blob blob13 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray11);
        org.ccsds.moims.mo.mal.structures.UShort uShort14 = blob13.getAreaNumber();
        uShortList1.add((int) (short) 0, uShort14);
        java.lang.Object[] objArray16 = uShortList1.toArray();
        org.ccsds.moims.mo.mal.structures.ShortList shortList18 = new org.ccsds.moims.mo.mal.structures.ShortList((int) (byte) 10);
        java.lang.Integer int19 = shortList18.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.Union union21 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Integer) (-4));
        boolean boolean22 = shortList18.remove((java.lang.Object) (-4));
        org.ccsds.moims.mo.mal.structures.Identifier identifier23 = new org.ccsds.moims.mo.mal.structures.Identifier();
        byte[] byteArray25 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob26 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray25);
        boolean boolean27 = identifier23.equals((java.lang.Object) blob26);
        org.ccsds.moims.mo.mal.structures.UShort uShort28 = blob26.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.StringList stringList29 = new org.ccsds.moims.mo.mal.structures.StringList();
        java.lang.Integer int30 = stringList29.getTypeShortForm();
        java.lang.Long long31 = stringList29.getShortForm();
        org.ccsds.moims.mo.mal.structures.URI uRI32 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet33 = uRI32.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.Element[] elementArray34 = new org.ccsds.moims.mo.mal.structures.Element[] { uShort28, stringList29, uOctet33 };
        org.ccsds.moims.mo.mal.structures.Element[] elementArray35 = shortList18.toArray(elementArray34);
        org.ccsds.moims.mo.mal.structures.URIList uRIList36 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList36.trimToSize();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet38 = uRIList36.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.OctetList octetList39 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray41 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList42 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList42, booleanArray41);
        boolean boolean45 = booleanList42.contains((java.lang.Object) (short) 10);
        boolean boolean46 = octetList39.removeAll((java.util.Collection<java.lang.Boolean>) booleanList42);
        boolean boolean47 = uRIList36.retainAll((java.util.Collection<java.lang.Boolean>) booleanList42);
        boolean boolean48 = shortList18.containsAll((java.util.Collection<java.lang.Boolean>) booleanList42);
        boolean boolean49 = uShortList1.retainAll((java.util.Collection<java.lang.Boolean>) booleanList42);
        java.util.stream.Stream<java.lang.Boolean> booleanStream50 = booleanList42.parallelStream();
        booleanList42.ensureCapacity((-7));
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer53 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl54 = mCServicesConsumer53.getParameterService();
        mCServicesConsumer53.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl56 = mCServicesConsumer53.getAlertService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl57 = mCServicesConsumer53.getActionService();
        boolean boolean58 = booleanList42.equals((java.lang.Object) mCServicesConsumer53);
        org.ccsds.moims.mo.mal.structures.URI[] uRIArray60 = new org.ccsds.moims.mo.mal.structures.URI[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI> uRIList61 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.URI>) uRIList61, uRIArray60);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.URI> uRIItor63 = uRIList61.listIterator();
        java.util.stream.Stream<org.ccsds.moims.mo.mal.structures.URI> uRIStream64 = uRIList61.parallelStream();
        uRIList61.ensureCapacity((int) (short) 100);
        org.ccsds.moims.mo.mal.structures.IntegerList integerList67 = new org.ccsds.moims.mo.mal.structures.IntegerList();
        java.util.stream.Stream<java.lang.Integer> intStream68 = integerList67.stream();
        java.lang.Integer int69 = integerList67.getTypeShortForm();
        java.lang.Long long70 = integerList67.getShortForm();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet71 = integerList67.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.OctetList octetList72 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray74 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList75 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList75, booleanArray74);
        boolean boolean78 = booleanList75.contains((java.lang.Object) (short) 10);
        boolean boolean79 = octetList72.removeAll((java.util.Collection<java.lang.Boolean>) booleanList75);
        int int80 = integerList67.indexOf((java.lang.Object) booleanList75);
        java.util.stream.Stream<java.lang.Boolean> booleanStream81 = booleanList75.stream();
        boolean boolean82 = uRIList61.containsAll((java.util.Collection<java.lang.Boolean>) booleanList75);
        try {
            boolean boolean83 = booleanList42.addAll((-10), (java.util.Collection<java.lang.Boolean>) booleanList75);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(uShortArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(uShort14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-9) + "'", int19.equals((-9)));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(uShort28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-15) + "'", int30.equals((-15)));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 281475010265073L + "'", long31.equals(281475010265073L));
        org.junit.Assert.assertNotNull(uOctet33);
        org.junit.Assert.assertNotNull(elementArray34);
        org.junit.Assert.assertNotNull(elementArray35);
        org.junit.Assert.assertNotNull(uOctet38);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(booleanStream50);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl54);
        org.junit.Assert.assertNull(alertConsumerServiceImpl56);
        org.junit.Assert.assertNull(actionConsumerServiceImpl57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(uRIArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(uRIItor63);
        org.junit.Assert.assertNotNull(uRIStream64);
        org.junit.Assert.assertNotNull(intStream68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-11) + "'", int69.equals((-11)));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 281475010265077L + "'", long70.equals(281475010265077L));
        org.junit.Assert.assertNotNull(uOctet71);
        org.junit.Assert.assertNotNull(booleanArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(booleanStream81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long1 = keyParts0.objectInstance;
        keyParts0.objectInstance = 281475010265077L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType4 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType4, (java.lang.Long) 11L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487884L);
        java.lang.Long long13 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType9, true);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts15 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType16 = keyParts15.objectType;
        keyParts15.objectInstance = 281474993487876L;
        java.lang.Long long19 = keyParts15.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts20 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts21 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts21.objectType;
        keyParts20.objectType = objectType22;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType22, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts27 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts28 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType29 = keyParts28.objectType;
        keyParts27.objectType = objectType29;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType29, (java.lang.Long) 281474993487889L);
        keyParts15.sourceObjectType = objectType29;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts35 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts35.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType38 = keyParts35.objectType;
        keyParts35.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts41 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts42 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType43 = keyParts42.objectType;
        keyParts41.objectType = objectType43;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType43, (java.lang.Long) 281474993487876L);
        keyParts35.sourceObjectType = objectType43;
        keyParts15.objectType = objectType43;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts50 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType51 = keyParts50.objectType;
        keyParts50.objectInstance = 281475010265081L;
        keyParts50.objectInstance = 1125912808521735L;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts57 = null;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1.equals((-1L)));
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 281474993487884L + "'", long13.equals(281474993487884L));
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 281474993487876L + "'", long19.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(objectType51);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl3 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl4 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl6 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(alertConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl4);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { (-1.0f) };
        java.util.ArrayList<java.lang.Float> floatList2 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList2, floatArray1);
        java.lang.Object obj4 = null;
        boolean boolean5 = floatList2.equals(obj4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        strList9.ensureCapacity((int) (byte) -1);
        java.util.stream.Stream<java.lang.String> strStream13 = strList9.stream();
        boolean boolean14 = floatList2.remove((java.lang.Object) strStream13);
        java.util.stream.Stream<java.lang.Float> floatStream15 = floatList2.parallelStream();
        java.lang.String str16 = floatList2.toString();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime18 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        org.ccsds.moims.mo.mal.structures.Duration duration20 = new org.ccsds.moims.mo.mal.structures.Duration((double) 13);
        java.lang.Integer int21 = duration20.getTypeShortForm();
        boolean boolean22 = fineTime18.equals((java.lang.Object) duration20);
        org.ccsds.moims.mo.mal.structures.Element element23 = fineTime18.createElement();
        org.ccsds.moims.mo.mal.structures.UShort uShort24 = fineTime18.getServiceNumber();
        java.lang.String str25 = fineTime18.toString();
        java.lang.Integer int26 = fineTime18.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort27 = fineTime18.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.Time time29 = new org.ccsds.moims.mo.mal.structures.Time((long) '4');
        org.ccsds.moims.mo.mal.structures.UShort uShort30 = time29.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper mCServicesHelper31 = new esa.mo.mc.impl.util.MCServicesHelper();
        boolean boolean32 = uShort30.equals((java.lang.Object) mCServicesHelper31);
        boolean boolean33 = fineTime18.equals((java.lang.Object) boolean32);
        int int34 = floatList2.lastIndexOf((java.lang.Object) boolean32);
        org.ccsds.moims.mo.mal.structures.URI[] uRIArray35 = new org.ccsds.moims.mo.mal.structures.URI[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI> uRIList36 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.URI>) uRIList36, uRIArray35);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.URI> uRIItor38 = uRIList36.listIterator();
        java.util.stream.Stream<org.ccsds.moims.mo.mal.structures.URI> uRIStream39 = uRIList36.parallelStream();
        uRIList36.ensureCapacity((int) (short) 100);
        org.ccsds.moims.mo.mal.structures.IntegerList integerList42 = new org.ccsds.moims.mo.mal.structures.IntegerList();
        java.util.stream.Stream<java.lang.Integer> intStream43 = integerList42.stream();
        java.lang.Integer int44 = integerList42.getTypeShortForm();
        java.lang.Long long45 = integerList42.getShortForm();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet46 = integerList42.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.OctetList octetList47 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray49 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList50 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList50, booleanArray49);
        boolean boolean53 = booleanList50.contains((java.lang.Object) (short) 10);
        boolean boolean54 = octetList47.removeAll((java.util.Collection<java.lang.Boolean>) booleanList50);
        int int55 = integerList42.indexOf((java.lang.Object) booleanList50);
        java.util.stream.Stream<java.lang.Boolean> booleanStream56 = booleanList50.stream();
        boolean boolean57 = uRIList36.containsAll((java.util.Collection<java.lang.Boolean>) booleanList50);
        java.util.stream.Stream<org.ccsds.moims.mo.mal.structures.URI> uRIStream58 = uRIList36.parallelStream();
        boolean boolean59 = floatList2.equals((java.lang.Object) uRIList36);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatStream15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[-1.0]" + "'", str16.equals("[-1.0]"));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21.equals(3));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(uShort24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "32" + "'", str25.equals("32"));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 17 + "'", int26.equals(17));
        org.junit.Assert.assertNotNull(uShort27);
        org.junit.Assert.assertNotNull(uShort30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(uRIArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(uRIItor38);
        org.junit.Assert.assertNotNull(uRIStream39);
        org.junit.Assert.assertNotNull(intStream43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-11) + "'", int44.equals((-11)));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 281475010265077L + "'", long45.equals(281475010265077L));
        org.junit.Assert.assertNotNull(uOctet46);
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(booleanStream56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(uRIStream58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long1 = keyParts0.objectInstance;
        keyParts0.objectInstance = 281475010265077L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType4 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType4, (java.lang.Long) 11L);
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType4, (java.lang.Long) 1125912808521746L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1.equals((-1L)));
        org.junit.Assert.assertNotNull(objectType4);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl4 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl5 = mCServicesConsumer0.getCheckService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl4);
        org.junit.Assert.assertNull(checkConsumerServiceImpl5);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        java.lang.Long long7 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType2, false);
        java.lang.Long long9 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType2, true);
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 281474993487872L + "'", long7.equals(281474993487872L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 281474993487889L + "'", long9.equals(281474993487889L));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.ccsds.moims.mo.mal.structures.FineTime fineTime1 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        org.ccsds.moims.mo.mal.structures.Duration duration3 = new org.ccsds.moims.mo.mal.structures.Duration((double) 13);
        java.lang.Integer int4 = duration3.getTypeShortForm();
        boolean boolean5 = fineTime1.equals((java.lang.Object) duration3);
        org.ccsds.moims.mo.mal.structures.Element element6 = fineTime1.createElement();
        org.ccsds.moims.mo.mal.structures.UShort uShort7 = fineTime1.getServiceNumber();
        java.lang.String str8 = fineTime1.toString();
        java.lang.Integer int9 = fineTime1.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort10 = fineTime1.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.Time time12 = new org.ccsds.moims.mo.mal.structures.Time((long) '4');
        org.ccsds.moims.mo.mal.structures.UShort uShort13 = time12.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper mCServicesHelper14 = new esa.mo.mc.impl.util.MCServicesHelper();
        boolean boolean15 = uShort13.equals((java.lang.Object) mCServicesHelper14);
        boolean boolean16 = fineTime1.equals((java.lang.Object) boolean15);
        java.lang.Long long17 = fineTime1.getShortForm();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4.equals(3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(uShort7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "32" + "'", str8.equals("32"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17 + "'", int9.equals(17));
        org.junit.Assert.assertNotNull(uShort10);
        org.junit.Assert.assertNotNull(uShort13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 281474993487889L + "'", long17.equals(281474993487889L));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl6 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl7 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(actionConsumerServiceImpl6);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl2 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(alertConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.ccsds.moims.mo.mal.structures.URIList uRIList0 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList0.trimToSize();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet2 = uRIList0.getAreaVersion();
        uRIList0.trimToSize();
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.URI> uRIItor4 = uRIList0.listIterator();
        org.ccsds.moims.mo.mal.structures.FloatList floatList5 = new org.ccsds.moims.mo.mal.structures.FloatList();
        java.lang.Long long6 = floatList5.getShortForm();
        floatList5.ensureCapacity((int) (byte) 10);
        org.ccsds.moims.mo.mal.structures.UShort uShort9 = floatList5.getServiceNumber();
        double double10 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uShort9);
        boolean boolean11 = uRIList0.equals((java.lang.Object) double10);
        byte[] byteArray13 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob14 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray13);
        org.ccsds.moims.mo.mal.structures.Blob blob17 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray13, (int) 'a', 0);
        org.ccsds.moims.mo.mal.structures.Blob blob20 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray13, (-10), 14);
        org.ccsds.moims.mo.mal.structures.Blob blob21 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray13);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet22 = blob21.getAreaVersion();
        int int23 = uRIList0.indexOf((java.lang.Object) uOctet22);
        org.ccsds.moims.mo.mal.structures.FloatList floatList24 = new org.ccsds.moims.mo.mal.structures.FloatList();
        org.ccsds.moims.mo.mal.structures.UShort uShort25 = floatList24.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet26 = floatList24.getAreaVersion();
        boolean boolean27 = floatList24.isEmpty();
        java.util.Spliterator<java.lang.Float> floatSpliterator28 = floatList24.spliterator();
        boolean boolean29 = uRIList0.equals((java.lang.Object) floatSpliterator28);
        org.junit.Assert.assertNotNull(uOctet2);
        org.junit.Assert.assertNotNull(uRIItor4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 281475010265084L + "'", long6.equals(281475010265084L));
        org.junit.Assert.assertNotNull(uShort9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(uOctet22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(uShort25);
        org.junit.Assert.assertNotNull(uOctet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(floatSpliterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, (-1), 6, 18 };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        boolean boolean9 = intList6.add((java.lang.Integer) 18);
        org.ccsds.moims.mo.mal.structures.OctetList octetList10 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray12 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList13 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList13, booleanArray12);
        boolean boolean16 = booleanList13.contains((java.lang.Object) (short) 10);
        boolean boolean17 = octetList10.removeAll((java.util.Collection<java.lang.Boolean>) booleanList13);
        org.ccsds.moims.mo.mal.structures.Element element18 = octetList10.createElement();
        boolean boolean19 = intList6.remove((java.lang.Object) octetList10);
        boolean boolean20 = octetList10.isEmpty();
        org.ccsds.moims.mo.mal.structures.URI uRI21 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet22 = uRI21.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.UShort uShort23 = uRI21.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet24 = uRI21.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.UShort uShort25 = uRI21.getAreaNumber();
        int int26 = octetList10.indexOf((java.lang.Object) uShort25);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray27 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList28 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList28, uShortArray27);
        java.lang.Boolean[] booleanArray32 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList33 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList33, booleanArray32);
        boolean boolean35 = uShortList28.removeAll((java.util.Collection<java.lang.Boolean>) booleanList33);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor36 = uShortList28.listIterator();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 9, 0, 7, (-4), 6, 18, 4, 100, (-4), (-15), (-13), (-18), 9, 4, 18, 18, 18, (-4) };
        java.util.ArrayList<java.lang.Integer> intList56 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.util.stream.Stream<java.lang.Integer> intStream58 = intList56.parallelStream();
        boolean boolean59 = uShortList28.contains((java.lang.Object) intStream58);
        java.lang.Object[] objArray60 = uShortList28.toArray();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer61 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl62 = mCServicesConsumer61.getParameterService();
        mCServicesConsumer61.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl64 = mCServicesConsumer61.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl65 = mCServicesConsumer61.getAggregationService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl66 = null;
        mCServicesConsumer61.setCheckService(checkConsumerServiceImpl66);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer68 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl69 = mCServicesConsumer68.getParameterService();
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray70 = new esa.mo.mc.impl.util.MCServicesConsumer[] { mCServicesConsumer61, mCServicesConsumer68 };
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray71 = uShortList28.toArray(mCServicesConsumerArray70);
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray72 = octetList10.toArray(mCServicesConsumerArray70);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(uOctet22);
        org.junit.Assert.assertNotNull(uShort23);
        org.junit.Assert.assertNotNull(uOctet24);
        org.junit.Assert.assertNotNull(uShort25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(uShortArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(uShortItor36);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intStream58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl62);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl64);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl65);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl69);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray70);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray71);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray72);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl4 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl6 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl7 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl4);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
        org.junit.Assert.assertNull(actionConsumerServiceImpl6);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl4 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl5 = null;
        mCServicesConsumer0.setCheckService(checkConsumerServiceImpl5);
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl4);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl4 = null;
        mCServicesConsumer0.setStatisticService(statisticConsumerServiceImpl4);
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl6 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(65535, 1, (-15), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-251658140L) + "'", long4.equals((-251658140L)));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl7 = mCServicesConsumer0.getAggregationService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl7);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl6 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl7 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl8 = mCServicesConsumer0.getActionService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl7);
        org.junit.Assert.assertNull(actionConsumerServiceImpl8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.ccsds.moims.mo.mal.structures.LongList longList0 = new org.ccsds.moims.mo.mal.structures.LongList();
        org.ccsds.moims.mo.mal.structures.Element element1 = longList0.createElement();
        java.lang.Integer int2 = longList0.getTypeShortForm();
        int int3 = longList0.size();
        org.ccsds.moims.mo.mal.structures.Blob blob5 = new org.ccsds.moims.mo.mal.structures.Blob("[1.0, 1.0]");
        double double6 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) blob5);
        int int7 = longList0.lastIndexOf((java.lang.Object) blob5);
        org.ccsds.moims.mo.mal.structures.UShort uShort8 = longList0.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort9 = longList0.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.LongList longList10 = new org.ccsds.moims.mo.mal.structures.LongList();
        org.ccsds.moims.mo.mal.structures.Element element11 = longList10.createElement();
        org.ccsds.moims.mo.mal.structures.UShort uShort12 = longList10.getServiceNumber();
        java.util.stream.Stream<java.lang.Long> longStream13 = longList10.parallelStream();
        int int14 = longList0.indexOf((java.lang.Object) longList10);
        java.lang.Long long15 = longList0.getShortForm();
        org.junit.Assert.assertNotNull(element1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2.equals((-13)));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(uShort8);
        org.junit.Assert.assertNotNull(uShort9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(uShort12);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 281475010265075L + "'", long15.equals(281475010265075L));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = null;
        mCServicesConsumer0.setParameterService(parameterConsumerServiceImpl8);
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl11 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl13 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl14 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl11);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl13);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl14);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.ccsds.moims.mo.mal.structures.Identifier identifier0 = new org.ccsds.moims.mo.mal.structures.Identifier();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob3 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray2);
        boolean boolean4 = identifier0.equals((java.lang.Object) blob3);
        java.lang.String str5 = identifier0.toString();
        org.ccsds.moims.mo.mal.structures.UShort uShort6 = identifier0.getServiceNumber();
        double double7 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uShort6);
        org.ccsds.moims.mo.mal.structures.UShort uShort8 = uShort6.getServiceNumber();
        java.lang.Long long9 = uShort6.getShortForm();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet10 = uShort6.getAreaVersion();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(uShort6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(uShort8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 281474993487882L + "'", long9.equals(281474993487882L));
        org.junit.Assert.assertNotNull(uOctet10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long1 = keyParts0.objectInstance;
        keyParts0.objectInstance = 281475010265077L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType4 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType4, (java.lang.Long) 11L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487884L);
        java.lang.Long long13 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType9, true);
        java.lang.Float[] floatArray20 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList21 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList21, floatArray20);
        int int23 = floatList21.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime25 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str26 = fineTime25.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet27 = fineTime25.getAreaVersion();
        java.lang.String str28 = fineTime25.toString();
        boolean boolean29 = floatList21.remove((java.lang.Object) fineTime25);
        java.util.Spliterator<java.lang.Float> floatSpliterator30 = floatList21.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts31 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long32 = keyParts31.objectInstance;
        int int33 = floatList21.indexOf((java.lang.Object) keyParts31);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1.equals((-1L)));
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 281474993487884L + "'", long13.equals(281474993487884L));
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "32" + "'", str26.equals("32"));
        org.junit.Assert.assertNotNull(uOctet27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "32" + "'", str28.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(floatSpliterator30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.ccsds.moims.mo.mal.structures.Identifier identifier0 = new org.ccsds.moims.mo.mal.structures.Identifier();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob3 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray2);
        boolean boolean4 = identifier0.equals((java.lang.Object) blob3);
        org.ccsds.moims.mo.mal.structures.UShort uShort5 = blob3.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.Element element6 = blob3.createElement();
        blob3.detach();
        int int8 = blob3.getOffset();
        org.ccsds.moims.mo.mal.structures.UShort uShort9 = blob3.getServiceNumber();
        blob3.detach();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts11 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts12 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType13 = keyParts12.objectType;
        keyParts11.objectType = objectType13;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType13, (java.lang.Long) 281474993487875L);
        boolean boolean17 = blob3.equals((java.lang.Object) 281474993487875L);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uShort5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(uShort9);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl6 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl7 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl6);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl7);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray19 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList20 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList20, floatArray19);
        int int22 = floatList20.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime24 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str25 = fineTime24.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet26 = fineTime24.getAreaVersion();
        java.lang.String str27 = fineTime24.toString();
        boolean boolean28 = floatList20.remove((java.lang.Object) fineTime24);
        java.util.Spliterator<java.lang.Float> floatSpliterator29 = floatList20.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long31 = keyParts30.objectInstance;
        int int32 = floatList20.indexOf((java.lang.Object) keyParts30);
        keyParts30.objectInstance = 281474993487884L;
        java.lang.Float[] floatArray41 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList42 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList42, floatArray41);
        int int44 = floatList42.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime46 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str47 = fineTime46.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet48 = fineTime46.getAreaVersion();
        java.lang.String str49 = fineTime46.toString();
        boolean boolean50 = floatList42.remove((java.lang.Object) fineTime46);
        java.util.Spliterator<java.lang.Float> floatSpliterator51 = floatList42.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts52 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long53 = keyParts52.objectInstance;
        int int54 = floatList42.indexOf((java.lang.Object) keyParts52);
        keyParts52.objectInstance = 281474993487884L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType57 = keyParts52.sourceObjectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts58 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType59 = keyParts58.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType59, (java.lang.Long) 281474993487884L);
        keyParts52.objectType = objectType59;
        java.lang.Float[] floatArray69 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList70 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList70, floatArray69);
        int int72 = floatList70.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime74 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str75 = fineTime74.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet76 = fineTime74.getAreaVersion();
        java.lang.String str77 = fineTime74.toString();
        boolean boolean78 = floatList70.remove((java.lang.Object) fineTime74);
        java.util.Spliterator<java.lang.Float> floatSpliterator79 = floatList70.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts80 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long81 = keyParts80.objectInstance;
        int int82 = floatList70.indexOf((java.lang.Object) keyParts80);
        keyParts80.objectInstance = 281474993487884L;
        keyParts80.objectInstance = 2L;
        java.lang.Long long87 = keyParts80.objectInstance;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "32" + "'", str25.equals("32"));
        org.junit.Assert.assertNotNull(uOctet26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "32" + "'", str27.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatSpliterator29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5 + "'", int44 == 5);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "32" + "'", str47.equals("32"));
        org.junit.Assert.assertNotNull(uOctet48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "32" + "'", str49.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(floatSpliterator51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 5 + "'", int72 == 5);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "32" + "'", str75.equals("32"));
        org.junit.Assert.assertNotNull(uOctet76);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "32" + "'", str77.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(floatSpliterator79);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 2L + "'", long87.equals(2L));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.ccsds.moims.mo.mal.structures.StringList stringList0 = new org.ccsds.moims.mo.mal.structures.StringList();
        java.lang.Integer int1 = stringList0.getTypeShortForm();
        boolean boolean2 = stringList0.isEmpty();
        org.ccsds.moims.mo.mal.structures.UShort uShort3 = stringList0.getAreaNumber();
        double double4 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uShort3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-15) + "'", int1.equals((-15)));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(uShort3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long1 = keyParts0.objectInstance;
        keyParts0.objectInstance = 281475010265077L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType4 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType4, (java.lang.Long) 11L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487884L);
        java.lang.Long long13 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType9, true);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts15 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType16 = keyParts15.objectType;
        keyParts15.objectInstance = 281474993487876L;
        java.lang.Long long19 = keyParts15.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts20 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts21 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts21.objectType;
        keyParts20.objectType = objectType22;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType22, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts27 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts28 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType29 = keyParts28.objectType;
        keyParts27.objectType = objectType29;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType29, (java.lang.Long) 281474993487889L);
        keyParts15.sourceObjectType = objectType29;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts35 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts35.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType38 = keyParts35.objectType;
        keyParts35.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts41 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts42 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType43 = keyParts42.objectType;
        keyParts41.objectType = objectType43;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType43, (java.lang.Long) 281474993487876L);
        keyParts35.sourceObjectType = objectType43;
        keyParts15.objectType = objectType43;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts50 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts51 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType52 = keyParts51.objectType;
        keyParts50.objectType = objectType52;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType52, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts57 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts58 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType59 = keyParts58.objectType;
        keyParts57.objectType = objectType59;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType59, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray69 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList70 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList70, floatArray69);
        int int72 = floatList70.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime74 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str75 = fineTime74.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet76 = fineTime74.getAreaVersion();
        java.lang.String str77 = fineTime74.toString();
        boolean boolean78 = floatList70.remove((java.lang.Object) fineTime74);
        java.util.Spliterator<java.lang.Float> floatSpliterator79 = floatList70.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts80 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long81 = keyParts80.objectInstance;
        int int82 = floatList70.indexOf((java.lang.Object) keyParts80);
        keyParts80.objectInstance = 281474993487884L;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1.equals((-1L)));
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 281474993487884L + "'", long13.equals(281474993487884L));
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 281474993487876L + "'", long19.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 5 + "'", int72 == 5);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "32" + "'", str75.equals("32"));
        org.junit.Assert.assertNotNull(uOctet76);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "32" + "'", str77.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(floatSpliterator79);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("", (-11));
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey(15);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 15L + "'", long1 == 15L);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = null;
        mCServicesConsumer0.setParameterService(parameterConsumerServiceImpl8);
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl11 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl13 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl14 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl15 = mCServicesConsumer0.getActionService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl11);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl13);
        org.junit.Assert.assertNull(checkConsumerServiceImpl14);
        org.junit.Assert.assertNull(actionConsumerServiceImpl15);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl6 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl7 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
        org.junit.Assert.assertNull(checkConsumerServiceImpl6);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl7);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl8);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl6 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl7 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl8 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl9 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
        org.junit.Assert.assertNull(checkConsumerServiceImpl6);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl7);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl8);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl9);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl4 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl6 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl7 = mCServicesConsumer0.getAlertService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl4);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
        org.junit.Assert.assertNull(actionConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl1 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl3 = mCServicesConsumer0.getAggregationService();
        org.junit.Assert.assertNull(alertConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl3);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey((-11));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-11L) + "'", long1 == (-11L));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = null;
        mCServicesConsumer0.setParameterService(parameterConsumerServiceImpl8);
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl11 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl13 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl14 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl15 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl16 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl11);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl13);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl14);
        org.junit.Assert.assertNull(alertConsumerServiceImpl15);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl16);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("[10.0, 1.0, 10.0, 10.0]", (-7));
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((int) (short) 255, (-1), (int) ' ', (int) (short) 255);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3758096129L) + "'", long4.equals((-3758096129L)));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.ccsds.moims.mo.mal.structures.Union union1 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Boolean) false);
        byte[] byteArray3 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob4 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray3);
        org.ccsds.moims.mo.mal.structures.Blob blob5 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray3);
        byte[] byteArray6 = blob5.getValue();
        org.ccsds.moims.mo.mal.structures.Blob blob9 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray6, 0, (int) (short) 255);
        org.ccsds.moims.mo.mal.structures.Blob blob10 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray6);
        boolean boolean11 = union1.equals((java.lang.Object) byteArray6);
        org.ccsds.moims.mo.mal.structures.Blob blob14 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray6, (int) (short) 100, 18);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer15 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl16 = mCServicesConsumer15.getCheckService();
        boolean boolean17 = blob14.equals((java.lang.Object) checkConsumerServiceImpl16);
        java.lang.String str18 = blob14.getURL();
        blob14.detach();
        org.ccsds.moims.mo.mal.structures.UShortList uShortList21 = new org.ccsds.moims.mo.mal.structures.UShortList((int) 'a');
        java.util.Spliterator[] spliteratorArray23 = new java.util.Spliterator[0];
        @SuppressWarnings("unchecked") java.util.Spliterator<java.lang.Float>[] floatSpliteratorArray24 = (java.util.Spliterator<java.lang.Float>[]) spliteratorArray23;
        java.util.Spliterator<java.lang.Float>[] floatSpliteratorArray25 = uShortList21.toArray((java.util.Spliterator<java.lang.Float>[]) spliteratorArray23);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 0, (byte) 0 };
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 0, (byte) 0 };
        byte[][] byteArray34 = new byte[][] { byteArray29, byteArray33 };
        byte[][] byteArray35 = uShortList21.toArray(byteArray34);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray36 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList37 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList37, uShortArray36);
        java.lang.Boolean[] booleanArray41 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList42 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList42, booleanArray41);
        boolean boolean44 = uShortList37.removeAll((java.util.Collection<java.lang.Boolean>) booleanList42);
        byte[] byteArray47 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob48 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray47);
        org.ccsds.moims.mo.mal.structures.Blob blob49 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray47);
        org.ccsds.moims.mo.mal.structures.UShort uShort50 = blob49.getAreaNumber();
        uShortList37.add((int) (short) 0, uShort50);
        java.lang.Object[] objArray52 = uShortList37.toArray();
        org.ccsds.moims.mo.mal.structures.URIList uRIList53 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList53.trimToSize();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet55 = uRIList53.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.OctetList octetList56 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray58 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList59 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList59, booleanArray58);
        boolean boolean62 = booleanList59.contains((java.lang.Object) (short) 10);
        boolean boolean63 = octetList56.removeAll((java.util.Collection<java.lang.Boolean>) booleanList59);
        boolean boolean64 = uRIList53.retainAll((java.util.Collection<java.lang.Boolean>) booleanList59);
        java.lang.Long long65 = uRIList53.getShortForm();
        int int66 = uRIList53.size();
        boolean boolean67 = uShortList37.remove((java.lang.Object) uRIList53);
        boolean boolean68 = uShortList21.equals((java.lang.Object) uShortList37);
        org.ccsds.moims.mo.mal.structures.UShort uShort69 = uShortList21.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.Time time71 = new org.ccsds.moims.mo.mal.structures.Time((long) '4');
        org.ccsds.moims.mo.mal.structures.UShort uShort72 = time71.getAreaNumber();
        int int73 = uShortList21.indexOf((java.lang.Object) time71);
        org.ccsds.moims.mo.mal.structures.Element element74 = uShortList21.createElement();
        boolean boolean75 = blob14.equals((java.lang.Object) uShortList21);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(checkConsumerServiceImpl16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(spliteratorArray23);
        org.junit.Assert.assertNotNull(floatSpliteratorArray24);
        org.junit.Assert.assertNotNull(floatSpliteratorArray25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertNotNull(uShortArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertNotNull(uShort50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(uOctet55);
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 281475010265070L + "'", long65.equals(281475010265070L));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(uShort69);
        org.junit.Assert.assertNotNull(uShort72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, 1.0d, 10.0d, 10.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        doubleList5.ensureCapacity((int) ' ');
        java.util.stream.Stream<java.lang.Double> doubleStream9 = doubleList5.parallelStream();
        java.lang.Float[] floatArray12 = new java.lang.Float[] { 1.0f, 1.0f };
        java.util.ArrayList<java.lang.Float> floatList13 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList13, floatArray12);
        floatList13.trimToSize();
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray16 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList17 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList17, uShortArray16);
        java.lang.Boolean[] booleanArray21 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList22 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList22, booleanArray21);
        boolean boolean24 = uShortList17.removeAll((java.util.Collection<java.lang.Boolean>) booleanList22);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray25 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList26 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList26, uShortArray25);
        java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList31 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList31, booleanArray30);
        boolean boolean33 = uShortList26.removeAll((java.util.Collection<java.lang.Boolean>) booleanList31);
        boolean boolean34 = booleanList22.containsAll((java.util.Collection<java.lang.Boolean>) booleanList31);
        int int35 = booleanList31.size();
        java.lang.Boolean boolean38 = booleanList31.set(0, (java.lang.Boolean) true);
        boolean boolean39 = floatList13.removeAll((java.util.Collection<java.lang.Boolean>) booleanList31);
        java.util.Iterator<java.lang.Boolean> booleanItor40 = booleanList31.iterator();
        boolean boolean41 = doubleList5.containsAll((java.util.Collection<java.lang.Boolean>) booleanList31);
        org.ccsds.moims.mo.mal.structures.LongList longList42 = new org.ccsds.moims.mo.mal.structures.LongList();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet43 = new org.ccsds.moims.mo.mal.structures.UOctet();
        boolean boolean44 = longList42.equals((java.lang.Object) uOctet43);
        boolean boolean45 = booleanList31.remove((java.lang.Object) longList42);
        java.lang.Integer int46 = longList42.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort47 = longList42.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts48 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts49 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType50 = keyParts49.objectType;
        keyParts48.objectType = objectType50;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType50, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts55 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts56 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType57 = keyParts56.objectType;
        keyParts55.objectType = objectType57;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType57, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts62 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts62.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType65 = keyParts62.objectType;
        keyParts62.objectInstance = (-281431993483167L);
        int int69 = longList42.indexOf((java.lang.Object) keyParts62);
        org.ccsds.moims.mo.com.structures.ObjectType objectType70 = keyParts62.objectType;
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(uShortArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(uShortArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38.equals(false));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(booleanItor40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-13) + "'", int46.equals((-13)));
        org.junit.Assert.assertNotNull(uShort47);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(objectType70);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl4 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl5 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(checkConsumerServiceImpl4);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(10, 16, (int) ' ', (int) (short) 255);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2814819023454463L + "'", long4.equals(2814819023454463L));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl1 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl2 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl3 = mCServicesConsumer0.getActionService();
        org.junit.Assert.assertNull(checkConsumerServiceImpl1);
        org.junit.Assert.assertNull(alertConsumerServiceImpl2);
        org.junit.Assert.assertNull(actionConsumerServiceImpl3);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray0 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList1 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList1, uShortArray0);
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList6 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList6, booleanArray5);
        boolean boolean8 = uShortList1.removeAll((java.util.Collection<java.lang.Boolean>) booleanList6);
        byte[] byteArray11 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob12 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray11);
        org.ccsds.moims.mo.mal.structures.Blob blob13 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray11);
        org.ccsds.moims.mo.mal.structures.UShort uShort14 = blob13.getAreaNumber();
        uShortList1.add((int) (short) 0, uShort14);
        java.lang.Object[] objArray16 = uShortList1.toArray();
        org.ccsds.moims.mo.mal.structures.ShortList shortList18 = new org.ccsds.moims.mo.mal.structures.ShortList((int) (byte) 10);
        java.lang.Integer int19 = shortList18.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.Union union21 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Integer) (-4));
        boolean boolean22 = shortList18.remove((java.lang.Object) (-4));
        org.ccsds.moims.mo.mal.structures.Identifier identifier23 = new org.ccsds.moims.mo.mal.structures.Identifier();
        byte[] byteArray25 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob26 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray25);
        boolean boolean27 = identifier23.equals((java.lang.Object) blob26);
        org.ccsds.moims.mo.mal.structures.UShort uShort28 = blob26.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.StringList stringList29 = new org.ccsds.moims.mo.mal.structures.StringList();
        java.lang.Integer int30 = stringList29.getTypeShortForm();
        java.lang.Long long31 = stringList29.getShortForm();
        org.ccsds.moims.mo.mal.structures.URI uRI32 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet33 = uRI32.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.Element[] elementArray34 = new org.ccsds.moims.mo.mal.structures.Element[] { uShort28, stringList29, uOctet33 };
        org.ccsds.moims.mo.mal.structures.Element[] elementArray35 = shortList18.toArray(elementArray34);
        org.ccsds.moims.mo.mal.structures.URIList uRIList36 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList36.trimToSize();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet38 = uRIList36.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.OctetList octetList39 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray41 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList42 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList42, booleanArray41);
        boolean boolean45 = booleanList42.contains((java.lang.Object) (short) 10);
        boolean boolean46 = octetList39.removeAll((java.util.Collection<java.lang.Boolean>) booleanList42);
        boolean boolean47 = uRIList36.retainAll((java.util.Collection<java.lang.Boolean>) booleanList42);
        boolean boolean48 = shortList18.containsAll((java.util.Collection<java.lang.Boolean>) booleanList42);
        boolean boolean49 = uShortList1.retainAll((java.util.Collection<java.lang.Boolean>) booleanList42);
        java.util.stream.Stream<java.lang.Boolean> booleanStream50 = booleanList42.parallelStream();
        booleanList42.ensureCapacity((-7));
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer53 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl54 = mCServicesConsumer53.getParameterService();
        mCServicesConsumer53.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl56 = mCServicesConsumer53.getAlertService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl57 = mCServicesConsumer53.getActionService();
        boolean boolean58 = booleanList42.equals((java.lang.Object) mCServicesConsumer53);
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl59 = mCServicesConsumer53.getAlertService();
        org.junit.Assert.assertNotNull(uShortArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(uShort14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-9) + "'", int19.equals((-9)));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(uShort28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-15) + "'", int30.equals((-15)));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 281475010265073L + "'", long31.equals(281475010265073L));
        org.junit.Assert.assertNotNull(uOctet33);
        org.junit.Assert.assertNotNull(elementArray34);
        org.junit.Assert.assertNotNull(elementArray35);
        org.junit.Assert.assertNotNull(uOctet38);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(booleanStream50);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl54);
        org.junit.Assert.assertNull(alertConsumerServiceImpl56);
        org.junit.Assert.assertNull(actionConsumerServiceImpl57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(alertConsumerServiceImpl59);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.ccsds.moims.mo.mal.structures.Union union1 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Boolean) false);
        byte[] byteArray3 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob4 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray3);
        org.ccsds.moims.mo.mal.structures.Blob blob5 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray3);
        byte[] byteArray6 = blob5.getValue();
        org.ccsds.moims.mo.mal.structures.Blob blob9 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray6, 0, (int) (short) 255);
        org.ccsds.moims.mo.mal.structures.Blob blob10 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray6);
        boolean boolean11 = union1.equals((java.lang.Object) byteArray6);
        org.ccsds.moims.mo.mal.structures.Blob blob14 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray6, (int) (short) 100, 18);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer15 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl16 = mCServicesConsumer15.getCheckService();
        boolean boolean17 = blob14.equals((java.lang.Object) checkConsumerServiceImpl16);
        byte[] byteArray18 = blob14.getValue();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(checkConsumerServiceImpl16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey((int) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.ccsds.moims.mo.mal.structures.URIList uRIList0 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList0.trimToSize();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet2 = uRIList0.getAreaVersion();
        uRIList0.trimToSize();
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.URI> uRIItor4 = uRIList0.listIterator();
        org.ccsds.moims.mo.mal.structures.FloatList floatList5 = new org.ccsds.moims.mo.mal.structures.FloatList();
        java.lang.Long long6 = floatList5.getShortForm();
        floatList5.ensureCapacity((int) (byte) 10);
        org.ccsds.moims.mo.mal.structures.UShort uShort9 = floatList5.getServiceNumber();
        double double10 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uShort9);
        boolean boolean11 = uRIList0.equals((java.lang.Object) double10);
        org.ccsds.moims.mo.mal.structures.URI uRI13 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet14 = uRI13.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.UShort uShort15 = uRI13.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.Element element16 = uRI13.createElement();
        org.ccsds.moims.mo.mal.structures.LongList longList17 = new org.ccsds.moims.mo.mal.structures.LongList();
        org.ccsds.moims.mo.mal.structures.UShort uShort18 = longList17.getServiceNumber();
        boolean boolean19 = longList17.isEmpty();
        boolean boolean20 = uRI13.equals((java.lang.Object) boolean19);
        java.lang.Long long21 = uRI13.getShortForm();
        try {
            uRIList0.add(16, uRI13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 16, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(uOctet2);
        org.junit.Assert.assertNotNull(uRIItor4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 281475010265084L + "'", long6.equals(281475010265084L));
        org.junit.Assert.assertNotNull(uShort9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(uOctet14);
        org.junit.Assert.assertNotNull(uShort15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(uShort18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 281474993487890L + "'", long21.equals(281474993487890L));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((-18), 7, 0, (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4.equals((-1L)));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.ccsds.moims.mo.mal.structures.FineTime fineTime1 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        org.ccsds.moims.mo.mal.structures.Duration duration3 = new org.ccsds.moims.mo.mal.structures.Duration((double) 13);
        java.lang.Integer int4 = duration3.getTypeShortForm();
        boolean boolean5 = fineTime1.equals((java.lang.Object) duration3);
        org.ccsds.moims.mo.mal.structures.Element element6 = fineTime1.createElement();
        org.ccsds.moims.mo.mal.structures.UShort uShort7 = fineTime1.getServiceNumber();
        java.lang.String str8 = fineTime1.toString();
        java.lang.Integer int9 = fineTime1.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort10 = fineTime1.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.Time time12 = new org.ccsds.moims.mo.mal.structures.Time((long) '4');
        org.ccsds.moims.mo.mal.structures.UShort uShort13 = time12.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper mCServicesHelper14 = new esa.mo.mc.impl.util.MCServicesHelper();
        boolean boolean15 = uShort13.equals((java.lang.Object) mCServicesHelper14);
        boolean boolean16 = fineTime1.equals((java.lang.Object) boolean15);
        org.ccsds.moims.mo.mal.structures.Element element17 = fineTime1.createElement();
        java.lang.String str18 = fineTime1.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4.equals(3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(uShort7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "32" + "'", str8.equals("32"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17 + "'", int9.equals(17));
        org.junit.Assert.assertNotNull(uShort10);
        org.junit.Assert.assertNotNull(uShort13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "32" + "'", str18.equals("32"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.ccsds.moims.mo.mal.structures.LongList longList0 = new org.ccsds.moims.mo.mal.structures.LongList();
        org.ccsds.moims.mo.mal.structures.Element element1 = longList0.createElement();
        java.lang.Integer int2 = longList0.getTypeShortForm();
        int int3 = longList0.size();
        org.ccsds.moims.mo.mal.structures.Blob blob5 = new org.ccsds.moims.mo.mal.structures.Blob("[1.0, 1.0]");
        double double6 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) blob5);
        int int7 = longList0.lastIndexOf((java.lang.Object) blob5);
        try {
            java.lang.Long long10 = longList0.set((int) (byte) -1, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(element1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2.equals((-13)));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        strList3.ensureCapacity((int) (byte) -1);
        java.util.stream.Stream<java.lang.String> strStream7 = strList3.stream();
        org.ccsds.moims.mo.mal.structures.StringList stringList8 = new org.ccsds.moims.mo.mal.structures.StringList();
        org.ccsds.moims.mo.mal.structures.UShort uShort9 = stringList8.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.URIList uRIList10 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList10.trimToSize();
        int int12 = stringList8.lastIndexOf((java.lang.Object) uRIList10);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet13 = uRIList10.getAreaVersion();
        int int14 = strList3.indexOf((java.lang.Object) uRIList10);
        uRIList10.clear();
        java.lang.Long long16 = uRIList10.getShortForm();
        java.lang.Long[] longArray24 = new java.lang.Long[] { (-1L), 281474993487879L, 281474993487879L, 10L, 10L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList25 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList25, longArray24);
        org.ccsds.moims.mo.mal.structures.OctetList octetList27 = new org.ccsds.moims.mo.mal.structures.OctetList();
        boolean boolean28 = longList25.equals((java.lang.Object) octetList27);
        longList25.ensureCapacity(11);
        java.lang.Object obj31 = null;
        boolean boolean32 = longList25.remove(obj31);
        boolean boolean33 = uRIList10.contains((java.lang.Object) boolean32);
        org.ccsds.moims.mo.mal.structures.UShort uShort34 = uRIList10.getServiceNumber();
        java.lang.Long long35 = uRIList10.getShortForm();
        java.lang.Long long36 = uRIList10.getShortForm();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer37 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl38 = mCServicesConsumer37.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl39 = mCServicesConsumer37.getActionService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl40 = mCServicesConsumer37.getAlertService();
        mCServicesConsumer37.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl42 = mCServicesConsumer37.getAlertService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl43 = mCServicesConsumer37.getParameterService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl44 = mCServicesConsumer37.getAggregationService();
        boolean boolean45 = uRIList10.equals((java.lang.Object) mCServicesConsumer37);
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl46 = mCServicesConsumer37.getParameterService();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertNotNull(uShort9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(uOctet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 281475010265070L + "'", long16.equals(281475010265070L));
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(uShort34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 281475010265070L + "'", long35.equals(281475010265070L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 281475010265070L + "'", long36.equals(281475010265070L));
        org.junit.Assert.assertNull(statisticConsumerServiceImpl38);
        org.junit.Assert.assertNull(actionConsumerServiceImpl39);
        org.junit.Assert.assertNull(alertConsumerServiceImpl40);
        org.junit.Assert.assertNull(alertConsumerServiceImpl42);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl43);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl46);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray19 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList20 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList20, floatArray19);
        int int22 = floatList20.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime24 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str25 = fineTime24.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet26 = fineTime24.getAreaVersion();
        java.lang.String str27 = fineTime24.toString();
        boolean boolean28 = floatList20.remove((java.lang.Object) fineTime24);
        java.util.Spliterator<java.lang.Float> floatSpliterator29 = floatList20.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long31 = keyParts30.objectInstance;
        int int32 = floatList20.indexOf((java.lang.Object) keyParts30);
        keyParts30.objectInstance = 281474993487884L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType36 = keyParts30.objectType;
        keyParts30.objectInstance = (-54156853238L);
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "32" + "'", str25.equals("32"));
        org.junit.Assert.assertNotNull(uOctet26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "32" + "'", str27.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatSpliterator29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objectType36);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.ccsds.moims.mo.mal.structures.LongList longList0 = new org.ccsds.moims.mo.mal.structures.LongList();
        org.ccsds.moims.mo.mal.structures.Element element1 = longList0.createElement();
        java.lang.Integer int2 = longList0.getTypeShortForm();
        int int3 = longList0.size();
        org.ccsds.moims.mo.mal.structures.Blob blob5 = new org.ccsds.moims.mo.mal.structures.Blob("[1.0, 1.0]");
        double double6 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) blob5);
        int int7 = longList0.lastIndexOf((java.lang.Object) blob5);
        longList0.ensureCapacity(100);
        org.ccsds.moims.mo.mal.structures.StringList stringList10 = new org.ccsds.moims.mo.mal.structures.StringList();
        org.ccsds.moims.mo.mal.structures.Element element11 = stringList10.createElement();
        java.util.stream.Stream<java.lang.String> strStream12 = stringList10.stream();
        org.ccsds.moims.mo.mal.structures.BooleanList booleanList14 = new org.ccsds.moims.mo.mal.structures.BooleanList((int) (byte) 100);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet15 = booleanList14.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet16 = booleanList14.getAreaVersion();
        java.lang.Long long17 = booleanList14.getShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort18 = booleanList14.getServiceNumber();
        boolean boolean19 = stringList10.retainAll((java.util.Collection<java.lang.Boolean>) booleanList14);
        java.lang.Long long20 = booleanList14.getShortForm();
        java.lang.Long long21 = booleanList14.getShortForm();
        org.ccsds.moims.mo.mal.structures.UShortList uShortList23 = new org.ccsds.moims.mo.mal.structures.UShortList((int) 'a');
        org.ccsds.moims.mo.mal.structures.UShort uShort24 = uShortList23.getAreaNumber();
        java.lang.Integer int25 = uShortList23.getTypeShortForm();
        java.lang.Integer int26 = uShortList23.getTypeShortForm();
        java.lang.Integer int27 = uShortList23.getTypeShortForm();
        java.lang.Object[] objArray28 = uShortList23.toArray();
        boolean boolean29 = booleanList14.remove((java.lang.Object) uShortList23);
        boolean boolean30 = longList0.removeAll((java.util.Collection<java.lang.Boolean>) booleanList14);
        org.junit.Assert.assertNotNull(element1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2.equals((-13)));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertNotNull(uOctet15);
        org.junit.Assert.assertNotNull(uOctet16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 281475010265086L + "'", long17.equals(281475010265086L));
        org.junit.Assert.assertNotNull(uShort18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 281475010265086L + "'", long20.equals(281475010265086L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 281475010265086L + "'", long21.equals(281475010265086L));
        org.junit.Assert.assertNotNull(uShort24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-10) + "'", int25.equals((-10)));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-10) + "'", int26.equals((-10)));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-10) + "'", int27.equals((-10)));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts2 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType3 = keyParts2.objectType;
        keyParts1.objectType = objectType3;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType3, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts9 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType10 = keyParts9.objectType;
        keyParts8.objectType = objectType10;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType10, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts15 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType16 = keyParts15.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts17 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts17.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType20 = keyParts17.objectType;
        keyParts15.sourceObjectType = objectType20;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts23 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType24 = keyParts23.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType24, (java.lang.Long) 281474993487884L);
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType24, (java.lang.Long) 17L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType31 = keyParts30.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType31, (java.lang.Long) 1125912808521736L);
        keyParts15.objectType = objectType24;
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(objectType10);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(objectType31);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType15 = keyParts14.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts16 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts16.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType19 = keyParts16.objectType;
        keyParts14.sourceObjectType = objectType19;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts22 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts22.objectInstance = (-75682021376L);
        java.lang.Long long25 = keyParts22.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts27 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts27.objectInstance = (-75682021376L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts31 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType32 = keyParts31.objectType;
        keyParts31.objectInstance = 281474993487876L;
        java.lang.Long long35 = keyParts31.objectInstance;
        org.ccsds.moims.mo.com.structures.ObjectType objectType36 = keyParts31.sourceObjectType;
        org.ccsds.moims.mo.com.structures.ObjectType objectType37 = keyParts31.sourceObjectType;
        java.lang.Long long38 = keyParts31.objectInstance;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-75682021376L) + "'", long25.equals((-75682021376L)));
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 281474993487876L + "'", long35.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 281474993487876L + "'", long38.equals(281474993487876L));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl3 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl6 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl7 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl8 = mCServicesConsumer0.getActionService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl10 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl11 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl12 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(alertConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl6);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl7);
        org.junit.Assert.assertNull(actionConsumerServiceImpl8);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl10);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl11);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl12);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.ccsds.moims.mo.mal.structures.UShortList uShortList1 = new org.ccsds.moims.mo.mal.structures.UShortList(3);
        boolean boolean2 = uShortList1.isEmpty();
        org.ccsds.moims.mo.mal.structures.Duration duration4 = new org.ccsds.moims.mo.mal.structures.Duration((double) ' ');
        org.ccsds.moims.mo.mal.structures.Element element5 = duration4.createElement();
        double double6 = duration4.getValue();
        java.lang.Long long7 = duration4.getShortForm();
        org.ccsds.moims.mo.mal.structures.Element element8 = duration4.createElement();
        org.ccsds.moims.mo.mal.structures.StringList stringList9 = new org.ccsds.moims.mo.mal.structures.StringList();
        org.ccsds.moims.mo.mal.structures.UShort uShort10 = stringList9.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.URIList uRIList11 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList11.trimToSize();
        int int13 = stringList9.lastIndexOf((java.lang.Object) uRIList11);
        org.ccsds.moims.mo.mal.structures.UShort uShort14 = uRIList11.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts15 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType16 = keyParts15.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts17 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType18 = keyParts17.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts19 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts19.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts19.objectType;
        keyParts17.sourceObjectType = objectType22;
        keyParts15.objectType = objectType22;
        org.ccsds.moims.mo.com.structures.ObjectType objectType25 = keyParts15.objectType;
        boolean boolean26 = uShort14.equals((java.lang.Object) keyParts15);
        boolean boolean27 = duration4.equals((java.lang.Object) keyParts15);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts28 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts29 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType30 = keyParts29.objectType;
        keyParts28.objectType = objectType30;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType30, (java.lang.Long) 281474993487876L);
        keyParts15.sourceObjectType = objectType30;
        boolean boolean35 = uShortList1.remove((java.lang.Object) keyParts15);
        java.lang.Long long36 = keyParts15.objectInstance;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 281474993487875L + "'", long7.equals(281474993487875L));
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(uShort10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(uShort14);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36.equals((-1L)));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl7 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl7);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl1 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl2 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl3 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl4 = mCServicesConsumer0.getAggregationService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl6 = mCServicesConsumer0.getActionService();
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(checkConsumerServiceImpl1);
        org.junit.Assert.assertNull(checkConsumerServiceImpl2);
        org.junit.Assert.assertNull(actionConsumerServiceImpl3);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl4);
        org.junit.Assert.assertNull(actionConsumerServiceImpl6);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray19 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList20 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList20, floatArray19);
        int int22 = floatList20.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime24 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str25 = fineTime24.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet26 = fineTime24.getAreaVersion();
        java.lang.String str27 = fineTime24.toString();
        boolean boolean28 = floatList20.remove((java.lang.Object) fineTime24);
        java.util.Spliterator<java.lang.Float> floatSpliterator29 = floatList20.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long31 = keyParts30.objectInstance;
        int int32 = floatList20.indexOf((java.lang.Object) keyParts30);
        keyParts30.objectInstance = 281474993487884L;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts36 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts37 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType38 = keyParts37.objectType;
        keyParts36.objectType = objectType38;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType38, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts43 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts44 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType45 = keyParts44.objectType;
        keyParts43.objectType = objectType45;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType45, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray55 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList56 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList56, floatArray55);
        int int58 = floatList56.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime60 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str61 = fineTime60.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet62 = fineTime60.getAreaVersion();
        java.lang.String str63 = fineTime60.toString();
        boolean boolean64 = floatList56.remove((java.lang.Object) fineTime60);
        java.util.Spliterator<java.lang.Float> floatSpliterator65 = floatList56.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts66 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long67 = keyParts66.objectInstance;
        int int68 = floatList56.indexOf((java.lang.Object) keyParts66);
        keyParts66.objectInstance = 281474993487884L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType72 = keyParts66.objectType;
        keyParts66.objectInstance = 7L;
        keyParts66.objectInstance = (-1970264707432442L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType78 = keyParts66.sourceObjectType;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "32" + "'", str25.equals("32"));
        org.junit.Assert.assertNotNull(uOctet26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "32" + "'", str27.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatSpliterator29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "32" + "'", str61.equals("32"));
        org.junit.Assert.assertNotNull(uOctet62);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "32" + "'", str63.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(floatSpliterator65);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertNotNull(objectType78);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.mal.structures.UShort uShort10 = identifier3.getAreaNumber();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(uShort10);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl5 = mCServicesConsumer0.getCheckService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(checkConsumerServiceImpl5);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(0, (-15), 16, 2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-64156073982L) + "'", long4.equals((-64156073982L)));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl7 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl8 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl9 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl10 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(checkConsumerServiceImpl7);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl8);
        org.junit.Assert.assertNull(actionConsumerServiceImpl9);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl10);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl1 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl2 = mCServicesConsumer0.getCheckService();
        org.junit.Assert.assertNull(alertConsumerServiceImpl1);
        org.junit.Assert.assertNull(checkConsumerServiceImpl2);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl6 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl8 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl9 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl8);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl9);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList6 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList6, floatArray5);
        int int8 = floatList6.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime10 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str11 = fineTime10.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet12 = fineTime10.getAreaVersion();
        java.lang.String str13 = fineTime10.toString();
        boolean boolean14 = floatList6.remove((java.lang.Object) fineTime10);
        java.util.Spliterator<java.lang.Float> floatSpliterator15 = floatList6.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts16 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long17 = keyParts16.objectInstance;
        int int18 = floatList6.indexOf((java.lang.Object) keyParts16);
        keyParts16.objectInstance = 281474993487884L;
        keyParts16.objectInstance = 2L;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts23 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType24 = keyParts23.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts25 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts25.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType28 = keyParts25.objectType;
        keyParts23.sourceObjectType = objectType28;
        keyParts16.sourceObjectType = objectType28;
        try {
            esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType28, (java.lang.Long) 281475010265084L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UShort argument must not be greater than 65535");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "32" + "'", str11.equals("32"));
        org.junit.Assert.assertNotNull(uOctet12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "32" + "'", str13.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatSpliterator15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(objectType28);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl4 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl5 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl6 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(checkConsumerServiceImpl4);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl5);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl6);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.ccsds.moims.mo.mal.structures.URI[] uRIArray0 = new org.ccsds.moims.mo.mal.structures.URI[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI> uRIList1 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.URI>) uRIList1, uRIArray0);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.URI> uRIItor3 = uRIList1.listIterator();
        java.util.stream.Stream<org.ccsds.moims.mo.mal.structures.URI> uRIStream4 = uRIList1.parallelStream();
        uRIList1.ensureCapacity((int) (short) 100);
        org.ccsds.moims.mo.mal.structures.BooleanList booleanList8 = new org.ccsds.moims.mo.mal.structures.BooleanList(0);
        java.util.ListIterator<java.lang.Boolean> booleanItor9 = booleanList8.listIterator();
        boolean boolean10 = uRIList1.retainAll((java.util.Collection<java.lang.Boolean>) booleanList8);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer11 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl12 = mCServicesConsumer11.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl13 = mCServicesConsumer11.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl14 = mCServicesConsumer11.getStatisticService();
        mCServicesConsumer11.closeConnections();
        mCServicesConsumer11.closeConnections();
        boolean boolean17 = uRIList1.remove((java.lang.Object) mCServicesConsumer11);
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl18 = mCServicesConsumer11.getParameterService();
        org.junit.Assert.assertNotNull(uRIArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uRIItor3);
        org.junit.Assert.assertNotNull(uRIStream4);
        org.junit.Assert.assertNotNull(booleanItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl12);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl13);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl18);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("12", (int) (byte) 0);
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("14", (-7));
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts0.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType3 = keyParts0.objectType;
        keyParts0.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts6 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType8 = keyParts7.objectType;
        keyParts6.objectType = objectType8;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType8, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts13 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType15 = keyParts14.objectType;
        keyParts13.objectType = objectType15;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType15, (java.lang.Long) 281474993487889L);
        keyParts0.sourceObjectType = objectType15;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts21 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts21.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType22, (java.lang.Long) 281474993487884L);
        java.lang.Long long26 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType22, true);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts28 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType29 = keyParts28.objectType;
        keyParts28.objectInstance = 281474993487876L;
        java.lang.Long long32 = keyParts28.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts33 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts34 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType35 = keyParts34.objectType;
        keyParts33.objectType = objectType35;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType35, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts40 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts41 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType42 = keyParts41.objectType;
        keyParts40.objectType = objectType42;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType42, (java.lang.Long) 281474993487889L);
        keyParts28.sourceObjectType = objectType42;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType42, (java.lang.Long) (-83886074L));
        keyParts0.objectType = objectType42;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts52 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts53 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType54 = keyParts53.objectType;
        keyParts52.objectType = objectType54;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType54, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts59 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts60 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType61 = keyParts60.objectType;
        keyParts59.objectType = objectType61;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType61, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts66 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType67 = keyParts66.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts68 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts68.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType71 = keyParts68.objectType;
        keyParts66.sourceObjectType = objectType71;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts74 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts74.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType77 = keyParts74.objectType;
        keyParts74.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts80 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts81 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType82 = keyParts81.objectType;
        keyParts80.objectType = objectType82;
        java.lang.Long long84 = keyParts80.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts85 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType86 = keyParts85.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts87 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts87.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType90 = keyParts87.objectType;
        keyParts85.sourceObjectType = objectType90;
        keyParts80.sourceObjectType = objectType90;
        keyParts74.sourceObjectType = objectType90;
        org.ccsds.moims.mo.com.structures.ObjectType objectType94 = keyParts74.sourceObjectType;
        keyParts66.sourceObjectType = objectType94;
        keyParts0.sourceObjectType = objectType94;
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 281474993487884L + "'", long26.equals(281474993487884L));
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 281474993487876L + "'", long32.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType71);
        org.junit.Assert.assertNotNull(objectType77);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-1L) + "'", long84.equals((-1L)));
        org.junit.Assert.assertNotNull(objectType86);
        org.junit.Assert.assertNotNull(objectType90);
        org.junit.Assert.assertNotNull(objectType94);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray0 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList1 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList1, uShortArray0);
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList6 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList6, booleanArray5);
        boolean boolean8 = uShortList1.removeAll((java.util.Collection<java.lang.Boolean>) booleanList6);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor9 = uShortList1.listIterator();
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor10 = uShortList1.listIterator();
        java.util.stream.Stream<org.ccsds.moims.mo.mal.structures.UShort> uShortStream11 = uShortList1.stream();
        java.lang.Object[] objArray12 = uShortList1.toArray();
        org.ccsds.moims.mo.mal.structures.Identifier identifier14 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier16 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort17 = identifier16.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId18 = null;
        org.ccsds.moims.mo.mal.structures.Time time20 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet21 = time20.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance22 = new esa.mo.mc.impl.provider.ParameterInstance(identifier14, (org.ccsds.moims.mo.mal.structures.Attribute) identifier16, objectId18, time20);
        org.ccsds.moims.mo.com.structures.ObjectId objectId23 = parameterInstance22.getSource();
        org.ccsds.moims.mo.mal.structures.Identifier identifier24 = parameterInstance22.getName();
        org.ccsds.moims.mo.mal.structures.Identifier identifier26 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier28 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort29 = identifier28.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId30 = null;
        org.ccsds.moims.mo.mal.structures.Time time32 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet33 = time32.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance34 = new esa.mo.mc.impl.provider.ParameterInstance(identifier26, (org.ccsds.moims.mo.mal.structures.Attribute) identifier28, objectId30, time32);
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue35 = parameterInstance34.getParameterValue();
        org.ccsds.moims.mo.mal.structures.Identifier identifier37 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier39 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort40 = identifier39.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId41 = null;
        org.ccsds.moims.mo.mal.structures.Time time43 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet44 = time43.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance45 = new esa.mo.mc.impl.provider.ParameterInstance(identifier37, (org.ccsds.moims.mo.mal.structures.Attribute) identifier39, objectId41, time43);
        org.ccsds.moims.mo.com.structures.ObjectId objectId46 = parameterInstance45.getSource();
        org.ccsds.moims.mo.mal.structures.Identifier identifier48 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier50 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort51 = identifier50.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId52 = null;
        org.ccsds.moims.mo.mal.structures.Time time54 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet55 = time54.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance56 = new esa.mo.mc.impl.provider.ParameterInstance(identifier48, (org.ccsds.moims.mo.mal.structures.Attribute) identifier50, objectId52, time54);
        org.ccsds.moims.mo.com.structures.ObjectId objectId57 = parameterInstance56.getSource();
        org.ccsds.moims.mo.mal.structures.Identifier identifier59 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier61 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort62 = identifier61.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId63 = null;
        org.ccsds.moims.mo.mal.structures.Time time65 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet66 = time65.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance67 = new esa.mo.mc.impl.provider.ParameterInstance(identifier59, (org.ccsds.moims.mo.mal.structures.Attribute) identifier61, objectId63, time65);
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue68 = parameterInstance67.getParameterValue();
        org.ccsds.moims.mo.mal.structures.Identifier identifier70 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier72 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort73 = identifier72.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId74 = null;
        org.ccsds.moims.mo.mal.structures.Time time76 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet77 = time76.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance78 = new esa.mo.mc.impl.provider.ParameterInstance(identifier70, (org.ccsds.moims.mo.mal.structures.Attribute) identifier72, objectId74, time76);
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue79 = parameterInstance78.getParameterValue();
        org.ccsds.moims.mo.com.structures.ObjectId objectId80 = parameterInstance78.getSource();
        esa.mo.mc.impl.provider.ParameterInstance[] parameterInstanceArray81 = new esa.mo.mc.impl.provider.ParameterInstance[] { parameterInstance22, parameterInstance34, parameterInstance45, parameterInstance56, parameterInstance67, parameterInstance78 };
        esa.mo.mc.impl.provider.ParameterInstance[] parameterInstanceArray82 = uShortList1.toArray(parameterInstanceArray81);
        org.junit.Assert.assertNotNull(uShortArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(uShortItor9);
        org.junit.Assert.assertNotNull(uShortItor10);
        org.junit.Assert.assertNotNull(uShortStream11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(uShort17);
        org.junit.Assert.assertNotNull(uOctet21);
        org.junit.Assert.assertNull(objectId23);
        org.junit.Assert.assertNotNull(identifier24);
        org.junit.Assert.assertNotNull(uShort29);
        org.junit.Assert.assertNotNull(uOctet33);
        org.junit.Assert.assertNotNull(parameterValue35);
        org.junit.Assert.assertNotNull(uShort40);
        org.junit.Assert.assertNotNull(uOctet44);
        org.junit.Assert.assertNull(objectId46);
        org.junit.Assert.assertNotNull(uShort51);
        org.junit.Assert.assertNotNull(uOctet55);
        org.junit.Assert.assertNull(objectId57);
        org.junit.Assert.assertNotNull(uShort62);
        org.junit.Assert.assertNotNull(uOctet66);
        org.junit.Assert.assertNotNull(parameterValue68);
        org.junit.Assert.assertNotNull(uShort73);
        org.junit.Assert.assertNotNull(uOctet77);
        org.junit.Assert.assertNotNull(parameterValue79);
        org.junit.Assert.assertNull(objectId80);
        org.junit.Assert.assertNotNull(parameterInstanceArray81);
        org.junit.Assert.assertNotNull(parameterInstanceArray82);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((int) (short) 10, (-11), (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-45566918604L) + "'", long4.equals((-45566918604L)));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey(13);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 13L + "'", long1 == 13L);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("[1, 1]", (-18));
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType15 = keyParts14.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts16 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts16.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType19 = keyParts16.objectType;
        keyParts14.sourceObjectType = objectType19;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts22 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts22.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType25 = keyParts22.objectType;
        keyParts22.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts28 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts29 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType30 = keyParts29.objectType;
        keyParts28.objectType = objectType30;
        java.lang.Long long32 = keyParts28.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts33 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType34 = keyParts33.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts35 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts35.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType38 = keyParts35.objectType;
        keyParts33.sourceObjectType = objectType38;
        keyParts28.sourceObjectType = objectType38;
        keyParts22.sourceObjectType = objectType38;
        org.ccsds.moims.mo.com.structures.ObjectType objectType42 = keyParts22.sourceObjectType;
        keyParts14.sourceObjectType = objectType42;
        org.ccsds.moims.mo.com.structures.ObjectType objectType44 = keyParts14.objectType;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32.equals((-1L)));
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(objectType44);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long1 = keyParts0.objectInstance;
        keyParts0.objectInstance = 281475010265077L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType4 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType4, (java.lang.Long) 11L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487884L);
        java.lang.Long long13 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType9, true);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts15 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType16 = keyParts15.objectType;
        keyParts15.objectInstance = 281474993487876L;
        java.lang.Long long19 = keyParts15.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts20 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts21 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts21.objectType;
        keyParts20.objectType = objectType22;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType22, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts27 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts28 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType29 = keyParts28.objectType;
        keyParts27.objectType = objectType29;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType29, (java.lang.Long) 281474993487889L);
        keyParts15.sourceObjectType = objectType29;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts35 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts35.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType38 = keyParts35.objectType;
        keyParts35.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts41 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts42 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType43 = keyParts42.objectType;
        keyParts41.objectType = objectType43;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType43, (java.lang.Long) 281474993487876L);
        keyParts35.sourceObjectType = objectType43;
        keyParts15.objectType = objectType43;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts50 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType51 = keyParts50.objectType;
        keyParts50.objectInstance = 281474993487876L;
        java.lang.Long long54 = keyParts50.objectInstance;
        org.ccsds.moims.mo.com.structures.ObjectType objectType55 = keyParts50.sourceObjectType;
        org.ccsds.moims.mo.com.structures.ObjectType objectType56 = keyParts50.sourceObjectType;
        java.lang.Long long57 = keyParts50.objectInstance;
        keyParts50.objectInstance = 281475010265077L;
        java.lang.Float[] floatArray66 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList67 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList67, floatArray66);
        int int69 = floatList67.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime71 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str72 = fineTime71.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet73 = fineTime71.getAreaVersion();
        java.lang.String str74 = fineTime71.toString();
        boolean boolean75 = floatList67.remove((java.lang.Object) fineTime71);
        java.util.Spliterator<java.lang.Float> floatSpliterator76 = floatList67.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts77 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long78 = keyParts77.objectInstance;
        int int79 = floatList67.indexOf((java.lang.Object) keyParts77);
        keyParts77.objectInstance = 281474993487884L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType82 = keyParts77.objectType;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1.equals((-1L)));
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 281474993487884L + "'", long13.equals(281474993487884L));
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 281474993487876L + "'", long19.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 281474993487876L + "'", long54.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 281474993487876L + "'", long57.equals(281474993487876L));
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 5 + "'", int69 == 5);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "32" + "'", str72.equals("32"));
        org.junit.Assert.assertNotNull(uOctet73);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "32" + "'", str74.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(floatSpliterator76);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-1L) + "'", long78.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(objectType82);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl6 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl7 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl9 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl6);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl7);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl9);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.ccsds.moims.mo.mal.structures.UInteger uInteger0 = new org.ccsds.moims.mo.mal.structures.UInteger();
        java.lang.Integer int1 = uInteger0.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet2 = uInteger0.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.UShort uShort3 = uInteger0.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = uInteger0.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort5 = uInteger0.getAreaNumber();
        java.lang.String str6 = uInteger0.toString();
        java.lang.Long long7 = uInteger0.getShortForm();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = uInteger0.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet9 = uInteger0.getAreaVersion();
        double double10 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uOctet9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1.equals(12));
        org.junit.Assert.assertNotNull(uOctet2);
        org.junit.Assert.assertNotNull(uShort3);
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uShort5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 281474993487884L + "'", long7.equals(281474993487884L));
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(uOctet9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.ccsds.moims.mo.mal.structures.Union union1 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Boolean) false);
        byte[] byteArray3 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob4 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray3);
        org.ccsds.moims.mo.mal.structures.Blob blob5 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray3);
        byte[] byteArray6 = blob5.getValue();
        org.ccsds.moims.mo.mal.structures.Blob blob9 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray6, 0, (int) (short) 255);
        org.ccsds.moims.mo.mal.structures.Blob blob10 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray6);
        boolean boolean11 = union1.equals((java.lang.Object) byteArray6);
        org.ccsds.moims.mo.mal.structures.Blob blob14 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray6, (int) (short) 100, 18);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer15 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl16 = mCServicesConsumer15.getCheckService();
        boolean boolean17 = blob14.equals((java.lang.Object) checkConsumerServiceImpl16);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet18 = blob14.getAreaVersion();
        boolean boolean19 = blob14.isURLBased();
        org.ccsds.moims.mo.mal.structures.UShort uShort20 = blob14.getAreaNumber();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(checkConsumerServiceImpl16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(uOctet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(uShort20);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl6 = mCServicesConsumer0.getAggregationService();
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl6);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = null;
        mCServicesConsumer0.setParameterService(parameterConsumerServiceImpl8);
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl11 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl11);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.ccsds.moims.mo.com.structures.ObjectType objectType0 = null;
        try {
            java.lang.Long long2 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray0 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList1 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList1, uShortArray0);
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList6 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList6, booleanArray5);
        boolean boolean8 = uShortList1.removeAll((java.util.Collection<java.lang.Boolean>) booleanList6);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor9 = uShortList1.listIterator();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 9, 0, 7, (-4), 6, 18, 4, 100, (-4), (-15), (-13), (-18), 9, 4, 18, 18, 18, (-4) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.util.stream.Stream<java.lang.Integer> intStream31 = intList29.parallelStream();
        boolean boolean32 = uShortList1.contains((java.lang.Object) intStream31);
        java.lang.Object[] objArray33 = uShortList1.toArray();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer34 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl35 = mCServicesConsumer34.getParameterService();
        mCServicesConsumer34.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl37 = mCServicesConsumer34.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl38 = mCServicesConsumer34.getAggregationService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl39 = null;
        mCServicesConsumer34.setCheckService(checkConsumerServiceImpl39);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer41 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl42 = mCServicesConsumer41.getParameterService();
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray43 = new esa.mo.mc.impl.util.MCServicesConsumer[] { mCServicesConsumer34, mCServicesConsumer41 };
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray44 = uShortList1.toArray(mCServicesConsumerArray43);
        java.lang.Object[] objArray45 = uShortList1.toArray();
        uShortList1.trimToSize();
        uShortList1.clear();
        org.junit.Assert.assertNotNull(uShortArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(uShortItor9);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl35);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl37);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl38);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl42);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray43);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray44);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("[4, 18, 18, 100, -18, 18, -18, -1]", 7);
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        keyParts0.objectInstance = 281474993487876L;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts4 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType5 = keyParts4.objectType;
        keyParts0.objectType = objectType5;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType5, (java.lang.Long) 281474993487887L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts10 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType11 = keyParts10.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType11, (java.lang.Long) 281474993487884L);
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType11, (java.lang.Long) 17L);
        java.lang.Long long18 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType11, true);
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 17L + "'", long18.equals(17L));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl1 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl2 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(checkConsumerServiceImpl1);
        org.junit.Assert.assertNull(alertConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((int) (short) 100, (-4), (int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4.equals((-1L)));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.mal.structures.Time time10 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mal.structures.Time time11 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.com.structures.ObjectId objectId12 = parameterInstance9.getSource();
        org.ccsds.moims.mo.mal.structures.Identifier identifier13 = parameterInstance9.getName();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(time10);
        org.junit.Assert.assertNotNull(time11);
        org.junit.Assert.assertNull(objectId12);
        org.junit.Assert.assertNotNull(identifier13);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl7 = mCServicesConsumer0.getCheckService();
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
        org.junit.Assert.assertNull(checkConsumerServiceImpl7);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey(97);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521825L + "'", long1 == 1125912808521825L);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray19 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList20 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList20, floatArray19);
        int int22 = floatList20.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime24 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str25 = fineTime24.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet26 = fineTime24.getAreaVersion();
        java.lang.String str27 = fineTime24.toString();
        boolean boolean28 = floatList20.remove((java.lang.Object) fineTime24);
        java.util.Spliterator<java.lang.Float> floatSpliterator29 = floatList20.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long31 = keyParts30.objectInstance;
        int int32 = floatList20.indexOf((java.lang.Object) keyParts30);
        keyParts30.objectInstance = 281474993487884L;
        java.lang.Float[] floatArray41 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList42 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList42, floatArray41);
        int int44 = floatList42.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime46 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str47 = fineTime46.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet48 = fineTime46.getAreaVersion();
        java.lang.String str49 = fineTime46.toString();
        boolean boolean50 = floatList42.remove((java.lang.Object) fineTime46);
        java.util.Spliterator<java.lang.Float> floatSpliterator51 = floatList42.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts52 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long53 = keyParts52.objectInstance;
        int int54 = floatList42.indexOf((java.lang.Object) keyParts52);
        keyParts52.objectInstance = 281474993487884L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType57 = keyParts52.sourceObjectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts58 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType59 = keyParts58.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType59, (java.lang.Long) 281474993487884L);
        keyParts52.objectType = objectType59;
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.util.stream.Stream<java.lang.String> strStream68 = strList66.parallelStream();
        java.lang.Double[] doubleArray73 = new java.lang.Double[] { 10.0d, 1.0d, 10.0d, 10.0d };
        java.util.ArrayList<java.lang.Double> doubleList74 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList74, doubleArray73);
        doubleList74.ensureCapacity((int) ' ');
        org.ccsds.moims.mo.mal.structures.Union union79 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Double) 0.0d);
        boolean boolean80 = doubleList74.contains((java.lang.Object) union79);
        java.util.stream.Stream<java.lang.Double> doubleStream81 = doubleList74.parallelStream();
        boolean boolean82 = strList66.remove((java.lang.Object) doubleList74);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts83 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType84 = keyParts83.objectType;
        keyParts83.objectInstance = 281474993487876L;
        java.lang.Long long87 = keyParts83.objectInstance;
        int int88 = strList66.lastIndexOf((java.lang.Object) keyParts83);
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "32" + "'", str25.equals("32"));
        org.junit.Assert.assertNotNull(uOctet26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "32" + "'", str27.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatSpliterator29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5 + "'", int44 == 5);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "32" + "'", str47.equals("32"));
        org.junit.Assert.assertNotNull(uOctet48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "32" + "'", str49.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(floatSpliterator51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strStream68);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(doubleStream81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objectType84);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 281474993487876L + "'", long87.equals(281474993487876L));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.mal.structures.Time time10 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mal.structures.Time time11 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mal.structures.Time time12 = parameterInstance9.getTimestamp();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(time10);
        org.junit.Assert.assertNotNull(time11);
        org.junit.Assert.assertNotNull(time12);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl3 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl4 = null;
        mCServicesConsumer0.setAggregationService(aggregationConsumerServiceImpl4);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(actionConsumerServiceImpl3);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey((int) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = null;
        mCServicesConsumer0.setParameterService(parameterConsumerServiceImpl8);
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl11 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl13 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl11);
        org.junit.Assert.assertNull(alertConsumerServiceImpl13);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.ccsds.moims.mo.mal.structures.ShortList shortList1 = new org.ccsds.moims.mo.mal.structures.ShortList((int) (byte) 0);
        shortList1.trimToSize();
        org.ccsds.moims.mo.mal.structures.URIList uRIList4 = new org.ccsds.moims.mo.mal.structures.URIList((int) (byte) 10);
        java.lang.String str5 = uRIList4.toString();
        java.util.stream.Stream<org.ccsds.moims.mo.mal.structures.URI> uRIStream6 = uRIList4.parallelStream();
        boolean boolean7 = shortList1.contains((java.lang.Object) uRIList4);
        shortList1.trimToSize();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer9 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl10 = mCServicesConsumer9.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl11 = mCServicesConsumer9.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl12 = mCServicesConsumer9.getStatisticService();
        mCServicesConsumer9.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl14 = mCServicesConsumer9.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl15 = mCServicesConsumer9.getStatisticService();
        mCServicesConsumer9.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl17 = null;
        mCServicesConsumer9.setParameterService(parameterConsumerServiceImpl17);
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl19 = mCServicesConsumer9.getAlertService();
        boolean boolean20 = shortList1.equals((java.lang.Object) mCServicesConsumer9);
        mCServicesConsumer9.closeConnections();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        org.junit.Assert.assertNotNull(uRIStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl10);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl11);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl12);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl14);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl15);
        org.junit.Assert.assertNull(alertConsumerServiceImpl19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl2 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl2);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.ccsds.moims.mo.com.structures.ObjectType objectType0 = null;
        try {
            esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType0, (java.lang.Long) 281475010265086L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UShort argument must not be greater than 65535");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.ccsds.moims.mo.mal.structures.ShortList shortList1 = new org.ccsds.moims.mo.mal.structures.ShortList((int) (byte) 10);
        java.lang.Integer int2 = shortList1.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime3 = new org.ccsds.moims.mo.mal.structures.FineTime();
        boolean boolean4 = shortList1.equals((java.lang.Object) fineTime3);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet5 = shortList1.getAreaVersion();
        java.lang.Integer int6 = shortList1.getTypeShortForm();
        shortList1.clear();
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray8 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList9 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList9, uShortArray8);
        java.lang.Boolean[] booleanArray13 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList14 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList14, booleanArray13);
        boolean boolean16 = uShortList9.removeAll((java.util.Collection<java.lang.Boolean>) booleanList14);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor17 = uShortList9.listIterator();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 9, 0, 7, (-4), 6, 18, 4, 100, (-4), (-15), (-13), (-18), 9, 4, 18, 18, 18, (-4) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.util.stream.Stream<java.lang.Integer> intStream39 = intList37.parallelStream();
        boolean boolean40 = uShortList9.contains((java.lang.Object) intStream39);
        java.lang.Object[] objArray41 = uShortList9.toArray();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer42 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl43 = mCServicesConsumer42.getParameterService();
        mCServicesConsumer42.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl45 = mCServicesConsumer42.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl46 = mCServicesConsumer42.getAggregationService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl47 = null;
        mCServicesConsumer42.setCheckService(checkConsumerServiceImpl47);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer49 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl50 = mCServicesConsumer49.getParameterService();
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray51 = new esa.mo.mc.impl.util.MCServicesConsumer[] { mCServicesConsumer42, mCServicesConsumer49 };
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray52 = uShortList9.toArray(mCServicesConsumerArray51);
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray53 = shortList1.toArray(mCServicesConsumerArray51);
        shortList1.trimToSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2.equals((-9)));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uOctet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6.equals((-9)));
        org.junit.Assert.assertNotNull(uShortArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(uShortItor17);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intStream39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl43);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl45);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl46);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl50);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray51);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray52);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray53);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl8 = mCServicesConsumer0.getAlertService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl8);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.ccsds.moims.mo.mal.structures.URI[] uRIArray0 = new org.ccsds.moims.mo.mal.structures.URI[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI> uRIList1 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.URI>) uRIList1, uRIArray0);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.URI> uRIItor3 = uRIList1.listIterator();
        java.util.stream.Stream<org.ccsds.moims.mo.mal.structures.URI> uRIStream4 = uRIList1.parallelStream();
        uRIList1.ensureCapacity((int) (short) 100);
        org.ccsds.moims.mo.mal.structures.BooleanList booleanList8 = new org.ccsds.moims.mo.mal.structures.BooleanList(0);
        java.util.ListIterator<java.lang.Boolean> booleanItor9 = booleanList8.listIterator();
        boolean boolean10 = uRIList1.retainAll((java.util.Collection<java.lang.Boolean>) booleanList8);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer11 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl12 = mCServicesConsumer11.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl13 = mCServicesConsumer11.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl14 = mCServicesConsumer11.getStatisticService();
        mCServicesConsumer11.closeConnections();
        mCServicesConsumer11.closeConnections();
        boolean boolean17 = uRIList1.remove((java.lang.Object) mCServicesConsumer11);
        org.ccsds.moims.mo.mal.structures.URI uRI18 = null;
        boolean boolean19 = uRIList1.add(uRI18);
        org.junit.Assert.assertNotNull(uRIArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uRIItor3);
        org.junit.Assert.assertNotNull(uRIStream4);
        org.junit.Assert.assertNotNull(booleanItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl12);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl13);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey(17);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521745L + "'", long1 == 1125912808521745L);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray0 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList1 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList1, uShortArray0);
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList6 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList6, booleanArray5);
        boolean boolean8 = uShortList1.removeAll((java.util.Collection<java.lang.Boolean>) booleanList6);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor9 = uShortList1.listIterator();
        uShortList1.clear();
        java.lang.Object[] objArray11 = uShortList1.toArray();
        boolean boolean12 = uShortList1.isEmpty();
        uShortList1.clear();
        java.lang.String str14 = uShortList1.toString();
        org.ccsds.moims.mo.mal.structures.StringList stringList15 = new org.ccsds.moims.mo.mal.structures.StringList();
        java.lang.Integer int16 = stringList15.getTypeShortForm();
        java.lang.Long long17 = stringList15.getShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort18 = stringList15.getAreaNumber();
        boolean boolean19 = uShortList1.add(uShort18);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts20 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts21 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts21.objectType;
        keyParts20.objectType = objectType22;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType22, (java.lang.Long) 281474993487875L);
        boolean boolean26 = uShortList1.equals((java.lang.Object) objectType22);
        org.ccsds.moims.mo.mal.structures.OctetList octetList27 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray29 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList30 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList30, booleanArray29);
        boolean boolean33 = booleanList30.contains((java.lang.Object) (short) 10);
        boolean boolean34 = octetList27.removeAll((java.util.Collection<java.lang.Boolean>) booleanList30);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray35 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList36 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList36, uShortArray35);
        java.lang.Boolean[] booleanArray40 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList41 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList41, booleanArray40);
        boolean boolean43 = uShortList36.removeAll((java.util.Collection<java.lang.Boolean>) booleanList41);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray44 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList45 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList45, uShortArray44);
        java.lang.Boolean[] booleanArray49 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList50 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList50, booleanArray49);
        boolean boolean52 = uShortList45.removeAll((java.util.Collection<java.lang.Boolean>) booleanList50);
        boolean boolean53 = booleanList41.containsAll((java.util.Collection<java.lang.Boolean>) booleanList50);
        int int54 = booleanList50.size();
        boolean boolean55 = octetList27.removeAll((java.util.Collection<java.lang.Boolean>) booleanList50);
        boolean boolean57 = booleanList50.contains((java.lang.Object) 100.0f);
        java.lang.Boolean boolean59 = booleanList50.get(0);
        org.ccsds.moims.mo.mal.structures.OctetList octetList60 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray62 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList63 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList63, booleanArray62);
        boolean boolean66 = booleanList63.contains((java.lang.Object) (short) 10);
        boolean boolean67 = octetList60.removeAll((java.util.Collection<java.lang.Boolean>) booleanList63);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray68 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList69 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList69, uShortArray68);
        java.lang.Boolean[] booleanArray73 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList74 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList74, booleanArray73);
        boolean boolean76 = uShortList69.removeAll((java.util.Collection<java.lang.Boolean>) booleanList74);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray77 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList78 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList78, uShortArray77);
        java.lang.Boolean[] booleanArray82 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList83 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList83, booleanArray82);
        boolean boolean85 = uShortList78.removeAll((java.util.Collection<java.lang.Boolean>) booleanList83);
        boolean boolean86 = booleanList74.containsAll((java.util.Collection<java.lang.Boolean>) booleanList83);
        int int87 = booleanList83.size();
        boolean boolean88 = octetList60.removeAll((java.util.Collection<java.lang.Boolean>) booleanList83);
        boolean boolean90 = booleanList83.contains((java.lang.Object) 100.0f);
        java.util.Spliterator<java.lang.Boolean> booleanSpliterator91 = booleanList83.spliterator();
        int int92 = booleanList50.indexOf((java.lang.Object) booleanList83);
        booleanList50.add(0, (java.lang.Boolean) true);
        boolean boolean96 = uShortList1.retainAll((java.util.Collection<java.lang.Boolean>) booleanList50);
        java.util.Iterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor97 = uShortList1.iterator();
        org.junit.Assert.assertNotNull(uShortArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(uShortItor9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-15) + "'", int16.equals((-15)));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 281475010265073L + "'", long17.equals(281475010265073L));
        org.junit.Assert.assertNotNull(uShort18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(uShortArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(uShortArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59.equals(false));
        org.junit.Assert.assertNotNull(booleanArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(uShortArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(booleanArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(uShortArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(booleanArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2 + "'", int87 == 2);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(booleanSpliterator91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(uShortItor97);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob2 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray1);
        int int3 = blob2.getLength();
        byte[] byteArray4 = blob2.getValue();
        org.ccsds.moims.mo.mal.structures.Blob blob5 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray4);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts6 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType8 = keyParts7.objectType;
        keyParts6.objectType = objectType8;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType8, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts13 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType15 = keyParts14.objectType;
        keyParts13.objectType = objectType15;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType15, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray25 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList26 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList26, floatArray25);
        int int28 = floatList26.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime30 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str31 = fineTime30.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet32 = fineTime30.getAreaVersion();
        java.lang.String str33 = fineTime30.toString();
        boolean boolean34 = floatList26.remove((java.lang.Object) fineTime30);
        java.util.Spliterator<java.lang.Float> floatSpliterator35 = floatList26.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts36 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long37 = keyParts36.objectInstance;
        int int38 = floatList26.indexOf((java.lang.Object) keyParts36);
        keyParts36.objectInstance = 281474993487884L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType42 = keyParts36.objectType;
        org.ccsds.moims.mo.com.structures.ObjectType objectType43 = keyParts36.objectType;
        boolean boolean44 = blob5.equals((java.lang.Object) keyParts36);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "32" + "'", str31.equals("32"));
        org.junit.Assert.assertNotNull(uOctet32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "32" + "'", str33.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(floatSpliterator35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = null;
        mCServicesConsumer0.setParameterService(parameterConsumerServiceImpl8);
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl11 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl12 = mCServicesConsumer0.getAggregationService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl11);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl12);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.ccsds.moims.mo.mal.structures.FineTime fineTime1 = new org.ccsds.moims.mo.mal.structures.FineTime((long) (-13));
        double double2 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) fineTime1);
        java.lang.String str3 = fineTime1.toString();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-13" + "'", str3.equals("-13"));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts2 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType3 = keyParts2.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts4 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts4.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType7 = keyParts4.objectType;
        keyParts2.sourceObjectType = objectType7;
        keyParts0.objectType = objectType7;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType7, (java.lang.Long) 281474993487887L);
        java.lang.Long long13 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType7, true);
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 281474993487887L + "'", long13.equals(281474993487887L));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.ccsds.moims.mo.mal.structures.Identifier identifier0 = new org.ccsds.moims.mo.mal.structures.Identifier();
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray1 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList2 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList2, uShortArray1);
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList7 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList7, booleanArray6);
        boolean boolean9 = uShortList2.removeAll((java.util.Collection<java.lang.Boolean>) booleanList7);
        byte[] byteArray12 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob13 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray12);
        org.ccsds.moims.mo.mal.structures.Blob blob14 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray12);
        org.ccsds.moims.mo.mal.structures.UShort uShort15 = blob14.getAreaNumber();
        uShortList2.add((int) (short) 0, uShort15);
        java.lang.Object[] objArray17 = uShortList2.toArray();
        org.ccsds.moims.mo.mal.structures.URIList uRIList18 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList18.trimToSize();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet20 = uRIList18.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.OctetList octetList21 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray23 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList24 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList24, booleanArray23);
        boolean boolean27 = booleanList24.contains((java.lang.Object) (short) 10);
        boolean boolean28 = octetList21.removeAll((java.util.Collection<java.lang.Boolean>) booleanList24);
        boolean boolean29 = uRIList18.retainAll((java.util.Collection<java.lang.Boolean>) booleanList24);
        java.lang.Long long30 = uRIList18.getShortForm();
        int int31 = uRIList18.size();
        boolean boolean32 = uShortList2.remove((java.lang.Object) uRIList18);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, 1, (-1), 6, 18 };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        boolean boolean42 = intList39.add((java.lang.Integer) 18);
        org.ccsds.moims.mo.mal.structures.OctetList octetList43 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray45 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList46 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList46, booleanArray45);
        boolean boolean49 = booleanList46.contains((java.lang.Object) (short) 10);
        boolean boolean50 = octetList43.removeAll((java.util.Collection<java.lang.Boolean>) booleanList46);
        org.ccsds.moims.mo.mal.structures.Element element51 = octetList43.createElement();
        boolean boolean52 = intList39.remove((java.lang.Object) octetList43);
        boolean boolean53 = octetList43.isEmpty();
        boolean boolean54 = uRIList18.contains((java.lang.Object) octetList43);
        boolean boolean55 = identifier0.equals((java.lang.Object) boolean54);
        java.lang.Integer int56 = identifier0.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.Identifier identifier58 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier60 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort61 = identifier60.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId62 = null;
        org.ccsds.moims.mo.mal.structures.Time time64 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet65 = time64.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance66 = new esa.mo.mc.impl.provider.ParameterInstance(identifier58, (org.ccsds.moims.mo.mal.structures.Attribute) identifier60, objectId62, time64);
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue67 = parameterInstance66.getParameterValue();
        org.ccsds.moims.mo.com.structures.ObjectId objectId68 = null;
        org.ccsds.moims.mo.mal.structures.Time time69 = new org.ccsds.moims.mo.mal.structures.Time();
        java.lang.String str70 = time69.toString();
        org.ccsds.moims.mo.mal.structures.Element element71 = time69.createElement();
        org.ccsds.moims.mo.mal.structures.LongList longList72 = new org.ccsds.moims.mo.mal.structures.LongList();
        java.lang.Long long73 = longList72.getShortForm();
        boolean boolean75 = longList72.add((java.lang.Long) 281474993487873L);
        boolean boolean76 = time69.equals((java.lang.Object) longList72);
        java.lang.Long long77 = time69.getShortForm();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance78 = new esa.mo.mc.impl.provider.ParameterInstance(identifier0, parameterValue67, objectId68, time69);
        org.ccsds.moims.mo.com.structures.ObjectId objectId79 = parameterInstance78.getSource();
        org.junit.Assert.assertNotNull(uShortArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(uShort15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(uOctet20);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 281475010265070L + "'", long30.equals(281475010265070L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 6 + "'", int56.equals(6));
        org.junit.Assert.assertNotNull(uShort61);
        org.junit.Assert.assertNotNull(uOctet65);
        org.junit.Assert.assertNotNull(parameterValue67);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "0" + "'", str70.equals("0"));
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 281475010265075L + "'", long73.equals(281475010265075L));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 281474993487888L + "'", long77.equals(281474993487888L));
        org.junit.Assert.assertNull(objectId79);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.ccsds.moims.mo.mal.structures.Duration duration1 = new org.ccsds.moims.mo.mal.structures.Duration((double) ' ');
        org.ccsds.moims.mo.mal.structures.Element element2 = duration1.createElement();
        double double3 = duration1.getValue();
        java.lang.Long long4 = duration1.getShortForm();
        org.ccsds.moims.mo.mal.structures.Element element5 = duration1.createElement();
        org.ccsds.moims.mo.mal.structures.StringList stringList6 = new org.ccsds.moims.mo.mal.structures.StringList();
        org.ccsds.moims.mo.mal.structures.UShort uShort7 = stringList6.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.URIList uRIList8 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList8.trimToSize();
        int int10 = stringList6.lastIndexOf((java.lang.Object) uRIList8);
        org.ccsds.moims.mo.mal.structures.UShort uShort11 = uRIList8.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts12 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType13 = keyParts12.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType15 = keyParts14.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts16 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts16.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType19 = keyParts16.objectType;
        keyParts14.sourceObjectType = objectType19;
        keyParts12.objectType = objectType19;
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts12.objectType;
        boolean boolean23 = uShort11.equals((java.lang.Object) keyParts12);
        boolean boolean24 = duration1.equals((java.lang.Object) keyParts12);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts25 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts26 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType27 = keyParts26.objectType;
        keyParts25.objectType = objectType27;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType27, (java.lang.Long) 281474993487876L);
        keyParts12.sourceObjectType = objectType27;
        keyParts12.objectInstance = 281474993487887L;
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 281474993487875L + "'", long4.equals(281474993487875L));
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(uShort7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(uShort11);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectType27);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl1 = mCServicesConsumer0.getCheckService();
        mCServicesConsumer0.closeConnections();
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(checkConsumerServiceImpl1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.ccsds.moims.mo.mal.structures.OctetList octetList0 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList3 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
        boolean boolean6 = booleanList3.contains((java.lang.Object) (short) 10);
        boolean boolean7 = octetList0.removeAll((java.util.Collection<java.lang.Boolean>) booleanList3);
        java.lang.Long long8 = octetList0.getShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort9 = octetList0.getAreaNumber();
        octetList0.ensureCapacity((int) (byte) 1);
        boolean boolean13 = octetList0.remove((java.lang.Object) "[10.0, 1.0, 10.0, 10.0]");
        octetList0.trimToSize();
        java.util.stream.Stream<java.lang.Byte> byteStream15 = octetList0.stream();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts16 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts17 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType18 = keyParts17.objectType;
        keyParts16.objectType = objectType18;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType18, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts23 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts24 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType25 = keyParts24.objectType;
        keyParts23.objectType = objectType25;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType25, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts30.objectInstance = (-75682021376L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts34 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType35 = keyParts34.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts36 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType37 = keyParts36.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts38 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts38.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType41 = keyParts38.objectType;
        keyParts36.sourceObjectType = objectType41;
        keyParts34.objectType = objectType41;
        org.ccsds.moims.mo.com.structures.ObjectType objectType44 = keyParts34.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType44, (java.lang.Long) 17L);
        keyParts30.objectType = objectType44;
        boolean boolean48 = octetList0.remove((java.lang.Object) keyParts30);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 281475010265081L + "'", long8.equals(281475010265081L));
        org.junit.Assert.assertNotNull(uShort9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteStream15);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((int) (byte) 100, (int) (short) 255, 65535, 5);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 28148597165916165L + "'", long4.equals(28148597165916165L));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts14.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType17 = keyParts14.objectType;
        keyParts14.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts21 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts21.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType24 = keyParts21.objectType;
        keyParts21.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts27 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts28 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType29 = keyParts28.objectType;
        keyParts27.objectType = objectType29;
        java.lang.Long long31 = keyParts27.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts32 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType33 = keyParts32.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts34 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts34.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType37 = keyParts34.objectType;
        keyParts32.sourceObjectType = objectType37;
        keyParts27.sourceObjectType = objectType37;
        keyParts21.sourceObjectType = objectType37;
        org.ccsds.moims.mo.com.structures.ObjectType objectType41 = keyParts21.objectType;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31.equals((-1L)));
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(objectType41);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) 100, (short) 10, (short) 10, (short) -1 };
        java.util.ArrayList<java.lang.Short> shortList5 = new java.util.ArrayList<java.lang.Short>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Short>) shortList5, shortArray4);
        shortList5.ensureCapacity((int) 'a');
        java.lang.Object[] objArray9 = shortList5.toArray();
        org.ccsds.moims.mo.mal.structures.Duration duration11 = new org.ccsds.moims.mo.mal.structures.Duration((double) ' ');
        org.ccsds.moims.mo.mal.structures.Element element12 = duration11.createElement();
        boolean boolean13 = shortList5.equals((java.lang.Object) element12);
        shortList5.clear();
        shortList5.ensureCapacity((int) (short) 1);
        shortList5.trimToSize();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer18 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl19 = mCServicesConsumer18.getParameterService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl20 = mCServicesConsumer18.getAlertService();
        boolean boolean21 = shortList5.equals((java.lang.Object) mCServicesConsumer18);
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl22 = mCServicesConsumer18.getCheckService();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl19);
        org.junit.Assert.assertNull(alertConsumerServiceImpl20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(checkConsumerServiceImpl22);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray19 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList20 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList20, floatArray19);
        int int22 = floatList20.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime24 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str25 = fineTime24.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet26 = fineTime24.getAreaVersion();
        java.lang.String str27 = fineTime24.toString();
        boolean boolean28 = floatList20.remove((java.lang.Object) fineTime24);
        java.util.Spliterator<java.lang.Float> floatSpliterator29 = floatList20.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long31 = keyParts30.objectInstance;
        int int32 = floatList20.indexOf((java.lang.Object) keyParts30);
        keyParts30.objectInstance = 281474993487884L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType36 = keyParts30.objectType;
        org.ccsds.moims.mo.com.structures.ObjectType objectType37 = keyParts30.sourceObjectType;
        java.lang.Long long38 = keyParts30.objectInstance;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "32" + "'", str25.equals("32"));
        org.junit.Assert.assertNotNull(uOctet26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "32" + "'", str27.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatSpliterator29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 35L + "'", long38.equals(35L));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl6 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl8 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(alertConsumerServiceImpl6);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl8);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(12, (int) (short) 1, (int) ' ', 7);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3377704552366087L + "'", long4.equals(3377704552366087L));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        java.lang.Long long4 = keyParts0.objectInstance;
        org.ccsds.moims.mo.com.structures.ObjectType objectType5 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts6 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType7 = keyParts6.objectType;
        keyParts6.objectInstance = 281474993487876L;
        java.lang.Long long10 = keyParts6.objectInstance;
        org.ccsds.moims.mo.com.structures.ObjectType objectType11 = keyParts6.sourceObjectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts12 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType13 = keyParts12.objectType;
        keyParts12.objectInstance = 281474993487876L;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts16 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType17 = keyParts16.objectType;
        keyParts12.objectType = objectType17;
        keyParts6.objectType = objectType17;
        keyParts0.sourceObjectType = objectType17;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts21 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts21.objectType;
        keyParts21.objectInstance = 281474993487876L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType25 = keyParts21.sourceObjectType;
        keyParts0.sourceObjectType = objectType25;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts27 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType28 = keyParts27.objectType;
        keyParts27.objectInstance = 281474993487876L;
        java.lang.Long long31 = keyParts27.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts32 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts33 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType34 = keyParts33.objectType;
        keyParts32.objectType = objectType34;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType34, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts39 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts40 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType41 = keyParts40.objectType;
        keyParts39.objectType = objectType41;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType41, (java.lang.Long) 281474993487889L);
        keyParts27.sourceObjectType = objectType41;
        org.ccsds.moims.mo.com.structures.ObjectType objectType47 = keyParts27.sourceObjectType;
        keyParts0.sourceObjectType = objectType47;
        keyParts0.objectInstance = 1125912808521728L;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4.equals((-1L)));
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 281474993487876L + "'", long10.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 281474993487876L + "'", long31.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType47);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        try {
            org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("", 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl7 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl9 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl10 = null;
        mCServicesConsumer0.setAggregationService(aggregationConsumerServiceImpl10);
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl12 = null;
        mCServicesConsumer0.setStatisticService(statisticConsumerServiceImpl12);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(checkConsumerServiceImpl7);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl8);
        org.junit.Assert.assertNull(alertConsumerServiceImpl9);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey(6);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521734L + "'", long1 == 1125912808521734L);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl1 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl2 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl3 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl4 = mCServicesConsumer0.getActionService();
        org.junit.Assert.assertNull(checkConsumerServiceImpl1);
        org.junit.Assert.assertNull(checkConsumerServiceImpl2);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl3);
        org.junit.Assert.assertNull(actionConsumerServiceImpl4);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((-15), (int) (byte) 1, 65535, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-4221025155809280L) + "'", long4.equals((-4221025155809280L)));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl1 = mCServicesConsumer0.getActionService();
        org.junit.Assert.assertNull(actionConsumerServiceImpl1);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, 1.0d, 10.0d, 10.0d };
        java.util.ArrayList<java.lang.Double> doubleList5 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList5, doubleArray4);
        doubleList5.ensureCapacity((int) ' ');
        doubleList5.trimToSize();
        doubleList5.ensureCapacity(9);
        java.util.Spliterator<java.lang.Double> doubleSpliterator12 = doubleList5.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts13 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType14 = keyParts13.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts15 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType16 = keyParts15.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts17 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts17.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType20 = keyParts17.objectType;
        keyParts15.sourceObjectType = objectType20;
        keyParts13.objectType = objectType20;
        int int23 = doubleList5.lastIndexOf((java.lang.Object) keyParts13);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts24 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType25 = keyParts24.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType25, (java.lang.Long) 281474993487884L);
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType25, (java.lang.Long) 17L);
        keyParts13.sourceObjectType = objectType25;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts31 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType32 = keyParts31.objectType;
        keyParts31.objectInstance = 281474993487876L;
        java.lang.Long long35 = keyParts31.objectInstance;
        org.ccsds.moims.mo.com.structures.ObjectType objectType36 = keyParts31.sourceObjectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts37 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType38 = keyParts37.objectType;
        keyParts31.sourceObjectType = objectType38;
        keyParts13.sourceObjectType = objectType38;
        try {
            esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType38, (java.lang.Long) 281475010265075L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UShort argument must not be greater than 65535");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleSpliterator12);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 281474993487876L + "'", long35.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(objectType38);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.mal.structures.Time time10 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.com.structures.ObjectId objectId11 = parameterInstance9.getSource();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(time10);
        org.junit.Assert.assertNull(objectId11);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.ccsds.moims.mo.mal.structures.IntegerList integerList0 = new org.ccsds.moims.mo.mal.structures.IntegerList();
        java.lang.Integer int1 = integerList0.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.Element element2 = integerList0.createElement();
        org.ccsds.moims.mo.mal.structures.UShort uShort3 = integerList0.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = integerList0.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort5 = integerList0.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet6 = integerList0.getAreaVersion();
        double double7 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uOctet6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11) + "'", int1.equals((-11)));
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(uShort3);
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uShort5);
        org.junit.Assert.assertNotNull(uOctet6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.ccsds.moims.mo.mal.structures.Identifier identifier0 = esa.mo.mc.impl.util.MCServicesHelper.EMPTY_ID_STR;
        org.ccsds.moims.mo.mal.structures.LongList longList1 = new org.ccsds.moims.mo.mal.structures.LongList();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet2 = new org.ccsds.moims.mo.mal.structures.UOctet();
        boolean boolean3 = longList1.equals((java.lang.Object) uOctet2);
        java.lang.Short[] shortArray8 = new java.lang.Short[] { (short) 100, (short) 10, (short) 10, (short) -1 };
        java.util.ArrayList<java.lang.Short> shortList9 = new java.util.ArrayList<java.lang.Short>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Short>) shortList9, shortArray8);
        shortList9.ensureCapacity((int) 'a');
        shortList9.clear();
        boolean boolean14 = shortList9.isEmpty();
        shortList9.clear();
        java.lang.Object[] objArray16 = shortList9.toArray();
        boolean boolean17 = longList1.remove((java.lang.Object) shortList9);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 4, 18, 18, 100, (-18), 18, (-18), (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList31 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList31, booleanArray30);
        boolean boolean34 = booleanList31.contains((java.lang.Object) (short) 10);
        boolean boolean35 = intList27.containsAll((java.util.Collection<java.lang.Boolean>) booleanList31);
        java.lang.String str36 = intList27.toString();
        java.lang.Float[] floatArray39 = new java.lang.Float[] { 1.0f, 1.0f };
        java.util.ArrayList<java.lang.Float> floatList40 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList40, floatArray39);
        floatList40.trimToSize();
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray43 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList44 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList44, uShortArray43);
        java.lang.Boolean[] booleanArray48 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList49 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList49, booleanArray48);
        boolean boolean51 = uShortList44.removeAll((java.util.Collection<java.lang.Boolean>) booleanList49);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray52 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList53 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList53, uShortArray52);
        java.lang.Boolean[] booleanArray57 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList58 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList58, booleanArray57);
        boolean boolean60 = uShortList53.removeAll((java.util.Collection<java.lang.Boolean>) booleanList58);
        boolean boolean61 = booleanList49.containsAll((java.util.Collection<java.lang.Boolean>) booleanList58);
        int int62 = booleanList58.size();
        java.lang.Boolean boolean65 = booleanList58.set(0, (java.lang.Boolean) true);
        boolean boolean66 = floatList40.removeAll((java.util.Collection<java.lang.Boolean>) booleanList58);
        boolean boolean67 = intList27.retainAll((java.util.Collection<java.lang.Boolean>) booleanList58);
        boolean boolean69 = booleanList58.contains((java.lang.Object) 100.0f);
        boolean boolean70 = longList1.removeAll((java.util.Collection<java.lang.Boolean>) booleanList58);
        java.util.stream.Stream<java.lang.Boolean> booleanStream71 = booleanList58.parallelStream();
        java.util.ListIterator<java.lang.Boolean> booleanItor72 = booleanList58.listIterator();
        boolean boolean73 = identifier0.equals((java.lang.Object) booleanItor72);
        org.ccsds.moims.mo.mal.structures.Identifier identifier75 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier77 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort78 = identifier77.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId79 = null;
        org.ccsds.moims.mo.mal.structures.Time time81 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet82 = time81.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance83 = new esa.mo.mc.impl.provider.ParameterInstance(identifier75, (org.ccsds.moims.mo.mal.structures.Attribute) identifier77, objectId79, time81);
        org.ccsds.moims.mo.com.structures.ObjectId objectId84 = parameterInstance83.getSource();
        org.ccsds.moims.mo.mal.structures.Identifier identifier85 = parameterInstance83.getName();
        org.ccsds.moims.mo.mal.structures.Time time86 = parameterInstance83.getTimestamp();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue87 = parameterInstance83.getParameterValue();
        org.ccsds.moims.mo.com.structures.ObjectId objectId88 = null;
        org.ccsds.moims.mo.mal.structures.Time time90 = new org.ccsds.moims.mo.mal.structures.Time((long) (byte) 1);
        java.lang.String str91 = time90.toString();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance92 = new esa.mo.mc.impl.provider.ParameterInstance(identifier0, parameterValue87, objectId88, time90);
        org.junit.Assert.assertNotNull(identifier0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[4, 18, 18, 100, -18, 18, -18, -1]" + "'", str36.equals("[4, 18, 18, 100, -18, 18, -18, -1]"));
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(uShortArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(uShortArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(booleanArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65.equals(false));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(booleanStream71);
        org.junit.Assert.assertNotNull(booleanItor72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(uShort78);
        org.junit.Assert.assertNotNull(uOctet82);
        org.junit.Assert.assertNull(objectId84);
        org.junit.Assert.assertNotNull(identifier85);
        org.junit.Assert.assertNotNull(time86);
        org.junit.Assert.assertNotNull(parameterValue87);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "1" + "'", str91.equals("1"));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.stream.Stream<java.lang.String> strStream4 = strList2.parallelStream();
        java.lang.Double[] doubleArray9 = new java.lang.Double[] { 10.0d, 1.0d, 10.0d, 10.0d };
        java.util.ArrayList<java.lang.Double> doubleList10 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList10, doubleArray9);
        doubleList10.ensureCapacity((int) ' ');
        org.ccsds.moims.mo.mal.structures.Union union15 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Double) 0.0d);
        boolean boolean16 = doubleList10.contains((java.lang.Object) union15);
        java.util.stream.Stream<java.lang.Double> doubleStream17 = doubleList10.parallelStream();
        boolean boolean18 = strList2.remove((java.lang.Object) doubleList10);
        doubleList10.clear();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts20 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts21 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts21.objectType;
        keyParts20.objectType = objectType22;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType22, (java.lang.Long) 281474993487875L);
        int int26 = doubleList10.indexOf((java.lang.Object) objectType22);
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType22, (java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strStream4);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl3 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl4 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl5 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl6 = mCServicesConsumer0.getAggregationService();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(alertConsumerServiceImpl3);
        org.junit.Assert.assertNull(actionConsumerServiceImpl4);
        org.junit.Assert.assertNull(actionConsumerServiceImpl5);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl6);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray19 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList20 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList20, floatArray19);
        int int22 = floatList20.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime24 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str25 = fineTime24.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet26 = fineTime24.getAreaVersion();
        java.lang.String str27 = fineTime24.toString();
        boolean boolean28 = floatList20.remove((java.lang.Object) fineTime24);
        java.util.Spliterator<java.lang.Float> floatSpliterator29 = floatList20.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long31 = keyParts30.objectInstance;
        int int32 = floatList20.indexOf((java.lang.Object) keyParts30);
        keyParts30.objectInstance = 281474993487884L;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts36 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType37 = keyParts36.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts38 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts38.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType41 = keyParts38.objectType;
        keyParts36.sourceObjectType = objectType41;
        keyParts36.objectInstance = (-10L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType45 = keyParts36.objectType;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "32" + "'", str25.equals("32"));
        org.junit.Assert.assertNotNull(uOctet26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "32" + "'", str27.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatSpliterator29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType45);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList6 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList6, floatArray5);
        int int8 = floatList6.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime10 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str11 = fineTime10.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet12 = fineTime10.getAreaVersion();
        java.lang.String str13 = fineTime10.toString();
        boolean boolean14 = floatList6.remove((java.lang.Object) fineTime10);
        org.ccsds.moims.mo.mal.structures.DoubleList doubleList15 = new org.ccsds.moims.mo.mal.structures.DoubleList();
        boolean boolean16 = fineTime10.equals((java.lang.Object) doubleList15);
        java.lang.Integer int17 = fineTime10.getTypeShortForm();
        long long18 = fineTime10.getValue();
        org.ccsds.moims.mo.mal.structures.UShort uShort19 = fineTime10.getAreaNumber();
        double double20 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uShort19);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "32" + "'", str11.equals("32"));
        org.junit.Assert.assertNotNull(uOctet12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "32" + "'", str13.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 17 + "'", int17.equals(17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(uShort19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long1 = keyParts0.objectInstance;
        keyParts0.objectInstance = 281475010265077L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType4 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType4, (java.lang.Long) 11L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487884L);
        java.lang.Long long13 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType9, true);
        org.ccsds.moims.mo.mal.structures.UShortList uShortList16 = new org.ccsds.moims.mo.mal.structures.UShortList(3);
        boolean boolean17 = uShortList16.isEmpty();
        org.ccsds.moims.mo.mal.structures.Duration duration19 = new org.ccsds.moims.mo.mal.structures.Duration((double) ' ');
        org.ccsds.moims.mo.mal.structures.Element element20 = duration19.createElement();
        double double21 = duration19.getValue();
        java.lang.Long long22 = duration19.getShortForm();
        org.ccsds.moims.mo.mal.structures.Element element23 = duration19.createElement();
        org.ccsds.moims.mo.mal.structures.StringList stringList24 = new org.ccsds.moims.mo.mal.structures.StringList();
        org.ccsds.moims.mo.mal.structures.UShort uShort25 = stringList24.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.URIList uRIList26 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList26.trimToSize();
        int int28 = stringList24.lastIndexOf((java.lang.Object) uRIList26);
        org.ccsds.moims.mo.mal.structures.UShort uShort29 = uRIList26.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType31 = keyParts30.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts32 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType33 = keyParts32.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts34 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts34.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType37 = keyParts34.objectType;
        keyParts32.sourceObjectType = objectType37;
        keyParts30.objectType = objectType37;
        org.ccsds.moims.mo.com.structures.ObjectType objectType40 = keyParts30.objectType;
        boolean boolean41 = uShort29.equals((java.lang.Object) keyParts30);
        boolean boolean42 = duration19.equals((java.lang.Object) keyParts30);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts43 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts44 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType45 = keyParts44.objectType;
        keyParts43.objectType = objectType45;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType45, (java.lang.Long) 281474993487876L);
        keyParts30.sourceObjectType = objectType45;
        boolean boolean50 = uShortList16.remove((java.lang.Object) keyParts30);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1.equals((-1L)));
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 281474993487884L + "'", long13.equals(281474993487884L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 281474993487875L + "'", long22.equals(281474993487875L));
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(uShort25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(uShort29);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(objectType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray19 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList20 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList20, floatArray19);
        int int22 = floatList20.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime24 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str25 = fineTime24.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet26 = fineTime24.getAreaVersion();
        java.lang.String str27 = fineTime24.toString();
        boolean boolean28 = floatList20.remove((java.lang.Object) fineTime24);
        java.util.Spliterator<java.lang.Float> floatSpliterator29 = floatList20.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long31 = keyParts30.objectInstance;
        int int32 = floatList20.indexOf((java.lang.Object) keyParts30);
        keyParts30.objectInstance = 281474993487884L;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts36 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType37 = keyParts36.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType37, (java.lang.Long) 281474993487884L);
        java.lang.Long long41 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType37, true);
        keyParts30.sourceObjectType = objectType37;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts43 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType44 = keyParts43.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts45 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType46 = keyParts45.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts47 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts47.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType50 = keyParts47.objectType;
        keyParts45.sourceObjectType = objectType50;
        keyParts43.objectType = objectType50;
        org.ccsds.moims.mo.com.structures.ObjectType objectType53 = keyParts43.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType53, (java.lang.Long) 17L);
        keyParts30.sourceObjectType = objectType53;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "32" + "'", str25.equals("32"));
        org.junit.Assert.assertNotNull(uOctet26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "32" + "'", str27.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatSpliterator29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 281474993487884L + "'", long41.equals(281474993487884L));
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertNotNull(objectType53);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob2 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray1);
        org.ccsds.moims.mo.mal.structures.Element element3 = blob2.createElement();
        java.lang.Float[] floatArray9 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList10 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList10, floatArray9);
        int int12 = floatList10.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime14 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str15 = fineTime14.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet16 = fineTime14.getAreaVersion();
        java.lang.String str17 = fineTime14.toString();
        boolean boolean18 = floatList10.remove((java.lang.Object) fineTime14);
        java.util.Spliterator<java.lang.Float> floatSpliterator19 = floatList10.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts20 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long21 = keyParts20.objectInstance;
        int int22 = floatList10.indexOf((java.lang.Object) keyParts20);
        keyParts20.objectInstance = 281474993487884L;
        keyParts20.objectInstance = 2L;
        boolean boolean27 = blob2.equals((java.lang.Object) keyParts20);
        keyParts20.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType31 = keyParts30.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType31, (java.lang.Long) 281474993487884L);
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType31, (java.lang.Long) 17L);
        keyParts20.sourceObjectType = objectType31;
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "32" + "'", str15.equals("32"));
        org.junit.Assert.assertNotNull(uOctet16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "32" + "'", str17.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(floatSpliterator19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectType31);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray19 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList20 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList20, floatArray19);
        int int22 = floatList20.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime24 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str25 = fineTime24.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet26 = fineTime24.getAreaVersion();
        java.lang.String str27 = fineTime24.toString();
        boolean boolean28 = floatList20.remove((java.lang.Object) fineTime24);
        java.util.Spliterator<java.lang.Float> floatSpliterator29 = floatList20.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long31 = keyParts30.objectInstance;
        int int32 = floatList20.indexOf((java.lang.Object) keyParts30);
        keyParts30.objectInstance = 281474993487884L;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts36 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts37 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType38 = keyParts37.objectType;
        keyParts36.objectType = objectType38;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType38, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts43 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts44 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType45 = keyParts44.objectType;
        keyParts43.objectType = objectType45;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType45, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray55 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList56 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList56, floatArray55);
        int int58 = floatList56.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime60 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str61 = fineTime60.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet62 = fineTime60.getAreaVersion();
        java.lang.String str63 = fineTime60.toString();
        boolean boolean64 = floatList56.remove((java.lang.Object) fineTime60);
        java.util.Spliterator<java.lang.Float> floatSpliterator65 = floatList56.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts66 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long67 = keyParts66.objectInstance;
        int int68 = floatList56.indexOf((java.lang.Object) keyParts66);
        keyParts66.objectInstance = 281474993487884L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType72 = keyParts66.objectType;
        keyParts66.objectInstance = 7L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType76 = keyParts66.objectType;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "32" + "'", str25.equals("32"));
        org.junit.Assert.assertNotNull(uOctet26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "32" + "'", str27.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatSpliterator29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "32" + "'", str61.equals("32"));
        org.junit.Assert.assertNotNull(uOctet62);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "32" + "'", str63.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(floatSpliterator65);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertNotNull(objectType76);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.ccsds.moims.mo.mal.structures.StringList stringList0 = new org.ccsds.moims.mo.mal.structures.StringList();
        java.lang.Integer int1 = stringList0.getTypeShortForm();
        java.lang.Long long2 = stringList0.getShortForm();
        java.lang.Object[] objArray3 = stringList0.toArray();
        java.util.stream.Stream<java.lang.String> strStream4 = stringList0.parallelStream();
        stringList0.trimToSize();
        stringList0.trimToSize();
        int int7 = stringList0.size();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer8 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl9 = mCServicesConsumer8.getParameterService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl10 = mCServicesConsumer8.getActionService();
        mCServicesConsumer8.closeConnections();
        boolean boolean12 = stringList0.contains((java.lang.Object) mCServicesConsumer8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-15) + "'", int1.equals((-15)));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 281475010265073L + "'", long2.equals(281475010265073L));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(strStream4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl9);
        org.junit.Assert.assertNull(actionConsumerServiceImpl10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 281474993487879L, 1L, 281474993487879L, 281474993487878L, 281475010265073L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray8 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList9 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList9, uShortArray8);
        java.lang.Boolean[] booleanArray13 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList14 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList14, booleanArray13);
        boolean boolean16 = uShortList9.removeAll((java.util.Collection<java.lang.Boolean>) booleanList14);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray17 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList18 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList18, uShortArray17);
        java.lang.Boolean[] booleanArray22 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList23 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList23, booleanArray22);
        boolean boolean25 = uShortList18.removeAll((java.util.Collection<java.lang.Boolean>) booleanList23);
        boolean boolean26 = booleanList14.containsAll((java.util.Collection<java.lang.Boolean>) booleanList23);
        int int27 = booleanList23.size();
        java.lang.Boolean boolean30 = booleanList23.set(0, (java.lang.Boolean) true);
        int int31 = longList6.indexOf((java.lang.Object) booleanList23);
        boolean boolean33 = longList6.add((java.lang.Long) 281475010265086L);
        org.ccsds.moims.mo.mal.structures.OctetList octetList34 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Object[] objArray35 = octetList34.toArray();
        java.util.stream.Stream<java.lang.Byte> byteStream36 = octetList34.stream();
        org.ccsds.moims.mo.mal.structures.URIList uRIList37 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList37.trimToSize();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet39 = uRIList37.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.OctetList octetList40 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray42 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList43 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList43, booleanArray42);
        boolean boolean46 = booleanList43.contains((java.lang.Object) (short) 10);
        boolean boolean47 = octetList40.removeAll((java.util.Collection<java.lang.Boolean>) booleanList43);
        boolean boolean48 = uRIList37.retainAll((java.util.Collection<java.lang.Boolean>) booleanList43);
        org.ccsds.moims.mo.mal.structures.URIList uRIList49 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList49.trimToSize();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet51 = uRIList49.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.OctetList octetList52 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray54 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList55 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList55, booleanArray54);
        boolean boolean58 = booleanList55.contains((java.lang.Object) (short) 10);
        boolean boolean59 = octetList52.removeAll((java.util.Collection<java.lang.Boolean>) booleanList55);
        boolean boolean60 = uRIList49.retainAll((java.util.Collection<java.lang.Boolean>) booleanList55);
        boolean boolean61 = uRIList37.removeAll((java.util.Collection<java.lang.Boolean>) booleanList55);
        java.lang.Object obj62 = uRIList37.clone();
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray63 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList64 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList64, uShortArray63);
        java.lang.Boolean[] booleanArray68 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList69 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList69, booleanArray68);
        boolean boolean71 = uShortList64.removeAll((java.util.Collection<java.lang.Boolean>) booleanList69);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray72 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList73 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList73, uShortArray72);
        java.lang.Boolean[] booleanArray77 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList78 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList78, booleanArray77);
        boolean boolean80 = uShortList73.removeAll((java.util.Collection<java.lang.Boolean>) booleanList78);
        boolean boolean81 = booleanList69.containsAll((java.util.Collection<java.lang.Boolean>) booleanList78);
        int int82 = booleanList78.size();
        boolean boolean83 = uRIList37.removeAll((java.util.Collection<java.lang.Boolean>) booleanList78);
        boolean boolean84 = octetList34.containsAll((java.util.Collection<java.lang.Boolean>) booleanList78);
        java.lang.Object obj85 = booleanList78.clone();
        boolean boolean86 = longList6.removeAll((java.util.Collection<java.lang.Boolean>) booleanList78);
        org.ccsds.moims.mo.mal.structures.BooleanList booleanList88 = new org.ccsds.moims.mo.mal.structures.BooleanList((int) '4');
        boolean boolean89 = longList6.retainAll((java.util.Collection<java.lang.Boolean>) booleanList88);
        java.lang.Object obj90 = longList6.clone();
        java.lang.Object obj91 = longList6.clone();
        org.ccsds.moims.mo.mal.structures.Identifier identifier93 = new org.ccsds.moims.mo.mal.structures.Identifier("32");
        org.ccsds.moims.mo.mal.structures.UOctet uOctet94 = identifier93.getAreaVersion();
        double double95 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uOctet94);
        int int96 = longList6.lastIndexOf((java.lang.Object) uOctet94);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(uShortArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(uShortArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30.equals(false));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(byteStream36);
        org.junit.Assert.assertNotNull(uOctet39);
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(uOctet51);
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(uShortArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(booleanArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(uShortArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(booleanArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2 + "'", int82 == 2);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(obj90);
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertNotNull(uOctet94);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.ccsds.moims.mo.mal.structures.UInteger uInteger0 = new org.ccsds.moims.mo.mal.structures.UInteger();
        java.lang.Integer int1 = uInteger0.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet2 = uInteger0.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.UShort uShort3 = uInteger0.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = uInteger0.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort5 = uInteger0.getAreaNumber();
        java.lang.String str6 = uInteger0.toString();
        org.ccsds.moims.mo.mal.structures.UShort uShort7 = uInteger0.getServiceNumber();
        java.lang.Integer int8 = uInteger0.getTypeShortForm();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer9 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl10 = mCServicesConsumer9.getParameterService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl11 = mCServicesConsumer9.getActionService();
        mCServicesConsumer9.closeConnections();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl13 = mCServicesConsumer9.getActionService();
        boolean boolean14 = uInteger0.equals((java.lang.Object) mCServicesConsumer9);
        mCServicesConsumer9.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl16 = mCServicesConsumer9.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl17 = mCServicesConsumer9.getParameterService();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1.equals(12));
        org.junit.Assert.assertNotNull(uOctet2);
        org.junit.Assert.assertNotNull(uShort3);
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uShort5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        org.junit.Assert.assertNotNull(uShort7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8.equals(12));
        org.junit.Assert.assertNull(parameterConsumerServiceImpl10);
        org.junit.Assert.assertNull(actionConsumerServiceImpl11);
        org.junit.Assert.assertNull(actionConsumerServiceImpl13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl16);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl17);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long1 = keyParts0.objectInstance;
        keyParts0.objectInstance = 281475010265077L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType4 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType4, (java.lang.Long) 11L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487884L);
        java.lang.Long long13 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType9, true);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts16 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType17 = keyParts16.objectType;
        keyParts16.objectInstance = 281474993487876L;
        java.lang.Long long20 = keyParts16.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts21 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts22 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType23 = keyParts22.objectType;
        keyParts21.objectType = objectType23;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType23, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts28 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts29 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType30 = keyParts29.objectType;
        keyParts28.objectType = objectType30;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType30, (java.lang.Long) 281474993487889L);
        keyParts16.sourceObjectType = objectType30;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts36 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts36.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType39 = keyParts36.objectType;
        keyParts36.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts42 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts43 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType44 = keyParts43.objectType;
        keyParts42.objectType = objectType44;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType44, (java.lang.Long) 281474993487876L);
        keyParts36.sourceObjectType = objectType44;
        keyParts16.objectType = objectType44;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType44, (java.lang.Long) (-3659131714011136L));
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts53 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts54 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType55 = keyParts54.objectType;
        keyParts53.objectType = objectType55;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType55, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts60 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts61 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType62 = keyParts61.objectType;
        keyParts60.objectType = objectType62;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType62, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray72 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList73 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList73, floatArray72);
        int int75 = floatList73.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime77 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str78 = fineTime77.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet79 = fineTime77.getAreaVersion();
        java.lang.String str80 = fineTime77.toString();
        boolean boolean81 = floatList73.remove((java.lang.Object) fineTime77);
        java.util.Spliterator<java.lang.Float> floatSpliterator82 = floatList73.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts83 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long84 = keyParts83.objectInstance;
        int int85 = floatList73.indexOf((java.lang.Object) keyParts83);
        keyParts83.objectInstance = 281474993487884L;
        keyParts83.objectInstance = (-83886074L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1.equals((-1L)));
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 281474993487884L + "'", long13.equals(281474993487884L));
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 281474993487876L + "'", long20.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertNotNull(objectType62);
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 5 + "'", int75 == 5);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "32" + "'", str78.equals("32"));
        org.junit.Assert.assertNotNull(uOctet79);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "32" + "'", str80.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(floatSpliterator82);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-1L) + "'", long84.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType15 = keyParts14.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts16 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts16.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType19 = keyParts16.objectType;
        keyParts14.sourceObjectType = objectType19;
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts14.objectType;
        java.lang.Long long24 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType22, false);
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 281474993487872L + "'", long24.equals(281474993487872L));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        keyParts0.objectInstance = 281474993487876L;
        java.lang.Long long4 = keyParts0.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts5 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts6 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType7 = keyParts6.objectType;
        keyParts5.objectType = objectType7;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType7, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts12 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts13 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType14 = keyParts13.objectType;
        keyParts12.objectType = objectType14;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType14, (java.lang.Long) 281474993487889L);
        keyParts0.sourceObjectType = objectType14;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType14, (java.lang.Long) 281474993487872L);
        java.lang.Long long23 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType14, false);
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType14, (java.lang.Long) 281474993487886L);
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 281474993487876L + "'", long4.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 281474993487872L + "'", long23.equals(281474993487872L));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.com.structures.ObjectId objectId10 = parameterInstance9.getSource();
        org.ccsds.moims.mo.mal.structures.Identifier identifier11 = parameterInstance9.getName();
        org.ccsds.moims.mo.mal.structures.Time time12 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.com.structures.ObjectId objectId13 = parameterInstance9.getSource();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNull(objectId10);
        org.junit.Assert.assertNotNull(identifier11);
        org.junit.Assert.assertNotNull(time12);
        org.junit.Assert.assertNull(objectId13);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray19 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList20 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList20, floatArray19);
        int int22 = floatList20.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime24 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str25 = fineTime24.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet26 = fineTime24.getAreaVersion();
        java.lang.String str27 = fineTime24.toString();
        boolean boolean28 = floatList20.remove((java.lang.Object) fineTime24);
        java.util.Spliterator<java.lang.Float> floatSpliterator29 = floatList20.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long31 = keyParts30.objectInstance;
        int int32 = floatList20.indexOf((java.lang.Object) keyParts30);
        keyParts30.objectInstance = 281474993487884L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType36 = keyParts30.objectType;
        org.ccsds.moims.mo.com.structures.ObjectType objectType37 = keyParts30.sourceObjectType;
        org.ccsds.moims.mo.com.structures.ObjectType objectType38 = keyParts30.sourceObjectType;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "32" + "'", str25.equals("32"));
        org.junit.Assert.assertNotNull(uOctet26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "32" + "'", str27.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatSpliterator29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(objectType38);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl3 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        mCServicesConsumer0.closeConnections();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl7 = null;
        mCServicesConsumer0.setAlertService(alertConsumerServiceImpl7);
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl9 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl10 = mCServicesConsumer0.getAlertService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(alertConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl9);
        org.junit.Assert.assertNull(alertConsumerServiceImpl10);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.ccsds.moims.mo.mal.structures.Duration duration1 = new org.ccsds.moims.mo.mal.structures.Duration((double) ' ');
        org.ccsds.moims.mo.mal.structures.Element element2 = duration1.createElement();
        double double3 = duration1.getValue();
        java.lang.Long long4 = duration1.getShortForm();
        org.ccsds.moims.mo.mal.structures.Element element5 = duration1.createElement();
        org.ccsds.moims.mo.mal.structures.UShort uShort6 = duration1.getServiceNumber();
        java.lang.String str7 = duration1.toString();
        double double8 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) duration1);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet9 = duration1.getAreaVersion();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 281474993487875L + "'", long4.equals(281474993487875L));
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(uShort6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "32.0" + "'", str7.equals("32.0"));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(uOctet9);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-18), 2, (-1), (-15), 9, 13, (-18), 10, (-1), 2, (-18), (-4), 9, 100 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.util.stream.Stream<java.lang.Integer> intStream17 = intList15.stream();
        java.lang.Integer int19 = intList15.get((int) (byte) 10);
        java.util.ListIterator<java.lang.Integer> intItor20 = intList15.listIterator();
        boolean boolean21 = intList15.isEmpty();
        intList15.ensureCapacity(3);
        int int24 = intList15.size();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer25 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl26 = mCServicesConsumer25.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl27 = mCServicesConsumer25.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl28 = mCServicesConsumer25.getStatisticService();
        mCServicesConsumer25.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl30 = mCServicesConsumer25.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl31 = mCServicesConsumer25.getStatisticService();
        mCServicesConsumer25.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl33 = null;
        mCServicesConsumer25.setParameterService(parameterConsumerServiceImpl33);
        mCServicesConsumer25.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl36 = mCServicesConsumer25.getAlertService();
        mCServicesConsumer25.closeConnections();
        int int38 = intList15.indexOf((java.lang.Object) mCServicesConsumer25);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-18) + "'", int19.equals((-18)));
        org.junit.Assert.assertNotNull(intItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl26);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl27);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl28);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl30);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl31);
        org.junit.Assert.assertNull(alertConsumerServiceImpl36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(10, 18, (int) (short) 0, (-10));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-10L) + "'", long4.equals((-10L)));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl6 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl7 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl8 = mCServicesConsumer0.getAlertService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl6);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl7);
        org.junit.Assert.assertNull(alertConsumerServiceImpl8);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl2 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl3 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(checkConsumerServiceImpl2);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl3);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray19 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList20 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList20, floatArray19);
        int int22 = floatList20.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime24 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str25 = fineTime24.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet26 = fineTime24.getAreaVersion();
        java.lang.String str27 = fineTime24.toString();
        boolean boolean28 = floatList20.remove((java.lang.Object) fineTime24);
        java.util.Spliterator<java.lang.Float> floatSpliterator29 = floatList20.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long31 = keyParts30.objectInstance;
        int int32 = floatList20.indexOf((java.lang.Object) keyParts30);
        keyParts30.objectInstance = 281474993487884L;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts36 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts37 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType38 = keyParts37.objectType;
        keyParts36.objectType = objectType38;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType38, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts43 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts44 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType45 = keyParts44.objectType;
        keyParts43.objectType = objectType45;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType45, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts50 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts50.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType53 = keyParts50.objectType;
        keyParts50.objectInstance = (-281431993483167L);
        org.ccsds.moims.mo.mal.structures.Duration duration58 = new org.ccsds.moims.mo.mal.structures.Duration((double) ' ');
        org.ccsds.moims.mo.mal.structures.Element element59 = duration58.createElement();
        double double60 = duration58.getValue();
        java.lang.Long long61 = duration58.getShortForm();
        org.ccsds.moims.mo.mal.structures.Element element62 = duration58.createElement();
        org.ccsds.moims.mo.mal.structures.StringList stringList63 = new org.ccsds.moims.mo.mal.structures.StringList();
        org.ccsds.moims.mo.mal.structures.UShort uShort64 = stringList63.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.URIList uRIList65 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList65.trimToSize();
        int int67 = stringList63.lastIndexOf((java.lang.Object) uRIList65);
        org.ccsds.moims.mo.mal.structures.UShort uShort68 = uRIList65.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts69 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType70 = keyParts69.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts71 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType72 = keyParts71.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts73 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts73.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType76 = keyParts73.objectType;
        keyParts71.sourceObjectType = objectType76;
        keyParts69.objectType = objectType76;
        org.ccsds.moims.mo.com.structures.ObjectType objectType79 = keyParts69.objectType;
        boolean boolean80 = uShort68.equals((java.lang.Object) keyParts69);
        boolean boolean81 = duration58.equals((java.lang.Object) keyParts69);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts84 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType85 = keyParts84.objectType;
        keyParts84.objectInstance = 281474993487876L;
        java.lang.Long long88 = keyParts84.objectInstance;
        org.ccsds.moims.mo.com.structures.ObjectType objectType89 = keyParts84.sourceObjectType;
        java.lang.Long long90 = keyParts84.objectInstance;
        java.lang.Long long91 = keyParts84.objectInstance;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "32" + "'", str25.equals("32"));
        org.junit.Assert.assertNotNull(uOctet26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "32" + "'", str27.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatSpliterator29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 32.0d + "'", double60 == 32.0d);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 281474993487875L + "'", long61.equals(281474993487875L));
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(uShort64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(uShort68);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertNotNull(objectType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 281474993487876L + "'", long88.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 281474993487876L + "'", long90.equals(281474993487876L));
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 281474993487876L + "'", long91.equals(281474993487876L));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue10 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.mal.structures.Time time11 = parameterInstance9.getTimestamp();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(parameterValue10);
        org.junit.Assert.assertNotNull(time11);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = null;
        mCServicesConsumer0.setParameterService(parameterConsumerServiceImpl8);
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl11 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl13 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl14 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl15 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl11);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl13);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl14);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl15);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey(18);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 18L + "'", long1 == 18L);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl1 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl2 = null;
        mCServicesConsumer0.setAggregationService(aggregationConsumerServiceImpl2);
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl4 = mCServicesConsumer0.getCheckService();
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(checkConsumerServiceImpl1);
        org.junit.Assert.assertNull(checkConsumerServiceImpl4);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts14.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType17 = keyParts14.objectType;
        keyParts14.objectInstance = (-281431993483167L);
        org.ccsds.moims.mo.mal.structures.Duration duration22 = new org.ccsds.moims.mo.mal.structures.Duration((double) ' ');
        org.ccsds.moims.mo.mal.structures.Element element23 = duration22.createElement();
        double double24 = duration22.getValue();
        java.lang.Long long25 = duration22.getShortForm();
        org.ccsds.moims.mo.mal.structures.Element element26 = duration22.createElement();
        org.ccsds.moims.mo.mal.structures.StringList stringList27 = new org.ccsds.moims.mo.mal.structures.StringList();
        org.ccsds.moims.mo.mal.structures.UShort uShort28 = stringList27.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.URIList uRIList29 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList29.trimToSize();
        int int31 = stringList27.lastIndexOf((java.lang.Object) uRIList29);
        org.ccsds.moims.mo.mal.structures.UShort uShort32 = uRIList29.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts33 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType34 = keyParts33.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts35 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType36 = keyParts35.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts37 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts37.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType40 = keyParts37.objectType;
        keyParts35.sourceObjectType = objectType40;
        keyParts33.objectType = objectType40;
        org.ccsds.moims.mo.com.structures.ObjectType objectType43 = keyParts33.objectType;
        boolean boolean44 = uShort32.equals((java.lang.Object) keyParts33);
        boolean boolean45 = duration22.equals((java.lang.Object) keyParts33);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts47 = null;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 32.0d + "'", double24 == 32.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 281474993487875L + "'", long25.equals(281474993487875L));
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(uShort28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(uShort32);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(objectType40);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType1, (java.lang.Long) 281474993487884L);
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType1, (java.lang.Long) 17L);
        java.lang.Long long7 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType1, false);
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7.equals(0L));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.ccsds.moims.mo.mal.structures.ShortList shortList1 = new org.ccsds.moims.mo.mal.structures.ShortList((int) (byte) 0);
        shortList1.trimToSize();
        org.ccsds.moims.mo.mal.structures.URIList uRIList4 = new org.ccsds.moims.mo.mal.structures.URIList((int) (byte) 10);
        java.lang.String str5 = uRIList4.toString();
        java.util.stream.Stream<org.ccsds.moims.mo.mal.structures.URI> uRIStream6 = uRIList4.parallelStream();
        boolean boolean7 = shortList1.contains((java.lang.Object) uRIList4);
        shortList1.trimToSize();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer9 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl10 = mCServicesConsumer9.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl11 = mCServicesConsumer9.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl12 = mCServicesConsumer9.getStatisticService();
        mCServicesConsumer9.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl14 = mCServicesConsumer9.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl15 = mCServicesConsumer9.getStatisticService();
        mCServicesConsumer9.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl17 = null;
        mCServicesConsumer9.setParameterService(parameterConsumerServiceImpl17);
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl19 = mCServicesConsumer9.getAlertService();
        boolean boolean20 = shortList1.equals((java.lang.Object) mCServicesConsumer9);
        shortList1.add((int) (byte) 0, (java.lang.Short) (short) 1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        org.junit.Assert.assertNotNull(uRIStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl10);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl11);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl12);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl14);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl15);
        org.junit.Assert.assertNull(alertConsumerServiceImpl19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl6 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl7 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
        org.junit.Assert.assertNull(alertConsumerServiceImpl6);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl7);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey((int) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.ccsds.moims.mo.mal.structures.ShortList shortList1 = new org.ccsds.moims.mo.mal.structures.ShortList((int) (byte) 0);
        shortList1.trimToSize();
        org.ccsds.moims.mo.mal.structures.URIList uRIList4 = new org.ccsds.moims.mo.mal.structures.URIList((int) (byte) 10);
        java.lang.String str5 = uRIList4.toString();
        java.util.stream.Stream<org.ccsds.moims.mo.mal.structures.URI> uRIStream6 = uRIList4.parallelStream();
        boolean boolean7 = shortList1.contains((java.lang.Object) uRIList4);
        shortList1.trimToSize();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer9 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl10 = mCServicesConsumer9.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl11 = mCServicesConsumer9.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl12 = mCServicesConsumer9.getStatisticService();
        mCServicesConsumer9.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl14 = mCServicesConsumer9.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl15 = mCServicesConsumer9.getStatisticService();
        mCServicesConsumer9.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl17 = null;
        mCServicesConsumer9.setParameterService(parameterConsumerServiceImpl17);
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl19 = mCServicesConsumer9.getAlertService();
        boolean boolean20 = shortList1.equals((java.lang.Object) mCServicesConsumer9);
        java.lang.Object obj21 = shortList1.clone();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        org.junit.Assert.assertNotNull(uRIStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl10);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl11);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl12);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl14);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl15);
        org.junit.Assert.assertNull(alertConsumerServiceImpl19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) 100, (short) 10, (short) 10, (short) -1 };
        java.util.ArrayList<java.lang.Short> shortList5 = new java.util.ArrayList<java.lang.Short>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Short>) shortList5, shortArray4);
        shortList5.ensureCapacity((int) 'a');
        java.lang.Object[] objArray9 = shortList5.toArray();
        org.ccsds.moims.mo.mal.structures.Duration duration11 = new org.ccsds.moims.mo.mal.structures.Duration((double) ' ');
        org.ccsds.moims.mo.mal.structures.Element element12 = duration11.createElement();
        boolean boolean13 = shortList5.equals((java.lang.Object) element12);
        shortList5.clear();
        shortList5.ensureCapacity((int) (short) 1);
        shortList5.trimToSize();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer18 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl19 = mCServicesConsumer18.getParameterService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl20 = mCServicesConsumer18.getAlertService();
        boolean boolean21 = shortList5.equals((java.lang.Object) mCServicesConsumer18);
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl22 = mCServicesConsumer18.getParameterService();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl19);
        org.junit.Assert.assertNull(alertConsumerServiceImpl20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl22);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.ccsds.moims.mo.mal.structures.IntegerList integerList0 = new org.ccsds.moims.mo.mal.structures.IntegerList();
        java.lang.Integer int1 = integerList0.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.Element element2 = integerList0.createElement();
        org.ccsds.moims.mo.mal.structures.UShort uShort3 = integerList0.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = integerList0.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort5 = integerList0.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet6 = integerList0.getAreaVersion();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer7 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl8 = mCServicesConsumer7.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl9 = mCServicesConsumer7.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl10 = mCServicesConsumer7.getStatisticService();
        mCServicesConsumer7.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl12 = mCServicesConsumer7.getAlertService();
        boolean boolean13 = integerList0.remove((java.lang.Object) mCServicesConsumer7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11) + "'", int1.equals((-11)));
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(uShort3);
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uShort5);
        org.junit.Assert.assertNotNull(uOctet6);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl8);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl9);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl10);
        org.junit.Assert.assertNull(alertConsumerServiceImpl12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts14.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType17 = keyParts14.objectType;
        keyParts14.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts21 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts21.objectType;
        keyParts21.objectInstance = 281474993487876L;
        java.lang.Long long25 = keyParts21.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts26 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts27 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType28 = keyParts27.objectType;
        keyParts26.objectType = objectType28;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType28, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts33 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts34 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType35 = keyParts34.objectType;
        keyParts33.objectType = objectType35;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType35, (java.lang.Long) 281474993487889L);
        keyParts21.sourceObjectType = objectType35;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts41 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts41.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType44 = keyParts41.objectType;
        keyParts41.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts47 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts48 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType49 = keyParts48.objectType;
        keyParts47.objectType = objectType49;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType49, (java.lang.Long) 281474993487876L);
        keyParts41.sourceObjectType = objectType49;
        keyParts21.objectType = objectType49;
        java.lang.Long long55 = keyParts21.objectInstance;
        keyParts21.objectInstance = (-55666802679L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts59 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType60 = keyParts59.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType60, (java.lang.Long) 281474993487884L);
        java.lang.Long long64 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType60, true);
        keyParts21.objectType = objectType60;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 281474993487876L + "'", long25.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 281474993487876L + "'", long55.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 281474993487884L + "'", long64.equals(281474993487884L));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.mal.structures.Time time10 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mal.structures.Identifier identifier11 = parameterInstance9.getName();
        org.ccsds.moims.mo.mal.structures.UShort uShort12 = identifier11.getAreaNumber();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(time10);
        org.junit.Assert.assertNotNull(identifier11);
        org.junit.Assert.assertNotNull(uShort12);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList6 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList6, floatArray5);
        int int8 = floatList6.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime10 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str11 = fineTime10.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet12 = fineTime10.getAreaVersion();
        java.lang.String str13 = fineTime10.toString();
        boolean boolean14 = floatList6.remove((java.lang.Object) fineTime10);
        org.ccsds.moims.mo.mal.structures.DoubleList doubleList15 = new org.ccsds.moims.mo.mal.structures.DoubleList();
        boolean boolean16 = fineTime10.equals((java.lang.Object) doubleList15);
        java.lang.Integer int17 = fineTime10.getTypeShortForm();
        long long18 = fineTime10.getValue();
        org.ccsds.moims.mo.mal.structures.UShort uShort19 = fineTime10.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.LongList longList20 = new org.ccsds.moims.mo.mal.structures.LongList();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet21 = new org.ccsds.moims.mo.mal.structures.UOctet();
        boolean boolean22 = longList20.equals((java.lang.Object) uOctet21);
        java.lang.Short[] shortArray27 = new java.lang.Short[] { (short) 100, (short) 10, (short) 10, (short) -1 };
        java.util.ArrayList<java.lang.Short> shortList28 = new java.util.ArrayList<java.lang.Short>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Short>) shortList28, shortArray27);
        shortList28.ensureCapacity((int) 'a');
        shortList28.clear();
        boolean boolean33 = shortList28.isEmpty();
        shortList28.clear();
        java.lang.Object[] objArray35 = shortList28.toArray();
        boolean boolean36 = longList20.remove((java.lang.Object) shortList28);
        java.lang.Short[] shortArray41 = new java.lang.Short[] { (short) 100, (short) 10, (short) 10, (short) -1 };
        java.util.ArrayList<java.lang.Short> shortList42 = new java.util.ArrayList<java.lang.Short>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Short>) shortList42, shortArray41);
        shortList42.ensureCapacity((int) 'a');
        org.ccsds.moims.mo.mal.structures.DoubleList doubleList47 = new org.ccsds.moims.mo.mal.structures.DoubleList(16);
        org.ccsds.moims.mo.mal.structures.Element element48 = doubleList47.createElement();
        boolean boolean49 = shortList42.contains((java.lang.Object) doubleList47);
        boolean boolean50 = shortList28.equals((java.lang.Object) doubleList47);
        boolean boolean52 = doubleList47.add((java.lang.Double) 1.0d);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer53 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl54 = mCServicesConsumer53.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl55 = mCServicesConsumer53.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl56 = mCServicesConsumer53.getStatisticService();
        mCServicesConsumer53.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl58 = mCServicesConsumer53.getParameterService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl59 = mCServicesConsumer53.getParameterService();
        mCServicesConsumer53.closeConnections();
        mCServicesConsumer53.closeConnections();
        boolean boolean62 = doubleList47.equals((java.lang.Object) mCServicesConsumer53);
        java.util.stream.Stream<java.lang.Double> doubleStream63 = doubleList47.parallelStream();
        boolean boolean64 = fineTime10.equals((java.lang.Object) doubleList47);
        int int65 = doubleList47.size();
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "32" + "'", str11.equals("32"));
        org.junit.Assert.assertNotNull(uOctet12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "32" + "'", str13.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 17 + "'", int17.equals(17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(uShort19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl54);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl55);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl56);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl58);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(doubleStream63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType15 = keyParts14.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts16 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts17 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType18 = keyParts17.objectType;
        keyParts16.objectType = objectType18;
        java.lang.Long long20 = keyParts16.objectInstance;
        org.ccsds.moims.mo.com.structures.ObjectType objectType21 = keyParts16.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts22 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType23 = keyParts22.objectType;
        keyParts22.objectInstance = 281474993487876L;
        java.lang.Long long26 = keyParts22.objectInstance;
        org.ccsds.moims.mo.com.structures.ObjectType objectType27 = keyParts22.sourceObjectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts28 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType29 = keyParts28.objectType;
        keyParts28.objectInstance = 281474993487876L;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts32 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType33 = keyParts32.objectType;
        keyParts28.objectType = objectType33;
        keyParts22.objectType = objectType33;
        keyParts16.sourceObjectType = objectType33;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts37 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType38 = keyParts37.objectType;
        keyParts37.objectInstance = 281474993487876L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType41 = keyParts37.sourceObjectType;
        keyParts16.sourceObjectType = objectType41;
        keyParts14.sourceObjectType = objectType41;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20.equals((-1L)));
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 281474993487876L + "'", long26.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType41);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.ccsds.moims.mo.mal.structures.FineTime fineTime1 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        org.ccsds.moims.mo.mal.structures.Duration duration3 = new org.ccsds.moims.mo.mal.structures.Duration((double) 13);
        java.lang.Integer int4 = duration3.getTypeShortForm();
        boolean boolean5 = fineTime1.equals((java.lang.Object) duration3);
        org.ccsds.moims.mo.mal.structures.Element element6 = fineTime1.createElement();
        org.ccsds.moims.mo.mal.structures.UShort uShort7 = fineTime1.getServiceNumber();
        java.lang.String str8 = fineTime1.toString();
        java.lang.Integer int9 = fineTime1.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort10 = fineTime1.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.Time time12 = new org.ccsds.moims.mo.mal.structures.Time((long) '4');
        org.ccsds.moims.mo.mal.structures.UShort uShort13 = time12.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper mCServicesHelper14 = new esa.mo.mc.impl.util.MCServicesHelper();
        boolean boolean15 = uShort13.equals((java.lang.Object) mCServicesHelper14);
        boolean boolean16 = fineTime1.equals((java.lang.Object) boolean15);
        org.ccsds.moims.mo.mal.structures.LongList longList17 = new org.ccsds.moims.mo.mal.structures.LongList();
        org.ccsds.moims.mo.mal.structures.Element element18 = longList17.createElement();
        java.lang.Integer int19 = longList17.getTypeShortForm();
        int int20 = longList17.size();
        org.ccsds.moims.mo.mal.structures.Blob blob22 = new org.ccsds.moims.mo.mal.structures.Blob("[1.0, 1.0]");
        double double23 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) blob22);
        int int24 = longList17.lastIndexOf((java.lang.Object) blob22);
        org.ccsds.moims.mo.mal.structures.UShort uShort25 = longList17.getServiceNumber();
        boolean boolean26 = fineTime1.equals((java.lang.Object) uShort25);
        org.ccsds.moims.mo.mal.structures.UShort uShort27 = fineTime1.getAreaNumber();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4.equals(3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(uShort7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "32" + "'", str8.equals("32"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17 + "'", int9.equals(17));
        org.junit.Assert.assertNotNull(uShort10);
        org.junit.Assert.assertNotNull(uShort13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-13) + "'", int19.equals((-13)));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(uShort25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(uShort27);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        keyParts0.objectInstance = 281474993487876L;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts4 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType5 = keyParts4.objectType;
        keyParts0.objectType = objectType5;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts7.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType10 = keyParts7.objectType;
        keyParts7.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts13 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType15 = keyParts14.objectType;
        keyParts13.objectType = objectType15;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType15, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts20 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts21 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts21.objectType;
        keyParts20.objectType = objectType22;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType22, (java.lang.Long) 281474993487889L);
        keyParts7.sourceObjectType = objectType22;
        keyParts0.sourceObjectType = objectType22;
        java.lang.Long long29 = keyParts0.objectInstance;
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(objectType10);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 281474993487876L + "'", long29.equals(281474993487876L));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey(15);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521743L + "'", long1 == 1125912808521743L);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray0 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList1 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList1, uShortArray0);
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList6 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList6, booleanArray5);
        boolean boolean8 = uShortList1.removeAll((java.util.Collection<java.lang.Boolean>) booleanList6);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor9 = uShortList1.listIterator();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 9, 0, 7, (-4), 6, 18, 4, 100, (-4), (-15), (-13), (-18), 9, 4, 18, 18, 18, (-4) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.util.stream.Stream<java.lang.Integer> intStream31 = intList29.parallelStream();
        boolean boolean32 = uShortList1.contains((java.lang.Object) intStream31);
        java.lang.Object[] objArray33 = uShortList1.toArray();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer34 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl35 = mCServicesConsumer34.getParameterService();
        mCServicesConsumer34.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl37 = mCServicesConsumer34.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl38 = mCServicesConsumer34.getAggregationService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl39 = null;
        mCServicesConsumer34.setCheckService(checkConsumerServiceImpl39);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer41 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl42 = mCServicesConsumer41.getParameterService();
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray43 = new esa.mo.mc.impl.util.MCServicesConsumer[] { mCServicesConsumer34, mCServicesConsumer41 };
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray44 = uShortList1.toArray(mCServicesConsumerArray43);
        java.util.Iterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor45 = uShortList1.iterator();
        java.util.Spliterator<org.ccsds.moims.mo.mal.structures.UShort> uShortSpliterator46 = uShortList1.spliterator();
        org.junit.Assert.assertNotNull(uShortArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(uShortItor9);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl35);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl37);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl38);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl42);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray43);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray44);
        org.junit.Assert.assertNotNull(uShortItor45);
        org.junit.Assert.assertNotNull(uShortSpliterator46);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl2 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl3 = mCServicesConsumer0.getCheckService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl2);
        org.junit.Assert.assertNull(checkConsumerServiceImpl3);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl7 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(checkConsumerServiceImpl7);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl8);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.ccsds.moims.mo.mal.structures.ShortList shortList1 = new org.ccsds.moims.mo.mal.structures.ShortList((int) (byte) 10);
        java.lang.Integer int2 = shortList1.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort3 = shortList1.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.OctetList octetList4 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Integer int5 = octetList4.getTypeShortForm();
        java.lang.Object[] objArray6 = octetList4.toArray();
        int int7 = shortList1.indexOf((java.lang.Object) objArray6);
        java.util.Iterator<java.lang.Short> shortItor8 = shortList1.iterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts9 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType10 = keyParts9.objectType;
        keyParts9.objectInstance = 281474993487876L;
        java.lang.Long long13 = keyParts9.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts15 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType16 = keyParts15.objectType;
        keyParts14.objectType = objectType16;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType16, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts21 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts22 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType23 = keyParts22.objectType;
        keyParts21.objectType = objectType23;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType23, (java.lang.Long) 281474993487889L);
        keyParts9.sourceObjectType = objectType23;
        boolean boolean29 = shortList1.equals((java.lang.Object) keyParts9);
        org.ccsds.moims.mo.com.structures.ObjectType objectType30 = keyParts9.sourceObjectType;
        java.lang.Long long31 = keyParts9.objectInstance;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2.equals((-9)));
        org.junit.Assert.assertNotNull(uShort3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-7) + "'", int5.equals((-7)));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(shortItor8);
        org.junit.Assert.assertNotNull(objectType10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 281474993487876L + "'", long13.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 281474993487876L + "'", long31.equals(281474993487876L));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.ccsds.moims.mo.mal.structures.IntegerList integerList0 = new org.ccsds.moims.mo.mal.structures.IntegerList();
        java.lang.Integer int1 = integerList0.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.Element element2 = integerList0.createElement();
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 10.0f, (-1.0f) };
        java.util.ArrayList<java.lang.Float> floatList6 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList6, floatArray5);
        byte[] byteArray9 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob10 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray9);
        byte[] byteArray11 = blob10.getValue();
        boolean boolean12 = floatList6.remove((java.lang.Object) byteArray11);
        boolean boolean13 = integerList0.equals((java.lang.Object) floatList6);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer14 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl15 = mCServicesConsumer14.getParameterService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl16 = mCServicesConsumer14.getActionService();
        mCServicesConsumer14.closeConnections();
        boolean boolean18 = integerList0.contains((java.lang.Object) mCServicesConsumer14);
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl19 = mCServicesConsumer14.getCheckService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl20 = mCServicesConsumer14.getAggregationService();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11) + "'", int1.equals((-11)));
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl15);
        org.junit.Assert.assertNull(actionConsumerServiceImpl16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(checkConsumerServiceImpl19);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl20);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(16, 6, 1, 16);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4503625413951504L + "'", long4.equals(4503625413951504L));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts14.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType17 = keyParts14.objectType;
        keyParts14.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts21 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts21.objectType;
        keyParts21.objectInstance = 281474993487876L;
        java.lang.Long long25 = keyParts21.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts26 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts27 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType28 = keyParts27.objectType;
        keyParts26.objectType = objectType28;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType28, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts33 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts34 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType35 = keyParts34.objectType;
        keyParts33.objectType = objectType35;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType35, (java.lang.Long) 281474993487889L);
        keyParts21.sourceObjectType = objectType35;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts41 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts41.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType44 = keyParts41.objectType;
        keyParts41.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts47 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts48 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType49 = keyParts48.objectType;
        keyParts47.objectType = objectType49;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType49, (java.lang.Long) 281474993487876L);
        keyParts41.sourceObjectType = objectType49;
        keyParts21.objectType = objectType49;
        java.lang.Long long55 = keyParts21.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts57 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts57.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType60 = keyParts57.objectType;
        keyParts57.objectInstance = 281474993487874L;
        java.lang.Long long64 = keyParts57.objectInstance;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 281474993487876L + "'", long25.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 281474993487876L + "'", long55.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 35L + "'", long64.equals(35L));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        keyParts0.objectInstance = 281474993487876L;
        java.lang.Long long4 = keyParts0.objectInstance;
        org.ccsds.moims.mo.com.structures.ObjectType objectType5 = keyParts0.sourceObjectType;
        try {
            esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType5, (java.lang.Long) (-9L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UShort argument must not be greater than 65535");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 281474993487876L + "'", long4.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType5);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.ccsds.moims.mo.mal.structures.StringList stringList0 = new org.ccsds.moims.mo.mal.structures.StringList();
        java.lang.Integer int1 = stringList0.getTypeShortForm();
        boolean boolean2 = stringList0.isEmpty();
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray3 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList4 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList4, uShortArray3);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList9 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList9, booleanArray8);
        boolean boolean11 = uShortList4.removeAll((java.util.Collection<java.lang.Boolean>) booleanList9);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor12 = uShortList4.listIterator();
        uShortList4.clear();
        java.lang.Object[] objArray14 = uShortList4.toArray();
        int int15 = stringList0.indexOf((java.lang.Object) uShortList4);
        org.ccsds.moims.mo.mal.structures.DoubleList doubleList17 = new org.ccsds.moims.mo.mal.structures.DoubleList(16);
        org.ccsds.moims.mo.mal.structures.Element element18 = doubleList17.createElement();
        java.lang.Float[] floatArray21 = new java.lang.Float[] { 1.0f, 1.0f };
        java.util.ArrayList<java.lang.Float> floatList22 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList22, floatArray21);
        floatList22.trimToSize();
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray25 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList26 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList26, uShortArray25);
        java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList31 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList31, booleanArray30);
        boolean boolean33 = uShortList26.removeAll((java.util.Collection<java.lang.Boolean>) booleanList31);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray34 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList35 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList35, uShortArray34);
        java.lang.Boolean[] booleanArray39 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList40 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList40, booleanArray39);
        boolean boolean42 = uShortList35.removeAll((java.util.Collection<java.lang.Boolean>) booleanList40);
        boolean boolean43 = booleanList31.containsAll((java.util.Collection<java.lang.Boolean>) booleanList40);
        int int44 = booleanList40.size();
        java.lang.Boolean boolean47 = booleanList40.set(0, (java.lang.Boolean) true);
        boolean boolean48 = floatList22.removeAll((java.util.Collection<java.lang.Boolean>) booleanList40);
        boolean boolean50 = booleanList40.remove((java.lang.Object) (short) 100);
        boolean boolean51 = doubleList17.containsAll((java.util.Collection<java.lang.Boolean>) booleanList40);
        boolean boolean52 = stringList0.containsAll((java.util.Collection<java.lang.Boolean>) booleanList40);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer53 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl54 = mCServicesConsumer53.getParameterService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl55 = mCServicesConsumer53.getAlertService();
        int int56 = stringList0.lastIndexOf((java.lang.Object) mCServicesConsumer53);
        org.ccsds.moims.mo.mal.structures.Duration duration58 = new org.ccsds.moims.mo.mal.structures.Duration((double) 7L);
        java.lang.Integer int59 = duration58.getTypeShortForm();
        int int60 = stringList0.indexOf((java.lang.Object) duration58);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-15) + "'", int1.equals((-15)));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(uShortArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(uShortItor12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(uShortArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(uShortArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47.equals(false));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl54);
        org.junit.Assert.assertNull(alertConsumerServiceImpl55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59.equals(3));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType15 = keyParts14.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts16 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts16.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType19 = keyParts16.objectType;
        keyParts14.sourceObjectType = objectType19;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts22 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts22.objectInstance = (-75682021376L);
        java.lang.Long long25 = keyParts22.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts27 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts27.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.mal.structures.ShortList shortList32 = new org.ccsds.moims.mo.mal.structures.ShortList((int) (byte) 10);
        java.lang.Integer int33 = shortList32.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort34 = shortList32.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.OctetList octetList35 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Integer int36 = octetList35.getTypeShortForm();
        java.lang.Object[] objArray37 = octetList35.toArray();
        int int38 = shortList32.indexOf((java.lang.Object) objArray37);
        java.util.Iterator<java.lang.Short> shortItor39 = shortList32.iterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts40 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType41 = keyParts40.objectType;
        keyParts40.objectInstance = 281474993487876L;
        java.lang.Long long44 = keyParts40.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts45 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts46 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType47 = keyParts46.objectType;
        keyParts45.objectType = objectType47;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType47, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts52 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts53 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType54 = keyParts53.objectType;
        keyParts52.objectType = objectType54;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType54, (java.lang.Long) 281474993487889L);
        keyParts40.sourceObjectType = objectType54;
        boolean boolean60 = shortList32.equals((java.lang.Object) keyParts40);
        org.ccsds.moims.mo.com.structures.ObjectType objectType61 = keyParts40.sourceObjectType;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-75682021376L) + "'", long25.equals((-75682021376L)));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-9) + "'", int33.equals((-9)));
        org.junit.Assert.assertNotNull(uShort34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-7) + "'", int36.equals((-7)));
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(shortItor39);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 281474993487876L + "'", long44.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectType61);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(15, (int) ' ', (int) ' ', 18);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4222262626484242L + "'", long4.equals(4222262626484242L));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.mal.structures.Time time10 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue11 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.mal.structures.Identifier identifier12 = parameterInstance9.getName();
        java.lang.String str13 = identifier12.toString();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(time10);
        org.junit.Assert.assertNotNull(parameterValue11);
        org.junit.Assert.assertNotNull(identifier12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[10.0]" + "'", str13.equals("[10.0]"));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.ccsds.moims.mo.mal.structures.Blob blob1 = new org.ccsds.moims.mo.mal.structures.Blob("[4, 18, 18, 100, -18, 18, -18, -1]");
        org.ccsds.moims.mo.mal.structures.UOctet uOctet2 = blob1.getAreaVersion();
        double double3 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) blob1);
        org.junit.Assert.assertNotNull(uOctet2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("[0, -15, 1, -1, 6, 18, 18]", 6);
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.ccsds.moims.mo.mal.structures.LongList longList0 = new org.ccsds.moims.mo.mal.structures.LongList();
        org.ccsds.moims.mo.mal.structures.Element element1 = longList0.createElement();
        java.lang.Integer int2 = longList0.getTypeShortForm();
        int int3 = longList0.size();
        org.ccsds.moims.mo.mal.structures.Blob blob5 = new org.ccsds.moims.mo.mal.structures.Blob("[1.0, 1.0]");
        double double6 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) blob5);
        int int7 = longList0.lastIndexOf((java.lang.Object) blob5);
        boolean boolean8 = longList0.isEmpty();
        org.junit.Assert.assertNotNull(element1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2.equals((-13)));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl3 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl7 = null;
        mCServicesConsumer0.setStatisticService(statisticConsumerServiceImpl7);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(alertConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey((int) (short) -1, 0, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-281474959933343L) + "'", long4.equals((-281474959933343L)));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.ccsds.moims.mo.mal.structures.LongList longList0 = new org.ccsds.moims.mo.mal.structures.LongList();
        org.ccsds.moims.mo.mal.structures.Element element1 = longList0.createElement();
        java.lang.Integer int2 = longList0.getTypeShortForm();
        int int3 = longList0.size();
        org.ccsds.moims.mo.mal.structures.Blob blob5 = new org.ccsds.moims.mo.mal.structures.Blob("[1.0, 1.0]");
        double double6 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) blob5);
        int int7 = longList0.lastIndexOf((java.lang.Object) blob5);
        longList0.ensureCapacity(100);
        org.ccsds.moims.mo.mal.structures.LongList longList10 = new org.ccsds.moims.mo.mal.structures.LongList();
        java.lang.Long long11 = longList10.getShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort12 = longList10.getServiceNumber();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        strList16.ensureCapacity((int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = strList16.getClass();
        strList16.ensureCapacity((int) (byte) 1);
        java.lang.Short[] shortArray27 = new java.lang.Short[] { (short) 100, (short) 10, (short) 10, (short) -1 };
        java.util.ArrayList<java.lang.Short> shortList28 = new java.util.ArrayList<java.lang.Short>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Short>) shortList28, shortArray27);
        shortList28.ensureCapacity((int) 'a');
        boolean boolean32 = strList16.remove((java.lang.Object) 'a');
        int int33 = strList16.size();
        java.util.stream.Stream<java.lang.String> strStream34 = strList16.parallelStream();
        boolean boolean35 = longList10.equals((java.lang.Object) strList16);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray36 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList37 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList37, uShortArray36);
        java.lang.Boolean[] booleanArray41 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList42 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList42, booleanArray41);
        boolean boolean44 = uShortList37.removeAll((java.util.Collection<java.lang.Boolean>) booleanList42);
        java.lang.Object obj45 = uShortList37.clone();
        org.ccsds.moims.mo.mal.structures.Time time46 = new org.ccsds.moims.mo.mal.structures.Time();
        java.lang.String str47 = time46.toString();
        org.ccsds.moims.mo.mal.structures.UShort uShort48 = time46.getAreaNumber();
        int int49 = uShortList37.indexOf((java.lang.Object) uShort48);
        boolean boolean50 = strList16.contains((java.lang.Object) uShort48);
        java.lang.Long[] longArray58 = new java.lang.Long[] { (-1L), 281474993487879L, 281474993487879L, 10L, 10L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList59 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList59, longArray58);
        org.ccsds.moims.mo.mal.structures.OctetList octetList61 = new org.ccsds.moims.mo.mal.structures.OctetList();
        boolean boolean62 = longList59.equals((java.lang.Object) octetList61);
        java.util.stream.Stream<java.lang.Long> longStream63 = longList59.parallelStream();
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray64 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList65 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList65, uShortArray64);
        java.lang.Boolean[] booleanArray69 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList70 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList70, booleanArray69);
        boolean boolean72 = uShortList65.removeAll((java.util.Collection<java.lang.Boolean>) booleanList70);
        boolean boolean73 = longList59.removeAll((java.util.Collection<java.lang.Boolean>) booleanList70);
        java.lang.Long[] longArray81 = new java.lang.Long[] { (-1L), 281474993487879L, 281474993487879L, 10L, 10L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList82 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList82, longArray81);
        org.ccsds.moims.mo.mal.structures.OctetList octetList84 = new org.ccsds.moims.mo.mal.structures.OctetList();
        boolean boolean85 = longList82.equals((java.lang.Object) octetList84);
        java.util.Iterator<java.lang.Long> longItor86 = longList82.iterator();
        boolean boolean88 = longList82.add((java.lang.Long) 281474993487873L);
        longList82.trimToSize();
        int int90 = longList59.indexOf((java.lang.Object) longList82);
        java.util.ListIterator<java.lang.Long> longItor92 = longList82.listIterator(3);
        boolean boolean93 = longList82.isEmpty();
        java.util.stream.Stream<java.lang.Long> longStream94 = longList82.stream();
        boolean boolean95 = strList16.remove((java.lang.Object) longStream94);
        boolean boolean96 = longList0.contains((java.lang.Object) strList16);
        java.util.Spliterator<java.lang.Long> longSpliterator97 = longList0.spliterator();
        org.junit.Assert.assertNotNull(element1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2.equals((-13)));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 281475010265075L + "'", long11.equals(281475010265075L));
        org.junit.Assert.assertNotNull(uShort12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(strStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(uShortArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "0" + "'", str47.equals("0"));
        org.junit.Assert.assertNotNull(uShort48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(longStream63);
        org.junit.Assert.assertNotNull(uShortArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(booleanArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(longItor86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(longItor92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(longStream94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(longSpliterator97);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.ccsds.moims.mo.mal.structures.Identifier identifier0 = new org.ccsds.moims.mo.mal.structures.Identifier();
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray1 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList2 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList2, uShortArray1);
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList7 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList7, booleanArray6);
        boolean boolean9 = uShortList2.removeAll((java.util.Collection<java.lang.Boolean>) booleanList7);
        byte[] byteArray12 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob13 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray12);
        org.ccsds.moims.mo.mal.structures.Blob blob14 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray12);
        org.ccsds.moims.mo.mal.structures.UShort uShort15 = blob14.getAreaNumber();
        uShortList2.add((int) (short) 0, uShort15);
        java.lang.Object[] objArray17 = uShortList2.toArray();
        org.ccsds.moims.mo.mal.structures.URIList uRIList18 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList18.trimToSize();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet20 = uRIList18.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.OctetList octetList21 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray23 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList24 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList24, booleanArray23);
        boolean boolean27 = booleanList24.contains((java.lang.Object) (short) 10);
        boolean boolean28 = octetList21.removeAll((java.util.Collection<java.lang.Boolean>) booleanList24);
        boolean boolean29 = uRIList18.retainAll((java.util.Collection<java.lang.Boolean>) booleanList24);
        java.lang.Long long30 = uRIList18.getShortForm();
        int int31 = uRIList18.size();
        boolean boolean32 = uShortList2.remove((java.lang.Object) uRIList18);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, 1, (-1), 6, 18 };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        boolean boolean42 = intList39.add((java.lang.Integer) 18);
        org.ccsds.moims.mo.mal.structures.OctetList octetList43 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray45 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList46 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList46, booleanArray45);
        boolean boolean49 = booleanList46.contains((java.lang.Object) (short) 10);
        boolean boolean50 = octetList43.removeAll((java.util.Collection<java.lang.Boolean>) booleanList46);
        org.ccsds.moims.mo.mal.structures.Element element51 = octetList43.createElement();
        boolean boolean52 = intList39.remove((java.lang.Object) octetList43);
        boolean boolean53 = octetList43.isEmpty();
        boolean boolean54 = uRIList18.contains((java.lang.Object) octetList43);
        boolean boolean55 = identifier0.equals((java.lang.Object) boolean54);
        java.lang.Integer int56 = identifier0.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.Identifier identifier58 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier60 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort61 = identifier60.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId62 = null;
        org.ccsds.moims.mo.mal.structures.Time time64 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet65 = time64.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance66 = new esa.mo.mc.impl.provider.ParameterInstance(identifier58, (org.ccsds.moims.mo.mal.structures.Attribute) identifier60, objectId62, time64);
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue67 = parameterInstance66.getParameterValue();
        org.ccsds.moims.mo.com.structures.ObjectId objectId68 = null;
        org.ccsds.moims.mo.mal.structures.Time time69 = new org.ccsds.moims.mo.mal.structures.Time();
        java.lang.String str70 = time69.toString();
        org.ccsds.moims.mo.mal.structures.Element element71 = time69.createElement();
        org.ccsds.moims.mo.mal.structures.LongList longList72 = new org.ccsds.moims.mo.mal.structures.LongList();
        java.lang.Long long73 = longList72.getShortForm();
        boolean boolean75 = longList72.add((java.lang.Long) 281474993487873L);
        boolean boolean76 = time69.equals((java.lang.Object) longList72);
        java.lang.Long long77 = time69.getShortForm();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance78 = new esa.mo.mc.impl.provider.ParameterInstance(identifier0, parameterValue67, objectId68, time69);
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue79 = parameterInstance78.getParameterValue();
        org.ccsds.moims.mo.mal.structures.Time time80 = parameterInstance78.getTimestamp();
        org.ccsds.moims.mo.mal.structures.Time time81 = parameterInstance78.getTimestamp();
        org.junit.Assert.assertNotNull(uShortArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(uShort15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(uOctet20);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 281475010265070L + "'", long30.equals(281475010265070L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 6 + "'", int56.equals(6));
        org.junit.Assert.assertNotNull(uShort61);
        org.junit.Assert.assertNotNull(uOctet65);
        org.junit.Assert.assertNotNull(parameterValue67);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "0" + "'", str70.equals("0"));
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 281475010265075L + "'", long73.equals(281475010265075L));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 281474993487888L + "'", long77.equals(281474993487888L));
        org.junit.Assert.assertNotNull(parameterValue79);
        org.junit.Assert.assertNotNull(time80);
        org.junit.Assert.assertNotNull(time81);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.ccsds.moims.mo.mal.structures.Time time0 = new org.ccsds.moims.mo.mal.structures.Time();
        java.lang.String str1 = time0.toString();
        org.ccsds.moims.mo.mal.structures.UShort uShort2 = time0.getAreaNumber();
        long long3 = time0.getValue();
        org.ccsds.moims.mo.mal.structures.Element element4 = time0.createElement();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer5 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl6 = mCServicesConsumer5.getParameterService();
        mCServicesConsumer5.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl8 = mCServicesConsumer5.getAlertService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl9 = mCServicesConsumer5.getActionService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl10 = mCServicesConsumer5.getActionService();
        boolean boolean11 = time0.equals((java.lang.Object) mCServicesConsumer5);
        java.lang.String str12 = time0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        org.junit.Assert.assertNotNull(uShort2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl8);
        org.junit.Assert.assertNull(actionConsumerServiceImpl9);
        org.junit.Assert.assertNull(actionConsumerServiceImpl10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0" + "'", str12.equals("0"));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet10 = time7.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.Element element11 = time7.createElement();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(uOctet10);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.ccsds.moims.mo.mal.structures.URIList uRIList0 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList0.trimToSize();
        java.lang.String str2 = uRIList0.toString();
        org.ccsds.moims.mo.mal.structures.URIList uRIList3 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList3.trimToSize();
        org.ccsds.moims.mo.mal.structures.UShort uShort5 = uRIList3.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.URI uRI6 = new org.ccsds.moims.mo.mal.structures.URI();
        boolean boolean7 = uRIList3.add(uRI6);
        boolean boolean8 = uRIList0.add(uRI6);
        uRIList0.ensureCapacity(0);
        java.util.Iterator<org.ccsds.moims.mo.mal.structures.URI> uRIItor11 = uRIList0.iterator();
        org.ccsds.moims.mo.mal.structures.Element element12 = uRIList0.createElement();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet13 = uRIList0.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.Identifier identifier14 = new org.ccsds.moims.mo.mal.structures.Identifier();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob17 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray16);
        boolean boolean18 = identifier14.equals((java.lang.Object) blob17);
        java.lang.String str19 = identifier14.toString();
        org.ccsds.moims.mo.mal.structures.UShort uShort20 = identifier14.getServiceNumber();
        double double21 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uShort20);
        boolean boolean22 = uRIList0.equals((java.lang.Object) double21);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        org.junit.Assert.assertNotNull(uShort5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(uRIItor11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(uOctet13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNotNull(uShort20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        try {
            org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("[false, false]", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"[false, false]\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort2 = identifier1.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.UShortList uShortList4 = new org.ccsds.moims.mo.mal.structures.UShortList((int) 'a');
        org.ccsds.moims.mo.mal.structures.UShort uShort5 = uShortList4.getAreaNumber();
        java.lang.Integer int6 = uShortList4.getTypeShortForm();
        java.lang.Integer int7 = uShortList4.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.Union union9 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Double) 32.0d);
        int int10 = uShortList4.lastIndexOf((java.lang.Object) union9);
        boolean boolean11 = identifier1.equals((java.lang.Object) uShortList4);
        java.lang.String str12 = identifier1.toString();
        org.ccsds.moims.mo.mal.structures.Element element13 = identifier1.createElement();
        double double14 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) identifier1);
        java.lang.Long long15 = identifier1.getShortForm();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet16 = identifier1.getAreaVersion();
        org.junit.Assert.assertNotNull(uShort2);
        org.junit.Assert.assertNotNull(uShort5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-10) + "'", int6.equals((-10)));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10) + "'", int7.equals((-10)));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[-1.0, 0.0, 100.0, -1.0, 0.0]" + "'", str12.equals("[-1.0, 0.0, 100.0, -1.0, 0.0]"));
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 281474993487878L + "'", long15.equals(281474993487878L));
        org.junit.Assert.assertNotNull(uOctet16);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl1 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl2 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl3 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl4 = mCServicesConsumer0.getAggregationService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl6 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(checkConsumerServiceImpl1);
        org.junit.Assert.assertNull(checkConsumerServiceImpl2);
        org.junit.Assert.assertNull(actionConsumerServiceImpl3);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl4);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl6);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = null;
        mCServicesConsumer0.setParameterService(parameterConsumerServiceImpl8);
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl10 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl11 = mCServicesConsumer0.getCheckService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl10);
        org.junit.Assert.assertNull(checkConsumerServiceImpl11);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.lang.Float[] floatArray2 = new java.lang.Float[] { 100.0f, 100.0f };
        java.util.ArrayList<java.lang.Float> floatList3 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList3, floatArray2);
        java.util.Spliterator<java.lang.Float> floatSpliterator5 = floatList3.spliterator();
        floatList3.trimToSize();
        org.ccsds.moims.mo.mal.structures.OctetList octetList7 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray9 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList10 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList10, booleanArray9);
        boolean boolean13 = booleanList10.contains((java.lang.Object) (short) 10);
        boolean boolean14 = octetList7.removeAll((java.util.Collection<java.lang.Boolean>) booleanList10);
        java.lang.Long long15 = octetList7.getShortForm();
        java.lang.Integer int16 = octetList7.getTypeShortForm();
        java.util.stream.Stream<java.lang.Byte> byteStream17 = octetList7.stream();
        int int18 = floatList3.indexOf((java.lang.Object) octetList7);
        java.lang.String[] strArray23 = new java.lang.String[] { "[hi!, -4]", "32.0", "[10.0, -1.0]", "[-1, 281474993487879, 281474993487879, 281475010265086, 10, 10, -1, 100]" };
        java.lang.String[][] strArray24 = new java.lang.String[][] { strArray23 };
        java.lang.String[][] strArray25 = octetList7.toArray(strArray24);
        java.util.Spliterator<java.lang.Byte> byteSpliterator26 = octetList7.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts27 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts28 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType29 = keyParts28.objectType;
        keyParts27.objectType = objectType29;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType29, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts34 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts35 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType36 = keyParts35.objectType;
        keyParts34.objectType = objectType36;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType36, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts41 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType42 = keyParts41.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts43 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts43.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType46 = keyParts43.objectType;
        keyParts41.sourceObjectType = objectType46;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts49 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts49.objectInstance = (-75682021376L);
        java.lang.Long long52 = keyParts49.objectInstance;
        boolean boolean54 = octetList7.remove((java.lang.Object) keyParts49);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(floatSpliterator5);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 281475010265081L + "'", long15.equals(281475010265081L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-7) + "'", int16.equals((-7)));
        org.junit.Assert.assertNotNull(byteStream17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(byteSpliterator26);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-75682021376L) + "'", long52.equals((-75682021376L)));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(0, 15, 10, 3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 64592281603L + "'", long4.equals(64592281603L));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.ccsds.moims.mo.mal.structures.ShortList shortList1 = new org.ccsds.moims.mo.mal.structures.ShortList((int) (byte) 10);
        java.lang.Integer int2 = shortList1.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime3 = new org.ccsds.moims.mo.mal.structures.FineTime();
        boolean boolean4 = shortList1.equals((java.lang.Object) fineTime3);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet5 = shortList1.getAreaVersion();
        java.lang.Integer int6 = shortList1.getTypeShortForm();
        shortList1.clear();
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray8 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList9 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList9, uShortArray8);
        java.lang.Boolean[] booleanArray13 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList14 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList14, booleanArray13);
        boolean boolean16 = uShortList9.removeAll((java.util.Collection<java.lang.Boolean>) booleanList14);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor17 = uShortList9.listIterator();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 9, 0, 7, (-4), 6, 18, 4, 100, (-4), (-15), (-13), (-18), 9, 4, 18, 18, 18, (-4) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.util.stream.Stream<java.lang.Integer> intStream39 = intList37.parallelStream();
        boolean boolean40 = uShortList9.contains((java.lang.Object) intStream39);
        java.lang.Object[] objArray41 = uShortList9.toArray();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer42 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl43 = mCServicesConsumer42.getParameterService();
        mCServicesConsumer42.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl45 = mCServicesConsumer42.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl46 = mCServicesConsumer42.getAggregationService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl47 = null;
        mCServicesConsumer42.setCheckService(checkConsumerServiceImpl47);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer49 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl50 = mCServicesConsumer49.getParameterService();
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray51 = new esa.mo.mc.impl.util.MCServicesConsumer[] { mCServicesConsumer42, mCServicesConsumer49 };
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray52 = uShortList9.toArray(mCServicesConsumerArray51);
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray53 = shortList1.toArray(mCServicesConsumerArray51);
        java.lang.Object[] objArray54 = shortList1.toArray();
        org.ccsds.moims.mo.mal.structures.Union union56 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Long) 281474993487884L);
        boolean boolean57 = shortList1.equals((java.lang.Object) 281474993487884L);
        try {
            java.lang.Short short60 = shortList1.set((-9), (java.lang.Short) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2.equals((-9)));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uOctet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6.equals((-9)));
        org.junit.Assert.assertNotNull(uShortArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(uShortItor17);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intStream39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl43);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl45);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl46);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl50);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray51);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray52);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl6 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl7 = mCServicesConsumer0.getActionService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl6);
        org.junit.Assert.assertNull(actionConsumerServiceImpl7);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl6 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl7 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl8 = mCServicesConsumer0.getStatisticService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(alertConsumerServiceImpl6);
        org.junit.Assert.assertNull(actionConsumerServiceImpl7);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl8);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.ccsds.moims.mo.mal.structures.IntegerList integerList0 = new org.ccsds.moims.mo.mal.structures.IntegerList();
        java.lang.Integer int1 = integerList0.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.Element element2 = integerList0.createElement();
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 10.0f, (-1.0f) };
        java.util.ArrayList<java.lang.Float> floatList6 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList6, floatArray5);
        byte[] byteArray9 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob10 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray9);
        byte[] byteArray11 = blob10.getValue();
        boolean boolean12 = floatList6.remove((java.lang.Object) byteArray11);
        boolean boolean13 = integerList0.equals((java.lang.Object) floatList6);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer14 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl15 = mCServicesConsumer14.getParameterService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl16 = mCServicesConsumer14.getActionService();
        mCServicesConsumer14.closeConnections();
        boolean boolean18 = integerList0.contains((java.lang.Object) mCServicesConsumer14);
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl19 = mCServicesConsumer14.getParameterService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl20 = mCServicesConsumer14.getAlertService();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11) + "'", int1.equals((-11)));
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl15);
        org.junit.Assert.assertNull(actionConsumerServiceImpl16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl19);
        org.junit.Assert.assertNull(alertConsumerServiceImpl20);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        keyParts0.objectInstance = 281474993487876L;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts4 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType5 = keyParts4.objectType;
        keyParts0.objectType = objectType5;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType5, (java.lang.Long) 281474993487887L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts10 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType11 = keyParts10.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType11, (java.lang.Long) 281474993487884L);
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType11, (java.lang.Long) 17L);
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType5, (java.lang.Long) (-21374173171L));
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(objectType11);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl3 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl4 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl6 = mCServicesConsumer0.getAggregationService();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(alertConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl4);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl6);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.ccsds.moims.mo.mal.structures.Duration duration1 = new org.ccsds.moims.mo.mal.structures.Duration((double) ' ');
        org.ccsds.moims.mo.mal.structures.Element element2 = duration1.createElement();
        double double3 = duration1.getValue();
        java.lang.Long long4 = duration1.getShortForm();
        org.ccsds.moims.mo.mal.structures.Element element5 = duration1.createElement();
        org.ccsds.moims.mo.mal.structures.StringList stringList6 = new org.ccsds.moims.mo.mal.structures.StringList();
        org.ccsds.moims.mo.mal.structures.UShort uShort7 = stringList6.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.URIList uRIList8 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList8.trimToSize();
        int int10 = stringList6.lastIndexOf((java.lang.Object) uRIList8);
        org.ccsds.moims.mo.mal.structures.UShort uShort11 = uRIList8.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts12 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType13 = keyParts12.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType15 = keyParts14.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts16 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts16.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType19 = keyParts16.objectType;
        keyParts14.sourceObjectType = objectType19;
        keyParts12.objectType = objectType19;
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts12.objectType;
        boolean boolean23 = uShort11.equals((java.lang.Object) keyParts12);
        boolean boolean24 = duration1.equals((java.lang.Object) keyParts12);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts25 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts26 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType27 = keyParts26.objectType;
        keyParts25.objectType = objectType27;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType27, (java.lang.Long) 281474993487876L);
        keyParts12.sourceObjectType = objectType27;
        org.ccsds.moims.mo.com.structures.ObjectType objectType32 = keyParts12.objectType;
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 281474993487875L + "'", long4.equals(281474993487875L));
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(uShort7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(uShort11);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.mal.structures.Time time10 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue11 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.mal.structures.Identifier identifier12 = parameterInstance9.getName();
        org.ccsds.moims.mo.mal.structures.Time time13 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mal.structures.Time time14 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue15 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.com.structures.ObjectId objectId16 = parameterInstance9.getSource();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(time10);
        org.junit.Assert.assertNotNull(parameterValue11);
        org.junit.Assert.assertNotNull(identifier12);
        org.junit.Assert.assertNotNull(time13);
        org.junit.Assert.assertNotNull(time14);
        org.junit.Assert.assertNotNull(parameterValue15);
        org.junit.Assert.assertNull(objectId16);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl3 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl7 = mCServicesConsumer0.getAggregationService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(alertConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl7);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.com.structures.ObjectId objectId10 = parameterInstance9.getSource();
        org.ccsds.moims.mo.mal.structures.Time time11 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mal.structures.Time time12 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.com.structures.ObjectId objectId13 = parameterInstance9.getSource();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNull(objectId10);
        org.junit.Assert.assertNotNull(time11);
        org.junit.Assert.assertNotNull(time12);
        org.junit.Assert.assertNull(objectId13);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        keyParts0.objectInstance = 281474993487876L;
        java.lang.Long long4 = keyParts0.objectInstance;
        org.ccsds.moims.mo.com.structures.ObjectType objectType5 = keyParts0.sourceObjectType;
        org.ccsds.moims.mo.com.structures.ObjectType objectType7 = null;
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 281474993487876L + "'", long4.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType5);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.ccsds.moims.mo.mal.structures.Time time0 = new org.ccsds.moims.mo.mal.structures.Time();
        java.lang.String str1 = time0.toString();
        org.ccsds.moims.mo.mal.structures.UShort uShort2 = time0.getAreaNumber();
        long long3 = time0.getValue();
        org.ccsds.moims.mo.mal.structures.Element element4 = time0.createElement();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer5 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl6 = mCServicesConsumer5.getParameterService();
        mCServicesConsumer5.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl8 = mCServicesConsumer5.getAlertService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl9 = mCServicesConsumer5.getActionService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl10 = mCServicesConsumer5.getActionService();
        boolean boolean11 = time0.equals((java.lang.Object) mCServicesConsumer5);
        long long12 = time0.getValue();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        org.junit.Assert.assertNotNull(uShort2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl8);
        org.junit.Assert.assertNull(actionConsumerServiceImpl9);
        org.junit.Assert.assertNull(actionConsumerServiceImpl10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.ccsds.moims.mo.mal.structures.Union union1 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Integer) (-5));
        org.ccsds.moims.mo.mal.structures.UShort uShort2 = union1.getAreaNumber();
        double double3 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uShort2);
        org.junit.Assert.assertNotNull(uShort2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.mal.structures.Time time10 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue11 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.mal.structures.Identifier identifier12 = parameterInstance9.getName();
        org.ccsds.moims.mo.mal.structures.Time time13 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mal.structures.Time time14 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue15 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue16 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue17 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.com.structures.ObjectId objectId18 = parameterInstance9.getSource();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue19 = parameterInstance9.getParameterValue();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(time10);
        org.junit.Assert.assertNotNull(parameterValue11);
        org.junit.Assert.assertNotNull(identifier12);
        org.junit.Assert.assertNotNull(time13);
        org.junit.Assert.assertNotNull(time14);
        org.junit.Assert.assertNotNull(parameterValue15);
        org.junit.Assert.assertNotNull(parameterValue16);
        org.junit.Assert.assertNotNull(parameterValue17);
        org.junit.Assert.assertNull(objectId18);
        org.junit.Assert.assertNotNull(parameterValue19);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.mal.structures.Time time10 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue11 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.mal.structures.Identifier identifier12 = parameterInstance9.getName();
        org.ccsds.moims.mo.mal.structures.Time time13 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mal.structures.Time time14 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue15 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue16 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue17 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.com.structures.ObjectId objectId18 = parameterInstance9.getSource();
        org.ccsds.moims.mo.com.structures.ObjectId objectId19 = parameterInstance9.getSource();
        org.ccsds.moims.mo.com.structures.ObjectId objectId20 = parameterInstance9.getSource();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(time10);
        org.junit.Assert.assertNotNull(parameterValue11);
        org.junit.Assert.assertNotNull(identifier12);
        org.junit.Assert.assertNotNull(time13);
        org.junit.Assert.assertNotNull(time14);
        org.junit.Assert.assertNotNull(parameterValue15);
        org.junit.Assert.assertNotNull(parameterValue16);
        org.junit.Assert.assertNotNull(parameterValue17);
        org.junit.Assert.assertNull(objectId18);
        org.junit.Assert.assertNull(objectId19);
        org.junit.Assert.assertNull(objectId20);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.ccsds.moims.mo.mal.structures.LongList longList0 = new org.ccsds.moims.mo.mal.structures.LongList();
        org.ccsds.moims.mo.mal.structures.Element element1 = longList0.createElement();
        java.lang.Integer int2 = longList0.getTypeShortForm();
        int int3 = longList0.size();
        org.ccsds.moims.mo.mal.structures.Blob blob5 = new org.ccsds.moims.mo.mal.structures.Blob("[1.0, 1.0]");
        double double6 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) blob5);
        int int7 = longList0.lastIndexOf((java.lang.Object) blob5);
        org.ccsds.moims.mo.mal.structures.UShort uShort8 = longList0.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort9 = longList0.getServiceNumber();
        java.lang.String str10 = uShort9.toString();
        org.ccsds.moims.mo.mal.structures.Element element11 = uShort9.createElement();
        org.junit.Assert.assertNotNull(element1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2.equals((-13)));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(uShort8);
        org.junit.Assert.assertNotNull(uShort9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0" + "'", str10.equals("0"));
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.ccsds.moims.mo.mal.structures.IntegerList integerList0 = new org.ccsds.moims.mo.mal.structures.IntegerList();
        java.lang.Integer int1 = integerList0.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.Element element2 = integerList0.createElement();
        org.ccsds.moims.mo.mal.structures.UShort uShort3 = integerList0.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = integerList0.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort5 = integerList0.getAreaNumber();
        double double6 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uShort5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11) + "'", int1.equals((-11)));
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(uShort3);
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uShort5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertSourceObjectTypeAsKey(12);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 12L + "'", long1 == 12L);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        keyParts0.objectInstance = 281475010265081L;
        keyParts0.objectInstance = 1125912808521735L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType6 = keyParts0.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts7.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType10 = keyParts7.objectType;
        keyParts0.sourceObjectType = objectType10;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType10, (java.lang.Long) 0L);
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType10, (java.lang.Long) 4503634154881279L);
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertNotNull(objectType6);
        org.junit.Assert.assertNotNull(objectType10);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.com.structures.ObjectId objectId10 = parameterInstance9.getSource();
        org.ccsds.moims.mo.mal.structures.Time time11 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.com.structures.ObjectId objectId12 = parameterInstance9.getSource();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNull(objectId10);
        org.junit.Assert.assertNotNull(time11);
        org.junit.Assert.assertNull(objectId12);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("[-1.0, 10.0]", (int) (byte) 0);
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.ccsds.moims.mo.mal.structures.LongList longList0 = new org.ccsds.moims.mo.mal.structures.LongList();
        org.ccsds.moims.mo.mal.structures.Element element1 = longList0.createElement();
        java.lang.Integer int2 = longList0.getTypeShortForm();
        int int3 = longList0.size();
        org.ccsds.moims.mo.mal.structures.Blob blob5 = new org.ccsds.moims.mo.mal.structures.Blob("[1.0, 1.0]");
        double double6 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) blob5);
        int int7 = longList0.lastIndexOf((java.lang.Object) blob5);
        org.ccsds.moims.mo.mal.structures.UShort uShort8 = longList0.getServiceNumber();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.stream.Stream<java.lang.String> strStream13 = strList11.parallelStream();
        java.util.Spliterator<java.lang.String> strSpliterator14 = strList11.spliterator();
        java.util.stream.Stream<java.lang.String> strStream15 = strList11.stream();
        strList11.trimToSize();
        org.ccsds.moims.mo.mal.structures.BooleanList booleanList18 = new org.ccsds.moims.mo.mal.structures.BooleanList(1);
        boolean boolean19 = strList11.removeAll((java.util.Collection<java.lang.Boolean>) booleanList18);
        boolean boolean20 = longList0.retainAll((java.util.Collection<java.lang.Boolean>) booleanList18);
        java.lang.Object obj21 = booleanList18.clone();
        org.junit.Assert.assertNotNull(element1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2.equals((-13)));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(uShort8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertNotNull(strStream15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.com.structures.ObjectId objectId10 = parameterInstance9.getSource();
        org.ccsds.moims.mo.mal.structures.Identifier identifier11 = parameterInstance9.getName();
        org.ccsds.moims.mo.mal.structures.Time time12 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mal.structures.Identifier identifier13 = parameterInstance9.getName();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNull(objectId10);
        org.junit.Assert.assertNotNull(identifier11);
        org.junit.Assert.assertNotNull(time12);
        org.junit.Assert.assertNotNull(identifier13);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.lang.Long[] longArray17 = new java.lang.Long[] { 281475010265086L, 281474993487880L, 281475010265081L, 281474993487888L, (-1L), 281475010265079L, 281474993487875L, (-1L), 100L, 281475010265086L, 281474993487878L, 281474993487886L, 281474993487883L, 10L, 281474993487887L, 281474993487873L, 281474993487888L };
        java.util.ArrayList<java.lang.Long> longList18 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList18, longArray17);
        java.lang.Double[] doubleArray24 = new java.lang.Double[] { 10.0d, 1.0d, 10.0d, 10.0d };
        java.util.ArrayList<java.lang.Double> doubleList25 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList25, doubleArray24);
        doubleList25.ensureCapacity((int) ' ');
        org.ccsds.moims.mo.mal.structures.Union union30 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Double) 0.0d);
        boolean boolean31 = doubleList25.contains((java.lang.Object) union30);
        java.lang.Integer int32 = union30.getTypeShortForm();
        java.lang.Long long33 = union30.getShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort34 = union30.getAreaNumber();
        boolean boolean35 = longList18.remove((java.lang.Object) union30);
        java.lang.String str36 = longList18.toString();
        int int37 = longList18.size();
        org.ccsds.moims.mo.mal.structures.Identifier identifier38 = new org.ccsds.moims.mo.mal.structures.Identifier();
        java.lang.String str39 = identifier38.toString();
        org.ccsds.moims.mo.mal.structures.URIList uRIList40 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList40.trimToSize();
        org.ccsds.moims.mo.mal.structures.UShort uShort42 = uRIList40.getAreaNumber();
        boolean boolean43 = identifier38.equals((java.lang.Object) uRIList40);
        java.lang.Object obj44 = uRIList40.clone();
        java.util.stream.Stream<org.ccsds.moims.mo.mal.structures.URI> uRIStream45 = uRIList40.stream();
        java.lang.String str46 = uRIList40.toString();
        org.ccsds.moims.mo.mal.structures.UShort uShort47 = uRIList40.getAreaNumber();
        java.lang.Object obj48 = uRIList40.clone();
        boolean boolean49 = longList18.contains((java.lang.Object) uRIList40);
        java.lang.Long long51 = longList18.remove(0);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts52 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts53 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType54 = keyParts53.objectType;
        keyParts52.objectType = objectType54;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType54, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts59 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts60 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType61 = keyParts60.objectType;
        keyParts59.objectType = objectType61;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType61, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts66 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType67 = keyParts66.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts68 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts68.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType71 = keyParts68.objectType;
        keyParts66.sourceObjectType = objectType71;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts74 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType75 = keyParts74.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType75, (java.lang.Long) 281474993487884L);
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType75, (java.lang.Long) 17L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts81 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType82 = keyParts81.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType82, (java.lang.Long) 1125912808521736L);
        keyParts66.objectType = objectType75;
        int int87 = longList18.indexOf((java.lang.Object) objectType75);
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType75, (java.lang.Long) (-251658140L));
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32.equals(5));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 281474993487877L + "'", long33.equals(281474993487877L));
        org.junit.Assert.assertNotNull(uShort34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[281475010265086, 281474993487880, 281475010265081, 281474993487888, -1, 281475010265079, 281474993487875, -1, 100, 281475010265086, 281474993487878, 281474993487886, 281474993487883, 10, 281474993487887, 281474993487873, 281474993487888]" + "'", str36.equals("[281475010265086, 281474993487880, 281475010265081, 281474993487888, -1, 281475010265079, 281474993487875, -1, 100, 281475010265086, 281474993487878, 281474993487886, 281474993487883, 10, 281474993487887, 281474993487873, 281474993487888]"));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 17 + "'", int37 == 17);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertNotNull(uShort42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(uRIStream45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]" + "'", str46.equals("[]"));
        org.junit.Assert.assertNotNull(uShort47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 281475010265086L + "'", long51.equals(281475010265086L));
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType71);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { (-1.0f) };
        java.util.ArrayList<java.lang.Float> floatList2 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList2, floatArray1);
        java.lang.Object obj4 = null;
        boolean boolean5 = floatList2.equals(obj4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        strList9.ensureCapacity((int) (byte) -1);
        java.util.stream.Stream<java.lang.String> strStream13 = strList9.stream();
        boolean boolean14 = floatList2.remove((java.lang.Object) strStream13);
        java.util.stream.Stream<java.lang.Float> floatStream15 = floatList2.parallelStream();
        java.lang.Object obj16 = null;
        int int17 = floatList2.indexOf(obj16);
        boolean boolean19 = floatList2.add((java.lang.Float) 100.0f);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer20 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl21 = mCServicesConsumer20.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl22 = mCServicesConsumer20.getActionService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl23 = mCServicesConsumer20.getStatisticService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl24 = mCServicesConsumer20.getAlertService();
        boolean boolean25 = floatList2.equals((java.lang.Object) mCServicesConsumer20);
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl26 = mCServicesConsumer20.getParameterService();
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatStream15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl21);
        org.junit.Assert.assertNull(actionConsumerServiceImpl22);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl23);
        org.junit.Assert.assertNull(alertConsumerServiceImpl24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl26);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.mal.structures.Time time10 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue11 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.mal.structures.Time time12 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mal.structures.Identifier identifier13 = parameterInstance9.getName();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(time10);
        org.junit.Assert.assertNotNull(parameterValue11);
        org.junit.Assert.assertNotNull(time12);
        org.junit.Assert.assertNotNull(identifier13);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl3 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl4 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl6 = null;
        mCServicesConsumer0.setAggregationService(aggregationConsumerServiceImpl6);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(alertConsumerServiceImpl3);
        org.junit.Assert.assertNull(actionConsumerServiceImpl4);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("0.0", 1);
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { (-1.0f) };
        java.util.ArrayList<java.lang.Float> floatList2 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList2, floatArray1);
        java.lang.Object obj4 = null;
        boolean boolean5 = floatList2.equals(obj4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        strList9.ensureCapacity((int) (byte) -1);
        java.util.stream.Stream<java.lang.String> strStream13 = strList9.stream();
        boolean boolean14 = floatList2.remove((java.lang.Object) strStream13);
        floatList2.ensureCapacity(17);
        java.util.stream.Stream<java.lang.Float> floatStream17 = floatList2.parallelStream();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 4, 18, 18, 100, (-18), 18, (-18), (-1) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList31 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList31, booleanArray30);
        boolean boolean34 = booleanList31.contains((java.lang.Object) (short) 10);
        boolean boolean35 = intList27.containsAll((java.util.Collection<java.lang.Boolean>) booleanList31);
        java.lang.String str36 = intList27.toString();
        int int37 = intList27.size();
        java.lang.String str38 = intList27.toString();
        boolean boolean40 = intList27.add((java.lang.Integer) 16);
        boolean boolean41 = intList27.isEmpty();
        boolean boolean43 = intList27.add((java.lang.Integer) (-9));
        java.util.stream.Stream<java.lang.Integer> intStream44 = intList27.parallelStream();
        boolean boolean45 = floatList2.contains((java.lang.Object) intList27);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer46 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl47 = mCServicesConsumer46.getCheckService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl48 = mCServicesConsumer46.getCheckService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl49 = mCServicesConsumer46.getActionService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl50 = mCServicesConsumer46.getAggregationService();
        mCServicesConsumer46.closeConnections();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl52 = mCServicesConsumer46.getCheckService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl53 = mCServicesConsumer46.getActionService();
        int int54 = floatList2.lastIndexOf((java.lang.Object) mCServicesConsumer46);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatStream17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[4, 18, 18, 100, -18, 18, -18, -1]" + "'", str36.equals("[4, 18, 18, 100, -18, 18, -18, -1]"));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[4, 18, 18, 100, -18, 18, -18, -1]" + "'", str38.equals("[4, 18, 18, 100, -18, 18, -18, -1]"));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intStream44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(checkConsumerServiceImpl47);
        org.junit.Assert.assertNull(checkConsumerServiceImpl48);
        org.junit.Assert.assertNull(actionConsumerServiceImpl49);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl50);
        org.junit.Assert.assertNull(checkConsumerServiceImpl52);
        org.junit.Assert.assertNull(actionConsumerServiceImpl53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("32.0", 7);
        org.junit.Assert.assertNull(attribute2);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.mal.structures.Time time10 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mal.structures.Time time11 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue12 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.com.structures.ObjectId objectId13 = parameterInstance9.getSource();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(time10);
        org.junit.Assert.assertNotNull(time11);
        org.junit.Assert.assertNotNull(parameterValue12);
        org.junit.Assert.assertNull(objectId13);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(16, (int) (short) 10, (-13), 9);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-218103799L) + "'", long4.equals((-218103799L)));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType1 = keyParts0.objectType;
        keyParts0.objectInstance = 281474993487876L;
        java.lang.Long long4 = keyParts0.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts5 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts6 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType7 = keyParts6.objectType;
        keyParts5.objectType = objectType7;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType7, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts12 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts13 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType14 = keyParts13.objectType;
        keyParts12.objectType = objectType14;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType14, (java.lang.Long) 281474993487889L);
        keyParts0.sourceObjectType = objectType14;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts20 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts20.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType23 = keyParts20.objectType;
        keyParts20.objectInstance = (-281431993483167L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts26 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts27 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType28 = keyParts27.objectType;
        keyParts26.objectType = objectType28;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType28, (java.lang.Long) 281474993487876L);
        keyParts20.sourceObjectType = objectType28;
        keyParts0.objectType = objectType28;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType28, (java.lang.Long) (-3659131714011136L));
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType28, (java.lang.Long) 1125912808521746L);
        org.junit.Assert.assertNotNull(objectType1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 281474993487876L + "'", long4.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType28);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.com.structures.ObjectId objectId10 = parameterInstance9.getSource();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue11 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.mal.structures.Identifier identifier12 = parameterInstance9.getName();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue13 = parameterInstance9.getParameterValue();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNull(objectId10);
        org.junit.Assert.assertNotNull(parameterValue11);
        org.junit.Assert.assertNotNull(identifier12);
        org.junit.Assert.assertNotNull(parameterValue13);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl4 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl5 = null;
        mCServicesConsumer0.setCheckService(checkConsumerServiceImpl5);
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl7 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl8 = mCServicesConsumer0.getCheckService();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl4);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl7);
        org.junit.Assert.assertNull(checkConsumerServiceImpl8);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts0.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType3 = keyParts0.sourceObjectType;
        java.lang.Long long4 = keyParts0.objectInstance;
        org.ccsds.moims.mo.com.structures.ObjectType objectType5 = keyParts0.sourceObjectType;
        java.lang.Long[] longArray23 = new java.lang.Long[] { 281475010265086L, 281474993487880L, 281475010265081L, 281474993487888L, (-1L), 281475010265079L, 281474993487875L, (-1L), 100L, 281475010265086L, 281474993487878L, 281474993487886L, 281474993487883L, 10L, 281474993487887L, 281474993487873L, 281474993487888L };
        java.util.ArrayList<java.lang.Long> longList24 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList24, longArray23);
        java.lang.Double[] doubleArray30 = new java.lang.Double[] { 10.0d, 1.0d, 10.0d, 10.0d };
        java.util.ArrayList<java.lang.Double> doubleList31 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList31, doubleArray30);
        doubleList31.ensureCapacity((int) ' ');
        org.ccsds.moims.mo.mal.structures.Union union36 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Double) 0.0d);
        boolean boolean37 = doubleList31.contains((java.lang.Object) union36);
        java.lang.Integer int38 = union36.getTypeShortForm();
        java.lang.Long long39 = union36.getShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort40 = union36.getAreaNumber();
        boolean boolean41 = longList24.remove((java.lang.Object) union36);
        java.util.stream.Stream<java.lang.Long> longStream42 = longList24.stream();
        boolean boolean43 = longList24.isEmpty();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts44 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType45 = keyParts44.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType45, (java.lang.Long) 281474993487884L);
        java.lang.Long long49 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType45, true);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts51 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType52 = keyParts51.objectType;
        keyParts51.objectInstance = 281474993487876L;
        java.lang.Long long55 = keyParts51.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts56 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts57 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType58 = keyParts57.objectType;
        keyParts56.objectType = objectType58;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType58, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts63 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts64 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType65 = keyParts64.objectType;
        keyParts63.objectType = objectType65;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType65, (java.lang.Long) 281474993487889L);
        keyParts51.sourceObjectType = objectType65;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType65, (java.lang.Long) (-83886074L));
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType45, (java.lang.Long) 281474993487890L);
        int int76 = longList24.lastIndexOf((java.lang.Object) objectType45);
        keyParts0.objectType = objectType45;
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-75682021376L) + "'", long4.equals((-75682021376L)));
        org.junit.Assert.assertNotNull(objectType5);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38.equals(5));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 281474993487877L + "'", long39.equals(281474993487877L));
        org.junit.Assert.assertNotNull(uShort40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(longStream42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 281474993487884L + "'", long49.equals(281474993487884L));
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 281474993487876L + "'", long55.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(0, (-9), 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4.equals((-1L)));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.ccsds.moims.mo.mal.structures.StringList stringList0 = new org.ccsds.moims.mo.mal.structures.StringList();
        org.ccsds.moims.mo.mal.structures.Element element1 = stringList0.createElement();
        java.lang.Integer int2 = stringList0.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.ShortList shortList4 = new org.ccsds.moims.mo.mal.structures.ShortList((int) (byte) 10);
        java.lang.Integer int5 = shortList4.getTypeShortForm();
        int int6 = stringList0.lastIndexOf((java.lang.Object) shortList4);
        shortList4.ensureCapacity((int) (byte) -1);
        org.ccsds.moims.mo.mal.structures.UShort uShort9 = shortList4.getServiceNumber();
        java.lang.String str10 = shortList4.toString();
        org.ccsds.moims.mo.mal.structures.ShortList shortList12 = new org.ccsds.moims.mo.mal.structures.ShortList((int) (byte) 10);
        java.lang.Integer int13 = shortList12.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime14 = new org.ccsds.moims.mo.mal.structures.FineTime();
        boolean boolean15 = shortList12.equals((java.lang.Object) fineTime14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet16 = shortList12.getAreaVersion();
        java.lang.Integer int17 = shortList12.getTypeShortForm();
        shortList12.clear();
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray19 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList20 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList20, uShortArray19);
        java.lang.Boolean[] booleanArray24 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList25 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList25, booleanArray24);
        boolean boolean27 = uShortList20.removeAll((java.util.Collection<java.lang.Boolean>) booleanList25);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor28 = uShortList20.listIterator();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 9, 0, 7, (-4), 6, 18, 4, 100, (-4), (-15), (-13), (-18), 9, 4, 18, 18, 18, (-4) };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.util.stream.Stream<java.lang.Integer> intStream50 = intList48.parallelStream();
        boolean boolean51 = uShortList20.contains((java.lang.Object) intStream50);
        java.lang.Object[] objArray52 = uShortList20.toArray();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer53 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl54 = mCServicesConsumer53.getParameterService();
        mCServicesConsumer53.closeConnections();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl56 = mCServicesConsumer53.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl57 = mCServicesConsumer53.getAggregationService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl58 = null;
        mCServicesConsumer53.setCheckService(checkConsumerServiceImpl58);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer60 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl61 = mCServicesConsumer60.getParameterService();
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray62 = new esa.mo.mc.impl.util.MCServicesConsumer[] { mCServicesConsumer53, mCServicesConsumer60 };
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray63 = uShortList20.toArray(mCServicesConsumerArray62);
        esa.mo.mc.impl.util.MCServicesConsumer[] mCServicesConsumerArray64 = shortList12.toArray(mCServicesConsumerArray62);
        java.lang.Object[] objArray65 = shortList12.toArray();
        org.ccsds.moims.mo.mal.structures.Union union67 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Long) 281474993487884L);
        boolean boolean68 = shortList12.equals((java.lang.Object) 281474993487884L);
        java.util.ListIterator<java.lang.Short> shortItor69 = shortList12.listIterator();
        boolean boolean70 = shortList4.equals((java.lang.Object) shortItor69);
        org.junit.Assert.assertNotNull(element1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2.equals((-15)));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-9) + "'", int5.equals((-9)));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(uShort9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-9) + "'", int13.equals((-9)));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(uOctet16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-9) + "'", int17.equals((-9)));
        org.junit.Assert.assertNotNull(uShortArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(uShortItor28);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(intStream50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl54);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl56);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl57);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl61);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray62);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray63);
        org.junit.Assert.assertNotNull(mCServicesConsumerArray64);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(shortItor69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl6 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl7 = mCServicesConsumer0.getActionService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl6);
        org.junit.Assert.assertNull(actionConsumerServiceImpl7);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.ccsds.moims.mo.mal.structures.UShortList uShortList1 = new org.ccsds.moims.mo.mal.structures.UShortList(3);
        boolean boolean2 = uShortList1.isEmpty();
        org.ccsds.moims.mo.mal.structures.Duration duration4 = new org.ccsds.moims.mo.mal.structures.Duration((double) ' ');
        org.ccsds.moims.mo.mal.structures.Element element5 = duration4.createElement();
        double double6 = duration4.getValue();
        java.lang.Long long7 = duration4.getShortForm();
        org.ccsds.moims.mo.mal.structures.Element element8 = duration4.createElement();
        org.ccsds.moims.mo.mal.structures.StringList stringList9 = new org.ccsds.moims.mo.mal.structures.StringList();
        org.ccsds.moims.mo.mal.structures.UShort uShort10 = stringList9.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.URIList uRIList11 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList11.trimToSize();
        int int13 = stringList9.lastIndexOf((java.lang.Object) uRIList11);
        org.ccsds.moims.mo.mal.structures.UShort uShort14 = uRIList11.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts15 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType16 = keyParts15.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts17 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType18 = keyParts17.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts19 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts19.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts19.objectType;
        keyParts17.sourceObjectType = objectType22;
        keyParts15.objectType = objectType22;
        org.ccsds.moims.mo.com.structures.ObjectType objectType25 = keyParts15.objectType;
        boolean boolean26 = uShort14.equals((java.lang.Object) keyParts15);
        boolean boolean27 = duration4.equals((java.lang.Object) keyParts15);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts28 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts29 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType30 = keyParts29.objectType;
        keyParts28.objectType = objectType30;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType30, (java.lang.Long) 281474993487876L);
        keyParts15.sourceObjectType = objectType30;
        boolean boolean35 = uShortList1.remove((java.lang.Object) keyParts15);
        org.ccsds.moims.mo.mal.MALDecoder mALDecoder36 = null;
        try {
            org.ccsds.moims.mo.mal.structures.Element element37 = uShortList1.decode(mALDecoder36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 281474993487875L + "'", long7.equals(281474993487875L));
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(uShort10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(uShort14);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.ccsds.moims.mo.mal.structures.Duration duration1 = new org.ccsds.moims.mo.mal.structures.Duration((double) ' ');
        org.ccsds.moims.mo.mal.structures.Element element2 = duration1.createElement();
        double double3 = duration1.getValue();
        java.lang.Long long4 = duration1.getShortForm();
        org.ccsds.moims.mo.mal.structures.Element element5 = duration1.createElement();
        org.ccsds.moims.mo.mal.structures.StringList stringList6 = new org.ccsds.moims.mo.mal.structures.StringList();
        org.ccsds.moims.mo.mal.structures.UShort uShort7 = stringList6.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.URIList uRIList8 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList8.trimToSize();
        int int10 = stringList6.lastIndexOf((java.lang.Object) uRIList8);
        org.ccsds.moims.mo.mal.structures.UShort uShort11 = uRIList8.getAreaNumber();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts12 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType13 = keyParts12.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType15 = keyParts14.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts16 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts16.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType19 = keyParts16.objectType;
        keyParts14.sourceObjectType = objectType19;
        keyParts12.objectType = objectType19;
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts12.objectType;
        boolean boolean23 = uShort11.equals((java.lang.Object) keyParts12);
        boolean boolean24 = duration1.equals((java.lang.Object) keyParts12);
        org.ccsds.moims.mo.com.structures.ObjectType objectType25 = keyParts12.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts26 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType27 = keyParts26.objectType;
        keyParts26.objectInstance = 281474993487876L;
        java.lang.Long long30 = keyParts26.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts31 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts32 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType33 = keyParts32.objectType;
        keyParts31.objectType = objectType33;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType33, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts38 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts39 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType40 = keyParts39.objectType;
        keyParts38.objectType = objectType40;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType40, (java.lang.Long) 281474993487889L);
        keyParts26.sourceObjectType = objectType40;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType40, (java.lang.Long) (-83886074L));
        keyParts12.sourceObjectType = objectType40;
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.stream.Stream<java.lang.String> strStream54 = strList52.parallelStream();
        java.lang.Double[] doubleArray59 = new java.lang.Double[] { 10.0d, 1.0d, 10.0d, 10.0d };
        java.util.ArrayList<java.lang.Double> doubleList60 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList60, doubleArray59);
        doubleList60.ensureCapacity((int) ' ');
        org.ccsds.moims.mo.mal.structures.Union union65 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Double) 0.0d);
        boolean boolean66 = doubleList60.contains((java.lang.Object) union65);
        java.util.stream.Stream<java.lang.Double> doubleStream67 = doubleList60.parallelStream();
        boolean boolean68 = strList52.remove((java.lang.Object) doubleList60);
        doubleList60.clear();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts70 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts71 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType72 = keyParts71.objectType;
        keyParts70.objectType = objectType72;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType72, (java.lang.Long) 281474993487875L);
        int int76 = doubleList60.indexOf((java.lang.Object) objectType72);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 281474993487875L + "'", long4.equals(281474993487875L));
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(uShort7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(uShort11);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 281474993487876L + "'", long30.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertNotNull(objectType40);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strStream54);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(doubleStream67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        try {
            org.ccsds.moims.mo.mal.structures.Attribute attribute2 = esa.mo.mc.impl.util.MCServicesHelper.getAttribute("[-1, 281474993487879, 281474993487879, 10, 10, -1, 100, 281474993487873]", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"[-1, 281474993487879, 281474993487879, 10, 10, -1, 100, 281474993487873]\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl4 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl5 = mCServicesConsumer0.getAggregationService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl4);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl5);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.ccsds.moims.mo.mal.structures.LongList longList0 = new org.ccsds.moims.mo.mal.structures.LongList();
        org.ccsds.moims.mo.mal.structures.Element element1 = longList0.createElement();
        java.lang.Integer int2 = longList0.getTypeShortForm();
        java.lang.Object obj3 = null;
        boolean boolean4 = longList0.contains(obj3);
        org.ccsds.moims.mo.mal.structures.UShort uShort5 = longList0.getAreaNumber();
        byte[] byteArray7 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob8 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray7);
        org.ccsds.moims.mo.mal.structures.Blob blob9 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray7);
        boolean boolean10 = longList0.remove((java.lang.Object) byteArray7);
        org.ccsds.moims.mo.mal.structures.OctetList octetList11 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Integer int12 = octetList11.getTypeShortForm();
        java.lang.Object[] objArray13 = octetList11.toArray();
        org.ccsds.moims.mo.mal.structures.UShort uShort14 = octetList11.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.Element element15 = octetList11.createElement();
        boolean boolean16 = longList0.remove((java.lang.Object) element15);
        org.ccsds.moims.mo.mal.structures.UShort uShort17 = longList0.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort18 = longList0.getServiceNumber();
        org.ccsds.moims.mo.mal.structures.DoubleList doubleList20 = new org.ccsds.moims.mo.mal.structures.DoubleList(9);
        java.lang.Integer int21 = doubleList20.getTypeShortForm();
        java.lang.Integer int22 = doubleList20.getTypeShortForm();
        java.lang.String str23 = doubleList20.toString();
        org.ccsds.moims.mo.mal.structures.Union union25 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Byte) (byte) -1);
        java.lang.Long long26 = union25.getShortForm();
        java.lang.Byte byte27 = union25.getOctetValue();
        java.lang.String str28 = union25.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet29 = union25.getAreaVersion();
        boolean boolean30 = doubleList20.equals((java.lang.Object) union25);
        double double31 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) union25);
        boolean boolean32 = longList0.contains((java.lang.Object) double31);
        org.junit.Assert.assertNotNull(element1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2.equals((-13)));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uShort5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-7) + "'", int12.equals((-7)));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(uShort14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(uShort17);
        org.junit.Assert.assertNotNull(uShort18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21.equals((-5)));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-5) + "'", int22.equals((-5)));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]" + "'", str23.equals("[]"));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 281474993487879L + "'", long26.equals(281474993487879L));
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) -1 + "'", byte27.equals((byte) -1));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "-1" + "'", str28.equals("-1"));
        org.junit.Assert.assertNotNull(uOctet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        java.lang.Long long4 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(15, (int) (byte) -1, 6, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-4194304000L) + "'", long4.equals((-4194304000L)));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("32");
        org.ccsds.moims.mo.mal.structures.UOctet uOctet2 = identifier1.getAreaVersion();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer3 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl4 = mCServicesConsumer3.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer3.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer3.getStatisticService();
        mCServicesConsumer3.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = mCServicesConsumer3.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl9 = mCServicesConsumer3.getStatisticService();
        mCServicesConsumer3.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl11 = null;
        mCServicesConsumer3.setParameterService(parameterConsumerServiceImpl11);
        mCServicesConsumer3.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl14 = mCServicesConsumer3.getParameterService();
        boolean boolean15 = identifier1.equals((java.lang.Object) mCServicesConsumer3);
        org.junit.Assert.assertNotNull(uOctet2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl4);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl8);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl9);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray0 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList1 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList1, uShortArray0);
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList6 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList6, booleanArray5);
        boolean boolean8 = uShortList1.removeAll((java.util.Collection<java.lang.Boolean>) booleanList6);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor9 = uShortList1.listIterator();
        uShortList1.clear();
        java.lang.Object[] objArray11 = uShortList1.toArray();
        boolean boolean12 = uShortList1.isEmpty();
        uShortList1.clear();
        java.lang.String str14 = uShortList1.toString();
        org.ccsds.moims.mo.mal.structures.StringList stringList15 = new org.ccsds.moims.mo.mal.structures.StringList();
        java.lang.Integer int16 = stringList15.getTypeShortForm();
        java.lang.Long long17 = stringList15.getShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort18 = stringList15.getAreaNumber();
        boolean boolean19 = uShortList1.add(uShort18);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts20 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts21 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts21.objectType;
        keyParts20.objectType = objectType22;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType22, (java.lang.Long) 281474993487875L);
        boolean boolean26 = uShortList1.equals((java.lang.Object) objectType22);
        java.lang.Long long28 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType22, true);
        java.lang.Long long30 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType22, false);
        java.lang.Long long32 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType22, true);
        java.lang.Long long34 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType22, true);
        org.junit.Assert.assertNotNull(uShortArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(uShortItor9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-15) + "'", int16.equals((-15)));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 281475010265073L + "'", long17.equals(281475010265073L));
        org.junit.Assert.assertNotNull(uShort18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 281474993487875L + "'", long28.equals(281474993487875L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 281474993487872L + "'", long30.equals(281474993487872L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 281474993487875L + "'", long32.equals(281474993487875L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 281474993487875L + "'", long34.equals(281474993487875L));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long1 = keyParts0.objectInstance;
        java.lang.Long[] longArray19 = new java.lang.Long[] { 281475010265086L, 281474993487880L, 281475010265081L, 281474993487888L, (-1L), 281475010265079L, 281474993487875L, (-1L), 100L, 281475010265086L, 281474993487878L, 281474993487886L, 281474993487883L, 10L, 281474993487887L, 281474993487873L, 281474993487888L };
        java.util.ArrayList<java.lang.Long> longList20 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList20, longArray19);
        java.lang.Double[] doubleArray26 = new java.lang.Double[] { 10.0d, 1.0d, 10.0d, 10.0d };
        java.util.ArrayList<java.lang.Double> doubleList27 = new java.util.ArrayList<java.lang.Double>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Double>) doubleList27, doubleArray26);
        doubleList27.ensureCapacity((int) ' ');
        org.ccsds.moims.mo.mal.structures.Union union32 = new org.ccsds.moims.mo.mal.structures.Union((java.lang.Double) 0.0d);
        boolean boolean33 = doubleList27.contains((java.lang.Object) union32);
        java.lang.Integer int34 = union32.getTypeShortForm();
        java.lang.Long long35 = union32.getShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort36 = union32.getAreaNumber();
        boolean boolean37 = longList20.remove((java.lang.Object) union32);
        java.lang.String str38 = longList20.toString();
        int int39 = longList20.size();
        org.ccsds.moims.mo.mal.structures.Identifier identifier40 = new org.ccsds.moims.mo.mal.structures.Identifier();
        java.lang.String str41 = identifier40.toString();
        org.ccsds.moims.mo.mal.structures.URIList uRIList42 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList42.trimToSize();
        org.ccsds.moims.mo.mal.structures.UShort uShort44 = uRIList42.getAreaNumber();
        boolean boolean45 = identifier40.equals((java.lang.Object) uRIList42);
        java.lang.Object obj46 = uRIList42.clone();
        java.util.stream.Stream<org.ccsds.moims.mo.mal.structures.URI> uRIStream47 = uRIList42.stream();
        java.lang.String str48 = uRIList42.toString();
        org.ccsds.moims.mo.mal.structures.UShort uShort49 = uRIList42.getAreaNumber();
        java.lang.Object obj50 = uRIList42.clone();
        boolean boolean51 = longList20.contains((java.lang.Object) uRIList42);
        java.lang.Long long53 = longList20.remove(0);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts54 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts55 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType56 = keyParts55.objectType;
        keyParts54.objectType = objectType56;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType56, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts61 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts62 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType63 = keyParts62.objectType;
        keyParts61.objectType = objectType63;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType63, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts68 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType69 = keyParts68.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts70 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts70.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType73 = keyParts70.objectType;
        keyParts68.sourceObjectType = objectType73;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts76 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType77 = keyParts76.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType77, (java.lang.Long) 281474993487884L);
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType77, (java.lang.Long) 17L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts83 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType84 = keyParts83.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType84, (java.lang.Long) 1125912808521736L);
        keyParts68.objectType = objectType77;
        int int89 = longList20.indexOf((java.lang.Object) objectType77);
        keyParts0.sourceObjectType = objectType77;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1.equals((-1L)));
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34.equals(5));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 281474993487877L + "'", long35.equals(281474993487877L));
        org.junit.Assert.assertNotNull(uShort36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[281475010265086, 281474993487880, 281475010265081, 281474993487888, -1, 281475010265079, 281474993487875, -1, 100, 281475010265086, 281474993487878, 281474993487886, 281474993487883, 10, 281474993487887, 281474993487873, 281474993487888]" + "'", str38.equals("[281475010265086, 281474993487880, 281475010265081, 281474993487888, -1, 281475010265079, 281474993487875, -1, 100, 281475010265086, 281474993487878, 281474993487886, 281474993487883, 10, 281474993487887, 281474993487873, 281474993487888]"));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 17 + "'", int39 == 17);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertNotNull(uShort44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(uRIStream47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]" + "'", str48.equals("[]"));
        org.junit.Assert.assertNotNull(uShort49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 281475010265086L + "'", long53.equals(281475010265086L));
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertNotNull(objectType77);
        org.junit.Assert.assertNotNull(objectType84);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.ccsds.moims.mo.mal.structures.IntegerList integerList0 = new org.ccsds.moims.mo.mal.structures.IntegerList();
        java.lang.Integer int1 = integerList0.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.Element element2 = integerList0.createElement();
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 10.0f, (-1.0f) };
        java.util.ArrayList<java.lang.Float> floatList6 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList6, floatArray5);
        byte[] byteArray9 = new byte[] { (byte) 100 };
        org.ccsds.moims.mo.mal.structures.Blob blob10 = new org.ccsds.moims.mo.mal.structures.Blob(byteArray9);
        byte[] byteArray11 = blob10.getValue();
        boolean boolean12 = floatList6.remove((java.lang.Object) byteArray11);
        boolean boolean13 = integerList0.equals((java.lang.Object) floatList6);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer14 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl15 = mCServicesConsumer14.getParameterService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl16 = mCServicesConsumer14.getActionService();
        mCServicesConsumer14.closeConnections();
        boolean boolean18 = integerList0.contains((java.lang.Object) mCServicesConsumer14);
        org.ccsds.moims.mo.mal.structures.Element element19 = integerList0.createElement();
        integerList0.trimToSize();
        try {
            java.lang.Integer int23 = integerList0.set(5, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11) + "'", int1.equals((-11)));
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl15);
        org.junit.Assert.assertNull(actionConsumerServiceImpl16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType15 = keyParts14.objectType;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts16 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts16.objectInstance = (-75682021376L);
        org.ccsds.moims.mo.com.structures.ObjectType objectType19 = keyParts16.objectType;
        keyParts14.sourceObjectType = objectType19;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts22 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        keyParts22.objectInstance = (-75682021376L);
        java.lang.Long long25 = keyParts22.objectInstance;
        java.lang.Long long27 = keyParts22.objectInstance;
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-75682021376L) + "'", long25.equals((-75682021376L)));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 35L + "'", long27.equals(35L));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { (-1.0f) };
        java.util.ArrayList<java.lang.Float> floatList2 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList2, floatArray1);
        java.lang.Object obj4 = null;
        boolean boolean5 = floatList2.equals(obj4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        strList9.ensureCapacity((int) (byte) -1);
        java.util.stream.Stream<java.lang.String> strStream13 = strList9.stream();
        boolean boolean14 = floatList2.remove((java.lang.Object) strStream13);
        boolean boolean16 = floatList2.add((java.lang.Float) 10.0f);
        boolean boolean18 = floatList2.contains((java.lang.Object) 281474993487873L);
        boolean boolean19 = floatList2.isEmpty();
        java.util.Spliterator<java.lang.Float> floatSpliterator20 = floatList2.spliterator();
        org.ccsds.moims.mo.mal.structures.ShortList shortList22 = new org.ccsds.moims.mo.mal.structures.ShortList((int) (byte) 10);
        java.lang.Integer int23 = shortList22.getTypeShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort24 = shortList22.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.OctetList octetList25 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Integer int26 = octetList25.getTypeShortForm();
        java.lang.Object[] objArray27 = octetList25.toArray();
        int int28 = shortList22.indexOf((java.lang.Object) objArray27);
        java.util.Iterator<java.lang.Short> shortItor29 = shortList22.iterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType31 = keyParts30.objectType;
        keyParts30.objectInstance = 281474993487876L;
        java.lang.Long long34 = keyParts30.objectInstance;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts35 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts36 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType37 = keyParts36.objectType;
        keyParts35.objectType = objectType37;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType37, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts42 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts43 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType44 = keyParts43.objectType;
        keyParts42.objectType = objectType44;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType44, (java.lang.Long) 281474993487889L);
        keyParts30.sourceObjectType = objectType44;
        boolean boolean50 = shortList22.equals((java.lang.Object) keyParts30);
        java.lang.Long long51 = keyParts30.objectInstance;
        boolean boolean52 = floatList2.remove((java.lang.Object) long51);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(floatSpliterator20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-9) + "'", int23.equals((-9)));
        org.junit.Assert.assertNotNull(uShort24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-7) + "'", int26.equals((-7)));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(shortItor29);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 281474993487876L + "'", long34.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 281474993487876L + "'", long51.equals(281474993487876L));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.ccsds.moims.mo.mal.structures.ULong uLong0 = new org.ccsds.moims.mo.mal.structures.ULong();
        java.lang.Long long1 = uLong0.getShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort2 = uLong0.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet3 = uLong0.getAreaVersion();
        java.math.BigInteger bigInteger4 = uLong0.getValue();
        org.ccsds.moims.mo.mal.structures.ULong uLong5 = new org.ccsds.moims.mo.mal.structures.ULong(bigInteger4);
        org.ccsds.moims.mo.mal.structures.UShort uShort6 = uLong5.getServiceNumber();
        double double7 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uLong5);
        org.ccsds.moims.mo.mal.structures.Element element8 = uLong5.createElement();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 281474993487886L + "'", long1.equals(281474993487886L));
        org.junit.Assert.assertNotNull(uShort2);
        org.junit.Assert.assertNotNull(uOctet3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(uShort6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl3 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl4 = mCServicesConsumer0.getAlertService();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl4);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts0 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts1 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType2 = keyParts1.objectType;
        keyParts0.objectType = objectType2;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType2, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts7 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts8 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType9 = keyParts8.objectType;
        keyParts7.objectType = objectType9;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType9, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray19 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList20 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList20, floatArray19);
        int int22 = floatList20.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime24 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str25 = fineTime24.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet26 = fineTime24.getAreaVersion();
        java.lang.String str27 = fineTime24.toString();
        boolean boolean28 = floatList20.remove((java.lang.Object) fineTime24);
        java.util.Spliterator<java.lang.Float> floatSpliterator29 = floatList20.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts30 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long31 = keyParts30.objectInstance;
        int int32 = floatList20.indexOf((java.lang.Object) keyParts30);
        keyParts30.objectInstance = 281474993487884L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType36 = keyParts30.objectType;
        org.ccsds.moims.mo.com.structures.ObjectType objectType37 = keyParts30.objectType;
        java.lang.Long long39 = esa.mo.mc.impl.util.MCServicesHelper.generateSubKey(objectType37, true);
        org.junit.Assert.assertNotNull(objectType2);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "32" + "'", str25.equals("32"));
        org.junit.Assert.assertNotNull(uOctet26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "32" + "'", str27.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatSpliterator29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 281474993487889L + "'", long39.equals(281474993487889L));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.mal.structures.Time time10 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue11 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.mal.structures.Identifier identifier12 = parameterInstance9.getName();
        org.ccsds.moims.mo.mal.structures.Time time13 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue14 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.mal.structures.Identifier identifier15 = parameterInstance9.getName();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(time10);
        org.junit.Assert.assertNotNull(parameterValue11);
        org.junit.Assert.assertNotNull(identifier12);
        org.junit.Assert.assertNotNull(time13);
        org.junit.Assert.assertNotNull(parameterValue14);
        org.junit.Assert.assertNotNull(identifier15);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl8 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl9 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl10 = null;
        mCServicesConsumer0.setActionService(actionConsumerServiceImpl10);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(actionConsumerServiceImpl8);
        org.junit.Assert.assertNull(checkConsumerServiceImpl9);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue10 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.com.structures.ObjectId objectId11 = parameterInstance9.getSource();
        org.ccsds.moims.mo.mal.structures.Time time12 = parameterInstance9.getTimestamp();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(parameterValue10);
        org.junit.Assert.assertNull(objectId11);
        org.junit.Assert.assertNotNull(time12);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl1 = mCServicesConsumer0.getCheckService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl3 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl4 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl5 = mCServicesConsumer0.getCheckService();
        org.junit.Assert.assertNull(checkConsumerServiceImpl1);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl4);
        org.junit.Assert.assertNull(checkConsumerServiceImpl5);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl4 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl5 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl6 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl7 = mCServicesConsumer0.getCheckService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(checkConsumerServiceImpl4);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl5);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl6);
        org.junit.Assert.assertNull(checkConsumerServiceImpl7);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.ccsds.moims.mo.mal.structures.URIList uRIList1 = new org.ccsds.moims.mo.mal.structures.URIList(18);
        uRIList1.clear();
        org.ccsds.moims.mo.mal.structures.URI uRI4 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet5 = uRI4.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet6 = uRI4.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.URI uRI7 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.URI uRI9 = new org.ccsds.moims.mo.mal.structures.URI("[4, 18, 18, 100, -18, 18, -18, -1]");
        org.ccsds.moims.mo.mal.structures.URI uRI10 = new org.ccsds.moims.mo.mal.structures.URI();
        java.lang.String str11 = uRI10.getValue();
        org.ccsds.moims.mo.mal.structures.URI uRI12 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.Element element13 = uRI12.createElement();
        org.ccsds.moims.mo.mal.structures.URIList uRIList14 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList14.trimToSize();
        java.lang.String str16 = uRIList14.toString();
        org.ccsds.moims.mo.mal.structures.URIList uRIList17 = new org.ccsds.moims.mo.mal.structures.URIList();
        uRIList17.trimToSize();
        org.ccsds.moims.mo.mal.structures.UShort uShort19 = uRIList17.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.URI uRI20 = new org.ccsds.moims.mo.mal.structures.URI();
        boolean boolean21 = uRIList17.add(uRI20);
        boolean boolean22 = uRIList14.add(uRI20);
        org.ccsds.moims.mo.mal.structures.URI uRI23 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.URI uRI24 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet25 = uRI24.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.URI uRI26 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet27 = uRI26.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet28 = uRI26.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.URI[] uRIArray29 = new org.ccsds.moims.mo.mal.structures.URI[] { uRI4, uRI7, uRI9, uRI10, uRI12, uRI20, uRI23, uRI24, uRI26 };
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI> uRIList30 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.URI>) uRIList30, uRIArray29);
        uRIList30.ensureCapacity((-15));
        org.ccsds.moims.mo.mal.structures.URI uRI34 = new org.ccsds.moims.mo.mal.structures.URI();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet35 = uRI34.getAreaVersion();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet36 = uRI34.getAreaVersion();
        boolean boolean37 = uRIList30.add(uRI34);
        double double38 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uRI34);
        try {
            org.ccsds.moims.mo.mal.structures.URI uRI39 = uRIList1.set(65535, uRI34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 65535, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(uOctet5);
        org.junit.Assert.assertNotNull(uOctet6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertNotNull(uShort19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(uOctet25);
        org.junit.Assert.assertNotNull(uOctet27);
        org.junit.Assert.assertNotNull(uOctet28);
        org.junit.Assert.assertNotNull(uRIArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(uOctet35);
        org.junit.Assert.assertNotNull(uOctet36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.ccsds.moims.mo.mal.structures.OctetList octetList0 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList3 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
        boolean boolean6 = booleanList3.contains((java.lang.Object) (short) 10);
        boolean boolean7 = octetList0.removeAll((java.util.Collection<java.lang.Boolean>) booleanList3);
        boolean boolean8 = octetList0.isEmpty();
        java.util.stream.Stream<java.lang.Byte> byteStream9 = octetList0.parallelStream();
        int int10 = octetList0.size();
        org.ccsds.moims.mo.mal.structures.LongList longList11 = new org.ccsds.moims.mo.mal.structures.LongList();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet12 = new org.ccsds.moims.mo.mal.structures.UOctet();
        boolean boolean13 = longList11.equals((java.lang.Object) uOctet12);
        java.lang.Short[] shortArray18 = new java.lang.Short[] { (short) 100, (short) 10, (short) 10, (short) -1 };
        java.util.ArrayList<java.lang.Short> shortList19 = new java.util.ArrayList<java.lang.Short>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Short>) shortList19, shortArray18);
        shortList19.ensureCapacity((int) 'a');
        shortList19.clear();
        boolean boolean24 = shortList19.isEmpty();
        shortList19.clear();
        java.lang.Object[] objArray26 = shortList19.toArray();
        boolean boolean27 = longList11.remove((java.lang.Object) shortList19);
        java.lang.Short[] shortArray32 = new java.lang.Short[] { (short) 100, (short) 10, (short) 10, (short) -1 };
        java.util.ArrayList<java.lang.Short> shortList33 = new java.util.ArrayList<java.lang.Short>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Short>) shortList33, shortArray32);
        shortList33.ensureCapacity((int) 'a');
        org.ccsds.moims.mo.mal.structures.DoubleList doubleList38 = new org.ccsds.moims.mo.mal.structures.DoubleList(16);
        org.ccsds.moims.mo.mal.structures.Element element39 = doubleList38.createElement();
        boolean boolean40 = shortList33.contains((java.lang.Object) doubleList38);
        boolean boolean41 = shortList19.equals((java.lang.Object) doubleList38);
        boolean boolean43 = doubleList38.add((java.lang.Double) 1.0d);
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer44 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl45 = mCServicesConsumer44.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl46 = mCServicesConsumer44.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl47 = mCServicesConsumer44.getStatisticService();
        mCServicesConsumer44.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl49 = mCServicesConsumer44.getParameterService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl50 = mCServicesConsumer44.getParameterService();
        mCServicesConsumer44.closeConnections();
        mCServicesConsumer44.closeConnections();
        boolean boolean53 = doubleList38.equals((java.lang.Object) mCServicesConsumer44);
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl54 = mCServicesConsumer44.getCheckService();
        boolean boolean55 = octetList0.contains((java.lang.Object) mCServicesConsumer44);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl45);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl46);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl47);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl49);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(checkConsumerServiceImpl54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl6 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl8 = null;
        mCServicesConsumer0.setParameterService(parameterConsumerServiceImpl8);
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl11 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl13 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl14 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl15 = null;
        mCServicesConsumer0.setCheckService(checkConsumerServiceImpl15);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl6);
        org.junit.Assert.assertNull(alertConsumerServiceImpl11);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl13);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl14);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.lang.Float[] floatArray2 = new java.lang.Float[] { 100.0f, 100.0f };
        java.util.ArrayList<java.lang.Float> floatList3 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList3, floatArray2);
        java.util.Spliterator<java.lang.Float> floatSpliterator5 = floatList3.spliterator();
        java.lang.Float float7 = floatList3.get(0);
        floatList3.clear();
        java.util.Spliterator<java.lang.Float> floatSpliterator9 = floatList3.spliterator();
        floatList3.add(0, (java.lang.Float) 100.0f);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts13 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts14 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType15 = keyParts14.objectType;
        keyParts13.objectType = objectType15;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType15, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts20 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts21 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts21.objectType;
        keyParts20.objectType = objectType22;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType22, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray32 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList33 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList33, floatArray32);
        int int35 = floatList33.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime37 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str38 = fineTime37.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet39 = fineTime37.getAreaVersion();
        java.lang.String str40 = fineTime37.toString();
        boolean boolean41 = floatList33.remove((java.lang.Object) fineTime37);
        java.util.Spliterator<java.lang.Float> floatSpliterator42 = floatList33.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts43 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long44 = keyParts43.objectInstance;
        int int45 = floatList33.indexOf((java.lang.Object) keyParts43);
        keyParts43.objectInstance = 281474993487884L;
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts49 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts50 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType51 = keyParts50.objectType;
        keyParts49.objectType = objectType51;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType51, (java.lang.Long) 281474993487889L);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts56 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts57 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType58 = keyParts57.objectType;
        keyParts56.objectType = objectType58;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType58, (java.lang.Long) 281474993487889L);
        java.lang.Float[] floatArray68 = new java.lang.Float[] { (-1.0f), 0.0f, 100.0f, (-1.0f), 0.0f };
        java.util.ArrayList<java.lang.Float> floatList69 = new java.util.ArrayList<java.lang.Float>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Float>) floatList69, floatArray68);
        int int71 = floatList69.size();
        org.ccsds.moims.mo.mal.structures.FineTime fineTime73 = new org.ccsds.moims.mo.mal.structures.FineTime((long) ' ');
        java.lang.String str74 = fineTime73.toString();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet75 = fineTime73.getAreaVersion();
        java.lang.String str76 = fineTime73.toString();
        boolean boolean77 = floatList69.remove((java.lang.Object) fineTime73);
        java.util.Spliterator<java.lang.Float> floatSpliterator78 = floatList69.spliterator();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts79 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        java.lang.Long long80 = keyParts79.objectInstance;
        int int81 = floatList69.indexOf((java.lang.Object) keyParts79);
        keyParts79.objectInstance = 281474993487884L;
        org.ccsds.moims.mo.com.structures.ObjectType objectType85 = keyParts79.objectType;
        boolean boolean87 = floatList3.contains((java.lang.Object) keyParts79);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts88 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType89 = keyParts88.objectType;
        keyParts88.objectInstance = 281474993487876L;
        java.lang.Long long92 = keyParts88.objectInstance;
        org.ccsds.moims.mo.com.structures.ObjectType objectType93 = keyParts88.sourceObjectType;
        org.ccsds.moims.mo.com.structures.ObjectType objectType94 = keyParts88.sourceObjectType;
        keyParts79.objectType = objectType94;
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(floatSpliterator5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7.equals(100.0f));
        org.junit.Assert.assertNotNull(floatSpliterator9);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "32" + "'", str38.equals("32"));
        org.junit.Assert.assertNotNull(uOctet39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "32" + "'", str40.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(floatSpliterator42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 5 + "'", int71 == 5);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "32" + "'", str74.equals("32"));
        org.junit.Assert.assertNotNull(uOctet75);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "32" + "'", str76.equals("32"));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(floatSpliterator78);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + (-1L) + "'", long80.equals((-1L)));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 281474993487876L + "'", long92.equals(281474993487876L));
        org.junit.Assert.assertNotNull(objectType93);
        org.junit.Assert.assertNotNull(objectType94);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = null;
        mCServicesConsumer0.setStatisticService(statisticConsumerServiceImpl3);
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = null;
        mCServicesConsumer0.setAlertService(alertConsumerServiceImpl5);
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl7 = mCServicesConsumer0.getAggregationService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl7);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125912808521728L + "'", long1 == 1125912808521728L);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.ccsds.moims.mo.mal.structures.FloatList floatList0 = new org.ccsds.moims.mo.mal.structures.FloatList();
        java.util.Spliterator<java.lang.Float> floatSpliterator1 = floatList0.spliterator();
        org.ccsds.moims.mo.mal.structures.UShort uShort2 = floatList0.getServiceNumber();
        java.lang.Class<?> wildcardClass3 = floatList0.getClass();
        org.ccsds.moims.mo.mal.structures.DoubleList doubleList5 = new org.ccsds.moims.mo.mal.structures.DoubleList((int) (byte) 0);
        doubleList5.clear();
        org.ccsds.moims.mo.mal.structures.DoubleList doubleList8 = new org.ccsds.moims.mo.mal.structures.DoubleList(9);
        org.ccsds.moims.mo.mal.structures.UShort uShort9 = doubleList8.getAreaNumber();
        org.ccsds.moims.mo.mal.structures.UShort uShort10 = doubleList8.getServiceNumber();
        int int11 = doubleList8.size();
        org.ccsds.moims.mo.mal.structures.BooleanList booleanList13 = new org.ccsds.moims.mo.mal.structures.BooleanList((int) (byte) 100);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet14 = booleanList13.getAreaVersion();
        java.lang.Long long15 = booleanList13.getShortForm();
        java.lang.Long[] longArray18 = new java.lang.Long[] { (-1L), 281474993487878L };
        java.util.ArrayList<java.lang.Long> longList19 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList19, longArray18);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray21 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList22 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList22, uShortArray21);
        java.lang.Boolean[] booleanArray26 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList27 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList27, booleanArray26);
        boolean boolean29 = uShortList22.removeAll((java.util.Collection<java.lang.Boolean>) booleanList27);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray30 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList31 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList31, uShortArray30);
        java.lang.Boolean[] booleanArray35 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList36 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList36, booleanArray35);
        boolean boolean38 = uShortList31.removeAll((java.util.Collection<java.lang.Boolean>) booleanList36);
        boolean boolean39 = booleanList27.containsAll((java.util.Collection<java.lang.Boolean>) booleanList36);
        int int40 = booleanList36.size();
        java.lang.Boolean boolean43 = booleanList36.set(0, (java.lang.Boolean) true);
        boolean boolean44 = longList19.removeAll((java.util.Collection<java.lang.Boolean>) booleanList36);
        boolean boolean45 = booleanList13.addAll((java.util.Collection<java.lang.Boolean>) booleanList36);
        org.ccsds.moims.mo.mal.structures.OctetList octetList46 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray48 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList49 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList49, booleanArray48);
        boolean boolean52 = booleanList49.contains((java.lang.Object) (short) 10);
        boolean boolean53 = octetList46.removeAll((java.util.Collection<java.lang.Boolean>) booleanList49);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray54 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList55 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList55, uShortArray54);
        java.lang.Boolean[] booleanArray59 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList60 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList60, booleanArray59);
        boolean boolean62 = uShortList55.removeAll((java.util.Collection<java.lang.Boolean>) booleanList60);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray63 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList64 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList64, uShortArray63);
        java.lang.Boolean[] booleanArray68 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList69 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList69, booleanArray68);
        boolean boolean71 = uShortList64.removeAll((java.util.Collection<java.lang.Boolean>) booleanList69);
        boolean boolean72 = booleanList60.containsAll((java.util.Collection<java.lang.Boolean>) booleanList69);
        int int73 = booleanList69.size();
        boolean boolean74 = octetList46.removeAll((java.util.Collection<java.lang.Boolean>) booleanList69);
        boolean boolean76 = booleanList69.contains((java.lang.Object) 100.0f);
        java.lang.Boolean boolean78 = booleanList69.get(0);
        boolean boolean79 = booleanList13.removeAll((java.util.Collection<java.lang.Boolean>) booleanList69);
        boolean boolean80 = doubleList8.retainAll((java.util.Collection<java.lang.Boolean>) booleanList13);
        boolean boolean81 = doubleList5.removeAll((java.util.Collection<java.lang.Boolean>) booleanList13);
        java.util.Spliterator<java.lang.Boolean> booleanSpliterator82 = booleanList13.spliterator();
        java.lang.Long long83 = booleanList13.getShortForm();
        boolean boolean84 = floatList0.retainAll((java.util.Collection<java.lang.Boolean>) booleanList13);
        floatList0.add((int) (byte) 0, (java.lang.Float) 1.0f);
        java.lang.Long long88 = floatList0.getShortForm();
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer89 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl90 = mCServicesConsumer89.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl91 = mCServicesConsumer89.getActionService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl92 = mCServicesConsumer89.getStatisticService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl93 = mCServicesConsumer89.getCheckService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl94 = mCServicesConsumer89.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl95 = mCServicesConsumer89.getAggregationService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl96 = mCServicesConsumer89.getAlertService();
        boolean boolean97 = floatList0.equals((java.lang.Object) alertConsumerServiceImpl96);
        org.junit.Assert.assertNotNull(floatSpliterator1);
        org.junit.Assert.assertNotNull(uShort2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(uShort9);
        org.junit.Assert.assertNotNull(uShort10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(uOctet14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 281475010265086L + "'", long15.equals(281475010265086L));
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(uShortArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(uShortArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43.equals(false));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(uShortArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(booleanArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(uShortArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(booleanArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78.equals(false));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(booleanSpliterator82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 281475010265086L + "'", long83.equals(281475010265086L));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 281475010265084L + "'", long88.equals(281475010265084L));
        org.junit.Assert.assertNull(statisticConsumerServiceImpl90);
        org.junit.Assert.assertNull(actionConsumerServiceImpl91);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl92);
        org.junit.Assert.assertNull(checkConsumerServiceImpl93);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl94);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl95);
        org.junit.Assert.assertNull(alertConsumerServiceImpl96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        long long1 = esa.mo.mc.impl.util.MCServicesHelper.getAlertObjectTypeAsKey((-13));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-13L) + "'", long1 == (-13L));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.mal.structures.Time time10 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mal.structures.Time time11 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue12 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.mc.parameter.structures.ParameterValue parameterValue13 = parameterInstance9.getParameterValue();
        org.ccsds.moims.mo.mal.structures.Identifier identifier14 = parameterInstance9.getName();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(time10);
        org.junit.Assert.assertNotNull(time11);
        org.junit.Assert.assertNotNull(parameterValue12);
        org.junit.Assert.assertNotNull(parameterValue13);
        org.junit.Assert.assertNotNull(identifier14);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl2 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl3 = mCServicesConsumer0.getParameterService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl2);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl3);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl1 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl2 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl3 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl4 = mCServicesConsumer0.getAggregationService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl6 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl7 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl8 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl9 = mCServicesConsumer0.getCheckService();
        org.junit.Assert.assertNull(checkConsumerServiceImpl1);
        org.junit.Assert.assertNull(checkConsumerServiceImpl2);
        org.junit.Assert.assertNull(actionConsumerServiceImpl3);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl4);
        org.junit.Assert.assertNull(checkConsumerServiceImpl6);
        org.junit.Assert.assertNull(actionConsumerServiceImpl7);
        org.junit.Assert.assertNull(actionConsumerServiceImpl8);
        org.junit.Assert.assertNull(checkConsumerServiceImpl9);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl1 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl3 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl4 = mCServicesConsumer0.getAggregationService();
        org.junit.Assert.assertNull(parameterConsumerServiceImpl1);
        org.junit.Assert.assertNull(alertConsumerServiceImpl3);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl4);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl2 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl3 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl6 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl7 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl8 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl9 = mCServicesConsumer0.getCheckService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(actionConsumerServiceImpl2);
        org.junit.Assert.assertNull(alertConsumerServiceImpl3);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl6);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl7);
        org.junit.Assert.assertNull(actionConsumerServiceImpl8);
        org.junit.Assert.assertNull(checkConsumerServiceImpl9);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.ccsds.moims.mo.mal.structures.UInteger uInteger0 = new org.ccsds.moims.mo.mal.structures.UInteger();
        java.lang.Integer int1 = uInteger0.getTypeShortForm();
        java.lang.String str2 = uInteger0.toString();
        java.lang.Long long3 = uInteger0.getShortForm();
        org.ccsds.moims.mo.mal.structures.Time time4 = new org.ccsds.moims.mo.mal.structures.Time();
        java.lang.String str5 = time4.toString();
        org.ccsds.moims.mo.mal.structures.Element element6 = time4.createElement();
        org.ccsds.moims.mo.mal.structures.UOctet uOctet7 = time4.getAreaVersion();
        short short8 = uOctet7.getValue();
        boolean boolean9 = uInteger0.equals((java.lang.Object) short8);
        double double10 = esa.mo.mc.impl.util.MCServicesHelper.getDouble((org.ccsds.moims.mo.mal.structures.Attribute) uInteger0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1.equals(12));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0" + "'", str2.equals("0"));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 281474993487884L + "'", long3.equals(281474993487884L));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(uOctet7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl1 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.CheckConsumerServiceImpl checkConsumerServiceImpl2 = mCServicesConsumer0.getCheckService();
        esa.mo.mc.impl.consumer.ActionConsumerServiceImpl actionConsumerServiceImpl3 = mCServicesConsumer0.getActionService();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl4 = mCServicesConsumer0.getAggregationService();
        esa.mo.mc.impl.consumer.AlertConsumerServiceImpl alertConsumerServiceImpl5 = mCServicesConsumer0.getAlertService();
        mCServicesConsumer0.closeConnections();
        org.junit.Assert.assertNull(checkConsumerServiceImpl1);
        org.junit.Assert.assertNull(checkConsumerServiceImpl2);
        org.junit.Assert.assertNull(actionConsumerServiceImpl3);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl4);
        org.junit.Assert.assertNull(alertConsumerServiceImpl5);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        esa.mo.mc.impl.util.MCServicesConsumer mCServicesConsumer0 = new esa.mo.mc.impl.util.MCServicesConsumer();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl1 = mCServicesConsumer0.getStatisticService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl2 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.StatisticConsumerServiceImpl statisticConsumerServiceImpl3 = mCServicesConsumer0.getStatisticService();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl5 = mCServicesConsumer0.getParameterService();
        esa.mo.mc.impl.consumer.ParameterConsumerServiceImpl parameterConsumerServiceImpl6 = mCServicesConsumer0.getParameterService();
        mCServicesConsumer0.closeConnections();
        mCServicesConsumer0.closeConnections();
        esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl aggregationConsumerServiceImpl9 = mCServicesConsumer0.getAggregationService();
        org.junit.Assert.assertNull(statisticConsumerServiceImpl1);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl2);
        org.junit.Assert.assertNull(statisticConsumerServiceImpl3);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl5);
        org.junit.Assert.assertNull(parameterConsumerServiceImpl6);
        org.junit.Assert.assertNull(aggregationConsumerServiceImpl9);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray0 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList1 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList1, uShortArray0);
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList6 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList6, booleanArray5);
        boolean boolean8 = uShortList1.removeAll((java.util.Collection<java.lang.Boolean>) booleanList6);
        java.util.ListIterator<org.ccsds.moims.mo.mal.structures.UShort> uShortItor9 = uShortList1.listIterator();
        uShortList1.clear();
        java.lang.Object[] objArray11 = uShortList1.toArray();
        boolean boolean12 = uShortList1.isEmpty();
        uShortList1.clear();
        java.lang.String str14 = uShortList1.toString();
        org.ccsds.moims.mo.mal.structures.StringList stringList15 = new org.ccsds.moims.mo.mal.structures.StringList();
        java.lang.Integer int16 = stringList15.getTypeShortForm();
        java.lang.Long long17 = stringList15.getShortForm();
        org.ccsds.moims.mo.mal.structures.UShort uShort18 = stringList15.getAreaNumber();
        boolean boolean19 = uShortList1.add(uShort18);
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts20 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        esa.mo.mc.impl.util.MCServicesHelper.KeyParts keyParts21 = new esa.mo.mc.impl.util.MCServicesHelper.KeyParts();
        org.ccsds.moims.mo.com.structures.ObjectType objectType22 = keyParts21.objectType;
        keyParts20.objectType = objectType22;
        esa.mo.mc.impl.util.MCServicesHelper.generateObjectTypeFromSubKey(objectType22, (java.lang.Long) 281474993487875L);
        boolean boolean26 = uShortList1.equals((java.lang.Object) objectType22);
        org.ccsds.moims.mo.mal.structures.OctetList octetList27 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray29 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList30 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList30, booleanArray29);
        boolean boolean33 = booleanList30.contains((java.lang.Object) (short) 10);
        boolean boolean34 = octetList27.removeAll((java.util.Collection<java.lang.Boolean>) booleanList30);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray35 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList36 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList36, uShortArray35);
        java.lang.Boolean[] booleanArray40 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList41 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList41, booleanArray40);
        boolean boolean43 = uShortList36.removeAll((java.util.Collection<java.lang.Boolean>) booleanList41);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray44 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList45 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList45, uShortArray44);
        java.lang.Boolean[] booleanArray49 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList50 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList50, booleanArray49);
        boolean boolean52 = uShortList45.removeAll((java.util.Collection<java.lang.Boolean>) booleanList50);
        boolean boolean53 = booleanList41.containsAll((java.util.Collection<java.lang.Boolean>) booleanList50);
        int int54 = booleanList50.size();
        boolean boolean55 = octetList27.removeAll((java.util.Collection<java.lang.Boolean>) booleanList50);
        boolean boolean57 = booleanList50.contains((java.lang.Object) 100.0f);
        java.lang.Boolean boolean59 = booleanList50.get(0);
        org.ccsds.moims.mo.mal.structures.OctetList octetList60 = new org.ccsds.moims.mo.mal.structures.OctetList();
        java.lang.Boolean[] booleanArray62 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList63 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList63, booleanArray62);
        boolean boolean66 = booleanList63.contains((java.lang.Object) (short) 10);
        boolean boolean67 = octetList60.removeAll((java.util.Collection<java.lang.Boolean>) booleanList63);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray68 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList69 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList69, uShortArray68);
        java.lang.Boolean[] booleanArray73 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList74 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList74, booleanArray73);
        boolean boolean76 = uShortList69.removeAll((java.util.Collection<java.lang.Boolean>) booleanList74);
        org.ccsds.moims.mo.mal.structures.UShort[] uShortArray77 = new org.ccsds.moims.mo.mal.structures.UShort[] {};
        java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort> uShortList78 = new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.UShort>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.UShort>) uShortList78, uShortArray77);
        java.lang.Boolean[] booleanArray82 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList83 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList83, booleanArray82);
        boolean boolean85 = uShortList78.removeAll((java.util.Collection<java.lang.Boolean>) booleanList83);
        boolean boolean86 = booleanList74.containsAll((java.util.Collection<java.lang.Boolean>) booleanList83);
        int int87 = booleanList83.size();
        boolean boolean88 = octetList60.removeAll((java.util.Collection<java.lang.Boolean>) booleanList83);
        boolean boolean90 = booleanList83.contains((java.lang.Object) 100.0f);
        java.util.Spliterator<java.lang.Boolean> booleanSpliterator91 = booleanList83.spliterator();
        int int92 = booleanList50.indexOf((java.lang.Object) booleanList83);
        booleanList50.add(0, (java.lang.Boolean) true);
        boolean boolean96 = uShortList1.retainAll((java.util.Collection<java.lang.Boolean>) booleanList50);
        try {
            java.util.List<org.ccsds.moims.mo.mal.structures.UShort> uShortList99 = uShortList1.subList(0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(uShortArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(uShortItor9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-15) + "'", int16.equals((-15)));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 281475010265073L + "'", long17.equals(281475010265073L));
        org.junit.Assert.assertNotNull(uShort18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(uShortArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(uShortArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59.equals(false));
        org.junit.Assert.assertNotNull(booleanArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(uShortArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(booleanArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(uShortArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(booleanArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2 + "'", int87 == 2);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(booleanSpliterator91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.ccsds.moims.mo.mal.structures.Identifier identifier1 = new org.ccsds.moims.mo.mal.structures.Identifier("[10.0]");
        org.ccsds.moims.mo.mal.structures.Identifier identifier3 = new org.ccsds.moims.mo.mal.structures.Identifier("[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.ccsds.moims.mo.mal.structures.UShort uShort4 = identifier3.getServiceNumber();
        org.ccsds.moims.mo.com.structures.ObjectId objectId5 = null;
        org.ccsds.moims.mo.mal.structures.Time time7 = new org.ccsds.moims.mo.mal.structures.Time((long) 14);
        org.ccsds.moims.mo.mal.structures.UOctet uOctet8 = time7.getAreaVersion();
        esa.mo.mc.impl.provider.ParameterInstance parameterInstance9 = new esa.mo.mc.impl.provider.ParameterInstance(identifier1, (org.ccsds.moims.mo.mal.structures.Attribute) identifier3, objectId5, time7);
        org.ccsds.moims.mo.mal.structures.Time time10 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mal.structures.Time time11 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.mal.structures.Identifier identifier12 = parameterInstance9.getName();
        org.ccsds.moims.mo.mal.structures.Time time13 = parameterInstance9.getTimestamp();
        org.ccsds.moims.mo.com.structures.ObjectId objectId14 = parameterInstance9.getSource();
        org.junit.Assert.assertNotNull(uShort4);
        org.junit.Assert.assertNotNull(uOctet8);
        org.junit.Assert.assertNotNull(time10);
        org.junit.Assert.assertNotNull(time11);
        org.junit.Assert.assertNotNull(identifier12);
        org.junit.Assert.assertNotNull(time13);
        org.junit.Assert.assertNull(objectId14);
    }
}
