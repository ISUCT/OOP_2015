/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherData;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * 
 */
public class WeatherStation extends Application {
WeatherData weatherData;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        initApp();
        NewFXMain myStage = new NewFXMain();
        myStage.start(stage);
        ControllerWeather controller = myStage.getControllerWeather();
        controller.subscribe(weatherData);
        weatherData.setMesurements(79, 90, 29.2f);
    }
    
    private void initApp(){
        weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        
        weatherData.setMesurements(80, 65, 30.4f);
        weatherData.setMesurements(82, 70, 29.2f);
        weatherData.setMesurements(78, 90, 29.2f);
    }
    
}
