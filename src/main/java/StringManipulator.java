public class StringManipulator {

    public StringManipulator() {
    }

    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public String capitalize(String input) {
        return input.toUpperCase();
    }
}
