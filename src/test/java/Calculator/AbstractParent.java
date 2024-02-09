package Calculator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public abstract class AbstractParent {

    @BeforeAll
    public static void startTestSystem() {
        System.out.println("@BeforeAll TESTING STARTS.");
    }

    @AfterAll
    public static void stopTestSystem() {
        System.out.println("@AfterAll TESTING FINISHED.");
    }

    @BeforeEach
    public void initTestSystem() {
        System.out.println("  @BeforeEach Starting new testing method.");
    }

    @AfterEach
    public void cleanTestSystem() {
        System.out.println("  @AfterEach Testing method finished.");
    }
}
