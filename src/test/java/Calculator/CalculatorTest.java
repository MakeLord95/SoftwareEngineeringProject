package Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @BeforeEach
    public void clearCalculator() {
        calculator.reset();
    }

    @Test
    @DisplayName("Testing addition of 1 + 2")
    public void testAdd() {
        calculator.add(1);
        calculator.add(2);
        assertEquals(3, calculator.returnResult(), "1 + 2 result is wrong");
    }

    @Test
    @DisplayName("Testing subtraction of 10 - 2")
    public void testSubtract() {
        calculator.add(10);
        calculator.subtract(2);
        assertEquals(8, calculator.returnResult(), "10 - 2 result is wrong");
    }

    @Test
    @DisplayName("Testing division of 8 / 2")
    public void testDivide() {
        calculator.add(8);
        calculator.divide(2);
        assertEquals(4, calculator.returnResult(), "8 / 2 result is wrong");
    }

    @Test
    @DisplayName("Testing division by zero")
    public void testDivideByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.divide(0));
        assertEquals("Divide by zero error!", exception.getMessage());
    }

    @Test
    @DisplayName("Testing multiplication of 2 * 3")
    public void testKerro() {
        calculator.add(2);
        calculator.multiply(3);
        assertEquals(6, calculator.returnResult(), "2 * 3 result is wrong");
    }
}
