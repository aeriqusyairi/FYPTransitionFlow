package fyptransitionflow.controller;

import fyptransitionflow.ControlledScreen;
import fyptransitionflow.ScreensController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class LoginController implements Initializable, ControlledScreen {

    ScreensController myController;
    
    @FXML private TextField txtUsername;
    @FXML private PasswordField txtPassword;
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }
    
    @FXML
    public void handleLogin(ActionEvent event){
        //get the input
        System.out.println(txtUsername.getText());
        System.out.println(txtPassword.getText());
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
