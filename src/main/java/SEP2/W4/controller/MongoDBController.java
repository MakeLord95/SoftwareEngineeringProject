package SEP2.W4.controller;

import SEP2.W4.dao.MongoDBDAO;
import SEP2.W4.datasource.MongoDBConnector;
import com.mongodb.client.MongoDatabase;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.bson.Document;

public class MongoDBController {

    public TextField idField;
    public TextField nameField;
    public TextField ageField;
    public TextField cityField;

    public Button addButton;
    public Button readButton;
    public Button deleteButton;
    public Button updateButton;

    MongoDBConnector mongoDBConnector = MongoDBConnector.getInstance();
    MongoDatabase mongoDatabase = mongoDBConnector.getDatabase();
    MongoDBDAO mongoDBDAO = new MongoDBDAO(mongoDatabase);

    public void initialize() {
        System.out.println("MongoDB Controller Initialized");
    }

    public void addUser() {
        String id = idField.getText();
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        String city = cityField.getText();
        mongoDBDAO.addUser(id, name, age, city);

        showAlert("User Added", "User with ID " + id + " added", Alert.AlertType.INFORMATION);
    }

    public void getUser() {
        String id = idField.getText();
        Document user = mongoDBDAO.getUserById(id);

        if (user != null) {
            nameField.setText(user.getString("name"));
            ageField.setText(String.valueOf(user.getInteger("age")));
            cityField.setText(user.getString("city"));

            showAlert("User Found", "Found user: " + user, Alert.AlertType.INFORMATION);
        } else {
            showAlert("User Not Found", "No user found with ID " + id, Alert.AlertType.ERROR);
        }
    }

    public void updateUser() {
        String id = idField.getText();
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        String city = cityField.getText();
        mongoDBDAO.updateUser(id, name, age, city);

        showAlert("User Updated", "User with ID " + id + " updated", Alert.AlertType.INFORMATION);
    }

    public void deleteUser() {
        String id = idField.getText();
        mongoDBDAO.deleteUser(id);

        showAlert("User Deleted", "User with ID " + id + " deleted", Alert.AlertType.INFORMATION);

        idField.clear();
        nameField.clear();
        ageField.clear();
        cityField.clear();
    }

    public void showAlert(String title, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
