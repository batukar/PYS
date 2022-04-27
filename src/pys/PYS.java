/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pys;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Batu
 */
public class PYS extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent home = FXMLLoader.load(getClass().getResource("/FXML/Home.fxml"));
        primaryStage.setTitle("Pizza Otomasyon");
        Scene scene = new Scene(home);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/Image/icon.png")));
        
        
        ChoiceBox<String>  cb = new ChoiceBox<>();
        cb.getItems().addAll("Küçük" , "Orta" , "Büyük" , "Jumbo");
        cb.setValue("Orta");
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
