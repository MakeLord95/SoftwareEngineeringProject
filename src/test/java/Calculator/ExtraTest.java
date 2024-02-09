package Calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtraTest extends AbstractParent {

    private static Calculator calculator = new Calculator();

    @BeforeAll
    @DisplayName("Power ON")
    public static void testPowerOn() {
        System.out.println("@BeforeAll Power ON (before first test)");
        calculator.powerOn();
    }

    @AfterAll
    @DisplayName("Power OFF")
    public static void testPowerOff() {
        System.out.println("@AfterAll Power OFF (all tests run).");
        calculator.powerOff();
        calculator = null;
    }

    @BeforeEach
    @DisplayName("Reset calculator")
    public void testReset() {
        System.out.println("  Reset calculator.");
        calculator.reset();
        assertEquals(0, calculator.returnResult(), "Reset failed");
    }

    @Test
    @DisplayName("Testing 2²")
    public void testPower2() {
        calculator.power(2);
        assertEquals(4, calculator.returnResult(), "2² failed");
    }

    @Test
    @DisplayName("Testing 4²")
    public void testPower4() {
        calculator.power(4);
        assertEquals(16, calculator.returnResult(), "4² failed");
    }

    @Test
    @DisplayName("Testing 5²")
    public void testPower5() {
        calculator.power(5);
        double DELTA = 0.001;
        assertEquals(25, calculator.returnResult(), DELTA, "5² failed");
    }

    @Test
    @DisplayName("Testing square root of 2")
    public void testSquareRoot2() {
        calculator.squareRoot(2);
        assertEquals(1, calculator.returnResult(), "Square root of 2 failed");
    }

    @Test
    @DisplayName("Testing negative square root")
    public void testNegativeSquareRoot() {
        calculator.squareRoot(-2);
        assertEquals(0, calculator.returnResult(), "Negative square root failed");
    }
}
