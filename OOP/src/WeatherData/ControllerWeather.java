/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherData;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Application.launch;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 *
 */
public class ControllerWeather implements Initializable, Observer, DisplayElement {
    private Subject weatherData;
    
    @FXML 
    private Label LabelTemp;
    private Label LabelHum;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
           System.out.println("Here");    
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        LabelTemp.setText(Float.toString(temperature));
        LabelHum.setText(Float.toString(humidity));
        
    }

    @Override
    public void display() {
        
    }
    
    public static void main(String[] args) {
        launch(args);
        }
    
    public void subscribe(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
}
