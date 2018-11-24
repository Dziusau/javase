package entrance;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class EntranceController {
    @FXML
    private TextField id;

    @FXML
    private PasswordField password;

    @FXML
    private Label errorMessage;

    SimpleStringProperty entranceError = new SimpleStringProperty();

    @FXML
    public void start() {
        System.out.println("Controller is ready");
        errorMessage.textProperty().bind(entranceError);
    }

    public void inputName(ActionEvent actionEvent) {
        String id[] = {"Vanya", "Sasha", "Stas", "Vlad", "Danik", "Oleg", "Misha", "Masha", "Yana", "Nikita"};
        if () {

        }
    }
    public void onClickEntranceButton(ActionEvent actionEvent) {
        System.out.print("Entrance is done");
    }
}
