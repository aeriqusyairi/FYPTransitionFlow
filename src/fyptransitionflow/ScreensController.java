package fyptransitionflow;

import java.util.HashMap;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ScreensController extends StackPane{
    //Holds the screens to be displayed
    private HashMap<String, Node> screens = new HashMap<>();
    
    //hold the stage
    private Stage stage;
    
    public ScreensController(Stage s){
        super();
        stage = s;
    }
    
    //add the screen to the collection
    public void addScreen(String name, Node screen){
        screens.put(name, screen);
    }
    
    //returns the Node correspond to the requested name
    public Node getScreen(String name){
        return screens.get(name);
    }
    
    //load the template file, 
    //add the screen to the collection,
    //injects the screenPane to the controller
    public boolean loadScreen(String name){
        try{
            FXMLLoader templateLoader = new FXMLLoader(getClass().getResource("view/"+name+".fxml"));
            Parent loadScreen = (Parent) templateLoader.load();
            ControlledScreen screenController = ((ControlledScreen) templateLoader.getController());
            screenController.setScreenParent(this);
            addScreen(name, loadScreen);
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    //display the screen with a predefined name
    public boolean setScreen(final String name, final String title){
        if(screens.get(name) != null){//if screen is successfully loaded
            final DoubleProperty opacity = opacityProperty();
            
            if(!getChildren().isEmpty()){//if there is no more than one screen
                Timeline fade = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(opacity, 1.0)),
                        new KeyFrame(new Duration(1000), new EventHandler<ActionEvent>(){

                            @Override
                            public void handle(ActionEvent event) {
                                getChildren().remove(0);//remove the displayed screen
                                getChildren().add(0, screens.get(name));//add the requested screen
                                Timeline fadeIn = new Timeline(
                                        new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0.0)),
                                        new KeyFrame(new Duration(800), new KeyValue(opacity, 1.0))
                                );
                                fadeIn.play();
                            }   
                        }, 
                        new KeyValue(opacity, 0.0))
                );
                fade.play();
            }else{
                setOpacity(0.0);
                getChildren().add(screens.get(name));//no one else been displayed, just show it
                Timeline fadeIn = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0.0)),
                        new KeyFrame(new Duration(2500), new KeyValue(opacity, 1.0))
                );
                fadeIn.play();
            }
            
            stage.setTitle(title);
           
            return true;
            
        }else{
            System.out.println("screen fail to load!!");
            return false;
        }
    }
    
    //remove screen
    public boolean unloadScreen(String name){
        if(screens.remove(name) == null){
            System.out.println("screen did not exist!");
            return false;
        }else{
            return true;
        }
    }
    
}
