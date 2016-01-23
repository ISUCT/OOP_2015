/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

/**
 *
 * @author h
 */
public class NewFXMain extends Application  {
    

      // Value injected by FXMLLoader


    @Override
    public void start(Stage primaryStage) {

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(NewFXMain.class.getResource("demo1.fxml"));
            Pane rootLayout = (Pane) loader.load();
            
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
        

    


    
    
 


