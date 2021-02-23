// Import the relevant JUnit classes
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterTest;
import static org.junit.jupiter.api.Assertions.*;

public class PerfectNumbersEasyJUnitTest { // Beginning class PerfectNumbersEasyJUnitTest

    @Test
    void isPerfect(){
        // Test different cases
        assertTrue(PerfectNumbersEasy.isPerfect(6));
        assertTrue(PerfectNumbersEasy.isPerfect(496));
        assertFalse(PerfectNumbersEasy.isPerfect(675));
        assertFalse(PerfectNumbersEasy.isPerfect(3485));
        assertTrue(PerfectNumbersEasy.isPerfect(8128));
        assertFalse(PerfectNumbersEasy.isPerfect(13294));
    }
} // end class PerfectNumbersEasyJUnitTest
