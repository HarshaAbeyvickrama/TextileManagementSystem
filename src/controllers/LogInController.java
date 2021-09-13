package controllers;

import controllers.CredentialManager;
import controllers.SceneController;
import com.jfoenix.controls.JFXButton;
import controllers.CredentialManager;
import controllers.SceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LogInController implements Initializable {
    @FXML
    private JFXButton btnLogn;
    @FXML
    private Label txtAlert;
    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField txtPassword;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void logIn(ActionEvent event) {
        String username =  String.valueOf(txtUsername.getText());
        String password =  String.valueOf(txtPassword.getText());
        CredentialManager credentialManager = new CredentialManager();
        boolean isValidated = credentialManager.validateLogin(username, password);
        if(isValidated){
            System.out.println("Logegd In");
            new SceneController().loadDashboard();

        }else{
            txtAlert.setText("Invalid Username / Password");
        }
    }

}
