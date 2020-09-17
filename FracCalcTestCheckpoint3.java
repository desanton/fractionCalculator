
import org.junit.Test;
/**
 * Checkpoint 3 tests.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FracCalcTestCheckpoint3
{
    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3AdditionSimple3() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "4_3/7",
            FracCalc.produceAnswer("1_1/7 + 3_2/7"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3AdditionWholeNumbers2() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "1",
            FracCalc.produceAnswer("2/3 + 1/3"));
    }

    /**
     * Checkpoint 3 test.
     */   
    @Test public void testCheckpoint3AdditionWholeNumbers7() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "1021778",
            FracCalc.produceAnswer("124543 + 897235"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3AdditionWithNegatives4() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "-1_1/4",
            FracCalc.produceAnswer("-3_3/4 + 2_2/4"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3AdditionImproperFractionsAndReductions2() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "1_1/20",
            FracCalc.produceAnswer("4/5 + 2/8"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3AdditionCombined4() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "62_11/19",
            FracCalc.produceAnswer("0 + 34_543/19"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3SubtractionSimple3() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "0",
            FracCalc.produceAnswer("4_1/2 - 4_1/2"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3SubtractionWithNegatives3() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "-1_1/4",
            FracCalc.produceAnswer("-3_3/4 - -2_2/4"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3SubtractionCombined2() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "8_5/21",
            FracCalc.produceAnswer("-12_3/7 - -20_2/3"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3MultiplicationBasic1() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "3",
            FracCalc.produceAnswer("1_1/2 * 2"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3MultiplicationBasic10() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "378/943",
            FracCalc.produceAnswer("27/41 * 14/23"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3MultiplicationBasic3() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "164268",
            FracCalc.produceAnswer("234 * 702"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3MultiplicationWithNegatives2() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "-8",
            FracCalc.produceAnswer("-12/3 * 2/1"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3MultiplicationWithNegatives6() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "15_5/7",
            FracCalc.produceAnswer("-3_2/3 * -4_2/7"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3MultiplicationByZero2() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "0",
            FracCalc.produceAnswer("0 * 0"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3MultiplicationByZero3() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "0",
            FracCalc.produceAnswer("0 * 9321"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3MultiplicationByZero4() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "0",
            FracCalc.produceAnswer("0 * -5902"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3MultiplicationCombined1() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "1065_115/168",
            FracCalc.produceAnswer("-32_75/16 * -27_43/21"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3MultiplicationCombined2() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "-15_67/943",
            FracCalc.produceAnswer("1_27/41 * -3_140/23"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3DivisionBasic1() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "9/16",
            FracCalc.produceAnswer("3/4 / 4/3"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3DivisionBasic2() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "2_1/4",
            FracCalc.produceAnswer("3/2 / 2/3"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3DivisionWithNegatives5() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "-2_6/7",
            FracCalc.produceAnswer("-20 / 7"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3DivisionWithNegatives6() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "1_13/32",
            FracCalc.produceAnswer("-3_3/4 / -2_2/3"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3DivisionWithZero5() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "0",
            FracCalc.produceAnswer("0 / 46/27"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3DivisionWithZero6() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "0",
            FracCalc.produceAnswer("0/24 / 1/46"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3DivisionCombined2() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "-2_2/3",
            FracCalc.produceAnswer("16/4 / -3/2"));
    }

    /**
     * Checkpoint 3 test.
     */
    @Test public void testCheckpoint3DivisionCombined3() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            null, null, "6_661/5520",
            FracCalc.produceAnswer("-38_3/72 / -4_82/37"));
    }
}
