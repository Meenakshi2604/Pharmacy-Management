package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login {

    @FXML
    private TextField username;

    @FXML
    private Button login;

    @FXML
    private Label wrongLogin;

    @FXML
    private PasswordField password;

    @FXML
    void userLogin(ActionEvent event) throws IOException {
    	checkLogin();
    }

    private void checkLogin() throws IOException {
        Main m = new Main();
        if(username.getText().toString().equals("PY-1234") && password.getText().toString().equals("321")) {
            wrongLogin.setText("Success!");

            m.changeScene("dashboard.fxml");
        }

        else if(username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogin.setText("Please enter your data.");
        }


        else {
            wrongLogin.setText("Wrong username or password!");
        }
    }

}
