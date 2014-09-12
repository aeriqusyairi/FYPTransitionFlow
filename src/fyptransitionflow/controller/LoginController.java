package fyptransitionflow.controller;

import fyptransitionflow.ControlledScreen;
import fyptransitionflow.ScreensController;
import fyptransitionflow.constant.ScreenConstant;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class LoginController implements Initializable, ControlledScreen {

    ScreensController myController;
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }
    
    @FXML
    public void handleLogin(ActionEvent event){
            
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
