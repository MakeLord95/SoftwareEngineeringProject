package SEP2.W3.Controller;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedDBController {

    public ChoiceBox<String> languageSelectorBox;
    public TextField firstNameField;
    public TextField lastNameField;
    public TextField emailField;
    public Button submitButton;
    public Label selectLanguageLabel;
    public Label firstNameLabel;
    public Label lastNameLabel;
    public Label emailLabel;

    public void initialize() {
        System.out.println("LocalizedDBController initialized!");
        languageSelectorBox.getItems().add("English");
        languageSelectorBox.getItems().add("Japanese");
        languageSelectorBox.getItems().add("Persian");

        loadLocalization("en", "US");
    }

    public void loadLocalization(String lang, String country) {
        Locale locale = Locale.of(lang, country);
        ResourceBundle bundle = ResourceBundle.getBundle("ResourceBundles.SEP2.W3.messages", locale);

        selectLanguageLabel.setText(bundle.getString("selectLanguage"));
        firstNameLabel.setText(bundle.getString("firstName"));
        lastNameLabel.setText(bundle.getString("lastName"));
        emailLabel.setText(bundle.getString("email"));
        submitButton.setText(bundle.getString("submit"));
    }

    public void onSavePress() {
        System.out.println(firstNameField.getText());
        System.out.println(lastNameField.getText());
        System.out.println(emailField.getText());
    }
}
