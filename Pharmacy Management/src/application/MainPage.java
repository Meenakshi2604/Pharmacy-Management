package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainPage {

    @FXML
    void customerPage(ActionEvent event) throws IOException {
    	Main m = new Main();
   	 	m.changeScene("Customer.fxml");
    }

    @FXML
    void loginPage(ActionEvent event) throws IOException {
    	Main m = new Main();
   	 	m.changeScene("Sample.fxml");
    }

}
