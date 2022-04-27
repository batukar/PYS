/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Class.Ayran;
import Class.Cay;
import Class.CitirKova;
import Class.ElmaDilimi;
import Class.Fanta;
import Class.Gurme;
import Class.Icecek;
import Class.Kampanya;
import Class.Kayit;
import Class.Kizartma;
import Class.Klasik;
import Class.Kola;
import Class.Masa;
import Class.Menu;
import Class.Nugget;
import Class.ParmakDilim;
import Class.Pizza;
import Class.SoganHalkasi;
import Class.SosluKanat;
import Class.Su;
import Class.Vejeteryan;
import DAO.KayitDao;
import java.io.IOException;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Batu
 */
public class MenuController implements Initializable {

    @FXML
    private AnchorPane ap;
    @FXML
    private MenuBar menuBar;
    @FXML
    private MenuItem kapat;
    @FXML
    private MenuItem hakkimizda;
    @FXML
    private ComboBox<String> boySecim;
    @FXML
    private TabPane tpMenu;
    @FXML
    private Tab tabPizza;
    @FXML
    private TabPane tpPizza;
    @FXML
    private Tab tabKlasik;
    @FXML
    private AnchorPane aKlasik;
    @FXML
    private Tab tabVejeteryan;
    @FXML
    private AnchorPane aVejeteryan;
    @FXML
    private Tab tabGurme;
    @FXML
    private AnchorPane aGurme;
    @FXML
    private Tab tabKampanya;
    @FXML
    private AnchorPane aKampanya;
    @FXML
    private Tab tabKizartma;
    @FXML
    private TabPane tpKizartma;
    @FXML
    private Tab tabPatates;
    @FXML
    private AnchorPane aPatates;
    @FXML
    private Tab Nugget;
    @FXML
    private AnchorPane aNugget;
    @FXML
    private Tab tabSoganHalkasi;
    @FXML
    private AnchorPane aSoganHalkasi;
    @FXML
    private Tab tabOzelSosluKanat;
    @FXML
    private AnchorPane aOzelSosluKanat;
    @FXML
    private Tab tabIcecek;
    @FXML
    private TabPane tpIcecek;
    @FXML
    private Tab tabKola;
    @FXML
    private AnchorPane aKola;
    @FXML
    private Tab tabFanta;
    @FXML
    private AnchorPane aFanta;
    @FXML
    private Tab tabAyran;
    @FXML
    private AnchorPane aAyran;
    @FXML
    private Tab tabCay;
    @FXML
    private AnchorPane aCay;
    @FXML
    private Tab tabSu;
    @FXML
    private AnchorPane aSu;
    @FXML
    private Label tutar;
    @FXML
    private TextField hesap;
    @FXML
    private Button geri;
    @FXML
    private Button tamamla;
    @FXML
    private TextField secim;
    @FXML
    private RadioButton mezzalunaK;
    @FXML
    private RadioButton mezzalunaO;
    @FXML
    private RadioButton mezzalunaB;
    @FXML
    private RadioButton mezzalunaJ;
    @FXML
    private RadioButton malzemeliK;
    @FXML
    private RadioButton malzemeliO;
    @FXML
    private RadioButton malzemeliB;
    @FXML
    private RadioButton malzemeliJ;
    @FXML
    private RadioButton superK;
    @FXML
    private RadioButton superO;
    @FXML
    private RadioButton superB;
    @FXML
    private RadioButton superJ;
    @FXML
    private RadioButton mexicoK;
    @FXML
    private RadioButton mexicoO;
    @FXML
    private RadioButton mexicoB;
    @FXML
    private RadioButton mexicoJ;
    @FXML
    private RadioButton deluxK;
    @FXML
    private RadioButton deluxO;
    @FXML
    private RadioButton deluxB;
    @FXML
    private RadioButton deluxJ;
    @FXML
    private RadioButton tonK;
    @FXML
    private RadioButton tonO;
    @FXML
    private RadioButton tonB;
    @FXML
    private RadioButton tonJ;
    @FXML
    private RadioButton margaritaK;
    @FXML
    private RadioButton margaritaO;
    @FXML
    private RadioButton margaritaB;
    @FXML
    private RadioButton margaritaJ;
    @FXML
    private RadioButton fiestaK;
    @FXML
    private RadioButton fiestaO;
    @FXML
    private RadioButton fiestaB;
    @FXML
    private RadioButton fiestaJ;
    @FXML
    private RadioButton vejeteryanK;
    @FXML
    private RadioButton vejeteryanO;
    @FXML
    private RadioButton vejeteryanB;
    @FXML
    private RadioButton vejeteryanJ;
    @FXML
    private RadioButton peynirliK;
    @FXML
    private RadioButton peynirliO;
    @FXML
    private RadioButton peynirliB;
    @FXML
    private RadioButton peynirliJ;
    @FXML
    private RadioButton kavurmaliK;
    @FXML
    private RadioButton kavurmaliO;
    @FXML
    private RadioButton kavurmaliB;
    @FXML
    private RadioButton kavurmaliJ;
    @FXML
    private RadioButton pastirmaliK;
    @FXML
    private RadioButton pastirmaliO;
    @FXML
    private RadioButton pastirmaliB;
    @FXML
    private RadioButton pastirmaliJ;
    @FXML
    private RadioButton kaburgaliK;
    @FXML
    private RadioButton kaburgaliO;
    @FXML
    private RadioButton kaburgaliB;
    @FXML
    private RadioButton kaburgaliJ;
    @FXML
    private RadioButton tavukluK;
    @FXML
    private RadioButton tavukluO;
    @FXML
    private RadioButton tavukluB;
    @FXML
    private RadioButton tavukluJ;
    @FXML
    private RadioButton anadoluK;
    @FXML
    private RadioButton anadoluO;
    @FXML
    private RadioButton anadoluB;
    @FXML
    private RadioButton anadoluJ;
    @FXML
    private RadioButton ekstraK;
    @FXML
    private RadioButton ekstraO;
    @FXML
    private RadioButton ekstraB;
    @FXML
    private RadioButton ekstraJ;
    @FXML
    private TextField klasikAdet;
    @FXML
    private TextField vejAdet;
    @FXML
    private TextField gurAdet;
    @FXML
    private TextField kamAdet;
    @FXML
    private TextField patAdet;
    @FXML
    private TextField nugAdet;
    @FXML
    private TextField sogAdet;
    @FXML
    private TextField kanAdet;
    @FXML
    private TextField kolAdet;
    @FXML
    private TextField fanAdet;
    @FXML
    private TextField ayAdet;
    @FXML
    private TextField cayAdet;
    @FXML
    private TextField suAdet;
    @FXML
    private TableView<Kayit> tableView;
    @FXML
    TableColumn<Kayit, String> cl_hesap;
    @FXML
    TableColumn<Kayit, String> cl_secim;
    @FXML
    TableColumn<Kayit, String> cl_masaNo;
    HomeController hc = new HomeController();

