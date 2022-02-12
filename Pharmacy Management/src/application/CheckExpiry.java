package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;

public class CheckExpiry {
	
    @FXML
    private DatePicker date;

    @FXML
    private Button deleteBtn;

    @FXML
    void currentDate(ActionEvent event) {

    }

    @FXML
    void deleteList(ActionEvent event) {

    }

    @FXML
    void backToDashboard(ActionEvent event) throws IOException {
    	Main m = new Main();
    	 m.changeScene("dashboard.fxml");
    }

}
