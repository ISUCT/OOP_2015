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
 * @author stud_6
 */
public class Controller implements Initializable {

    public static void main(String[] args) {
        launch(args);
    }

    private static void launch(String[] args) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @FXML
    private Button myButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        assert myButton != null : "fx:id was not injected";

//        myButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World");
//            }
//        });
        myButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }
}
