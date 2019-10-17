/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxframedisablebutton2;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author profs
 */
public class FXMLDocumentController implements Initializable 
{
    
    @FXML
    private Label label;
    
    @FXML
    private Button button;
    
    int count = 0;
   
   
    
    @FXML
    private void handleButtonAction(ActionEvent event) 
      {
        ++count;
        if (count == 8)
          {
            
           button.setDisable(true);
           label.setVisible(true);
          }
          
       }
        
    
      
    @Override
    public void initialize(URL url, ResourceBundle rb) 
     {
        // TODO
    }    
   
    
}
