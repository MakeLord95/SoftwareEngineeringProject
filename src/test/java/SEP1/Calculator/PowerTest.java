package SEP1.Calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerTest {

    private final Calculator calculator = new Calculator();

    @ParameterizedTest(name = "{0}² is {1}")
    @CsvSource({"0, 0", "1, 1", "2, 4", "4, 16", "5, 25", "6, 36"})
    public void testPower(int number, int result) {
        calculator.power(number);
        assertEquals(result, calculator.returnResult(), "Power of two failed!");
    }
}
