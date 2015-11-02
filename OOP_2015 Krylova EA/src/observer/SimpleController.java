/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 *
 * @author stud_17
 */
public class SimpleController implements Initializable{
@FXML
private Button button1;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     assert button1 != null : "fx:id was not injected";  
    button1.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent t) {
                System.out.println("Hello");
            }
        
    });
}
}
