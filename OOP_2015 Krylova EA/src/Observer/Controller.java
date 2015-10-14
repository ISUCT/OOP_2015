/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 *
 * @author stud_6
 */
   public class Controller implements Initializable {
    
    @FXML 
    private Button myButton;


        
    public void initialize(URL location, ResourceBundle resources) {
         assert myButton !=null : "fx:id was not injected";
         
         myButton.setOnAction (new EventHandler<ActionEvent>() {

          
             @Override
             public void handle(ActionEvent event) {
                 System.out.println("Hello World");
             } 
         });
     }

   
    
}
