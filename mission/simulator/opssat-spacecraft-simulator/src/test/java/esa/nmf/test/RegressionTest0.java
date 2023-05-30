package esa.nmf.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0
{

  public static boolean debug = false;

  @Test
  public void test0001() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0001");
    }
    java.lang.String str0 = opssat.simulator.threading.SimulatorNode.getWorkingDir();
  }

  @Test
  public void test0002() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0002");
    }
    java.lang.String str1 = opssat.simulator.threading.SimulatorNode.calcNMEAChecksum("hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "*48" + "'", str1.equals("*48"));
  }

  @Test
  public void test0004() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0004");
    }
    java.lang.String str1 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(true);
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "UnknownGUIData" + "'",
        str1.equals("UnknownGUIData"));
  }

  @Test
  public void test0006() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0006");
    }
    java.util.Date date0 = null;
    try {
      int int1 = opssat.simulator.util.DateExtraction.getHourFromDate(date0);
      org.junit.Assert
          .fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0007() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0007");
    }
    long long1 = opssat.simulator.util.SimulatorSchedulerPiece
        .getMillisFromDDDDDHHMMSSmmm("[true]");
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
  }

  @Test
  public void test0008() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0008");
    }
    java.lang.String str1 = opssat.simulator.util.SimulatorSchedulerPiece
        .getDDDDDHHMMSSmmmFromMillis(8);
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000:00:00:00:008" + "'",
        str1.equals("00000:00:00:00:008"));
  }

  @Test
  public void test0009() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0009");
    }
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap1 =
        opssat.simulator.util.SimulatorData
            .computeTimeUnit(11);
    org.junit.Assert.assertNotNull(timeUnitMap1);
  }

  @Test
  public void test0010() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0010");
    }
    opssat.simulator.models.AbstractModel abstractModel1 =
        new opssat.simulator.models.AbstractModel(
            "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]");
  }

  @Test
  public void test0011() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0011");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.restoreArgument();
    try {
      argumentDescriptor5.setIntTypeByIndex(8, 12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [I");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
  }

  @Test
  public void test0012() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0012");
    }
    opssat.simulator.util.LoggerFormatter1Line loggerFormatter1Line1 =
        new opssat.simulator.util.LoggerFormatter1Line(
            "$DEFAULT");
    java.util.logging.LogRecord logRecord2 = null;
    try {
      java.lang.String str3 = loggerFormatter1Line1.format(logRecord2);
      org.junit.Assert
          .fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0013() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0013");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    float[] floatArray11 = new float[]{281474993487887L, 281475010265070L, 281474993487881L};
    simulatorSpacecraftState3.setRv(floatArray11);
    double double13 = simulatorSpacecraftState3.getAltitude();
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertNotNull(floatArray11);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 14.0d + "'", double13 == 14.0d);
  }

  @Test
  public void test0014() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0014");
    }
    opssat.simulator.util.LoggerFormatter1Line loggerFormatter1Line1 =
        new opssat.simulator.util.LoggerFormatter1Line(
            "0100.0000");
  }

  @Test
  public void test0015() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0015");
    }
    long long1 = opssat.simulator.util.SimulatorSchedulerPiece
        .getMillisFromDDDDDHHMMSSmmm("yyyy/MM/dd-HH:mm:ss");
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
  }

  @Test
  public void test0016() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0016");
    }
    java.lang.String str1 = opssat.simulator.threading.SimulatorNode
        .calcNMEAChecksum("UnknownGUIData");
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "*76" + "'", str1.equals("*76"));
  }

  @Test
  public void test0017() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0017");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    java.lang.Object obj6 = argumentDescriptor5.getType();
    try {
      int int8 = argumentDescriptor5.getTypeAsIntByIndex(11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [I");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertNotNull(obj6);
  }

  @Test
  public void test0018() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0018");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.restoreArgument();
    try {
      float float9 = argumentDescriptor5.getTypeAsFloatByIndex(15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [F");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
  }

  @Test
  public void test0019() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0019");
    }
    boolean boolean1 = opssat.simulator.threading.SimulatorNode
        .isInteger("X:[+.00000] ; Y:[+.00000] ; Z: [+.00000] units [N/A]");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
  }

  @Test
  public void test0020() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0020");
    }
    java.lang.String str1 = opssat.simulator.threading.SimulatorNode
        .calcNMEAChecksum("[-1.0, 100.0, 10.0, 10.0]");
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "*7C" + "'", str1.equals("*7C"));
  }

  @Test
  public void test0021() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0021");
    }
    java.lang.String str1 = opssat.simulator.threading.SimulatorNode
        .calcNMEAChecksum("opssat.simulator.util.wav.WavFileException: 00000:00:00:00:008");
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "*44" + "'", str1.equals("*44"));
  }

  @Test
  public void test0022() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0022");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList1 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int2 = octetList1.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort3 = octetList1.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet4 = octetList1.getAreaVersion();
    opssat.simulator.util.wav.WavFileException wavFileException6 =
        new opssat.simulator.util.wav.WavFileException(
            "UnknownGUIData");
    java.lang.Throwable[] throwableArray7 = wavFileException6.getSuppressed();
    boolean boolean8 = octetList1.equals(wavFileException6);
    opssat.simulator.util.wav.WavFileException wavFileException10 =
        new opssat.simulator.util.wav.WavFileException(
            "00000:00:00:00:008");
    wavFileException6.addSuppressed(wavFileException10);
    opssat.simulator.util.wav.WavFileException wavFileException12 =
        new opssat.simulator.util.wav.WavFileException(
            "[-1.0, 100.0, 10.0, 10.0]", wavFileException6);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2.equals((-7)));
    org.junit.Assert.assertNotNull(uShort3);
    org.junit.Assert.assertNotNull(uOctet4);
    org.junit.Assert.assertNotNull(throwableArray7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0023() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0023");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet3 = octetList0.getAreaVersion();
    opssat.simulator.util.wav.WavFileException wavFileException5 =
        new opssat.simulator.util.wav.WavFileException(
            "UnknownGUIData");
    java.lang.Throwable[] throwableArray6 = wavFileException5.getSuppressed();
    boolean boolean7 = octetList0.equals(wavFileException5);
    try {
      java.lang.Byte byte9 = octetList0.remove(40);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 40, Size: 0");
    } catch (java.lang.IndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(uOctet3);
    org.junit.Assert.assertNotNull(throwableArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0025() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0025");
    }
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap1 =
        opssat.simulator.util.SimulatorData
            .computeTimeUnit(2);
    org.junit.Assert.assertNotNull(timeUnitMap1);
  }

  @Test
  public void test0026() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0026");
    }
    long long1 = opssat.simulator.util.SimulatorSchedulerPiece.getMillisFromDDDDDHHMMSSmmm("[0]");
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
  }

  @Test
  public void test0028() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0028");
    }
    boolean boolean1 = opssat.simulator.tcp.SocketClient.validIP("[0]");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
  }

  @Test
  public void test0029() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0029");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    simulatorSpacecraftState3.setLatitude((short) 100);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
  }

  @Test
  public void test0030() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0030");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    java.lang.Object obj6 = argumentDescriptor5.getType();
    try {
      float float8 = argumentDescriptor5.getTypeAsFloatByIndex(60);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [F");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertNotNull(obj6);
  }

  @Test
  public void test0032() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0032");
    }
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece3 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            'a', 11, "");
    int int4 = simulatorSchedulerPiece3.getInternalID();
    java.lang.String str5 = simulatorSchedulerPiece3.getSchedulerOutput();
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
    org.junit.Assert.assertTrue(
        "'" + str5 + "' != '" + "00000:00:00:00:097  11                 executed false   | " + "'",
        str5.equals("00000:00:00:00:097  11                 executed false   | "));
  }

  @Test
  public void test0033() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0033");
    }
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap1 =
        opssat.simulator.util.SimulatorData
            .computeTimeUnit(7);
    org.junit.Assert.assertNotNull(timeUnitMap1);
  }

  @Test
  public void test0035() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0035");
    }
    boolean boolean1 = opssat.simulator.threading.SimulatorNode.isInteger("*48");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
  }

  @Test
  public void test0036() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0036");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    java.lang.Object obj6 = argumentDescriptor5.getType();
    try {
      float float8 = argumentDescriptor5.getTypeAsFloatByIndex((-1));
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [F");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertNotNull(obj6);
  }

  @Test
  public void test0037() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0037");
    }
    opssat.simulator.util.wav.WavFileException wavFileException1 =
        new opssat.simulator.util.wav.WavFileException(
            "UnknownGUIData");
    java.lang.Throwable[] throwableArray2 = wavFileException1.getSuppressed();
    opssat.simulator.util.wav.WavFileException wavFileException4 =
        new opssat.simulator.util.wav.WavFileException(
            "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}");
    wavFileException1.addSuppressed(wavFileException4);
    org.junit.Assert.assertNotNull(throwableArray2);
  }

  @Test
  public void test0038() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0038");
    }
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor2 =
        new opssat.simulator.util.ArgumentDescriptor(
            20, "18446744073709551615");
  }

  @Test
  public void test0039() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0039");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState8 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray11 = new float[]{28, 8};
    simulatorSpacecraftState8.setQ(floatArray11);
    simulatorSpacecraftState3.setRv(floatArray11);
    double double14 = simulatorSpacecraftState3.getAltitude();
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertNotNull(floatArray11);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 14.0d + "'", double14 == 14.0d);
  }

  @Test
  public void test0040() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0040");
    }
    try {
      opssat.simulator.orekit.GPSSatInView gPSSatInView2 = new opssat.simulator.orekit.GPSSatInView(
          "00000:00:00:00:008", 18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
    }
  }

  @Test
  public void test0041() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0041");
    }
    opssat.simulator.threading.SimulatorNode.DevDatPBind devDatPBind0 =
        opssat.simulator.threading.SimulatorNode.DevDatPBind.FineADCS_AngularVelocity;
    org.junit.Assert.assertTrue(
        "'" + devDatPBind0 + "' != '"
        + opssat.simulator.threading.SimulatorNode.DevDatPBind.FineADCS_AngularVelocity + "'",
        devDatPBind0
            .equals(opssat.simulator.threading.SimulatorNode.DevDatPBind.FineADCS_AngularVelocity));
  }

  @Test
  public void test0042() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0042");
    }
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece3 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            8, 'a', "0.0");
    java.lang.String str4 = simulatorSchedulerPiece3.getSchedulerOutput();
    org.junit.Assert.assertTrue(
        "'" + str4 + "' != '" + "00000:00:00:00:008  97    0.0          executed false   | " + "'",
        str4.equals("00000:00:00:00:008  97    0.0          executed false   | "));
  }

  @Test
  public void test0043() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0043");
    }
    opssat.simulator.util.LoggerFormatter loggerFormatter0 =
        new opssat.simulator.util.LoggerFormatter();
    java.util.logging.LogRecord logRecord1 = null;
    try {
      java.lang.String str2 = loggerFormatter0.format(logRecord1);
      org.junit.Assert
          .fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0044() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0044");
    }
    java.lang.String str1 = opssat.simulator.util.SimulatorSchedulerPiece
        .getDDDDDHHMMSSmmmFromMillis(281474993487876L);
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3257812:10:11:27:876" + "'",
        str1.equals("3257812:10:11:27:876"));
  }

  @Test
  public void test0046() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0046");
    }
    int int0 =
        opssat.simulator.peripherals.PFineADCS.FWRefFineADCS.NADIR_TGTTRACKSTAT_IDX.RW_SPEED_Y;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60 + "'", int0 == 60);
  }

  @Test
  public void test0047() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0047");
    }
    java.lang.String str1 = opssat.simulator.util.SimulatorSchedulerPiece
        .getDDDDDHHMMSSmmmFromMillis(9);
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000:00:00:00:009" + "'",
        str1.equals("00000:00:00:00:009"));
  }

  @Test
  public void test0048() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0048");
    }
    java.lang.String str1 = opssat.simulator.util.SimulatorSchedulerPiece
        .getDDDDDHHMMSSmmmFromMillis(10L);
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000:00:00:00:010" + "'",
        str1.equals("00000:00:00:00:010"));
  }

  @Test
  public void test0049() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0049");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    float[] floatArray8 = simulatorSpacecraftState3.getR();
    simulatorSpacecraftState3.setAltitude(14.0d);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertNotNull(floatArray8);
  }

  @Test
  public void test0050() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0050");
    }
    java.lang.String str1 = opssat.simulator.threading.SimulatorNode.calcNMEAChecksum("[]");
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "*5D" + "'", str1.equals("*5D"));
  }

  @Test
  public void test0051() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0051");
    }
    opssat.simulator.models.AbstractModel abstractModel1 =
        new opssat.simulator.models.AbstractModel(
            "");
  }

  @Test
  public void test0052() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0052");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    simulatorSpacecraftState3.setLongitude(4);
    double double6 = simulatorSpacecraftState3.getLatitude();
    java.lang.String str7 = simulatorSpacecraftState3.getSunVectorAsString();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 340.0d + "'", double6 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str7 + "' != '" + "X:[+.00000] ; Y:[+.00000] ; Z: [+.00000] units [N/A]" + "'",
        str7.equals("X:[+.00000] ; Y:[+.00000] ; Z: [+.00000] units [N/A]"));
  }

  @Test
  public void test0053() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0053");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    simulatorData1.setCounter((-1));
    simulatorData1.feedTimeElapsed(21);
    boolean boolean6 = simulatorData1.isSimulatorRunning();
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test0054() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0054");
    }
    java.lang.String str1 = opssat.simulator.threading.SimulatorNode
        .calcNMEAChecksum("18446744073709551615");
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "*30" + "'", str1.equals("*30"));
  }

  @Test
  public void test0055() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0055");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    simulatorData1.setCounter((-1));
    simulatorData1.feedTimeElapsed(21);
    java.lang.String str6 = simulatorData1.getCurrentDay();
    boolean boolean7 = simulatorData1.isTimeRunning();
    simulatorData1.setMethodsExecuted(48);
    int int10 = simulatorData1.getCounter();
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
  }

  @Test
  public void test0056() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0056");
    }
    java.lang.String str1 = opssat.simulator.util.SimulatorSchedulerPiece
        .getDDDDDHHMMSSmmmFromMillis((-2));
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000:00:00:00:-02" + "'",
        str1.equals("00000:00:00:00:-02"));
  }

  @Test
  public void test0057() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0057");
    }
    boolean boolean1 = opssat.simulator.threading.SimulatorNode.isInteger("");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
  }

  @Test
  public void test0058() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0058");
    }
    try {
      opssat.simulator.orekit.GPSSatInView gPSSatInView2 = new opssat.simulator.orekit.GPSSatInView(
          "", (-5));
      org.junit.Assert.fail(
          "Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
    }
  }

  @Test
  public void test0059() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0059");
    }
    long long1 = opssat.simulator.util.SimulatorSchedulerPiece.getMillisFromDDDDDHHMMSSmmm("*44");
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
  }

  @Test
  public void test0060() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0060");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    simulatorData1.setCounter((-1));
    simulatorData1.feedTimeElapsed(21);
    java.lang.String str6 = simulatorData1.getCurrentDay();
    boolean boolean7 = simulatorData1.isTimeRunning();
    simulatorData1.incrementMethods();
    java.lang.String str9 = simulatorData1.toString();
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0061() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0061");
    }
    opssat.simulator.threading.SimulatorNode.DevDatPBind devDatPBind0 =
        opssat.simulator.threading.SimulatorNode.DevDatPBind.FineADCS_Magnetometer;
    org.junit.Assert.assertTrue(
        "'" + devDatPBind0 + "' != '"
        + opssat.simulator.threading.SimulatorNode.DevDatPBind.FineADCS_Magnetometer + "'",
        devDatPBind0
            .equals(opssat.simulator.threading.SimulatorNode.DevDatPBind.FineADCS_Magnetometer));
  }

  @Test
  public void test0062() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0062");
    }
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience8 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            4.0d, (short) 100, 281475010265075L, (-4), 0.0d, (-7), 281474993487888L, (short) 255);
    double double9 = gPSSatInViewScience8.getAvgDistance();
    double double10 = gPSSatInViewScience8.getMinElevation();
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.81475010265075E14d + "'",
        double10 == 2.81475010265075E14d);
  }

  @Test
  public void test0063() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0063");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    int int50 = celestiaData32.getSeconds();
    try {
      java.lang.String str51 = celestiaData32.toString();
      org.junit.Assert
          .fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
  }

  @Test
  public void test0064() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0064");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet3 = octetList0.getAreaVersion();
    opssat.simulator.util.wav.WavFileException wavFileException5 =
        new opssat.simulator.util.wav.WavFileException(
            "UnknownGUIData");
    java.lang.Throwable[] throwableArray6 = wavFileException5.getSuppressed();
    boolean boolean7 = octetList0.equals(wavFileException5);
    java.lang.Object[] objArray8 = octetList0.toArray();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(uOctet3);
    org.junit.Assert.assertNotNull(throwableArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(objArray8);
  }

  @Test
  public void test0065() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0065");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    simulatorData1.setCounter((-1));
    simulatorData1.feedTimeElapsed(21);
    simulatorData1.setTimeFactor(28);
  }

  @Test
  public void test0066() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0066");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    java.lang.Object obj6 = argumentDescriptor5.getType();
    try {
      argumentDescriptor5.setFloatTypeByIndex(24, 36);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [F");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertNotNull(obj6);
  }

  @Test
  public void test0067() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0067");
    }
    boolean boolean1 = opssat.simulator.tcp.SocketClient.validIP("SimulatorData");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
  }

  @Test
  public void test0068() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0068");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    argumentDescriptor5.restoreArgument();
    try {
      argumentDescriptor5.setFloatTypeByIndex(13, 36);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [F");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
  }

  @Test
  public void test0069() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0069");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList1 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int2 = octetList1.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort3 = octetList1.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet4 = octetList1.getAreaVersion();
    opssat.simulator.util.wav.WavFileException wavFileException6 =
        new opssat.simulator.util.wav.WavFileException(
            "UnknownGUIData");
    java.lang.Throwable[] throwableArray7 = wavFileException6.getSuppressed();
    boolean boolean8 = octetList1.equals(wavFileException6);
    opssat.simulator.util.wav.WavFileException wavFileException10 =
        new opssat.simulator.util.wav.WavFileException(
            "00000:00:00:00:008");
    wavFileException6.addSuppressed(wavFileException10);
    opssat.simulator.util.wav.WavFileException wavFileException12 =
        new opssat.simulator.util.wav.WavFileException(
            "{counter=-1, methodsExecuted=1, currentTime=Thu May 23 15:09:32 UTC 2019}",
            wavFileException6);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2.equals((-7)));
    org.junit.Assert.assertNotNull(uShort3);
    org.junit.Assert.assertNotNull(uOctet4);
    org.junit.Assert.assertNotNull(throwableArray7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0070() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0070");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date2 = simulatorData1.getCurrentTime();
    int int3 = opssat.simulator.util.DateExtraction.getYearFromDate(date2);
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date2);
    org.junit.Assert.assertNotNull(date2);
  }

  @Test
  public void test0071() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0071");
    }
    java.util.Date date0 = null;
    try {
      int int1 = opssat.simulator.util.DateExtraction.getDayFromDate(date0);
      org.junit.Assert
          .fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0072() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0072");
    }
    java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList3 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean4 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
    int int6 = booleanList3.indexOf(10);
    booleanList3.clear();
    opssat.simulator.util.DateExtraction dateExtraction8 =
        new opssat.simulator.util.DateExtraction();
    boolean boolean9 = booleanList3.equals(dateExtraction8);
    try {
      java.lang.Boolean boolean12 = booleanList3.set(60, true);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 60, Size: 0");
    } catch (java.lang.IndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(booleanArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0073() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0073");
    }
    try {
      opssat.simulator.orekit.GPSSatInView gPSSatInView2 = new opssat.simulator.orekit.GPSSatInView(
          "[true]", 8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
    }
  }

  @Test
  public void test0076() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0076");
    }
    org.ccsds.moims.mo.mal.structures.URI uRI1 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    java.lang.Integer int2 = uRI1.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.URI uRI4 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.UOctet uOctet5 = uRI4.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.URI uRI7 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.URI[] uRIArray8 = new org.ccsds.moims.mo.mal.structures.URI[]{
      uRI1, uRI4, uRI7};
    java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI> uRIList9 =
        new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI>();
    boolean boolean10 = java.util.Collections
        .addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.URI>) uRIList9, uRIArray8);
    org.ccsds.moims.mo.mal.structures.FineTime fineTime11 =
        new org.ccsds.moims.mo.mal.structures.FineTime();
    int int12 = uRIList9.indexOf(fineTime11);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState16 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double17 = simulatorSpacecraftState16.getLatitude();
    double double18 = simulatorSpacecraftState16.getLongitude();
    int int19 = uRIList9.indexOf(simulatorSpacecraftState16);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2.equals(18));
    org.junit.Assert.assertNotNull(uOctet5);
    org.junit.Assert.assertNotNull(uRIArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 340.0d + "'", double17 == 340.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
  }

  @Test
  public void test0077() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0077");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(8);
    java.lang.String str2 = simulatorData1.getCurrentYear();
    int thisYear = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()).getYear();
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + thisYear + "'", str2.equals(
        Integer.toString(
            thisYear)));
  }

  @Test
  public void test0078() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0078");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    java.lang.Object obj6 = argumentDescriptor5.getType();
    try {
      int int8 = argumentDescriptor5.getTypeAsIntByIndex(70);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [I");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertNotNull(obj6);
  }

  @Test
  public void test0079() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0079");
    }
    java.lang.Throwable throwable0 = null;
    opssat.simulator.util.wav.WavFileException wavFileException1 =
        new opssat.simulator.util.wav.WavFileException(
            throwable0);
  }

  @Test
  public void test0080() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0080");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    simulatorHeader12.setOrekitTLE1("");
    java.lang.String str16 = simulatorHeader12.DATE_FORMAT;
    java.lang.String str17 = simulatorHeader12.getOrekitTLE1();
    java.lang.String str18 = simulatorHeader12.getOrekitTLE2();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "yyyy:MM:dd HH:mm:ss z" + "'",
        str16.equals("yyyy:MM:dd HH:mm:ss z"));
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    org.junit.Assert.assertNull(str18);
  }

  @Test
  public void test0081() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0081");
    }
    try {
      opssat.simulator.orekit.GPSSatInView gPSSatInView2 = new opssat.simulator.orekit.GPSSatInView(
          "0100.0000000", 281475010265075L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
    }
  }

  @Test
  public void test0083() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0083");
    }
    try {
      java.lang.String str1 = opssat.simulator.threading.SimulatorNode.calcNMEAChecksum("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
    }
  }

  @Test
  public void test0084() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0084");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            0L, 28, 2.81474993487878E14d);
  }

  @Test
  public void test0085() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0085");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.setType("yyyy/MM/dd-HH:mm:ss");
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
  }

  @Test
  public void test0086() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0086");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.restoreArgument();
    java.lang.String str9 = argumentDescriptor5.toString();
    argumentDescriptor5.setName("OPS-SAT SoftSim:");
    argumentDescriptor5.restoreArgument();
    try {
      int int14 = argumentDescriptor5.getTypeAsIntByIndex((-4));
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [I");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
  }

  @Test
  public void test0087() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0087");
    }
    java.util.Date date0 = null;
    try {
      int int1 = opssat.simulator.util.DateExtraction.getSecondsFromDate(date0);
      org.junit.Assert
          .fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0088() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0088");
    }
    org.ccsds.moims.mo.mal.structures.Time time1 = new org.ccsds.moims.mo.mal.structures.Time('4');
    long long2 = time1.getValue();
    java.lang.Integer[] intArray10 = new java.lang.Integer[]{13, 10, 100, 100, 11111, 13, 11111};
    java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean12 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
    java.lang.Byte[] byteArray17 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList18 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean19 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList18, byteArray17);
    java.lang.Integer[] intArray22 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean24 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
    boolean boolean25 = byteList18.retainAll(intList23);
    java.lang.Integer[] intArray28 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean30 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
    int int32 = intList29.lastIndexOf((byte) 10);
    boolean boolean33 = intList23.removeAll(intList29);
    boolean boolean34 = intList11.retainAll(intList29);
    org.ccsds.moims.mo.mal.structures.OctetList octetList35 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int36 = octetList35.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort37 = octetList35.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet38 = octetList35.getAreaVersion();
    opssat.simulator.util.wav.WavFileException wavFileException40 =
        new opssat.simulator.util.wav.WavFileException(
            "UnknownGUIData");
    java.lang.Throwable[] throwableArray41 = wavFileException40.getSuppressed();
    boolean boolean42 = octetList35.equals(wavFileException40);
    opssat.simulator.util.wav.WavFileException wavFileException44 =
        new opssat.simulator.util.wav.WavFileException(
            "00000:00:00:00:008");
    wavFileException40.addSuppressed(wavFileException44);
    java.lang.String str46 = wavFileException44.toString();
    int int47 = intList29.lastIndexOf(wavFileException44);
    boolean boolean48 = time1.equals(intList29);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    org.junit.Assert.assertNotNull(intArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(byteArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNotNull(intArray22);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertNotNull(intArray28);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-7) + "'", int36.equals((-7)));
    org.junit.Assert.assertNotNull(uShort37);
    org.junit.Assert.assertNotNull(uOctet38);
    org.junit.Assert.assertNotNull(throwableArray41);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert
        .assertTrue(
            "'" + str46 + "' != '"
            + "opssat.simulator.util.wav.WavFileException: 00000:00:00:00:008" + "'",
            str46.equals("opssat.simulator.util.wav.WavFileException: 00000:00:00:00:008"));
    org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
  }

  @Test
  public void test0089() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0089");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    org.ccsds.moims.mo.mal.structures.UShort uShort6 = octetList0.getAreaNumber();
    try {
      java.util.List<java.lang.Byte> byteList9 = octetList0.subList(32, 9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 9");
    } catch (java.lang.IndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertNotNull(uShort6);
  }

  @Test
  public void test0090() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0090");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    simulatorSpacecraftState3.setLongitude(4);
    int int6 = simulatorSpacecraftState3.getSatsInView();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState10 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double11 = simulatorSpacecraftState10.getLatitude();
    java.lang.String str12 = simulatorSpacecraftState10.getMagField();
    java.lang.String str13 = simulatorSpacecraftState10.toString();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState17 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double18 = simulatorSpacecraftState17.getLatitude();
    java.lang.String str19 = simulatorSpacecraftState17.getMagField();
    java.lang.String str20 = simulatorSpacecraftState17.toString();
    double[] doubleArray21 = simulatorSpacecraftState17.getSunVector();
    simulatorSpacecraftState10.setMagnetometer(doubleArray21);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    java.lang.String str29 = simulatorSpacecraftState26.toString();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState33 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double34 = simulatorSpacecraftState33.getLatitude();
    java.lang.String str35 = simulatorSpacecraftState33.getMagField();
    java.lang.String str36 = simulatorSpacecraftState33.toString();
    double[] doubleArray37 = simulatorSpacecraftState33.getSunVector();
    simulatorSpacecraftState26.setMagnetometer(doubleArray37);
    simulatorSpacecraftState10.setMagnetometer(doubleArray37);
    simulatorSpacecraftState3.setSunVector(doubleArray37);
    double[] doubleArray41 = simulatorSpacecraftState3.getSunVector();
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 340.0d + "'", double11 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str12 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str12.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str13.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 340.0d + "'", double18 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str19 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str19.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str20 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str20.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str29 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str29.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + 340.0d + "'", double34 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str35 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str35.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str36 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str36.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertNotNull(doubleArray37);
    org.junit.Assert.assertNotNull(doubleArray41);
  }

  @Test
  public void test0091() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0091");
    }
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience8 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    double double9 = gPSSatInViewScience8.getMinElevation();
    double double10 = gPSSatInViewScience8.getMaxDistance();
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 48.0d + "'", double9 == 48.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test0093() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0093");
    }
    java.lang.String str1 = opssat.simulator.threading.SimulatorNode
        .calcNMEAChecksum("OPS-SAT SoftSim:");
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "*0B" + "'", str1.equals("*0B"));
  }

  @Test
  public void test0094() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0094");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.setName("01700.0000000");
    java.lang.Object obj9 = argumentDescriptor5.getType();
    java.lang.String str10 = argumentDescriptor5.toString();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertNotNull(obj9);
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
  }

  @Test
  public void test0095() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0095");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    argumentDescriptor5.restoreArgument();
    try {
      float float8 = argumentDescriptor5.getTypeAsFloatByIndex(19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [F");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
  }

  @Test
  public void test0096() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0096");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    celestiaData32.setDate(":");
    celestiaData32.setInfo("2019:05:23 15:09:31 UTC");
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
  }

  @Test
  public void test0097() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0097");
    }
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience8 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    double double9 = gPSSatInViewScience8.getMaxDistance();
    double double10 = gPSSatInViewScience8.getMaxDistance();
    double double11 = gPSSatInViewScience8.getMinElevation();
    double double12 = gPSSatInViewScience8.getMaxElevation();
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 48.0d + "'", double11 == 48.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 56.0d + "'", double12 == 56.0d);
  }

  @Test
  public void test0098() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0098");
    }
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece3 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            13L, 0, "hi!");
    long long4 = simulatorSchedulerPiece3.getTime();
    int int5 = simulatorSchedulerPiece3.getInternalID();
    simulatorSchedulerPiece3.setExecuted(false);
    java.lang.String str8 = simulatorSchedulerPiece3.getFileString();
    java.lang.String str9 = simulatorSchedulerPiece3.getArgumentTemplateDescription();
    simulatorSchedulerPiece3.setExecuted(true);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 13L + "'", long4 == 13L);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertTrue(
        "'" + str8 + "' != '" + "00000:00:00:00:013|0000000000000000013|0|hi!" + "'",
        str8.equals("00000:00:00:00:013|0000000000000000013|0|hi!"));
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
  }

  @Test
  public void test0099() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0099");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.lang.Long[] longArray19 = new java.lang.Long[]{281475010265070L, 100L, 0L,
      281475010265070L, 281475010265070L, 1L};
    java.util.ArrayList<java.lang.Long> longList20 = new java.util.ArrayList<java.lang.Long>();
    boolean boolean21 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Long>) longList20, longArray19);
    boolean boolean22 = longList20.isEmpty();
    java.lang.Object obj23 = longList20.clone();
    opssat.simulator.util.SimulatorData simulatorData26 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date27 = simulatorData26.getCurrentTime();
    int int28 = opssat.simulator.util.DateExtraction.getDayFromDate(date27);
    opssat.simulator.util.SimulatorData simulatorData30 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date31 = simulatorData30.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData33 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date34 = simulatorData33.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap35 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date31, date34);
    opssat.simulator.util.SimulatorHeader simulatorHeader36 =
        new opssat.simulator.util.SimulatorHeader(
            false, date27, date34);
    boolean boolean37 = longList20.remove(date34);
    int int38 = opssat.simulator.util.DateExtraction.getHourFromDate(date34);
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap39 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date3, date34);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(longArray19);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(obj23);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertNotNull(date31);
    org.junit.Assert.assertNotNull(date34);
    org.junit.Assert.assertNotNull(timeUnitMap35);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(timeUnitMap39);
  }

  @Test
  public void test0100() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0100");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    java.lang.String str16 = simulatorHeader12.getOrekitTLE1();
    simulatorHeader12.setUseOrekitPropagator(true);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNull(str16);
  }

  @Test
  public void test0101() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0101");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    int int14 = simulatorHeader12.getMinuteStartDate();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long17 = simulatorData16.getCurrentTimeMillis();
    java.lang.String str18 = simulatorData16.getCurrentDay();
    java.lang.String str19 = simulatorData16.getUTCCurrentTime2();
    java.lang.String str20 = simulatorData16.getCurrentDay();
    java.util.Date date21 = simulatorData16.getCurrentTime();
    int int22 = opssat.simulator.util.DateExtraction.getMinuteFromDate(date21);
    simulatorHeader12.setEndDate(date21);
    java.lang.String str24 = simulatorHeader12.getEndDateString();
    int int25 = simulatorHeader12.getHourStartDate();
    simulatorHeader12.setKeplerElements("2019:05:23 15:09:31 UTC");
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    org.junit.Assert.assertNotNull(date21);
  }

  @Test
  public void test0102() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0102");
    }
    java.lang.String str1 = opssat.simulator.threading.SimulatorNode.calcNMEAChecksum("|");
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "*00" + "'", str1.equals("*00"));
  }

  @Test
  public void test0103() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0103");
    }
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience8 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 17, 100.0f, 48, 100.0f, (-1.0d), 64, 281474993487874L);
    double double9 = gPSSatInViewScience8.getAvgElevation();
    double double10 = gPSSatInViewScience8.getStdDevDistance();
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 64.0d + "'", double10 == 64.0d);
  }

  @Test
  public void test0104() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0104");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long2 = simulatorData1.getCurrentTimeMillis();
    java.lang.String str3 = simulatorData1.getCurrentDay();
    java.lang.String str4 = simulatorData1.getCurrentYear();
    boolean boolean5 = simulatorData1.isTimeRunning();
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0105() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0105");
    }
    java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList3 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean4 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
    int int6 = booleanList3.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor7 = booleanList3.iterator();
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator8 = booleanList3.spliterator();
    boolean boolean9 = booleanList3.isEmpty();
    java.lang.String str10 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(booleanList3);
    org.junit.Assert.assertNotNull(booleanArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    org.junit.Assert.assertNotNull(booleanItor7);
    org.junit.Assert.assertNotNull(booleanSpliterator8);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UnknownGUIData" + "'",
        str10.equals("UnknownGUIData"));
  }

  @Test
  public void test0106() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0106");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long2 = simulatorData1.getCurrentTimeMillis();
    java.lang.String str3 = simulatorData1.getUTCCurrentTime2();
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
  }

  @Test
  public void test0107() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0107");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.lang.String str13 = simulatorHeader12.getEndDateString();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    int int18 = opssat.simulator.util.DateExtraction.getDayFromDate(date17);
    opssat.simulator.util.SimulatorData simulatorData20 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date21 = simulatorData20.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap25 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date21, date24);
    opssat.simulator.util.SimulatorHeader simulatorHeader26 =
        new opssat.simulator.util.SimulatorHeader(
            false, date17, date24);
    java.util.Date date27 = simulatorHeader26.getEndDate();
    boolean boolean28 = simulatorHeader26.isAutoStartSystem();
    int int29 = simulatorHeader26.getDayStartDate();
    boolean boolean30 = simulatorHeader26.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData33 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date34 = simulatorData33.getCurrentTime();
    int int35 = opssat.simulator.util.DateExtraction.getDayFromDate(date34);
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData40 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date41 = simulatorData40.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap42 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date38, date41);
    opssat.simulator.util.SimulatorHeader simulatorHeader43 =
        new opssat.simulator.util.SimulatorHeader(
            false, date34, date41);
    simulatorHeader26.setStartDate(date41);
    simulatorHeader12.setStartDate(date41);
    java.util.Date date46 = simulatorHeader12.getEndDate();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(date21);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(timeUnitMap25);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(date34);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date41);
    org.junit.Assert.assertNotNull(timeUnitMap42);
    org.junit.Assert.assertNotNull(date46);
  }

  @Test
  public void test0108() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0108");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    simulatorHeader20.setUpdateInternet(true);
    java.util.Date date23 = null;
    simulatorHeader20.setEndDate(date23);
    try {
      boolean boolean25 = simulatorHeader20.checkStartBeforeEnd();
      org.junit.Assert
          .fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
  }

  @Test
  public void test0109() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0109");
    }
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap1 =
        opssat.simulator.util.SimulatorData
            .computeTimeUnit('4');
    org.junit.Assert.assertNotNull(timeUnitMap1);
  }

  @Test
  public void test0111() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0111");
    }
    java.lang.String str1 = opssat.simulator.threading.SimulatorNode.calcNMEAChecksum("*7C");
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "*74" + "'", str1.equals("*74"));
  }

  @Test
  public void test0112() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0112");
    }
    opssat.simulator.util.wav.WavFileException wavFileException1 =
        new opssat.simulator.util.wav.WavFileException(
            "23");
  }

  @Test
  public void test0114() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0114");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.lang.String str13 = simulatorHeader12.getEndDateString();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    int int18 = opssat.simulator.util.DateExtraction.getDayFromDate(date17);
    opssat.simulator.util.SimulatorData simulatorData20 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date21 = simulatorData20.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap25 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date21, date24);
    opssat.simulator.util.SimulatorHeader simulatorHeader26 =
        new opssat.simulator.util.SimulatorHeader(
            false, date17, date24);
    java.util.Date date27 = simulatorHeader26.getEndDate();
    boolean boolean28 = simulatorHeader26.isAutoStartSystem();
    int int29 = simulatorHeader26.getDayStartDate();
    boolean boolean30 = simulatorHeader26.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData33 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date34 = simulatorData33.getCurrentTime();
    int int35 = opssat.simulator.util.DateExtraction.getDayFromDate(date34);
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData40 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date41 = simulatorData40.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap42 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date38, date41);
    opssat.simulator.util.SimulatorHeader simulatorHeader43 =
        new opssat.simulator.util.SimulatorHeader(
            false, date34, date41);
    simulatorHeader26.setStartDate(date41);
    simulatorHeader12.setStartDate(date41);
    int int46 = simulatorHeader12.getMinuteStartDate();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(date21);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(timeUnitMap25);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(date34);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date41);
    org.junit.Assert.assertNotNull(timeUnitMap42);
  }

  @Test
  public void test0115() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0115");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    java.lang.String str33 = celestiaData32.getAos();
    celestiaData32.setDnx("");
    celestiaData32.setDnx("030932.764");
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNull(str33);
  }

  @Test
  public void test0116() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0116");
    }
    boolean boolean1 = opssat.simulator.threading.SimulatorNode
        .isInteger("2019:05:23 15:09:36 UTC");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
  }

  @Test
  public void test0117() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0117");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.restoreArgument();
    java.lang.Object obj8 = argumentDescriptor5.getType();
    java.lang.String str9 = argumentDescriptor5.toString();
    try {
      argumentDescriptor5.setIntTypeByIndex((byte) 0, 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [I");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertNotNull(obj8);
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
  }

  @Test
  public void test0118() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0118");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    simulatorData1.setCounter((-1));
    java.lang.String str4 = simulatorData1.getUTCCurrentTime2();
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0309" + "'", str4.equals("0309"));
  }

  @Test
  public void test0119() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0119");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    java.lang.String str5 = simulatorSpacecraftState3.getMagField();
    java.lang.String str6 = simulatorSpacecraftState3.toString();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState10 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double11 = simulatorSpacecraftState10.getLatitude();
    double double12 = simulatorSpacecraftState10.getLongitude();
    java.lang.String str13 = simulatorSpacecraftState10.getModeOperation();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState17 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    simulatorSpacecraftState17.setLongitude(4);
    double[] doubleArray21 = new double[]{(-1.0f)};
    simulatorSpacecraftState17.setMagField(doubleArray21);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    java.lang.String str29 = simulatorSpacecraftState26.toString();
    double[] doubleArray30 = simulatorSpacecraftState26.getSunVector();
    simulatorSpacecraftState17.setMagnetometer(doubleArray30);
    simulatorSpacecraftState10.setMagField(doubleArray30);
    simulatorSpacecraftState3.setMagField(doubleArray30);
    simulatorSpacecraftState3.setAltitude(62);
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str5 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str5.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str6 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str6.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 340.0d + "'", double11 == 340.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str29 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str29.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertNotNull(doubleArray30);
  }

  @Test
  public void test0121() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0121");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    int int50 = celestiaData32.getMonths();
    java.lang.String str51 = celestiaData32.getDnx();
    opssat.simulator.util.SimulatorData simulatorData54 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date55 = simulatorData54.getCurrentTime();
    int int56 = opssat.simulator.util.DateExtraction.getDayFromDate(date55);
    int int57 = opssat.simulator.util.DateExtraction.getHourFromDate(date55);
    opssat.simulator.util.SimulatorData simulatorData58 = new opssat.simulator.util.SimulatorData(
        48, date55);
    celestiaData32.setDate(date55);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
    org.junit.Assert.assertNull(str51);
    org.junit.Assert.assertNotNull(date55);
  }

  @Test
  public void test0122() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0122");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    java.lang.String str16 = simulatorHeader12.getOrekitTLE1();
    simulatorHeader12.setTimeFactor(31);
    simulatorHeader12.setUpdateInternet(false);
    boolean boolean21 = simulatorHeader12.isUpdateInternet();
    int int22 = simulatorHeader12.getDayStartDate();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
  }

  @Test
  public void test0123() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0123");
    }
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece3 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            13L, 0, "hi!");
    long long4 = simulatorSchedulerPiece3.getTime();
    int int5 = simulatorSchedulerPiece3.getInternalID();
    simulatorSchedulerPiece3.setExecuted(false);
    java.lang.String str8 = simulatorSchedulerPiece3.getFileString();
    java.lang.String str9 = simulatorSchedulerPiece3.getArgumentTemplateDescription();
    java.lang.String str10 = simulatorSchedulerPiece3.getArgumentTemplateDescription();
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 13L + "'", long4 == 13L);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertTrue(
        "'" + str8 + "' != '" + "00000:00:00:00:013|0000000000000000013|0|hi!" + "'",
        str8.equals("00000:00:00:00:013|0000000000000000013|0|hi!"));
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
  }

  @Test
  public void test0124() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0124");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    boolean boolean16 = simulatorHeader12.validateTimeFactor(5);
    java.lang.String str17 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(5);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "UnknownGUIData" + "'",
        str17.equals("UnknownGUIData"));
  }

  @Test
  public void test0125() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0125");
    }
    java.lang.Float[] floatArray3 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList4 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean5 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList4, floatArray3);
    boolean boolean7 = floatList4.add((-1.0f));
    floatList4.trimToSize();
    org.ccsds.moims.mo.mal.structures.StringList stringList9 =
        new org.ccsds.moims.mo.mal.structures.StringList();
    org.ccsds.moims.mo.mal.structures.ShortList shortList11 =
        new org.ccsds.moims.mo.mal.structures.ShortList(
            ' ');
    java.util.ListIterator<java.lang.Short> shortItor12 = shortList11.listIterator();
    boolean boolean13 = stringList9.equals(shortList11);
    java.util.Iterator<java.lang.Short> shortItor14 = shortList11.iterator();
    java.lang.Long long15 = shortList11.getShortForm();
    boolean boolean16 = floatList4.contains(shortList11);
    boolean boolean17 = shortList11.isEmpty();
    boolean boolean19 = shortList11.add((short) 10);
    int int20 = shortList11.size();
    java.lang.Object[] objArray21 = shortList11.toArray();
    org.junit.Assert.assertNotNull(floatArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(shortItor12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(shortItor14);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 281475010265079L + "'",
        long15.equals(281475010265079L));
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    org.junit.Assert.assertNotNull(objArray21);
  }

  @Test
  public void test0126() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0126");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    int int5 = opssat.simulator.util.DateExtraction.getDayFromDate(date4);
    opssat.simulator.util.SimulatorData simulatorData7 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date8 = simulatorData7.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData10 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date11 = simulatorData10.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap12 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date8, date11);
    opssat.simulator.util.SimulatorHeader simulatorHeader13 =
        new opssat.simulator.util.SimulatorHeader(
            false, date4, date11);
    opssat.simulator.util.SimulatorData simulatorData14 = new opssat.simulator.util.SimulatorData(
        (short) 0, date4);
    opssat.simulator.util.SimulatorData simulatorData17 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date18 = simulatorData17.getCurrentTime();
    int int19 = opssat.simulator.util.DateExtraction.getDayFromDate(date18);
    opssat.simulator.util.SimulatorData simulatorData21 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date22 = simulatorData21.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData24 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date25 = simulatorData24.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap26 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date22, date25);
    opssat.simulator.util.SimulatorHeader simulatorHeader27 =
        new opssat.simulator.util.SimulatorHeader(
            false, date18, date25);
    java.util.Date date28 = simulatorHeader27.getEndDate();
    opssat.simulator.util.SimulatorData simulatorData32 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date33 = simulatorData32.getCurrentTime();
    java.util.Date date34 = simulatorData32.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData35 = new opssat.simulator.util.SimulatorData(
        17, date34);
    opssat.simulator.util.SimulatorData simulatorData38 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date39 = simulatorData38.getCurrentTime();
    int int40 = opssat.simulator.util.DateExtraction.getDayFromDate(date39);
    opssat.simulator.util.SimulatorData simulatorData42 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date43 = simulatorData42.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData45 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date46 = simulatorData45.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap47 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date43, date46);
    opssat.simulator.util.SimulatorHeader simulatorHeader48 =
        new opssat.simulator.util.SimulatorHeader(
            false, date39, date46);
    opssat.simulator.util.SimulatorHeader simulatorHeader49 =
        new opssat.simulator.util.SimulatorHeader(
            false, date34, date39);
    simulatorHeader27.setEndDate(date34);
    simulatorData14.initFromHeader(simulatorHeader27);
    boolean boolean52 = simulatorData14.isSimulatorRunning();
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertNotNull(date11);
    org.junit.Assert.assertNotNull(timeUnitMap12);
    org.junit.Assert.assertNotNull(date18);
    org.junit.Assert.assertNotNull(date22);
    org.junit.Assert.assertNotNull(date25);
    org.junit.Assert.assertNotNull(timeUnitMap26);
    org.junit.Assert.assertNotNull(date28);
    org.junit.Assert.assertNotNull(date33);
    org.junit.Assert.assertNotNull(date34);
    org.junit.Assert.assertNotNull(date39);
    org.junit.Assert.assertNotNull(date43);
    org.junit.Assert.assertNotNull(date46);
    org.junit.Assert.assertNotNull(timeUnitMap47);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
  }

  @Test
  public void test0127() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0127");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    boolean boolean21 = simulatorHeader20.checkStartBeforeEnd();
    java.lang.String str22 = simulatorHeader20.toString();
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
  }

  @Test
  public void test0128() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0128");
    }
    long long1 = opssat.simulator.util.SimulatorSchedulerPiece.getMillisFromDDDDDHHMMSSmmm(
        "\n+0.000000 +0.000000 +0.000000\n+0.000000 +0.000000 +0.000000\n+0.000000 +0.000000 +0.000000");
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
  }

  @Test
  public void test0129() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0129");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long3 = simulatorData2.getCurrentTimeMillis();
    java.lang.String str4 = simulatorData2.getCurrentDay();
    java.lang.String str5 = simulatorData2.getUTCCurrentTime2();
    simulatorData2.toggleSimulatorRunning();
    java.lang.String str7 = simulatorData2.getUTCCurrentTime();
    java.util.Date date8 = simulatorData2.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData12 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date13 = simulatorData12.getCurrentTime();
    java.util.Date date14 = simulatorData12.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData15 = new opssat.simulator.util.SimulatorData(
        17, date14);
    opssat.simulator.util.SimulatorData simulatorData18 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date19 = simulatorData18.getCurrentTime();
    int int20 = opssat.simulator.util.DateExtraction.getDayFromDate(date19);
    opssat.simulator.util.SimulatorData simulatorData22 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date23 = simulatorData22.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData25 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date26 = simulatorData25.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap27 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date23, date26);
    opssat.simulator.util.SimulatorHeader simulatorHeader28 =
        new opssat.simulator.util.SimulatorHeader(
            false, date19, date26);
    opssat.simulator.util.SimulatorHeader simulatorHeader29 =
        new opssat.simulator.util.SimulatorHeader(
            false, date14, date19);
    opssat.simulator.util.SimulatorData simulatorData33 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date34 = simulatorData33.getCurrentTime();
    java.util.Date date35 = simulatorData33.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData36 = new opssat.simulator.util.SimulatorData(
        17, date35);
    opssat.simulator.util.SimulatorData simulatorData39 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date40 = simulatorData39.getCurrentTime();
    int int41 = opssat.simulator.util.DateExtraction.getDayFromDate(date40);
    opssat.simulator.util.SimulatorData simulatorData43 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date44 = simulatorData43.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData46 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date47 = simulatorData46.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap48 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date44, date47);
    opssat.simulator.util.SimulatorHeader simulatorHeader49 =
        new opssat.simulator.util.SimulatorHeader(
            false, date40, date47);
    opssat.simulator.util.SimulatorHeader simulatorHeader50 =
        new opssat.simulator.util.SimulatorHeader(
            false, date35, date40);
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap51 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date19, date35);
    opssat.simulator.util.SimulatorHeader simulatorHeader52 =
        new opssat.simulator.util.SimulatorHeader(
            true, date8, date35);
    int int53 = opssat.simulator.util.DateExtraction.getDayFromDate(date8);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date19);
    org.junit.Assert.assertNotNull(date23);
    org.junit.Assert.assertNotNull(date26);
    org.junit.Assert.assertNotNull(timeUnitMap27);
    org.junit.Assert.assertNotNull(date34);
    org.junit.Assert.assertNotNull(date35);
    org.junit.Assert.assertNotNull(date40);
    org.junit.Assert.assertNotNull(date44);
    org.junit.Assert.assertNotNull(date47);
    org.junit.Assert.assertNotNull(timeUnitMap48);
    org.junit.Assert.assertNotNull(timeUnitMap51);
  }

  @Test
  public void test0130() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0130");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    int int50 = opssat.simulator.util.DateExtraction.getSecondsFromDate(date38);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
  }

  @Test
  public void test0131() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0131");
    }
    opssat.simulator.util.wav.WavFileException wavFileException2 =
        new opssat.simulator.util.wav.WavFileException(
            "00000:00:00:00:010");
    opssat.simulator.util.wav.WavFileException wavFileException3 =
        new opssat.simulator.util.wav.WavFileException(
            "030939.126", wavFileException2);
  }

  @Test
  public void test0132() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0132");
    }
    try {
      opssat.simulator.orekit.GPSSatInView gPSSatInView2 = new opssat.simulator.orekit.GPSSatInView(
          "00000:00:00:05:909  56    00000:00:00:00:013  0     hi!          executed false   |  executed false   | ",
          281475010265086L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
    }
  }

  @Test
  public void test0133() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0133");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    int int50 = celestiaData32.getSeconds();
    celestiaData32.setDnx("OPS-SAT SoftSim:");
    java.lang.String str53 = celestiaData32.getAos();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState57 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double58 = simulatorSpacecraftState57.getLatitude();
    double double59 = simulatorSpacecraftState57.getLongitude();
    float[] floatArray60 = simulatorSpacecraftState57.getQ();
    celestiaData32.setQ(floatArray60);
    java.lang.String str62 = celestiaData32.getAos();
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
    org.junit.Assert.assertNull(str53);
    org.junit.Assert.assertTrue("'" + double58 + "' != '" + 340.0d + "'", double58 == 340.0d);
    org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
    org.junit.Assert.assertNotNull(floatArray60);
    org.junit.Assert.assertNull(str62);
  }

  @Test
  public void test0134() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0134");
    }
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap1 =
        opssat.simulator.util.SimulatorData
            .computeTimeUnit(281475010265078L);
    org.junit.Assert.assertNotNull(timeUnitMap1);
  }

  @Test
  public void test0135() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0135");
    }
    java.lang.Byte[] byteArray4 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList5 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean6 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList5, byteArray4);
    java.lang.Integer[] intArray9 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean11 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
    boolean boolean12 = byteList5.retainAll(intList10);
    java.lang.Integer[] intArray15 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean17 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
    int int19 = intList16.lastIndexOf((byte) 10);
    boolean boolean20 = intList10.retainAll(intList16);
    java.lang.Object obj21 = null;
    int int22 = intList10.lastIndexOf(obj21);
    boolean boolean24 = intList10.add(0);
    org.junit.Assert.assertNotNull(byteArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(intArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(intArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
  }

  @Test
  public void test0136() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0136");
    }
    org.ccsds.moims.mo.mal.structures.Time time1 = new org.ccsds.moims.mo.mal.structures.Time('4');
    org.ccsds.moims.mo.mal.structures.Identifier identifier3 =
        new org.ccsds.moims.mo.mal.structures.Identifier(
            "ASDF1337");
    org.ccsds.moims.mo.mal.structures.FineTime fineTime4 =
        new org.ccsds.moims.mo.mal.structures.FineTime();
    boolean boolean5 = identifier3.equals(fineTime4);
    org.ccsds.moims.mo.mal.structures.StringList stringList6 =
        new org.ccsds.moims.mo.mal.structures.StringList();
    opssat.simulator.threading.SimulatorNode.DevDatPBind devDatPBind7 =
        opssat.simulator.threading.SimulatorNode.DevDatPBind.FineADCS_ReactionWheels;
    boolean boolean8 = stringList6.equals(devDatPBind7);
    org.ccsds.moims.mo.mal.structures.Element element9 = stringList6.createElement();
    java.util.Iterator<java.lang.String> strItor10 = stringList6.iterator();
    boolean boolean11 = fineTime4.equals(stringList6);
    boolean boolean12 = time1.equals(stringList6);
    org.ccsds.moims.mo.mal.structures.UShort uShort13 = time1.getAreaNumber();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    int int18 = opssat.simulator.util.DateExtraction.getDayFromDate(date17);
    opssat.simulator.util.SimulatorData simulatorData20 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date21 = simulatorData20.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap25 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date21, date24);
    opssat.simulator.util.SimulatorHeader simulatorHeader26 =
        new opssat.simulator.util.SimulatorHeader(
            false, date17, date24);
    java.util.Date date27 = simulatorHeader26.getEndDate();
    boolean boolean28 = simulatorHeader26.isAutoStartSystem();
    int int29 = simulatorHeader26.getDayStartDate();
    boolean boolean30 = simulatorHeader26.isUseCelestia();
    boolean boolean31 = uShort13.equals(simulatorHeader26);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue(
        "'" + devDatPBind7 + "' != '"
        + opssat.simulator.threading.SimulatorNode.DevDatPBind.FineADCS_ReactionWheels + "'",
        devDatPBind7
            .equals(opssat.simulator.threading.SimulatorNode.DevDatPBind.FineADCS_ReactionWheels));
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(element9);
    org.junit.Assert.assertNotNull(strItor10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(uShort13);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(date21);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(timeUnitMap25);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
  }

  @Test
  public void test0137() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0137");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    java.lang.String str50 = celestiaData32.getLos();
    int int51 = celestiaData32.getYears();
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
    org.junit.Assert.assertNull(str50);
  }

  @Test
  public void test0138() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0138");
    }
    opssat.simulator.models.AbstractModel abstractModel1 =
        new opssat.simulator.models.AbstractModel(
            "opssat.simulator.util.wav.WavFileException: [0, 1]");
  }

  @Test
  public void test0139() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0139");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList3 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int4 = octetList3.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort5 = octetList3.getAreaNumber();
    java.lang.Object[] objArray6 = octetList3.toArray();
    org.ccsds.moims.mo.mal.structures.OctetList octetList7 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int8 = octetList7.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort9 = octetList7.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor10 = octetList7.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor12 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList7, "hi!");
    org.ccsds.moims.mo.mal.structures.UShort uShort13 = octetList7.getAreaNumber();
    java.lang.Boolean[] booleanArray16 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList17 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean18 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList17, booleanArray16);
    int int20 = booleanList17.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor21 = booleanList17.iterator();
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator22 = booleanList17.spliterator();
    org.ccsds.moims.mo.mal.structures.OctetList octetList23 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int24 = octetList23.getTypeShortForm();
    java.lang.Object obj25 = octetList23.clone();
    octetList23.trimToSize();
    boolean boolean27 = booleanList17.contains(octetList23);
    org.ccsds.moims.mo.mal.structures.OctetList octetList28 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int29 = octetList28.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort30 = octetList28.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList31 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int32 = octetList31.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort33 = octetList31.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet34 = octetList31.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.OctetList octetList35 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int36 = octetList35.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort37 = octetList35.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray38 =
        new org.ccsds.moims.mo.mal.structures.OctetList[]{
          octetList3, octetList7, octetList23, octetList28, octetList31, octetList35};
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray39 = octetList0
        .toArray(octetListArray38);
    octetList0.ensureCapacity(28);
    org.ccsds.moims.mo.mal.structures.UOctet uOctet42 = octetList0.getAreaVersion();
    boolean boolean44 = octetList0.equals("yyyy/MM/dd-HH:mm:ss");
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7) + "'", int4.equals((-7)));
    org.junit.Assert.assertNotNull(uShort5);
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-7) + "'", int8.equals((-7)));
    org.junit.Assert.assertNotNull(uShort9);
    org.junit.Assert.assertNotNull(byteItor10);
    org.junit.Assert.assertNotNull(uShort13);
    org.junit.Assert.assertNotNull(booleanArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    org.junit.Assert.assertNotNull(booleanItor21);
    org.junit.Assert.assertNotNull(booleanSpliterator22);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24.equals((-7)));
    org.junit.Assert.assertNotNull(obj25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-7) + "'", int29.equals((-7)));
    org.junit.Assert.assertNotNull(uShort30);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-7) + "'", int32.equals((-7)));
    org.junit.Assert.assertNotNull(uShort33);
    org.junit.Assert.assertNotNull(uOctet34);
    org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-7) + "'", int36.equals((-7)));
    org.junit.Assert.assertNotNull(uShort37);
    org.junit.Assert.assertNotNull(octetListArray38);
    org.junit.Assert.assertNotNull(octetListArray39);
    org.junit.Assert.assertNotNull(uOctet42);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
  }

  @Test
  public void test0140() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0140");
    }
    opssat.simulator.util.SimulatorTimer simulatorTimer2 = new opssat.simulator.util.SimulatorTimer(
        "3257812:10:11:27:876", 18);
    simulatorTimer2.setDuration(16);
    simulatorTimer2.setDuration((-7));
  }

  @Test
  public void test0143() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0143");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList3 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int4 = octetList3.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort5 = octetList3.getAreaNumber();
    java.lang.Object[] objArray6 = octetList3.toArray();
    org.ccsds.moims.mo.mal.structures.OctetList octetList7 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int8 = octetList7.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort9 = octetList7.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor10 = octetList7.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor12 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList7, "hi!");
    org.ccsds.moims.mo.mal.structures.UShort uShort13 = octetList7.getAreaNumber();
    java.lang.Boolean[] booleanArray16 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList17 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean18 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList17, booleanArray16);
    int int20 = booleanList17.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor21 = booleanList17.iterator();
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator22 = booleanList17.spliterator();
    org.ccsds.moims.mo.mal.structures.OctetList octetList23 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int24 = octetList23.getTypeShortForm();
    java.lang.Object obj25 = octetList23.clone();
    octetList23.trimToSize();
    boolean boolean27 = booleanList17.contains(octetList23);
    org.ccsds.moims.mo.mal.structures.OctetList octetList28 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int29 = octetList28.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort30 = octetList28.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList31 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int32 = octetList31.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort33 = octetList31.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet34 = octetList31.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.OctetList octetList35 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int36 = octetList35.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort37 = octetList35.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray38 =
        new org.ccsds.moims.mo.mal.structures.OctetList[]{
          octetList3, octetList7, octetList23, octetList28, octetList31, octetList35};
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray39 = octetList0
        .toArray(octetListArray38);
    boolean boolean40 = octetList0.isEmpty();
    java.lang.Integer int41 = octetList0.getTypeShortForm();
    java.lang.Long long42 = octetList0.getShortForm();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7) + "'", int4.equals((-7)));
    org.junit.Assert.assertNotNull(uShort5);
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-7) + "'", int8.equals((-7)));
    org.junit.Assert.assertNotNull(uShort9);
    org.junit.Assert.assertNotNull(byteItor10);
    org.junit.Assert.assertNotNull(uShort13);
    org.junit.Assert.assertNotNull(booleanArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    org.junit.Assert.assertNotNull(booleanItor21);
    org.junit.Assert.assertNotNull(booleanSpliterator22);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24.equals((-7)));
    org.junit.Assert.assertNotNull(obj25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-7) + "'", int29.equals((-7)));
    org.junit.Assert.assertNotNull(uShort30);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-7) + "'", int32.equals((-7)));
    org.junit.Assert.assertNotNull(uShort33);
    org.junit.Assert.assertNotNull(uOctet34);
    org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-7) + "'", int36.equals((-7)));
    org.junit.Assert.assertNotNull(uShort37);
    org.junit.Assert.assertNotNull(octetListArray38);
    org.junit.Assert.assertNotNull(octetListArray39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-7) + "'", int41.equals((-7)));
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + 281475010265081L + "'",
        long42.equals(281475010265081L));
  }

  @Test
  public void test0144() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0144");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    simulatorHeader12.setOrekitTLE1("");
    java.lang.String str16 = simulatorHeader12.DATE_FORMAT;
    java.lang.String str17 = simulatorHeader12.getOrekitTLE1();
    simulatorHeader12.setTimeFactor(10);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "yyyy:MM:dd HH:mm:ss z" + "'",
        str16.equals("yyyy:MM:dd HH:mm:ss z"));
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
  }

  @Test
  public void test0145() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0145");
    }
    java.util.logging.Logger logger4 = null;
    try {
      opssat.simulator.util.CommandDescriptor commandDescriptor5 =
          new opssat.simulator.util.CommandDescriptor(
              "7000.0000000",
              "00000:00:00:05:909  56    00000:00:00:00:013  0     hi!          executed false   |  executed false   | ",
              "0309", (byte) 100, logger4);
      org.junit.Assert
          .fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0146() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0146");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    java.lang.String str6 = argumentDescriptor5.getName();
    try {
      int int8 = argumentDescriptor5.getTypeAsIntByIndex(28);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [I");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
  }

  @Test
  public void test0147() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0147");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    boolean boolean16 = simulatorHeader12.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData19 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date20 = simulatorData19.getCurrentTime();
    int int21 = opssat.simulator.util.DateExtraction.getDayFromDate(date20);
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData26 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date27 = simulatorData26.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap28 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date24, date27);
    opssat.simulator.util.SimulatorHeader simulatorHeader29 =
        new opssat.simulator.util.SimulatorHeader(
            false, date20, date27);
    simulatorHeader12.setStartDate(date27);
    simulatorHeader12.setKeplerElements("-0100.0000000");
    int int33 = simulatorHeader12.getDayStartDate();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(date20);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertNotNull(timeUnitMap28);
  }

  @Test
  public void test0148() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0148");
    }
    long long1 = opssat.simulator.util.SimulatorSchedulerPiece
        .getMillisFromDDDDDHHMMSSmmm("0000.0000");
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
  }

  @Test
  public void test0149() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0149");
    }
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience8 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    double double9 = gPSSatInViewScience8.getAvgDistance();
    double double10 = gPSSatInViewScience8.getAvgDistance();
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
  }

  @Test
  public void test0150() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0150");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    boolean boolean16 = simulatorHeader12.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData19 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date20 = simulatorData19.getCurrentTime();
    int int21 = opssat.simulator.util.DateExtraction.getDayFromDate(date20);
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData26 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date27 = simulatorData26.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap28 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date24, date27);
    opssat.simulator.util.SimulatorHeader simulatorHeader29 =
        new opssat.simulator.util.SimulatorHeader(
            false, date20, date27);
    simulatorHeader12.setStartDate(date27);
    boolean boolean31 = simulatorHeader12.isAutoStartTime();
    simulatorHeader12.setUpdateInternet(true);
    java.util.Date date34 = simulatorHeader12.getEndDate();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(date20);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertNotNull(timeUnitMap28);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(date34);
  }

  @Test
  public void test0151() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0151");
    }
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece3 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            13L, 0, "hi!");
    long long4 = simulatorSchedulerPiece3.getTime();
    int int5 = simulatorSchedulerPiece3.getInternalID();
    java.lang.String str6 = simulatorSchedulerPiece3.getFileString();
    java.lang.String str7 = simulatorSchedulerPiece3.getFileString();
    simulatorSchedulerPiece3.setExecuted(true);
    java.lang.String str10 = simulatorSchedulerPiece3.getArgumentTemplateDescription();
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 13L + "'", long4 == 13L);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertTrue(
        "'" + str6 + "' != '" + "00000:00:00:00:013|0000000000000000013|0|hi!" + "'",
        str6.equals("00000:00:00:00:013|0000000000000000013|0|hi!"));
    org.junit.Assert.assertTrue(
        "'" + str7 + "' != '" + "00000:00:00:00:013|0000000000000000013|0|hi!" + "'",
        str7.equals("00000:00:00:00:013|0000000000000000013|0|hi!"));
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
  }

  @Test
  public void test0152() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0152");
    }
    java.math.BigInteger bigInteger0 = org.ccsds.moims.mo.mal.structures.ULong.MAX_VALUE;
    org.ccsds.moims.mo.mal.structures.ULong uLong1 = new org.ccsds.moims.mo.mal.structures.ULong(
        bigInteger0);
    java.lang.String str2 = uLong1.toString();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet3 = uLong1.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.Element element4 = uLong1.createElement();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet5 = uLong1.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.OctetList octetList6 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int7 = octetList6.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort8 = octetList6.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet9 = octetList6.getAreaVersion();
    opssat.simulator.util.wav.WavFileException wavFileException11 =
        new opssat.simulator.util.wav.WavFileException(
            "UnknownGUIData");
    java.lang.Throwable[] throwableArray12 = wavFileException11.getSuppressed();
    boolean boolean13 = octetList6.equals(wavFileException11);
    org.ccsds.moims.mo.mal.structures.FloatList floatList15 =
        new org.ccsds.moims.mo.mal.structures.FloatList(
            (byte) 0);
    java.lang.Integer int16 = floatList15.getTypeShortForm();
    java.lang.Integer int17 = floatList15.getTypeShortForm();
    floatList15.clear();
    boolean boolean19 = octetList6.remove(floatList15);
    java.util.ListIterator<java.lang.Float> floatItor20 = floatList15.listIterator();
    org.ccsds.moims.mo.mal.structures.UShort uShort21 = floatList15.getAreaNumber();
    boolean boolean22 = uLong1.equals(floatList15);
    org.ccsds.moims.mo.mal.structures.UShort uShort23 = uLong1.getServiceNumber();
    org.junit.Assert.assertNotNull(bigInteger0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "18446744073709551615" + "'",
        str2.equals("18446744073709551615"));
    org.junit.Assert.assertNotNull(uOctet3);
    org.junit.Assert.assertNotNull(element4);
    org.junit.Assert.assertNotNull(uOctet5);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7.equals((-7)));
    org.junit.Assert.assertNotNull(uShort8);
    org.junit.Assert.assertNotNull(uOctet9);
    org.junit.Assert.assertNotNull(throwableArray12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-4) + "'", int16.equals((-4)));
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-4) + "'", int17.equals((-4)));
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(floatItor20);
    org.junit.Assert.assertNotNull(uShort21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(uShort23);
  }

  @Test
  public void test0153() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0153");
    }
    opssat.simulator.util.LoggerFormatter1Line loggerFormatter1Line1 =
        new opssat.simulator.util.LoggerFormatter1Line(
            "030937.129");
  }

  @Test
  public void test0155() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0155");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    simulatorData1.setCounter((-1));
    simulatorData1.feedTimeElapsed(21);
    java.lang.String str6 = simulatorData1.getCurrentDay();
    boolean boolean7 = simulatorData1.isTimeRunning();
    boolean boolean8 = simulatorData1.isSimulatorRunning();
    simulatorData1.toggleTimeRunning();
    long long10 = simulatorData1.getCurrentTimeMillis();
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
  }

  @Test
  public void test0156() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0156");
    }
    org.ccsds.moims.mo.mal.structures.DoubleList doubleList0 =
        new org.ccsds.moims.mo.mal.structures.DoubleList();
    java.util.stream.Stream<java.lang.Double> doubleStream1 = doubleList0.parallelStream();
    org.ccsds.moims.mo.mal.structures.StringList stringList2 =
        new org.ccsds.moims.mo.mal.structures.StringList();
    java.util.Iterator<java.lang.String> strItor3 = stringList2.iterator();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet4 = stringList2.getAreaVersion();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState8 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray11 = new float[]{28, 8};
    simulatorSpacecraftState8.setQ(floatArray11);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState16 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double17 = simulatorSpacecraftState16.getLatitude();
    java.lang.String str18 = simulatorSpacecraftState16.getMagField();
    float[] floatArray19 = simulatorSpacecraftState16.getR();
    simulatorSpacecraftState8.setQ(floatArray19);
    java.lang.String str21 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray19);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState25 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double26 = simulatorSpacecraftState25.getLatitude();
    double double27 = simulatorSpacecraftState25.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState31 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double32 = simulatorSpacecraftState31.getLatitude();
    java.lang.String str33 = simulatorSpacecraftState31.getMagField();
    float[] floatArray34 = simulatorSpacecraftState31.getR();
    simulatorSpacecraftState25.setQ(floatArray34);
    float[] floatArray36 = simulatorSpacecraftState25.getV();
    opssat.simulator.celestia.CelestiaData celestiaData37 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray19, floatArray36);
    float[] floatArray38 = celestiaData37.getQ();
    opssat.simulator.util.SimulatorData simulatorData42 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date43 = simulatorData42.getCurrentTime();
    int int44 = opssat.simulator.util.DateExtraction.getDayFromDate(date43);
    opssat.simulator.util.SimulatorData simulatorData46 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date47 = simulatorData46.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData49 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date50 = simulatorData49.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap51 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date47, date50);
    opssat.simulator.util.SimulatorHeader simulatorHeader52 =
        new opssat.simulator.util.SimulatorHeader(
            false, date43, date50);
    opssat.simulator.util.SimulatorData simulatorData53 = new opssat.simulator.util.SimulatorData(
        (short) 0, date43);
    celestiaData37.setDate(date43);
    int int55 = celestiaData37.getSeconds();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState59 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray62 = new float[]{28, 8};
    simulatorSpacecraftState59.setQ(floatArray62);
    celestiaData37.setQ(floatArray62);
    int int65 = stringList2.lastIndexOf(celestiaData37);
    celestiaData37.setDate("00000:00:00:00:097  11                 executed false   | ");
    int int68 = doubleList0
        .lastIndexOf("00000:00:00:00:097  11                 executed false   | ");
    org.junit.Assert.assertNotNull(doubleStream1);
    org.junit.Assert.assertNotNull(strItor3);
    org.junit.Assert.assertNotNull(uOctet4);
    org.junit.Assert.assertNotNull(floatArray11);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 340.0d + "'", double17 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str18 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str18.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray19);
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "UnknownGUIData" + "'",
        str21.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 340.0d + "'", double26 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 340.0d + "'", double32 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str33 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str33.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray34);
    org.junit.Assert.assertNotNull(floatArray36);
    org.junit.Assert.assertNotNull(floatArray38);
    org.junit.Assert.assertNotNull(date43);
    org.junit.Assert.assertNotNull(date47);
    org.junit.Assert.assertNotNull(date50);
    org.junit.Assert.assertNotNull(timeUnitMap51);
    org.junit.Assert.assertNotNull(floatArray62);
    org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
  }

  @Test
  public void test0157() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0157");
    }
    org.ccsds.moims.mo.mal.structures.Identifier identifier0 =
        new org.ccsds.moims.mo.mal.structures.Identifier();
    org.ccsds.moims.mo.mal.structures.OctetList octetList1 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int2 = octetList1.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort3 = octetList1.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor4 = octetList1.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor6 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList1, "hi!");
    argumentDescriptor6.restoreArgument();
    argumentDescriptor6.restoreArgument();
    argumentDescriptor6.restoreArgument();
    java.lang.String str10 = argumentDescriptor6.toString();
    boolean boolean11 = identifier0.equals(str10);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState15 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray18 = new float[]{28, 8};
    simulatorSpacecraftState15.setQ(floatArray18);
    float[] floatArray20 = simulatorSpacecraftState15.getQ();
    double double21 = simulatorSpacecraftState15.getLongitude();
    boolean boolean22 = identifier0.equals(simulatorSpacecraftState15);
    float[] floatArray23 = simulatorSpacecraftState15.getQ();
    double double24 = simulatorSpacecraftState15.getLongitude();
    java.lang.String str25 = simulatorSpacecraftState15.toString();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2.equals((-7)));
    org.junit.Assert.assertNotNull(uShort3);
    org.junit.Assert.assertNotNull(byteItor4);
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(floatArray18);
    org.junit.Assert.assertNotNull(floatArray20);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(floatArray23);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    org.junit.Assert.assertTrue(
        "'" + str25 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str25.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
  }

  @Test
  public void test0158() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0158");
    }
    try {
      opssat.simulator.orekit.GPSSatInView gPSSatInView2 = new opssat.simulator.orekit.GPSSatInView(
          "01700.0000000", (-1L));
      org.junit.Assert.fail(
          "Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
    }
  }

  @Test
  public void test0159() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0159");
    }
    org.ccsds.moims.mo.mal.structures.URI uRI1 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    java.lang.Integer int2 = uRI1.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.URI uRI4 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.UOctet uOctet5 = uRI4.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.URI uRI7 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.URI[] uRIArray8 = new org.ccsds.moims.mo.mal.structures.URI[]{
      uRI1, uRI4, uRI7};
    java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI> uRIList9 =
        new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI>();
    boolean boolean10 = java.util.Collections
        .addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.URI>) uRIList9, uRIArray8);
    org.ccsds.moims.mo.mal.structures.FineTime fineTime11 =
        new org.ccsds.moims.mo.mal.structures.FineTime();
    int int12 = uRIList9.indexOf(fineTime11);
    uRIList9.ensureCapacity(40);
    java.lang.Object obj15 = uRIList9.clone();
    org.ccsds.moims.mo.mal.structures.URI uRI18 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.UOctet uOctet19 = uRI18.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.URI uRI20 = uRIList9.set((byte) 1, uRI18);
    java.lang.Long long21 = uRI18.getShortForm();
    org.ccsds.moims.mo.mal.structures.OctetList octetList22 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int23 = octetList22.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort24 = octetList22.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor25 = octetList22.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor27 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList22, "hi!");
    org.ccsds.moims.mo.mal.structures.UShort uShort28 = octetList22.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UShort uShort29 = octetList22.getAreaNumber();
    boolean boolean30 = uRI18.equals(octetList22);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2.equals(18));
    org.junit.Assert.assertNotNull(uOctet5);
    org.junit.Assert.assertNotNull(uRIArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    org.junit.Assert.assertNotNull(obj15);
    org.junit.Assert.assertNotNull(uOctet19);
    org.junit.Assert.assertNotNull(uRI20);
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 281474993487890L + "'",
        long21.equals(281474993487890L));
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-7) + "'", int23.equals((-7)));
    org.junit.Assert.assertNotNull(uShort24);
    org.junit.Assert.assertNotNull(byteItor25);
    org.junit.Assert.assertNotNull(uShort28);
    org.junit.Assert.assertNotNull(uShort29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
  }

  @Test
  public void test0160() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0160");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    simulatorHeader12.setOrekitTLE1("");
    java.lang.String str16 = simulatorHeader12.DATE_FORMAT;
    int int17 = simulatorHeader12.getSecondStartDate();
    int int18 = simulatorHeader12.getTimeFactor();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "yyyy:MM:dd HH:mm:ss z" + "'",
        str16.equals("yyyy:MM:dd HH:mm:ss z"));
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
  }

  @Test
  public void test0161() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0161");
    }
    boolean boolean1 = opssat.simulator.tcp.SocketClient.validIP("2019:05:23 15:09:31 UTC");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
  }

  @Test
  public void test0163() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0163");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long3 = simulatorData2.getCurrentTimeMillis();
    java.lang.String str4 = simulatorData2.getCurrentDay();
    java.lang.String str5 = simulatorData2.getUTCCurrentTime2();
    simulatorData2.toggleSimulatorRunning();
    java.lang.String str7 = simulatorData2.getUTCCurrentTime();
    java.util.Date date8 = simulatorData2.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData12 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date13 = simulatorData12.getCurrentTime();
    java.util.Date date14 = simulatorData12.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData15 = new opssat.simulator.util.SimulatorData(
        17, date14);
    opssat.simulator.util.SimulatorData simulatorData18 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date19 = simulatorData18.getCurrentTime();
    int int20 = opssat.simulator.util.DateExtraction.getDayFromDate(date19);
    opssat.simulator.util.SimulatorData simulatorData22 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date23 = simulatorData22.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData25 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date26 = simulatorData25.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap27 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date23, date26);
    opssat.simulator.util.SimulatorHeader simulatorHeader28 =
        new opssat.simulator.util.SimulatorHeader(
            false, date19, date26);
    opssat.simulator.util.SimulatorHeader simulatorHeader29 =
        new opssat.simulator.util.SimulatorHeader(
            false, date14, date19);
    opssat.simulator.util.SimulatorData simulatorData33 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date34 = simulatorData33.getCurrentTime();
    java.util.Date date35 = simulatorData33.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData36 = new opssat.simulator.util.SimulatorData(
        17, date35);
    opssat.simulator.util.SimulatorData simulatorData39 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date40 = simulatorData39.getCurrentTime();
    int int41 = opssat.simulator.util.DateExtraction.getDayFromDate(date40);
    opssat.simulator.util.SimulatorData simulatorData43 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date44 = simulatorData43.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData46 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date47 = simulatorData46.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap48 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date44, date47);
    opssat.simulator.util.SimulatorHeader simulatorHeader49 =
        new opssat.simulator.util.SimulatorHeader(
            false, date40, date47);
    opssat.simulator.util.SimulatorHeader simulatorHeader50 =
        new opssat.simulator.util.SimulatorHeader(
            false, date35, date40);
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap51 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date19, date35);
    opssat.simulator.util.SimulatorHeader simulatorHeader52 =
        new opssat.simulator.util.SimulatorHeader(
            true, date8, date35);
    opssat.simulator.util.SimulatorData simulatorData55 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date56 = simulatorData55.getCurrentTime();
    int int57 = opssat.simulator.util.DateExtraction.getDayFromDate(date56);
    opssat.simulator.util.SimulatorData simulatorData59 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date60 = simulatorData59.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData62 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date63 = simulatorData62.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap64 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date60, date63);
    opssat.simulator.util.SimulatorHeader simulatorHeader65 =
        new opssat.simulator.util.SimulatorHeader(
            false, date56, date63);
    simulatorHeader52.setStartDate(date63);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date19);
    org.junit.Assert.assertNotNull(date23);
    org.junit.Assert.assertNotNull(date26);
    org.junit.Assert.assertNotNull(timeUnitMap27);
    org.junit.Assert.assertNotNull(date34);
    org.junit.Assert.assertNotNull(date35);
    org.junit.Assert.assertNotNull(date40);
    org.junit.Assert.assertNotNull(date44);
    org.junit.Assert.assertNotNull(date47);
    org.junit.Assert.assertNotNull(timeUnitMap48);
    org.junit.Assert.assertNotNull(timeUnitMap51);
    org.junit.Assert.assertNotNull(date56);
    org.junit.Assert.assertNotNull(date60);
    org.junit.Assert.assertNotNull(date63);
    org.junit.Assert.assertNotNull(timeUnitMap64);
  }

  @Test
  public void test0164() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0164");
    }
    org.ccsds.moims.mo.mal.structures.StringList stringList0 =
        new org.ccsds.moims.mo.mal.structures.StringList();
    java.util.Iterator<java.lang.String> strItor1 = stringList0.iterator();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet2 = stringList0.getAreaVersion();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState6 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray9 = new float[]{28, 8};
    simulatorSpacecraftState6.setQ(floatArray9);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState14 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double15 = simulatorSpacecraftState14.getLatitude();
    java.lang.String str16 = simulatorSpacecraftState14.getMagField();
    float[] floatArray17 = simulatorSpacecraftState14.getR();
    simulatorSpacecraftState6.setQ(floatArray17);
    java.lang.String str19 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray17);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState23 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double24 = simulatorSpacecraftState23.getLatitude();
    double double25 = simulatorSpacecraftState23.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState29 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double30 = simulatorSpacecraftState29.getLatitude();
    java.lang.String str31 = simulatorSpacecraftState29.getMagField();
    float[] floatArray32 = simulatorSpacecraftState29.getR();
    simulatorSpacecraftState23.setQ(floatArray32);
    float[] floatArray34 = simulatorSpacecraftState23.getV();
    opssat.simulator.celestia.CelestiaData celestiaData35 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray17, floatArray34);
    float[] floatArray36 = celestiaData35.getQ();
    opssat.simulator.util.SimulatorData simulatorData40 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date41 = simulatorData40.getCurrentTime();
    int int42 = opssat.simulator.util.DateExtraction.getDayFromDate(date41);
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData47 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date48 = simulatorData47.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap49 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date45, date48);
    opssat.simulator.util.SimulatorHeader simulatorHeader50 =
        new opssat.simulator.util.SimulatorHeader(
            false, date41, date48);
    opssat.simulator.util.SimulatorData simulatorData51 = new opssat.simulator.util.SimulatorData(
        (short) 0, date41);
    celestiaData35.setDate(date41);
    int int53 = celestiaData35.getSeconds();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState57 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray60 = new float[]{28, 8};
    simulatorSpacecraftState57.setQ(floatArray60);
    celestiaData35.setQ(floatArray60);
    int int63 = stringList0.lastIndexOf(celestiaData35);
    stringList0.trimToSize();
    org.junit.Assert.assertNotNull(strItor1);
    org.junit.Assert.assertNotNull(uOctet2);
    org.junit.Assert.assertNotNull(floatArray9);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 340.0d + "'", double15 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str16 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str16.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray17);
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "UnknownGUIData" + "'",
        str19.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 340.0d + "'", double24 == 340.0d);
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 340.0d + "'", double25 == 340.0d);
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 340.0d + "'", double30 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str31 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str31.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray32);
    org.junit.Assert.assertNotNull(floatArray34);
    org.junit.Assert.assertNotNull(floatArray36);
    org.junit.Assert.assertNotNull(date41);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(date48);
    org.junit.Assert.assertNotNull(timeUnitMap49);
    org.junit.Assert.assertNotNull(floatArray60);
    org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
  }

  @Test
  public void test0165() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0165");
    }
    long long1 = opssat.simulator.util.SimulatorSchedulerPiece
        .getMillisFromDDDDDHHMMSSmmm("030932.764");
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
  }

  @Test
  public void test0167() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0167");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    int int50 = celestiaData32.getSeconds();
    int int51 = celestiaData32.getDays();
    try {
      java.lang.String str52 = celestiaData32.toString();
      org.junit.Assert
          .fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
  }

  @Test
  public void test0168() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0168");
    }
    java.lang.String str1 = opssat.simulator.threading.SimulatorNode
        .calcNMEAChecksum("X:[+00000.00] ; Y:[+00000.00] ; Z: [+00000.00] units [nT]");
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "*63" + "'", str1.equals("*63"));
  }

  @Test
  public void test0169() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0169");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.restoreArgument();
    java.lang.String str9 = argumentDescriptor5.toString();
    try {
      argumentDescriptor5.setFloatTypeByIndex(42, 21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [F");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
  }

  @Test
  public void test0170() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0170");
    }
    java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList3 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean4 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
    int int6 = booleanList3.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor7 = booleanList3.iterator();
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator8 = booleanList3.spliterator();
    java.lang.Integer[] intArray16 = new java.lang.Integer[]{13, 10, 100, 100, 11111, 13, 11111};
    java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean18 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
    java.lang.Byte[] byteArray23 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList24 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean25 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList24, byteArray23);
    java.lang.Integer[] intArray28 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean30 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
    boolean boolean31 = byteList24.retainAll(intList29);
    java.lang.Integer[] intArray34 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList35 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean36 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
    int int38 = intList35.lastIndexOf((byte) 10);
    boolean boolean39 = intList29.removeAll(intList35);
    boolean boolean40 = intList17.retainAll(intList35);
    java.lang.Float[] floatArray44 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList45 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean46 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList45, floatArray44);
    boolean boolean48 = floatList45.add((-1.0f));
    floatList45.trimToSize();
    java.lang.Integer[] intArray54 = new java.lang.Integer[]{100, 1, (-1), 10};
    java.util.ArrayList<java.lang.Integer> intList55 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean56 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
    int int58 = intList55.lastIndexOf((byte) 1);
    boolean boolean59 = floatList45.containsAll(intList55);
    boolean boolean60 = intList17.addAll(intList55);
    boolean boolean61 = booleanList3.removeAll(intList17);
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor63 =
        new opssat.simulator.util.ArgumentDescriptor(
            boolean61, "0.0");
    try {
      argumentDescriptor63.setIntTypeByIndex(31, 11111);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to [I");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNotNull(booleanArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    org.junit.Assert.assertNotNull(booleanItor7);
    org.junit.Assert.assertNotNull(booleanSpliterator8);
    org.junit.Assert.assertNotNull(intArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertNotNull(byteArray23);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertNotNull(intArray28);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    org.junit.Assert.assertNotNull(intArray34);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(floatArray44);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    org.junit.Assert.assertNotNull(intArray54);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
  }

  @Test
  public void test0172() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0172");
    }
    java.lang.Byte[] byteArray2 = new java.lang.Byte[]{(byte) 100, (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList3 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean4 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList3, byteArray2);
    java.util.Iterator<java.lang.Byte> byteItor5 = byteList3.iterator();
    java.lang.Byte[] byteArray10 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList11 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean12 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList11, byteArray10);
    java.lang.Integer[] intArray15 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean17 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
    boolean boolean18 = byteList11.retainAll(intList16);
    java.lang.Integer[] intArray21 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean23 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
    int int25 = intList22.lastIndexOf((byte) 10);
    boolean boolean26 = intList16.removeAll(intList22);
    intList22.ensureCapacity(48);
    boolean boolean29 = byteList3.retainAll(intList22);
    byteList3.ensureCapacity(56);
    org.junit.Assert.assertNotNull(byteArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(byteItor5);
    org.junit.Assert.assertNotNull(byteArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(intArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertNotNull(intArray21);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
  }

  @Test
  public void test0173() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0173");
    }
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece3 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            19, 'a', "-0500.0000000");
    int int4 = simulatorSchedulerPiece3.getInternalID();
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
  }

  @Test
  public void test0174() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0174");
    }
    java.lang.String str1 = opssat.simulator.threading.SimulatorNode
        .calcNMEAChecksum("281474993487885");
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "*03" + "'", str1.equals("*03"));
  }

  @Test
  public void test0175() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0175");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    simulatorHeader12.setOrekitTLE1("");
    java.util.Date date17 = simulatorHeader12.parseStringIntoDate("2019/05/23-15:09:35");
    java.lang.String str18 = simulatorHeader12.toFileString();
    java.util.Date date19 = simulatorHeader12.getEndDate();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState23 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray26 = new float[]{28, 8};
    simulatorSpacecraftState23.setQ(floatArray26);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState31 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double32 = simulatorSpacecraftState31.getLatitude();
    java.lang.String str33 = simulatorSpacecraftState31.getMagField();
    float[] floatArray34 = simulatorSpacecraftState31.getR();
    simulatorSpacecraftState23.setQ(floatArray34);
    java.lang.String str36 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray34);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState40 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double41 = simulatorSpacecraftState40.getLatitude();
    double double42 = simulatorSpacecraftState40.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState46 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double47 = simulatorSpacecraftState46.getLatitude();
    java.lang.String str48 = simulatorSpacecraftState46.getMagField();
    float[] floatArray49 = simulatorSpacecraftState46.getR();
    simulatorSpacecraftState40.setQ(floatArray49);
    float[] floatArray51 = simulatorSpacecraftState40.getV();
    opssat.simulator.celestia.CelestiaData celestiaData52 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray34, floatArray51);
    float[] floatArray53 = celestiaData52.getQ();
    opssat.simulator.util.SimulatorData simulatorData57 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date58 = simulatorData57.getCurrentTime();
    int int59 = opssat.simulator.util.DateExtraction.getDayFromDate(date58);
    opssat.simulator.util.SimulatorData simulatorData61 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date62 = simulatorData61.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData64 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date65 = simulatorData64.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap66 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date62, date65);
    opssat.simulator.util.SimulatorHeader simulatorHeader67 =
        new opssat.simulator.util.SimulatorHeader(
            false, date58, date65);
    opssat.simulator.util.SimulatorData simulatorData68 = new opssat.simulator.util.SimulatorData(
        (short) 0, date58);
    celestiaData52.setDate(date58);
    int int70 = celestiaData52.getMonths();
    int int71 = celestiaData52.getMinutes();
    opssat.simulator.util.SimulatorData simulatorData74 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date75 = simulatorData74.getCurrentTime();
    java.util.Date date76 = simulatorData74.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData77 = new opssat.simulator.util.SimulatorData(
        17, date76);
    celestiaData52.setDate(date76);
    simulatorHeader12.setEndDate(date76);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertNull(date17);
    org.junit.Assert.assertNotNull(date19);
    org.junit.Assert.assertNotNull(floatArray26);
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 340.0d + "'", double32 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str33 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str33.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray34);
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "UnknownGUIData" + "'",
        str36.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + 340.0d + "'", double41 == 340.0d);
    org.junit.Assert.assertTrue("'" + double42 + "' != '" + 340.0d + "'", double42 == 340.0d);
    org.junit.Assert.assertTrue("'" + double47 + "' != '" + 340.0d + "'", double47 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str48 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str48.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray49);
    org.junit.Assert.assertNotNull(floatArray51);
    org.junit.Assert.assertNotNull(floatArray53);
    org.junit.Assert.assertNotNull(date58);
    org.junit.Assert.assertNotNull(date62);
    org.junit.Assert.assertNotNull(date65);
    org.junit.Assert.assertNotNull(timeUnitMap66);
    org.junit.Assert.assertNotNull(date75);
    org.junit.Assert.assertNotNull(date76);
  }

  @Test
  public void test0176() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0176");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.lang.String str13 = simulatorHeader12.getEndDateString();
    int int14 = simulatorHeader12.getTimeFactor();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
  }

  @Test
  public void test0177() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0177");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    simulatorHeader12.setOrekitTLE1("");
    java.lang.String str16 = simulatorHeader12.DATE_FORMAT;
    simulatorHeader12.setUseCelestia(true);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "yyyy:MM:dd HH:mm:ss z" + "'",
        str16.equals("yyyy:MM:dd HH:mm:ss z"));
  }

  @Test
  public void test0178() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0178");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    java.lang.String str5 = simulatorSpacecraftState3.getMagField();
    java.lang.String str6 = simulatorSpacecraftState3.getSunVectorAsString();
    simulatorSpacecraftState3.setAltitude(14.0d);
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str5 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str5.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str6 + "' != '" + "X:[+.00000] ; Y:[+.00000] ; Z: [+.00000] units [N/A]" + "'",
        str6.equals("X:[+.00000] ; Y:[+.00000] ; Z: [+.00000] units [N/A]"));
  }

  @Test
  public void test0179() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0179");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList3 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int4 = octetList3.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort5 = octetList3.getAreaNumber();
    java.lang.Object[] objArray6 = octetList3.toArray();
    org.ccsds.moims.mo.mal.structures.OctetList octetList7 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int8 = octetList7.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort9 = octetList7.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor10 = octetList7.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor12 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList7, "hi!");
    org.ccsds.moims.mo.mal.structures.UShort uShort13 = octetList7.getAreaNumber();
    java.lang.Boolean[] booleanArray16 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList17 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean18 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList17, booleanArray16);
    int int20 = booleanList17.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor21 = booleanList17.iterator();
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator22 = booleanList17.spliterator();
    org.ccsds.moims.mo.mal.structures.OctetList octetList23 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int24 = octetList23.getTypeShortForm();
    java.lang.Object obj25 = octetList23.clone();
    octetList23.trimToSize();
    boolean boolean27 = booleanList17.contains(octetList23);
    org.ccsds.moims.mo.mal.structures.OctetList octetList28 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int29 = octetList28.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort30 = octetList28.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList31 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int32 = octetList31.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort33 = octetList31.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet34 = octetList31.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.OctetList octetList35 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int36 = octetList35.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort37 = octetList35.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray38 =
        new org.ccsds.moims.mo.mal.structures.OctetList[]{
          octetList3, octetList7, octetList23, octetList28, octetList31, octetList35};
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray39 = octetList0
        .toArray(octetListArray38);
    octetList0.ensureCapacity(28);
    org.ccsds.moims.mo.mal.structures.UOctet uOctet42 = octetList0.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.UShort uShort43 = uOctet42.getServiceNumber();
    org.ccsds.moims.mo.mal.structures.Element element44 = uOctet42.createElement();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7) + "'", int4.equals((-7)));
    org.junit.Assert.assertNotNull(uShort5);
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-7) + "'", int8.equals((-7)));
    org.junit.Assert.assertNotNull(uShort9);
    org.junit.Assert.assertNotNull(byteItor10);
    org.junit.Assert.assertNotNull(uShort13);
    org.junit.Assert.assertNotNull(booleanArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    org.junit.Assert.assertNotNull(booleanItor21);
    org.junit.Assert.assertNotNull(booleanSpliterator22);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24.equals((-7)));
    org.junit.Assert.assertNotNull(obj25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-7) + "'", int29.equals((-7)));
    org.junit.Assert.assertNotNull(uShort30);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-7) + "'", int32.equals((-7)));
    org.junit.Assert.assertNotNull(uShort33);
    org.junit.Assert.assertNotNull(uOctet34);
    org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-7) + "'", int36.equals((-7)));
    org.junit.Assert.assertNotNull(uShort37);
    org.junit.Assert.assertNotNull(octetListArray38);
    org.junit.Assert.assertNotNull(octetListArray39);
    org.junit.Assert.assertNotNull(uOctet42);
    org.junit.Assert.assertNotNull(uShort43);
    org.junit.Assert.assertNotNull(element44);
  }

  @Test
  public void test0180() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0180");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet3 = octetList0.getAreaVersion();
    opssat.simulator.util.wav.WavFileException wavFileException5 =
        new opssat.simulator.util.wav.WavFileException(
            "UnknownGUIData");
    java.lang.Throwable[] throwableArray6 = wavFileException5.getSuppressed();
    boolean boolean7 = octetList0.equals(wavFileException5);
    org.ccsds.moims.mo.mal.structures.FloatList floatList9 =
        new org.ccsds.moims.mo.mal.structures.FloatList(
            (byte) 0);
    java.lang.Integer int10 = floatList9.getTypeShortForm();
    java.lang.Integer int11 = floatList9.getTypeShortForm();
    floatList9.clear();
    boolean boolean13 = octetList0.remove(floatList9);
    java.lang.Object obj14 = octetList0.clone();
    org.ccsds.moims.mo.mal.structures.StringList stringList15 =
        new org.ccsds.moims.mo.mal.structures.StringList();
    org.ccsds.moims.mo.mal.structures.ShortList shortList17 =
        new org.ccsds.moims.mo.mal.structures.ShortList(
            ' ');
    java.util.ListIterator<java.lang.Short> shortItor18 = shortList17.listIterator();
    boolean boolean19 = stringList15.equals(shortList17);
    boolean boolean20 = shortList17.isEmpty();
    org.ccsds.moims.mo.mal.structures.UShort uShort21 = shortList17.getServiceNumber();
    java.lang.Short[] shortArray24 = new java.lang.Short[]{(short) 1, (short) 1};
    java.util.ArrayList<java.lang.Short> shortList25 = new java.util.ArrayList<java.lang.Short>();
    boolean boolean26 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Short>) shortList25, shortArray24);
    shortList25.clear();
    boolean boolean28 = shortList25.isEmpty();
    boolean boolean30 = shortList25.equals(5);
    org.ccsds.moims.mo.mal.structures.StringList stringList31 =
        new org.ccsds.moims.mo.mal.structures.StringList();
    org.ccsds.moims.mo.mal.structures.ShortList shortList33 =
        new org.ccsds.moims.mo.mal.structures.ShortList(
            ' ');
    java.util.ListIterator<java.lang.Short> shortItor34 = shortList33.listIterator();
    boolean boolean35 = stringList31.equals(shortList33);
    java.lang.Integer int36 = stringList31.getTypeShortForm();
    int int37 = shortList25.indexOf(int36);
    boolean boolean38 = shortList17.equals(shortList25);
    java.lang.Byte[] byteArray43 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList44 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean45 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList44, byteArray43);
    java.lang.Integer[] intArray48 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList49 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean50 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
    boolean boolean51 = byteList44.retainAll(intList49);
    java.lang.Integer[] intArray54 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList55 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean56 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
    int int58 = intList55.lastIndexOf((byte) 10);
    boolean boolean59 = intList49.removeAll(intList55);
    java.util.Spliterator<java.lang.Integer> intSpliterator60 = intList49.spliterator();
    java.util.Iterator<java.lang.Integer> intItor61 = intList49.iterator();
    boolean boolean62 = shortList25.retainAll(intList49);
    boolean boolean63 = octetList0.retainAll(intList49);
    try {
      java.lang.Byte byte65 = octetList0.get(31);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 31, Size: 0");
    } catch (java.lang.IndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(uOctet3);
    org.junit.Assert.assertNotNull(throwableArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10.equals((-4)));
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-4) + "'", int11.equals((-4)));
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(obj14);
    org.junit.Assert.assertNotNull(shortItor18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNotNull(uShort21);
    org.junit.Assert.assertNotNull(shortArray24);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(shortItor34);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-15) + "'", int36.equals((-15)));
    org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertNotNull(byteArray43);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertNotNull(intArray48);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    org.junit.Assert.assertNotNull(intArray54);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    org.junit.Assert.assertNotNull(intSpliterator60);
    org.junit.Assert.assertNotNull(intItor61);
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
  }

  @Test
  public void test0181() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0181");
    }
    java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[]{true};
    java.util.ArrayList<java.lang.Boolean> booleanList2 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean3 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator4 = booleanList2.spliterator();
    java.lang.Byte[] byteArray9 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList10 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean11 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList10, byteArray9);
    java.lang.Integer[] intArray14 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean16 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
    boolean boolean17 = byteList10.retainAll(intList15);
    java.lang.Integer[] intArray25 = new java.lang.Integer[]{13, 10, 100, 100, 11111, 13, 11111};
    java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean27 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
    java.lang.Byte[] byteArray32 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList33 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean34 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList33, byteArray32);
    java.lang.Integer[] intArray37 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean39 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
    boolean boolean40 = byteList33.retainAll(intList38);
    java.lang.Integer[] intArray43 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean45 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
    int int47 = intList44.lastIndexOf((byte) 10);
    boolean boolean48 = intList38.removeAll(intList44);
    boolean boolean49 = intList26.retainAll(intList44);
    java.lang.Float[] floatArray53 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList54 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean55 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList54, floatArray53);
    boolean boolean57 = floatList54.add((-1.0f));
    floatList54.trimToSize();
    java.lang.Integer[] intArray63 = new java.lang.Integer[]{100, 1, (-1), 10};
    java.util.ArrayList<java.lang.Integer> intList64 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean65 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
    int int67 = intList64.lastIndexOf((byte) 1);
    boolean boolean68 = floatList54.containsAll(intList64);
    boolean boolean69 = intList26.addAll(intList64);
    boolean boolean70 = intList15.retainAll(intList26);
    boolean boolean71 = booleanList2.equals(intList26);
    java.util.ListIterator<java.lang.Boolean> booleanItor72 = booleanList2.listIterator();
    opssat.simulator.util.SimulatorData simulatorData74 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date75 = simulatorData74.getCurrentTime();
    java.util.Date date76 = simulatorData74.getCurrentTime();
    int int77 = simulatorData74.getTimeFactor();
    int int78 = booleanList2.indexOf(int77);
    boolean boolean79 = booleanList2.isEmpty();
    java.lang.Long[] longArray86 = new java.lang.Long[]{281475010265070L, 100L, 0L,
      281475010265070L, 281475010265070L, 1L};
    java.util.ArrayList<java.lang.Long> longList87 = new java.util.ArrayList<java.lang.Long>();
    boolean boolean88 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Long>) longList87, longArray86);
    boolean boolean89 = longList87.isEmpty();
    java.util.Iterator<java.lang.Long> longItor90 = longList87.iterator();
    int int91 = booleanList2.indexOf(longItor90);
    org.junit.Assert.assertNotNull(booleanArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(booleanSpliterator4);
    org.junit.Assert.assertNotNull(byteArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(intArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(intArray25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertNotNull(byteArray32);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(intArray37);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(intArray43);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    org.junit.Assert.assertNotNull(floatArray53);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    org.junit.Assert.assertNotNull(intArray63);
    org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    org.junit.Assert.assertNotNull(booleanItor72);
    org.junit.Assert.assertNotNull(date75);
    org.junit.Assert.assertNotNull(date76);
    org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
    org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    org.junit.Assert.assertNotNull(longArray86);
    org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    org.junit.Assert.assertNotNull(longItor90);
    org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
  }

  @Test
  public void test0182() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0182");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    java.lang.String str16 = simulatorHeader12.getOrekitTLE1();
    simulatorHeader12.setTimeFactor(31);
    boolean boolean19 = simulatorHeader12.isUseCelestia();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
  }

  @Test
  public void test0184() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0184");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date2 = simulatorData1.getCurrentTime();
    simulatorData1.toggleTimeRunning();
    int int4 = simulatorData1.getTimeFactor();
    org.junit.Assert.assertNotNull(date2);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
  }

  @Test
  public void test0185() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0185");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    opssat.simulator.util.SimulatorData simulatorData17 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date18 = simulatorData17.getCurrentTime();
    java.util.Date date19 = simulatorData17.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData20 = new opssat.simulator.util.SimulatorData(
        17, date19);
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    int int25 = opssat.simulator.util.DateExtraction.getDayFromDate(date24);
    opssat.simulator.util.SimulatorData simulatorData27 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date28 = simulatorData27.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData30 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date31 = simulatorData30.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap32 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date28, date31);
    opssat.simulator.util.SimulatorHeader simulatorHeader33 =
        new opssat.simulator.util.SimulatorHeader(
            false, date24, date31);
    opssat.simulator.util.SimulatorHeader simulatorHeader34 =
        new opssat.simulator.util.SimulatorHeader(
            false, date19, date24);
    simulatorHeader12.setEndDate(date19);
    int int36 = opssat.simulator.util.DateExtraction.getHourFromDate(date19);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertNotNull(date18);
    org.junit.Assert.assertNotNull(date19);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(date28);
    org.junit.Assert.assertNotNull(date31);
    org.junit.Assert.assertNotNull(timeUnitMap32);
  }

  @Test
  public void test0186() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0186");
    }
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience8 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    double double9 = gPSSatInViewScience8.getMaxDistance();
    double double10 = gPSSatInViewScience8.getMaxDistance();
    double double11 = gPSSatInViewScience8.getMinElevation();
    double double12 = gPSSatInViewScience8.getAvgDistance();
    double double13 = gPSSatInViewScience8.getStdDevElevation();
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 48.0d + "'", double11 == 48.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 11111.0d + "'", double13 == 11111.0d);
  }

  @Test
  public void test0187() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0187");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            52, 3, 281474993487872L);
  }

  @Test
  public void test0188() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0188");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.restoreArgument();
    java.lang.String str9 = argumentDescriptor5.toString();
    try {
      float float11 = argumentDescriptor5.getTypeAsFloatByIndex('a');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [F");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
  }

  @Test
  public void test0189() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0189");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    java.lang.String str14 = simulatorHeader12.getOrekitTLE2();
    int int15 = simulatorHeader12.getMinuteStartDate();
    simulatorHeader12.setUpdateInternet(false);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertNull(str14);
  }

  @Test
  public void test0190() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0190");
    }
    java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList3 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean4 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
    int int6 = booleanList3.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor7 = booleanList3.iterator();
    java.util.Iterator<java.lang.Boolean> booleanItor8 = booleanList3.iterator();
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece12 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            13L, 0, "hi!");
    long long13 = simulatorSchedulerPiece12.getTime();
    int int14 = simulatorSchedulerPiece12.getInternalID();
    simulatorSchedulerPiece12.setExecuted(false);
    java.lang.String str17 = simulatorSchedulerPiece12.getFileString();
    boolean boolean18 = booleanList3.equals(simulatorSchedulerPiece12);
    int int19 = simulatorSchedulerPiece12.getInternalID();
    org.junit.Assert.assertNotNull(booleanArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    org.junit.Assert.assertNotNull(booleanItor7);
    org.junit.Assert.assertNotNull(booleanItor8);
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 13L + "'", long13 == 13L);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    org.junit.Assert.assertTrue(
        "'" + str17 + "' != '" + "00000:00:00:00:013|0000000000000000013|0|hi!" + "'",
        str17.equals("00000:00:00:00:013|0000000000000000013|0|hi!"));
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
  }

  @Test
  public void test0192() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0192");
    }
    org.ccsds.moims.mo.mal.structures.IntegerList integerList1 =
        new org.ccsds.moims.mo.mal.structures.IntegerList(
            48);
    java.lang.Long long2 = integerList1.getShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort3 = integerList1.getAreaNumber();
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece7 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            'a', 11, "");
    boolean boolean8 = integerList1.contains(11);
    org.ccsds.moims.mo.mal.structures.UShort uShort9 = integerList1.getAreaNumber();
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 281475010265077L + "'",
        long2.equals(281475010265077L));
    org.junit.Assert.assertNotNull(uShort3);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(uShort9);
  }

  @Test
  public void test0193() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0193");
    }
    opssat.simulator.util.SimulatorTimer simulatorTimer2 = new opssat.simulator.util.SimulatorTimer(
        "SimulatorData", 1L);
    boolean boolean3 = simulatorTimer2.isElapsed();
    simulatorTimer2.setDuration((-10));
    simulatorTimer2.setDuration((-13));
    boolean boolean8 = simulatorTimer2.isElapsed();
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0194() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0194");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    java.lang.String str14 = simulatorHeader12.getOrekitTLE2();
    simulatorHeader12.setOrekitTLE1("yyyy/MM/dd-HH:mm:ss");
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertNull(str14);
  }

  @Test
  public void test0195() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0195");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    boolean boolean21 = simulatorHeader20.isAutoStartTime();
    simulatorHeader20.setUseCelestia(false);
    simulatorHeader20.setOrekitTLE1("[]");
    simulatorHeader20
        .setOrekitPropagator("opssat.simulator.util.wav.WavFileException: UnknownGUIData");
    java.lang.String str28 = simulatorHeader20.getOrekitPropagator();
    simulatorHeader20.setTimeFactor(8);
    boolean boolean31 = simulatorHeader20.isAutoStartTime();
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '" + "opssat.simulator.util.wav.WavFileException: UnknownGUIData" + "'",
        str28.equals("opssat.simulator.util.wav.WavFileException: UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
  }

  @Test
  public void test0196() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0196");
    }
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece3 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            13L, 0, "hi!");
    long long4 = simulatorSchedulerPiece3.getTime();
    int int5 = simulatorSchedulerPiece3.getInternalID();
    java.lang.String str6 = simulatorSchedulerPiece3.getFileString();
    java.lang.String str7 = simulatorSchedulerPiece3.getFileString();
    simulatorSchedulerPiece3.setExecuted(false);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 13L + "'", long4 == 13L);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertTrue(
        "'" + str6 + "' != '" + "00000:00:00:00:013|0000000000000000013|0|hi!" + "'",
        str6.equals("00000:00:00:00:013|0000000000000000013|0|hi!"));
    org.junit.Assert.assertTrue(
        "'" + str7 + "' != '" + "00000:00:00:00:013|0000000000000000013|0|hi!" + "'",
        str7.equals("00000:00:00:00:013|0000000000000000013|0|hi!"));
  }

  @Test
  public void test0197() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0197");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    int int5 = opssat.simulator.util.DateExtraction.getHourFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(48,
        date3);
    int int7 = simulatorData6.getTimeFactor();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
  }

  @Test
  public void test0198() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0198");
    }
    java.lang.Long[] longArray6 = new java.lang.Long[]{281475010265070L, 100L, 0L,
      281475010265070L, 281475010265070L, 1L};
    java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
    boolean boolean8 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
    boolean boolean9 = longList7.isEmpty();
    java.util.Spliterator<java.lang.Long> longSpliterator10 = longList7.spliterator();
    java.lang.Object[] objArray11 = longList7.toArray();
    java.lang.Object obj12 = longList7.clone();
    byte[] byteArray14 = opssat.simulator.peripherals.PFineADCS.FWRefFineADCS.int16_2ByteArray(19);
    boolean boolean15 = longList7.contains(19);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(boolean15);
    org.junit.Assert.assertNotNull(longArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(longSpliterator10);
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertNotNull(obj12);
    org.junit.Assert.assertNotNull(byteArray14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
  }

  @Test
  public void test0199() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0199");
    }
    java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList3 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean4 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
    int int6 = booleanList3.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor7 = booleanList3.iterator();
    opssat.simulator.util.SimulatorData simulatorData11 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date12 = simulatorData11.getCurrentTime();
    java.util.Date date13 = simulatorData11.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData14 = new opssat.simulator.util.SimulatorData(
        17, date13);
    opssat.simulator.util.SimulatorData simulatorData17 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date18 = simulatorData17.getCurrentTime();
    int int19 = opssat.simulator.util.DateExtraction.getDayFromDate(date18);
    opssat.simulator.util.SimulatorData simulatorData21 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date22 = simulatorData21.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData24 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date25 = simulatorData24.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap26 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date22, date25);
    opssat.simulator.util.SimulatorHeader simulatorHeader27 =
        new opssat.simulator.util.SimulatorHeader(
            false, date18, date25);
    opssat.simulator.util.SimulatorHeader simulatorHeader28 =
        new opssat.simulator.util.SimulatorHeader(
            false, date13, date18);
    boolean boolean29 = simulatorHeader28.isAutoStartTime();
    simulatorHeader28.setUseCelestia(false);
    boolean boolean32 = simulatorHeader28.isAutoStartSystem();
    int int33 = booleanList3.lastIndexOf(boolean32);
    org.ccsds.moims.mo.mal.structures.URI uRI35 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    java.lang.Integer int36 = uRI35.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.URI uRI38 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.UOctet uOctet39 = uRI38.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.URI uRI41 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.URI[] uRIArray42 =
        new org.ccsds.moims.mo.mal.structures.URI[]{
          uRI35, uRI38, uRI41};
    java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI> uRIList43 =
        new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI>();
    boolean boolean44 = java.util.Collections.addAll(
        (java.util.Collection<org.ccsds.moims.mo.mal.structures.URI>) uRIList43, uRIArray42);
    org.ccsds.moims.mo.mal.structures.FineTime fineTime45 =
        new org.ccsds.moims.mo.mal.structures.FineTime();
    int int46 = uRIList43.indexOf(fineTime45);
    long long47 = fineTime45.getValue();
    java.lang.Integer int48 = fineTime45.getTypeShortForm();
    boolean boolean49 = booleanList3.remove(int48);
    org.junit.Assert.assertNotNull(booleanArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    org.junit.Assert.assertNotNull(booleanItor7);
    org.junit.Assert.assertNotNull(date12);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertNotNull(date18);
    org.junit.Assert.assertNotNull(date22);
    org.junit.Assert.assertNotNull(date25);
    org.junit.Assert.assertNotNull(timeUnitMap26);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    org.junit.Assert.assertTrue("'" + int36 + "' != '" + 18 + "'", int36.equals(18));
    org.junit.Assert.assertNotNull(uOctet39);
    org.junit.Assert.assertNotNull(uRIArray42);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    org.junit.Assert.assertTrue("'" + int48 + "' != '" + 17 + "'", int48.equals(17));
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
  }

  @Test
  public void test0200() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0200");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    int int8 = simulatorSpacecraftState3.getSatsInView();
    simulatorSpacecraftState3.setAltitude((-5));
    double double11 = simulatorSpacecraftState3.getLatitude();
    simulatorSpacecraftState3.setSatsInView((byte) -1);
    double double14 = simulatorSpacecraftState3.getLongitude();
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 340.0d + "'", double11 == 340.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
  }

  @Test
  public void test0201() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0201");
    }
    opssat.simulator.util.SimulatorTimer simulatorTimer2 = new opssat.simulator.util.SimulatorTimer(
        "\n+0.000000 +0.000000 +0.000000\n+0.000000 +0.000000 +0.000000\n+0.000000 +0.000000 +0.000000",
        281475010265073L);
  }

  @Test
  public void test0202() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0202");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    boolean boolean21 = simulatorHeader20.isAutoStartTime();
    simulatorHeader20.setUseCelestia(false);
    simulatorHeader20.setOrekitTLE1("[]");
    simulatorHeader20
        .setOrekitPropagator("opssat.simulator.util.wav.WavFileException: UnknownGUIData");
    java.lang.String str28 = simulatorHeader20.getOrekitPropagator();
    simulatorHeader20.setTimeFactor(8);
    boolean boolean31 = simulatorHeader20.isAutoStartSystem();
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '" + "opssat.simulator.util.wav.WavFileException: UnknownGUIData" + "'",
        str28.equals("opssat.simulator.util.wav.WavFileException: UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
  }

  @Test
  public void test0203() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0203");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet3 = octetList0.getAreaVersion();
    opssat.simulator.util.wav.WavFileException wavFileException5 =
        new opssat.simulator.util.wav.WavFileException(
            "UnknownGUIData");
    java.lang.Throwable[] throwableArray6 = wavFileException5.getSuppressed();
    boolean boolean7 = octetList0.equals(wavFileException5);
    org.ccsds.moims.mo.mal.structures.FloatList floatList9 =
        new org.ccsds.moims.mo.mal.structures.FloatList(
            (byte) 0);
    java.lang.Integer int10 = floatList9.getTypeShortForm();
    java.lang.Integer int11 = floatList9.getTypeShortForm();
    floatList9.clear();
    boolean boolean13 = octetList0.remove(floatList9);
    boolean boolean15 = floatList9.add((-1.0f));
    floatList9.trimToSize();
    floatList9.ensureCapacity((-1));
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(uOctet3);
    org.junit.Assert.assertNotNull(throwableArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10.equals((-4)));
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-4) + "'", int11.equals((-4)));
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test0204() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0204");
    }
    java.lang.Long[] longArray6 = new java.lang.Long[]{281475010265070L, 100L, 0L,
      281475010265070L, 281475010265070L, 1L};
    java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
    boolean boolean8 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
    boolean boolean9 = longList7.isEmpty();
    java.util.Spliterator<java.lang.Long> longSpliterator10 = longList7.spliterator();
    java.lang.Object obj11 = longList7.clone();
    java.lang.Integer[] intArray19 = new java.lang.Integer[]{13, 10, 100, 100, 11111, 13, 11111};
    java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean21 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
    java.lang.Byte[] byteArray26 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList27 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean28 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList27, byteArray26);
    java.lang.Integer[] intArray31 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean33 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
    boolean boolean34 = byteList27.retainAll(intList32);
    java.lang.Integer[] intArray37 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean39 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
    int int41 = intList38.lastIndexOf((byte) 10);
    boolean boolean42 = intList32.removeAll(intList38);
    boolean boolean43 = intList20.retainAll(intList38);
    java.lang.Object obj44 = intList20.clone();
    int int45 = longList7.lastIndexOf(obj44);
    opssat.simulator.util.LoggerFormatter1Line loggerFormatter1Line47 =
        new opssat.simulator.util.LoggerFormatter1Line(
            "");
    boolean boolean48 = longList7.contains("");
    org.junit.Assert.assertNotNull(longArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(longSpliterator10);
    org.junit.Assert.assertNotNull(obj11);
    org.junit.Assert.assertNotNull(intArray19);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    org.junit.Assert.assertNotNull(byteArray26);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    org.junit.Assert.assertNotNull(intArray31);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(intArray37);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    org.junit.Assert.assertNotNull(obj44);
    org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
  }

  @Test
  public void test0205() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0205");
    }
    opssat.simulator.util.wav.WavFileException wavFileException1 =
        new opssat.simulator.util.wav.WavFileException(
            "21474836472147483647.9223372036854775807");
  }

  @Test
  public void test0206() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0206");
    }
    java.util.logging.Logger logger4 = null;
    try {
      opssat.simulator.util.CommandDescriptor commandDescriptor5 =
          new opssat.simulator.util.CommandDescriptor(
              "{counter=-1, methodsExecuted=1, currentTime=Thu May 23 15:09:32 UTC 2019}",
              "#Run the processing of internal models\nstartModels=false\n#Increment the simulated time (depends on startModels)\nstartTime=false\n#Speed up of time factor\ntimeFactor=1\n#Kepler elements for orbit A[km];E;i[deg];RAAN[deg];ARG_PER[deg];TRUE_A[deg] 7021.0;0.0;98.05;340.0;0.0;0.0\nkeplerElements=7021.0;0.0;98.05;340.0;0.0;0.0\n#Enable the Orekit library\norekit=false\n#Enable updates from Internet (used for gps constellation TLEs)\nupdateFromInternet=false\n#Configuration of the Celestia server\ncelestia=false\ncelestiaPort=0\n#Start and end dates of simulation\nstartDate=2019:05:23 15:09:43 UTC\nendDate=2019:05:23 15:09:43 UTC\n#Logging level to files found in $USER_HOME/.ops-sat-simulator/\n#Possible values SEVERE,INFO,FINE,FINER,FINEST,ALL\ncentralLogLevel=INFO\nsimulatorLogLevel=INFO\nconsoleLogLevel=INFO",
              "030940.216", 18, logger4);
      org.junit.Assert
          .fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0207() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0207");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList3 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int4 = octetList3.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort5 = octetList3.getAreaNumber();
    java.lang.Object[] objArray6 = octetList3.toArray();
    org.ccsds.moims.mo.mal.structures.OctetList octetList7 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int8 = octetList7.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort9 = octetList7.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor10 = octetList7.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor12 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList7, "hi!");
    org.ccsds.moims.mo.mal.structures.UShort uShort13 = octetList7.getAreaNumber();
    java.lang.Boolean[] booleanArray16 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList17 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean18 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList17, booleanArray16);
    int int20 = booleanList17.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor21 = booleanList17.iterator();
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator22 = booleanList17.spliterator();
    org.ccsds.moims.mo.mal.structures.OctetList octetList23 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int24 = octetList23.getTypeShortForm();
    java.lang.Object obj25 = octetList23.clone();
    octetList23.trimToSize();
    boolean boolean27 = booleanList17.contains(octetList23);
    org.ccsds.moims.mo.mal.structures.OctetList octetList28 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int29 = octetList28.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort30 = octetList28.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList31 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int32 = octetList31.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort33 = octetList31.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet34 = octetList31.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.OctetList octetList35 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int36 = octetList35.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort37 = octetList35.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray38 =
        new org.ccsds.moims.mo.mal.structures.OctetList[]{
          octetList3, octetList7, octetList23, octetList28, octetList31, octetList35};
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray39 = octetList0
        .toArray(octetListArray38);
    octetList0.ensureCapacity(28);
    org.ccsds.moims.mo.mal.structures.UOctet uOctet42 = octetList0.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.Element element43 = octetList0.createElement();
    java.lang.String str44 = octetList0.toString();
    java.util.stream.Stream<java.lang.Byte> byteStream45 = octetList0.stream();
    octetList0.clear();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7) + "'", int4.equals((-7)));
    org.junit.Assert.assertNotNull(uShort5);
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-7) + "'", int8.equals((-7)));
    org.junit.Assert.assertNotNull(uShort9);
    org.junit.Assert.assertNotNull(byteItor10);
    org.junit.Assert.assertNotNull(uShort13);
    org.junit.Assert.assertNotNull(booleanArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    org.junit.Assert.assertNotNull(booleanItor21);
    org.junit.Assert.assertNotNull(booleanSpliterator22);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24.equals((-7)));
    org.junit.Assert.assertNotNull(obj25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-7) + "'", int29.equals((-7)));
    org.junit.Assert.assertNotNull(uShort30);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-7) + "'", int32.equals((-7)));
    org.junit.Assert.assertNotNull(uShort33);
    org.junit.Assert.assertNotNull(uOctet34);
    org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-7) + "'", int36.equals((-7)));
    org.junit.Assert.assertNotNull(uShort37);
    org.junit.Assert.assertNotNull(octetListArray38);
    org.junit.Assert.assertNotNull(octetListArray39);
    org.junit.Assert.assertNotNull(uOctet42);
    org.junit.Assert.assertNotNull(element43);
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[]" + "'", str44.equals("[]"));
    org.junit.Assert.assertNotNull(byteStream45);
  }

  @Test
  public void test0208() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0208");
    }
    java.lang.String str1 = opssat.simulator.threading.SimulatorNode
        .calcNMEAChecksum("00000:00:00:00:008  97    0.0          executed false   | ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "*22" + "'", str1.equals("*22"));
  }

  @Test
  public void test0209() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0209");
    }
    java.lang.Float[] floatArray3 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList4 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean5 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList4, floatArray3);
    boolean boolean7 = floatList4.add((-1.0f));
    floatList4.trimToSize();
    boolean boolean10 = floatList4.add((-1.0f));
    java.lang.Float float12 = floatList4.remove((byte) 0);
    boolean boolean14 = floatList4.add(1.0f);
    opssat.simulator.util.LoggerFormatter loggerFormatter15 =
        new opssat.simulator.util.LoggerFormatter();
    boolean boolean16 = floatList4.remove(loggerFormatter15);
    org.junit.Assert.assertNotNull(floatArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12.equals(1.0f));
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
  }

  @Test
  public void test0211() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0211");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    java.lang.String str5 = simulatorSpacecraftState3.getMagField();
    java.lang.String str6 = simulatorSpacecraftState3.toString();
    java.lang.String str7 = simulatorSpacecraftState3.getSunVectorAsString();
    float[] floatArray8 = simulatorSpacecraftState3.getV();
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str5 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str5.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str6 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str6.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertTrue(
        "'" + str7 + "' != '" + "X:[+.00000] ; Y:[+.00000] ; Z: [+.00000] units [N/A]" + "'",
        str7.equals("X:[+.00000] ; Y:[+.00000] ; Z: [+.00000] units [N/A]"));
    org.junit.Assert.assertNotNull(floatArray8);
  }

  @Test
  public void test0212() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0212");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long2 = simulatorData1.getCurrentTimeMillis();
    java.lang.String str3 = simulatorData1.getCurrentDay();
    java.lang.String str4 = simulatorData1.getUTCCurrentTime2();
    java.lang.String str5 = simulatorData1.getCurrentDay();
    simulatorData1.setMethodsExecuted(36);
    simulatorData1.setMethodsExecuted(13);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
  }

  @Test
  public void test0213() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0213");
    }
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience8 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 17, 100.0f, 48, 100.0f, (-1.0d), 64, 281474993487874L);
    double double9 = gPSSatInViewScience8.getMinElevation();
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
  }

  @Test
  public void test0214() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0214");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    simulatorSpacecraftState3.setLongitude(4);
    double[] doubleArray7 = new double[]{(-1.0f)};
    simulatorSpacecraftState3.setMagField(doubleArray7);
    simulatorSpacecraftState3.setLatitude(0.0d);
    simulatorSpacecraftState3.setLongitude(10L);
    org.junit.Assert.assertNotNull(doubleArray7);
  }

  @Test
  public void test0215() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0215");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    boolean boolean16 = simulatorHeader12.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData19 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date20 = simulatorData19.getCurrentTime();
    int int21 = opssat.simulator.util.DateExtraction.getDayFromDate(date20);
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData26 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date27 = simulatorData26.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap28 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date24, date27);
    opssat.simulator.util.SimulatorHeader simulatorHeader29 =
        new opssat.simulator.util.SimulatorHeader(
            false, date20, date27);
    simulatorHeader12.setStartDate(date27);
    boolean boolean31 = simulatorHeader12.isAutoStartTime();
    simulatorHeader12.setUpdateInternet(true);
    java.lang.String str34 = simulatorHeader12.toString();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(date20);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertNotNull(timeUnitMap28);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
  }

  @Test
  public void test0216() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0216");
    }
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap1 =
        opssat.simulator.util.SimulatorData
            .computeTimeUnit(281474993487876L);
    org.junit.Assert.assertNotNull(timeUnitMap1);
  }

  @Test
  public void test0217() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0217");
    }
    java.util.logging.Logger logger0 = null;
    opssat.simulator.util.EndlessSingleStreamOperatingBuffer endlessSingleStreamOperatingBuffer1 =
        new opssat.simulator.util.EndlessSingleStreamOperatingBuffer(
            logger0);
    try {
      byte[] byteArray3 = endlessSingleStreamOperatingBuffer1.getDataAsByteArray((-2));
      org.junit.Assert
          .fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
    } catch (java.lang.NegativeArraySizeException e) {
    }
  }

  @Test
  public void test0219() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0219");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet3 = octetList0.getAreaVersion();
    opssat.simulator.util.wav.WavFileException wavFileException5 =
        new opssat.simulator.util.wav.WavFileException(
            "UnknownGUIData");
    java.lang.Throwable[] throwableArray6 = wavFileException5.getSuppressed();
    boolean boolean7 = octetList0.equals(wavFileException5);
    org.ccsds.moims.mo.mal.structures.FloatList floatList9 =
        new org.ccsds.moims.mo.mal.structures.FloatList(
            (byte) 0);
    java.lang.Integer int10 = floatList9.getTypeShortForm();
    java.lang.Integer int11 = floatList9.getTypeShortForm();
    floatList9.clear();
    boolean boolean13 = octetList0.remove(floatList9);
    boolean boolean15 = floatList9.add((-1.0f));
    java.util.Iterator<java.lang.Float> floatItor16 = floatList9.iterator();
    try {
      java.lang.Float float19 = floatList9.set(1, 10.0f);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
    } catch (java.lang.IndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(uOctet3);
    org.junit.Assert.assertNotNull(throwableArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10.equals((-4)));
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-4) + "'", int11.equals((-4)));
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(floatItor16);
  }

  @Test
  public void test0220() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0220");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    try {
      argumentDescriptor5.setIntTypeByIndex((-4), 4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [I");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
  }

  @Test
  public void test0221() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0221");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState8 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray11 = new float[]{28, 8};
    simulatorSpacecraftState8.setQ(floatArray11);
    simulatorSpacecraftState3.setRv(floatArray11);
    double[][] doubleArray14 = new double[][]{};
    simulatorSpacecraftState3.setRotation(doubleArray14);
    double double16 = simulatorSpacecraftState3.getAltitude();
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertNotNull(floatArray11);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 14.0d + "'", double16 == 14.0d);
  }

  @Test
  public void test0222() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0222");
    }
    org.ccsds.moims.mo.mal.structures.URI uRI1 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    java.lang.Integer int2 = uRI1.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.URI uRI4 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    java.lang.Integer int5 = uRI4.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.URI[] uRIArray6 = new org.ccsds.moims.mo.mal.structures.URI[]{
      uRI1, uRI4};
    java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI> uRIList7 =
        new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI>();
    boolean boolean8 = java.util.Collections
        .addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.URI>) uRIList7, uRIArray6);
    java.util.Spliterator<org.ccsds.moims.mo.mal.structures.URI> uRISpliterator9 = uRIList7
        .spliterator();
    opssat.simulator.threading.SimulatorNode.DevDatPBind devDatPBind10 =
        opssat.simulator.threading.SimulatorNode.DevDatPBind.FineADCS_Rotation;
    boolean boolean11 = uRIList7.equals(devDatPBind10);
    org.ccsds.moims.mo.mal.structures.StringList stringList12 =
        new org.ccsds.moims.mo.mal.structures.StringList();
    org.ccsds.moims.mo.mal.structures.ShortList shortList14 =
        new org.ccsds.moims.mo.mal.structures.ShortList(
            ' ');
    java.util.ListIterator<java.lang.Short> shortItor15 = shortList14.listIterator();
    boolean boolean16 = stringList12.equals(shortList14);
    org.ccsds.moims.mo.mal.structures.UShort uShort17 = shortList14.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UShort uShort18 = uShort17.getAreaNumber();
    boolean boolean19 = uRIList7.contains(uShort18);
    java.util.ListIterator<org.ccsds.moims.mo.mal.structures.URI> uRIItor20 = uRIList7
        .listIterator();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState24 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray27 = new float[]{28, 8};
    simulatorSpacecraftState24.setQ(floatArray27);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState32 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double33 = simulatorSpacecraftState32.getLatitude();
    java.lang.String str34 = simulatorSpacecraftState32.getMagField();
    float[] floatArray35 = simulatorSpacecraftState32.getR();
    simulatorSpacecraftState24.setQ(floatArray35);
    java.lang.String str37 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray35);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState41 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double42 = simulatorSpacecraftState41.getLatitude();
    double double43 = simulatorSpacecraftState41.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState47 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double48 = simulatorSpacecraftState47.getLatitude();
    java.lang.String str49 = simulatorSpacecraftState47.getMagField();
    float[] floatArray50 = simulatorSpacecraftState47.getR();
    simulatorSpacecraftState41.setQ(floatArray50);
    float[] floatArray52 = simulatorSpacecraftState41.getV();
    opssat.simulator.celestia.CelestiaData celestiaData53 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray35, floatArray52);
    float[] floatArray54 = celestiaData53.getQ();
    opssat.simulator.util.SimulatorData simulatorData58 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date59 = simulatorData58.getCurrentTime();
    int int60 = opssat.simulator.util.DateExtraction.getDayFromDate(date59);
    opssat.simulator.util.SimulatorData simulatorData62 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date63 = simulatorData62.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData65 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date66 = simulatorData65.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap67 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date63, date66);
    opssat.simulator.util.SimulatorHeader simulatorHeader68 =
        new opssat.simulator.util.SimulatorHeader(
            false, date59, date66);
    opssat.simulator.util.SimulatorData simulatorData69 = new opssat.simulator.util.SimulatorData(
        (short) 0, date59);
    celestiaData53.setDate(date59);
    java.lang.String str71 = celestiaData53.getLos();
    int int72 = celestiaData53.getMonths();
    int int73 = uRIList7.indexOf(int72);
    try {
      org.ccsds.moims.mo.mal.structures.URI uRI75 = uRIList7.remove(20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 20, Size: 2");
    } catch (java.lang.IndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2.equals(18));
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 18 + "'", int5.equals(18));
    org.junit.Assert.assertNotNull(uRIArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertNotNull(uRISpliterator9);
    org.junit.Assert.assertTrue(
        "'" + devDatPBind10 + "' != '"
        + opssat.simulator.threading.SimulatorNode.DevDatPBind.FineADCS_Rotation + "'",
        devDatPBind10
            .equals(opssat.simulator.threading.SimulatorNode.DevDatPBind.FineADCS_Rotation));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(shortItor15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(uShort17);
    org.junit.Assert.assertNotNull(uShort18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(uRIItor20);
    org.junit.Assert.assertNotNull(floatArray27);
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 340.0d + "'", double33 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str34 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str34.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray35);
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "UnknownGUIData" + "'",
        str37.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double42 + "' != '" + 340.0d + "'", double42 == 340.0d);
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + 340.0d + "'", double43 == 340.0d);
    org.junit.Assert.assertTrue("'" + double48 + "' != '" + 340.0d + "'", double48 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str49 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str49.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray50);
    org.junit.Assert.assertNotNull(floatArray52);
    org.junit.Assert.assertNotNull(floatArray54);
    org.junit.Assert.assertNotNull(date59);
    org.junit.Assert.assertNotNull(date63);
    org.junit.Assert.assertNotNull(date66);
    org.junit.Assert.assertNotNull(timeUnitMap67);
    org.junit.Assert.assertNull(str71);
    org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
  }

  @Test
  public void test0223() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0223");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    boolean boolean21 = simulatorHeader20.isAutoStartTime();
    simulatorHeader20.setUseCelestia(false);
    simulatorHeader20.setOrekitTLE1("[]");
    simulatorHeader20
        .setOrekitPropagator("opssat.simulator.util.wav.WavFileException: UnknownGUIData");
    java.lang.String str28 = simulatorHeader20.getOrekitPropagator();
    simulatorHeader20.setTimeFactor(8);
    boolean boolean31 = simulatorHeader20.isUpdateInternet();
    simulatorHeader20.setUseCelestia(true);
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '" + "opssat.simulator.util.wav.WavFileException: UnknownGUIData" + "'",
        str28.equals("opssat.simulator.util.wav.WavFileException: UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
  }

  @Test
  public void test0224() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0224");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    simulatorData1.setCounter((-1));
    simulatorData1.feedTimeElapsed(21);
    java.lang.String str6 = simulatorData1.getCurrentDay();
    boolean boolean7 = simulatorData1.isTimeRunning();
    simulatorData1.incrementMethods();
    java.lang.String str9 = simulatorData1.getUTCCurrentTime2();
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0226() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0226");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    int int5 = opssat.simulator.util.DateExtraction.getDayFromDate(date4);
    opssat.simulator.util.SimulatorData simulatorData7 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date8 = simulatorData7.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData10 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date11 = simulatorData10.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap12 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date8, date11);
    opssat.simulator.util.SimulatorHeader simulatorHeader13 =
        new opssat.simulator.util.SimulatorHeader(
            false, date4, date11);
    opssat.simulator.util.SimulatorData simulatorData14 = new opssat.simulator.util.SimulatorData(
        (short) 0, date4);
    opssat.simulator.util.SimulatorData simulatorData17 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date18 = simulatorData17.getCurrentTime();
    int int19 = opssat.simulator.util.DateExtraction.getDayFromDate(date18);
    opssat.simulator.util.SimulatorData simulatorData21 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date22 = simulatorData21.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData24 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date25 = simulatorData24.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap26 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date22, date25);
    opssat.simulator.util.SimulatorHeader simulatorHeader27 =
        new opssat.simulator.util.SimulatorHeader(
            false, date18, date25);
    java.util.Date date28 = simulatorHeader27.getEndDate();
    opssat.simulator.util.SimulatorData simulatorData32 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date33 = simulatorData32.getCurrentTime();
    java.util.Date date34 = simulatorData32.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData35 = new opssat.simulator.util.SimulatorData(
        17, date34);
    opssat.simulator.util.SimulatorData simulatorData38 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date39 = simulatorData38.getCurrentTime();
    int int40 = opssat.simulator.util.DateExtraction.getDayFromDate(date39);
    opssat.simulator.util.SimulatorData simulatorData42 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date43 = simulatorData42.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData45 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date46 = simulatorData45.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap47 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date43, date46);
    opssat.simulator.util.SimulatorHeader simulatorHeader48 =
        new opssat.simulator.util.SimulatorHeader(
            false, date39, date46);
    opssat.simulator.util.SimulatorHeader simulatorHeader49 =
        new opssat.simulator.util.SimulatorHeader(
            false, date34, date39);
    simulatorHeader27.setEndDate(date34);
    simulatorData14.initFromHeader(simulatorHeader27);
    java.lang.String str52 = simulatorHeader27.getOrekitPropagator();
    simulatorHeader27.setOrekitTLE1(
        "#Run the processing of internal models\nstartModels=false\n#Increment the simulated time (depends on startModels)\nstartTime=false\n#Speed up of time factor\ntimeFactor=1\n#Kepler elements for orbit A[km];E;i[deg];RAAN[deg];ARG_PER[deg];TRUE_A[deg] 7021.0;0.0;98.05;340.0;0.0;0.0\nkeplerElements=7021.0;0.0;98.05;340.0;0.0;0.0\n#Enable the Orekit library\norekit=false\n#Enable updates from Internet (used for gps constellation TLEs)\nupdateFromInternet=false\n#Configuration of the Celestia server\ncelestia=false\ncelestiaPort=0\n#Start and end dates of simulation\nstartDate=2019:05:23 15:09:40 UTC\nendDate=2019:05:23 15:09:40 UTC\n#Logging level to files found in $USER_HOME/.ops-sat-simulator/\n#Possible values SEVERE,INFO,FINE,FINER,FINEST,ALL\ncentralLogLevel=INFO\nsimulatorLogLevel=INFO\nconsoleLogLevel=INFO");
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertNotNull(date11);
    org.junit.Assert.assertNotNull(timeUnitMap12);
    org.junit.Assert.assertNotNull(date18);
    org.junit.Assert.assertNotNull(date22);
    org.junit.Assert.assertNotNull(date25);
    org.junit.Assert.assertNotNull(timeUnitMap26);
    org.junit.Assert.assertNotNull(date28);
    org.junit.Assert.assertNotNull(date33);
    org.junit.Assert.assertNotNull(date34);
    org.junit.Assert.assertNotNull(date39);
    org.junit.Assert.assertNotNull(date43);
    org.junit.Assert.assertNotNull(date46);
    org.junit.Assert.assertNotNull(timeUnitMap47);
    org.junit.Assert.assertNull(str52);
  }

  @Test
  public void test0227() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0227");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    int int50 = celestiaData32.getSeconds();
    celestiaData32.setDnx("OPS-SAT SoftSim:");
    java.lang.String str53 = celestiaData32.getAos();
    java.lang.String str54 = celestiaData32.getDnx();
    int int55 = celestiaData32.getMinutes();
    java.lang.String str56 = celestiaData32.getDate();
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
    org.junit.Assert.assertNull(str53);
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "OPS-SAT SoftSim:" + "'",
        str54.equals("OPS-SAT SoftSim:"));
  }

  @Test
  public void test0228() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0228");
    }
    opssat.simulator.util.SimulatorTimer simulatorTimer2 = new opssat.simulator.util.SimulatorTimer(
        "3257812:10:11:27:876", 38);
  }

  @Test
  public void test0229() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0229");
    }
    opssat.simulator.util.SimulatorTimer simulatorTimer2 = new opssat.simulator.util.SimulatorTimer(
        "*0B", 100L);
  }

  @Test
  public void test0230() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0230");
    }
    org.ccsds.moims.mo.mal.structures.FloatList floatList1 =
        new org.ccsds.moims.mo.mal.structures.FloatList(
            (byte) 0);
    java.lang.Integer int2 = floatList1.getTypeShortForm();
    floatList1.trimToSize();
    java.util.stream.Stream<java.lang.Float> floatStream4 = floatList1.parallelStream();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState8 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double9 = simulatorSpacecraftState8.getLatitude();
    java.lang.String str10 = simulatorSpacecraftState8.getMagField();
    simulatorSpacecraftState8.setLatitude((-4));
    java.lang.String str13 = simulatorSpacecraftState8.getMagField();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState17 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    simulatorSpacecraftState17.setLongitude(4);
    double[] doubleArray21 = new double[]{(-1.0f)};
    simulatorSpacecraftState17.setMagField(doubleArray21);
    double double23 = simulatorSpacecraftState17.getLongitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState27 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray30 = new float[]{28, 8};
    simulatorSpacecraftState27.setQ(floatArray30);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState35 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double36 = simulatorSpacecraftState35.getLatitude();
    java.lang.String str37 = simulatorSpacecraftState35.getMagField();
    float[] floatArray38 = simulatorSpacecraftState35.getR();
    simulatorSpacecraftState27.setQ(floatArray38);
    java.lang.String str40 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray38);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState44 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double45 = simulatorSpacecraftState44.getLatitude();
    double double46 = simulatorSpacecraftState44.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState50 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double51 = simulatorSpacecraftState50.getLatitude();
    java.lang.String str52 = simulatorSpacecraftState50.getMagField();
    float[] floatArray53 = simulatorSpacecraftState50.getR();
    simulatorSpacecraftState44.setQ(floatArray53);
    float[] floatArray55 = simulatorSpacecraftState44.getV();
    opssat.simulator.celestia.CelestiaData celestiaData56 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray38, floatArray55);
    float[] floatArray57 = celestiaData56.getQ();
    opssat.simulator.util.SimulatorData simulatorData61 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date62 = simulatorData61.getCurrentTime();
    int int63 = opssat.simulator.util.DateExtraction.getDayFromDate(date62);
    opssat.simulator.util.SimulatorData simulatorData65 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date66 = simulatorData65.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData68 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date69 = simulatorData68.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap70 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date66, date69);
    opssat.simulator.util.SimulatorHeader simulatorHeader71 =
        new opssat.simulator.util.SimulatorHeader(
            false, date62, date69);
    opssat.simulator.util.SimulatorData simulatorData72 = new opssat.simulator.util.SimulatorData(
        (short) 0, date62);
    celestiaData56.setDate(date62);
    int int74 = celestiaData56.getSeconds();
    celestiaData56.setDnx("OPS-SAT SoftSim:");
    java.lang.String str77 = celestiaData56.getAos();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState81 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double82 = simulatorSpacecraftState81.getLatitude();
    double double83 = simulatorSpacecraftState81.getLongitude();
    float[] floatArray84 = simulatorSpacecraftState81.getQ();
    celestiaData56.setQ(floatArray84);
    simulatorSpacecraftState17.setQ(floatArray84);
    simulatorSpacecraftState8.setRv(floatArray84);
    float[] floatArray88 = simulatorSpacecraftState8.getMagnetometer();
    boolean boolean89 = floatList1.contains(floatArray88);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2.equals((-4)));
    org.junit.Assert.assertNotNull(floatStream4);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 340.0d + "'", double9 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str10 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str10.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.0d + "'", double23 == 4.0d);
    org.junit.Assert.assertNotNull(floatArray30);
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + 340.0d + "'", double36 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str37 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str37.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray38);
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "UnknownGUIData" + "'",
        str40.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double45 + "' != '" + 340.0d + "'", double45 == 340.0d);
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + 340.0d + "'", double46 == 340.0d);
    org.junit.Assert.assertTrue("'" + double51 + "' != '" + 340.0d + "'", double51 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str52 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str52.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray53);
    org.junit.Assert.assertNotNull(floatArray55);
    org.junit.Assert.assertNotNull(floatArray57);
    org.junit.Assert.assertNotNull(date62);
    org.junit.Assert.assertNotNull(date66);
    org.junit.Assert.assertNotNull(date69);
    org.junit.Assert.assertNotNull(timeUnitMap70);
    org.junit.Assert.assertNull(str77);
    org.junit.Assert.assertTrue("'" + double82 + "' != '" + 340.0d + "'", double82 == 340.0d);
    org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
    org.junit.Assert.assertNotNull(floatArray84);
    org.junit.Assert.assertNotNull(floatArray88);
    org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
  }

  @Test
  public void test0231() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0231");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList3 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int4 = octetList3.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort5 = octetList3.getAreaNumber();
    java.lang.Object[] objArray6 = octetList3.toArray();
    org.ccsds.moims.mo.mal.structures.OctetList octetList7 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int8 = octetList7.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort9 = octetList7.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor10 = octetList7.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor12 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList7, "hi!");
    org.ccsds.moims.mo.mal.structures.UShort uShort13 = octetList7.getAreaNumber();
    java.lang.Boolean[] booleanArray16 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList17 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean18 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList17, booleanArray16);
    int int20 = booleanList17.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor21 = booleanList17.iterator();
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator22 = booleanList17.spliterator();
    org.ccsds.moims.mo.mal.structures.OctetList octetList23 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int24 = octetList23.getTypeShortForm();
    java.lang.Object obj25 = octetList23.clone();
    octetList23.trimToSize();
    boolean boolean27 = booleanList17.contains(octetList23);
    org.ccsds.moims.mo.mal.structures.OctetList octetList28 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int29 = octetList28.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort30 = octetList28.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList31 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int32 = octetList31.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort33 = octetList31.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet34 = octetList31.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.OctetList octetList35 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int36 = octetList35.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort37 = octetList35.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray38 =
        new org.ccsds.moims.mo.mal.structures.OctetList[]{
          octetList3, octetList7, octetList23, octetList28, octetList31, octetList35};
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray39 = octetList0
        .toArray(octetListArray38);
    boolean boolean40 = octetList0.isEmpty();
    org.ccsds.moims.mo.mal.structures.UShort uShort41 = octetList0.getAreaNumber();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7) + "'", int4.equals((-7)));
    org.junit.Assert.assertNotNull(uShort5);
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-7) + "'", int8.equals((-7)));
    org.junit.Assert.assertNotNull(uShort9);
    org.junit.Assert.assertNotNull(byteItor10);
    org.junit.Assert.assertNotNull(uShort13);
    org.junit.Assert.assertNotNull(booleanArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    org.junit.Assert.assertNotNull(booleanItor21);
    org.junit.Assert.assertNotNull(booleanSpliterator22);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24.equals((-7)));
    org.junit.Assert.assertNotNull(obj25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-7) + "'", int29.equals((-7)));
    org.junit.Assert.assertNotNull(uShort30);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-7) + "'", int32.equals((-7)));
    org.junit.Assert.assertNotNull(uShort33);
    org.junit.Assert.assertNotNull(uOctet34);
    org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-7) + "'", int36.equals((-7)));
    org.junit.Assert.assertNotNull(uShort37);
    org.junit.Assert.assertNotNull(octetListArray38);
    org.junit.Assert.assertNotNull(octetListArray39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(uShort41);
  }

  @Test
  public void test0234() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0234");
    }
    org.ccsds.moims.mo.mal.structures.DoubleList doubleList1 =
        new org.ccsds.moims.mo.mal.structures.DoubleList(
            (short) 10);
    boolean boolean3 = doubleList1.add(100.0d);
    org.ccsds.moims.mo.mal.structures.UOctet uOctet4 = doubleList1.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet5 = doubleList1.getAreaVersion();
    opssat.simulator.util.SimulatorDeviceData simulatorDeviceData7 =
        new opssat.simulator.util.SimulatorDeviceData(
            "[]");
    java.lang.String str8 = simulatorDeviceData7.getName();
    java.util.LinkedList<opssat.simulator.util.ArgumentDescriptor> argumentDescriptorList9 =
        simulatorDeviceData7
            .getDataList();
    int int10 = doubleList1.lastIndexOf(simulatorDeviceData7);
    java.lang.String str11 = simulatorDeviceData7.getName();
    java.lang.String str12 = simulatorDeviceData7.getName();
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(uOctet4);
    org.junit.Assert.assertNotNull(uOctet5);
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
    org.junit.Assert.assertNotNull(argumentDescriptorList9);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
  }

  @Test
  public void test0235() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0235");
    }
    java.lang.Integer[] intArray7 = new java.lang.Integer[]{13, 10, 100, 100, 11111, 13, 11111};
    java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean9 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
    java.lang.Byte[] byteArray14 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList15 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean16 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList15, byteArray14);
    java.lang.Integer[] intArray19 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean21 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
    boolean boolean22 = byteList15.retainAll(intList20);
    java.lang.Integer[] intArray25 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean27 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
    int int29 = intList26.lastIndexOf((byte) 10);
    boolean boolean30 = intList20.removeAll(intList26);
    boolean boolean31 = intList8.retainAll(intList26);
    org.ccsds.moims.mo.mal.structures.OctetList octetList32 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int33 = octetList32.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort34 = octetList32.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet35 = octetList32.getAreaVersion();
    opssat.simulator.util.wav.WavFileException wavFileException37 =
        new opssat.simulator.util.wav.WavFileException(
            "UnknownGUIData");
    java.lang.Throwable[] throwableArray38 = wavFileException37.getSuppressed();
    boolean boolean39 = octetList32.equals(wavFileException37);
    opssat.simulator.util.wav.WavFileException wavFileException41 =
        new opssat.simulator.util.wav.WavFileException(
            "00000:00:00:00:008");
    wavFileException37.addSuppressed(wavFileException41);
    java.lang.String str43 = wavFileException41.toString();
    int int44 = intList26.lastIndexOf(wavFileException41);
    java.lang.Throwable[] throwableArray45 = wavFileException41.getSuppressed();
    org.junit.Assert.assertNotNull(intArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNotNull(byteArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(intArray19);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(intArray25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-7) + "'", int33.equals((-7)));
    org.junit.Assert.assertNotNull(uShort34);
    org.junit.Assert.assertNotNull(uOctet35);
    org.junit.Assert.assertNotNull(throwableArray38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert
        .assertTrue(
            "'" + str43 + "' != '"
            + "opssat.simulator.util.wav.WavFileException: 00000:00:00:00:008" + "'",
            str43.equals("opssat.simulator.util.wav.WavFileException: 00000:00:00:00:008"));
    org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    org.junit.Assert.assertNotNull(throwableArray45);
  }

  @Test
  public void test0236() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0236");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    simulatorData1.setCounter((-1));
    simulatorData1.feedTimeElapsed(21);
    java.lang.String str6 = simulatorData1.getCurrentDay();
    boolean boolean7 = simulatorData1.isTimeRunning();
    simulatorData1.incrementMethods();
    simulatorData1.setTimeFactor(16);
    boolean boolean11 = simulatorData1.isSimulatorRunning();
    simulatorData1.setTimeFactor(4);
    java.lang.String str14 = simulatorData1.getCurrentYear();
    simulatorData1.toggleTimeRunning();
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
  }

  @Test
  public void test0237() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0237");
    }
    opssat.simulator.util.LoggerFormatter1Line loggerFormatter1Line1 =
        new opssat.simulator.util.LoggerFormatter1Line(
            "*0B");
  }

  @Test
  public void test0239() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0239");
    }
    org.ccsds.moims.mo.mal.structures.StringList stringList0 =
        new org.ccsds.moims.mo.mal.structures.StringList();
    java.util.Iterator<java.lang.String> strItor1 = stringList0.iterator();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet2 = stringList0.getAreaVersion();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState6 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray9 = new float[]{28, 8};
    simulatorSpacecraftState6.setQ(floatArray9);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState14 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double15 = simulatorSpacecraftState14.getLatitude();
    java.lang.String str16 = simulatorSpacecraftState14.getMagField();
    float[] floatArray17 = simulatorSpacecraftState14.getR();
    simulatorSpacecraftState6.setQ(floatArray17);
    java.lang.String str19 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray17);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState23 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double24 = simulatorSpacecraftState23.getLatitude();
    double double25 = simulatorSpacecraftState23.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState29 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double30 = simulatorSpacecraftState29.getLatitude();
    java.lang.String str31 = simulatorSpacecraftState29.getMagField();
    float[] floatArray32 = simulatorSpacecraftState29.getR();
    simulatorSpacecraftState23.setQ(floatArray32);
    float[] floatArray34 = simulatorSpacecraftState23.getV();
    opssat.simulator.celestia.CelestiaData celestiaData35 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray17, floatArray34);
    float[] floatArray36 = celestiaData35.getQ();
    opssat.simulator.util.SimulatorData simulatorData40 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date41 = simulatorData40.getCurrentTime();
    int int42 = opssat.simulator.util.DateExtraction.getDayFromDate(date41);
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData47 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date48 = simulatorData47.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap49 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date45, date48);
    opssat.simulator.util.SimulatorHeader simulatorHeader50 =
        new opssat.simulator.util.SimulatorHeader(
            false, date41, date48);
    opssat.simulator.util.SimulatorData simulatorData51 = new opssat.simulator.util.SimulatorData(
        (short) 0, date41);
    celestiaData35.setDate(date41);
    int int53 = celestiaData35.getSeconds();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState57 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray60 = new float[]{28, 8};
    simulatorSpacecraftState57.setQ(floatArray60);
    celestiaData35.setQ(floatArray60);
    int int63 = stringList0.lastIndexOf(celestiaData35);
    int int64 = celestiaData35.getHours();
    org.junit.Assert.assertNotNull(strItor1);
    org.junit.Assert.assertNotNull(uOctet2);
    org.junit.Assert.assertNotNull(floatArray9);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 340.0d + "'", double15 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str16 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str16.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray17);
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "UnknownGUIData" + "'",
        str19.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 340.0d + "'", double24 == 340.0d);
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 340.0d + "'", double25 == 340.0d);
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 340.0d + "'", double30 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str31 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str31.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray32);
    org.junit.Assert.assertNotNull(floatArray34);
    org.junit.Assert.assertNotNull(floatArray36);
    org.junit.Assert.assertNotNull(date41);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(date48);
    org.junit.Assert.assertNotNull(timeUnitMap49);
    org.junit.Assert.assertNotNull(floatArray60);
    org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
  }

  @Test
  public void test0240() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0240");
    }
    org.ccsds.moims.mo.mal.structures.URI uRI1 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    java.lang.Integer int2 = uRI1.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.URI uRI4 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.UOctet uOctet5 = uRI4.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.URI uRI7 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.URI[] uRIArray8 = new org.ccsds.moims.mo.mal.structures.URI[]{
      uRI1, uRI4, uRI7};
    java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI> uRIList9 =
        new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI>();
    boolean boolean10 = java.util.Collections
        .addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.URI>) uRIList9, uRIArray8);
    org.ccsds.moims.mo.mal.structures.FineTime fineTime11 =
        new org.ccsds.moims.mo.mal.structures.FineTime();
    int int12 = uRIList9.indexOf(fineTime11);
    uRIList9.ensureCapacity(40);
    java.lang.Object obj15 = uRIList9.clone();
    org.ccsds.moims.mo.mal.structures.URI uRI18 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.UOctet uOctet19 = uRI18.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.URI uRI20 = uRIList9.set((byte) 1, uRI18);
    java.lang.String str21 = uRI18.toString();
    opssat.simulator.util.SimulatorData simulatorData24 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date25 = simulatorData24.getCurrentTime();
    java.util.Date date26 = simulatorData24.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData27 = new opssat.simulator.util.SimulatorData(
        34, date26);
    boolean boolean28 = uRI18.equals(date26);
    org.ccsds.moims.mo.mal.structures.Element element29 = uRI18.createElement();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2.equals(18));
    org.junit.Assert.assertNotNull(uOctet5);
    org.junit.Assert.assertNotNull(uRIArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    org.junit.Assert.assertNotNull(obj15);
    org.junit.Assert.assertNotNull(uOctet19);
    org.junit.Assert.assertNotNull(uRI20);
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "0100.0000" + "'",
        str21.equals("0100.0000"));
    org.junit.Assert.assertNotNull(date25);
    org.junit.Assert.assertNotNull(date26);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(element29);
  }

  @Test
  public void test0241() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0241");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.setName("01700.0000000");
    java.lang.Object obj9 = argumentDescriptor5.getType();
    java.lang.String str10 = argumentDescriptor5.getName();
    argumentDescriptor5
        .setName("{counter=8, methodsExecuted=0, currentTime=Thu May 23 15:09:32 UTC 2019}");
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertNotNull(obj9);
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "01700.0000000" + "'",
        str10.equals("01700.0000000"));
  }

  @Test
  public void test0242() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0242");
    }
    java.lang.String str1 = opssat.simulator.threading.SimulatorNode
        .calcNMEAChecksum("3257812:10:11:27:876");
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "*36" + "'", str1.equals("*36"));
  }

  @Test
  public void test0243() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0243");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    int int50 = celestiaData32.getMonths();
    java.lang.String str51 = celestiaData32.getDnx();
    java.lang.String str52 = celestiaData32.getLos();
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
    org.junit.Assert.assertNull(str51);
    org.junit.Assert.assertNull(str52);
  }

  @Test
  public void test0244() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0244");
    }
    org.ccsds.moims.mo.mal.structures.StringList stringList0 =
        new org.ccsds.moims.mo.mal.structures.StringList();
    opssat.simulator.threading.SimulatorNode.DevDatPBind devDatPBind1 =
        opssat.simulator.threading.SimulatorNode.DevDatPBind.FineADCS_ReactionWheels;
    boolean boolean2 = stringList0.equals(devDatPBind1);
    org.ccsds.moims.mo.mal.structures.Element element3 = stringList0.createElement();
    java.lang.String str4 = stringList0.toString();
    org.ccsds.moims.mo.mal.structures.OctetList octetList5 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int6 = octetList5.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort7 = octetList5.getAreaNumber();
    int int8 = stringList0.lastIndexOf(uShort7);
    org.ccsds.moims.mo.mal.structures.URI uRI10 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    java.lang.Integer int11 = uRI10.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.URI uRI13 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.UOctet uOctet14 = uRI13.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.URI uRI16 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.URI[] uRIArray17 =
        new org.ccsds.moims.mo.mal.structures.URI[]{
          uRI10, uRI13, uRI16};
    java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI> uRIList18 =
        new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI>();
    boolean boolean19 = java.util.Collections.addAll(
        (java.util.Collection<org.ccsds.moims.mo.mal.structures.URI>) uRIList18, uRIArray17);
    org.ccsds.moims.mo.mal.structures.FineTime fineTime20 =
        new org.ccsds.moims.mo.mal.structures.FineTime();
    int int21 = uRIList18.indexOf(fineTime20);
    uRIList18.ensureCapacity(40);
    boolean boolean24 = uRIList18.isEmpty();
    java.lang.String str25 = uRIList18.toString();
    java.lang.Object obj26 = uRIList18.clone();
    boolean boolean27 = stringList0.equals(uRIList18);
    java.util.Spliterator<java.lang.String> strSpliterator28 = stringList0.spliterator();
    opssat.simulator.util.SimulatorData simulatorData31 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date32 = simulatorData31.getCurrentTime();
    int int33 = opssat.simulator.util.DateExtraction.getDayFromDate(date32);
    opssat.simulator.util.SimulatorData simulatorData35 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date36 = simulatorData35.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData38 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date39 = simulatorData38.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap40 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date36, date39);
    opssat.simulator.util.SimulatorHeader simulatorHeader41 =
        new opssat.simulator.util.SimulatorHeader(
            false, date32, date39);
    java.util.Date date42 = simulatorHeader41.getEndDate();
    boolean boolean43 = simulatorHeader41.isAutoStartSystem();
    int int44 = simulatorHeader41.getDayStartDate();
    java.lang.String str45 = simulatorHeader41.getOrekitTLE1();
    simulatorHeader41.setTimeFactor(31);
    simulatorHeader41.setUpdateInternet(false);
    boolean boolean50 = simulatorHeader41.isUpdateInternet();
    boolean boolean51 = simulatorHeader41.checkStartBeforeEnd();
    boolean boolean52 = stringList0.remove(simulatorHeader41);
    org.junit.Assert.assertTrue(
        "'" + devDatPBind1 + "' != '"
        + opssat.simulator.threading.SimulatorNode.DevDatPBind.FineADCS_ReactionWheels + "'",
        devDatPBind1
            .equals(opssat.simulator.threading.SimulatorNode.DevDatPBind.FineADCS_ReactionWheels));
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(element3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-7) + "'", int6.equals((-7)));
    org.junit.Assert.assertNotNull(uShort7);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 18 + "'", int11.equals(18));
    org.junit.Assert.assertNotNull(uOctet14);
    org.junit.Assert.assertNotNull(uRIArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[0100.0000, 0100.0000, 0100.0000]" + "'",
        str25.equals("[0100.0000, 0100.0000, 0100.0000]"));
    org.junit.Assert.assertNotNull(obj26);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(strSpliterator28);
    org.junit.Assert.assertNotNull(date32);
    org.junit.Assert.assertNotNull(date36);
    org.junit.Assert.assertNotNull(date39);
    org.junit.Assert.assertNotNull(timeUnitMap40);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertNull(str45);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
  }

  @Test
  public void test0245() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0245");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    boolean boolean16 = simulatorHeader12.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData19 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date20 = simulatorData19.getCurrentTime();
    int int21 = opssat.simulator.util.DateExtraction.getDayFromDate(date20);
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData26 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date27 = simulatorData26.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap28 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date24, date27);
    opssat.simulator.util.SimulatorHeader simulatorHeader29 =
        new opssat.simulator.util.SimulatorHeader(
            false, date20, date27);
    simulatorHeader12.setStartDate(date27);
    int int31 = opssat.simulator.util.DateExtraction.getDayFromDate(date27);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(date20);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertNotNull(timeUnitMap28);
  }

  @Test
  public void test0247() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0247");
    }
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience8 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 17, 100.0f, 48, 100.0f, (-1.0d), 64, 281474993487874L);
    double double9 = gPSSatInViewScience8.getAvgDistance();
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
  }

  @Test
  public void test0248() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0248");
    }
    java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[]{true};
    java.util.ArrayList<java.lang.Boolean> booleanList2 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean3 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator4 = booleanList2.spliterator();
    java.lang.Byte[] byteArray9 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList10 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean11 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList10, byteArray9);
    java.lang.Integer[] intArray14 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean16 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
    boolean boolean17 = byteList10.retainAll(intList15);
    java.lang.Integer[] intArray25 = new java.lang.Integer[]{13, 10, 100, 100, 11111, 13, 11111};
    java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean27 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
    java.lang.Byte[] byteArray32 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList33 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean34 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList33, byteArray32);
    java.lang.Integer[] intArray37 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean39 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
    boolean boolean40 = byteList33.retainAll(intList38);
    java.lang.Integer[] intArray43 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean45 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
    int int47 = intList44.lastIndexOf((byte) 10);
    boolean boolean48 = intList38.removeAll(intList44);
    boolean boolean49 = intList26.retainAll(intList44);
    java.lang.Float[] floatArray53 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList54 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean55 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList54, floatArray53);
    boolean boolean57 = floatList54.add((-1.0f));
    floatList54.trimToSize();
    java.lang.Integer[] intArray63 = new java.lang.Integer[]{100, 1, (-1), 10};
    java.util.ArrayList<java.lang.Integer> intList64 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean65 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
    int int67 = intList64.lastIndexOf((byte) 1);
    boolean boolean68 = floatList54.containsAll(intList64);
    boolean boolean69 = intList26.addAll(intList64);
    boolean boolean70 = intList15.retainAll(intList26);
    boolean boolean71 = booleanList2.equals(intList26);
    java.util.ListIterator<java.lang.Boolean> booleanItor72 = booleanList2.listIterator();
    opssat.simulator.util.SimulatorData simulatorData74 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date75 = simulatorData74.getCurrentTime();
    java.util.Date date76 = simulatorData74.getCurrentTime();
    int int77 = simulatorData74.getTimeFactor();
    int int78 = booleanList2.indexOf(int77);
    java.util.Iterator<java.lang.Boolean> booleanItor79 = booleanList2.iterator();
    org.junit.Assert.assertNotNull(booleanArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(booleanSpliterator4);
    org.junit.Assert.assertNotNull(byteArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(intArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(intArray25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertNotNull(byteArray32);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(intArray37);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(intArray43);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    org.junit.Assert.assertNotNull(floatArray53);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    org.junit.Assert.assertNotNull(intArray63);
    org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    org.junit.Assert.assertNotNull(booleanItor72);
    org.junit.Assert.assertNotNull(date75);
    org.junit.Assert.assertNotNull(date76);
    org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
    org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    org.junit.Assert.assertNotNull(booleanItor79);
  }

  @Test
  public void test0249() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0249");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    int int50 = celestiaData32.getSeconds();
    celestiaData32.setDnx("OPS-SAT SoftSim:");
    java.lang.String str53 = celestiaData32.getAos();
    java.lang.String str54 = celestiaData32.getDate();
    try {
      java.lang.String str55 = celestiaData32.toString();
      org.junit.Assert
          .fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
    org.junit.Assert.assertNull(str53);
  }

  @Test
  public void test0250() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0250");
    }
    long long1 = opssat.simulator.util.SimulatorSchedulerPiece
        .getMillisFromDDDDDHHMMSSmmm("030950.224");
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
  }

  @Test
  public void test0251() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0251");
    }
    java.lang.String str1 = opssat.simulator.util.SimulatorSchedulerPiece
        .getDDDDDHHMMSSmmmFromMillis(6);
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000:00:00:00:006" + "'",
        str1.equals("00000:00:00:00:006"));
  }

  @Test
  public void test0252() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0252");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long2 = simulatorData1.getCurrentTimeMillis();
    java.lang.String str3 = simulatorData1.getCurrentDay();
    java.lang.String str4 = simulatorData1.getCurrentYear();
    java.lang.String str5 = simulatorData1.toString();
    simulatorData1.toggleTimeRunning();
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
  }

  @Test
  public void test0253() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0253");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    boolean boolean16 = simulatorHeader12.isUseCelestia();
    int int17 = simulatorHeader12.getDayStartDate();
    simulatorHeader12.setAutoStartTime(false);
    int int20 = simulatorHeader12.getMonthStartDate();
    simulatorHeader12.setUseOrekitPropagator(false);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
  }

  @Test
  public void test0255() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0255");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    java.lang.Integer int6 = octetList0.getTypeShortForm();
    java.lang.Boolean[] booleanArray9 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList10 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean11 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList10, booleanArray9);
    int int13 = booleanList10.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor14 = booleanList10.iterator();
    boolean boolean16 = booleanList10.remove(10.0f);
    int int17 = octetList0.indexOf(booleanList10);
    java.util.stream.Stream<java.lang.Boolean> booleanStream18 = booleanList10.parallelStream();
    java.lang.Integer[] intArray21 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean23 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
    int int25 = intList22.lastIndexOf((byte) 10);
    boolean boolean26 = booleanList10.remove((java.lang.Object) int25);
    try {
      java.lang.Boolean boolean28 = booleanList10.get(100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
    } catch (java.lang.IndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-7) + "'", int6.equals((-7)));
    org.junit.Assert.assertNotNull(booleanArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    org.junit.Assert.assertNotNull(booleanItor14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    org.junit.Assert.assertNotNull(booleanStream18);
    org.junit.Assert.assertNotNull(intArray21);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
  }

  @Test
  public void test0256() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0256");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    org.ccsds.moims.mo.mal.structures.UShort uShort6 = octetList0.getAreaNumber();
    java.lang.Short[] shortArray9 = new java.lang.Short[]{(short) -1, (short) 10};
    java.util.ArrayList<java.lang.Short> shortList10 = new java.util.ArrayList<java.lang.Short>();
    boolean boolean11 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Short>) shortList10, shortArray9);
    boolean boolean12 = shortList10.isEmpty();
    java.lang.Object obj13 = null;
    boolean boolean14 = shortList10.contains(obj13);
    boolean boolean15 = octetList0.contains(boolean14);
    java.util.ListIterator<java.lang.Byte> byteItor16 = octetList0.listIterator();
    boolean boolean17 = octetList0.isEmpty();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertNotNull(uShort6);
    org.junit.Assert.assertNotNull(shortArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(byteItor16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test0257() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0257");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    int int13 = opssat.simulator.util.DateExtraction.getMonthFromDate(date10);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
  }

  @Test
  public void test0258() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0258");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    java.lang.String str50 = celestiaData32.getLos();
    int int51 = celestiaData32.getMonths();
    java.lang.String str52 = celestiaData32.getAnx();
    celestiaData32.setAos("foobar");
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
    org.junit.Assert.assertNull(str50);
    org.junit.Assert.assertNull(str52);
  }

  @Test
  public void test0259() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0259");
    }
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience8 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    double double9 = gPSSatInViewScience8.getStdDevDistance();
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 58.0d + "'", double9 == 58.0d);
  }

  @Test
  public void test0260() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0260");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    simulatorData1.setCounter((-1));
    simulatorData1.feedTimeElapsed(21);
    java.lang.String str6 = simulatorData1.getCurrentDay();
    boolean boolean7 = simulatorData1.isTimeRunning();
    simulatorData1.setMethodsExecuted(48);
    java.lang.String str10 = simulatorData1.getCurrentYear();
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0261() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0261");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    simulatorData1.setCounter((-1));
    simulatorData1.feedTimeElapsed(21);
    java.lang.String str6 = simulatorData1.getCurrentDay();
    boolean boolean7 = simulatorData1.isTimeRunning();
    simulatorData1.incrementMethods();
    simulatorData1.setTimeFactor(16);
    long long11 = simulatorData1.getCurrentTimeMillis();
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
  }

  @Test
  public void test0262() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0262");
    }
    opssat.simulator.util.SimulatorTimer simulatorTimer2 = new opssat.simulator.util.SimulatorTimer(
        "SimulatorData", 1L);
    boolean boolean3 = simulatorTimer2.isElapsed();
    simulatorTimer2.setDuration((-10));
    simulatorTimer2.timeElapsed(281474993487882L);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0263() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0263");
    }
    boolean boolean1 = opssat.simulator.threading.SimulatorNode.isInteger("[100, 1, -1, 10]");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
  }

  @Test
  public void test0264() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0264");
    }
    opssat.simulator.util.wav.WavFileException wavFileException1 =
        new opssat.simulator.util.wav.WavFileException(
            "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}");
    opssat.simulator.util.wav.WavFileException wavFileException2 =
        new opssat.simulator.util.wav.WavFileException();
    org.ccsds.moims.mo.mal.structures.OctetList octetList3 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int4 = octetList3.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort5 = octetList3.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet6 = octetList3.getAreaVersion();
    opssat.simulator.util.wav.WavFileException wavFileException8 =
        new opssat.simulator.util.wav.WavFileException(
            "UnknownGUIData");
    java.lang.Throwable[] throwableArray9 = wavFileException8.getSuppressed();
    boolean boolean10 = octetList3.equals(wavFileException8);
    wavFileException2.addSuppressed(wavFileException8);
    wavFileException1.addSuppressed(wavFileException8);
    opssat.simulator.util.wav.WavFileException wavFileException13 =
        new opssat.simulator.util.wav.WavFileException(
            wavFileException8);
    opssat.simulator.util.wav.WavFileException wavFileException15 =
        new opssat.simulator.util.wav.WavFileException(
            "00000:00:00:00:008");
    wavFileException8.addSuppressed(wavFileException15);
    opssat.simulator.util.wav.WavFileException wavFileException18 =
        new opssat.simulator.util.wav.WavFileException(
            "UnknownGUIData");
    opssat.simulator.util.wav.WavFileException wavFileException19 =
        new opssat.simulator.util.wav.WavFileException(
            wavFileException18);
    wavFileException8.addSuppressed(wavFileException18);
    java.lang.Throwable[] throwableArray21 = wavFileException18.getSuppressed();
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7) + "'", int4.equals((-7)));
    org.junit.Assert.assertNotNull(uShort5);
    org.junit.Assert.assertNotNull(uOctet6);
    org.junit.Assert.assertNotNull(throwableArray9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(throwableArray21);
  }

  @Test
  public void test0265() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0265");
    }
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor2 =
        new opssat.simulator.util.ArgumentDescriptor(
            "", "[10, 10, -1]");
  }

  @Test
  public void test0266() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0266");
    }
    org.ccsds.moims.mo.mal.structures.StringList stringList0 =
        new org.ccsds.moims.mo.mal.structures.StringList();
    org.ccsds.moims.mo.mal.structures.ShortList shortList2 =
        new org.ccsds.moims.mo.mal.structures.ShortList(
            ' ');
    java.util.ListIterator<java.lang.Short> shortItor3 = shortList2.listIterator();
    boolean boolean4 = stringList0.equals(shortList2);
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience13 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    double double14 = gPSSatInViewScience13.getMaxDistance();
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience23 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience32 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    double double33 = gPSSatInViewScience32.getMaxDistance();
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience42 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience51 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    double double52 = gPSSatInViewScience51.getStdDevElevation();
    opssat.simulator.orekit.GPSSatInViewScience[] gPSSatInViewScienceArray53 =
        new opssat.simulator.orekit.GPSSatInViewScience[]{
          gPSSatInViewScience13, gPSSatInViewScience23, gPSSatInViewScience32, gPSSatInViewScience42,
          gPSSatInViewScience51};
    opssat.simulator.orekit.GPSSatInViewScience[] gPSSatInViewScienceArray54 = shortList2
        .toArray(gPSSatInViewScienceArray53);
    shortList2.ensureCapacity(44);
    int int57 = shortList2.size();
    java.util.stream.Stream<java.lang.Short> shortStream58 = shortList2.parallelStream();
    try {
      java.lang.Short short60 = shortList2.get(62);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 62, Size: 0");
    } catch (java.lang.IndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(shortItor3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    org.junit.Assert.assertTrue("'" + double52 + "' != '" + 11111.0d + "'", double52 == 11111.0d);
    org.junit.Assert.assertNotNull(gPSSatInViewScienceArray53);
    org.junit.Assert.assertNotNull(gPSSatInViewScienceArray54);
    org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    org.junit.Assert.assertNotNull(shortStream58);
  }

  @Test
  public void test0267() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0267");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(8);
    java.lang.String str2 = simulatorData1.toString();
    java.lang.String str3 = simulatorData1.toString();
    java.lang.String str4 = simulatorData1.getUTCCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData7 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date8 = simulatorData7.getCurrentTime();
    int int9 = opssat.simulator.util.DateExtraction.getDayFromDate(date8);
    opssat.simulator.util.SimulatorData simulatorData11 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date12 = simulatorData11.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData14 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date15 = simulatorData14.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap16 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date12, date15);
    opssat.simulator.util.SimulatorHeader simulatorHeader17 =
        new opssat.simulator.util.SimulatorHeader(
            false, date8, date15);
    java.util.Date date18 = simulatorHeader17.getEndDate();
    boolean boolean19 = simulatorHeader17.isAutoStartSystem();
    int int20 = simulatorHeader17.getDayStartDate();
    boolean boolean21 = simulatorHeader17.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData24 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date25 = simulatorData24.getCurrentTime();
    int int26 = opssat.simulator.util.DateExtraction.getDayFromDate(date25);
    opssat.simulator.util.SimulatorData simulatorData28 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date29 = simulatorData28.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData31 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date32 = simulatorData31.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap33 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date29, date32);
    opssat.simulator.util.SimulatorHeader simulatorHeader34 =
        new opssat.simulator.util.SimulatorHeader(
            false, date25, date32);
    simulatorHeader17.setStartDate(date32);
    boolean boolean36 = simulatorHeader17.isAutoStartTime();
    simulatorHeader17.setUpdateInternet(true);
    java.lang.String str39 = simulatorHeader17.DATE_FORMAT;
    simulatorData1.initFromHeader(simulatorHeader17);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertNotNull(date12);
    org.junit.Assert.assertNotNull(date15);
    org.junit.Assert.assertNotNull(timeUnitMap16);
    org.junit.Assert.assertNotNull(date18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNotNull(date25);
    org.junit.Assert.assertNotNull(date29);
    org.junit.Assert.assertNotNull(date32);
    org.junit.Assert.assertNotNull(timeUnitMap33);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "yyyy:MM:dd HH:mm:ss z" + "'",
        str39.equals("yyyy:MM:dd HH:mm:ss z"));
  }

  @Test
  public void test0268() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0268");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    java.lang.String str5 = simulatorSpacecraftState3.getMagField();
    java.lang.String str6 = simulatorSpacecraftState3.toString();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState10 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double11 = simulatorSpacecraftState10.getLatitude();
    java.lang.String str12 = simulatorSpacecraftState10.getMagField();
    java.lang.String str13 = simulatorSpacecraftState10.toString();
    double[] doubleArray14 = simulatorSpacecraftState10.getSunVector();
    simulatorSpacecraftState3.setMagnetometer(doubleArray14);
    java.lang.Class<?> wildcardClass16 = doubleArray14.getClass();
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str5 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str5.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str6 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str6.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 340.0d + "'", double11 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str12 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str12.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str13.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test0269() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0269");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    int int14 = simulatorHeader12.getMinuteStartDate();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long17 = simulatorData16.getCurrentTimeMillis();
    java.lang.String str18 = simulatorData16.getCurrentDay();
    java.lang.String str19 = simulatorData16.getUTCCurrentTime2();
    java.lang.String str20 = simulatorData16.getCurrentDay();
    java.util.Date date21 = simulatorData16.getCurrentTime();
    int int22 = opssat.simulator.util.DateExtraction.getMinuteFromDate(date21);
    simulatorHeader12.setEndDate(date21);
    int int24 = opssat.simulator.util.DateExtraction.getHourFromDate(date21);
    int int25 = opssat.simulator.util.DateExtraction.getMinuteFromDate(date21);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    org.junit.Assert.assertNotNull(date21);
  }

  @Test
  public void test0270() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0270");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    org.ccsds.moims.mo.mal.structures.UShort uShort6 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor7 = octetList0.iterator();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertNotNull(uShort6);
    org.junit.Assert.assertNotNull(byteItor7);
  }

  @Test
  public void test0271() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0271");
    }
    java.lang.Short[] shortArray2 = new java.lang.Short[]{(short) 1, (short) 1};
    java.util.ArrayList<java.lang.Short> shortList3 = new java.util.ArrayList<java.lang.Short>();
    boolean boolean4 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Short>) shortList3, shortArray2);
    shortList3.clear();
    boolean boolean6 = shortList3.isEmpty();
    boolean boolean8 = shortList3.equals(5);
    java.lang.String str9 = shortList3.toString();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState13 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double14 = simulatorSpacecraftState13.getLatitude();
    java.lang.String str15 = simulatorSpacecraftState13.getMagField();
    java.lang.String str16 = simulatorSpacecraftState13.getSunVectorAsString();
    boolean boolean17 = shortList3.contains(str16);
    boolean boolean18 = shortList3.isEmpty();
    org.junit.Assert.assertNotNull(shortArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 340.0d + "'", double14 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str15 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str15.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str16 + "' != '" + "X:[+.00000] ; Y:[+.00000] ; Z: [+.00000] units [N/A]" + "'",
        str16.equals("X:[+.00000] ; Y:[+.00000] ; Z: [+.00000] units [N/A]"));
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
  }

  @Test
  public void test0273() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0273");
    }
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor2 =
        new opssat.simulator.util.ArgumentDescriptor(
            "00000:00:00:00:-02", "2019:05:23 15:09:36 UTC");
    java.lang.Float[] floatArray6 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList7 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean8 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList7, floatArray6);
    boolean boolean10 = floatList7.add((-1.0f));
    floatList7.clear();
    java.util.stream.Stream<java.lang.Float> floatStream12 = floatList7.stream();
    java.lang.Byte[] byteArray17 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList18 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean19 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList18, byteArray17);
    java.lang.Integer[] intArray22 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean24 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
    boolean boolean25 = byteList18.retainAll(intList23);
    java.lang.Integer[] intArray28 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean30 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
    int int32 = intList29.lastIndexOf((byte) 10);
    boolean boolean33 = intList23.retainAll(intList29);
    boolean boolean34 = floatList7.containsAll(intList29);
    argumentDescriptor2.setType(floatList7);
    argumentDescriptor2.setName(
        "SimulatorHeader{autoStartSystem=true, autoStartTime=false, timeFactor=1, startDate=Thu May 23 15:09:44 UTC 2019, endDate=Thu May 23 15:09:44 UTC 2019}");
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(floatStream12);
    org.junit.Assert.assertNotNull(byteArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNotNull(intArray22);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertNotNull(intArray28);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
  }

  @Test
  public void test0275() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0275");
    }
    org.ccsds.moims.mo.mal.structures.StringList stringList0 =
        new org.ccsds.moims.mo.mal.structures.StringList();
    org.ccsds.moims.mo.mal.structures.ShortList shortList2 =
        new org.ccsds.moims.mo.mal.structures.ShortList(
            ' ');
    java.util.ListIterator<java.lang.Short> shortItor3 = shortList2.listIterator();
    boolean boolean4 = stringList0.equals(shortList2);
    java.util.stream.BaseStream[] baseStreamArray6 = new java.util.stream.BaseStream[0];
    @SuppressWarnings("unchecked")
    java.util.stream.BaseStream<java.lang.Float, java.util.stream.Stream<java.lang.Float>>[] floatBaseStreamArray7 =
        baseStreamArray6;
    java.util.stream.BaseStream<java.lang.Float, java.util.stream.Stream<java.lang.Float>>[] floatBaseStreamArray8 =
        stringList0
            .toArray(
                (java.util.stream.BaseStream<java.lang.Float, java.util.stream.Stream<java.lang.Float>>[]) baseStreamArray6);
    java.util.stream.Stream<java.lang.String> strStream9 = stringList0.stream();
    java.lang.Object obj10 = stringList0.clone();
    opssat.simulator.util.LoggerFormatter loggerFormatter11 =
        new opssat.simulator.util.LoggerFormatter();
    opssat.simulator.util.LoggerFormatter loggerFormatter12 =
        new opssat.simulator.util.LoggerFormatter();
    opssat.simulator.util.LoggerFormatter loggerFormatter13 =
        new opssat.simulator.util.LoggerFormatter();
    opssat.simulator.util.LoggerFormatter[] loggerFormatterArray14 =
        new opssat.simulator.util.LoggerFormatter[]{
          loggerFormatter11, loggerFormatter12, loggerFormatter13};
    opssat.simulator.util.LoggerFormatter[] loggerFormatterArray15 = stringList0
        .toArray(loggerFormatterArray14);
    org.ccsds.moims.mo.mal.structures.IntegerList integerList16 =
        new org.ccsds.moims.mo.mal.structures.IntegerList();
    boolean boolean17 = stringList0.containsAll(integerList16);
    try {
      java.lang.String str19 = stringList0.get(4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
    } catch (java.lang.IndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(shortItor3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(baseStreamArray6);
    org.junit.Assert.assertNotNull(floatBaseStreamArray7);
    org.junit.Assert.assertNotNull(floatBaseStreamArray8);
    org.junit.Assert.assertNotNull(strStream9);
    org.junit.Assert.assertNotNull(obj10);
    org.junit.Assert.assertNotNull(loggerFormatterArray14);
    org.junit.Assert.assertNotNull(loggerFormatterArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test0278() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0278");
    }
    opssat.simulator.util.SimulatorDeviceData simulatorDeviceData1 =
        new opssat.simulator.util.SimulatorDeviceData(
            "[]");
    java.lang.String str2 = simulatorDeviceData1.getName();
    java.util.LinkedList<opssat.simulator.util.ArgumentDescriptor> argumentDescriptorList3 =
        simulatorDeviceData1
            .getDataList();
    java.util.LinkedList<opssat.simulator.util.ArgumentDescriptor> argumentDescriptorList4 =
        simulatorDeviceData1
            .getDataList();
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
    org.junit.Assert.assertNotNull(argumentDescriptorList3);
    org.junit.Assert.assertNotNull(argumentDescriptorList4);
  }

  @Test
  public void test0279() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0279");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    boolean boolean21 = simulatorHeader20.isAutoStartTime();
    simulatorHeader20.setUseCelestia(false);
    simulatorHeader20.setOrekitTLE1("[]");
    simulatorHeader20
        .setOrekitPropagator("opssat.simulator.util.wav.WavFileException: UnknownGUIData");
    java.lang.String str28 = simulatorHeader20.getOrekitPropagator();
    simulatorHeader20.setTimeFactor(8);
    boolean boolean31 = simulatorHeader20.isUpdateInternet();
    boolean boolean32 = simulatorHeader20.isAutoStartTime();
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '" + "opssat.simulator.util.wav.WavFileException: UnknownGUIData" + "'",
        str28.equals("opssat.simulator.util.wav.WavFileException: UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
  }

  @Test
  public void test0280() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0280");
    }
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece3 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            5909, 56, "00000:00:00:00:013  0     hi!          executed false   | ");
    java.lang.String str4 = simulatorSchedulerPiece3.getSchedulerOutput();
    java.lang.String str5 = simulatorSchedulerPiece3.getSchedulerOutput();
    org.junit.Assert.assertTrue("'" + str4 + "' != '"
        + "00000:00:00:05:909  56    00000:00:00:00:013  0     hi!          executed false   |  executed false   | "
        + "'",
        str4.equals(
            "00000:00:00:05:909  56    00000:00:00:00:013  0     hi!          executed false   |  executed false   | "));
    org.junit.Assert.assertTrue("'" + str5 + "' != '"
        + "00000:00:00:05:909  56    00000:00:00:00:013  0     hi!          executed false   |  executed false   | "
        + "'",
        str5.equals(
            "00000:00:00:05:909  56    00000:00:00:00:013  0     hi!          executed false   |  executed false   | "));
  }

  @Test
  public void test0283() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0283");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList3 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int4 = octetList3.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort5 = octetList3.getAreaNumber();
    java.lang.Object[] objArray6 = octetList3.toArray();
    org.ccsds.moims.mo.mal.structures.OctetList octetList7 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int8 = octetList7.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort9 = octetList7.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor10 = octetList7.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor12 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList7, "hi!");
    org.ccsds.moims.mo.mal.structures.UShort uShort13 = octetList7.getAreaNumber();
    java.lang.Boolean[] booleanArray16 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList17 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean18 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList17, booleanArray16);
    int int20 = booleanList17.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor21 = booleanList17.iterator();
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator22 = booleanList17.spliterator();
    org.ccsds.moims.mo.mal.structures.OctetList octetList23 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int24 = octetList23.getTypeShortForm();
    java.lang.Object obj25 = octetList23.clone();
    octetList23.trimToSize();
    boolean boolean27 = booleanList17.contains(octetList23);
    org.ccsds.moims.mo.mal.structures.OctetList octetList28 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int29 = octetList28.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort30 = octetList28.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList31 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int32 = octetList31.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort33 = octetList31.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet34 = octetList31.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.OctetList octetList35 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int36 = octetList35.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort37 = octetList35.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray38 =
        new org.ccsds.moims.mo.mal.structures.OctetList[]{
          octetList3, octetList7, octetList23, octetList28, octetList31, octetList35};
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray39 = octetList0
        .toArray(octetListArray38);
    org.ccsds.moims.mo.mal.structures.Element element40 = octetList0.createElement();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7) + "'", int4.equals((-7)));
    org.junit.Assert.assertNotNull(uShort5);
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-7) + "'", int8.equals((-7)));
    org.junit.Assert.assertNotNull(uShort9);
    org.junit.Assert.assertNotNull(byteItor10);
    org.junit.Assert.assertNotNull(uShort13);
    org.junit.Assert.assertNotNull(booleanArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    org.junit.Assert.assertNotNull(booleanItor21);
    org.junit.Assert.assertNotNull(booleanSpliterator22);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24.equals((-7)));
    org.junit.Assert.assertNotNull(obj25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-7) + "'", int29.equals((-7)));
    org.junit.Assert.assertNotNull(uShort30);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-7) + "'", int32.equals((-7)));
    org.junit.Assert.assertNotNull(uShort33);
    org.junit.Assert.assertNotNull(uOctet34);
    org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-7) + "'", int36.equals((-7)));
    org.junit.Assert.assertNotNull(uShort37);
    org.junit.Assert.assertNotNull(octetListArray38);
    org.junit.Assert.assertNotNull(octetListArray39);
    org.junit.Assert.assertNotNull(element40);
  }

  @Test
  public void test0284() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0284");
    }
    org.ccsds.moims.mo.mal.structures.Identifier identifier0 =
        new org.ccsds.moims.mo.mal.structures.Identifier();
    org.ccsds.moims.mo.mal.structures.OctetList octetList1 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int2 = octetList1.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort3 = octetList1.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor4 = octetList1.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor6 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList1, "hi!");
    argumentDescriptor6.restoreArgument();
    argumentDescriptor6.restoreArgument();
    argumentDescriptor6.restoreArgument();
    java.lang.String str10 = argumentDescriptor6.toString();
    boolean boolean11 = identifier0.equals(str10);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState15 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray18 = new float[]{28, 8};
    simulatorSpacecraftState15.setQ(floatArray18);
    float[] floatArray20 = simulatorSpacecraftState15.getQ();
    double double21 = simulatorSpacecraftState15.getLongitude();
    boolean boolean22 = identifier0.equals(simulatorSpacecraftState15);
    org.ccsds.moims.mo.mal.structures.UShort uShort23 = identifier0.getAreaNumber();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2.equals((-7)));
    org.junit.Assert.assertNotNull(uShort3);
    org.junit.Assert.assertNotNull(byteItor4);
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(floatArray18);
    org.junit.Assert.assertNotNull(floatArray20);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(uShort23);
  }

  @Test
  public void test0285() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0285");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    boolean boolean16 = simulatorHeader12.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData19 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date20 = simulatorData19.getCurrentTime();
    int int21 = opssat.simulator.util.DateExtraction.getDayFromDate(date20);
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData26 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date27 = simulatorData26.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap28 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date24, date27);
    opssat.simulator.util.SimulatorHeader simulatorHeader29 =
        new opssat.simulator.util.SimulatorHeader(
            false, date20, date27);
    simulatorHeader12.setStartDate(date27);
    int int31 = simulatorHeader12.getYearStartDate();
    java.lang.String str32 = simulatorHeader12.getOrekitPropagator();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(date20);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertNotNull(timeUnitMap28);
    org.junit.Assert.assertNull(str32);
  }

  @Test
  public void test0286() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0286");
    }
    java.util.logging.Logger logger2 = null;
    opssat.simulator.util.EndlessSingleStreamOperatingBuffer endlessSingleStreamOperatingBuffer3 =
        new opssat.simulator.util.EndlessSingleStreamOperatingBuffer(
            logger2);
    byte[] byteArray5 = endlessSingleStreamOperatingBuffer3.getDataAsByteArray('4');
    org.ccsds.moims.mo.mal.structures.Union union7 = new org.ccsds.moims.mo.mal.structures.Union(
        "$DEFAULT");
    endlessSingleStreamOperatingBuffer3.setDataBuffer("$DEFAULT");
    byte[] byteArray10 = opssat.simulator.peripherals.PFineADCS.FWRefFineADCS.float2ByteArray(20);
    endlessSingleStreamOperatingBuffer3.setDataFromByteArray(byteArray10);
    try {
      opssat.simulator.peripherals.PFineADCS.FWRefFineADCS.putLongInByteArray(41, (-30),
          byteArray10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -30");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(byteArray5);
    org.junit.Assert.assertNotNull(byteArray10);
  }

  @Test
  public void test0287() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0287");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList1 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int2 = octetList1.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort3 = octetList1.getServiceNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList4 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int5 = octetList4.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort6 = octetList4.getAreaNumber();
    java.lang.Object[] objArray7 = octetList4.toArray();
    org.ccsds.moims.mo.mal.structures.OctetList octetList8 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int9 = octetList8.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort10 = octetList8.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor11 = octetList8.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor13 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList8, "hi!");
    org.ccsds.moims.mo.mal.structures.UShort uShort14 = octetList8.getAreaNumber();
    java.lang.Boolean[] booleanArray17 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList18 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean19 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList18, booleanArray17);
    int int21 = booleanList18.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor22 = booleanList18.iterator();
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator23 = booleanList18.spliterator();
    org.ccsds.moims.mo.mal.structures.OctetList octetList24 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int25 = octetList24.getTypeShortForm();
    java.lang.Object obj26 = octetList24.clone();
    octetList24.trimToSize();
    boolean boolean28 = booleanList18.contains(octetList24);
    org.ccsds.moims.mo.mal.structures.OctetList octetList29 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int30 = octetList29.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort31 = octetList29.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList32 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int33 = octetList32.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort34 = octetList32.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet35 = octetList32.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.OctetList octetList36 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int37 = octetList36.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort38 = octetList36.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray39 =
        new org.ccsds.moims.mo.mal.structures.OctetList[]{
          octetList4, octetList8, octetList24, octetList29, octetList32, octetList36};
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray40 = octetList1
        .toArray(octetListArray39);
    boolean boolean41 = octetList1.isEmpty();
    java.lang.Long long42 = octetList1.getShortForm();
    opssat.simulator.util.SimulatorData simulatorData46 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date47 = simulatorData46.getCurrentTime();
    java.util.Date date48 = simulatorData46.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData49 = new opssat.simulator.util.SimulatorData(
        17, date48);
    opssat.simulator.util.SimulatorData simulatorData52 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date53 = simulatorData52.getCurrentTime();
    int int54 = opssat.simulator.util.DateExtraction.getDayFromDate(date53);
    opssat.simulator.util.SimulatorData simulatorData56 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date57 = simulatorData56.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData59 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date60 = simulatorData59.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap61 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date57, date60);
    opssat.simulator.util.SimulatorHeader simulatorHeader62 =
        new opssat.simulator.util.SimulatorHeader(
            false, date53, date60);
    opssat.simulator.util.SimulatorHeader simulatorHeader63 =
        new opssat.simulator.util.SimulatorHeader(
            false, date48, date53);
    opssat.simulator.util.SimulatorData simulatorData67 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date68 = simulatorData67.getCurrentTime();
    java.util.Date date69 = simulatorData67.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData70 = new opssat.simulator.util.SimulatorData(
        17, date69);
    opssat.simulator.util.SimulatorData simulatorData73 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date74 = simulatorData73.getCurrentTime();
    int int75 = opssat.simulator.util.DateExtraction.getDayFromDate(date74);
    opssat.simulator.util.SimulatorData simulatorData77 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date78 = simulatorData77.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData80 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date81 = simulatorData80.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap82 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date78, date81);
    opssat.simulator.util.SimulatorHeader simulatorHeader83 =
        new opssat.simulator.util.SimulatorHeader(
            false, date74, date81);
    opssat.simulator.util.SimulatorHeader simulatorHeader84 =
        new opssat.simulator.util.SimulatorHeader(
            false, date69, date74);
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap85 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date53, date69);
    int int86 = octetList1.lastIndexOf(date69);
    opssat.simulator.util.SimulatorData simulatorData89 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date90 = simulatorData89.getCurrentTime();
    int int91 = opssat.simulator.util.DateExtraction.getDayFromDate(date90);
    int int92 = opssat.simulator.util.DateExtraction.getHourFromDate(date90);
    opssat.simulator.util.SimulatorData simulatorData93 = new opssat.simulator.util.SimulatorData(
        48, date90);
    java.util.Date date94 = simulatorData93.getCurrentTime();
    opssat.simulator.util.SimulatorHeader simulatorHeader95 =
        new opssat.simulator.util.SimulatorHeader(
            false, date69, date94);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2.equals((-7)));
    org.junit.Assert.assertNotNull(uShort3);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-7) + "'", int5.equals((-7)));
    org.junit.Assert.assertNotNull(uShort6);
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9.equals((-7)));
    org.junit.Assert.assertNotNull(uShort10);
    org.junit.Assert.assertNotNull(byteItor11);
    org.junit.Assert.assertNotNull(uShort14);
    org.junit.Assert.assertNotNull(booleanArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    org.junit.Assert.assertNotNull(booleanItor22);
    org.junit.Assert.assertNotNull(booleanSpliterator23);
    org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-7) + "'", int25.equals((-7)));
    org.junit.Assert.assertNotNull(obj26);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-7) + "'", int30.equals((-7)));
    org.junit.Assert.assertNotNull(uShort31);
    org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-7) + "'", int33.equals((-7)));
    org.junit.Assert.assertNotNull(uShort34);
    org.junit.Assert.assertNotNull(uOctet35);
    org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-7) + "'", int37.equals((-7)));
    org.junit.Assert.assertNotNull(uShort38);
    org.junit.Assert.assertNotNull(octetListArray39);
    org.junit.Assert.assertNotNull(octetListArray40);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + 281475010265081L + "'",
        long42.equals(281475010265081L));
    org.junit.Assert.assertNotNull(date47);
    org.junit.Assert.assertNotNull(date48);
    org.junit.Assert.assertNotNull(date53);
    org.junit.Assert.assertNotNull(date57);
    org.junit.Assert.assertNotNull(date60);
    org.junit.Assert.assertNotNull(timeUnitMap61);
    org.junit.Assert.assertNotNull(date68);
    org.junit.Assert.assertNotNull(date69);
    org.junit.Assert.assertNotNull(date74);
    org.junit.Assert.assertNotNull(date78);
    org.junit.Assert.assertNotNull(date81);
    org.junit.Assert.assertNotNull(timeUnitMap82);
    org.junit.Assert.assertNotNull(timeUnitMap85);
    org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    org.junit.Assert.assertNotNull(date90);
    org.junit.Assert.assertNotNull(date94);
  }

  @Test
  public void test0288() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0288");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long2 = simulatorData1.getCurrentTimeMillis();
    java.lang.String str3 = simulatorData1.getCurrentDay();
    java.lang.String str4 = simulatorData1.getUTCCurrentTime2();
    simulatorData1.setTimeFactor((short) 100);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
  }

  @Test
  public void test0289() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0289");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date2 = simulatorData1.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData4 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date5 = simulatorData4.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap6 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date2, date5);
    int int7 = opssat.simulator.util.DateExtraction.getHourFromDate(date2);
    int int8 = opssat.simulator.util.DateExtraction.getHourFromDate(date2);
    int int9 = opssat.simulator.util.DateExtraction.getMinuteFromDate(date2);
    org.junit.Assert.assertNotNull(date2);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(timeUnitMap6);
  }

  @Test
  public void test0290() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0290");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    int int8 = simulatorSpacecraftState3.getSatsInView();
    simulatorSpacecraftState3.setAltitude((-5));
    double double11 = simulatorSpacecraftState3.getLatitude();
    simulatorSpacecraftState3.setSatsInView((byte) -1);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState17 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray20 = new float[]{28, 8};
    simulatorSpacecraftState17.setQ(floatArray20);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState25 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double26 = simulatorSpacecraftState25.getLatitude();
    java.lang.String str27 = simulatorSpacecraftState25.getMagField();
    float[] floatArray28 = simulatorSpacecraftState25.getR();
    simulatorSpacecraftState17.setQ(floatArray28);
    java.lang.String str30 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray28);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState34 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double35 = simulatorSpacecraftState34.getLatitude();
    double double36 = simulatorSpacecraftState34.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState40 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double41 = simulatorSpacecraftState40.getLatitude();
    java.lang.String str42 = simulatorSpacecraftState40.getMagField();
    float[] floatArray43 = simulatorSpacecraftState40.getR();
    simulatorSpacecraftState34.setQ(floatArray43);
    float[] floatArray45 = simulatorSpacecraftState34.getV();
    opssat.simulator.celestia.CelestiaData celestiaData46 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray28, floatArray45);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState50 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double51 = simulatorSpacecraftState50.getLatitude();
    double double52 = simulatorSpacecraftState50.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState56 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double57 = simulatorSpacecraftState56.getLatitude();
    java.lang.String str58 = simulatorSpacecraftState56.getMagField();
    float[] floatArray59 = simulatorSpacecraftState56.getR();
    simulatorSpacecraftState50.setQ(floatArray59);
    celestiaData46.setQ(floatArray59);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState65 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray68 = new float[]{28, 8};
    simulatorSpacecraftState65.setQ(floatArray68);
    float[] floatArray70 = simulatorSpacecraftState65.getQ();
    double double71 = simulatorSpacecraftState65.getLongitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState75 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray78 = new float[]{28, 8};
    simulatorSpacecraftState75.setQ(floatArray78);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState83 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double84 = simulatorSpacecraftState83.getLatitude();
    java.lang.String str85 = simulatorSpacecraftState83.getMagField();
    float[] floatArray86 = simulatorSpacecraftState83.getR();
    simulatorSpacecraftState75.setQ(floatArray86);
    java.lang.String str88 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray86);
    simulatorSpacecraftState65.setRv(floatArray86);
    opssat.simulator.celestia.CelestiaData celestiaData90 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray59, floatArray86);
    simulatorSpacecraftState3.setQ(floatArray59);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 340.0d + "'", double11 == 340.0d);
    org.junit.Assert.assertNotNull(floatArray20);
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 340.0d + "'", double26 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str27 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str27.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray28);
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "UnknownGUIData" + "'",
        str30.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + 340.0d + "'", double35 == 340.0d);
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + 340.0d + "'", double36 == 340.0d);
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + 340.0d + "'", double41 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str42 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str42.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray43);
    org.junit.Assert.assertNotNull(floatArray45);
    org.junit.Assert.assertTrue("'" + double51 + "' != '" + 340.0d + "'", double51 == 340.0d);
    org.junit.Assert.assertTrue("'" + double52 + "' != '" + 340.0d + "'", double52 == 340.0d);
    org.junit.Assert.assertTrue("'" + double57 + "' != '" + 340.0d + "'", double57 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str58 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str58.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray59);
    org.junit.Assert.assertNotNull(floatArray68);
    org.junit.Assert.assertNotNull(floatArray70);
    org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
    org.junit.Assert.assertNotNull(floatArray78);
    org.junit.Assert.assertTrue("'" + double84 + "' != '" + 340.0d + "'", double84 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str85 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str85.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray86);
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + "UnknownGUIData" + "'",
        str88.equals("UnknownGUIData"));
  }

  @Test
  public void test0291() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0291");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    simulatorHeader12.setAutoStartSystem(true);
    simulatorHeader12.setOrekitPropagator("00000:00:00:00:010");
    simulatorHeader12.setOrekitPropagator("*36");
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
  }

  @Test
  public void test0292() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0292");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long2 = simulatorData1.getCurrentTimeMillis();
    java.lang.String str3 = simulatorData1.getCurrentDay();
    java.lang.String str4 = simulatorData1.getUTCCurrentTime2();
    java.lang.String str5 = simulatorData1.getCurrentDay();
    simulatorData1.setMethodsExecuted(0);
    simulatorData1.feedTimeElapsed(40);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
  }

  @Test
  public void test0293() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0293");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    int int5 = opssat.simulator.util.DateExtraction.getHourFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(48,
        date3);
    boolean boolean7 = simulatorData6.isTimeRunning();
    java.util.Date date8 = simulatorData6.getCurrentTime();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(date8);
  }

  @Test
  public void test0295() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0295");
    }
    java.lang.String str1 = opssat.simulator.threading.SimulatorNode.calcNMEAChecksum("*03");
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "*03" + "'", str1.equals("*03"));
  }

  @Test
  public void test0296() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0296");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    boolean boolean16 = simulatorHeader12.isUseCelestia();
    int int17 = simulatorHeader12.getDayStartDate();
    simulatorHeader12.setAutoStartTime(false);
    java.lang.String str20 = simulatorHeader12.getOrekitTLE1();
    simulatorHeader12.setOrekitTLE1("[10, 10, -1]");
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNull(str20);
  }

  @Test
  public void test0298() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0298");
    }
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience8 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 17, 100.0f, 48, 100.0f, (-1.0d), 64, 281474993487874L);
    double double9 = gPSSatInViewScience8.getMaxDistance();
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 17.0d + "'", double9 == 17.0d);
  }

  @Test
  public void test0299() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0299");
    }
    org.ccsds.moims.mo.mal.structures.StringList stringList1 =
        new org.ccsds.moims.mo.mal.structures.StringList(
            36);
    java.lang.Byte[] byteArray6 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList7 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean8 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList7, byteArray6);
    java.lang.Integer[] intArray11 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean13 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
    boolean boolean14 = byteList7.retainAll(intList12);
    int int15 = stringList1.indexOf(intList12);
    java.util.stream.Stream<java.lang.String> strStream16 = stringList1.stream();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray23 = new float[]{28, 8};
    simulatorSpacecraftState20.setQ(floatArray23);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState28 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double29 = simulatorSpacecraftState28.getLatitude();
    java.lang.String str30 = simulatorSpacecraftState28.getMagField();
    float[] floatArray31 = simulatorSpacecraftState28.getR();
    simulatorSpacecraftState20.setQ(floatArray31);
    java.lang.String str33 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray31);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState37 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double38 = simulatorSpacecraftState37.getLatitude();
    double double39 = simulatorSpacecraftState37.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState43 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double44 = simulatorSpacecraftState43.getLatitude();
    java.lang.String str45 = simulatorSpacecraftState43.getMagField();
    float[] floatArray46 = simulatorSpacecraftState43.getR();
    simulatorSpacecraftState37.setQ(floatArray46);
    float[] floatArray48 = simulatorSpacecraftState37.getV();
    opssat.simulator.celestia.CelestiaData celestiaData49 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray31, floatArray48);
    float[] floatArray50 = celestiaData49.getQ();
    opssat.simulator.util.SimulatorData simulatorData54 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date55 = simulatorData54.getCurrentTime();
    int int56 = opssat.simulator.util.DateExtraction.getDayFromDate(date55);
    opssat.simulator.util.SimulatorData simulatorData58 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date59 = simulatorData58.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData61 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date62 = simulatorData61.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap63 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date59, date62);
    opssat.simulator.util.SimulatorHeader simulatorHeader64 =
        new opssat.simulator.util.SimulatorHeader(
            false, date55, date62);
    opssat.simulator.util.SimulatorData simulatorData65 = new opssat.simulator.util.SimulatorData(
        (short) 0, date55);
    celestiaData49.setDate(date55);
    int int67 = celestiaData49.getSeconds();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState71 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray74 = new float[]{28, 8};
    simulatorSpacecraftState71.setQ(floatArray74);
    celestiaData49.setQ(floatArray74);
    boolean boolean77 = stringList1.remove(celestiaData49);
    java.lang.Integer int78 = stringList1.getTypeShortForm();
    org.junit.Assert.assertNotNull(byteArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertNotNull(intArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    org.junit.Assert.assertNotNull(strStream16);
    org.junit.Assert.assertNotNull(floatArray23);
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 340.0d + "'", double29 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str30 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str30.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "UnknownGUIData" + "'",
        str33.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + 340.0d + "'", double38 == 340.0d);
    org.junit.Assert.assertTrue("'" + double39 + "' != '" + 340.0d + "'", double39 == 340.0d);
    org.junit.Assert.assertTrue("'" + double44 + "' != '" + 340.0d + "'", double44 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str45 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str45.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray46);
    org.junit.Assert.assertNotNull(floatArray48);
    org.junit.Assert.assertNotNull(floatArray50);
    org.junit.Assert.assertNotNull(date55);
    org.junit.Assert.assertNotNull(date59);
    org.junit.Assert.assertNotNull(date62);
    org.junit.Assert.assertNotNull(timeUnitMap63);
    org.junit.Assert.assertNotNull(floatArray74);
    org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-15) + "'", int78.equals((-15)));
  }

  @Test
  public void test0300() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0300");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    opssat.simulator.util.SimulatorData simulatorData17 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date18 = simulatorData17.getCurrentTime();
    java.util.Date date19 = simulatorData17.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData20 = new opssat.simulator.util.SimulatorData(
        17, date19);
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    int int25 = opssat.simulator.util.DateExtraction.getDayFromDate(date24);
    opssat.simulator.util.SimulatorData simulatorData27 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date28 = simulatorData27.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData30 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date31 = simulatorData30.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap32 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date28, date31);
    opssat.simulator.util.SimulatorHeader simulatorHeader33 =
        new opssat.simulator.util.SimulatorHeader(
            false, date24, date31);
    opssat.simulator.util.SimulatorHeader simulatorHeader34 =
        new opssat.simulator.util.SimulatorHeader(
            false, date19, date24);
    simulatorHeader12.setEndDate(date19);
    int int36 = simulatorHeader12.getCelestiaPort();
    boolean boolean37 = simulatorHeader12.isUseOrekitPropagator();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertNotNull(date18);
    org.junit.Assert.assertNotNull(date19);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(date28);
    org.junit.Assert.assertNotNull(date31);
    org.junit.Assert.assertNotNull(timeUnitMap32);
    org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
  }

  @Test
  public void test0301() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0301");
    }
    java.lang.Float[] floatArray3 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList4 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean5 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList4, floatArray3);
    boolean boolean7 = floatList4.add((-1.0f));
    floatList4.clear();
    boolean boolean9 = floatList4.isEmpty();
    java.util.ListIterator<java.lang.Float> floatItor10 = floatList4.listIterator();
    floatList4.ensureCapacity((-11));
    java.lang.Object obj13 = floatList4.clone();
    org.ccsds.moims.mo.mal.structures.OctetList octetList14 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int15 = octetList14.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort16 = octetList14.getServiceNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList17 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int18 = octetList17.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort19 = octetList17.getAreaNumber();
    java.lang.Object[] objArray20 = octetList17.toArray();
    org.ccsds.moims.mo.mal.structures.OctetList octetList21 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int22 = octetList21.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort23 = octetList21.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor24 = octetList21.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor26 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList21, "hi!");
    org.ccsds.moims.mo.mal.structures.UShort uShort27 = octetList21.getAreaNumber();
    java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList31 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean32 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList31, booleanArray30);
    int int34 = booleanList31.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor35 = booleanList31.iterator();
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator36 = booleanList31.spliterator();
    org.ccsds.moims.mo.mal.structures.OctetList octetList37 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int38 = octetList37.getTypeShortForm();
    java.lang.Object obj39 = octetList37.clone();
    octetList37.trimToSize();
    boolean boolean41 = booleanList31.contains(octetList37);
    org.ccsds.moims.mo.mal.structures.OctetList octetList42 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int43 = octetList42.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort44 = octetList42.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList45 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int46 = octetList45.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort47 = octetList45.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet48 = octetList45.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.OctetList octetList49 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int50 = octetList49.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort51 = octetList49.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray52 =
        new org.ccsds.moims.mo.mal.structures.OctetList[]{
          octetList17, octetList21, octetList37, octetList42, octetList45, octetList49};
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray53 = octetList14
        .toArray(octetListArray52);
    org.ccsds.moims.mo.mal.structures.UOctet uOctet54 = octetList14.getAreaVersion();
    int int55 = floatList4.lastIndexOf(octetList14);
    java.lang.String str56 = octetList14.toString();
    org.junit.Assert.assertNotNull(floatArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNotNull(floatItor10);
    org.junit.Assert.assertNotNull(obj13);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15.equals((-7)));
    org.junit.Assert.assertNotNull(uShort16);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18.equals((-7)));
    org.junit.Assert.assertNotNull(uShort19);
    org.junit.Assert.assertNotNull(objArray20);
    org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-7) + "'", int22.equals((-7)));
    org.junit.Assert.assertNotNull(uShort23);
    org.junit.Assert.assertNotNull(byteItor24);
    org.junit.Assert.assertNotNull(uShort27);
    org.junit.Assert.assertNotNull(booleanArray30);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    org.junit.Assert.assertNotNull(booleanItor35);
    org.junit.Assert.assertNotNull(booleanSpliterator36);
    org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-7) + "'", int38.equals((-7)));
    org.junit.Assert.assertNotNull(obj39);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-7) + "'", int43.equals((-7)));
    org.junit.Assert.assertNotNull(uShort44);
    org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-7) + "'", int46.equals((-7)));
    org.junit.Assert.assertNotNull(uShort47);
    org.junit.Assert.assertNotNull(uOctet48);
    org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-7) + "'", int50.equals((-7)));
    org.junit.Assert.assertNotNull(uShort51);
    org.junit.Assert.assertNotNull(octetListArray52);
    org.junit.Assert.assertNotNull(octetListArray53);
    org.junit.Assert.assertNotNull(uOctet54);
    org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "[]" + "'", str56.equals("[]"));
  }

  @Test
  public void test0302() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0302");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    simulatorHeader12.setOrekitTLE1("");
    java.util.Date date17 = simulatorHeader12.parseStringIntoDate("2019/05/23-15:09:35");
    java.lang.String str18 = simulatorHeader12.toFileString();
    java.util.Date date19 = simulatorHeader12.getEndDate();
    org.ccsds.moims.mo.mal.structures.Duration duration21 =
        new org.ccsds.moims.mo.mal.structures.Duration(
            0.0d);
    org.ccsds.moims.mo.mal.structures.UOctet uOctet22 = duration21.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.UShort uShort23 = duration21.getAreaNumber();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState27 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray30 = new float[]{28, 8};
    simulatorSpacecraftState27.setQ(floatArray30);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState35 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double36 = simulatorSpacecraftState35.getLatitude();
    java.lang.String str37 = simulatorSpacecraftState35.getMagField();
    float[] floatArray38 = simulatorSpacecraftState35.getR();
    simulatorSpacecraftState27.setQ(floatArray38);
    java.lang.String str40 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray38);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState44 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double45 = simulatorSpacecraftState44.getLatitude();
    double double46 = simulatorSpacecraftState44.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState50 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double51 = simulatorSpacecraftState50.getLatitude();
    java.lang.String str52 = simulatorSpacecraftState50.getMagField();
    float[] floatArray53 = simulatorSpacecraftState50.getR();
    simulatorSpacecraftState44.setQ(floatArray53);
    float[] floatArray55 = simulatorSpacecraftState44.getV();
    opssat.simulator.celestia.CelestiaData celestiaData56 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray38, floatArray55);
    float[] floatArray57 = celestiaData56.getQ();
    opssat.simulator.util.SimulatorData simulatorData61 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date62 = simulatorData61.getCurrentTime();
    int int63 = opssat.simulator.util.DateExtraction.getDayFromDate(date62);
    opssat.simulator.util.SimulatorData simulatorData65 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date66 = simulatorData65.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData68 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date69 = simulatorData68.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap70 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date66, date69);
    opssat.simulator.util.SimulatorHeader simulatorHeader71 =
        new opssat.simulator.util.SimulatorHeader(
            false, date62, date69);
    opssat.simulator.util.SimulatorData simulatorData72 = new opssat.simulator.util.SimulatorData(
        (short) 0, date62);
    celestiaData56.setDate(date62);
    boolean boolean74 = duration21.equals(date62);
    simulatorHeader12.setStartDate(date62);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertNull(date17);
    org.junit.Assert.assertNotNull(date19);
    org.junit.Assert.assertNotNull(uOctet22);
    org.junit.Assert.assertNotNull(uShort23);
    org.junit.Assert.assertNotNull(floatArray30);
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + 340.0d + "'", double36 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str37 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str37.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray38);
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "UnknownGUIData" + "'",
        str40.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double45 + "' != '" + 340.0d + "'", double45 == 340.0d);
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + 340.0d + "'", double46 == 340.0d);
    org.junit.Assert.assertTrue("'" + double51 + "' != '" + 340.0d + "'", double51 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str52 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str52.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray53);
    org.junit.Assert.assertNotNull(floatArray55);
    org.junit.Assert.assertNotNull(floatArray57);
    org.junit.Assert.assertNotNull(date62);
    org.junit.Assert.assertNotNull(date66);
    org.junit.Assert.assertNotNull(date69);
    org.junit.Assert.assertNotNull(timeUnitMap70);
    org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
  }

  @Test
  public void test0303() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0303");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    java.lang.String str5 = simulatorSpacecraftState3.getMagField();
    simulatorSpacecraftState3.setLatitude((-4));
    java.lang.String str8 = simulatorSpacecraftState3.getMagField();
    simulatorSpacecraftState3.setSatsInView((-4));
    java.lang.String str11 = simulatorSpacecraftState3.getMagnetometerAsString();
    float[] floatArray12 = simulatorSpacecraftState3.getRv();
    java.lang.String str13 = simulatorSpacecraftState3.getModeOperation();
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str5 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str5.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str8 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str8.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str11 + "' != '" + "X:[+00000.00] ; Y:[+00000.00] ; Z: [+00000.00] units [nT]" + "'",
        str11.equals("X:[+00000.00] ; Y:[+00000.00] ; Z: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray12);
    org.junit.Assert.assertNull(str13);
  }

  @Test
  public void test0304() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0304");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    simulatorHeader12.setTimeFactor(64);
    java.util.Date date15 = simulatorHeader12.getEndDate();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date15);
  }

  @Test
  public void test0305() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0305");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    double double5 = simulatorSpacecraftState3.getLongitude();
    java.lang.String str6 = simulatorSpacecraftState3.getModeOperation();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState10 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    simulatorSpacecraftState10.setLongitude(4);
    double[] doubleArray14 = new double[]{(-1.0f)};
    simulatorSpacecraftState10.setMagField(doubleArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState19 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double20 = simulatorSpacecraftState19.getLatitude();
    java.lang.String str21 = simulatorSpacecraftState19.getMagField();
    java.lang.String str22 = simulatorSpacecraftState19.toString();
    double[] doubleArray23 = simulatorSpacecraftState19.getSunVector();
    simulatorSpacecraftState10.setMagnetometer(doubleArray23);
    simulatorSpacecraftState3.setMagField(doubleArray23);
    simulatorSpacecraftState3.setModeOperation("0");
    simulatorSpacecraftState3.setModeOperation("030936.762");
    simulatorSpacecraftState3.setAltitude(60);
    simulatorSpacecraftState3.setAltitude(8);
    java.lang.String str34 = simulatorSpacecraftState3.getMagField();
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    org.junit.Assert.assertNull(str6);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 340.0d + "'", double20 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str21 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str21.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str22 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str22.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertTrue(
        "'" + str34 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str34.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
  }

  @Test
  public void test0307() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0307");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.lang.String str13 = simulatorHeader12.getEndDateString();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    int int18 = opssat.simulator.util.DateExtraction.getDayFromDate(date17);
    opssat.simulator.util.SimulatorData simulatorData20 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date21 = simulatorData20.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap25 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date21, date24);
    opssat.simulator.util.SimulatorHeader simulatorHeader26 =
        new opssat.simulator.util.SimulatorHeader(
            false, date17, date24);
    java.util.Date date27 = simulatorHeader26.getEndDate();
    boolean boolean28 = simulatorHeader26.isAutoStartSystem();
    int int29 = simulatorHeader26.getDayStartDate();
    boolean boolean30 = simulatorHeader26.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData33 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date34 = simulatorData33.getCurrentTime();
    int int35 = opssat.simulator.util.DateExtraction.getDayFromDate(date34);
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData40 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date41 = simulatorData40.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap42 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date38, date41);
    opssat.simulator.util.SimulatorHeader simulatorHeader43 =
        new opssat.simulator.util.SimulatorHeader(
            false, date34, date41);
    simulatorHeader26.setStartDate(date41);
    simulatorHeader12.setStartDate(date41);
    simulatorHeader12.setAutoStartTime(false);
    simulatorHeader12.setOrekitTLE2("2.81475010265081E14");
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(date21);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(timeUnitMap25);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(date34);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date41);
    org.junit.Assert.assertNotNull(timeUnitMap42);
  }

  @Test
  public void test0308() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0308");
    }
    org.ccsds.moims.mo.mal.structures.URI uRI1 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    java.lang.Integer int2 = uRI1.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.URI uRI4 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.UOctet uOctet5 = uRI4.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.URI uRI7 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.URI[] uRIArray8 = new org.ccsds.moims.mo.mal.structures.URI[]{
      uRI1, uRI4, uRI7};
    java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI> uRIList9 =
        new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI>();
    boolean boolean10 = java.util.Collections
        .addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.URI>) uRIList9, uRIArray8);
    org.ccsds.moims.mo.mal.structures.FineTime fineTime11 =
        new org.ccsds.moims.mo.mal.structures.FineTime();
    int int12 = uRIList9.indexOf(fineTime11);
    long long13 = fineTime11.getValue();
    java.lang.Integer int14 = fineTime11.getTypeShortForm();
    opssat.simulator.util.ArgumentTemplate argumentTemplate17 =
        new opssat.simulator.util.ArgumentTemplate(
            "030936.762", "-100.0000");
    boolean boolean18 = fineTime11.equals("-100.0000");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2.equals(18));
    org.junit.Assert.assertNotNull(uOctet5);
    org.junit.Assert.assertNotNull(uRIArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 17 + "'", int14.equals(17));
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
  }

  @Test
  public void test0309() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0309");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    simulatorHeader20.setUpdateInternet(true);
    int int23 = simulatorHeader20.getHourStartDate();
    simulatorHeader20.setOrekitPropagator(
        "#Run the processing of internal models\nstartModels=false\n#Increment the simulated time (depends on startModels)\nstartTime=false\n#Speed up of time factor\ntimeFactor=1\n#Kepler elements for orbit A[km];E;i[deg];RAAN[deg];ARG_PER[deg];TRUE_A[deg] 7021.0;0.0;98.05;340.0;0.0;0.0\nkeplerElements=7021.0;0.0;98.05;340.0;0.0;0.0\n#Enable the Orekit library\norekit=false\n#Enable updates from Internet (used for gps constellation TLEs)\nupdateFromInternet=false\n#Configuration of the Celestia server\ncelestia=false\ncelestiaPort=0\n#Start and end dates of simulation\nstartDate=2019:05:23 15:09:54 UTC\nendDate=2019:05:23 15:09:54 UTC\n#Logging level to files found in $USER_HOME/.ops-sat-simulator/\n#Possible values SEVERE,INFO,FINE,FINER,FINEST,ALL\ncentralLogLevel=INFO\nsimulatorLogLevel=INFO\nconsoleLogLevel=INFO");
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
  }

  @Test
  public void test0310() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0310");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    java.lang.String str14 = simulatorHeader12.getOrekitTLE2();
    int int15 = simulatorHeader12.getMinuteStartDate();
    java.util.Date date16 = simulatorHeader12.getEndDate();
    boolean boolean17 = simulatorHeader12.isAutoStartTime();
    java.lang.String str18 = simulatorHeader12.getEndDateString();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertNotNull(date16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
  }

  @Test
  public void test0311() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0311");
    }
    java.util.logging.Logger logger0 = null;
    opssat.simulator.util.EndlessSingleStreamOperatingBuffer endlessSingleStreamOperatingBuffer1 =
        new opssat.simulator.util.EndlessSingleStreamOperatingBuffer(
            logger0);
    byte[] byteArray3 = endlessSingleStreamOperatingBuffer1.getDataAsByteArray('4');
    org.ccsds.moims.mo.mal.structures.Union union5 = new org.ccsds.moims.mo.mal.structures.Union(
        "$DEFAULT");
    endlessSingleStreamOperatingBuffer1.setDataBuffer("$DEFAULT");
    byte[] byteArray8 = opssat.simulator.peripherals.PFineADCS.FWRefFineADCS.float2ByteArray(20);
    endlessSingleStreamOperatingBuffer1.setDataFromByteArray(byteArray8);
    try {
      double double11 = opssat.simulator.peripherals.PFineADCS.FWRefFineADCS
          .getDoubleFromByteArray(byteArray8, 12);
      org.junit.Assert
          .fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
    } catch (java.lang.IndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(byteArray3);
    org.junit.Assert.assertNotNull(byteArray8);
  }

  @Test
  public void test0312() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0312");
    }
    java.lang.String str1 = opssat.simulator.util.SimulatorSchedulerPiece
        .getDDDDDHHMMSSmmmFromMillis(10);
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000:00:00:00:010" + "'",
        str1.equals("00000:00:00:00:010"));
  }

  @Test
  public void test0313() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0313");
    }
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience8 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            62, 281474993487887L, 281474993487878L, 11111.0d, 281475010265070L, 70, 'a',
            281475010265078L);
    double double9 = gPSSatInViewScience8.getStdDevDistance();
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
  }

  @Test
  public void test0314() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0314");
    }
    org.ccsds.moims.mo.mal.structures.IntegerList integerList1 =
        new org.ccsds.moims.mo.mal.structures.IntegerList(
            48);
    java.lang.Long long2 = integerList1.getShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort3 = integerList1.getAreaNumber();
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece7 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            'a', 11, "");
    boolean boolean8 = integerList1.contains(11);
    org.ccsds.moims.mo.mal.structures.UOctet uOctet9 = integerList1.getAreaVersion();
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 281475010265077L + "'",
        long2.equals(281475010265077L));
    org.junit.Assert.assertNotNull(uShort3);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(uOctet9);
  }

  @Test
  public void test0315() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0315");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    simulatorSpacecraftState3.setLatitude((-4));
    double double6 = simulatorSpacecraftState3.getLatitude();
    simulatorSpacecraftState3.setAltitude(281475010265075L);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-4.0d) + "'", double6 == (-4.0d));
  }

  @Test
  public void test0316() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0316");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet3 = octetList0.getAreaVersion();
    opssat.simulator.util.wav.WavFileException wavFileException5 =
        new opssat.simulator.util.wav.WavFileException(
            "UnknownGUIData");
    java.lang.Throwable[] throwableArray6 = wavFileException5.getSuppressed();
    boolean boolean7 = octetList0.equals(wavFileException5);
    org.ccsds.moims.mo.mal.structures.Time time9 = new org.ccsds.moims.mo.mal.structures.Time('4');
    long long10 = time9.getValue();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet11 = time9.getAreaVersion();
    boolean boolean12 = octetList0.contains(uOctet11);
    java.util.stream.Stream<java.lang.Byte> byteStream13 = octetList0.stream();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(uOctet3);
    org.junit.Assert.assertNotNull(throwableArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
    org.junit.Assert.assertNotNull(uOctet11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(byteStream13);
  }

  @Test
  public void test0317() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0317");
    }
    opssat.simulator.util.SimulatorDeviceData simulatorDeviceData1 =
        new opssat.simulator.util.SimulatorDeviceData(
            "");
    java.util.LinkedList<opssat.simulator.util.ArgumentDescriptor> argumentDescriptorList2 =
        simulatorDeviceData1
            .getDataList();
    org.junit.Assert.assertNotNull(argumentDescriptorList2);
  }

  @Test
  public void test0318() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0318");
    }
    opssat.simulator.util.wav.WavFileException wavFileException1 =
        new opssat.simulator.util.wav.WavFileException(
            "*30");
  }

  @Test
  public void test0319() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0319");
    }
    org.ccsds.moims.mo.mal.structures.Identifier identifier0 =
        new org.ccsds.moims.mo.mal.structures.Identifier();
    org.ccsds.moims.mo.mal.structures.UShort uShort1 = identifier0.getServiceNumber();
    org.ccsds.moims.mo.mal.structures.ULong uLong2 = new org.ccsds.moims.mo.mal.structures.ULong();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet3 = uLong2.getAreaVersion();
    boolean boolean4 = identifier0.equals(uOctet3);
    org.ccsds.moims.mo.mal.structures.Element element5 = identifier0.createElement();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState9 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray12 = new float[]{28, 8};
    simulatorSpacecraftState9.setQ(floatArray12);
    int int14 = simulatorSpacecraftState9.getSatsInView();
    simulatorSpacecraftState9.setAltitude((-5));
    float[] floatArray17 = simulatorSpacecraftState9.getV();
    boolean boolean18 = identifier0.equals(simulatorSpacecraftState9);
    org.junit.Assert.assertNotNull(uShort1);
    org.junit.Assert.assertNotNull(uOctet3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(element5);
    org.junit.Assert.assertNotNull(floatArray12);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    org.junit.Assert.assertNotNull(floatArray17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
  }

  @Test
  public void test0320() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0320");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.lang.String str13 = simulatorHeader12.getEndDateString();
    java.lang.String str14 = simulatorHeader12.toFileString();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
  }

  @Test
  public void test0321() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0321");
    }
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece3 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            13L, 0, "hi!");
    long long4 = simulatorSchedulerPiece3.getTime();
    int int5 = simulatorSchedulerPiece3.getInternalID();
    simulatorSchedulerPiece3.setExecuted(false);
    java.lang.String str8 = simulatorSchedulerPiece3.getFileString();
    java.lang.String str9 = simulatorSchedulerPiece3.getArgumentTemplateDescription();
    long long10 = simulatorSchedulerPiece3.getTime();
    int int11 = simulatorSchedulerPiece3.getInternalID();
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 13L + "'", long4 == 13L);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertTrue(
        "'" + str8 + "' != '" + "00000:00:00:00:013|0000000000000000013|0|hi!" + "'",
        str8.equals("00000:00:00:00:013|0000000000000000013|0|hi!"));
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 13L + "'", long10 == 13L);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
  }

  @Test
  public void test0322() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0322");
    }
    java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList3 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean4 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
    int int6 = booleanList3.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor7 = booleanList3.iterator();
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator8 = booleanList3.spliterator();
    java.lang.Integer[] intArray16 = new java.lang.Integer[]{13, 10, 100, 100, 11111, 13, 11111};
    java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean18 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
    java.lang.Byte[] byteArray23 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList24 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean25 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList24, byteArray23);
    java.lang.Integer[] intArray28 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean30 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
    boolean boolean31 = byteList24.retainAll(intList29);
    java.lang.Integer[] intArray34 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList35 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean36 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
    int int38 = intList35.lastIndexOf((byte) 10);
    boolean boolean39 = intList29.removeAll(intList35);
    boolean boolean40 = intList17.retainAll(intList35);
    java.lang.Float[] floatArray44 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList45 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean46 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList45, floatArray44);
    boolean boolean48 = floatList45.add((-1.0f));
    floatList45.trimToSize();
    java.lang.Integer[] intArray54 = new java.lang.Integer[]{100, 1, (-1), 10};
    java.util.ArrayList<java.lang.Integer> intList55 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean56 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
    int int58 = intList55.lastIndexOf((byte) 1);
    boolean boolean59 = floatList45.containsAll(intList55);
    boolean boolean60 = intList17.addAll(intList55);
    boolean boolean61 = booleanList3.removeAll(intList17);
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor63 =
        new opssat.simulator.util.ArgumentDescriptor(
            boolean61, "0.0");
    try {
      float float65 = argumentDescriptor63.getTypeAsFloatByIndex((byte) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to [F");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNotNull(booleanArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    org.junit.Assert.assertNotNull(booleanItor7);
    org.junit.Assert.assertNotNull(booleanSpliterator8);
    org.junit.Assert.assertNotNull(intArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertNotNull(byteArray23);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertNotNull(intArray28);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    org.junit.Assert.assertNotNull(intArray34);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(floatArray44);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    org.junit.Assert.assertNotNull(intArray54);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
  }

  @Test
  public void test0323() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0323");
    }
    org.ccsds.moims.mo.mal.structures.UInteger uInteger1 =
        new org.ccsds.moims.mo.mal.structures.UInteger(
            13);
    org.ccsds.moims.mo.mal.structures.Element element2 = uInteger1.createElement();
    java.lang.Long long3 = uInteger1.getShortForm();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            uInteger1, "Alive");
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.setName("foo");
    org.junit.Assert.assertNotNull(element2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 281474993487884L + "'",
        long3.equals(281474993487884L));
  }

  @Test
  public void test0325() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0325");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.lang.String str13 = simulatorHeader12.getEndDateString();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    int int18 = opssat.simulator.util.DateExtraction.getDayFromDate(date17);
    opssat.simulator.util.SimulatorData simulatorData20 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date21 = simulatorData20.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap25 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date21, date24);
    opssat.simulator.util.SimulatorHeader simulatorHeader26 =
        new opssat.simulator.util.SimulatorHeader(
            false, date17, date24);
    java.util.Date date27 = simulatorHeader26.getEndDate();
    boolean boolean28 = simulatorHeader26.isAutoStartSystem();
    int int29 = simulatorHeader26.getDayStartDate();
    boolean boolean30 = simulatorHeader26.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData33 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date34 = simulatorData33.getCurrentTime();
    int int35 = opssat.simulator.util.DateExtraction.getDayFromDate(date34);
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData40 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date41 = simulatorData40.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap42 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date38, date41);
    opssat.simulator.util.SimulatorHeader simulatorHeader43 =
        new opssat.simulator.util.SimulatorHeader(
            false, date34, date41);
    simulatorHeader26.setStartDate(date41);
    simulatorHeader12.setStartDate(date41);
    java.lang.String str46 = simulatorHeader12.toString();
    simulatorHeader12.setOrekitTLE1("2019:05:23 15:09:56 UTC");
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(date21);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(timeUnitMap25);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(date34);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date41);
    org.junit.Assert.assertNotNull(timeUnitMap42);
  }

  @Test
  public void test0326() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0326");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long2 = simulatorData1.getCurrentTimeMillis();
    java.lang.String str3 = simulatorData1.getCurrentDay();
    java.lang.String str4 = simulatorData1.getUTCCurrentTime2();
    simulatorData1.toggleSimulatorRunning();
    java.lang.String str6 = simulatorData1.getUTCCurrentTime();
    java.util.Date date7 = simulatorData1.getCurrentTime();
    simulatorData1.setTimeFactor(56);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertNotNull(date7);
  }

  @Test
  public void test0327() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0327");
    }
    org.ccsds.moims.mo.mal.structures.StringList stringList0 =
        new org.ccsds.moims.mo.mal.structures.StringList();
    java.util.Iterator<java.lang.String> strItor1 = stringList0.iterator();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet2 = stringList0.getAreaVersion();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState6 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray9 = new float[]{28, 8};
    simulatorSpacecraftState6.setQ(floatArray9);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState14 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double15 = simulatorSpacecraftState14.getLatitude();
    java.lang.String str16 = simulatorSpacecraftState14.getMagField();
    float[] floatArray17 = simulatorSpacecraftState14.getR();
    simulatorSpacecraftState6.setQ(floatArray17);
    java.lang.String str19 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray17);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState23 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double24 = simulatorSpacecraftState23.getLatitude();
    double double25 = simulatorSpacecraftState23.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState29 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double30 = simulatorSpacecraftState29.getLatitude();
    java.lang.String str31 = simulatorSpacecraftState29.getMagField();
    float[] floatArray32 = simulatorSpacecraftState29.getR();
    simulatorSpacecraftState23.setQ(floatArray32);
    float[] floatArray34 = simulatorSpacecraftState23.getV();
    opssat.simulator.celestia.CelestiaData celestiaData35 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray17, floatArray34);
    float[] floatArray36 = celestiaData35.getQ();
    opssat.simulator.util.SimulatorData simulatorData40 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date41 = simulatorData40.getCurrentTime();
    int int42 = opssat.simulator.util.DateExtraction.getDayFromDate(date41);
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData47 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date48 = simulatorData47.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap49 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date45, date48);
    opssat.simulator.util.SimulatorHeader simulatorHeader50 =
        new opssat.simulator.util.SimulatorHeader(
            false, date41, date48);
    opssat.simulator.util.SimulatorData simulatorData51 = new opssat.simulator.util.SimulatorData(
        (short) 0, date41);
    celestiaData35.setDate(date41);
    int int53 = celestiaData35.getSeconds();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState57 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray60 = new float[]{28, 8};
    simulatorSpacecraftState57.setQ(floatArray60);
    celestiaData35.setQ(floatArray60);
    int int63 = stringList0.lastIndexOf(celestiaData35);
    int int64 = celestiaData35.getMonths();
    org.junit.Assert.assertNotNull(strItor1);
    org.junit.Assert.assertNotNull(uOctet2);
    org.junit.Assert.assertNotNull(floatArray9);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 340.0d + "'", double15 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str16 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str16.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray17);
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "UnknownGUIData" + "'",
        str19.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 340.0d + "'", double24 == 340.0d);
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 340.0d + "'", double25 == 340.0d);
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 340.0d + "'", double30 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str31 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str31.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray32);
    org.junit.Assert.assertNotNull(floatArray34);
    org.junit.Assert.assertNotNull(floatArray36);
    org.junit.Assert.assertNotNull(date41);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(date48);
    org.junit.Assert.assertNotNull(timeUnitMap49);
    org.junit.Assert.assertNotNull(floatArray60);
    org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
  }

  @Test
  public void test0328() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0328");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    int int50 = celestiaData32.getMonths();
    int int51 = celestiaData32.getMinutes();
    int int52 = celestiaData32.getMonths();
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
  }

  @Test
  public void test0329() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0329");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long3 = simulatorData2.getCurrentTimeMillis();
    java.lang.String str4 = simulatorData2.getCurrentDay();
    java.lang.String str5 = simulatorData2.getUTCCurrentTime2();
    simulatorData2.toggleSimulatorRunning();
    java.lang.String str7 = simulatorData2.getUTCCurrentTime();
    java.util.Date date8 = simulatorData2.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData12 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date13 = simulatorData12.getCurrentTime();
    java.util.Date date14 = simulatorData12.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData15 = new opssat.simulator.util.SimulatorData(
        17, date14);
    opssat.simulator.util.SimulatorData simulatorData18 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date19 = simulatorData18.getCurrentTime();
    int int20 = opssat.simulator.util.DateExtraction.getDayFromDate(date19);
    opssat.simulator.util.SimulatorData simulatorData22 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date23 = simulatorData22.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData25 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date26 = simulatorData25.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap27 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date23, date26);
    opssat.simulator.util.SimulatorHeader simulatorHeader28 =
        new opssat.simulator.util.SimulatorHeader(
            false, date19, date26);
    opssat.simulator.util.SimulatorHeader simulatorHeader29 =
        new opssat.simulator.util.SimulatorHeader(
            false, date14, date19);
    opssat.simulator.util.SimulatorData simulatorData33 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date34 = simulatorData33.getCurrentTime();
    java.util.Date date35 = simulatorData33.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData36 = new opssat.simulator.util.SimulatorData(
        17, date35);
    opssat.simulator.util.SimulatorData simulatorData39 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date40 = simulatorData39.getCurrentTime();
    int int41 = opssat.simulator.util.DateExtraction.getDayFromDate(date40);
    opssat.simulator.util.SimulatorData simulatorData43 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date44 = simulatorData43.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData46 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date47 = simulatorData46.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap48 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date44, date47);
    opssat.simulator.util.SimulatorHeader simulatorHeader49 =
        new opssat.simulator.util.SimulatorHeader(
            false, date40, date47);
    opssat.simulator.util.SimulatorHeader simulatorHeader50 =
        new opssat.simulator.util.SimulatorHeader(
            false, date35, date40);
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap51 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date19, date35);
    opssat.simulator.util.SimulatorHeader simulatorHeader52 =
        new opssat.simulator.util.SimulatorHeader(
            true, date8, date35);
    int int53 = opssat.simulator.util.DateExtraction.getYearFromDate(date8);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date19);
    org.junit.Assert.assertNotNull(date23);
    org.junit.Assert.assertNotNull(date26);
    org.junit.Assert.assertNotNull(timeUnitMap27);
    org.junit.Assert.assertNotNull(date34);
    org.junit.Assert.assertNotNull(date35);
    org.junit.Assert.assertNotNull(date40);
    org.junit.Assert.assertNotNull(date44);
    org.junit.Assert.assertNotNull(date47);
    org.junit.Assert.assertNotNull(timeUnitMap48);
    org.junit.Assert.assertNotNull(timeUnitMap51);
  }

  @Test
  public void test0330() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0330");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    int int14 = simulatorHeader12.getMinuteStartDate();
    simulatorHeader12.setTimeFactor(18);
    java.lang.String str17 = simulatorHeader12.toString();
    simulatorHeader12.setOrekitPropagator("SimulatorData");
    int int20 = simulatorHeader12.getMonthStartDate();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
  }

  @Test
  public void test0331() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0331");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    int int5 = opssat.simulator.util.DateExtraction.getDayFromDate(date4);
    opssat.simulator.util.SimulatorData simulatorData7 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date8 = simulatorData7.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData10 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date11 = simulatorData10.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap12 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date8, date11);
    opssat.simulator.util.SimulatorHeader simulatorHeader13 =
        new opssat.simulator.util.SimulatorHeader(
            false, date4, date11);
    java.util.Date date14 = simulatorHeader13.getEndDate();
    boolean boolean15 = simulatorHeader13.isAutoStartSystem();
    int int16 = simulatorHeader13.getDayStartDate();
    boolean boolean17 = simulatorHeader13.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData20 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date21 = simulatorData20.getCurrentTime();
    int int22 = opssat.simulator.util.DateExtraction.getDayFromDate(date21);
    opssat.simulator.util.SimulatorData simulatorData24 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date25 = simulatorData24.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData27 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date28 = simulatorData27.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap29 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date25, date28);
    opssat.simulator.util.SimulatorHeader simulatorHeader30 =
        new opssat.simulator.util.SimulatorHeader(
            false, date21, date28);
    simulatorHeader13.setStartDate(date28);
    boolean boolean32 = simulatorHeader13.isAutoStartTime();
    simulatorHeader13.setUpdateInternet(true);
    java.util.Date date35 = simulatorHeader13.getStartDate();
    opssat.simulator.util.SimulatorData simulatorData36 = new opssat.simulator.util.SimulatorData(
        (-18), date35);
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertNotNull(date11);
    org.junit.Assert.assertNotNull(timeUnitMap12);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(date21);
    org.junit.Assert.assertNotNull(date25);
    org.junit.Assert.assertNotNull(date28);
    org.junit.Assert.assertNotNull(timeUnitMap29);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertNotNull(date35);
  }

  @Test
  public void test0332() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0332");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    simulatorHeader20.setUpdateInternet(true);
    int int23 = simulatorHeader20.getHourStartDate();
    simulatorHeader20.setAutoStartSystem(false);
    java.lang.String str26 = simulatorHeader20.getOrekitTLE1();
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
    org.junit.Assert.assertNull(str26);
  }

  @Test
  public void test0333() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0333");
    }
    opssat.simulator.gui.GuiApp guiApp2 = null;
    opssat.simulator.tcp.SocketClient socketClient3 = new opssat.simulator.tcp.SocketClient(
        "{counter=8, methodsExecuted=0, currentTime=Thu May 23 15:09:32 UTC 2019}", 0, guiApp2);
    socketClient3.setTargetConnection("030936.762", 4);
    socketClient3.setTargetConnection("", 40);
    try {
      socketClient3.run();
      org.junit.Assert
          .fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0334() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0334");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    int int21 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    int int22 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    int int23 = opssat.simulator.util.DateExtraction.getMonthFromDate(date10);
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
  }

  @Test
  public void test0335() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0335");
    }
    java.lang.String str1 = opssat.simulator.threading.SimulatorNode.calcNMEAChecksum("[1, 11111]");
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "*51" + "'", str1.equals("*51"));
  }

  @Test
  public void test0336() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0336");
    }
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece3 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            42, 11, "");
    java.lang.String str4 = simulatorSchedulerPiece3.getSchedulerOutput();
    org.junit.Assert.assertTrue(
        "'" + str4 + "' != '" + "00000:00:00:00:042  11                 executed false   | " + "'",
        str4.equals("00000:00:00:00:042  11                 executed false   | "));
  }

  @Test
  public void test0337() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0337");
    }
    java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[]{true};
    java.util.ArrayList<java.lang.Boolean> booleanList2 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean3 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator4 = booleanList2.spliterator();
    java.lang.Byte[] byteArray9 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList10 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean11 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList10, byteArray9);
    java.lang.Integer[] intArray14 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean16 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
    boolean boolean17 = byteList10.retainAll(intList15);
    java.lang.Integer[] intArray25 = new java.lang.Integer[]{13, 10, 100, 100, 11111, 13, 11111};
    java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean27 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
    java.lang.Byte[] byteArray32 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList33 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean34 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList33, byteArray32);
    java.lang.Integer[] intArray37 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean39 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
    boolean boolean40 = byteList33.retainAll(intList38);
    java.lang.Integer[] intArray43 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean45 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
    int int47 = intList44.lastIndexOf((byte) 10);
    boolean boolean48 = intList38.removeAll(intList44);
    boolean boolean49 = intList26.retainAll(intList44);
    java.lang.Float[] floatArray53 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList54 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean55 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList54, floatArray53);
    boolean boolean57 = floatList54.add((-1.0f));
    floatList54.trimToSize();
    java.lang.Integer[] intArray63 = new java.lang.Integer[]{100, 1, (-1), 10};
    java.util.ArrayList<java.lang.Integer> intList64 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean65 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
    int int67 = intList64.lastIndexOf((byte) 1);
    boolean boolean68 = floatList54.containsAll(intList64);
    boolean boolean69 = intList26.addAll(intList64);
    boolean boolean70 = intList15.retainAll(intList26);
    boolean boolean71 = booleanList2.equals(intList26);
    java.util.ListIterator<java.lang.Boolean> booleanItor72 = booleanList2.listIterator();
    opssat.simulator.util.SimulatorData simulatorData74 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date75 = simulatorData74.getCurrentTime();
    java.util.Date date76 = simulatorData74.getCurrentTime();
    int int77 = simulatorData74.getTimeFactor();
    int int78 = booleanList2.indexOf(int77);
    boolean boolean79 = booleanList2.isEmpty();
    org.ccsds.moims.mo.mal.structures.OctetList octetList80 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int81 = octetList80.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort82 = octetList80.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor83 = octetList80.iterator();
    boolean boolean84 = booleanList2.equals(octetList80);
    try {
      java.util.ListIterator<java.lang.Boolean> booleanItor86 = booleanList2.listIterator((-4));
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -4");
    } catch (java.lang.IndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(booleanArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(booleanSpliterator4);
    org.junit.Assert.assertNotNull(byteArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(intArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(intArray25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertNotNull(byteArray32);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(intArray37);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(intArray43);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    org.junit.Assert.assertNotNull(floatArray53);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    org.junit.Assert.assertNotNull(intArray63);
    org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    org.junit.Assert.assertNotNull(booleanItor72);
    org.junit.Assert.assertNotNull(date75);
    org.junit.Assert.assertNotNull(date76);
    org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
    org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-7) + "'", int81.equals((-7)));
    org.junit.Assert.assertNotNull(uShort82);
    org.junit.Assert.assertNotNull(byteItor83);
    org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
  }

  @Test
  public void test0338() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0338");
    }
    java.lang.String str1 = opssat.simulator.util.SimulatorSchedulerPiece
        .getDDDDDHHMMSSmmmFromMillis(21);
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000:00:00:00:021" + "'",
        str1.equals("00000:00:00:00:021"));
  }

  @Test
  public void test0339() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0339");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getAreaNumber();
    java.lang.Object[] objArray3 = octetList0.toArray();
    try {
      java.util.List<java.lang.Byte> byteList6 = octetList0.subList(9, 16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 16");
    } catch (java.lang.IndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(objArray3);
  }

  @Test
  public void test0340() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0340");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    int int50 = celestiaData32.getSeconds();
    celestiaData32.setDnx("OPS-SAT SoftSim:");
    java.lang.String str53 = celestiaData32.getAos();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState57 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double58 = simulatorSpacecraftState57.getLatitude();
    double double59 = simulatorSpacecraftState57.getLongitude();
    float[] floatArray60 = simulatorSpacecraftState57.getQ();
    celestiaData32.setQ(floatArray60);
    java.lang.String str62 = celestiaData32.getInfo();
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
    org.junit.Assert.assertNull(str53);
    org.junit.Assert.assertTrue("'" + double58 + "' != '" + 340.0d + "'", double58 == 340.0d);
    org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
    org.junit.Assert.assertNotNull(floatArray60);
    org.junit.Assert.assertNull(str62);
  }

  @Test
  public void test0341() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0341");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    java.lang.String str14 = simulatorHeader12.getOrekitTLE2();
    int int15 = simulatorHeader12.getMinuteStartDate();
    java.util.Date date16 = simulatorHeader12.getEndDate();
    boolean boolean17 = simulatorHeader12.isAutoStartTime();
    int int18 = simulatorHeader12.getSecondStartDate();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertNotNull(date16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
  }

  @Test
  public void test0342() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0342");
    }
    opssat.simulator.util.SimulatorDeviceData simulatorDeviceData1 =
        new opssat.simulator.util.SimulatorDeviceData(
            "21474836472147483647.9223372036854775807");
    java.lang.String str2 = simulatorDeviceData1.getName();
    org.junit.Assert.assertTrue(
        "'" + str2 + "' != '" + "21474836472147483647.9223372036854775807" + "'",
        str2.equals("21474836472147483647.9223372036854775807"));
  }

  @Test
  public void test0343() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0343");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    int int14 = simulatorHeader12.getMinuteStartDate();
    simulatorHeader12.setUseOrekitPropagator(true);
    java.lang.String str17 = simulatorHeader12.toFileString();
    java.util.Date date19 = simulatorHeader12.parseStringIntoDate("yyyy:MM:dd HH:mm:ss z");
    java.lang.String str20 = simulatorHeader12.getStartDateString();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
  }

  @Test
  public void test0344() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0344");
    }
    org.ccsds.moims.mo.mal.structures.ULong uLong0 = new org.ccsds.moims.mo.mal.structures.ULong();
    java.lang.Long long1 = uLong0.getShortForm();
    java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[]{true};
    java.util.ArrayList<java.lang.Boolean> booleanList4 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean5 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList4, booleanArray3);
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator6 = booleanList4.spliterator();
    org.ccsds.moims.mo.mal.structures.OctetList octetList7 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    octetList7.ensureCapacity(13);
    java.lang.Byte[] byteArray14 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList15 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean16 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList15, byteArray14);
    java.lang.Integer[] intArray19 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean21 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
    boolean boolean22 = byteList15.retainAll(intList20);
    boolean boolean23 = octetList7.containsAll(intList20);
    java.util.Iterator<java.lang.Integer> intItor24 = intList20.iterator();
    boolean boolean25 = booleanList4.retainAll(intList20);
    java.lang.String str26 = booleanList4.toString();
    java.lang.String str27 = booleanList4.toString();
    boolean boolean28 = uLong0.equals(booleanList4);
    opssat.simulator.util.wav.WavFileException wavFileException31 =
        new opssat.simulator.util.wav.WavFileException(
            "00000:00:00:00:008");
    opssat.simulator.util.wav.WavFileException wavFileException32 =
        new opssat.simulator.util.wav.WavFileException(
            "-0500.0000000", wavFileException31);
    java.lang.String str33 = wavFileException32.toString();
    boolean boolean34 = uLong0.equals(wavFileException32);
    org.ccsds.moims.mo.mal.structures.UShort uShort35 = uLong0.getAreaNumber();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 281474993487886L + "'",
        long1.equals(281474993487886L));
    org.junit.Assert.assertNotNull(booleanArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(booleanSpliterator6);
    org.junit.Assert.assertNotNull(byteArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(intArray19);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(intItor24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]" + "'", str27.equals("[]"));
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertTrue(
        "'" + str33 + "' != '" + "opssat.simulator.util.wav.WavFileException: -0500.0000000" + "'",
        str33.equals("opssat.simulator.util.wav.WavFileException: -0500.0000000"));
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertNotNull(uShort35);
  }

  @Test
  public void test0345() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0345");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-30));
  }

  @Test
  public void test0346() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0346");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long2 = simulatorData1.getCurrentTimeMillis();
    java.lang.String str3 = simulatorData1.getCurrentDay();
    java.lang.String str4 = simulatorData1.getUTCCurrentTime2();
    java.lang.String str5 = simulatorData1.getCurrentDay();
    java.util.Date date6 = simulatorData1.getCurrentTime();
    int int7 = opssat.simulator.util.DateExtraction.getMonthFromDate(date6);
    int int8 = opssat.simulator.util.DateExtraction.getYearFromDate(date6);
    int int9 = opssat.simulator.util.DateExtraction.getMonthFromDate(date6);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertNotNull(date6);
  }

  @Test
  public void test0347() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0347");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    double double5 = simulatorSpacecraftState3.getLongitude();
    java.lang.String str6 = simulatorSpacecraftState3.getModeOperation();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState10 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    simulatorSpacecraftState10.setLongitude(4);
    double[] doubleArray14 = new double[]{(-1.0f)};
    simulatorSpacecraftState10.setMagField(doubleArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState19 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double20 = simulatorSpacecraftState19.getLatitude();
    java.lang.String str21 = simulatorSpacecraftState19.getMagField();
    java.lang.String str22 = simulatorSpacecraftState19.toString();
    double[] doubleArray23 = simulatorSpacecraftState19.getSunVector();
    simulatorSpacecraftState10.setMagnetometer(doubleArray23);
    simulatorSpacecraftState3.setMagField(doubleArray23);
    simulatorSpacecraftState3.setModeOperation("0");
    simulatorSpacecraftState3.setModeOperation("030936.762");
    simulatorSpacecraftState3.setAltitude(60);
    double double32 = simulatorSpacecraftState3.getAltitude();
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    org.junit.Assert.assertNull(str6);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 340.0d + "'", double20 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str21 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str21.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str22 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str22.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 60.0d + "'", double32 == 60.0d);
  }

  @Test
  public void test0348() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0348");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    boolean boolean16 = simulatorHeader12.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData19 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date20 = simulatorData19.getCurrentTime();
    int int21 = opssat.simulator.util.DateExtraction.getDayFromDate(date20);
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData26 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date27 = simulatorData26.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap28 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date24, date27);
    opssat.simulator.util.SimulatorHeader simulatorHeader29 =
        new opssat.simulator.util.SimulatorHeader(
            false, date20, date27);
    simulatorHeader12.setStartDate(date27);
    simulatorHeader12.setKeplerElements("-0100.0000000");
    simulatorHeader12.setOrekitTLE1("2019");
    java.util.Date date35 = simulatorHeader12.getEndDate();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(date20);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertNotNull(timeUnitMap28);
    org.junit.Assert.assertNotNull(date35);
  }

  @Test
  public void test0349() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0349");
    }
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience8 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    double double9 = gPSSatInViewScience8.getMaxDistance();
    double double10 = gPSSatInViewScience8.getMaxElevation();
    double double11 = gPSSatInViewScience8.getAvgDistance();
    double double12 = gPSSatInViewScience8.getAvgDistance();
    double double13 = gPSSatInViewScience8.getMinDistance();
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 56.0d + "'", double10 == 56.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 9.0d + "'", double13 == 9.0d);
  }

  @Test
  public void test0350() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0350");
    }
    org.ccsds.moims.mo.mal.structures.ShortList shortList0 =
        new org.ccsds.moims.mo.mal.structures.ShortList();
    opssat.simulator.util.wav.WavFileException wavFileException2 =
        new opssat.simulator.util.wav.WavFileException(
            "[0, 1]");
    java.lang.Throwable[] throwableArray3 = wavFileException2.getSuppressed();
    boolean boolean4 = shortList0.equals(wavFileException2);
    org.junit.Assert.assertNotNull(throwableArray3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0351() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0351");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    simulatorData1.setCounter((-1));
    simulatorData1.incrementMethods();
    java.lang.String str5 = simulatorData1.getCurrentYear();
    java.lang.String str6 = simulatorData1.getUTCCurrentTime();
    simulatorData1.setMethodsExecuted((-5));
    simulatorData1.setCounter((short) 10);
  }

  @Test
  public void test0352() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0352");
    }
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor2 =
        new opssat.simulator.util.ArgumentDescriptor(
            "00000:00:00:00:-02", "2019:05:23 15:09:36 UTC");
    java.lang.Float[] floatArray6 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList7 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean8 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList7, floatArray6);
    boolean boolean10 = floatList7.add((-1.0f));
    floatList7.clear();
    java.util.stream.Stream<java.lang.Float> floatStream12 = floatList7.stream();
    java.lang.Byte[] byteArray17 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList18 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean19 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList18, byteArray17);
    java.lang.Integer[] intArray22 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean24 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
    boolean boolean25 = byteList18.retainAll(intList23);
    java.lang.Integer[] intArray28 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean30 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
    int int32 = intList29.lastIndexOf((byte) 10);
    boolean boolean33 = intList23.retainAll(intList29);
    boolean boolean34 = floatList7.containsAll(intList29);
    argumentDescriptor2.setType(floatList7);
    org.ccsds.moims.mo.mal.structures.StringList stringList37 =
        new org.ccsds.moims.mo.mal.structures.StringList(
            36);
    java.lang.Byte[] byteArray42 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList43 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean44 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList43, byteArray42);
    java.lang.Integer[] intArray47 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean49 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
    boolean boolean50 = byteList43.retainAll(intList48);
    int int51 = stringList37.indexOf(intList48);
    java.lang.Object[] objArray52 = stringList37.toArray();
    boolean boolean53 = floatList7.remove(objArray52);
    try {
      java.lang.Float float56 = floatList7.set((short) -1, 10.0f);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(floatStream12);
    org.junit.Assert.assertNotNull(byteArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNotNull(intArray22);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertNotNull(intArray28);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertNotNull(byteArray42);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    org.junit.Assert.assertNotNull(intArray47);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    org.junit.Assert.assertNotNull(objArray52);
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
  }

  @Test
  public void test0355() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0355");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    boolean boolean21 = simulatorHeader20.isAutoStartTime();
    simulatorHeader20.setUseCelestia(false);
    boolean boolean24 = simulatorHeader20.isAutoStartSystem();
    int int25 = simulatorHeader20.getMinuteStartDate();
    boolean boolean26 = simulatorHeader20.isUseCelestia();
    simulatorHeader20.setOrekitTLE2(
        "SimulatorHeader{autoStartSystem=true, autoStartTime=false, timeFactor=1, startDate=Thu May 23 15:09:48 UTC 2019, endDate=Thu May 23 15:09:48 UTC 2019}");
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
  }

  @Test
  public void test0356() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0356");
    }
    java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList3 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean4 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
    int int6 = booleanList3.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor7 = booleanList3.iterator();
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator8 = booleanList3.spliterator();
    org.ccsds.moims.mo.mal.structures.OctetList octetList9 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int10 = octetList9.getTypeShortForm();
    java.lang.Object obj11 = octetList9.clone();
    octetList9.trimToSize();
    boolean boolean13 = booleanList3.contains(octetList9);
    boolean boolean14 = booleanList3.isEmpty();
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece18 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            13L, 0, "hi!");
    long long19 = simulatorSchedulerPiece18.getTime();
    int int20 = simulatorSchedulerPiece18.getInternalID();
    java.lang.String str21 = simulatorSchedulerPiece18.getSchedulerOutput();
    int int22 = booleanList3.indexOf(simulatorSchedulerPiece18);
    java.lang.String str23 = simulatorSchedulerPiece18.getArgumentTemplateDescription();
    long long24 = simulatorSchedulerPiece18.getTime();
    org.junit.Assert.assertNotNull(booleanArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    org.junit.Assert.assertNotNull(booleanItor7);
    org.junit.Assert.assertNotNull(booleanSpliterator8);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-7) + "'", int10.equals((-7)));
    org.junit.Assert.assertNotNull(obj11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 13L + "'", long19 == 13L);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    org.junit.Assert.assertTrue(
        "'" + str21 + "' != '" + "00000:00:00:00:013  0     hi!          executed false   | " + "'",
        str21.equals("00000:00:00:00:013  0     hi!          executed false   | "));
    org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + 13L + "'", long24 == 13L);
  }

  @Test
  public void test0357() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0357");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    float[] floatArray8 = simulatorSpacecraftState3.getQ();
    double double9 = simulatorSpacecraftState3.getLongitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState13 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray16 = new float[]{28, 8};
    simulatorSpacecraftState13.setQ(floatArray16);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState21 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double22 = simulatorSpacecraftState21.getLatitude();
    java.lang.String str23 = simulatorSpacecraftState21.getMagField();
    float[] floatArray24 = simulatorSpacecraftState21.getR();
    simulatorSpacecraftState13.setQ(floatArray24);
    java.lang.String str26 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray24);
    simulatorSpacecraftState3.setRv(floatArray24);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState31 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double32 = simulatorSpacecraftState31.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState36 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray39 = new float[]{28, 8};
    simulatorSpacecraftState36.setQ(floatArray39);
    simulatorSpacecraftState31.setRv(floatArray39);
    double[][] doubleArray42 = new double[][]{};
    simulatorSpacecraftState31.setRotation(doubleArray42);
    java.lang.String str44 = simulatorSpacecraftState31.getModeOperation();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState48 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double49 = simulatorSpacecraftState48.getLatitude();
    double double50 = simulatorSpacecraftState48.getLongitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState54 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    simulatorSpacecraftState54.setLongitude(4);
    int int57 = simulatorSpacecraftState54.getSatsInView();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState61 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double62 = simulatorSpacecraftState61.getLatitude();
    java.lang.String str63 = simulatorSpacecraftState61.getMagField();
    java.lang.String str64 = simulatorSpacecraftState61.toString();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState68 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double69 = simulatorSpacecraftState68.getLatitude();
    java.lang.String str70 = simulatorSpacecraftState68.getMagField();
    java.lang.String str71 = simulatorSpacecraftState68.toString();
    double[] doubleArray72 = simulatorSpacecraftState68.getSunVector();
    simulatorSpacecraftState61.setMagnetometer(doubleArray72);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState77 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double78 = simulatorSpacecraftState77.getLatitude();
    java.lang.String str79 = simulatorSpacecraftState77.getMagField();
    java.lang.String str80 = simulatorSpacecraftState77.toString();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState84 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double85 = simulatorSpacecraftState84.getLatitude();
    java.lang.String str86 = simulatorSpacecraftState84.getMagField();
    java.lang.String str87 = simulatorSpacecraftState84.toString();
    double[] doubleArray88 = simulatorSpacecraftState84.getSunVector();
    simulatorSpacecraftState77.setMagnetometer(doubleArray88);
    simulatorSpacecraftState61.setMagnetometer(doubleArray88);
    simulatorSpacecraftState54.setSunVector(doubleArray88);
    simulatorSpacecraftState48.setMagField(doubleArray88);
    simulatorSpacecraftState31.setMagnetometer(doubleArray88);
    simulatorSpacecraftState3.setSunVector(doubleArray88);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertNotNull(floatArray8);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    org.junit.Assert.assertNotNull(floatArray16);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str23 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str23.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray24);
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "UnknownGUIData" + "'",
        str26.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 340.0d + "'", double32 == 340.0d);
    org.junit.Assert.assertNotNull(floatArray39);
    org.junit.Assert.assertNotNull(doubleArray42);
    org.junit.Assert.assertNull(str44);
    org.junit.Assert.assertTrue("'" + double49 + "' != '" + 340.0d + "'", double49 == 340.0d);
    org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
    org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    org.junit.Assert.assertTrue("'" + double62 + "' != '" + 340.0d + "'", double62 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str63 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str63.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str64 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str64.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertTrue("'" + double69 + "' != '" + 340.0d + "'", double69 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str70 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str70.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str71 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str71.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertNotNull(doubleArray72);
    org.junit.Assert.assertTrue("'" + double78 + "' != '" + 340.0d + "'", double78 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str79 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str79.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str80 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str80.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertTrue("'" + double85 + "' != '" + 340.0d + "'", double85 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str86 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str86.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str87 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str87.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertNotNull(doubleArray88);
  }

  @Test
  public void test0358() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0358");
    }
    boolean boolean1 = opssat.simulator.threading.SimulatorNode.isInteger("03700.0000");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
  }

  @Test
  public void test0359() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0359");
    }
    opssat.simulator.models.AbstractModel abstractModel1 =
        new opssat.simulator.models.AbstractModel(
            "SimulatorHeader{autoStartSystem=false, autoStartTime=false, timeFactor=18, startDate=Thu May 23 15:09:59 UTC 2019, endDate=Thu May 23 15:09:59 UTC 2019}");
  }

  @Test
  public void test0360() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0360");
    }
    java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList3 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean4 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
    int int6 = booleanList3.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor7 = booleanList3.iterator();
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator8 = booleanList3.spliterator();
    java.lang.Integer[] intArray16 = new java.lang.Integer[]{13, 10, 100, 100, 11111, 13, 11111};
    java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean18 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
    java.lang.Byte[] byteArray23 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList24 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean25 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList24, byteArray23);
    java.lang.Integer[] intArray28 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean30 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
    boolean boolean31 = byteList24.retainAll(intList29);
    java.lang.Integer[] intArray34 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList35 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean36 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
    int int38 = intList35.lastIndexOf((byte) 10);
    boolean boolean39 = intList29.removeAll(intList35);
    boolean boolean40 = intList17.retainAll(intList35);
    java.lang.Float[] floatArray44 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList45 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean46 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList45, floatArray44);
    boolean boolean48 = floatList45.add((-1.0f));
    floatList45.trimToSize();
    java.lang.Integer[] intArray54 = new java.lang.Integer[]{100, 1, (-1), 10};
    java.util.ArrayList<java.lang.Integer> intList55 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean56 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
    int int58 = intList55.lastIndexOf((byte) 1);
    boolean boolean59 = floatList45.containsAll(intList55);
    boolean boolean60 = intList17.addAll(intList55);
    boolean boolean61 = booleanList3.removeAll(intList17);
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor63 =
        new opssat.simulator.util.ArgumentDescriptor(
            boolean61, "0.0");
    try {
      float float65 = argumentDescriptor63.getTypeAsFloatByIndex(4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to [F");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNotNull(booleanArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    org.junit.Assert.assertNotNull(booleanItor7);
    org.junit.Assert.assertNotNull(booleanSpliterator8);
    org.junit.Assert.assertNotNull(intArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertNotNull(byteArray23);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertNotNull(intArray28);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    org.junit.Assert.assertNotNull(intArray34);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(floatArray44);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    org.junit.Assert.assertNotNull(intArray54);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
  }

  @Test
  public void test0361() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0361");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState8 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray11 = new float[]{28, 8};
    simulatorSpacecraftState8.setQ(floatArray11);
    simulatorSpacecraftState3.setRv(floatArray11);
    double[][] doubleArray14 = new double[][]{};
    simulatorSpacecraftState3.setRotation(doubleArray14);
    java.lang.String str16 = simulatorSpacecraftState3.getModeOperation();
    float[] floatArray17 = simulatorSpacecraftState3.getQ();
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertNotNull(floatArray11);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertNotNull(floatArray17);
  }

  @Test
  public void test0362() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0362");
    }
    org.ccsds.moims.mo.mal.structures.StringList stringList0 =
        new org.ccsds.moims.mo.mal.structures.StringList();
    java.util.Iterator<java.lang.String> strItor1 = stringList0.iterator();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet2 = stringList0.getAreaVersion();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState6 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray9 = new float[]{28, 8};
    simulatorSpacecraftState6.setQ(floatArray9);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState14 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double15 = simulatorSpacecraftState14.getLatitude();
    java.lang.String str16 = simulatorSpacecraftState14.getMagField();
    float[] floatArray17 = simulatorSpacecraftState14.getR();
    simulatorSpacecraftState6.setQ(floatArray17);
    java.lang.String str19 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray17);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState23 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double24 = simulatorSpacecraftState23.getLatitude();
    double double25 = simulatorSpacecraftState23.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState29 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double30 = simulatorSpacecraftState29.getLatitude();
    java.lang.String str31 = simulatorSpacecraftState29.getMagField();
    float[] floatArray32 = simulatorSpacecraftState29.getR();
    simulatorSpacecraftState23.setQ(floatArray32);
    float[] floatArray34 = simulatorSpacecraftState23.getV();
    opssat.simulator.celestia.CelestiaData celestiaData35 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray17, floatArray34);
    float[] floatArray36 = celestiaData35.getQ();
    opssat.simulator.util.SimulatorData simulatorData40 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date41 = simulatorData40.getCurrentTime();
    int int42 = opssat.simulator.util.DateExtraction.getDayFromDate(date41);
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData47 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date48 = simulatorData47.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap49 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date45, date48);
    opssat.simulator.util.SimulatorHeader simulatorHeader50 =
        new opssat.simulator.util.SimulatorHeader(
            false, date41, date48);
    opssat.simulator.util.SimulatorData simulatorData51 = new opssat.simulator.util.SimulatorData(
        (short) 0, date41);
    celestiaData35.setDate(date41);
    int int53 = celestiaData35.getSeconds();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState57 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray60 = new float[]{28, 8};
    simulatorSpacecraftState57.setQ(floatArray60);
    celestiaData35.setQ(floatArray60);
    int int63 = stringList0.lastIndexOf(celestiaData35);
    try {
      java.lang.String str64 = celestiaData35.toString();
      org.junit.Assert
          .fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strItor1);
    org.junit.Assert.assertNotNull(uOctet2);
    org.junit.Assert.assertNotNull(floatArray9);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 340.0d + "'", double15 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str16 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str16.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray17);
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "UnknownGUIData" + "'",
        str19.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 340.0d + "'", double24 == 340.0d);
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 340.0d + "'", double25 == 340.0d);
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 340.0d + "'", double30 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str31 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str31.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray32);
    org.junit.Assert.assertNotNull(floatArray34);
    org.junit.Assert.assertNotNull(floatArray36);
    org.junit.Assert.assertNotNull(date41);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(date48);
    org.junit.Assert.assertNotNull(timeUnitMap49);
    org.junit.Assert.assertNotNull(floatArray60);
    org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
  }

  @Test
  public void test0363() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0363");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    double double5 = simulatorSpacecraftState3.getLongitude();
    float[] floatArray6 = null;
    simulatorSpacecraftState3.setQ(floatArray6);
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
  }

  @Test
  public void test0364() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0364");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList3 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int4 = octetList3.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort5 = octetList3.getAreaNumber();
    java.lang.Object[] objArray6 = octetList3.toArray();
    org.ccsds.moims.mo.mal.structures.OctetList octetList7 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int8 = octetList7.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort9 = octetList7.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor10 = octetList7.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor12 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList7, "hi!");
    org.ccsds.moims.mo.mal.structures.UShort uShort13 = octetList7.getAreaNumber();
    java.lang.Boolean[] booleanArray16 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList17 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean18 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList17, booleanArray16);
    int int20 = booleanList17.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor21 = booleanList17.iterator();
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator22 = booleanList17.spliterator();
    org.ccsds.moims.mo.mal.structures.OctetList octetList23 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int24 = octetList23.getTypeShortForm();
    java.lang.Object obj25 = octetList23.clone();
    octetList23.trimToSize();
    boolean boolean27 = booleanList17.contains(octetList23);
    org.ccsds.moims.mo.mal.structures.OctetList octetList28 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int29 = octetList28.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort30 = octetList28.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList31 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int32 = octetList31.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort33 = octetList31.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet34 = octetList31.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.OctetList octetList35 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int36 = octetList35.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort37 = octetList35.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray38 =
        new org.ccsds.moims.mo.mal.structures.OctetList[]{
          octetList3, octetList7, octetList23, octetList28, octetList31, octetList35};
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray39 = octetList0
        .toArray(octetListArray38);
    octetList0.ensureCapacity(28);
    org.ccsds.moims.mo.mal.structures.UOctet uOctet42 = octetList0.getAreaVersion();
    octetList0.ensureCapacity(40);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7) + "'", int4.equals((-7)));
    org.junit.Assert.assertNotNull(uShort5);
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-7) + "'", int8.equals((-7)));
    org.junit.Assert.assertNotNull(uShort9);
    org.junit.Assert.assertNotNull(byteItor10);
    org.junit.Assert.assertNotNull(uShort13);
    org.junit.Assert.assertNotNull(booleanArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    org.junit.Assert.assertNotNull(booleanItor21);
    org.junit.Assert.assertNotNull(booleanSpliterator22);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24.equals((-7)));
    org.junit.Assert.assertNotNull(obj25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-7) + "'", int29.equals((-7)));
    org.junit.Assert.assertNotNull(uShort30);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-7) + "'", int32.equals((-7)));
    org.junit.Assert.assertNotNull(uShort33);
    org.junit.Assert.assertNotNull(uOctet34);
    org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-7) + "'", int36.equals((-7)));
    org.junit.Assert.assertNotNull(uShort37);
    org.junit.Assert.assertNotNull(octetListArray38);
    org.junit.Assert.assertNotNull(octetListArray39);
    org.junit.Assert.assertNotNull(uOctet42);
  }

  @Test
  public void test0365() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0365");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    int int8 = simulatorSpacecraftState3.getSatsInView();
    simulatorSpacecraftState3.setAltitude((-5));
    double[] doubleArray15 = new double[]{281474993487879L, 66, 97, (short) 255};
    double[] doubleArray20 = new double[]{281474993487879L, 66, 97, (short) 255};
    double[] doubleArray25 = new double[]{281474993487879L, 66, 97, (short) 255};
    double[] doubleArray30 = new double[]{281474993487879L, 66, 97, (short) 255};
    double[] doubleArray35 = new double[]{281474993487879L, 66, 97, (short) 255};
    double[] doubleArray40 = new double[]{281474993487879L, 66, 97, (short) 255};
    double[][] doubleArray41 = new double[][]{doubleArray15, doubleArray20, doubleArray25,
      doubleArray30, doubleArray35, doubleArray40};
    simulatorSpacecraftState3.setRotation(doubleArray41);
    java.lang.String str43 = simulatorSpacecraftState3.getSunVectorAsString();
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertNotNull(doubleArray35);
    org.junit.Assert.assertNotNull(doubleArray40);
    org.junit.Assert.assertNotNull(doubleArray41);
    org.junit.Assert.assertTrue(
        "'" + str43 + "' != '" + "X:[+.00000] ; Y:[+.00000] ; Z: [+.00000] units [N/A]" + "'",
        str43.equals("X:[+.00000] ; Y:[+.00000] ; Z: [+.00000] units [N/A]"));
  }

  @Test
  public void test0366() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0366");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long2 = simulatorData1.getCurrentTimeMillis();
    java.lang.String str3 = simulatorData1.getCurrentDay();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    int int8 = opssat.simulator.util.DateExtraction.getDayFromDate(date7);
    opssat.simulator.util.SimulatorData simulatorData10 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date11 = simulatorData10.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap15 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date11, date14);
    opssat.simulator.util.SimulatorHeader simulatorHeader16 =
        new opssat.simulator.util.SimulatorHeader(
            false, date7, date14);
    java.util.Date date17 = simulatorHeader16.getEndDate();
    boolean boolean18 = simulatorHeader16.isAutoStartSystem();
    boolean boolean20 = simulatorHeader16.validateTimeFactor(5);
    simulatorData1.initFromHeader(simulatorHeader16);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date11);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(timeUnitMap15);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
  }

  @Test
  public void test0367() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0367");
    }
    org.ccsds.moims.mo.mal.structures.Identifier identifier1 =
        new org.ccsds.moims.mo.mal.structures.Identifier(
            "opssat");
    org.ccsds.moims.mo.mal.structures.OctetList octetList2 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int3 = octetList2.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort4 = octetList2.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor5 = octetList2.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor7 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList2, "hi!");
    argumentDescriptor7.restoreArgument();
    argumentDescriptor7.restoreArgument();
    argumentDescriptor7.restoreArgument();
    boolean boolean11 = identifier1.equals(argumentDescriptor7);
    org.ccsds.moims.mo.mal.structures.Union union13 = new org.ccsds.moims.mo.mal.structures.Union(
        281474993487885L);
    boolean boolean14 = identifier1.equals(281474993487885L);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7) + "'", int3.equals((-7)));
    org.junit.Assert.assertNotNull(uShort4);
    org.junit.Assert.assertNotNull(byteItor5);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
  }

  @Test
  public void test0368() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0368");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    int int50 = celestiaData32.getMonths();
    int int51 = celestiaData32.getMinutes();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState55 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray58 = new float[]{28, 8};
    simulatorSpacecraftState55.setQ(floatArray58);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState63 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double64 = simulatorSpacecraftState63.getLatitude();
    java.lang.String str65 = simulatorSpacecraftState63.getMagField();
    float[] floatArray66 = simulatorSpacecraftState63.getR();
    simulatorSpacecraftState55.setQ(floatArray66);
    celestiaData32.setRv(floatArray66);
    int int69 = celestiaData32.getMinutes();
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
    org.junit.Assert.assertNotNull(floatArray58);
    org.junit.Assert.assertTrue("'" + double64 + "' != '" + 340.0d + "'", double64 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str65 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str65.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray66);
  }

  @Test
  public void test0369() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0369");
    }
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap1 =
        opssat.simulator.util.SimulatorData
            .computeTimeUnit(281474993487874L);
    org.junit.Assert.assertNotNull(timeUnitMap1);
  }

  @Test
  public void test0370() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0370");
    }
    org.ccsds.moims.mo.mal.structures.LongList longList0 =
        new org.ccsds.moims.mo.mal.structures.LongList();
    java.util.ListIterator<java.lang.Long> longItor1 = longList0.listIterator();
    java.util.Spliterator<java.lang.Long> longSpliterator2 = longList0.spliterator();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet3 = longList0.getAreaVersion();
    opssat.simulator.util.SimulatorData simulatorData7 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date8 = simulatorData7.getCurrentTime();
    java.util.Date date9 = simulatorData7.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData10 = new opssat.simulator.util.SimulatorData(
        17, date9);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    int int15 = opssat.simulator.util.DateExtraction.getDayFromDate(date14);
    opssat.simulator.util.SimulatorData simulatorData17 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date18 = simulatorData17.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData20 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date21 = simulatorData20.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap22 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date18, date21);
    opssat.simulator.util.SimulatorHeader simulatorHeader23 =
        new opssat.simulator.util.SimulatorHeader(
            false, date14, date21);
    opssat.simulator.util.SimulatorHeader simulatorHeader24 =
        new opssat.simulator.util.SimulatorHeader(
            false, date9, date14);
    boolean boolean25 = simulatorHeader24.checkStartBeforeEnd();
    boolean boolean26 = uOctet3.equals(simulatorHeader24);
    org.ccsds.moims.mo.mal.structures.Element element27 = uOctet3.createElement();
    org.junit.Assert.assertNotNull(longItor1);
    org.junit.Assert.assertNotNull(longSpliterator2);
    org.junit.Assert.assertNotNull(uOctet3);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertNotNull(date9);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date18);
    org.junit.Assert.assertNotNull(date21);
    org.junit.Assert.assertNotNull(timeUnitMap22);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(element27);
  }

  @Test
  public void test0371() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0371");
    }
    opssat.simulator.util.SimulatorTimer simulatorTimer2 = new opssat.simulator.util.SimulatorTimer(
        "SimulatorData", 1L);
    boolean boolean3 = simulatorTimer2.isElapsed();
    simulatorTimer2.setDuration((-10));
    simulatorTimer2.setDuration((-4));
    simulatorTimer2.setDuration((-10));
    simulatorTimer2.setDuration(59);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0372() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0372");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    simulatorSpacecraftState3.setLongitude(4);
    double[] doubleArray7 = new double[]{(-1.0f)};
    simulatorSpacecraftState3.setMagField(doubleArray7);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState12 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double13 = simulatorSpacecraftState12.getLatitude();
    java.lang.String str14 = simulatorSpacecraftState12.getMagField();
    java.lang.String str15 = simulatorSpacecraftState12.toString();
    double[] doubleArray16 = simulatorSpacecraftState12.getSunVector();
    simulatorSpacecraftState3.setMagnetometer(doubleArray16);
    int int18 = simulatorSpacecraftState3.getSatsInView();
    java.lang.String str19 = simulatorSpacecraftState3.getRotationAsString();
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 340.0d + "'", double13 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str14 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str14.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str15 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str15.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    org.junit.Assert.assertTrue("'" + str19 + "' != '"
        + "\n+0.000000 +0.000000 +0.000000\n+0.000000 +0.000000 +0.000000\n+0.000000 +0.000000 +0.000000"
        + "'",
        str19.equals(
            "\n+0.000000 +0.000000 +0.000000\n+0.000000 +0.000000 +0.000000\n+0.000000 +0.000000 +0.000000"));
  }

  @Test
  public void test0373() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0373");
    }
    float[] floatArray0 = null;
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState4 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray7 = new float[]{28, 8};
    simulatorSpacecraftState4.setQ(floatArray7);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState12 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double13 = simulatorSpacecraftState12.getLatitude();
    java.lang.String str14 = simulatorSpacecraftState12.getMagField();
    float[] floatArray15 = simulatorSpacecraftState12.getR();
    simulatorSpacecraftState4.setQ(floatArray15);
    java.lang.String str17 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray15);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState21 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double22 = simulatorSpacecraftState21.getLatitude();
    double double23 = simulatorSpacecraftState21.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState27 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double28 = simulatorSpacecraftState27.getLatitude();
    java.lang.String str29 = simulatorSpacecraftState27.getMagField();
    float[] floatArray30 = simulatorSpacecraftState27.getR();
    simulatorSpacecraftState21.setQ(floatArray30);
    float[] floatArray32 = simulatorSpacecraftState21.getV();
    opssat.simulator.celestia.CelestiaData celestiaData33 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray15, floatArray32);
    float[] floatArray34 = celestiaData33.getQ();
    opssat.simulator.util.SimulatorData simulatorData38 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date39 = simulatorData38.getCurrentTime();
    int int40 = opssat.simulator.util.DateExtraction.getDayFromDate(date39);
    opssat.simulator.util.SimulatorData simulatorData42 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date43 = simulatorData42.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData45 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date46 = simulatorData45.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap47 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date43, date46);
    opssat.simulator.util.SimulatorHeader simulatorHeader48 =
        new opssat.simulator.util.SimulatorHeader(
            false, date39, date46);
    opssat.simulator.util.SimulatorData simulatorData49 = new opssat.simulator.util.SimulatorData(
        (short) 0, date39);
    celestiaData33.setDate(date39);
    int int51 = celestiaData33.getMonths();
    float[] floatArray52 = celestiaData33.getRv();
    opssat.simulator.celestia.CelestiaData celestiaData53 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray0, floatArray52);
    celestiaData53.setAnx("00000:00:00:00:042  11                 executed false   | ");
    org.junit.Assert.assertNotNull(floatArray7);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 340.0d + "'", double13 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str14 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str14.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray15);
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "UnknownGUIData" + "'",
        str17.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 340.0d + "'", double23 == 340.0d);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 340.0d + "'", double28 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str29 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str29.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray30);
    org.junit.Assert.assertNotNull(floatArray32);
    org.junit.Assert.assertNotNull(floatArray34);
    org.junit.Assert.assertNotNull(date39);
    org.junit.Assert.assertNotNull(date43);
    org.junit.Assert.assertNotNull(date46);
    org.junit.Assert.assertNotNull(timeUnitMap47);
    org.junit.Assert.assertNotNull(floatArray52);
  }

  @Test
  public void test0374() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0374");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.setName("01700.0000000");
    argumentDescriptor5.restoreArgument();
    java.lang.String str10 = argumentDescriptor5.getName();
    java.lang.String str11 = argumentDescriptor5.toString();
    try {
      int int13 = argumentDescriptor5.getTypeAsIntByIndex((byte) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [I");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
  }

  @Test
  public void test0375() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0375");
    }
    java.lang.Float[] floatArray3 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList4 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean5 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList4, floatArray3);
    boolean boolean7 = floatList4.add((-1.0f));
    floatList4.clear();
    java.util.stream.Stream<java.lang.Float> floatStream9 = floatList4.parallelStream();
    floatList4.clear();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState14 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray17 = new float[]{28, 8};
    simulatorSpacecraftState14.setQ(floatArray17);
    float[] floatArray19 = simulatorSpacecraftState14.getQ();
    double double20 = simulatorSpacecraftState14.getLongitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState24 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray27 = new float[]{28, 8};
    simulatorSpacecraftState24.setQ(floatArray27);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState32 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double33 = simulatorSpacecraftState32.getLatitude();
    java.lang.String str34 = simulatorSpacecraftState32.getMagField();
    float[] floatArray35 = simulatorSpacecraftState32.getR();
    simulatorSpacecraftState24.setQ(floatArray35);
    java.lang.String str37 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray35);
    simulatorSpacecraftState14.setRv(floatArray35);
    java.lang.String str39 = simulatorSpacecraftState14.getSunVectorAsString();
    float[] floatArray40 = simulatorSpacecraftState14.getR();
    int int41 = floatList4.indexOf(simulatorSpacecraftState14);
    org.junit.Assert.assertNotNull(floatArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(floatStream9);
    org.junit.Assert.assertNotNull(floatArray17);
    org.junit.Assert.assertNotNull(floatArray19);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    org.junit.Assert.assertNotNull(floatArray27);
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 340.0d + "'", double33 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str34 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str34.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray35);
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "UnknownGUIData" + "'",
        str37.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue(
        "'" + str39 + "' != '" + "X:[+.00000] ; Y:[+.00000] ; Z: [+.00000] units [N/A]" + "'",
        str39.equals("X:[+.00000] ; Y:[+.00000] ; Z: [+.00000] units [N/A]"));
    org.junit.Assert.assertNotNull(floatArray40);
    org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
  }

  @Test
  public void test0376() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0376");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.restoreArgument();
    java.lang.String str9 = argumentDescriptor5.toString();
    argumentDescriptor5.setName("OPS-SAT SoftSim:");
    java.lang.String str12 = argumentDescriptor5.getName();
    argumentDescriptor5.restoreArgument();
    try {
      argumentDescriptor5.setFloatTypeByIndex(60, 54);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [F");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "OPS-SAT SoftSim:" + "'",
        str12.equals("OPS-SAT SoftSim:"));
  }

  @Test
  public void test0377() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0377");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList3 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int4 = octetList3.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort5 = octetList3.getAreaNumber();
    java.lang.Object[] objArray6 = octetList3.toArray();
    org.ccsds.moims.mo.mal.structures.OctetList octetList7 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int8 = octetList7.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort9 = octetList7.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor10 = octetList7.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor12 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList7, "hi!");
    org.ccsds.moims.mo.mal.structures.UShort uShort13 = octetList7.getAreaNumber();
    java.lang.Boolean[] booleanArray16 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList17 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean18 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList17, booleanArray16);
    int int20 = booleanList17.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor21 = booleanList17.iterator();
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator22 = booleanList17.spliterator();
    org.ccsds.moims.mo.mal.structures.OctetList octetList23 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int24 = octetList23.getTypeShortForm();
    java.lang.Object obj25 = octetList23.clone();
    octetList23.trimToSize();
    boolean boolean27 = booleanList17.contains(octetList23);
    org.ccsds.moims.mo.mal.structures.OctetList octetList28 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int29 = octetList28.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort30 = octetList28.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList31 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int32 = octetList31.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort33 = octetList31.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet34 = octetList31.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.OctetList octetList35 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int36 = octetList35.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort37 = octetList35.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray38 =
        new org.ccsds.moims.mo.mal.structures.OctetList[]{
          octetList3, octetList7, octetList23, octetList28, octetList31, octetList35};
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray39 = octetList0
        .toArray(octetListArray38);
    octetList0.ensureCapacity(28);
    org.ccsds.moims.mo.mal.structures.UOctet uOctet42 = octetList0.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.Element element43 = octetList0.createElement();
    java.util.ListIterator<java.lang.Byte> byteItor44 = octetList0.listIterator();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7) + "'", int4.equals((-7)));
    org.junit.Assert.assertNotNull(uShort5);
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-7) + "'", int8.equals((-7)));
    org.junit.Assert.assertNotNull(uShort9);
    org.junit.Assert.assertNotNull(byteItor10);
    org.junit.Assert.assertNotNull(uShort13);
    org.junit.Assert.assertNotNull(booleanArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    org.junit.Assert.assertNotNull(booleanItor21);
    org.junit.Assert.assertNotNull(booleanSpliterator22);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24.equals((-7)));
    org.junit.Assert.assertNotNull(obj25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-7) + "'", int29.equals((-7)));
    org.junit.Assert.assertNotNull(uShort30);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-7) + "'", int32.equals((-7)));
    org.junit.Assert.assertNotNull(uShort33);
    org.junit.Assert.assertNotNull(uOctet34);
    org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-7) + "'", int36.equals((-7)));
    org.junit.Assert.assertNotNull(uShort37);
    org.junit.Assert.assertNotNull(octetListArray38);
    org.junit.Assert.assertNotNull(octetListArray39);
    org.junit.Assert.assertNotNull(uOctet42);
    org.junit.Assert.assertNotNull(element43);
    org.junit.Assert.assertNotNull(byteItor44);
  }

  @Test
  public void test0378() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0378");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList3 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int4 = octetList3.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort5 = octetList3.getAreaNumber();
    java.lang.Object[] objArray6 = octetList3.toArray();
    org.ccsds.moims.mo.mal.structures.OctetList octetList7 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int8 = octetList7.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort9 = octetList7.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor10 = octetList7.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor12 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList7, "hi!");
    org.ccsds.moims.mo.mal.structures.UShort uShort13 = octetList7.getAreaNumber();
    java.lang.Boolean[] booleanArray16 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList17 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean18 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList17, booleanArray16);
    int int20 = booleanList17.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor21 = booleanList17.iterator();
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator22 = booleanList17.spliterator();
    org.ccsds.moims.mo.mal.structures.OctetList octetList23 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int24 = octetList23.getTypeShortForm();
    java.lang.Object obj25 = octetList23.clone();
    octetList23.trimToSize();
    boolean boolean27 = booleanList17.contains(octetList23);
    org.ccsds.moims.mo.mal.structures.OctetList octetList28 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int29 = octetList28.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort30 = octetList28.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList octetList31 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int32 = octetList31.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort33 = octetList31.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet34 = octetList31.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.OctetList octetList35 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int36 = octetList35.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort37 = octetList35.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray38 =
        new org.ccsds.moims.mo.mal.structures.OctetList[]{
          octetList3, octetList7, octetList23, octetList28, octetList31, octetList35};
    org.ccsds.moims.mo.mal.structures.OctetList[] octetListArray39 = octetList0
        .toArray(octetListArray38);
    boolean boolean40 = octetList0.isEmpty();
    java.lang.Long long41 = octetList0.getShortForm();
    java.lang.Integer int42 = octetList0.getTypeShortForm();
    octetList0.trimToSize();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7) + "'", int4.equals((-7)));
    org.junit.Assert.assertNotNull(uShort5);
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-7) + "'", int8.equals((-7)));
    org.junit.Assert.assertNotNull(uShort9);
    org.junit.Assert.assertNotNull(byteItor10);
    org.junit.Assert.assertNotNull(uShort13);
    org.junit.Assert.assertNotNull(booleanArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    org.junit.Assert.assertNotNull(booleanItor21);
    org.junit.Assert.assertNotNull(booleanSpliterator22);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24.equals((-7)));
    org.junit.Assert.assertNotNull(obj25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-7) + "'", int29.equals((-7)));
    org.junit.Assert.assertNotNull(uShort30);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-7) + "'", int32.equals((-7)));
    org.junit.Assert.assertNotNull(uShort33);
    org.junit.Assert.assertNotNull(uOctet34);
    org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-7) + "'", int36.equals((-7)));
    org.junit.Assert.assertNotNull(uShort37);
    org.junit.Assert.assertNotNull(octetListArray38);
    org.junit.Assert.assertNotNull(octetListArray39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertTrue("'" + long41 + "' != '" + 281475010265081L + "'",
        long41.equals(281475010265081L));
    org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-7) + "'", int42.equals((-7)));
  }

  @Test
  public void test0379() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0379");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    java.lang.String str5 = simulatorSpacecraftState3.getMagField();
    java.lang.String str6 = simulatorSpacecraftState3.toString();
    double[] doubleArray7 = simulatorSpacecraftState3.getSunVector();
    simulatorSpacecraftState3.setSatsInView((short) 10);
    java.lang.String str10 = simulatorSpacecraftState3.toString();
    java.lang.String str11 = simulatorSpacecraftState3.toString();
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str5 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str5.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str6 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str6.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertTrue(
        "'" + str10 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str10.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertTrue(
        "'" + str11 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str11.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
  }

  @Test
  public void test0380() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0380");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    boolean boolean16 = simulatorHeader12.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData19 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date20 = simulatorData19.getCurrentTime();
    int int21 = opssat.simulator.util.DateExtraction.getDayFromDate(date20);
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData26 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date27 = simulatorData26.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap28 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date24, date27);
    opssat.simulator.util.SimulatorHeader simulatorHeader29 =
        new opssat.simulator.util.SimulatorHeader(
            false, date20, date27);
    simulatorHeader12.setStartDate(date27);
    boolean boolean31 = simulatorHeader12.isAutoStartTime();
    simulatorHeader12.setUpdateInternet(true);
    java.util.Date date34 = simulatorHeader12.getStartDate();
    simulatorHeader12.setAutoStartTime(false);
    java.lang.String str37 = simulatorHeader12.toFileString();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(date20);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertNotNull(timeUnitMap28);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(date34);
  }

  @Test
  public void test0381() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0381");
    }
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece3 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            13L, 0, "hi!");
    long long4 = simulatorSchedulerPiece3.getTime();
    long long5 = simulatorSchedulerPiece3.getTime();
    java.lang.String str6 = simulatorSchedulerPiece3.getFileString();
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 13L + "'", long4 == 13L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 13L + "'", long5 == 13L);
    org.junit.Assert.assertTrue(
        "'" + str6 + "' != '" + "00000:00:00:00:013|0000000000000000013|0|hi!" + "'",
        str6.equals("00000:00:00:00:013|0000000000000000013|0|hi!"));
  }

  @Test
  public void test0382() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0382");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    simulatorHeader12.setOrekitTLE1("");
    java.lang.String str16 = simulatorHeader12.DATE_FORMAT;
    boolean boolean17 = simulatorHeader12.isAutoStartTime();
    int int18 = simulatorHeader12.getMonthStartDate();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "yyyy:MM:dd HH:mm:ss z" + "'",
        str16.equals("yyyy:MM:dd HH:mm:ss z"));
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
  }

  @Test
  public void test0383() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0383");
    }
    opssat.simulator.util.LoggerFormatter1Line loggerFormatter1Line1 =
        new opssat.simulator.util.LoggerFormatter1Line(
            "00000:00:00:00:008  97    0.0          executed false   | ");
    java.util.logging.LogRecord logRecord2 = null;
    try {
      java.lang.String str3 = loggerFormatter1Line1.format(logRecord2);
      org.junit.Assert
          .fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0384() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0384");
    }
    boolean boolean1 = opssat.simulator.threading.SimulatorNode
        .isInteger("2019:05:23 15:09:55 UTC");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
  }

  @Test
  public void test0385() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0385");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet3 = octetList0.getAreaVersion();
    opssat.simulator.util.wav.WavFileException wavFileException5 =
        new opssat.simulator.util.wav.WavFileException(
            "UnknownGUIData");
    java.lang.Throwable[] throwableArray6 = wavFileException5.getSuppressed();
    boolean boolean7 = octetList0.equals(wavFileException5);
    org.ccsds.moims.mo.mal.structures.Time time9 = new org.ccsds.moims.mo.mal.structures.Time('4');
    long long10 = time9.getValue();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet11 = time9.getAreaVersion();
    boolean boolean12 = octetList0.contains(uOctet11);
    java.lang.Long[] longArray19 = new java.lang.Long[]{281475010265070L, 100L, 0L,
      281475010265070L, 281475010265070L, 1L};
    java.util.ArrayList<java.lang.Long> longList20 = new java.util.ArrayList<java.lang.Long>();
    boolean boolean21 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Long>) longList20, longArray19);
    boolean boolean22 = longList20.isEmpty();
    java.util.Spliterator<java.lang.Long> longSpliterator23 = longList20.spliterator();
    java.lang.Object obj24 = longList20.clone();
    java.lang.Integer[] intArray32 = new java.lang.Integer[]{13, 10, 100, 100, 11111, 13, 11111};
    java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean34 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
    java.lang.Byte[] byteArray39 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList40 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean41 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList40, byteArray39);
    java.lang.Integer[] intArray44 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList45 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean46 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
    boolean boolean47 = byteList40.retainAll(intList45);
    java.lang.Integer[] intArray50 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean52 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
    int int54 = intList51.lastIndexOf((byte) 10);
    boolean boolean55 = intList45.removeAll(intList51);
    boolean boolean56 = intList33.retainAll(intList51);
    java.lang.Object obj57 = intList33.clone();
    int int58 = longList20.lastIndexOf(obj57);
    boolean boolean59 = octetList0.contains(int58);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(uOctet3);
    org.junit.Assert.assertNotNull(throwableArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
    org.junit.Assert.assertNotNull(uOctet11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(longArray19);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(longSpliterator23);
    org.junit.Assert.assertNotNull(obj24);
    org.junit.Assert.assertNotNull(intArray32);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(byteArray39);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    org.junit.Assert.assertNotNull(intArray44);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertNotNull(intArray50);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    org.junit.Assert.assertNotNull(obj57);
    org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
  }

  @Test
  public void test0386() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0386");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    boolean boolean16 = simulatorHeader12.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData19 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date20 = simulatorData19.getCurrentTime();
    int int21 = opssat.simulator.util.DateExtraction.getDayFromDate(date20);
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData26 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date27 = simulatorData26.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap28 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date24, date27);
    opssat.simulator.util.SimulatorHeader simulatorHeader29 =
        new opssat.simulator.util.SimulatorHeader(
            false, date20, date27);
    simulatorHeader12.setStartDate(date27);
    boolean boolean31 = simulatorHeader12.isAutoStartTime();
    simulatorHeader12.setUpdateInternet(true);
    simulatorHeader12.setAutoStartTime(false);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(date20);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertNotNull(timeUnitMap28);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
  }

  @Test
  public void test0387() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0387");
    }
    boolean boolean1 = opssat.simulator.threading.SimulatorNode.isInteger("[0, 1]");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
  }

  @Test
  public void test0388() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0388");
    }
    opssat.simulator.util.SimulatorTimer simulatorTimer2 = new opssat.simulator.util.SimulatorTimer(
        "hi!", 1);
    boolean boolean3 = simulatorTimer2.isElapsed();
    boolean boolean4 = simulatorTimer2.isElapsed();
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0389() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0389");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    boolean boolean16 = simulatorHeader12.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData19 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date20 = simulatorData19.getCurrentTime();
    int int21 = opssat.simulator.util.DateExtraction.getDayFromDate(date20);
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData26 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date27 = simulatorData26.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap28 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date24, date27);
    opssat.simulator.util.SimulatorHeader simulatorHeader29 =
        new opssat.simulator.util.SimulatorHeader(
            false, date20, date27);
    simulatorHeader12.setStartDate(date27);
    java.util.Date date31 = simulatorHeader12.getEndDate();
    simulatorHeader12.setAutoStartTime(false);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(date20);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertNotNull(timeUnitMap28);
    org.junit.Assert.assertNotNull(date31);
  }

  @Test
  public void test0390() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0390");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    java.lang.String str5 = simulatorSpacecraftState3.getMagField();
    float[] floatArray6 = simulatorSpacecraftState3.getQ();
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str5 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str5.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray6);
  }

  @Test
  public void test0391() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0391");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    boolean boolean21 = simulatorHeader20.isAutoStartTime();
    simulatorHeader20.setUseCelestia(false);
    simulatorHeader20.setOrekitTLE1("[]");
    simulatorHeader20
        .setOrekitPropagator("opssat.simulator.util.wav.WavFileException: UnknownGUIData");
    java.lang.String str28 = simulatorHeader20.getOrekitPropagator();
    int int29 = simulatorHeader20.getHourStartDate();
    simulatorHeader20.setOrekitTLE1("52");
    java.lang.String str32 = simulatorHeader20.DATE_FORMAT;
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '" + "opssat.simulator.util.wav.WavFileException: UnknownGUIData" + "'",
        str28.equals("opssat.simulator.util.wav.WavFileException: UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "yyyy:MM:dd HH:mm:ss z" + "'",
        str32.equals("yyyy:MM:dd HH:mm:ss z"));
  }

  @Test
  public void test0392() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0392");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    java.lang.String str16 = simulatorHeader12.getOrekitTLE1();
    simulatorHeader12.setTimeFactor(31);
    simulatorHeader12.setUpdateInternet(false);
    boolean boolean21 = simulatorHeader12.isUpdateInternet();
    boolean boolean22 = simulatorHeader12.checkStartBeforeEnd();
    java.lang.String str23 = simulatorHeader12.getOrekitTLE1();
    java.lang.String str24 = simulatorHeader12.DATE_FORMAT;
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNull(str23);
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "yyyy:MM:dd HH:mm:ss z" + "'",
        str24.equals("yyyy:MM:dd HH:mm:ss z"));
  }

  @Test
  public void test0394() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0394");
    }
    java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList3 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean4 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
    int int6 = booleanList3.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor7 = booleanList3.iterator();
    java.lang.Boolean boolean9 = booleanList3.remove(0);
    int int10 = booleanList3.size();
    java.lang.Float[] floatArray14 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList15 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean16 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList15, floatArray14);
    boolean boolean18 = floatList15.add((-1.0f));
    floatList15.clear();
    java.util.stream.Stream<java.lang.Float> floatStream20 = floatList15.stream();
    java.lang.Byte[] byteArray25 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList26 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean27 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList26, byteArray25);
    java.lang.Integer[] intArray30 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean32 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
    boolean boolean33 = byteList26.retainAll(intList31);
    java.lang.Integer[] intArray36 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean38 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
    int int40 = intList37.lastIndexOf((byte) 10);
    boolean boolean41 = intList31.retainAll(intList37);
    boolean boolean42 = floatList15.containsAll(intList37);
    java.util.Spliterator<java.lang.Integer> intSpliterator43 = intList37.spliterator();
    java.util.stream.Stream<java.lang.Integer> intStream44 = intList37.parallelStream();
    boolean boolean45 = booleanList3.retainAll(intList37);
    opssat.simulator.util.SimulatorData simulatorData49 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date50 = simulatorData49.getCurrentTime();
    java.util.Date date51 = simulatorData49.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData52 = new opssat.simulator.util.SimulatorData(
        17, date51);
    opssat.simulator.util.SimulatorData simulatorData55 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date56 = simulatorData55.getCurrentTime();
    int int57 = opssat.simulator.util.DateExtraction.getDayFromDate(date56);
    opssat.simulator.util.SimulatorData simulatorData59 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date60 = simulatorData59.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData62 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date63 = simulatorData62.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap64 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date60, date63);
    opssat.simulator.util.SimulatorHeader simulatorHeader65 =
        new opssat.simulator.util.SimulatorHeader(
            false, date56, date63);
    opssat.simulator.util.SimulatorHeader simulatorHeader66 =
        new opssat.simulator.util.SimulatorHeader(
            false, date51, date56);
    boolean boolean67 = simulatorHeader66.isAutoStartTime();
    simulatorHeader66.setUseCelestia(false);
    boolean boolean70 = simulatorHeader66.isAutoStartSystem();
    boolean boolean71 = booleanList3.contains(simulatorHeader66);
    boolean boolean72 = simulatorHeader66.checkStartBeforeEnd();
    java.util.Date date74 = simulatorHeader66.parseStringIntoDate("UnknownGUIData");
    org.junit.Assert.assertNotNull(booleanArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    org.junit.Assert.assertNotNull(booleanItor7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertNotNull(floatStream20);
    org.junit.Assert.assertNotNull(byteArray25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertNotNull(intArray30);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertNotNull(intArray36);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertNotNull(intSpliterator43);
    org.junit.Assert.assertNotNull(intStream44);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertNotNull(date50);
    org.junit.Assert.assertNotNull(date51);
    org.junit.Assert.assertNotNull(date56);
    org.junit.Assert.assertNotNull(date60);
    org.junit.Assert.assertNotNull(date63);
    org.junit.Assert.assertNotNull(timeUnitMap64);
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    org.junit.Assert.assertNull(date74);
  }

  @Test
  public void test0395() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0395");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    octetList0.ensureCapacity(13);
    java.lang.Byte[] byteArray7 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList8 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean9 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList8, byteArray7);
    java.lang.Integer[] intArray12 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean14 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
    boolean boolean15 = byteList8.retainAll(intList13);
    boolean boolean16 = octetList0.containsAll(intList13);
    java.util.stream.Stream<java.lang.Byte> byteStream17 = octetList0.stream();
    java.lang.Long long18 = octetList0.getShortForm();
    opssat.simulator.util.SimulatorData simulatorData22 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date23 = simulatorData22.getCurrentTime();
    java.util.Date date24 = simulatorData22.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData25 = new opssat.simulator.util.SimulatorData(
        17, date24);
    opssat.simulator.util.SimulatorData simulatorData28 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date29 = simulatorData28.getCurrentTime();
    int int30 = opssat.simulator.util.DateExtraction.getDayFromDate(date29);
    opssat.simulator.util.SimulatorData simulatorData32 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date33 = simulatorData32.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData35 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date36 = simulatorData35.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap37 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date33, date36);
    opssat.simulator.util.SimulatorHeader simulatorHeader38 =
        new opssat.simulator.util.SimulatorHeader(
            false, date29, date36);
    opssat.simulator.util.SimulatorHeader simulatorHeader39 =
        new opssat.simulator.util.SimulatorHeader(
            false, date24, date29);
    int int40 = opssat.simulator.util.DateExtraction.getDayFromDate(date29);
    int int41 = opssat.simulator.util.DateExtraction.getDayFromDate(date29);
    boolean boolean42 = octetList0.contains(int41);
    org.junit.Assert.assertNotNull(byteArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNotNull(intArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(byteStream17);
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 281475010265081L + "'",
        long18.equals(281475010265081L));
    org.junit.Assert.assertNotNull(date23);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(date29);
    org.junit.Assert.assertNotNull(date33);
    org.junit.Assert.assertNotNull(date36);
    org.junit.Assert.assertNotNull(timeUnitMap37);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
  }

  @Test
  public void test0396() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0396");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date2 = simulatorData1.getCurrentTime();
    java.util.Date date3 = simulatorData1.getCurrentTime();
    java.lang.String str4 = simulatorData1.getUTCCurrentTime2();
    java.lang.String str5 = simulatorData1.getUTCCurrentTime2();
    org.junit.Assert.assertNotNull(date2);
    org.junit.Assert.assertNotNull(date3);
  }

  @Test
  public void test0397() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0397");
    }
    java.lang.Float[] floatArray3 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList4 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean5 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList4, floatArray3);
    boolean boolean7 = floatList4.add((-1.0f));
    floatList4.clear();
    boolean boolean9 = floatList4.isEmpty();
    java.util.ListIterator<java.lang.Float> floatItor10 = floatList4.listIterator();
    boolean boolean12 = floatList4.add(0.0f);
    org.ccsds.moims.mo.mal.structures.URI uRI14 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    java.lang.Integer int15 = uRI14.getTypeShortForm();
    java.lang.String str16 = uRI14.toString();
    java.lang.String str17 = uRI14.getValue();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet18 = uRI14.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.ShortList shortList20 =
        new org.ccsds.moims.mo.mal.structures.ShortList(
            ' ');
    java.lang.Long long21 = shortList20.getShortForm();
    java.util.stream.Stream<java.lang.Short> shortStream22 = shortList20.stream();
    boolean boolean23 = uOctet18.equals(shortList20);
    int int24 = floatList4.lastIndexOf(shortList20);
    java.util.Spliterator<java.lang.Float> floatSpliterator25 = floatList4.spliterator();
    java.lang.Long[] longArray28 = new java.lang.Long[]{0L, 10L};
    java.util.ArrayList<java.lang.Long> longList29 = new java.util.ArrayList<java.lang.Long>();
    boolean boolean30 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Long>) longList29, longArray28);
    java.lang.Object obj31 = longList29.clone();
    java.util.ListIterator<java.lang.Long> longItor33 = longList29.listIterator((byte) 1);
    java.lang.Object[] objArray34 = longList29.toArray();
    java.lang.Boolean[] booleanArray37 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList38 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean39 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList38, booleanArray37);
    int int41 = booleanList38.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor42 = booleanList38.iterator();
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator43 = booleanList38.spliterator();
    java.lang.Integer[] intArray51 = new java.lang.Integer[]{13, 10, 100, 100, 11111, 13, 11111};
    java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean53 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
    java.lang.Byte[] byteArray58 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList59 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean60 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList59, byteArray58);
    java.lang.Integer[] intArray63 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList64 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean65 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
    boolean boolean66 = byteList59.retainAll(intList64);
    java.lang.Integer[] intArray69 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList70 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean71 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
    int int73 = intList70.lastIndexOf((byte) 10);
    boolean boolean74 = intList64.removeAll(intList70);
    boolean boolean75 = intList52.retainAll(intList70);
    java.lang.Float[] floatArray79 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList80 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean81 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList80, floatArray79);
    boolean boolean83 = floatList80.add((-1.0f));
    floatList80.trimToSize();
    java.lang.Integer[] intArray89 = new java.lang.Integer[]{100, 1, (-1), 10};
    java.util.ArrayList<java.lang.Integer> intList90 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean91 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
    int int93 = intList90.lastIndexOf((byte) 1);
    boolean boolean94 = floatList80.containsAll(intList90);
    boolean boolean95 = intList52.addAll(intList90);
    boolean boolean96 = booleanList38.removeAll(intList52);
    boolean boolean97 = longList29.retainAll(intList52);
    boolean boolean98 = floatList4.contains(boolean97);
    org.junit.Assert.assertNotNull(floatArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNotNull(floatItor10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15.equals(18));
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "0100.0000" + "'",
        str16.equals("0100.0000"));
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "0100.0000" + "'",
        str17.equals("0100.0000"));
    org.junit.Assert.assertNotNull(uOctet18);
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 281475010265079L + "'",
        long21.equals(281475010265079L));
    org.junit.Assert.assertNotNull(shortStream22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    org.junit.Assert.assertNotNull(floatSpliterator25);
    org.junit.Assert.assertNotNull(longArray28);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertNotNull(obj31);
    org.junit.Assert.assertNotNull(longItor33);
    org.junit.Assert.assertNotNull(objArray34);
    org.junit.Assert.assertNotNull(booleanArray37);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    org.junit.Assert.assertNotNull(booleanItor42);
    org.junit.Assert.assertNotNull(booleanSpliterator43);
    org.junit.Assert.assertNotNull(intArray51);
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    org.junit.Assert.assertNotNull(byteArray58);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    org.junit.Assert.assertNotNull(intArray63);
    org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    org.junit.Assert.assertNotNull(intArray69);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    org.junit.Assert.assertNotNull(floatArray79);
    org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    org.junit.Assert.assertNotNull(intArray89);
    org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
  }

  @Test
  public void test0399() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0399");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    int int5 = opssat.simulator.util.DateExtraction.getDayFromDate(date4);
    opssat.simulator.util.SimulatorData simulatorData7 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date8 = simulatorData7.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData10 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date11 = simulatorData10.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap12 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date8, date11);
    opssat.simulator.util.SimulatorHeader simulatorHeader13 =
        new opssat.simulator.util.SimulatorHeader(
            false, date4, date11);
    opssat.simulator.util.SimulatorData simulatorData14 = new opssat.simulator.util.SimulatorData(
        (short) 0, date4);
    opssat.simulator.util.SimulatorData simulatorData17 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date18 = simulatorData17.getCurrentTime();
    int int19 = opssat.simulator.util.DateExtraction.getDayFromDate(date18);
    opssat.simulator.util.SimulatorData simulatorData21 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date22 = simulatorData21.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData24 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date25 = simulatorData24.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap26 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date22, date25);
    opssat.simulator.util.SimulatorHeader simulatorHeader27 =
        new opssat.simulator.util.SimulatorHeader(
            false, date18, date25);
    java.util.Date date28 = simulatorHeader27.getEndDate();
    opssat.simulator.util.SimulatorData simulatorData32 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date33 = simulatorData32.getCurrentTime();
    java.util.Date date34 = simulatorData32.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData35 = new opssat.simulator.util.SimulatorData(
        17, date34);
    opssat.simulator.util.SimulatorData simulatorData38 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date39 = simulatorData38.getCurrentTime();
    int int40 = opssat.simulator.util.DateExtraction.getDayFromDate(date39);
    opssat.simulator.util.SimulatorData simulatorData42 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date43 = simulatorData42.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData45 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date46 = simulatorData45.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap47 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date43, date46);
    opssat.simulator.util.SimulatorHeader simulatorHeader48 =
        new opssat.simulator.util.SimulatorHeader(
            false, date39, date46);
    opssat.simulator.util.SimulatorHeader simulatorHeader49 =
        new opssat.simulator.util.SimulatorHeader(
            false, date34, date39);
    simulatorHeader27.setEndDate(date34);
    simulatorData14.initFromHeader(simulatorHeader27);
    java.lang.String str52 = simulatorHeader27.getOrekitTLE2();
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertNotNull(date11);
    org.junit.Assert.assertNotNull(timeUnitMap12);
    org.junit.Assert.assertNotNull(date18);
    org.junit.Assert.assertNotNull(date22);
    org.junit.Assert.assertNotNull(date25);
    org.junit.Assert.assertNotNull(timeUnitMap26);
    org.junit.Assert.assertNotNull(date28);
    org.junit.Assert.assertNotNull(date33);
    org.junit.Assert.assertNotNull(date34);
    org.junit.Assert.assertNotNull(date39);
    org.junit.Assert.assertNotNull(date43);
    org.junit.Assert.assertNotNull(date46);
    org.junit.Assert.assertNotNull(timeUnitMap47);
    org.junit.Assert.assertNull(str52);
  }

  @Test
  public void test0400() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0400");
    }
    java.io.File file0 = null;
    try {
      opssat.simulator.util.wav.WavFile wavFile1 = opssat.simulator.util.wav.WavFile
          .openWavFile(file0);
      org.junit.Assert
          .fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0401() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0401");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    boolean boolean21 = simulatorHeader20.isAutoStartTime();
    simulatorHeader20.setUseCelestia(false);
    boolean boolean24 = simulatorHeader20.isAutoStartSystem();
    org.ccsds.moims.mo.mal.structures.URI uRI26 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    java.lang.Integer int27 = uRI26.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.URI uRI29 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.UOctet uOctet30 = uRI29.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.URI uRI32 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.URI[] uRIArray33 =
        new org.ccsds.moims.mo.mal.structures.URI[]{
          uRI26, uRI29, uRI32};
    java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI> uRIList34 =
        new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI>();
    boolean boolean35 = java.util.Collections.addAll(
        (java.util.Collection<org.ccsds.moims.mo.mal.structures.URI>) uRIList34, uRIArray33);
    org.ccsds.moims.mo.mal.structures.FineTime fineTime36 =
        new org.ccsds.moims.mo.mal.structures.FineTime();
    int int37 = uRIList34.indexOf(fineTime36);
    uRIList34.ensureCapacity(40);
    java.lang.Object obj40 = uRIList34.clone();
    org.ccsds.moims.mo.mal.structures.URI uRI43 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.UOctet uOctet44 = uRI43.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.URI uRI45 = uRIList34.set((byte) 1, uRI43);
    java.lang.String str46 = uRI43.toString();
    opssat.simulator.util.SimulatorData simulatorData49 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date50 = simulatorData49.getCurrentTime();
    java.util.Date date51 = simulatorData49.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData52 = new opssat.simulator.util.SimulatorData(
        34, date51);
    boolean boolean53 = uRI43.equals(date51);
    simulatorHeader20.setEndDate(date51);
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27.equals(18));
    org.junit.Assert.assertNotNull(uOctet30);
    org.junit.Assert.assertNotNull(uRIArray33);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    org.junit.Assert.assertNotNull(obj40);
    org.junit.Assert.assertNotNull(uOctet44);
    org.junit.Assert.assertNotNull(uRI45);
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "0100.0000" + "'",
        str46.equals("0100.0000"));
    org.junit.Assert.assertNotNull(date50);
    org.junit.Assert.assertNotNull(date51);
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
  }

  @Test
  public void test0402() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0402");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    int int5 = opssat.simulator.util.DateExtraction.getDayFromDate(date4);
    opssat.simulator.util.SimulatorData simulatorData7 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date8 = simulatorData7.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData10 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date11 = simulatorData10.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap12 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date8, date11);
    opssat.simulator.util.SimulatorHeader simulatorHeader13 =
        new opssat.simulator.util.SimulatorHeader(
            false, date4, date11);
    opssat.simulator.util.SimulatorData simulatorData14 = new opssat.simulator.util.SimulatorData(
        (short) 0, date4);
    opssat.simulator.util.SimulatorData simulatorData17 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date18 = simulatorData17.getCurrentTime();
    int int19 = opssat.simulator.util.DateExtraction.getDayFromDate(date18);
    opssat.simulator.util.SimulatorData simulatorData21 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date22 = simulatorData21.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData24 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date25 = simulatorData24.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap26 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date22, date25);
    opssat.simulator.util.SimulatorHeader simulatorHeader27 =
        new opssat.simulator.util.SimulatorHeader(
            false, date18, date25);
    java.util.Date date28 = simulatorHeader27.getEndDate();
    opssat.simulator.util.SimulatorData simulatorData32 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date33 = simulatorData32.getCurrentTime();
    java.util.Date date34 = simulatorData32.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData35 = new opssat.simulator.util.SimulatorData(
        17, date34);
    opssat.simulator.util.SimulatorData simulatorData38 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date39 = simulatorData38.getCurrentTime();
    int int40 = opssat.simulator.util.DateExtraction.getDayFromDate(date39);
    opssat.simulator.util.SimulatorData simulatorData42 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date43 = simulatorData42.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData45 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date46 = simulatorData45.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap47 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date43, date46);
    opssat.simulator.util.SimulatorHeader simulatorHeader48 =
        new opssat.simulator.util.SimulatorHeader(
            false, date39, date46);
    opssat.simulator.util.SimulatorHeader simulatorHeader49 =
        new opssat.simulator.util.SimulatorHeader(
            false, date34, date39);
    simulatorHeader27.setEndDate(date34);
    simulatorData14.initFromHeader(simulatorHeader27);
    java.lang.String str52 = simulatorHeader27.getOrekitPropagator();
    simulatorHeader27
        .setOrekitPropagator("opssat.simulator.util.wav.WavFileException: 00000:00:00:00:008");
    boolean boolean55 = simulatorHeader27.isUseOrekitPropagator();
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertNotNull(date11);
    org.junit.Assert.assertNotNull(timeUnitMap12);
    org.junit.Assert.assertNotNull(date18);
    org.junit.Assert.assertNotNull(date22);
    org.junit.Assert.assertNotNull(date25);
    org.junit.Assert.assertNotNull(timeUnitMap26);
    org.junit.Assert.assertNotNull(date28);
    org.junit.Assert.assertNotNull(date33);
    org.junit.Assert.assertNotNull(date34);
    org.junit.Assert.assertNotNull(date39);
    org.junit.Assert.assertNotNull(date43);
    org.junit.Assert.assertNotNull(date46);
    org.junit.Assert.assertNotNull(timeUnitMap47);
    org.junit.Assert.assertNull(str52);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
  }

  @Test
  public void test0403() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0403");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    int int50 = celestiaData32.getSeconds();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState54 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray57 = new float[]{28, 8};
    simulatorSpacecraftState54.setQ(floatArray57);
    celestiaData32.setQ(floatArray57);
    celestiaData32.setDnx("030956.115");
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
    org.junit.Assert.assertNotNull(floatArray57);
  }

  @Test
  public void test0404() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0404");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    simulatorHeader20.setUpdateInternet(true);
    java.util.Date date23 = null;
    simulatorHeader20.setEndDate(date23);
    int int25 = simulatorHeader20.getMinuteStartDate();
    int int26 = simulatorHeader20.getMinuteStartDate();
    simulatorHeader20.setOrekitTLE1("");
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
  }

  @Test
  public void test0405() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0405");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState4 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray7 = new float[]{28, 8};
    simulatorSpacecraftState4.setQ(floatArray7);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState12 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double13 = simulatorSpacecraftState12.getLatitude();
    java.lang.String str14 = simulatorSpacecraftState12.getMagField();
    float[] floatArray15 = simulatorSpacecraftState12.getR();
    simulatorSpacecraftState4.setQ(floatArray15);
    java.lang.String str17 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray15);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState21 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double22 = simulatorSpacecraftState21.getLatitude();
    double double23 = simulatorSpacecraftState21.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState27 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double28 = simulatorSpacecraftState27.getLatitude();
    java.lang.String str29 = simulatorSpacecraftState27.getMagField();
    float[] floatArray30 = simulatorSpacecraftState27.getR();
    simulatorSpacecraftState21.setQ(floatArray30);
    float[] floatArray32 = simulatorSpacecraftState21.getV();
    opssat.simulator.celestia.CelestiaData celestiaData33 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray15, floatArray32);
    float[] floatArray34 = celestiaData33.getQ();
    opssat.simulator.util.SimulatorData simulatorData38 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date39 = simulatorData38.getCurrentTime();
    int int40 = opssat.simulator.util.DateExtraction.getDayFromDate(date39);
    opssat.simulator.util.SimulatorData simulatorData42 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date43 = simulatorData42.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData45 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date46 = simulatorData45.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap47 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date43, date46);
    opssat.simulator.util.SimulatorHeader simulatorHeader48 =
        new opssat.simulator.util.SimulatorHeader(
            false, date39, date46);
    opssat.simulator.util.SimulatorData simulatorData49 = new opssat.simulator.util.SimulatorData(
        (short) 0, date39);
    celestiaData33.setDate(date39);
    opssat.simulator.util.SimulatorData simulatorData52 = new opssat.simulator.util.SimulatorData(
        (-18));
    simulatorData52.setCounter((-1));
    simulatorData52.feedTimeElapsed(21);
    java.lang.String str57 = simulatorData52.getCurrentDay();
    boolean boolean58 = simulatorData52.isTimeRunning();
    java.util.Date date59 = simulatorData52.getCurrentTime();
    opssat.simulator.util.SimulatorHeader simulatorHeader60 =
        new opssat.simulator.util.SimulatorHeader(
            false, date39, date59);
    int int61 = simulatorHeader60.getCelestiaPort();
    org.junit.Assert.assertNotNull(floatArray7);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 340.0d + "'", double13 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str14 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str14.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray15);
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "UnknownGUIData" + "'",
        str17.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 340.0d + "'", double23 == 340.0d);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 340.0d + "'", double28 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str29 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str29.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray30);
    org.junit.Assert.assertNotNull(floatArray32);
    org.junit.Assert.assertNotNull(floatArray34);
    org.junit.Assert.assertNotNull(date39);
    org.junit.Assert.assertNotNull(date43);
    org.junit.Assert.assertNotNull(date46);
    org.junit.Assert.assertNotNull(timeUnitMap47);
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    org.junit.Assert.assertNotNull(date59);
    org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
  }

  @Test
  public void test0406() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0406");
    }
    java.math.BigInteger bigInteger0 = org.ccsds.moims.mo.mal.structures.ULong.MAX_VALUE;
    org.ccsds.moims.mo.mal.structures.ULong uLong1 = new org.ccsds.moims.mo.mal.structures.ULong(
        bigInteger0);
    java.lang.String str2 = uLong1.toString();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet3 = uLong1.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.Element element4 = uLong1.createElement();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet5 = uLong1.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.OctetList octetList6 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int7 = octetList6.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort8 = octetList6.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet9 = octetList6.getAreaVersion();
    opssat.simulator.util.wav.WavFileException wavFileException11 =
        new opssat.simulator.util.wav.WavFileException(
            "UnknownGUIData");
    java.lang.Throwable[] throwableArray12 = wavFileException11.getSuppressed();
    boolean boolean13 = octetList6.equals(wavFileException11);
    org.ccsds.moims.mo.mal.structures.FloatList floatList15 =
        new org.ccsds.moims.mo.mal.structures.FloatList(
            (byte) 0);
    java.lang.Integer int16 = floatList15.getTypeShortForm();
    java.lang.Integer int17 = floatList15.getTypeShortForm();
    floatList15.clear();
    boolean boolean19 = octetList6.remove(floatList15);
    java.util.ListIterator<java.lang.Float> floatItor20 = floatList15.listIterator();
    org.ccsds.moims.mo.mal.structures.UShort uShort21 = floatList15.getAreaNumber();
    boolean boolean22 = uLong1.equals(floatList15);
    org.ccsds.moims.mo.mal.structures.Element element23 = uLong1.createElement();
    org.junit.Assert.assertNotNull(bigInteger0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "18446744073709551615" + "'",
        str2.equals("18446744073709551615"));
    org.junit.Assert.assertNotNull(uOctet3);
    org.junit.Assert.assertNotNull(element4);
    org.junit.Assert.assertNotNull(uOctet5);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7.equals((-7)));
    org.junit.Assert.assertNotNull(uShort8);
    org.junit.Assert.assertNotNull(uOctet9);
    org.junit.Assert.assertNotNull(throwableArray12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-4) + "'", int16.equals((-4)));
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-4) + "'", int17.equals((-4)));
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(floatItor20);
    org.junit.Assert.assertNotNull(uShort21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(element23);
  }

  @Test
  public void test0407() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0407");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    boolean boolean16 = simulatorHeader12.isUseCelestia();
    java.lang.String str17 = simulatorHeader12.toString();
    simulatorHeader12.setOrekitTLE1("Alive");
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
  }

  @Test
  public void test0408() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0408");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState4 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray7 = new float[]{28, 8};
    simulatorSpacecraftState4.setQ(floatArray7);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState12 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double13 = simulatorSpacecraftState12.getLatitude();
    java.lang.String str14 = simulatorSpacecraftState12.getMagField();
    float[] floatArray15 = simulatorSpacecraftState12.getR();
    simulatorSpacecraftState4.setQ(floatArray15);
    java.lang.String str17 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray15);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState21 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double22 = simulatorSpacecraftState21.getLatitude();
    double double23 = simulatorSpacecraftState21.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState27 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double28 = simulatorSpacecraftState27.getLatitude();
    java.lang.String str29 = simulatorSpacecraftState27.getMagField();
    float[] floatArray30 = simulatorSpacecraftState27.getR();
    simulatorSpacecraftState21.setQ(floatArray30);
    float[] floatArray32 = simulatorSpacecraftState21.getV();
    opssat.simulator.celestia.CelestiaData celestiaData33 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray15, floatArray32);
    float[] floatArray34 = celestiaData33.getQ();
    opssat.simulator.util.SimulatorData simulatorData38 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date39 = simulatorData38.getCurrentTime();
    int int40 = opssat.simulator.util.DateExtraction.getDayFromDate(date39);
    opssat.simulator.util.SimulatorData simulatorData42 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date43 = simulatorData42.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData45 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date46 = simulatorData45.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap47 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date43, date46);
    opssat.simulator.util.SimulatorHeader simulatorHeader48 =
        new opssat.simulator.util.SimulatorHeader(
            false, date39, date46);
    opssat.simulator.util.SimulatorData simulatorData49 = new opssat.simulator.util.SimulatorData(
        (short) 0, date39);
    celestiaData33.setDate(date39);
    opssat.simulator.util.SimulatorData simulatorData52 = new opssat.simulator.util.SimulatorData(
        (-18));
    simulatorData52.setCounter((-1));
    simulatorData52.feedTimeElapsed(21);
    java.lang.String str57 = simulatorData52.getCurrentDay();
    boolean boolean58 = simulatorData52.isTimeRunning();
    java.util.Date date59 = simulatorData52.getCurrentTime();
    opssat.simulator.util.SimulatorHeader simulatorHeader60 =
        new opssat.simulator.util.SimulatorHeader(
            false, date39, date59);
    int int61 = opssat.simulator.util.DateExtraction.getHourFromDate(date39);
    org.junit.Assert.assertNotNull(floatArray7);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 340.0d + "'", double13 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str14 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str14.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray15);
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "UnknownGUIData" + "'",
        str17.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 340.0d + "'", double23 == 340.0d);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 340.0d + "'", double28 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str29 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str29.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray30);
    org.junit.Assert.assertNotNull(floatArray32);
    org.junit.Assert.assertNotNull(floatArray34);
    org.junit.Assert.assertNotNull(date39);
    org.junit.Assert.assertNotNull(date43);
    org.junit.Assert.assertNotNull(date46);
    org.junit.Assert.assertNotNull(timeUnitMap47);
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    org.junit.Assert.assertNotNull(date59);
  }

  @Test
  public void test0409() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0409");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    boolean boolean16 = simulatorHeader12.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData19 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date20 = simulatorData19.getCurrentTime();
    int int21 = opssat.simulator.util.DateExtraction.getDayFromDate(date20);
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData26 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date27 = simulatorData26.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap28 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date24, date27);
    opssat.simulator.util.SimulatorHeader simulatorHeader29 =
        new opssat.simulator.util.SimulatorHeader(
            false, date20, date27);
    simulatorHeader12.setStartDate(date27);
    boolean boolean31 = simulatorHeader12.isAutoStartTime();
    simulatorHeader12.setUpdateInternet(true);
    java.lang.String str34 = simulatorHeader12.DATE_FORMAT;
    int int35 = simulatorHeader12.getHourStartDate();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(date20);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertNotNull(timeUnitMap28);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "yyyy:MM:dd HH:mm:ss z" + "'",
        str34.equals("yyyy:MM:dd HH:mm:ss z"));
  }

  @Test
  public void test0410() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0410");
    }
    java.util.logging.Logger logger0 = null;
    opssat.simulator.util.EndlessWavStreamOperatingBuffer endlessWavStreamOperatingBuffer1 =
        new opssat.simulator.util.EndlessWavStreamOperatingBuffer(
            logger0);
    try {
      boolean boolean3 = endlessWavStreamOperatingBuffer1.loadFromPath("2019:05:23 15:09:35 UTC");
      org.junit.Assert
          .fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0411() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0411");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    java.lang.String str5 = simulatorSpacecraftState3.getMagField();
    simulatorSpacecraftState3.setLatitude((-4));
    java.lang.String str8 = simulatorSpacecraftState3.getMagField();
    simulatorSpacecraftState3.setSatsInView((-4));
    float[] floatArray11 = simulatorSpacecraftState3.getQ();
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str5 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str5.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str8 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str8.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray11);
  }

  @Test
  public void test0412() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0412");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    simulatorHeader12.setOrekitTLE1("");
    java.lang.String str16 = simulatorHeader12.DATE_FORMAT;
    simulatorHeader12.setAutoStartSystem(false);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "yyyy:MM:dd HH:mm:ss z" + "'",
        str16.equals("yyyy:MM:dd HH:mm:ss z"));
  }

  @Test
  public void test0413() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0413");
    }
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor2 =
        new opssat.simulator.util.ArgumentDescriptor(
            "00000:00:00:00:-02", "2019:05:23 15:09:36 UTC");
    java.lang.Float[] floatArray6 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList7 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean8 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList7, floatArray6);
    boolean boolean10 = floatList7.add((-1.0f));
    floatList7.clear();
    java.util.stream.Stream<java.lang.Float> floatStream12 = floatList7.stream();
    java.lang.Byte[] byteArray17 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList18 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean19 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList18, byteArray17);
    java.lang.Integer[] intArray22 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean24 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
    boolean boolean25 = byteList18.retainAll(intList23);
    java.lang.Integer[] intArray28 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean30 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
    int int32 = intList29.lastIndexOf((byte) 10);
    boolean boolean33 = intList23.retainAll(intList29);
    boolean boolean34 = floatList7.containsAll(intList29);
    argumentDescriptor2.setType(floatList7);
    java.lang.String str36 = argumentDescriptor2.toString();
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(floatStream12);
    org.junit.Assert.assertNotNull(byteArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNotNull(intArray22);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertNotNull(intArray28);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
  }

  @Test
  public void test0414() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0414");
    }
    java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList3 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean4 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
    int int6 = booleanList3.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor7 = booleanList3.iterator();
    java.lang.Boolean boolean9 = booleanList3.remove(0);
    int int10 = booleanList3.size();
    java.lang.Float[] floatArray14 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList15 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean16 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList15, floatArray14);
    boolean boolean18 = floatList15.add((-1.0f));
    floatList15.clear();
    java.util.stream.Stream<java.lang.Float> floatStream20 = floatList15.stream();
    java.lang.Byte[] byteArray25 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList26 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean27 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList26, byteArray25);
    java.lang.Integer[] intArray30 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean32 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
    boolean boolean33 = byteList26.retainAll(intList31);
    java.lang.Integer[] intArray36 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean38 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
    int int40 = intList37.lastIndexOf((byte) 10);
    boolean boolean41 = intList31.retainAll(intList37);
    boolean boolean42 = floatList15.containsAll(intList37);
    java.util.Spliterator<java.lang.Integer> intSpliterator43 = intList37.spliterator();
    java.util.stream.Stream<java.lang.Integer> intStream44 = intList37.parallelStream();
    boolean boolean45 = booleanList3.retainAll(intList37);
    opssat.simulator.util.SimulatorData simulatorData49 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date50 = simulatorData49.getCurrentTime();
    java.util.Date date51 = simulatorData49.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData52 = new opssat.simulator.util.SimulatorData(
        17, date51);
    opssat.simulator.util.SimulatorData simulatorData55 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date56 = simulatorData55.getCurrentTime();
    int int57 = opssat.simulator.util.DateExtraction.getDayFromDate(date56);
    opssat.simulator.util.SimulatorData simulatorData59 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date60 = simulatorData59.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData62 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date63 = simulatorData62.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap64 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date60, date63);
    opssat.simulator.util.SimulatorHeader simulatorHeader65 =
        new opssat.simulator.util.SimulatorHeader(
            false, date56, date63);
    opssat.simulator.util.SimulatorHeader simulatorHeader66 =
        new opssat.simulator.util.SimulatorHeader(
            false, date51, date56);
    boolean boolean67 = simulatorHeader66.isAutoStartTime();
    simulatorHeader66.setUseCelestia(false);
    boolean boolean70 = simulatorHeader66.isAutoStartSystem();
    boolean boolean71 = booleanList3.contains(simulatorHeader66);
    boolean boolean72 = simulatorHeader66.checkStartBeforeEnd();
    java.lang.String str73 = simulatorHeader66.getEndDateString();
    simulatorHeader66.setTimeFactor((byte) -1);
    org.junit.Assert.assertNotNull(booleanArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    org.junit.Assert.assertNotNull(booleanItor7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertNotNull(floatStream20);
    org.junit.Assert.assertNotNull(byteArray25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertNotNull(intArray30);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertNotNull(intArray36);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertNotNull(intSpliterator43);
    org.junit.Assert.assertNotNull(intStream44);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertNotNull(date50);
    org.junit.Assert.assertNotNull(date51);
    org.junit.Assert.assertNotNull(date56);
    org.junit.Assert.assertNotNull(date60);
    org.junit.Assert.assertNotNull(date63);
    org.junit.Assert.assertNotNull(timeUnitMap64);
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
  }

  @Test
  public void test0415() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0415");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    int int14 = simulatorHeader12.getMinuteStartDate();
    simulatorHeader12.setUseOrekitPropagator(true);
    simulatorHeader12.setUseCelestia(false);
    boolean boolean19 = simulatorHeader12.isAutoStartTime();
    java.lang.String str20 = simulatorHeader12.getOrekitPropagator();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNull(str20);
  }

  @Test
  public void test0417() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0417");
    }
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece3 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            13L, 0, "hi!");
    long long4 = simulatorSchedulerPiece3.getTime();
    int int5 = simulatorSchedulerPiece3.getInternalID();
    java.lang.String str6 = simulatorSchedulerPiece3.getFileString();
    java.lang.String str7 = simulatorSchedulerPiece3.getFileString();
    int int8 = simulatorSchedulerPiece3.getInternalID();
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 13L + "'", long4 == 13L);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertTrue(
        "'" + str6 + "' != '" + "00000:00:00:00:013|0000000000000000013|0|hi!" + "'",
        str6.equals("00000:00:00:00:013|0000000000000000013|0|hi!"));
    org.junit.Assert.assertTrue(
        "'" + str7 + "' != '" + "00000:00:00:00:013|0000000000000000013|0|hi!" + "'",
        str7.equals("00000:00:00:00:013|0000000000000000013|0|hi!"));
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
  }

  @Test
  public void test0418() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0418");
    }
    org.ccsds.moims.mo.mal.structures.StringList stringList0 =
        new org.ccsds.moims.mo.mal.structures.StringList();
    org.ccsds.moims.mo.mal.structures.ShortList shortList2 =
        new org.ccsds.moims.mo.mal.structures.ShortList(
            ' ');
    java.util.ListIterator<java.lang.Short> shortItor3 = shortList2.listIterator();
    boolean boolean4 = stringList0.equals(shortList2);
    java.util.stream.BaseStream[] baseStreamArray6 = new java.util.stream.BaseStream[0];
    @SuppressWarnings("unchecked")
    java.util.stream.BaseStream<java.lang.Float, java.util.stream.Stream<java.lang.Float>>[] floatBaseStreamArray7 =
        baseStreamArray6;
    java.util.stream.BaseStream<java.lang.Float, java.util.stream.Stream<java.lang.Float>>[] floatBaseStreamArray8 =
        stringList0
            .toArray(
                (java.util.stream.BaseStream<java.lang.Float, java.util.stream.Stream<java.lang.Float>>[]) baseStreamArray6);
    java.util.stream.Stream<java.lang.String> strStream9 = stringList0.stream();
    java.lang.Object obj10 = stringList0.clone();
    opssat.simulator.util.LoggerFormatter loggerFormatter11 =
        new opssat.simulator.util.LoggerFormatter();
    opssat.simulator.util.LoggerFormatter loggerFormatter12 =
        new opssat.simulator.util.LoggerFormatter();
    opssat.simulator.util.LoggerFormatter loggerFormatter13 =
        new opssat.simulator.util.LoggerFormatter();
    opssat.simulator.util.LoggerFormatter[] loggerFormatterArray14 =
        new opssat.simulator.util.LoggerFormatter[]{
          loggerFormatter11, loggerFormatter12, loggerFormatter13};
    opssat.simulator.util.LoggerFormatter[] loggerFormatterArray15 = stringList0
        .toArray(loggerFormatterArray14);
    java.util.stream.Stream<java.lang.String> strStream16 = stringList0.parallelStream();
    org.ccsds.moims.mo.mal.structures.UShort uShort17 = stringList0.getServiceNumber();
    java.lang.Integer int18 = stringList0.getTypeShortForm();
    org.junit.Assert.assertNotNull(shortItor3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(baseStreamArray6);
    org.junit.Assert.assertNotNull(floatBaseStreamArray7);
    org.junit.Assert.assertNotNull(floatBaseStreamArray8);
    org.junit.Assert.assertNotNull(strStream9);
    org.junit.Assert.assertNotNull(obj10);
    org.junit.Assert.assertNotNull(loggerFormatterArray14);
    org.junit.Assert.assertNotNull(loggerFormatterArray15);
    org.junit.Assert.assertNotNull(strStream16);
    org.junit.Assert.assertNotNull(uShort17);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-15) + "'", int18.equals((-15)));
  }

  @Test
  public void test0419() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0419");
    }
    org.ccsds.moims.mo.mal.structures.StringList stringList0 =
        new org.ccsds.moims.mo.mal.structures.StringList();
    org.ccsds.moims.mo.mal.structures.ShortList shortList2 =
        new org.ccsds.moims.mo.mal.structures.ShortList(
            ' ');
    java.util.ListIterator<java.lang.Short> shortItor3 = shortList2.listIterator();
    boolean boolean4 = stringList0.equals(shortList2);
    java.lang.Integer int5 = shortList2.getTypeShortForm();
    java.lang.Float[] floatArray9 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList10 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean11 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList10, floatArray9);
    boolean boolean13 = floatList10.add((-1.0f));
    floatList10.clear();
    java.util.stream.Stream<java.lang.Float> floatStream15 = floatList10.stream();
    java.lang.Byte[] byteArray20 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList21 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean22 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList21, byteArray20);
    java.lang.Integer[] intArray25 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean27 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
    boolean boolean28 = byteList21.retainAll(intList26);
    java.lang.Integer[] intArray31 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean33 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
    int int35 = intList32.lastIndexOf((byte) 10);
    boolean boolean36 = intList26.retainAll(intList32);
    boolean boolean37 = floatList10.containsAll(intList32);
    java.util.Spliterator<java.lang.Integer> intSpliterator38 = intList32.spliterator();
    java.util.stream.Stream<java.lang.Integer> intStream39 = intList32.parallelStream();
    org.ccsds.moims.mo.mal.structures.LongList longList40 =
        new org.ccsds.moims.mo.mal.structures.LongList();
    java.lang.Integer int41 = longList40.getTypeShortForm();
    boolean boolean42 = intList32.equals(int41);
    boolean boolean43 = shortList2.retainAll(intList32);
    opssat.simulator.util.LoggerFormatter loggerFormatter44 =
        new opssat.simulator.util.LoggerFormatter();
    java.lang.Float[] floatArray48 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList49 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean50 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList49, floatArray48);
    boolean boolean52 = floatList49.add((-1.0f));
    floatList49.trimToSize();
    boolean boolean55 = floatList49.add((-1.0f));
    java.lang.Float float57 = floatList49.remove((byte) 0);
    boolean boolean59 = floatList49.add(1.0f);
    opssat.simulator.util.LoggerFormatter loggerFormatter60 =
        new opssat.simulator.util.LoggerFormatter();
    boolean boolean61 = floatList49.remove(loggerFormatter60);
    opssat.simulator.util.LoggerFormatter[] loggerFormatterArray62 =
        new opssat.simulator.util.LoggerFormatter[]{
          loggerFormatter44, loggerFormatter60};
    opssat.simulator.util.LoggerFormatter[][] loggerFormatterArray63 =
        new opssat.simulator.util.LoggerFormatter[][]{
          loggerFormatterArray62};
    opssat.simulator.util.LoggerFormatter[][] loggerFormatterArray64 = shortList2
        .toArray(loggerFormatterArray63);
    org.junit.Assert.assertNotNull(shortItor3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-9) + "'", int5.equals((-9)));
    org.junit.Assert.assertNotNull(floatArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(floatStream15);
    org.junit.Assert.assertNotNull(byteArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(intArray25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    org.junit.Assert.assertNotNull(intArray31);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(intSpliterator38);
    org.junit.Assert.assertNotNull(intStream39);
    org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-13) + "'", int41.equals((-13)));
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertNotNull(floatArray48);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    org.junit.Assert.assertTrue("'" + float57 + "' != '" + 1.0f + "'", float57.equals(1.0f));
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    org.junit.Assert.assertNotNull(loggerFormatterArray62);
    org.junit.Assert.assertNotNull(loggerFormatterArray63);
    org.junit.Assert.assertNotNull(loggerFormatterArray64);
  }

  @Test
  public void test0420() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0420");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    boolean boolean16 = simulatorHeader12.isUseCelestia();
    simulatorHeader12.setKeplerElements("0900.0000");
    simulatorHeader12.setUseOrekitPropagator(false);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
  }

  @Test
  public void test0421() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0421");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long2 = simulatorData1.getCurrentTimeMillis();
    java.lang.String str3 = simulatorData1.getCurrentDay();
    java.lang.String str4 = simulatorData1.getUTCCurrentTime2();
    java.lang.String str5 = simulatorData1.getCurrentDay();
    java.util.Date date6 = simulatorData1.getCurrentTime();
    java.lang.String str7 = simulatorData1.getCurrentYear();
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertNotNull(date6);
  }

  @Test
  public void test0422() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0422");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState8 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray11 = new float[]{28, 8};
    simulatorSpacecraftState8.setQ(floatArray11);
    simulatorSpacecraftState3.setRv(floatArray11);
    double[][] doubleArray14 = new double[][]{};
    simulatorSpacecraftState3.setRotation(doubleArray14);
    simulatorSpacecraftState3.setSatsInView(97);
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertNotNull(floatArray11);
    org.junit.Assert.assertNotNull(doubleArray14);
  }

  @Test
  public void test0423() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0423");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    boolean boolean21 = simulatorHeader20.isAutoStartTime();
    simulatorHeader20.setUseCelestia(false);
    simulatorHeader20.setOrekitTLE1("[]");
    simulatorHeader20
        .setOrekitPropagator("opssat.simulator.util.wav.WavFileException: UnknownGUIData");
    java.lang.String str28 = simulatorHeader20.getOrekitPropagator();
    simulatorHeader20.setTimeFactor(8);
    boolean boolean31 = simulatorHeader20.isUpdateInternet();
    int int32 = simulatorHeader20.getMinuteStartDate();
    java.lang.String str33 = simulatorHeader20.getOrekitTLE2();
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '" + "opssat.simulator.util.wav.WavFileException: UnknownGUIData" + "'",
        str28.equals("opssat.simulator.util.wav.WavFileException: UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNull(str33);
  }

  @Test
  public void test0424() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0424");
    }
    java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[]{true};
    java.util.ArrayList<java.lang.Boolean> booleanList2 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean3 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
    java.util.Spliterator<java.lang.Boolean> booleanSpliterator4 = booleanList2.spliterator();
    int int5 = booleanList2.size();
    opssat.simulator.util.SimulatorTimer simulatorTimer8 = new opssat.simulator.util.SimulatorTimer(
        "3257812:10:11:27:876", 18);
    simulatorTimer8.setDuration(0L);
    simulatorTimer8.setDuration((short) 100);
    boolean boolean13 = booleanList2.contains((short) 100);
    org.junit.Assert.assertNotNull(booleanArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(booleanSpliterator4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
  }

  @Test
  public void test0425() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0425");
    }
    opssat.simulator.util.SimulatorData simulatorData1 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date2 = simulatorData1.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData4 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date5 = simulatorData4.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap6 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date2, date5);
    opssat.simulator.util.SimulatorData simulatorData8 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date9 = simulatorData8.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData11 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date12 = simulatorData11.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap13 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date9, date12);
    int int14 = opssat.simulator.util.DateExtraction.getHourFromDate(date9);
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap15 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date2, date9);
    opssat.simulator.util.SimulatorData simulatorData17 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long18 = simulatorData17.getCurrentTimeMillis();
    java.lang.String str19 = simulatorData17.getCurrentDay();
    java.lang.String str20 = simulatorData17.getUTCCurrentTime2();
    simulatorData17.toggleSimulatorRunning();
    java.lang.String str22 = simulatorData17.getUTCCurrentTime();
    java.util.Date date23 = simulatorData17.getCurrentTime();
    int int24 = opssat.simulator.util.DateExtraction.getYearFromDate(date23);
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap25 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date9, date23);
    org.junit.Assert.assertNotNull(date2);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(timeUnitMap6);
    org.junit.Assert.assertNotNull(date9);
    org.junit.Assert.assertNotNull(date12);
    org.junit.Assert.assertNotNull(timeUnitMap13);
    org.junit.Assert.assertNotNull(timeUnitMap15);
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    org.junit.Assert.assertNotNull(date23);
    org.junit.Assert.assertNotNull(timeUnitMap25);
  }

  @Test
  public void test0426() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0426");
    }
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience8 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    double double9 = gPSSatInViewScience8.getMaxDistance();
    double double10 = gPSSatInViewScience8.getMaxDistance();
    double double11 = gPSSatInViewScience8.getStdDevElevation();
    double double12 = gPSSatInViewScience8.getMaxDistance();
    double double13 = gPSSatInViewScience8.getStdDevDistance();
    double double14 = gPSSatInViewScience8.getMinElevation();
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 11111.0d + "'", double11 == 11111.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 58.0d + "'", double13 == 58.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 48.0d + "'", double14 == 48.0d);
  }

  @Test
  public void test0428() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0428");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    simulatorSpacecraftState3.setLongitude(13);
    java.lang.String str7 = simulatorSpacecraftState3.getMagnetometerAsString();
    simulatorSpacecraftState3.setModeOperation("00000:00:00:00:-02");
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState13 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    simulatorSpacecraftState13.setLongitude(4);
    double[] doubleArray17 = new double[]{(-1.0f)};
    simulatorSpacecraftState13.setMagField(doubleArray17);
    double[] doubleArray19 = simulatorSpacecraftState13.getSunVector();
    simulatorSpacecraftState3.setSunVector(doubleArray19);
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str7 + "' != '" + "X:[+00000.00] ; Y:[+00000.00] ; Z: [+00000.00] units [nT]" + "'",
        str7.equals("X:[+00000.00] ; Y:[+00000.00] ; Z: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertNotNull(doubleArray19);
  }

  @Test
  public void test0429() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0429");
    }
    java.lang.String str1 = opssat.simulator.util.SimulatorSchedulerPiece
        .getDDDDDHHMMSSmmmFromMillis('4');
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000:00:00:00:052" + "'",
        str1.equals("00000:00:00:00:052"));
  }

  @Test
  public void test0430() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0430");
    }
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece3 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            13L, 0, "hi!");
    java.lang.String str4 = simulatorSchedulerPiece3.getSchedulerOutput();
    long long5 = simulatorSchedulerPiece3.getTime();
    org.junit.Assert.assertTrue(
        "'" + str4 + "' != '" + "00000:00:00:00:013  0     hi!          executed false   | " + "'",
        str4.equals("00000:00:00:00:013  0     hi!          executed false   | "));
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 13L + "'", long5 == 13L);
  }

  @Test
  public void test0431() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0431");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    java.lang.Object obj6 = argumentDescriptor5.getType();
    try {
      argumentDescriptor5.setIntTypeByIndex((-10), 31);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [I");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertNotNull(obj6);
  }

  @Test
  public void test0432() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0432");
    }
    org.ccsds.moims.mo.mal.structures.Identifier identifier1 =
        new org.ccsds.moims.mo.mal.structures.Identifier(
            "opssat");
    org.ccsds.moims.mo.mal.structures.OctetList octetList2 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int3 = octetList2.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort4 = octetList2.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor5 = octetList2.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor7 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList2, "hi!");
    argumentDescriptor7.restoreArgument();
    argumentDescriptor7.restoreArgument();
    argumentDescriptor7.restoreArgument();
    boolean boolean11 = identifier1.equals(argumentDescriptor7);
    argumentDescriptor7.setName("030956.115");
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7) + "'", int3.equals((-7)));
    org.junit.Assert.assertNotNull(uShort4);
    org.junit.Assert.assertNotNull(byteItor5);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test0433() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0433");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.restoreArgument();
    java.lang.Object obj8 = argumentDescriptor5.getType();
    java.lang.String str9 = argumentDescriptor5.toString();
    java.lang.String str10 = argumentDescriptor5.toString();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertNotNull(obj8);
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
  }

  @Test
  public void test0434() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0434");
    }
    opssat.simulator.models.AbstractModel abstractModel1 =
        new opssat.simulator.models.AbstractModel(
            "52");
  }

  @Test
  public void test0435() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0435");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    int int8 = simulatorSpacecraftState3.getSatsInView();
    simulatorSpacecraftState3.setAltitude((-5));
    double double11 = simulatorSpacecraftState3.getLatitude();
    simulatorSpacecraftState3.setSatsInView((-1));
    java.lang.String str14 = simulatorSpacecraftState3.getModeOperation();
    simulatorSpacecraftState3.setLongitude('4');
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 340.0d + "'", double11 == 340.0d);
    org.junit.Assert.assertNull(str14);
  }

  @Test
  public void test0437() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0437");
    }
    opssat.simulator.util.SimulatorTimer simulatorTimer2 = new opssat.simulator.util.SimulatorTimer(
        "5600.0000", (byte) 1);
  }

  @Test
  public void test0438() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0438");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    celestiaData32.setDate(":");
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState38 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray41 = new float[]{28, 8};
    simulatorSpacecraftState38.setQ(floatArray41);
    float[] floatArray43 = simulatorSpacecraftState38.getR();
    celestiaData32.setQ(floatArray43);
    celestiaData32.setAos("281474993487885");
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState50 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray53 = new float[]{28, 8};
    simulatorSpacecraftState50.setQ(floatArray53);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState58 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double59 = simulatorSpacecraftState58.getLatitude();
    java.lang.String str60 = simulatorSpacecraftState58.getMagField();
    float[] floatArray61 = simulatorSpacecraftState58.getR();
    simulatorSpacecraftState50.setQ(floatArray61);
    java.lang.String str63 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray61);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState67 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double68 = simulatorSpacecraftState67.getLatitude();
    double double69 = simulatorSpacecraftState67.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState73 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double74 = simulatorSpacecraftState73.getLatitude();
    java.lang.String str75 = simulatorSpacecraftState73.getMagField();
    float[] floatArray76 = simulatorSpacecraftState73.getR();
    simulatorSpacecraftState67.setQ(floatArray76);
    float[] floatArray78 = simulatorSpacecraftState67.getV();
    opssat.simulator.celestia.CelestiaData celestiaData79 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray61, floatArray78);
    celestiaData32.setRv(floatArray78);
    java.lang.String str81 = celestiaData32.getLos();
    try {
      java.lang.String str82 = celestiaData32.toString();
      org.junit.Assert
          .fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray41);
    org.junit.Assert.assertNotNull(floatArray43);
    org.junit.Assert.assertNotNull(floatArray53);
    org.junit.Assert.assertTrue("'" + double59 + "' != '" + 340.0d + "'", double59 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str60 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str60.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray61);
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "UnknownGUIData" + "'",
        str63.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double68 + "' != '" + 340.0d + "'", double68 == 340.0d);
    org.junit.Assert.assertTrue("'" + double69 + "' != '" + 340.0d + "'", double69 == 340.0d);
    org.junit.Assert.assertTrue("'" + double74 + "' != '" + 340.0d + "'", double74 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str75 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str75.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray76);
    org.junit.Assert.assertNotNull(floatArray78);
    org.junit.Assert.assertNull(str81);
  }

  @Test
  public void test0439() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0439");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    int int8 = simulatorSpacecraftState3.getSatsInView();
    simulatorSpacecraftState3
        .setModeOperation("opssat.simulator.util.wav.WavFileException: 00000:00:00:00:008");
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
  }

  @Test
  public void test0440() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0440");
    }
    opssat.simulator.util.SimulatorData simulatorData4 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date5 = simulatorData4.getCurrentTime();
    java.util.Date date6 = simulatorData4.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData7 = new opssat.simulator.util.SimulatorData(17,
        date6);
    opssat.simulator.util.SimulatorData simulatorData10 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date11 = simulatorData10.getCurrentTime();
    int int12 = opssat.simulator.util.DateExtraction.getDayFromDate(date11);
    opssat.simulator.util.SimulatorData simulatorData14 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date15 = simulatorData14.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData17 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date18 = simulatorData17.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap19 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date15, date18);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date11, date18);
    opssat.simulator.util.SimulatorHeader simulatorHeader21 =
        new opssat.simulator.util.SimulatorHeader(
            false, date6, date11);
    opssat.simulator.util.SimulatorData simulatorData22 = new opssat.simulator.util.SimulatorData(
        '4', date11);
    java.lang.String str23 = simulatorData22.getUTCCurrentTime2();
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date6);
    org.junit.Assert.assertNotNull(date11);
    org.junit.Assert.assertNotNull(date15);
    org.junit.Assert.assertNotNull(date18);
    org.junit.Assert.assertNotNull(timeUnitMap19);
  }

  @Test
  public void test0441() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0441");
    }
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor2 =
        new opssat.simulator.util.ArgumentDescriptor(
            "",
            "#Run the processing of internal models\nstartModels=false\n#Increment the simulated time (depends on startModels)\nstartTime=false\n#Speed up of time factor\ntimeFactor=1\n#Kepler elements for orbit A[km];E;i[deg];RAAN[deg];ARG_PER[deg];TRUE_A[deg] 7021.0;0.0;98.05;340.0;0.0;0.0\nkeplerElements=7021.0;0.0;98.05;340.0;0.0;0.0\n#Enable the Orekit library\norekit=false\n#Enable updates from Internet (used for gps constellation TLEs)\nupdateFromInternet=false\n#Configuration of the Celestia server\ncelestia=false\ncelestiaPort=0\n#Start and end dates of simulation\nstartDate=2019:05:23 15:09:43 UTC\nendDate=2019:05:23 15:09:43 UTC\n#Logging level to files found in $USER_HOME/.ops-sat-simulator/\n#Possible values SEVERE,INFO,FINE,FINER,FINEST,ALL\ncentralLogLevel=INFO\nsimulatorLogLevel=INFO\nconsoleLogLevel=INFO");
    java.lang.Object obj3 = null;
    argumentDescriptor2.setType(obj3);
    try {
      float float6 = argumentDescriptor2.getTypeAsFloatByIndex(42);
      org.junit.Assert
          .fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0443() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0443");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    simulatorSpacecraftState3.setLongitude(4);
    double[] doubleArray7 = new double[]{(-1.0f)};
    simulatorSpacecraftState3.setMagField(doubleArray7);
    simulatorSpacecraftState3.setLatitude(0.0d);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState14 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray17 = new float[]{28, 8};
    simulatorSpacecraftState14.setQ(floatArray17);
    float[] floatArray19 = simulatorSpacecraftState14.getR();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState23 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    simulatorSpacecraftState23.setLongitude(4);
    double[] doubleArray27 = new double[]{(-1.0f)};
    simulatorSpacecraftState23.setMagField(doubleArray27);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState32 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double33 = simulatorSpacecraftState32.getLatitude();
    java.lang.String str34 = simulatorSpacecraftState32.getMagField();
    java.lang.String str35 = simulatorSpacecraftState32.toString();
    double[] doubleArray36 = simulatorSpacecraftState32.getSunVector();
    simulatorSpacecraftState23.setMagnetometer(doubleArray36);
    simulatorSpacecraftState14.setSunVector(doubleArray36);
    simulatorSpacecraftState3.setSunVector(doubleArray36);
    double[] doubleArray40 = simulatorSpacecraftState3.getSunVector();
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertNotNull(floatArray17);
    org.junit.Assert.assertNotNull(floatArray19);
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 340.0d + "'", double33 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str34 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str34.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str35 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str35.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertNotNull(doubleArray36);
    org.junit.Assert.assertNotNull(doubleArray40);
  }

  @Test
  public void test0444() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0444");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    boolean boolean16 = simulatorHeader12.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData19 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date20 = simulatorData19.getCurrentTime();
    int int21 = opssat.simulator.util.DateExtraction.getDayFromDate(date20);
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData26 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date27 = simulatorData26.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap28 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date24, date27);
    opssat.simulator.util.SimulatorHeader simulatorHeader29 =
        new opssat.simulator.util.SimulatorHeader(
            false, date20, date27);
    simulatorHeader12.setStartDate(date27);
    boolean boolean31 = simulatorHeader12.isAutoStartTime();
    simulatorHeader12.setUpdateInternet(false);
    simulatorHeader12.setUseCelestia(false);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(date20);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertNotNull(timeUnitMap28);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
  }

  @Test
  public void test0445() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0445");
    }
    org.ccsds.moims.mo.mal.structures.URI uRI1 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    java.lang.Integer int2 = uRI1.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.URI uRI4 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.UOctet uOctet5 = uRI4.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.URI uRI7 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.URI[] uRIArray8 = new org.ccsds.moims.mo.mal.structures.URI[]{
      uRI1, uRI4, uRI7};
    java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI> uRIList9 =
        new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI>();
    boolean boolean10 = java.util.Collections
        .addAll((java.util.Collection<org.ccsds.moims.mo.mal.structures.URI>) uRIList9, uRIArray8);
    org.ccsds.moims.mo.mal.structures.FineTime fineTime11 =
        new org.ccsds.moims.mo.mal.structures.FineTime();
    int int12 = uRIList9.indexOf(fineTime11);
    uRIList9.ensureCapacity(40);
    java.lang.Object obj15 = uRIList9.clone();
    org.ccsds.moims.mo.mal.structures.URI uRI17 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    java.lang.Integer int18 = uRI17.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.URI uRI20 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.UOctet uOctet21 = uRI20.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.URI uRI23 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.URI[] uRIArray24 =
        new org.ccsds.moims.mo.mal.structures.URI[]{
          uRI17, uRI20, uRI23};
    java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI> uRIList25 =
        new java.util.ArrayList<org.ccsds.moims.mo.mal.structures.URI>();
    boolean boolean26 = java.util.Collections.addAll(
        (java.util.Collection<org.ccsds.moims.mo.mal.structures.URI>) uRIList25, uRIArray24);
    org.ccsds.moims.mo.mal.structures.FineTime fineTime27 =
        new org.ccsds.moims.mo.mal.structures.FineTime();
    int int28 = uRIList25.indexOf(fineTime27);
    uRIList25.ensureCapacity(40);
    java.lang.Object obj31 = uRIList25.clone();
    org.ccsds.moims.mo.mal.structures.URI uRI34 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    org.ccsds.moims.mo.mal.structures.UOctet uOctet35 = uRI34.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.URI uRI36 = uRIList25.set((byte) 1, uRI34);
    java.lang.Long long37 = uRI34.getShortForm();
    boolean boolean38 = uRIList9.add(uRI34);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    int int43 = opssat.simulator.util.DateExtraction.getDayFromDate(date42);
    opssat.simulator.util.SimulatorData simulatorData45 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date46 = simulatorData45.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date49 = simulatorData48.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap50 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date46, date49);
    opssat.simulator.util.SimulatorHeader simulatorHeader51 =
        new opssat.simulator.util.SimulatorHeader(
            false, date42, date49);
    java.util.Date date52 = simulatorHeader51.getEndDate();
    boolean boolean53 = simulatorHeader51.isAutoStartSystem();
    int int54 = simulatorHeader51.getDayStartDate();
    java.lang.String str55 = simulatorHeader51.getOrekitTLE1();
    simulatorHeader51.setTimeFactor(31);
    simulatorHeader51.setOrekitPropagator("Alive");
    int int60 = uRIList9.indexOf("Alive");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2.equals(18));
    org.junit.Assert.assertNotNull(uOctet5);
    org.junit.Assert.assertNotNull(uRIArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    org.junit.Assert.assertNotNull(obj15);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18.equals(18));
    org.junit.Assert.assertNotNull(uOctet21);
    org.junit.Assert.assertNotNull(uRIArray24);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    org.junit.Assert.assertNotNull(obj31);
    org.junit.Assert.assertNotNull(uOctet35);
    org.junit.Assert.assertNotNull(uRI36);
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + 281474993487890L + "'",
        long37.equals(281474993487890L));
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date46);
    org.junit.Assert.assertNotNull(date49);
    org.junit.Assert.assertNotNull(timeUnitMap50);
    org.junit.Assert.assertNotNull(date52);
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    org.junit.Assert.assertNull(str55);
    org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
  }

  @Test
  public void test0446() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0446");
    }
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece3 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            ' ', 32, "2019:05:23 15:09:39 UTC");
    int int4 = simulatorSchedulerPiece3.getInternalID();
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
  }

  @Test
  public void test0447() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0447");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor3 = octetList0.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor5 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList0, "hi!");
    argumentDescriptor5.restoreArgument();
    argumentDescriptor5.setName("01700.0000000");
    argumentDescriptor5.restoreArgument();
    java.lang.String str10 = argumentDescriptor5.getName();
    try {
      argumentDescriptor5.setIntTypeByIndex(64, 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: org.ccsds.moims.mo.mal.structures.OctetList cannot be cast to [I");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(byteItor3);
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
  }

  @Test
  public void test0448() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0448");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    simulatorSpacecraftState3.setLongitude(13);
    simulatorSpacecraftState3.setAltitude(66);
    simulatorSpacecraftState3.setAltitude(31);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState14 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray17 = new float[]{28, 8};
    simulatorSpacecraftState14.setQ(floatArray17);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState22 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double23 = simulatorSpacecraftState22.getLatitude();
    java.lang.String str24 = simulatorSpacecraftState22.getMagField();
    float[] floatArray25 = simulatorSpacecraftState22.getR();
    simulatorSpacecraftState14.setQ(floatArray25);
    java.lang.String str27 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray25);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState31 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double32 = simulatorSpacecraftState31.getLatitude();
    double double33 = simulatorSpacecraftState31.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState37 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double38 = simulatorSpacecraftState37.getLatitude();
    java.lang.String str39 = simulatorSpacecraftState37.getMagField();
    float[] floatArray40 = simulatorSpacecraftState37.getR();
    simulatorSpacecraftState31.setQ(floatArray40);
    float[] floatArray42 = simulatorSpacecraftState31.getV();
    opssat.simulator.celestia.CelestiaData celestiaData43 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray25, floatArray42);
    celestiaData43.setDate(":");
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState49 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray52 = new float[]{28, 8};
    simulatorSpacecraftState49.setQ(floatArray52);
    float[] floatArray54 = simulatorSpacecraftState49.getR();
    celestiaData43.setQ(floatArray54);
    simulatorSpacecraftState3.setRv(floatArray54);
    int int57 = simulatorSpacecraftState3.getSatsInView();
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertNotNull(floatArray17);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 340.0d + "'", double23 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str24 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str24.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray25);
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "UnknownGUIData" + "'",
        str27.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 340.0d + "'", double32 == 340.0d);
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 340.0d + "'", double33 == 340.0d);
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + 340.0d + "'", double38 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str39 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str39.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray40);
    org.junit.Assert.assertNotNull(floatArray42);
    org.junit.Assert.assertNotNull(floatArray52);
    org.junit.Assert.assertNotNull(floatArray54);
    org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
  }

  @Test
  public void test0449() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0449");
    }
    java.math.BigInteger bigInteger0 = org.ccsds.moims.mo.mal.structures.ULong.MAX_VALUE;
    org.ccsds.moims.mo.mal.structures.ULong uLong1 = new org.ccsds.moims.mo.mal.structures.ULong(
        bigInteger0);
    org.ccsds.moims.mo.mal.structures.ULong uLong2 = new org.ccsds.moims.mo.mal.structures.ULong(
        bigInteger0);
    java.lang.String str3 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(uLong2);
    org.junit.Assert.assertNotNull(bigInteger0);
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UnknownGUIData" + "'",
        str3.equals("UnknownGUIData"));
  }

  @Test
  public void test0450() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0450");
    }
    opssat.simulator.util.ArgumentTemplate argumentTemplate2 =
        new opssat.simulator.util.ArgumentTemplate(
            "0.0", "{counter=8, methodsExecuted=0, currentTime=Thu May 23 15:09:34 UTC 2019}");
    argumentTemplate2.setArgContent("21474836472147483647.9223372036854775807");
  }

  @Test
  public void test0452() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0452");
    }
    java.util.logging.Logger logger0 = null;
    opssat.simulator.util.EndlessSingleStreamOperatingBuffer endlessSingleStreamOperatingBuffer1 =
        new opssat.simulator.util.EndlessSingleStreamOperatingBuffer(
            logger0);
    byte[] byteArray3 = endlessSingleStreamOperatingBuffer1.getDataAsByteArray('4');
    byte[] byteArray5 = opssat.simulator.peripherals.PFineADCS.FWRefFineADCS.int16_2ByteArray(15);
    endlessSingleStreamOperatingBuffer1.setDataFromByteArray(byteArray5);
    java.lang.String str7 = endlessSingleStreamOperatingBuffer1.getDataBufferAsString();
    org.ccsds.moims.mo.mal.structures.StringList stringList8 =
        new org.ccsds.moims.mo.mal.structures.StringList();
    org.ccsds.moims.mo.mal.structures.ShortList shortList10 =
        new org.ccsds.moims.mo.mal.structures.ShortList(
            ' ');
    java.util.ListIterator<java.lang.Short> shortItor11 = shortList10.listIterator();
    boolean boolean12 = stringList8.equals(shortList10);
    java.util.stream.BaseStream[] baseStreamArray14 = new java.util.stream.BaseStream[0];
    @SuppressWarnings("unchecked")
    java.util.stream.BaseStream<java.lang.Float, java.util.stream.Stream<java.lang.Float>>[] floatBaseStreamArray15 =
        baseStreamArray14;
    java.util.stream.BaseStream<java.lang.Float, java.util.stream.Stream<java.lang.Float>>[] floatBaseStreamArray16 =
        stringList8
            .toArray(
                (java.util.stream.BaseStream<java.lang.Float, java.util.stream.Stream<java.lang.Float>>[]) baseStreamArray14);
    java.util.stream.Stream<java.lang.String> strStream17 = stringList8.stream();
    java.lang.Object obj18 = stringList8.clone();
    opssat.simulator.util.LoggerFormatter loggerFormatter19 =
        new opssat.simulator.util.LoggerFormatter();
    opssat.simulator.util.LoggerFormatter loggerFormatter20 =
        new opssat.simulator.util.LoggerFormatter();
    opssat.simulator.util.LoggerFormatter loggerFormatter21 =
        new opssat.simulator.util.LoggerFormatter();
    opssat.simulator.util.LoggerFormatter[] loggerFormatterArray22 =
        new opssat.simulator.util.LoggerFormatter[]{
          loggerFormatter19, loggerFormatter20, loggerFormatter21};
    opssat.simulator.util.LoggerFormatter[] loggerFormatterArray23 = stringList8
        .toArray(loggerFormatterArray22);
    java.util.stream.Stream<java.lang.String> strStream24 = stringList8.parallelStream();
    org.ccsds.moims.mo.mal.structures.UShort uShort25 = stringList8.getServiceNumber();
    endlessSingleStreamOperatingBuffer1.setDataBuffer(uShort25);
    org.junit.Assert.assertNotNull(byteArray3);
    org.junit.Assert.assertNotNull(byteArray5);
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "byte[] {0x00,0x0F}" + "'",
        str7.equals("byte[] {0x00,0x0F}"));
    org.junit.Assert.assertNotNull(shortItor11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(baseStreamArray14);
    org.junit.Assert.assertNotNull(floatBaseStreamArray15);
    org.junit.Assert.assertNotNull(floatBaseStreamArray16);
    org.junit.Assert.assertNotNull(strStream17);
    org.junit.Assert.assertNotNull(obj18);
    org.junit.Assert.assertNotNull(loggerFormatterArray22);
    org.junit.Assert.assertNotNull(loggerFormatterArray23);
    org.junit.Assert.assertNotNull(strStream24);
    org.junit.Assert.assertNotNull(uShort25);
  }

  @Test
  public void test0453() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0453");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double4 = simulatorSpacecraftState3.getLatitude();
    java.lang.String str5 = simulatorSpacecraftState3.getMagField();
    java.lang.String str6 = simulatorSpacecraftState3.toString();
    double[] doubleArray7 = simulatorSpacecraftState3.getSunVector();
    simulatorSpacecraftState3.setSatsInView((short) 10);
    java.lang.String str10 = simulatorSpacecraftState3.toString();
    float[] floatArray11 = simulatorSpacecraftState3.getRv();
    org.junit.Assert.assertTrue("'" + double4 + "' != '" + 340.0d + "'", double4 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str5 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str5.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue(
        "'" + str6 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str6.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertTrue(
        "'" + str10 + "' != '"
        + "SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}" + "'",
        str10.equals("SimulatorSpacecraftState{latitude=340.0, longitude=-1.0, altitude=14.0}"));
    org.junit.Assert.assertNotNull(floatArray11);
  }

  @Test
  public void test0454() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0454");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    java.lang.String str14 = simulatorHeader12.getOrekitTLE2();
    simulatorHeader12.setTimeFactor(48);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertNull(str14);
  }

  @Test
  public void test0455() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0455");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    int int14 = simulatorHeader12.getMinuteStartDate();
    simulatorHeader12.setUseOrekitPropagator(true);
    simulatorHeader12.setUseCelestia(false);
    int int19 = simulatorHeader12.getDayStartDate();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
  }

  @Test
  public void test0456() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0456");
    }
    java.util.logging.Logger logger0 = null;
    opssat.simulator.util.EndlessSingleStreamOperatingBuffer endlessSingleStreamOperatingBuffer1 =
        new opssat.simulator.util.EndlessSingleStreamOperatingBuffer(
            logger0);
    byte[] byteArray3 = endlessSingleStreamOperatingBuffer1.getDataAsByteArray('4');
    byte[] byteArray5 = opssat.simulator.peripherals.PFineADCS.FWRefFineADCS.int16_2ByteArray(15);
    endlessSingleStreamOperatingBuffer1.setDataFromByteArray(byteArray5);
    java.lang.String str7 = endlessSingleStreamOperatingBuffer1.getDataBufferAsString();
    java.lang.String str8 = endlessSingleStreamOperatingBuffer1.getDataBufferAsString();
    endlessSingleStreamOperatingBuffer1.setOperatingIndex(33);
    try {
      boolean boolean12 = endlessSingleStreamOperatingBuffer1.loadFromPath("-400.0000");
      org.junit.Assert
          .fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(byteArray3);
    org.junit.Assert.assertNotNull(byteArray5);
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "byte[] {0x00,0x0F}" + "'",
        str7.equals("byte[] {0x00,0x0F}"));
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "byte[] {0x00,0x0F}" + "'",
        str8.equals("byte[] {0x00,0x0F}"));
  }

  @Test
  public void test0457() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0457");
    }
    org.ccsds.moims.mo.mal.structures.DoubleList doubleList1 =
        new org.ccsds.moims.mo.mal.structures.DoubleList(
            (short) 10);
    boolean boolean3 = doubleList1.add(100.0d);
    org.ccsds.moims.mo.mal.structures.UOctet uOctet4 = doubleList1.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet5 = doubleList1.getAreaVersion();
    opssat.simulator.util.SimulatorDeviceData simulatorDeviceData7 =
        new opssat.simulator.util.SimulatorDeviceData(
            "[]");
    java.lang.String str8 = simulatorDeviceData7.getName();
    java.util.LinkedList<opssat.simulator.util.ArgumentDescriptor> argumentDescriptorList9 =
        simulatorDeviceData7
            .getDataList();
    int int10 = doubleList1.lastIndexOf(simulatorDeviceData7);
    java.util.LinkedList<opssat.simulator.util.ArgumentDescriptor> argumentDescriptorList11 =
        simulatorDeviceData7
            .getDataList();
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(uOctet4);
    org.junit.Assert.assertNotNull(uOctet5);
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
    org.junit.Assert.assertNotNull(argumentDescriptorList9);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    org.junit.Assert.assertNotNull(argumentDescriptorList11);
  }

  @Test
  public void test0458() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0458");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    boolean boolean16 = simulatorHeader12.isUseCelestia();
    opssat.simulator.util.SimulatorData simulatorData19 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date20 = simulatorData19.getCurrentTime();
    int int21 = opssat.simulator.util.DateExtraction.getDayFromDate(date20);
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData26 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date27 = simulatorData26.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap28 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date24, date27);
    opssat.simulator.util.SimulatorHeader simulatorHeader29 =
        new opssat.simulator.util.SimulatorHeader(
            false, date20, date27);
    simulatorHeader12.setStartDate(date27);
    boolean boolean31 = simulatorHeader12.isAutoStartTime();
    simulatorHeader12.setUpdateInternet(true);
    simulatorHeader12.setUseCelestia(false);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(date20);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(date27);
    org.junit.Assert.assertNotNull(timeUnitMap28);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
  }

  @Test
  public void test0459() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0459");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    java.lang.String str16 = simulatorHeader12.getOrekitTLE1();
    boolean boolean17 = simulatorHeader12.isUseCelestia();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
  }

  @Test
  public void test0460() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0460");
    }
    java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList3 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean4 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
    int int6 = booleanList3.indexOf(10);
    booleanList3.clear();
    opssat.simulator.util.DateExtraction dateExtraction8 =
        new opssat.simulator.util.DateExtraction();
    boolean boolean9 = booleanList3.equals(dateExtraction8);
    boolean boolean10 = booleanList3.isEmpty();
    java.util.stream.Stream<java.lang.Boolean> booleanStream11 = booleanList3.parallelStream();
    try {
      java.lang.Boolean boolean13 = booleanList3.get(32);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
    } catch (java.lang.IndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(booleanArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(booleanStream11);
  }

  @Test
  public void test0461() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0461");
    }
    opssat.simulator.util.ArgumentTemplate argumentTemplate2 =
        new opssat.simulator.util.ArgumentTemplate(
            "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]", "opssat");
    opssat.simulator.util.ArgumentTemplate argumentTemplate5 =
        new opssat.simulator.util.ArgumentTemplate(
            "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]", "opssat");
    int int6 = argumentTemplate2.compareTo(argumentTemplate5);
    java.lang.String str7 = argumentTemplate2.toString();
    argumentTemplate2.setDescription("281474993487885");
    java.lang.String str10 = argumentTemplate2.toString();
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    org.junit.Assert.assertTrue("'" + str7 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]|opssat" + "'",
        str7.equals(
            "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]|opssat"));
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "281474993487885|opssat" + "'",
        str10.equals("281474993487885|opssat"));
  }

  @Test
  public void test0462() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0462");
    }
    org.ccsds.moims.mo.mal.structures.UInteger uInteger1 =
        new org.ccsds.moims.mo.mal.structures.UInteger(
            13);
    org.ccsds.moims.mo.mal.structures.Element element2 = uInteger1.createElement();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet3 = uInteger1.getAreaVersion();
    java.lang.Integer int4 = uInteger1.getTypeShortForm();
    java.lang.String str5 = uInteger1.toString();
    org.ccsds.moims.mo.mal.structures.UShort uShort6 = uInteger1.getServiceNumber();
    org.junit.Assert.assertNotNull(element2);
    org.junit.Assert.assertNotNull(uOctet3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12 + "'", int4.equals(12));
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "13" + "'", str5.equals("13"));
    org.junit.Assert.assertNotNull(uShort6);
  }

  @Test
  public void test0463() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0463");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    int int50 = celestiaData32.getSeconds();
    celestiaData32.setDnx("OPS-SAT SoftSim:");
    java.lang.String str53 = celestiaData32.getAos();
    celestiaData32.setDnx("[true, false]");
    java.lang.String str56 = celestiaData32.getAnx();
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
    org.junit.Assert.assertNull(str53);
    org.junit.Assert.assertNull(str56);
  }

  @Test
  public void test0464() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0464");
    }
    java.util.logging.Logger logger0 = null;
    opssat.simulator.util.EndlessWavStreamOperatingBuffer endlessWavStreamOperatingBuffer1 =
        new opssat.simulator.util.EndlessWavStreamOperatingBuffer(
            logger0);
    java.lang.String str2 = endlessWavStreamOperatingBuffer1.getDataBufferAsString();
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "double[] {}" + "'",
        str2.equals("double[] {}"));
  }

  @Test
  public void test0465() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0465");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    int int50 = celestiaData32.getSeconds();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState54 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray57 = new float[]{28, 8};
    simulatorSpacecraftState54.setQ(floatArray57);
    celestiaData32.setQ(floatArray57);
    celestiaData32.setLos("18446744073709551615");
    int int62 = celestiaData32.getMinutes();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState66 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray69 = new float[]{28, 8};
    simulatorSpacecraftState66.setQ(floatArray69);
    float[] floatArray74 = new float[]{281474993487887L, 281475010265070L, 281474993487881L};
    simulatorSpacecraftState66.setRv(floatArray74);
    double[][] doubleArray76 = null;
    simulatorSpacecraftState66.setRotation(doubleArray76);
    float[] floatArray78 = simulatorSpacecraftState66.getQ();
    celestiaData32.setQ(floatArray78);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
    org.junit.Assert.assertNotNull(floatArray57);
    org.junit.Assert.assertNotNull(floatArray69);
    org.junit.Assert.assertNotNull(floatArray74);
    org.junit.Assert.assertNotNull(floatArray78);
  }

  @Test
  public void test0466() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0466");
    }
    java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList3 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean4 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
    int int6 = booleanList3.indexOf(10);
    java.util.Iterator<java.lang.Boolean> booleanItor7 = booleanList3.iterator();
    java.lang.Boolean boolean9 = booleanList3.remove(0);
    int int10 = booleanList3.size();
    java.lang.Float[] floatArray14 = new java.lang.Float[]{1.0f, 1.0f, (-1.0f)};
    java.util.ArrayList<java.lang.Float> floatList15 = new java.util.ArrayList<java.lang.Float>();
    boolean boolean16 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Float>) floatList15, floatArray14);
    boolean boolean18 = floatList15.add((-1.0f));
    floatList15.clear();
    java.util.stream.Stream<java.lang.Float> floatStream20 = floatList15.stream();
    java.lang.Byte[] byteArray25 = new java.lang.Byte[]{(byte) 100, (byte) 0, (byte) 10,
      (byte) 1};
    java.util.ArrayList<java.lang.Byte> byteList26 = new java.util.ArrayList<java.lang.Byte>();
    boolean boolean27 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Byte>) byteList26, byteArray25);
    java.lang.Integer[] intArray30 = new java.lang.Integer[]{1, 11111};
    java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean32 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
    boolean boolean33 = byteList26.retainAll(intList31);
    java.lang.Integer[] intArray36 = new java.lang.Integer[]{0, 1};
    java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
    boolean boolean38 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
    int int40 = intList37.lastIndexOf((byte) 10);
    boolean boolean41 = intList31.retainAll(intList37);
    boolean boolean42 = floatList15.containsAll(intList37);
    java.util.Spliterator<java.lang.Integer> intSpliterator43 = intList37.spliterator();
    java.util.stream.Stream<java.lang.Integer> intStream44 = intList37.parallelStream();
    boolean boolean45 = booleanList3.retainAll(intList37);
    opssat.simulator.util.SimulatorData simulatorData49 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date50 = simulatorData49.getCurrentTime();
    java.util.Date date51 = simulatorData49.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData52 = new opssat.simulator.util.SimulatorData(
        17, date51);
    opssat.simulator.util.SimulatorData simulatorData55 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date56 = simulatorData55.getCurrentTime();
    int int57 = opssat.simulator.util.DateExtraction.getDayFromDate(date56);
    opssat.simulator.util.SimulatorData simulatorData59 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date60 = simulatorData59.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData62 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date63 = simulatorData62.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap64 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date60, date63);
    opssat.simulator.util.SimulatorHeader simulatorHeader65 =
        new opssat.simulator.util.SimulatorHeader(
            false, date56, date63);
    opssat.simulator.util.SimulatorHeader simulatorHeader66 =
        new opssat.simulator.util.SimulatorHeader(
            false, date51, date56);
    boolean boolean67 = simulatorHeader66.isAutoStartTime();
    simulatorHeader66.setUseCelestia(false);
    boolean boolean70 = simulatorHeader66.isAutoStartSystem();
    boolean boolean71 = booleanList3.contains(simulatorHeader66);
    boolean boolean72 = simulatorHeader66.checkStartBeforeEnd();
    java.lang.String str73 = simulatorHeader66.getEndDateString();
    int int74 = simulatorHeader66.getMinuteStartDate();
    org.junit.Assert.assertNotNull(booleanArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    org.junit.Assert.assertNotNull(booleanItor7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertNotNull(floatStream20);
    org.junit.Assert.assertNotNull(byteArray25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertNotNull(intArray30);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertNotNull(intArray36);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertNotNull(intSpliterator43);
    org.junit.Assert.assertNotNull(intStream44);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertNotNull(date50);
    org.junit.Assert.assertNotNull(date51);
    org.junit.Assert.assertNotNull(date56);
    org.junit.Assert.assertNotNull(date60);
    org.junit.Assert.assertNotNull(date63);
    org.junit.Assert.assertNotNull(timeUnitMap64);
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
  }

  @Test
  public void test0467() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0467");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    opssat.simulator.util.SimulatorData simulatorData17 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date18 = simulatorData17.getCurrentTime();
    java.util.Date date19 = simulatorData17.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData20 = new opssat.simulator.util.SimulatorData(
        17, date19);
    opssat.simulator.util.SimulatorData simulatorData23 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date24 = simulatorData23.getCurrentTime();
    int int25 = opssat.simulator.util.DateExtraction.getDayFromDate(date24);
    opssat.simulator.util.SimulatorData simulatorData27 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date28 = simulatorData27.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData30 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date31 = simulatorData30.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap32 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date28, date31);
    opssat.simulator.util.SimulatorHeader simulatorHeader33 =
        new opssat.simulator.util.SimulatorHeader(
            false, date24, date31);
    opssat.simulator.util.SimulatorHeader simulatorHeader34 =
        new opssat.simulator.util.SimulatorHeader(
            false, date19, date24);
    simulatorHeader12.setEndDate(date19);
    int int36 = simulatorHeader12.getHourStartDate();
    simulatorHeader12.setUseOrekitPropagator(false);
    boolean boolean39 = simulatorHeader12.isUseOrekitPropagator();
    simulatorHeader12.setAutoStartTime(true);
    simulatorHeader12.setAutoStartSystem(false);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertNotNull(date18);
    org.junit.Assert.assertNotNull(date19);
    org.junit.Assert.assertNotNull(date24);
    org.junit.Assert.assertNotNull(date28);
    org.junit.Assert.assertNotNull(date31);
    org.junit.Assert.assertNotNull(timeUnitMap32);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
  }

  @Test
  public void test0468() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0468");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    java.lang.Long[] longArray27 = new java.lang.Long[]{281475010265070L, 100L, 0L,
      281475010265070L, 281475010265070L, 1L};
    java.util.ArrayList<java.lang.Long> longList28 = new java.util.ArrayList<java.lang.Long>();
    boolean boolean29 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Long>) longList28, longArray27);
    boolean boolean30 = longList28.isEmpty();
    java.lang.Object obj31 = longList28.clone();
    opssat.simulator.util.SimulatorData simulatorData34 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date35 = simulatorData34.getCurrentTime();
    int int36 = opssat.simulator.util.DateExtraction.getDayFromDate(date35);
    opssat.simulator.util.SimulatorData simulatorData38 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date39 = simulatorData38.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap43 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date39, date42);
    opssat.simulator.util.SimulatorHeader simulatorHeader44 =
        new opssat.simulator.util.SimulatorHeader(
            false, date35, date42);
    boolean boolean45 = longList28.remove(date42);
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date10, date42);
    int int47 = opssat.simulator.util.DateExtraction.getDayFromDate(date42);
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
    org.junit.Assert.assertNotNull(longArray27);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(obj31);
    org.junit.Assert.assertNotNull(date35);
    org.junit.Assert.assertNotNull(date39);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(timeUnitMap43);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertNotNull(timeUnitMap46);
  }

  @Test
  public void test0469() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0469");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    boolean boolean21 = simulatorHeader20.isAutoStartTime();
    simulatorHeader20.setUseCelestia(false);
    simulatorHeader20.setOrekitTLE1("[]");
    simulatorHeader20
        .setOrekitPropagator("opssat.simulator.util.wav.WavFileException: UnknownGUIData");
    int int28 = simulatorHeader20.getMonthStartDate();
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
  }

  @Test
  public void test0471() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0471");
    }
    opssat.simulator.util.SimulatorTimer simulatorTimer2 = new opssat.simulator.util.SimulatorTimer(
        "hi!", 1);
    boolean boolean3 = simulatorTimer2.isElapsed();
    simulatorTimer2.setDuration(7);
    simulatorTimer2.setDuration(11);
    simulatorTimer2.timeElapsed(281474993487883L);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0472() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0472");
    }
    java.lang.Long[] longArray6 = new java.lang.Long[]{281475010265070L, 100L, 0L,
      281475010265070L, 281475010265070L, 1L};
    java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
    boolean boolean8 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
    boolean boolean9 = longList7.isEmpty();
    java.lang.Object obj10 = longList7.clone();
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    int int15 = opssat.simulator.util.DateExtraction.getDayFromDate(date14);
    opssat.simulator.util.SimulatorData simulatorData17 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date18 = simulatorData17.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData20 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date21 = simulatorData20.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap22 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date18, date21);
    opssat.simulator.util.SimulatorHeader simulatorHeader23 =
        new opssat.simulator.util.SimulatorHeader(
            false, date14, date21);
    boolean boolean24 = longList7.remove(date21);
    java.util.Iterator<java.lang.Long> longItor25 = longList7.iterator();
    org.junit.Assert.assertNotNull(longArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(obj10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date18);
    org.junit.Assert.assertNotNull(date21);
    org.junit.Assert.assertNotNull(timeUnitMap22);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(longItor25);
  }

  @Test
  public void test0473() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0473");
    }
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience8 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    double double9 = gPSSatInViewScience8.getMaxDistance();
    double double10 = gPSSatInViewScience8.getMaxDistance();
    double double11 = gPSSatInViewScience8.getMinElevation();
    double double12 = gPSSatInViewScience8.getAvgDistance();
    double double13 = gPSSatInViewScience8.getMaxElevation();
    double double14 = gPSSatInViewScience8.getMinDistance();
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 48.0d + "'", double11 == 48.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 56.0d + "'", double13 == 56.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.0d + "'", double14 == 9.0d);
  }

  @Test
  public void test0474() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0474");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    boolean boolean14 = simulatorHeader12.isAutoStartSystem();
    int int15 = simulatorHeader12.getDayStartDate();
    java.lang.String str16 = simulatorHeader12.getOrekitTLE1();
    simulatorHeader12.setTimeFactor(31);
    simulatorHeader12.setUpdateInternet(false);
    boolean boolean21 = simulatorHeader12.isUpdateInternet();
    boolean boolean22 = simulatorHeader12.checkStartBeforeEnd();
    int int23 = simulatorHeader12.getYearStartDate();
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
  }

  @Test
  public void test0475() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0475");
    }
    org.ccsds.moims.mo.mal.structures.URI uRI1 = new org.ccsds.moims.mo.mal.structures.URI(
        "0100.0000");
    java.lang.Integer int2 = uRI1.getTypeShortForm();
    java.lang.String str3 = uRI1.toString();
    java.lang.String str4 = uRI1.getValue();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet5 = uRI1.getAreaVersion();
    org.ccsds.moims.mo.mal.structures.ShortList shortList7 =
        new org.ccsds.moims.mo.mal.structures.ShortList(
            ' ');
    java.lang.Long long8 = shortList7.getShortForm();
    java.util.stream.Stream<java.lang.Short> shortStream9 = shortList7.stream();
    boolean boolean10 = uOctet5.equals(shortList7);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState14 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray17 = new float[]{28, 8};
    simulatorSpacecraftState14.setQ(floatArray17);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState22 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double23 = simulatorSpacecraftState22.getLatitude();
    java.lang.String str24 = simulatorSpacecraftState22.getMagField();
    float[] floatArray25 = simulatorSpacecraftState22.getR();
    simulatorSpacecraftState14.setQ(floatArray25);
    java.lang.String str27 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray25);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState31 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double32 = simulatorSpacecraftState31.getLatitude();
    double double33 = simulatorSpacecraftState31.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState37 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double38 = simulatorSpacecraftState37.getLatitude();
    java.lang.String str39 = simulatorSpacecraftState37.getMagField();
    float[] floatArray40 = simulatorSpacecraftState37.getR();
    simulatorSpacecraftState31.setQ(floatArray40);
    float[] floatArray42 = simulatorSpacecraftState31.getV();
    opssat.simulator.celestia.CelestiaData celestiaData43 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray25, floatArray42);
    float[] floatArray44 = celestiaData43.getQ();
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date49 = simulatorData48.getCurrentTime();
    int int50 = opssat.simulator.util.DateExtraction.getDayFromDate(date49);
    opssat.simulator.util.SimulatorData simulatorData52 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date53 = simulatorData52.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData55 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date56 = simulatorData55.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap57 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date53, date56);
    opssat.simulator.util.SimulatorHeader simulatorHeader58 =
        new opssat.simulator.util.SimulatorHeader(
            false, date49, date56);
    opssat.simulator.util.SimulatorData simulatorData59 = new opssat.simulator.util.SimulatorData(
        (short) 0, date49);
    celestiaData43.setDate(date49);
    int int61 = celestiaData43.getSeconds();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState65 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray68 = new float[]{28, 8};
    simulatorSpacecraftState65.setQ(floatArray68);
    celestiaData43.setQ(floatArray68);
    boolean boolean71 = shortList7.contains(celestiaData43);
    int int72 = celestiaData43.getMonths();
    celestiaData43
        .setLos("{counter=8, methodsExecuted=0, currentTime=Thu May 23 15:09:49 UTC 2019}");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2.equals(18));
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0100.0000" + "'",
        str3.equals("0100.0000"));
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0100.0000" + "'",
        str4.equals("0100.0000"));
    org.junit.Assert.assertNotNull(uOctet5);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 281475010265079L + "'",
        long8.equals(281475010265079L));
    org.junit.Assert.assertNotNull(shortStream9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(floatArray17);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 340.0d + "'", double23 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str24 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str24.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray25);
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "UnknownGUIData" + "'",
        str27.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 340.0d + "'", double32 == 340.0d);
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 340.0d + "'", double33 == 340.0d);
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + 340.0d + "'", double38 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str39 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str39.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray40);
    org.junit.Assert.assertNotNull(floatArray42);
    org.junit.Assert.assertNotNull(floatArray44);
    org.junit.Assert.assertNotNull(date49);
    org.junit.Assert.assertNotNull(date53);
    org.junit.Assert.assertNotNull(date56);
    org.junit.Assert.assertNotNull(timeUnitMap57);
    org.junit.Assert.assertNotNull(floatArray68);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
  }

  @Test
  public void test0476() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0476");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    simulatorSpacecraftState3.setLongitude(4);
    int int6 = simulatorSpacecraftState3.getSatsInView();
    java.lang.String str7 = simulatorSpacecraftState3.getMagField();
    int int8 = simulatorSpacecraftState3.getSatsInView();
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    org.junit.Assert.assertTrue(
        "'" + str7 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str7.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
  }

  @Test
  public void test0477() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0477");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    int int5 = opssat.simulator.util.DateExtraction.getDayFromDate(date4);
    opssat.simulator.util.SimulatorData simulatorData7 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date8 = simulatorData7.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData10 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date11 = simulatorData10.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap12 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date8, date11);
    opssat.simulator.util.SimulatorHeader simulatorHeader13 =
        new opssat.simulator.util.SimulatorHeader(
            false, date4, date11);
    java.util.Date date14 = simulatorHeader13.getEndDate();
    opssat.simulator.util.SimulatorData simulatorData15 = new opssat.simulator.util.SimulatorData(
        13, date14);
    simulatorData15.incrementMethods();
    java.lang.String str17 = simulatorData15.getCurrentYear();
    java.lang.String str18 = simulatorData15.getCurrentDay();
    simulatorData15.toggleSimulatorRunning();
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertNotNull(date11);
    org.junit.Assert.assertNotNull(timeUnitMap12);
    org.junit.Assert.assertNotNull(date14);
  }

  @Test
  public void test0478() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0478");
    }
    opssat.simulator.util.SimulatorSchedulerPiece simulatorSchedulerPiece3 =
        new opssat.simulator.util.SimulatorSchedulerPiece(
            13L, 0, "hi!");
    long long4 = simulatorSchedulerPiece3.getTime();
    int int5 = simulatorSchedulerPiece3.getInternalID();
    simulatorSchedulerPiece3.setExecuted(false);
    java.lang.String str8 = simulatorSchedulerPiece3.getSchedulerOutput();
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 13L + "'", long4 == 13L);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertTrue(
        "'" + str8 + "' != '" + "00000:00:00:00:013  0     hi!          executed false   | " + "'",
        str8.equals("00000:00:00:00:013  0     hi!          executed false   | "));
  }

  @Test
  public void test0479() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0479");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date3 = simulatorData2.getCurrentTime();
    int int4 = opssat.simulator.util.DateExtraction.getDayFromDate(date3);
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date7 = simulatorData6.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap11 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date7, date10);
    opssat.simulator.util.SimulatorHeader simulatorHeader12 =
        new opssat.simulator.util.SimulatorHeader(
            false, date3, date10);
    java.util.Date date13 = simulatorHeader12.getEndDate();
    int int14 = simulatorHeader12.getMinuteStartDate();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long17 = simulatorData16.getCurrentTimeMillis();
    java.lang.String str18 = simulatorData16.getCurrentDay();
    java.lang.String str19 = simulatorData16.getUTCCurrentTime2();
    java.lang.String str20 = simulatorData16.getCurrentDay();
    java.util.Date date21 = simulatorData16.getCurrentTime();
    int int22 = opssat.simulator.util.DateExtraction.getMinuteFromDate(date21);
    simulatorHeader12.setEndDate(date21);
    java.lang.String str24 = simulatorHeader12.getEndDateString();
    int int25 = simulatorHeader12.getYearStartDate();
    simulatorHeader12.setTimeFactor((byte) 0);
    org.junit.Assert.assertNotNull(date3);
    org.junit.Assert.assertNotNull(date7);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(timeUnitMap11);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    org.junit.Assert.assertNotNull(date21);
  }

  @Test
  public void test0480() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0480");
    }
    java.util.logging.Logger logger0 = null;
    opssat.simulator.util.EndlessWavStreamOperatingBuffer endlessWavStreamOperatingBuffer1 =
        new opssat.simulator.util.EndlessWavStreamOperatingBuffer(
            logger0);
    opssat.simulator.util.SimulatorData simulatorData4 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date5 = simulatorData4.getCurrentTime();
    int int6 = opssat.simulator.util.DateExtraction.getDayFromDate(date5);
    opssat.simulator.util.SimulatorData simulatorData8 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date9 = simulatorData8.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData11 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date12 = simulatorData11.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap13 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date9, date12);
    opssat.simulator.util.SimulatorHeader simulatorHeader14 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date12);
    java.util.Date date15 = simulatorHeader14.getEndDate();
    int int16 = simulatorHeader14.getMinuteStartDate();
    simulatorHeader14.setUseOrekitPropagator(true);
    java.lang.String str19 = simulatorHeader14.toFileString();
    java.util.Date date21 = simulatorHeader14.parseStringIntoDate("yyyy:MM:dd HH:mm:ss z");
    endlessWavStreamOperatingBuffer1.setDataBuffer("yyyy:MM:dd HH:mm:ss z");
    try {
      double[] doubleArray24 = endlessWavStreamOperatingBuffer1.getDataAsDoubleArray(37);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to [D");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date9);
    org.junit.Assert.assertNotNull(date12);
    org.junit.Assert.assertNotNull(timeUnitMap13);
    org.junit.Assert.assertNotNull(date15);
    org.junit.Assert.assertNull(date21);
  }

  @Test
  public void test0481() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0481");
    }
    java.lang.Long[] longArray2 = new java.lang.Long[]{0L, 10L};
    java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
    boolean boolean4 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
    java.lang.Object obj5 = longList3.clone();
    java.util.ListIterator<java.lang.Long> longItor7 = longList3.listIterator((byte) 1);
    longList3.ensureCapacity(36);
    java.lang.Object obj10 = null;
    boolean boolean11 = longList3.remove(obj10);
    try {
      java.util.List<java.lang.Long> longList14 = longList3.subList((short) 1, 23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 23");
    } catch (java.lang.IndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(longArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(obj5);
    org.junit.Assert.assertNotNull(longItor7);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test0482() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0482");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    java.lang.String str21 = simulatorHeader20.getOrekitPropagator();
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
    org.junit.Assert.assertNull(str21);
  }

  @Test
  public void test0483() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0483");
    }
    opssat.simulator.util.SimulatorData simulatorData2 = new opssat.simulator.util.SimulatorData(
        (-18));
    long long3 = simulatorData2.getCurrentTimeMillis();
    java.lang.String str4 = simulatorData2.getCurrentDay();
    java.lang.String str5 = simulatorData2.getUTCCurrentTime2();
    simulatorData2.toggleSimulatorRunning();
    java.lang.String str7 = simulatorData2.getUTCCurrentTime();
    java.util.Date date8 = simulatorData2.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData12 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date13 = simulatorData12.getCurrentTime();
    java.util.Date date14 = simulatorData12.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData15 = new opssat.simulator.util.SimulatorData(
        17, date14);
    opssat.simulator.util.SimulatorData simulatorData18 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date19 = simulatorData18.getCurrentTime();
    int int20 = opssat.simulator.util.DateExtraction.getDayFromDate(date19);
    opssat.simulator.util.SimulatorData simulatorData22 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date23 = simulatorData22.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData25 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date26 = simulatorData25.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap27 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date23, date26);
    opssat.simulator.util.SimulatorHeader simulatorHeader28 =
        new opssat.simulator.util.SimulatorHeader(
            false, date19, date26);
    opssat.simulator.util.SimulatorHeader simulatorHeader29 =
        new opssat.simulator.util.SimulatorHeader(
            false, date14, date19);
    opssat.simulator.util.SimulatorData simulatorData33 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date34 = simulatorData33.getCurrentTime();
    java.util.Date date35 = simulatorData33.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData36 = new opssat.simulator.util.SimulatorData(
        17, date35);
    opssat.simulator.util.SimulatorData simulatorData39 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date40 = simulatorData39.getCurrentTime();
    int int41 = opssat.simulator.util.DateExtraction.getDayFromDate(date40);
    opssat.simulator.util.SimulatorData simulatorData43 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date44 = simulatorData43.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData46 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date47 = simulatorData46.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap48 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date44, date47);
    opssat.simulator.util.SimulatorHeader simulatorHeader49 =
        new opssat.simulator.util.SimulatorHeader(
            false, date40, date47);
    opssat.simulator.util.SimulatorHeader simulatorHeader50 =
        new opssat.simulator.util.SimulatorHeader(
            false, date35, date40);
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap51 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date19, date35);
    opssat.simulator.util.SimulatorHeader simulatorHeader52 =
        new opssat.simulator.util.SimulatorHeader(
            true, date8, date35);
    simulatorHeader52.setOrekitTLE1("2019:05:23 15:09:31 UTC");
    simulatorHeader52.setKeplerElements("030938.571");
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertNotNull(date13);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date19);
    org.junit.Assert.assertNotNull(date23);
    org.junit.Assert.assertNotNull(date26);
    org.junit.Assert.assertNotNull(timeUnitMap27);
    org.junit.Assert.assertNotNull(date34);
    org.junit.Assert.assertNotNull(date35);
    org.junit.Assert.assertNotNull(date40);
    org.junit.Assert.assertNotNull(date44);
    org.junit.Assert.assertNotNull(date47);
    org.junit.Assert.assertNotNull(timeUnitMap48);
    org.junit.Assert.assertNotNull(timeUnitMap51);
  }

  @Test
  public void test0485() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0485");
    }
    org.ccsds.moims.mo.mal.structures.OctetList octetList0 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int1 = octetList0.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort2 = octetList0.getAreaNumber();
    org.ccsds.moims.mo.mal.structures.UOctet uOctet3 = octetList0.getAreaVersion();
    opssat.simulator.util.wav.WavFileException wavFileException5 =
        new opssat.simulator.util.wav.WavFileException(
            "UnknownGUIData");
    java.lang.Throwable[] throwableArray6 = wavFileException5.getSuppressed();
    boolean boolean7 = octetList0.equals(wavFileException5);
    org.ccsds.moims.mo.mal.structures.FloatList floatList9 =
        new org.ccsds.moims.mo.mal.structures.FloatList(
            (byte) 0);
    java.lang.Integer int10 = floatList9.getTypeShortForm();
    java.lang.Integer int11 = floatList9.getTypeShortForm();
    floatList9.clear();
    boolean boolean13 = octetList0.remove(floatList9);
    try {
      java.util.List<java.lang.Byte> byteList16 = octetList0.subList('a', 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(97) > toIndex(0)");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1.equals((-7)));
    org.junit.Assert.assertNotNull(uShort2);
    org.junit.Assert.assertNotNull(uOctet3);
    org.junit.Assert.assertNotNull(throwableArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10.equals((-4)));
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-4) + "'", int11.equals((-4)));
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
  }

  @Test
  public void test0486() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0486");
    }
    opssat.simulator.models.AbstractModel abstractModel1 =
        new opssat.simulator.models.AbstractModel(
            "2019:05:23 15:09:39 UTC");
  }

  @Test
  public void test0487() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0487");
    }
    opssat.simulator.threading.SimulatorNode simulatorNode0 = null;
    opssat.simulator.peripherals.POpticalReceiver pOpticalReceiver2 =
        new opssat.simulator.peripherals.POpticalReceiver(
            simulatorNode0, "031008.320");
    try {
      pOpticalReceiver2.simSetSuccessRate((byte) 100);
      org.junit.Assert
          .fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0488() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0488");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    int int5 = opssat.simulator.util.DateExtraction.getDayFromDate(date4);
    opssat.simulator.util.SimulatorData simulatorData7 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date8 = simulatorData7.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData10 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date11 = simulatorData10.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap12 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date8, date11);
    opssat.simulator.util.SimulatorHeader simulatorHeader13 =
        new opssat.simulator.util.SimulatorHeader(
            false, date4, date11);
    opssat.simulator.util.SimulatorData simulatorData14 = new opssat.simulator.util.SimulatorData(
        19, date11);
    java.lang.String str15 = simulatorData14.toString();
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertNotNull(date11);
    org.junit.Assert.assertNotNull(timeUnitMap12);
  }

  @Test
  public void test0489() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0489");
    }
    opssat.simulator.util.SimulatorData simulatorData3 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date4 = simulatorData3.getCurrentTime();
    java.util.Date date5 = simulatorData3.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData6 = new opssat.simulator.util.SimulatorData(17,
        date5);
    opssat.simulator.util.SimulatorData simulatorData9 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date10 = simulatorData9.getCurrentTime();
    int int11 = opssat.simulator.util.DateExtraction.getDayFromDate(date10);
    opssat.simulator.util.SimulatorData simulatorData13 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date14 = simulatorData13.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData16 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date17 = simulatorData16.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap18 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date14, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader19 =
        new opssat.simulator.util.SimulatorHeader(
            false, date10, date17);
    opssat.simulator.util.SimulatorHeader simulatorHeader20 =
        new opssat.simulator.util.SimulatorHeader(
            false, date5, date10);
    opssat.simulator.util.SimulatorData simulatorData24 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date25 = simulatorData24.getCurrentTime();
    java.util.Date date26 = simulatorData24.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData27 = new opssat.simulator.util.SimulatorData(
        17, date26);
    opssat.simulator.util.SimulatorData simulatorData30 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date31 = simulatorData30.getCurrentTime();
    int int32 = opssat.simulator.util.DateExtraction.getDayFromDate(date31);
    opssat.simulator.util.SimulatorData simulatorData34 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date35 = simulatorData34.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap39 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date35, date38);
    opssat.simulator.util.SimulatorHeader simulatorHeader40 =
        new opssat.simulator.util.SimulatorHeader(
            false, date31, date38);
    opssat.simulator.util.SimulatorHeader simulatorHeader41 =
        new opssat.simulator.util.SimulatorHeader(
            false, date26, date31);
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap42 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date10, date26);
    int int43 = opssat.simulator.util.DateExtraction.getYearFromDate(date26);
    org.junit.Assert.assertNotNull(date4);
    org.junit.Assert.assertNotNull(date5);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertNotNull(date14);
    org.junit.Assert.assertNotNull(date17);
    org.junit.Assert.assertNotNull(timeUnitMap18);
    org.junit.Assert.assertNotNull(date25);
    org.junit.Assert.assertNotNull(date26);
    org.junit.Assert.assertNotNull(date31);
    org.junit.Assert.assertNotNull(date35);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(timeUnitMap39);
    org.junit.Assert.assertNotNull(timeUnitMap42);
  }

  @Test
  public void test0490() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0490");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    java.lang.String str50 = celestiaData32.getLos();
    celestiaData32.setInfo("1200.0000000");
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
    org.junit.Assert.assertNull(str50);
  }

  @Test
  public void test0491() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0491");
    }
    java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[]{true, true};
    java.util.ArrayList<java.lang.Boolean> booleanList3 =
        new java.util.ArrayList<java.lang.Boolean>();
    boolean boolean4 = java.util.Collections
        .addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
    int int6 = booleanList3.indexOf(10);
    booleanList3.clear();
    opssat.simulator.util.DateExtraction dateExtraction8 =
        new opssat.simulator.util.DateExtraction();
    boolean boolean9 = booleanList3.equals(dateExtraction8);
    boolean boolean10 = booleanList3.isEmpty();
    java.util.stream.Stream<java.lang.Boolean> booleanStream11 = booleanList3.parallelStream();
    byte[] byteArray13 = opssat.simulator.peripherals.PFineADCS.FWRefFineADCS.int16_2ByteArray(56);
    org.ccsds.moims.mo.mal.structures.Blob blob16 = new org.ccsds.moims.mo.mal.structures.Blob(
        byteArray13, 20, 24);
    java.lang.Long long17 = blob16.getShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort18 = blob16.getServiceNumber();
    int int19 = booleanList3.indexOf(uShort18);
    java.util.stream.Stream<java.lang.Boolean> booleanStream20 = booleanList3.parallelStream();
    booleanList3.add(0, false);
    org.junit.Assert.assertNotNull(booleanArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(booleanStream11);
    org.junit.Assert.assertNotNull(byteArray13);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 281474993487873L + "'",
        long17.equals(281474993487873L));
    org.junit.Assert.assertNotNull(uShort18);
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    org.junit.Assert.assertNotNull(booleanStream20);
  }

  @Test
  public void test0493() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0493");
    }
    byte[] byteArray1 = opssat.simulator.peripherals.PFineADCS.FWRefFineADCS.int2ByteArray(0);
    org.junit.Assert.assertNotNull(byteArray1);
  }

  @Test
  public void test0494() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0494");
    }
    org.ccsds.moims.mo.mal.structures.StringList stringList0 =
        new org.ccsds.moims.mo.mal.structures.StringList();
    org.ccsds.moims.mo.mal.structures.ShortList shortList2 =
        new org.ccsds.moims.mo.mal.structures.ShortList(
            ' ');
    java.util.ListIterator<java.lang.Short> shortItor3 = shortList2.listIterator();
    boolean boolean4 = stringList0.equals(shortList2);
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience13 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    double double14 = gPSSatInViewScience13.getMaxDistance();
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience23 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience32 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    double double33 = gPSSatInViewScience32.getMaxDistance();
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience42 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    opssat.simulator.orekit.GPSSatInViewScience gPSSatInViewScience51 =
        new opssat.simulator.orekit.GPSSatInViewScience(
            9, 0.0f, 48, 56, (short) 1, 281474993487878L, 58, 11111);
    double double52 = gPSSatInViewScience51.getStdDevElevation();
    opssat.simulator.orekit.GPSSatInViewScience[] gPSSatInViewScienceArray53 =
        new opssat.simulator.orekit.GPSSatInViewScience[]{
          gPSSatInViewScience13, gPSSatInViewScience23, gPSSatInViewScience32, gPSSatInViewScience42,
          gPSSatInViewScience51};
    opssat.simulator.orekit.GPSSatInViewScience[] gPSSatInViewScienceArray54 = shortList2
        .toArray(gPSSatInViewScienceArray53);
    shortList2.ensureCapacity(44);
    int int57 = shortList2.size();
    java.util.stream.Stream<java.lang.Short> shortStream58 = shortList2.parallelStream();
    org.ccsds.moims.mo.mal.structures.UShort uShort59 = shortList2.getServiceNumber();
    org.junit.Assert.assertNotNull(shortItor3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    org.junit.Assert.assertTrue("'" + double52 + "' != '" + 11111.0d + "'", double52 == 11111.0d);
    org.junit.Assert.assertNotNull(gPSSatInViewScienceArray53);
    org.junit.Assert.assertNotNull(gPSSatInViewScienceArray54);
    org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    org.junit.Assert.assertNotNull(shortStream58);
    org.junit.Assert.assertNotNull(uShort59);
  }

  @Test
  public void test0495() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0495");
    }
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState3 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray6 = new float[]{28, 8};
    simulatorSpacecraftState3.setQ(floatArray6);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState11 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double12 = simulatorSpacecraftState11.getLatitude();
    java.lang.String str13 = simulatorSpacecraftState11.getMagField();
    float[] floatArray14 = simulatorSpacecraftState11.getR();
    simulatorSpacecraftState3.setQ(floatArray14);
    java.lang.String str16 = opssat.simulator.util.CommandDescriptor
        .makeConsoleDescriptionForObj(floatArray14);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState20 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double21 = simulatorSpacecraftState20.getLatitude();
    double double22 = simulatorSpacecraftState20.getLatitude();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState26 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double27 = simulatorSpacecraftState26.getLatitude();
    java.lang.String str28 = simulatorSpacecraftState26.getMagField();
    float[] floatArray29 = simulatorSpacecraftState26.getR();
    simulatorSpacecraftState20.setQ(floatArray29);
    float[] floatArray31 = simulatorSpacecraftState20.getV();
    opssat.simulator.celestia.CelestiaData celestiaData32 =
        new opssat.simulator.celestia.CelestiaData(
            floatArray14, floatArray31);
    float[] floatArray33 = celestiaData32.getQ();
    opssat.simulator.util.SimulatorData simulatorData37 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date38 = simulatorData37.getCurrentTime();
    int int39 = opssat.simulator.util.DateExtraction.getDayFromDate(date38);
    opssat.simulator.util.SimulatorData simulatorData41 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date42 = simulatorData41.getCurrentTime();
    opssat.simulator.util.SimulatorData simulatorData44 = new opssat.simulator.util.SimulatorData(
        (-18));
    java.util.Date date45 = simulatorData44.getCurrentTime();
    java.util.Map<java.util.concurrent.TimeUnit, java.lang.Long> timeUnitMap46 =
        opssat.simulator.util.SimulatorData
            .computeDiff(date42, date45);
    opssat.simulator.util.SimulatorHeader simulatorHeader47 =
        new opssat.simulator.util.SimulatorHeader(
            false, date38, date45);
    opssat.simulator.util.SimulatorData simulatorData48 = new opssat.simulator.util.SimulatorData(
        (short) 0, date38);
    celestiaData32.setDate(date38);
    int int50 = celestiaData32.getSeconds();
    celestiaData32.setDnx("OPS-SAT SoftSim:");
    java.lang.String str53 = celestiaData32.getAos();
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState57 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    double double58 = simulatorSpacecraftState57.getLatitude();
    double double59 = simulatorSpacecraftState57.getLongitude();
    float[] floatArray60 = simulatorSpacecraftState57.getQ();
    celestiaData32.setQ(floatArray60);
    float[] floatArray62 = celestiaData32.getRv();
    java.lang.String str63 = celestiaData32.getAos();
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 340.0d + "'", double12 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str13 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str13.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UnknownGUIData" + "'",
        str16.equals("UnknownGUIData"));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 340.0d + "'", double21 == 340.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 340.0d + "'", double22 == 340.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 340.0d + "'", double27 == 340.0d);
    org.junit.Assert.assertTrue(
        "'" + str28 + "' != '"
        + "North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]" + "'",
        str28.equals("North:[+00000.00] ; East:[+00000.00] ; Vertical: [+00000.00] units [nT]"));
    org.junit.Assert.assertNotNull(floatArray29);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertNotNull(date42);
    org.junit.Assert.assertNotNull(date45);
    org.junit.Assert.assertNotNull(timeUnitMap46);
    org.junit.Assert.assertNull(str53);
    org.junit.Assert.assertTrue("'" + double58 + "' != '" + 340.0d + "'", double58 == 340.0d);
    org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
    org.junit.Assert.assertNotNull(floatArray60);
    org.junit.Assert.assertNotNull(floatArray62);
    org.junit.Assert.assertNull(str63);
  }

  @Test
  public void test0498() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0498");
    }
    org.ccsds.moims.mo.mal.structures.Identifier identifier0 =
        new org.ccsds.moims.mo.mal.structures.Identifier();
    org.ccsds.moims.mo.mal.structures.OctetList octetList1 =
        new org.ccsds.moims.mo.mal.structures.OctetList();
    java.lang.Integer int2 = octetList1.getTypeShortForm();
    org.ccsds.moims.mo.mal.structures.UShort uShort3 = octetList1.getServiceNumber();
    java.util.Iterator<java.lang.Byte> byteItor4 = octetList1.iterator();
    opssat.simulator.util.ArgumentDescriptor argumentDescriptor6 =
        new opssat.simulator.util.ArgumentDescriptor(
            octetList1, "hi!");
    argumentDescriptor6.restoreArgument();
    argumentDescriptor6.restoreArgument();
    argumentDescriptor6.restoreArgument();
    java.lang.String str10 = argumentDescriptor6.toString();
    boolean boolean11 = identifier0.equals(str10);
    opssat.simulator.util.SimulatorSpacecraftState simulatorSpacecraftState15 =
        new opssat.simulator.util.SimulatorSpacecraftState(
            340.0d, (-1.0f), 14);
    float[] floatArray18 = new float[]{28, 8};
    simulatorSpacecraftState15.setQ(floatArray18);
    float[] floatArray20 = simulatorSpacecraftState15.getQ();
    double double21 = simulatorSpacecraftState15.getLongitude();
    boolean boolean22 = identifier0.equals(simulatorSpacecraftState15);
    double double23 = simulatorSpacecraftState15.getLatitude();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2.equals((-7)));
    org.junit.Assert.assertNotNull(uShort3);
    org.junit.Assert.assertNotNull(byteItor4);
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(floatArray18);
    org.junit.Assert.assertNotNull(floatArray20);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 340.0d + "'", double23 == 340.0d);
  }

  @Test
  public void test0499() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0499");
    }
    opssat.simulator.util.SimulatorTimer simulatorTimer2 = new opssat.simulator.util.SimulatorTimer(
        "3257812:10:11:27:876", 18);
    simulatorTimer2.setDuration(0L);
    simulatorTimer2.setDuration(281474993487887L);
    boolean boolean7 = simulatorTimer2.isElapsed();
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0500() throws Throwable
  {
    if (debug) {
      System.out.format("%n%s%n", "RegressionTest0.test0500");
    }
    opssat.simulator.threading.SimulatorNode simulatorNode0 = null;
    opssat.simulator.peripherals.POpticalReceiver pOpticalReceiver2 =
        new opssat.simulator.peripherals.POpticalReceiver(
            simulatorNode0, "031008.320");
    try {
      pOpticalReceiver2.simPreloadFile(
          "{counter=8, methodsExecuted=0, currentTime=Thu May 23 15:09:34 UTC 2019}");
      org.junit.Assert
          .fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }
}
