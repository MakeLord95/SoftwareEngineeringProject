package SEP1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator2 calculator = new Calculator2();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void testSubtract() {
        Calculator2 calculator = new Calculator2();
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-3, calculator.subtract(0, 3));
        assertEquals(0, calculator.subtract(2, 2));
    }

    @Test
    public void testMultiply() {
        Calculator2 calculator = new Calculator2();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(-8, calculator.multiply(2, -4));
    }

    @Test
    public void testDivide() {
        Calculator2 calculator = new Calculator2();
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(0, calculator.divide(0, 5));
        assertEquals(-2, calculator.divide(8, -4));
    }

    @Test
    public void testDivideByZero() {
        Calculator2 calculator = new Calculator2();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }
}
