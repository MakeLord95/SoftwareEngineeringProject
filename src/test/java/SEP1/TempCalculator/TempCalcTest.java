
package SEP1.TempCalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TempCalcTest {

    @Test
    public void testKelvinToCel() {
        assertEquals(-258.15f, TempCalc.KelvinToCel(15f), 0.01);
    }

    @Test
    public void testCelToKelvin() {
        assertEquals(296.65, TempCalc.CelToKelvin(23.5f), 0.01);
    }

    @Test
    public void testFarToCel() {
        assertEquals(40.56f, TempCalc.FarToCel(105f), 0.01);
    }

    @Test
    public void testCelToFar() {
        assertEquals(74.3, TempCalc.CelToFar(23.5f), 0.01);
    }

    @Test
    public void testKelvinToFar() {
        assertEquals(-441.67, TempCalc.KelvinToFar(10f), 0.01);
    }

    @Test
    public void testFarToKelvin() {
        assertEquals(305.928, TempCalc.FarToKelvin(91f), 0.01);
    }
}