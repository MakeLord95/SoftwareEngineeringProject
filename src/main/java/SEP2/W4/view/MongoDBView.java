package SEP2.W4.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class MongoDBView extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML-Files/SEP2/W4/MongoDB.fxml"));
        Parent root = fxmlLoader.load();

        stage.setScene(new Scene(root));
        stage.getIcons().add(new Image(Objects.requireNonNull(MongoDBView.class.getResourceAsStream("/images/mongodb.png"))));
        stage.setTitle("MongoDB CRUD Operations");
        stage.setResizable(false);
        stage.show();
    }
}
