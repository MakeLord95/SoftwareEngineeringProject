package SEP1;

import SEP1.StringManipulator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulatorTest {

    private StringManipulator stringManipulator;

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        stringManipulator = new StringManipulator();
    }

    @AfterEach
    public void tearDown() {
        stringManipulator = null;
    }

    @Test
    public void reverseShouldReturnReversedString() {
        String input = "hello";
        String expected = "olleh";
        String actual = stringManipulator.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void reverseShouldReturnEmptyStringWhenInputIsEmpty() {
        String input = "";
        String expected = "";
        String actual = stringManipulator.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void capitalizeShouldReturnCapitalizedString() {
        String input = "hello";
        String expected = "HELLO";
        String actual = stringManipulator.capitalize(input);
        assertEquals(expected, actual);
    }

    @Test
    public void capitalizeShouldReturnEmptyStringWhenInputIsEmpty() {
        String input = "";
        String expected = "";
        String actual = stringManipulator.capitalize(input);
        assertEquals(expected, actual);
    }
}
