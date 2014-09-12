package fyptransitionflow.controller;

import fyptransitionflow.ControlledScreen;
import fyptransitionflow.Login;
import fyptransitionflow.ScreensController;
import fyptransitionflow.constant.ScreenConstant;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class LoginController implements Initializable, ControlledScreen {

    ScreensController scCtrl;
    
    @FXML private TextField txtUsername;
    @FXML private PasswordField txtPassword;
    @FXML private Label lblLoginError;
    
    public void setScreenParent(ScreensController screenParent){
        scCtrl = screenParent;
    }
    
    @FXML
    public void handleLogin(ActionEvent event){
        //get the input
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        Boolean result;
        
        //attempt login
        Login login = new Login();
        result = login.attempt(username, password);
        
        //if login success
        if(result == true){
            scCtrl.setScreen(ScreenConstant.terminal, ScreenConstant.terminalTitle);
        }else{
            lblLoginError.setText("Login failed!");
        }
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
