package Calculator;

public class Calculator {

    private double result;

    public void reset() {
        result = 0;
    }

    public double returnResult() {
        return result;
    }

    public void add(double n) {
        result = result + n;
    }

    public void subtract(double n) {
        result = result - n;
    }

    public void multiply(double n) {
        result = result * n;
    }

    public void divide(double n) {
        if (n == 0) throw new ArithmeticException("Divide by zero error!");
        else result = result / n;
    }

    public void power(double n) {
        result = (int) Math.pow(n, 2);
    }

    public void squareRoot(double n) {
        if (n == 0) throw new ArithmeticException("Square root of zero error!");
        result = (int) Math.sqrt(n);
    }

    public void powerOn() {
        result = 0;
    }

    public void powerOff() {
    }
}