    //Object
    Menu adisyon = new Menu();
    Pizza pizza = new Pizza();
    Klasik klasik = new Klasik();
    Vejeteryan vej = new Vejeteryan();
    Gurme gur = new Gurme();
    Kampanya kamp = new Kampanya();

    Kizartma kizartma = new Kizartma();
    ParmakDilim pd = new ParmakDilim();
    ElmaDilimi ed = new ElmaDilimi();
    CitirKova ck = new CitirKova();
    Nugget ng = new Nugget();
    SoganHalkasi sh = new SoganHalkasi();
    SosluKanat sk = new SosluKanat();

    Icecek icecek = new Icecek();
    Kola kola = new Kola();
    Fanta fnt = new Fanta();
    Ayran ayr = new Ayran();
    Cay cay = new Cay();
    Su su = new Su();

    TextField adet = new TextField("1");
    Alert hata = new Alert(Alert.AlertType.WARNING);
    KayitDao kayitDao;
    Masa masaNo = new Masa();

    //Pizza ve Boy Seçimleri
    //Klasik
    @FXML
    public void Mezzaluna(ActionEvent event) {
        if (mezzalunaK.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                mezzalunaK.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(0, 0, 0, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else if (mezzalunaO.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                mezzalunaO.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(0, 1, 1, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else if (mezzalunaB.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                mezzalunaB.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(0, 2, 2, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                mezzalunaJ.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(0, 3, 3, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        }
    }

    @FXML
    public void Malzemeli(ActionEvent event) {
        if (malzemeliK.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                malzemeliK.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(1, 0, 0, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else if (malzemeliO.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                malzemeliO.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(1, 1, 1, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else if (malzemeliB.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                malzemeliB.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(1, 2, 2, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                malzemeliJ.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(1, 3, 3, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        }
    }

    @FXML
    public void Super(ActionEvent event) {
        if (superK.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                superK.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(2, 0, 0, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else if (superO.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                superO.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(2, 1, 1, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else if (superB.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                superB.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(2, 2, 2, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                superJ.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(2, 3, 3, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        }
    }

    @FXML
    public void Mexico(ActionEvent event) {
        if (mexicoK.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                mexicoK.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(3, 0, 0, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else if (mexicoO.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                mexicoO.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(3, 1, 1, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else if (mexicoB.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                mexicoB.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(3, 2, 2, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                mexicoJ.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(3, 3, 3, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        }
    }

    @FXML
    public void Delux(ActionEvent event) {
        if (deluxK.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                deluxK.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(4, 0, 0, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else if (deluxO.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                deluxO.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(4, 1, 1, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else if (deluxB.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                deluxB.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(4, 2, 2, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                deluxJ.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(4, 3, 3, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        }
    }

    @FXML
    public void TonBalikli(ActionEvent event) {
        if (tonK.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                tonK.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(5, 0, 0, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else if (tonO.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                tonO.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(5, 1, 1, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else if (tonB.isSelected()) {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                tonB.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(5, 2, 2, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        } else {
            if (klasikAdet.getText().equals("") || klasikAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                tonJ.setSelected(false);
            } else {
                int miktar = Integer.parseInt(klasikAdet.getText());
                klasik.fiyatBelirle(5, 3, 3, 0);
                System.out.println(klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu() + " " + klasik.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(klasik.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + klasik.getPizzaAdi() + " " + klasik.getPizzaBoyu(), miktar)));
            }
        }
    }

    //Vejeteryan
    @FXML
    public void Margarita(ActionEvent event) {
        if (margaritaK.isSelected()) {
            if (vejAdet.getText().equals("") || vejAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                margaritaK.setSelected(false);
            } else {
                int miktar = Integer.parseInt(vejAdet.getText());
                vej.fiyatBelirle(0, 0, 0, 1);
                System.out.println(vej.getPizzaAdi() + " " + vej.getPizzaBoyu() + " " + vej.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(vej.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + vej.getPizzaAdi() + " " + vej.getPizzaBoyu(), miktar)));
            }
        } else if (margaritaO.isSelected()) {
            if (vejAdet.getText().equals("") || vejAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                margaritaO.setSelected(false);
            } else {
                int miktar = Integer.parseInt(vejAdet.getText());
                vej.fiyatBelirle(0, 1, 1, 1);
                System.out.println(vej.getPizzaAdi() + " " + vej.getPizzaBoyu() + " " + vej.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(vej.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + vej.getPizzaAdi() + " " + vej.getPizzaBoyu(), miktar)));
            }
        } else if (margaritaB.isSelected()) {
            if (vejAdet.getText().equals("") || vejAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                margaritaB.setSelected(false);
            } else {
                int miktar = Integer.parseInt(vejAdet.getText());
                vej.fiyatBelirle(0, 2, 2, 1);
                System.out.println(vej.getPizzaAdi() + " " + vej.getPizzaBoyu() + " " + vej.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(vej.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + vej.getPizzaAdi() + " " + vej.getPizzaBoyu(), miktar)));
            }
        } else {
            if (vejAdet.getText().equals("") || vejAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                margaritaJ.setSelected(false);
            } else {
                int miktar = Integer.parseInt(vejAdet.getText());
                vej.fiyatBelirle(0, 3, 3, 1);
                System.out.println(vej.getPizzaAdi() + " " + vej.getPizzaBoyu() + " " + vej.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(vej.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + vej.getPizzaAdi() + " " + vej.getPizzaBoyu(), miktar)));
            }
        }
    }

    @FXML
    public void Vejeteryan(ActionEvent event) {
        if (vejeteryanK.isSelected()) {
            if (vejAdet.getText().equals("") || vejAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                vejeteryanK.setSelected(false);
            } else {
                int miktar = Integer.parseInt(vejAdet.getText());
                vej.fiyatBelirle(1, 0, 0, 1);
                System.out.println(vej.getPizzaAdi() + " " + vej.getPizzaBoyu() + " " + vej.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(vej.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + vej.getPizzaAdi() + " " + vej.getPizzaBoyu(), miktar)));
            }
        } else if (vejeteryanO.isSelected()) {
            if (vejAdet.getText().equals("") || vejAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                vejeteryanO.setSelected(false);
            } else {
                int miktar = Integer.parseInt(vejAdet.getText());
                vej.fiyatBelirle(1, 1, 1, 1);
                System.out.println(vej.getPizzaAdi() + " " + vej.getPizzaBoyu() + " " + vej.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(vej.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + vej.getPizzaAdi() + " " + vej.getPizzaBoyu(), miktar)));
            }
        } else if (vejeteryanB.isSelected()) {
            if (vejAdet.getText().equals("") || vejAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                vejeteryanB.setSelected(false);
            } else {
                int miktar = Integer.parseInt(vejAdet.getText());
                vej.fiyatBelirle(1, 2, 2, 1);
                System.out.println(vej.getPizzaAdi() + " " + vej.getPizzaBoyu() + " " + vej.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(vej.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + vej.getPizzaAdi() + " " + vej.getPizzaBoyu(), miktar)));
            }
        } else {
            if (vejAdet.getText().equals("") || vejAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                vejeteryanJ.setSelected(false);
            } else {
                int miktar = Integer.parseInt(vejAdet.getText());
                vej.fiyatBelirle(1, 3, 3, 1);
                System.out.println(vej.getPizzaAdi() + " " + vej.getPizzaBoyu() + " " + vej.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(vej.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + vej.getPizzaAdi() + " " + vej.getPizzaBoyu(), miktar)));
            }
        }
    }

    @FXML
    public void Peynirli(ActionEvent event) {
        if (peynirliK.isSelected()) {
            if (vejAdet.getText().equals("") || vejAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                peynirliK.setSelected(false);
            } else {
                int miktar = Integer.parseInt(vejAdet.getText());
                vej.fiyatBelirle(2, 0, 0, 1);
                System.out.println(vej.getPizzaAdi() + " " + vej.getPizzaBoyu() + " " + vej.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(vej.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + vej.getPizzaAdi() + " " + vej.getPizzaBoyu(), miktar)));
            }
        } else if (peynirliO.isSelected()) {
            if (vejAdet.getText().equals("") || vejAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                peynirliO.setSelected(false);
            } else {
                int miktar = Integer.parseInt(vejAdet.getText());
                vej.fiyatBelirle(2, 1, 1, 1);
                System.out.println(vej.getPizzaAdi() + " " + vej.getPizzaBoyu() + " " + vej.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(vej.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + vej.getPizzaAdi() + " " + vej.getPizzaBoyu(), miktar)));
            }
        } else if (peynirliB.isSelected()) {
            if (vejAdet.getText().equals("") || vejAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                peynirliB.setSelected(false);
            } else {
                int miktar = Integer.parseInt(vejAdet.getText());
                vej.fiyatBelirle(2, 2, 2, 1);
                System.out.println(vej.getPizzaAdi() + " " + vej.getPizzaBoyu() + " " + vej.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(vej.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + vej.getPizzaAdi() + " " + vej.getPizzaBoyu(), miktar)));
            }
        } else {
            if (vejAdet.getText().equals("") || vejAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                peynirliK.setSelected(false);
            } else {
                int miktar = Integer.parseInt(vejAdet.getText());
                vej.fiyatBelirle(2, 3, 3, 1);
                System.out.println(vej.getPizzaAdi() + " " + vej.getPizzaBoyu() + " " + vej.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(vej.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + vej.getPizzaAdi() + " " + vej.getPizzaBoyu(), miktar)));
            }
        }
    }

    @FXML
    public void Fiesta(ActionEvent event) {
        if (fiestaK.isSelected()) {
            if (vejAdet.getText().equals("") || vejAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                fiestaK.setSelected(false);
            } else {
                int miktar = Integer.parseInt(vejAdet.getText());
                vej.fiyatBelirle(3, 0, 0, 1);
                System.out.println(vej.getPizzaAdi() + " " + vej.getPizzaBoyu() + " " + vej.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(vej.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + vej.getPizzaAdi() + " " + vej.getPizzaBoyu(), miktar)));
            }
        } else if (fiestaO.isSelected()) {
            if (vejAdet.getText().equals("") || vejAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                fiestaO.setSelected(false);
            } else {
                int miktar = Integer.parseInt(vejAdet.getText());
                vej.fiyatBelirle(3, 1, 1, 1);
                System.out.println(vej.getPizzaAdi() + " " + vej.getPizzaBoyu() + " " + vej.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(vej.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + vej.getPizzaAdi() + " " + vej.getPizzaBoyu(), miktar)));
            }
        } else if (fiestaB.isSelected()) {
            if (vejAdet.getText().equals("") || vejAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                fiestaB.setSelected(false);
            } else {
                int miktar = Integer.parseInt(vejAdet.getText());
                vej.fiyatBelirle(3, 2, 2, 1);
                System.out.println(vej.getPizzaAdi() + " " + vej.getPizzaBoyu() + " " + vej.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(vej.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + vej.getPizzaAdi() + " " + vej.getPizzaBoyu(), miktar)));
            }
        } else {
            if (vejAdet.getText().equals("") || vejAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                fiestaJ.setSelected(false);
            } else {
                int miktar = Integer.parseInt(vejAdet.getText());
                vej.fiyatBelirle(3, 3, 3, 1);
                System.out.println(vej.getPizzaAdi() + " " + vej.getPizzaBoyu() + " " + vej.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(vej.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + vej.getPizzaAdi() + " " + vej.getPizzaBoyu(), miktar)));
            }
        }
    }

    //Gurme
    @FXML
    public void Kavurmali(ActionEvent event) {
        if (kavurmaliK.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                kavurmaliK.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(0, 0, 0, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else if (kavurmaliO.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                kavurmaliO.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(0, 1, 1, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else if (kavurmaliB.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                kavurmaliB.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(0, 2, 2, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                kavurmaliJ.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(0, 3, 3, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        }
    }

    @FXML
    public void Pastirmali(ActionEvent event) {
        if (pastirmaliK.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                pastirmaliK.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(1, 0, 0, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else if (pastirmaliO.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                pastirmaliO.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(1, 1, 1, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else if (pastirmaliB.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                pastirmaliB.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(1, 2, 2, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                pastirmaliJ.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(1, 3, 3, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        }
    }

    @FXML
    public void Kaburgali(ActionEvent event) {
        if (kaburgaliK.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                kaburgaliK.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(2, 0, 0, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else if (kaburgaliO.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                kaburgaliO.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(2, 1, 1, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else if (kaburgaliB.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                kaburgaliB.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(2, 2, 2, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                kaburgaliJ.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(2, 3, 3, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        }
    }

    @FXML
    public void Tavuklu(ActionEvent event) {
        if (tavukluK.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                tavukluK.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(3, 0, 0, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else if (tavukluO.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                tavukluO.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(3, 1, 1, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else if (tavukluB.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                tavukluB.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(3, 2, 2, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                tavukluJ.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(3, 3, 3, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        }
    }

    @FXML
    public void AnadoluAtesi(ActionEvent event) {
        if (anadoluK.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                anadoluK.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(4, 0, 0, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else if (anadoluO.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                anadoluO.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(4, 1, 1, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else if (anadoluB.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                anadoluB.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(4, 2, 2, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                anadoluJ.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(4, 3, 3, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        }
    }

    @FXML
    public void Ekstra(ActionEvent event) {
        if (ekstraK.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                ekstraK.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(5, 0, 0, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else if (ekstraO.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                ekstraO.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(5, 1, 1, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else if (ekstraB.isSelected()) {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                ekstraB.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(5, 2, 2, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        } else {
            if (gurAdet.getText().equals("") || gurAdet.getText().equals("0")) {
                hata.setTitle("Dikkat");//Alert e başlık verilmesi
                hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
                hata.setWidth(200);
                hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
                hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
                hata.showAndWait(); //Alert diyaloğunun gösterilmesi

                ekstraJ.setSelected(false);
            } else {
                int miktar = Integer.parseInt(gurAdet.getText());
                gur.fiyatBelirle(5, 3, 3, 2);
                System.out.println(gur.getPizzaAdi() + " " + gur.getPizzaBoyu() + " " + gur.getPizzaFiyat());
                hesap.setText(String.valueOf(adisyon.ucret(gur.getPizzaFiyat(), miktar)));
                secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + gur.getPizzaAdi() + " " + gur.getPizzaBoyu(), miktar)));
            }
        }
    }

    //Kampanya
    @FXML
    public void k1(MouseEvent event) {
        if (kamAdet.getText().equals("") || kamAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(kamAdet.getText());
            kamp.fiyatBelirle(0, 0, 0);
            System.out.println(kamp.getKampanyaAdi()+ " " + kamp.getKampanyaFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(kamp.getKampanyaFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + kamp.getKampanyaAdi(), miktar)));
        }
    }
    
    @FXML
    public void k2(MouseEvent event) {
        if (kamAdet.getText().equals("") || kamAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(kamAdet.getText());
            kamp.fiyatBelirle(1, 1, 0);
            System.out.println(kamp.getKampanyaAdi()+ " " + kamp.getKampanyaFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(kamp.getKampanyaFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + kamp.getKampanyaAdi(), miktar)));
        }
    }
    
    @FXML
    public void k3(MouseEvent event) {
        if (kamAdet.getText().equals("") || kamAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(kamAdet.getText());
            kamp.fiyatBelirle(2, 2, 0);
            System.out.println(kamp.getKampanyaAdi()+ " " + kamp.getKampanyaFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(kamp.getKampanyaFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + kamp.getKampanyaAdi(), miktar)));
        }
    }
    
    @FXML
    public void k4(MouseEvent event) {
        if (kamAdet.getText().equals("") || kamAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(kamAdet.getText());
            kamp.fiyatBelirle(3, 3, 0);
            System.out.println(kamp.getKampanyaAdi()+ " " + kamp.getKampanyaFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(kamp.getKampanyaFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + kamp.getKampanyaAdi(), miktar)));
        }
    }

    @FXML
    public void k5(MouseEvent event) {
        if (kamAdet.getText().equals("") || kamAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(kamAdet.getText());
            kamp.fiyatBelirle(4, 4, 0);
            System.out.println(kamp.getKampanyaAdi()+ " " + kamp.getKampanyaFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(kamp.getKampanyaFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + kamp.getKampanyaAdi(), miktar)));
        }
    }
    
    @FXML
    public void k6(MouseEvent event) {
        if (kamAdet.getText().equals("") || kamAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(kamAdet.getText());
            kamp.fiyatBelirle(5, 5, 0);
            System.out.println(kamp.getKampanyaAdi()+ " " + kamp.getKampanyaFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(kamp.getKampanyaFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + kamp.getKampanyaAdi(), miktar)));
        }
    }
    
    //Kızartmalar
    @FXML
    public void ParmakPatates(MouseEvent event) {
        if (patAdet.getText().equals("") || patAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(patAdet.getText());
            pd.fiyatBelirle(0, 0, 0);
            System.out.println(pd.getParmakDilimAdi() + " " + pd.getParmakDilimFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(pd.getParmakDilimFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + pd.getParmakDilimAdi(), miktar)));
        }
    }

    @FXML
    public void ElmaPatates(MouseEvent event) {
        if (patAdet.getText().equals("") || patAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(patAdet.getText());
            ed.fiyatBelirle(0, 0, 1);
            System.out.println(ed.getElmaDilimiAdi() + " " + ed.getElmaDilimiFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(ed.getElmaDilimiFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + ed.getElmaDilimiAdi(), miktar)));
        }
    }

    @FXML
    public void Kova(MouseEvent event) {
        if (patAdet.getText().equals("") || patAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(patAdet.getText());
            ck.fiyatBelirle(0, 0, 2);
            System.out.println(ck.getCitirKovaAdi() + " " + ck.getCitirKovaFiyati());
            hesap.setText(String.valueOf(adisyon.ucret(ck.getCitirKovaFiyati(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + ck.getCitirKovaAdi(), miktar)));
        }
    }

    @FXML
    public void Nugget(MouseEvent event) {
        if (nugAdet.getText().equals("") || nugAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(nugAdet.getText());
            ng.fiyatBelirle(0, 0, 3);
            System.out.println(ng.getNuggetAdi() + " " + ng.getNuggetFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(ng.getNuggetFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + ng.getNuggetAdi(), miktar)));
        }
    }

    @FXML
    public void SoganHalkasi(MouseEvent event) {
        if (sogAdet.getText().equals("") || sogAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(sogAdet.getText());
            sh.fiyatBelirle(0, 0, 4);
            System.out.println(sh.getSoganHalkasiAdi() + " " + sh.getSoganHalkasiFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(sh.getSoganHalkasiFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + sh.getSoganHalkasiAdi(), miktar)));
        }
    }

    @FXML
    public void HotChicks(MouseEvent event) {
        if (kanAdet.getText().equals("") || kanAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(sogAdet.getText());
            sk.fiyatBelirle(0, 0, 5);
            System.out.println(sk.getSosluKanatAdi() + " " + sk.getSosluKanatFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(sk.getSosluKanatFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + sk.getSosluKanatAdi(), miktar)));
        }
    }

    @FXML
    public void TavukKanat(MouseEvent event) {
        if (kanAdet.getText().equals("") || kanAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(sogAdet.getText());
            sk.fiyatBelirle(1, 0, 5);
            System.out.println(sk.getSosluKanatAdi() + " " + sk.getSosluKanatFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(sk.getSosluKanatFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + sk.getSosluKanatAdi(), miktar)));
        }
    }

    //İçecekler
    @FXML
    public void cc330(MouseEvent event) {
        if (kolAdet.getText().equals("") || kolAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(kolAdet.getText());
            kola.fiyatBelirle(0, 0, 0, 0);
            System.out.println(kola.getKolaAdi() + " " + kola.getKolaTuru() + " " + kola.getKolaLitresi() + " " + kola.getKolaFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(kola.getKolaFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + kola.getKolaAdi() + " " + kola.getKolaTuru() + " " + kola.getKolaLitresi(), miktar)));
        }
    }

    @FXML
    public void cc330z(MouseEvent event) {
        if (kolAdet.getText().equals("") || kolAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(kolAdet.getText());
            kola.fiyatBelirle(1, 2, 2, 0);
            System.out.println(kola.getKolaAdi() + " " + kola.getKolaTuru() + " " + kola.getKolaLitresi() + " " + kola.getKolaFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(kola.getKolaFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + kola.getKolaAdi() + " " + kola.getKolaTuru() + " " + kola.getKolaLitresi(), miktar)));
        }
    }

    @FXML
    public void cc1(MouseEvent event) {
        if (kolAdet.getText().equals("") || kolAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(kolAdet.getText());
            kola.fiyatBelirle(0, 1, 1, 0);
            System.out.println(kola.getKolaAdi() + " " + kola.getKolaTuru() + " " + kola.getKolaLitresi() + " " + kola.getKolaFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(kola.getKolaFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + kola.getKolaAdi() + " " + kola.getKolaTuru() + " " + kola.getKolaLitresi(), miktar)));
        }
    }

    @FXML
    public void cc1z(MouseEvent event) {
        if (kolAdet.getText().equals("") || kolAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(kolAdet.getText());
            kola.fiyatBelirle(1, 3, 3, 0);
            System.out.println(kola.getKolaAdi() + " " + kola.getKolaTuru() + " " + kola.getKolaLitresi() + " " + kola.getKolaFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(kola.getKolaFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + kola.getKolaAdi() + " " + kola.getKolaTuru() + " " + kola.getKolaLitresi(), miktar)));
        }
    }

    @FXML
    public void f330(MouseEvent event) {
        if (fanAdet.getText().equals("") || fanAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(fanAdet.getText());
            fnt.fiyatBelirle(0, 0, 1);
            System.out.println(fnt.getFantaAdi() + " " + fnt.getFantaLitresi() + " " + fnt.getFantaFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(fnt.getFantaFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + fnt.getFantaAdi() + " " + fnt.getFantaLitresi(), miktar)));
        }
    }

    @FXML
    public void f1(MouseEvent event) {
        if (fanAdet.getText().equals("") || fanAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(fanAdet.getText());
            fnt.fiyatBelirle(1, 1, 1);
            System.out.println(fnt.getFantaAdi() + " " + fnt.getFantaLitresi() + " " + fnt.getFantaFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(fnt.getFantaFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + fnt.getFantaAdi() + " " + fnt.getFantaLitresi(), miktar)));
        }
    }

    @FXML
    public void a500(MouseEvent event) {
        if (ayAdet.getText().equals("") || ayAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(ayAdet.getText());
            ayr.fiyatBelirle(0, 0, 2);
            System.out.println(ayr.getAyranAdi() + " " + ayr.getAyranLitresi() + ayr.getAyranFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(ayr.getAyranFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + ayr.getAyranAdi() + " " + ayr.getAyranLitresi(), miktar)));
        }
    }

    @FXML
    public void a1(MouseEvent event) {
        if (ayAdet.getText().equals("") || ayAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(ayAdet.getText());
            ayr.fiyatBelirle(1, 1, 2);
            System.out.println(ayr.getAyranAdi() + " " + ayr.getAyranLitresi() + ayr.getAyranFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(ayr.getAyranFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + ayr.getAyranAdi() + " " + ayr.getAyranLitresi(), miktar)));
        }
    }

    @FXML
    public void Cay(MouseEvent event) {
        if (cayAdet.getText().equals("") || cayAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(cayAdet.getText());
            cay.fiyatBelirle(3);
            System.out.println(cay.getCayAdi() + " " + cay.getCayFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(cay.getCayFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + cay.getCayAdi(), miktar)));
        }
    }

    @FXML
    public void su500(MouseEvent event) {
        if (suAdet.getText().equals("") || suAdet.getText().equals("0")) {
            hata.setTitle("Dikkat");//Alert e başlık verilmesi
            hata.setHeight(200); //Alert in genişlik ve yüksekliğinin belirlenmesi
            hata.setWidth(200);
            hata.setHeaderText("Adet Seçilmedi!"); //Başlık yazısının ayaralanması
            hata.setContentText("Lütfen Adet Seçiniz."); //İçerik yazısının ayarlanması
            hata.showAndWait(); //Alert diyaloğunun gösterilmesi
        } else {
            int miktar = Integer.parseInt(suAdet.getText());
            su.fiyatBelirle(0, 0, 4);
            System.out.println(su.getSuAdi() + " " + su.getSuLitresi() + su.getSuFiyat());
            hesap.setText(String.valueOf(adisyon.ucret(su.getSuFiyat(), miktar)));
            secim.setText(String.valueOf(adisyon.secimAdi(secim.getText() + su.getSuAdi() + " " + su.getSuLitresi(), miktar)));
        }
    }
    
    //Sıfırla Butonu
    @FXML
    public void Sifirla(ActionEvent event) {
        double sifir = 0.0;
        String bos = null;
        hesap.setText(String.valueOf(adisyon.iptal(sifir)));
        secim.setText(String.valueOf(adisyon.iptal(bos)));
        hesap.clear();
        secim.clear();
        System.out.println("Seçimler temizlendi.");

        //Adet Sıfırla
        //Pizza
        klasikAdet.clear();
        vejAdet.clear();
        gurAdet.clear();
        kamAdet.clear();
        //Kızartma
        patAdet.clear();
        nugAdet.clear();
        sogAdet.clear();
        kanAdet.clear();
        //İçecek
        kolAdet.clear();
        fanAdet.clear();
        ayAdet.clear();
        cayAdet.clear();
        suAdet.clear();

        //RadioButton Sıfırla
        //Mezzaluna Sıfırla
        mezzalunaK.setSelected(false);
        mezzalunaO.setSelected(false);
        mezzalunaB.setSelected(false);
        mezzalunaJ.setSelected(false);
        //5 Malzemeli Sıfırla
        malzemeliK.setSelected(false);
        malzemeliO.setSelected(false);
        malzemeliB.setSelected(false);
        malzemeliJ.setSelected(false);
        //Süper Sıfırla
        superK.setSelected(false);
        superO.setSelected(false);
        superB.setSelected(false);
        superJ.setSelected(false);
        //Mexico Sıfırla
        mexicoK.setSelected(false);
        mexicoO.setSelected(false);
        mexicoB.setSelected(false);
        mexicoJ.setSelected(false);
        //Delux Sıfırla
        deluxK.setSelected(false);
        deluxO.setSelected(false);
        deluxB.setSelected(false);
        deluxJ.setSelected(false);
        //Ton Balıklı Sıfırla
        tonK.setSelected(false);
        tonO.setSelected(false);
        tonB.setSelected(false);
        tonJ.setSelected(false);
        //Margarita Sıfırla
        margaritaK.setSelected(false);
        margaritaO.setSelected(false);
        margaritaB.setSelected(false);
        margaritaJ.setSelected(false);
        //Vejeteryan Sıfırla
        vejeteryanK.setSelected(false);
        vejeteryanO.setSelected(false);
        vejeteryanB.setSelected(false);
        vejeteryanJ.setSelected(false);
        //Peynirli Sıfırla
        peynirliK.setSelected(false);
        peynirliO.setSelected(false);
        peynirliB.setSelected(false);
        peynirliJ.setSelected(false);
        //Fiesta Sıfırla
        fiestaK.setSelected(false);
        fiestaO.setSelected(false);
        fiestaB.setSelected(false);
        fiestaJ.setSelected(false);
        //Kavurmalı Sıfırla
        kavurmaliK.setSelected(false);
        kavurmaliO.setSelected(false);
        kavurmaliB.setSelected(false);
        kavurmaliJ.setSelected(false);
        //Pastırmalı Sıfırla
        pastirmaliK.setSelected(false);
        pastirmaliO.setSelected(false);
        pastirmaliB.setSelected(false);
        pastirmaliJ.setSelected(false);
        //Kaburgali Sıfırla
        kaburgaliK.setSelected(false);
        kaburgaliO.setSelected(false);
        kaburgaliB.setSelected(false);
        kaburgaliJ.setSelected(false);
        //tavuklu Sıfırla
        tavukluK.setSelected(false);
        tavukluO.setSelected(false);
        tavukluB.setSelected(false);
        tavukluJ.setSelected(false);
        //Anadolu Ateşi Sıfırla
        anadoluK.setSelected(false);
        anadoluO.setSelected(false);
        anadoluB.setSelected(false);
        anadoluJ.setSelected(false);
        //Ekstra Ekstra Sıfırla
        ekstraK.setSelected(false);
        ekstraO.setSelected(false);
        ekstraB.setSelected(false);
        ekstraJ.setSelected(false);      
    }

    //Tamamla Butonu
    @FXML
    private void tamamlaButtonAction(ActionEvent event) throws IOException {
        System.out.println("Sipariş hazırlanıyor.");
        try {
            AnchorPane tamamla = FXMLLoader.load(getClass().getResource("/FXML/Onay.fxml"));
            ap.getChildren().setAll(tamamla);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        Kayit kayit = new Kayit(masaNo.getMasaNo(), secim.getText(), hesap.getText());
        System.out.println(kayit.getMasaNo());
        kayitDao = new KayitDao();
        kayitDao.Kaydet(kayit);
    }

    private void kayitListesi() {
        ArrayList<Kayit> kayitListesi = kayitDao.ListeGetir();

        ObservableList<Kayit> data = tableView.getItems();
        data.removeAll(data);
        //data.clear();
        for (Kayit kayit : kayitListesi) {
            data.add(kayit);
        }
        TableColumn firstNameCol = new TableColumn("secim");
        firstNameCol.setMinWidth(400);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<Kayit, String>("secim"));

        TableColumn lastNameCol = new TableColumn("hesap");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<Kayit, String>("hesap"));

        TableColumn masaCol = new TableColumn("masaNo");
        masaCol.setMinWidth(100);
        masaCol.setCellValueFactory(
                new PropertyValueFactory<Kayit, String>("masaNo"));

        tableView.setItems(data);
        tableView.getColumns().addAll(masaCol, firstNameCol, lastNameCol);
    }

    void KayitSil(Kayit kayit) {
        kayitDao.Sil(kayit);
        kayitListesi();
    }

    private void EditButtonAdd() {
        TableColumn actionCol = new TableColumn("Düzenle");
        actionCol.setCellValueFactory(new PropertyValueFactory<>("DUMMY"));

        Callback<TableColumn<Kayit, String>, TableCell<Kayit, String>> cellFactory
                = //
                new Callback<TableColumn<Kayit, String>, TableCell<Kayit, String>>() {
            @Override
            public TableCell call(final TableColumn<Kayit, String> param) {
                final TableCell<Kayit, String> cell = new TableCell<Kayit, String>() {
                    final Button btnedit = new Button("Düzenle");

                    @Override
                    public void updateItem(String item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                            setText(null);
                        } else {
                            btnedit.setOnAction(event -> {
                                Kayit kayit = getTableView().getItems().get(getIndex());
                                KayitSil(kayit);

                                secim.setText(kayit.getSecim());
                                hesap.setText(kayit.getHesap());
                            });
                            setGraphic(btnedit);
                            setText(null);
                        }
                    }
                };
                return cell;
            }
        };
        actionCol.setCellFactory(cellFactory);
        tableView.getColumns().add(actionCol);
    }

    private void DeleteButtonAdd() {
        TableColumn actionCol = new TableColumn("Sil");
        actionCol.setCellValueFactory(new PropertyValueFactory<>("DUMMY"));

        Callback<TableColumn<Kayit, String>, TableCell<Kayit, String>> cellFactory
                = //
                new Callback<TableColumn<Kayit, String>, TableCell<Kayit, String>>() {
            @Override
            public TableCell call(final TableColumn<Kayit, String> param) {
                final TableCell<Kayit, String> cell = new TableCell<Kayit, String>() {

                    final Button btn = new Button("Sil");

                    @Override
                    public void updateItem(String item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                            setText(null);
                        } else {
                            btn.setOnAction(event -> {
                                Kayit kayit = getTableView().getItems().get(getIndex());
                                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Silmek İstediginize Emin misiniz? Seçim : " + kayit.getSecim() + " ?",
                                        ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
                                alert.showAndWait();
                                if (alert.getResult() == ButtonType.YES) {
                                    KayitSil(kayit);
                                }
                            });
                            setGraphic(btn);

                            setText(null);
                        }
                    }
                };
                return cell;
            }
        };

        actionCol.setCellFactory(cellFactory);
        tableView.getColumns().add(actionCol);
    }

    //Geri Butonu
    @FXML
    private void geriButtonAction(ActionEvent event) {
        System.out.println("Ana Sayfaya yönlendiriliyorsunuz.");
        try {
            AnchorPane geri = FXMLLoader.load(getClass().getResource("/FXML/Home.fxml"));
            ap.getChildren().setAll(geri);
        } catch (Exception e) {
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
