/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Controller.MenuController;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

/**
 *
 * @author Batu
 */
public class Menu implements Siparis{
    
    int adet = 0;
    double total = 0.0;
    double iptal = 0.0;
    String bos = null;
    String secimAdi = null;
    String secim = null;

    
    @Override
    public String secimAdi(String ad, int adet) {
        switch (adet) {
            case 1:
                secim = (ad + " x1, ");
                System.out.println("Seçim: " + ad + " x1, ");
                break;
            case 2:
                secim = (ad + " x2, ");
                System.out.println("Seçim: " + ad + " x2, ");
                break;
            case 3:
                secim = (ad + " x3, ");
                System.out.println("Seçim: " + ad + " x3, ");
                break;
            case 4:
                secim = (ad + " x4, ");
                System.out.println("Seçim: " + ad + " x4, ");
                break;
            case 5:
                secim = (ad + " x5, ");
                System.out.println("Seçim: " + ad + " x5, ");
                break;
            case 6:
                secim = (ad + " x6, ");
                System.out.println("Seçim: " + ad + " x6, ");
                break;
            case 7:
                secim = (ad + " x7, ");
                System.out.println("Seçim: " + ad + " x7, ");
                break;
            case 8:
                secim = (ad + " x8, ");
                System.out.println("Seçim: " + ad + " x8, ");
                break;
            case 9:
                secim = (ad + " x9, ");
                System.out.println("Seçim: " + ad + " x9, ");
                break;
            case 10:
                secim = (ad + " x10, ");
                System.out.println("Seçim: " + ad + " x10, ");
                break;
            default:
                System.out.println("Adet seçiniz.");
                Alert hata = new Alert(Alert.AlertType.WARNING);

                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi
                break;
        }
        return secim;
    }

    @Override
    public double ucret(double fiyat, int adet) {
        if (adet == 0) {
            total = 0;
            System.out.println("Fiyat: " + total);
        } else {
            total = total + (fiyat * adet);
            System.out.println("Fiyat: " + total);
        }

        return total;
    }

    @Override
    public double iptal(double iptal) {
        total = 0.0;
        System.out.println(total);
        return total;
    }

    @Override
    public String iptal(String iptal) {
        bos = "";
        System.out.println("Seçim :");
        return bos;
    }
}
