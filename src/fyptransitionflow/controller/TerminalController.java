/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class TerminalController implements Initializable, ControlledScreen {
    
    ScreensController scCtrl;
    
    public void setScreenParent(ScreensController screenParent){
        scCtrl = screenParent;
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
