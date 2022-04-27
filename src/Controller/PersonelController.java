/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Class.Kayit;
import DAO.KayitDao;
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
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
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
public class PersonelController implements Initializable {

    @FXML
    private AnchorPane ap;
    @FXML
    private Button geri;
    @FXML
    private MenuBar menuBar;
    @FXML
    private TabPane tpAdmin;
    @FXML
    private Tab tabAdmin;
    @FXML
    private AnchorPane apAdmin;
    @FXML
    private TableView<?> tvAdmin;
    @FXML
    private Button adminEkle;
    @FXML
    private Button adminSil;
    @FXML
    private Button adminGuncelle;
    @FXML
    private Tab tabSiparis;
    @FXML
    private AnchorPane apSiparis;
    @FXML
    private Button siparisGuncelle;
    @FXML
    private Button siparisSil;
    @FXML
    private TableView<Kayit> tableView;
    @FXML
    TableColumn<Kayit, String> cl_hesap;
    @FXML
    TableColumn<Kayit, String> cl_secim;
    @FXML
    private MenuItem kapat;
    @FXML
    private MenuItem hakkimizda;
    
    TextField adet = new TextField("1");
    Alert hata = new Alert(Alert.AlertType.WARNING);
    
    KayitDao kayitDao;

    @FXML
    private void geriClick(ActionEvent event) {
        try {
            AnchorPane geri = FXMLLoader.load(getClass().getResource("/FXML/Home.fxml"));
            ap.getChildren().setAll(geri);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private void kayitListesi() {
        ArrayList<Kayit> kayitListesi = kayitDao.ListeGetir();

        ObservableList<Kayit> data = tableView.getItems();
        data.removeAll(data);
        //data.clear();
        for (Kayit kayit : kayitListesi) {
            data.add(kayit);
        }
        
        TableColumn masaCol = new TableColumn("masaNo");
        masaCol.setMinWidth(100);
        masaCol.setCellValueFactory(
                new PropertyValueFactory<Kayit, String>("masaNo"));

        TableColumn firstNameCol = new TableColumn("secim");
        firstNameCol.setMinWidth(400);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<Kayit, String>("secim"));

        TableColumn lastNameCol = new TableColumn("hesap");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<Kayit, String>("hesap"));
        
        tableView.setItems(data);
        tableView.getColumns().addAll(masaCol, firstNameCol, lastNameCol);
    }

    void KayitSil(Kayit kayit) {
        kayitDao.Sil(kayit);

        kayitListesi();
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
                                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Bu seçimi: " + kayit.getSecim() + " Silmek İstediginize Emin misiniz?",
                                        ButtonType.YES, ButtonType.NO);
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
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        kayitDao = new KayitDao();

        kayitListesi();
        DeleteButtonAdd();

    }
}
