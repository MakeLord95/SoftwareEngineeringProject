package SEP2.W2.ButtonLocalization.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Locale;
import java.util.ResourceBundle;

public class ButtonLocalizationController {

    @FXML
    public Button buttonEN;

    @FXML
    public Button buttonFI;

    @FXML
    public Button buttonJP;

    @FXML
    public Label languageLabel;

    @FXML
    public void onClickEN() {
        System.out.println("English");
        loadLocalization("en", "US");
    }

    @FXML
    public void onClickFI() {
        System.out.println("Finnish");
        loadLocalization("fi", "FI");
    }

    @FXML
    public void onClickJP() {
        System.out.println("Japanese");
        loadLocalization("ja", "JP");
    }

    public void initialize() {
        System.out.println("ButtonLocalizationController initialized!");
        loadLocalization("en", "US");
    }

    public void loadLocalization(String lang, String country) {
        Locale locale = Locale.of(lang, country);
        ResourceBundle bundle = ResourceBundle.getBundle("ResourceBundles.SEP2.W2.message", locale);

        languageLabel.setText(bundle.getString("greetings"));

        buttonEN.setText(bundle.getString("english"));
        buttonFI.setText(bundle.getString("finnish"));
        buttonJP.setText(bundle.getString("japanese"));
    }
}
