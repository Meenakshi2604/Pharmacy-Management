package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class IncreaseQnty {

    @FXML
    private TextField nameId;

    @FXML
    private TextField qnty;

    @FXML
    private Button back;

    @FXML
    private Button add;

    @FXML
    void addItem(ActionEvent event) {

    }
    
    @FXML
    void home(ActionEvent event) throws IOException {
    	Main m = new Main();
   	 	m.changeScene("dashboard.fxml");
    }

    @FXML
    void incQnty(ActionEvent event) {

    }

    @FXML
    void medName(ActionEvent event) {

    }

}
