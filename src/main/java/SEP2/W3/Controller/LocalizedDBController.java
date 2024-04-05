package SEP2.W3.Controller;

import SEP2.W3.dao.LocalizedDBDAO;
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

    private String currentLang = "en";

    public void initialize() {
        System.out.println("LocalizedDBController initialized!");

        loadLocalization(currentLang, "US");

        languageSelectorBox.setValue("English");

        languageSelectorBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                switch (newValue) {
                    case "English", "انگلیسی", "英語" -> {
                        if (!currentLang.equals("en")) {
                            loadLocalization("en", "US");
                            currentLang = "en";
                            languageSelectorBox.setValue("English");
                        }
                    }
                    case "Japanese", "ژاپنی", "日本語" -> {
                        if (!currentLang.equals("ja")) {
                            loadLocalization("ja", "JP");
                            currentLang = "ja";
                            languageSelectorBox.setValue("日本語");
                        }
                    }
                    case "Farsi", "فارسی", "ペルシア語" -> {
                        if (!currentLang.equals("fa")) {
                            loadLocalization("fa", "IR");
                            currentLang = "fa";
                            languageSelectorBox.setValue("فارسی");
                        }
                    }
                }
            }
        });

    }

    public void setLanguageSelectorBox(ResourceBundle bundle) {
        String selectedItem = languageSelectorBox.getValue();

        languageSelectorBox.getItems().clear();

        languageSelectorBox.getItems().addAll(bundle.getString("english"), bundle.getString("japanese"), bundle.getString("farsi"));

        if (selectedItem != null && !selectedItem.isEmpty()) {
            languageSelectorBox.setValue(selectedItem);
        }
    }


    public void loadLocalization(String lang, String country) {
        Locale locale = Locale.of(lang, country);
        ResourceBundle bundle = ResourceBundle.getBundle("ResourceBundles.SEP2.W3.messages", locale);

        selectLanguageLabel.setText(bundle.getString("selectLanguage"));

        firstNameLabel.setText(bundle.getString("firstName"));
        firstNameField.setPromptText(bundle.getString("firstName"));

        lastNameLabel.setText(bundle.getString("lastName"));
        lastNameField.setPromptText(bundle.getString("lastName"));

        emailLabel.setText(bundle.getString("email"));
        emailField.setPromptText(bundle.getString("email"));

        submitButton.setText(bundle.getString("saveButton"));

        setLanguageSelectorBox(bundle);
    }

    public void onSavePress() {
        if (!firstNameField.getText().isEmpty() && !lastNameField.getText().isEmpty() && !emailField.getText().isEmpty()) {
            if (languageSelectorBox.getValue() != null) {
                switch (languageSelectorBox.getValue()) {
                    case "English" -> {
                        System.out.println("Saved in English");
                        LocalizedDBDAO.saveToTable("employee_en", firstNameField.getText(), lastNameField.getText(), emailField.getText());
                    }
                    case "日本語" -> {
                        System.out.println("Saved in Japanese");
                        LocalizedDBDAO.saveToTable("employee_ja", firstNameField.getText(), lastNameField.getText(), emailField.getText());
                    }
                    case "فارسی" -> {
                        System.out.println("Saved in Farsi");
                        LocalizedDBDAO.saveToTable("employee_fa", firstNameField.getText(), lastNameField.getText(), emailField.getText());
                    }
                }
            }

            System.out.println(firstNameField.getText());
            System.out.println(lastNameField.getText());
            System.out.println(emailField.getText());
        }
    }
}
