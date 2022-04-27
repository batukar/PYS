/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Batu
 */
public class ElmaDilimi extends Cips {

    Kizartma kizartma = new Kizartma();

    private String elmaDilimiAdi;
    private double elmaDilimiFiyat;

    public ElmaDilimi() {
    }
    
    @Override
    public void fiyatBelirle() {

    }
    
    public void fiyatBelirle(int ad, int fiyat, int cesit) {
        if (cesit == 1) {
            switch (ad) {
                case 0:
                    elmaDilimiAdi = "Elma Dilimi Patates";
                    if (fiyat == 0) {
                        elmaDilimiFiyat = 8.95;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public double getElmaDilimiFiyat() {
        return elmaDilimiFiyat;
    }

    public void setElmaDilimiFiyat(double elmaDilimiFiyat) {
        this.elmaDilimiFiyat = elmaDilimiFiyat;
    }

    public String getElmaDilimiAdi() {
        return elmaDilimiAdi;
    }

    public void setElmaDilimiAdi(String elmaDilimiAdi) {
        this.elmaDilimiAdi = elmaDilimiAdi;
    }

    public ElmaDilimi(String elmaDilimiAdi, double elmaDilimiFiyat) {
        this.elmaDilimiAdi = elmaDilimiAdi;
        this.elmaDilimiFiyat = elmaDilimiFiyat;
    }

    @Override
    void dilimle() {
        System.out.println("Elma dilimlenir.");
    }

}
