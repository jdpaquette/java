/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxfacts;

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
public class FXMLDocumentController implements Initializable {
    
   int counter = 0; 
   
   @FXML
    private Button button;
    @FXML
    private Label L1;
    @FXML
    private Label L2;
    @FXML
    private Label L3;
    @FXML
    private Label L4;
    @FXML
    private Label L5;
    @FXML
    private Label L6;
    
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {
      
     if (counter == 0)      
     L1.setVisible(true);
     L6.setVisible (false);
     
      counter++;
      
      if(counter == 1)
      {
       L1.setVisible(false);
       L2.setVisible(true);
       
      }
      else
         if(counter == 2)
         {
              L2.setVisible(false);
              L3.setVisible(true);
               
         }
         else
             if(counter == 3)
             {
                  L3.setVisible(false);
                  L4.setVisible(true);
                   
             }
             else
                if(counter == 4)
                {
                     L4.setVisible(false);
                     L5.setVisible(true);
                      
                }
                else
                {
                    L5.setVisible(false);
                    L6.setVisible(true);
                  
                }   
      if (counter == 5) 
     counter = 0;
    } 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
