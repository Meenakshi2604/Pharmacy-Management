package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;

public class Dashboard {

    @FXML
    private Button add;

    @FXML
    private Button expiry;

    @FXML
    private Button incQty;

    @FXML
    private Button logout;
    
    Main m = new Main();
    
    @FXML
    void Logout(ActionEvent event) throws IOException {
    	logout.setEffect(new InnerShadow());
        m.changeScene("Sample.fxml");
    }

    @FXML
    void addMedicine(ActionEvent event) throws IOException {
    	 m.changeScene("AddMedicine.fxml");
    }

    @FXML
    void checkExpiry(ActionEvent event) throws IOException {
    	 m.changeScene("CheckExpiry.fxml");
    }

    @FXML
    void increaseQuantity(ActionEvent event) throws IOException {
    	 m.changeScene("IncreaseQnty.fxml");
    }

}
