package Localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationDemo {
    public static void main(String[] args) {
        // Get the default locale to English
        Locale.setDefault(Locale.of("en", "US"));

        ResourceBundle messages = ResourceBundle.getBundle("messages");

        System.out.println("Default locale messages:");
        System.out.printf("Greetings: %s\n", messages.getString("greetings"));
        System.out.printf("Farewell: %s\n\n", messages.getString("farewell"));


        // Change the default locale to French
        Locale.setDefault(Locale.of("fr", "FR"));

        messages = ResourceBundle.getBundle("messages");

        System.out.println("French locale messages:");
        System.out.printf("Greetings: %s\n", messages.getString("greetings"));
        System.out.printf("Farewell: %s\n\n", messages.getString("farewell"));


        // Change the default locale to Finnish
        Locale.setDefault(Locale.of("fi", "FI"));

        messages = ResourceBundle.getBundle("messages");

        System.out.println("Finnish locale messages:");
        System.out.printf("Greetings: %s\n", messages.getString("greetings"));
        System.out.printf("Farewell: %s\n", messages.getString("farewell"));
    }
}
