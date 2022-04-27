/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Class.Masa;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Batu
 */
public class HomeController implements Initializable {

    @FXML
    private Button musteri;
    @FXML
    private Button personel;
    @FXML
    private AnchorPane ap;
    @FXML
    private TabPane tp;
    @FXML
    private Tab musteriGiris;
    @FXML
    private Tab personelGiris;
    @FXML
    private TextField musteriAd = null;
    @FXML
    public TextField musteriMasaNo;
    @FXML
    private TextField personelId;
    @FXML
    private PasswordField personelSifre;

    @FXML
    private void menuButtonAction(ActionEvent event) {
        Alert hata = new Alert(Alert.AlertType.ERROR); //Alert tanımlanması ve alert türünün seçilmesi
        Masa masaNo = new Masa();
        
        //Müşteri girişinin kontrolünün sağlanması
        if ((musteriAd.getText().trim().toString().equals("")) || (musteriMasaNo).getText().trim().toString().equals("")) {
            System.out.println("Boş alanları doldurun.");
            hata.setTitle("Uyarı");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Hatalı seçim."); //Başlık yazısının ayaralanması
            hata.setContentText("Boş Alanları Doldurunuz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi

        } else {
            if ((musteriMasaNo).getText().matches("[1-9.]")) {
                System.out.println("Menüye yönlendiriliyorsunuz.");

                try {
                    AnchorPane menu = FXMLLoader.load(getClass().getResource("/FXML/Menu.fxml"));
                    ap.getChildren().setAll(menu);

                } catch (IOException e) {
                    System.out.println(e.toString());
                }
                //Masa numarası
                masaNo.setMasaNo(musteriMasaNo.getText());

                System.out.println(masaNo.getMasaNo());

            } else {
                System.out.println("Yanlış masa numarası.");
                hata.setTitle("Uyarı");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Hatalı seçim."); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen doğru masa numarası girin."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi
            }
        }
    }

    @FXML
    private void personelButtonAction(ActionEvent event) {
        try {
            AnchorPane personel = FXMLLoader.load(getClass().getResource("/FXML/Personel.fxml"));
            ap.getChildren().setAll(personel);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb
    ) {

    }
}
