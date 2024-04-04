package SEP2.W3.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LocalizedDBView extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML-Files/SEP2/W3/LocalizedDB.fxml"));
        Parent root = fxmlLoader.load();

        stage.setScene(new Scene(root));
        stage.setTitle("Localized Database");
        stage.setResizable(false);
        stage.show();
    }
}
