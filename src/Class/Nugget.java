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
public class Nugget extends Kizartma {

    Kizartma kizartma = new Kizartma();

    private String nuggetAdi;
    private double nuggetFiyat;

    public Nugget() {
    }

    @Override
    public void fiyatBelirle() {

    }
    
    public void fiyatBelirle(int ad, int fiyat, int cesit) {
        if (cesit == 3) {
            switch (ad) {
                case 0:
                    nuggetAdi = "Nugget";
                    if (fiyat == 0) {
                        nuggetFiyat = 7.95;
                    }
            }
        }
    }

    public Nugget(String nuggetAdi, double nuggetFiyat) {
        this.nuggetAdi = nuggetAdi;
        this.nuggetFiyat = nuggetFiyat;
    }

    public Kizartma getKizartma() {
        return kizartma;
    }

    public void setKizartma(Kizartma kizartma) {
        this.kizartma = kizartma;
    }

    public String getNuggetAdi() {
        return nuggetAdi;
    }

    public void setNuggetAdi(String nuggetAdi) {
        this.nuggetAdi = nuggetAdi;
    }

    public double getNuggetFiyat() {
        return nuggetFiyat;
    }

    public void setNuggetFiyat(double nuggetFiyat) {
        this.nuggetFiyat = nuggetFiyat;
    }

}
