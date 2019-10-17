/*
 * Farrell - Java Programming -- Chapter 15 -- Problem 1a
 * Using JavaFX and Scene Builder
 * created / revised by Joe Paquette Oct. 12th, 2019
 */
package fxbookquote1a;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXBookQuote1a extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Book Quotes");
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
