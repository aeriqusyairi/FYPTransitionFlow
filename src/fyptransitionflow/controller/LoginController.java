package fyptransitionflow.controller;

import fyptransitionflow.ControlledScreen;
import fyptransitionflow.ScreensController;
import java.net.URL;
import java.util.ResourceBundle;
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
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
