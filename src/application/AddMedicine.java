package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AddMedicine {

    @FXML
    private TextField MedicineName;

    @FXML
    private TextField id;

    @FXML
    private TextField qnty;

    @FXML
    private DatePicker exp_date;

    @FXML
    private Button add;

    @FXML
    private Button back;

    @FXML
    void addMed(ActionEvent event) {

    }

    @FXML
    void home(ActionEvent event) throws IOException {
    	Main m = new Main();
   	 	m.changeScene("dashboard.fxml");
    }

}
