public class Calculator {

    public int add(int a, int b) {
        return performOperation(a, b, Operation.ADD);
    }

    public int subtract(int a, int b) {
        return performOperation(a, b, Operation.SUBTRACT);
    }

    public int multiply(int a, int b) {
        return performOperation(a, b, Operation.MULTIPLY);
    }

    public int divide(int a, int b) {
        validateDivisionByZero(b);
        return performOperation(a, b, Operation.DIVIDE);
    }

    private int performOperation(int a, int b, Operation operation) {
        return switch (operation) {
            case ADD -> a + b;
            case SUBTRACT -> a - b;
            case MULTIPLY -> a * b;
            case DIVIDE -> a / b;
        };
    }

    private void validateDivisionByZero(int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }

    private enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }
}
