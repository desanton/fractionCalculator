
import org.junit.Test;

/**
 * Checkpoint 1 tests.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FracCalcTestCheckpoint1
{
    /**
     * Checkpoint 1 test.
     */
    @Test public void testCheckpoint11() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            "6_5/8", "whole:6 numerator:5 denominator:8", "12_3/8",
            FracCalc.produceAnswer("5_3/4 + 6_5/8"));
    }

    /**
     * Checkpoint 1 test.
     */
    @Test public void testCheckpoint12() {
        FracCalcTestALL.assertForEarlyCheckpoints(
            "20", "whole:20 numerator:0 denominator:1", "-20_3/7",
            FracCalc.produceAnswer("-3/7 - 20"));
    }

    /**
     * Checkpoint 1 test.
     */
    @Test public void testCheckpoint13() {
        FracCalcTestALL.assertForEarlyCheckpoints("27/21",
            "whole:0 numerator:27 denominator:21", "-33_2/7",
            FracCalc.produceAnswer("-32 - 27/21"));
    }
}
