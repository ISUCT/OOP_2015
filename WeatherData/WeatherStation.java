/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherData;

/**
 *
 * @author h
 */
public class WeatherStation {
    public static void main (String [] args) {
    WeatherData weatherData = new WeatherData();
    
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    
    
    weatherData.setMesurements(80, 65, 30.4f);
    weatherData.setMesurements(82, 70, 29.2f);
    weatherData.setMesurements(78, 90, 29.2f);
    
    }
    
}
