package SEP1.TempCalculator;

public class TempCalc {

    public static float KelvinToCel(float kelvin) {
        return kelvin - 273.15f;
    }

    public static float CelToKelvin(float cel) {
        return cel + 273.15f;
    }

    public static float FarToCel(float far) {
        return (far - 32) * 5 / 9;
    }

    public static float CelToFar(float cel) {
        return (cel * 9 / 5) + 32;
    }

    public static float KelvinToFar(float kelvin) {
        return CelToFar(KelvinToCel(kelvin));
    }

    public static float FarToKelvin(float far) {
        return CelToKelvin(FarToCel(far));
    }

    public static void main(String[] args) {
        System.out.println(KelvinToCel(15f));
        System.out.println(CelToKelvin(23.5f));
        System.out.println(FarToCel(105f));
        System.out.println(CelToFar(23.5f));
        System.out.println(KelvinToFar(10f));
        System.out.println(FarToKelvin(91f));
    }
}
