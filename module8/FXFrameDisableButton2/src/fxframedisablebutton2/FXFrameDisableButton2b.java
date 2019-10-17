/*
 * Farrell - Java Programming -- Chapter 15 -- Problem 2b
 * Using JavaFX and Scene Builder
 * created / revised by Joe Paquette Oct. 12th, 2019
 */
package fxframedisablebutton2b;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXFrameDisableButton2b extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
