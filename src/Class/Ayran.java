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
public class Ayran extends Icecek {

    Icecek icecek = new Icecek();

    private final String ayranAdi = "Ayran";
    private String ayranLitresi;
    private double ayranFiyat;

    public Ayran() {
    }
    
    @Override
    public void fiyatBelirle() {

    }

    public void fiyatBelirle(int litre, int fiyat, int cesit) {
        if (cesit == 2) {
            switch (litre) {
                case 0:
                    ayranLitresi = "500 cl";
                    if (fiyat == 0) {
                        ayranFiyat = 2.95;
                    }
                    break;
                case 1:
                    ayranLitresi = "1 Lt";
                    if (fiyat == 1) {
                        ayranFiyat = 6.95;
                    }
                    break;
                default:
                    break;
            }
        }

    }

    public String getAyranAdi() {
        return ayranAdi;
    }
    
    public Ayran(String ayranLitresi, double ayranFiyat) {
        this.ayranLitresi = ayranLitresi;
        this.ayranFiyat = ayranFiyat;
    }

    public Icecek getIcecek() {
        return icecek;
    }

    public void setIcecek(Icecek icecek) {
        this.icecek = icecek;
    }

    public String getAyranLitresi() {
        return ayranLitresi;
    }

    public void setAyranLitresi(String ayranLitresi) {
        this.ayranLitresi = ayranLitresi;
    }

    public double getAyranFiyat() {
        return ayranFiyat;
    }

    public void setAyranFiyat(double ayranFiyat) {
        this.ayranFiyat = ayranFiyat;
    }
    
    
}
