package Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.powerOn();
        System.out.println("...Powering on...");

        calculator.add(500);
        System.out.println("Adding 500    = " + calculator.returnResult());

        calculator.add(200);
        System.out.println("Adding 200    = " + calculator.returnResult());

        calculator.subtract(100);
        System.out.println("Subtracting 100  = " + calculator.returnResult());

        calculator.divide(2);
        System.out.println("Dividing by 2    = " + calculator.returnResult());

        calculator.multiply(10);
        System.out.println("Multiplying by 10 = " + calculator.returnResult());

        System.out.println("...Reseting...");
        calculator.reset();

        calculator.add(500);
        System.out.println("Adding 500    = " + calculator.returnResult());

        calculator.powerOff();
        System.out.println("...Powering off...");
    }
}
