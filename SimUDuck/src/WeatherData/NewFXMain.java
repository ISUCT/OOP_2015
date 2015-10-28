/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherData;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author h
 */
public class NewFXMain extends Application {
ControllerWeather controllerWeather;
    @Override
    public void start(Stage primaryStage) {

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(NewFXMain.class.getResource("demoWeather.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            controllerWeather = loader.getController();
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException ex) {

            ex.printStackTrace();
        }
    }
    
    public ControllerWeather getControllerWeather (){
        return controllerWeather;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
