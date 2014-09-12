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
public class WelcomeController implements Initializable, ControlledScreen {

    ScreensController scCtrl;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setScreenParent(ScreensController screenParent){
        scCtrl = screenParent;
    }
    
    @FXML
    public void goToLogin(ActionEvent event){
            scCtrl.setScreen(ScreenConstant.login, ScreenConstant.loginTitle);
    }
    
}
