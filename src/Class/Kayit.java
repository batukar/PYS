/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

import javafx.beans.property.StringProperty;
 */
package Class;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Batu
 */
public class Kayit {

    private String masaNo;
    private SimpleStringProperty secim;
    private SimpleStringProperty hesap;

    public Kayit() {
    }

    public String getMasaNo() {
        return masaNo;
    }

    public void setMasaNo(String masaNo) {
        this.masaNo = masaNo;
    }

    public String getSecim() {
        return secim.get();
    }

    public void setSecim(String secim) {
        this.secim = new SimpleStringProperty(secim);
    }

    public String getHesap() {
        return hesap.get();
    }

    public void setHesap(String hesap) {
        this.hesap = new SimpleStringProperty(hesap);
    }

    @SuppressWarnings("empty-statement")
    public Kayit(String masaNo, String secim, String hesap) {
        this.masaNo = masaNo ;
        this.secim = new SimpleStringProperty(secim);
        this.hesap = new SimpleStringProperty(hesap);
    }


}
