package fyptransitionflow;

import fyptransitionflow.constant.ScreenConstant;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //first we need to load all screen
        ScreensController scCtrl = new ScreensController(primaryStage);
        scCtrl.loadScreen(ScreenConstant.welcome);
        scCtrl.loadScreen(ScreenConstant.login);
        scCtrl.loadScreen(ScreenConstant.terminal);
        
        //set initial screen
        scCtrl.setScreen(ScreenConstant.welcome, ScreenConstant.welcomeTitle);
        
        //compose add structure and rock the interface
        Group root = new Group();
        root.getChildren().addAll(scCtrl);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
