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
public class ParmakDilim extends Cips {

    Kizartma kizartma = new Kizartma();

    private String parmakDilimAdi;
    private double parmakDilimFiyat;

    public ParmakDilim() {
    }

    @Override
    public void fiyatBelirle() {

    }
    
    public void fiyatBelirle(int ad, int fiyat, int cesit) {
        if (cesit == 0) {
            switch (ad) {
                case 0:
                    parmakDilimAdi = "Parmak Dilim Patates";
                    if (fiyat == 0) {
                        parmakDilimFiyat = 8.95;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public ParmakDilim(String parmakDilimAdi, double parmakDilimFiyat) {
        this.parmakDilimAdi = parmakDilimAdi;
        this.parmakDilimFiyat = parmakDilimFiyat;
    }

    public Kizartma getKizartma() {
        return kizartma;
    }

    public void setKizartma(Kizartma kizartma) {
        this.kizartma = kizartma;
    }

    public String getParmakDilimAdi() {
        return parmakDilimAdi;
    }

    public void setParmakDilimAdi(String parmakDilimAdi) {
        this.parmakDilimAdi = parmakDilimAdi;
    }

    public double getParmakDilimFiyat() {
        return parmakDilimFiyat;
    }

    public void setParmakDilimFiyat(double parmakDilimFiyat) {
        this.parmakDilimFiyat = parmakDilimFiyat;
    }

    @Override
    void dilimle() {
        System.out.println("Elma dilimlenir.");
    }

}
