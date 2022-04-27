/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Class.Menu;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Batu
 */
public class OnayController implements Initializable {

    @FXML
    private Button anaSayfa;
    @FXML
    private ProgressIndicator progess;
    @FXML
    private AnchorPane rootMainMenu;
    @FXML
    private ListView lv;
    @FXML
    private MenuItem kapat;
    @FXML
    private MenuItem hakkimizda;
    
    Menu liste = new Menu();
    MenuController secim = new MenuController();
    
    @FXML
    void geriClick(ActionEvent actionEvent){
         try{
            AnchorPane geri = FXMLLoader.load(getClass().getResource("/FXML/Home.fxml"));
            rootMainMenu.getChildren().setAll(geri);
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
    @FXML
    private void Kapat(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void Hakkimizda(ActionEvent event) {
        try {
            AnchorPane ap = FXMLLoader.load(getClass().getResource("/FXML/Hakkimizda.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Pizza KiNG - Hakkımızda");
            stage.setScene(new Scene(ap, 247, 310));
            stage.show();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
