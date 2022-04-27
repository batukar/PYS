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
public class Kola extends Icecek {

    Icecek icecek = new Icecek();

    private final String kolaAdi = "CocaCola";
    private String kolaTuru;
    private String kolaLitresi;
    private double kolaFiyat;

    public Kola() {
    }
    
    @Override
    public void fiyatBelirle() {

    }

    public void fiyatBelirle(int tur, int litre, int fiyat, int cesit) {
        if (cesit == 0) {
            switch (tur) {
                case 0:
                    kolaTuru = ""; //Normal kola
                    if (litre == 0) {
                        kolaLitresi = "330 cl";
                        if (fiyat == 0) {
                            kolaFiyat = 5.95;
                        }
                    } else if (litre == 1) {
                        kolaLitresi = "1 Lt";
                        if (fiyat == 1) {
                            kolaFiyat = 12.95;
                        }
                    }
                    break;
                case 1:
                    kolaTuru = "Zero";
                    if (litre == 2) {
                        kolaLitresi = "330 cl";
                        if (fiyat == 2) {
                            kolaFiyat = 5.95;
                        }
                    } else if (litre == 3) {
                        kolaLitresi = "1 Lt";
                        if (fiyat == 3) {
                            kolaFiyat = 12.95;
                        }
                    }
                    break;
                default:
                    break;
            }
        }

    }

    public Kola(String kolaTuru, String kolaLitresi, double kolaFiyat) {
        this.kolaTuru = kolaTuru;
        this.kolaLitresi = kolaLitresi;
        this.kolaFiyat = kolaFiyat;
    }

    public String getKolaTuru() {
        return kolaTuru;
    }

    public void setKolaTuru(String kolaTuru) {
        this.kolaTuru = kolaTuru;
    }

    public double getKolaFiyat() {
        return kolaFiyat;
    }

    public void setKolaFiyat(double kolaFiyat) {
        this.kolaFiyat = kolaFiyat;
    }

    public Icecek getIcecek() {
        return icecek;
    }

    public void setIcecek(Icecek icecek) {
        this.icecek = icecek;
    }

    public String getKolaAdi() {
        return kolaAdi;
    }

    public String getKolaLitresi() {
        return kolaLitresi;
    }

    public void setKolaLitresi(String kolaLitresi) {
        this.kolaLitresi = kolaLitresi;
    }

}
