/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherData;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author h
 */
public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {;
        
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Nabludatel.NewFXMain.class.getResource("demoWeather.fxml"));
            Pane rootLayout = (Pane) loader.load();
            loader.getController();
            Scene scene = new Scene (rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            
    } catch(IOException ex) {
        
        ex.printStackTrace();
    }}
    
        public static void main(String[] args) {
        launch(args);
        }
   }
   
    
    

