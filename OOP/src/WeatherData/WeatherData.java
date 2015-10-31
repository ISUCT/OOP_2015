/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherData;

import java.util.ArrayList;

/**
 *
 * 
 */
public class WeatherData implements Subject, DisplayElement {
    private ArrayList observers;
    private float temperature;
    private float pressure;
    private float humidity;
    
    
    
    public WeatherData(){
        observers = new ArrayList();
    }

    public void getTemperature(){
    
    }
    
    public void getHumidity(){
    
    }
    
    public void getPressure(){
    
    }
    
    public void measurementsChanded () {
        notifyObservers();
    
    }
    
    public void setMesurements(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;
        measurementsChanded();
    
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
            
        
        }
    }
    
    @Override
    public void notifyObservers(){
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    
    }
}
    