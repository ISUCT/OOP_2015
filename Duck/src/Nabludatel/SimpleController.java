/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nabludatel;

import WeatherData.DisplayElement;
import WeatherData.Observer;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 *
 * @author h
 */
public class SimpleController implements Initializable, Observer, DisplayElement {

    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    private Button myButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        assert myButton != null : "fx:id was not injected";

        myButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World");
            }

        });

    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    @Override
    public void display() {

    }

}
