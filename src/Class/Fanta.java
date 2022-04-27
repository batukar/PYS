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
public class Fanta extends Icecek {

    Icecek icecek = new Icecek();

    private final String fantaAdi = "Fanta";
    private String fantaLitresi;
    private double fantaFiyat;

    public Fanta() {
    }
    
    @Override
    public void fiyatBelirle() {

    }

    public void fiyatBelirle(int litre, int fiyat, int cesit) {
        if (cesit == 1) {
            switch (litre) {
                case 0:
                    fantaLitresi = "330 cl";
                    if (fiyat == 0) {
                        fantaFiyat = 5.95;
                    }
                    break;
                case 1:
                    fantaLitresi = "1 Lt";
                    if (fiyat == 1) {
                        fantaFiyat = 12.95;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public Fanta(String fantaLitresi, double fantaFiyat) {
        this.fantaLitresi = fantaLitresi;
        this.fantaFiyat = fantaFiyat;
    }

    public Icecek getIcecek() {
        return icecek;
    }

    public void setIcecek(Icecek icecek) {
        this.icecek = icecek;
    }

    public String getFantaLitresi() {
        return fantaLitresi;
    }

    public void setFantaLitresi(String fantaLitresi) {
        this.fantaLitresi = fantaLitresi;
    }

    public double getFantaFiyat() {
        return fantaFiyat;
    }

    public void setFantaFiyat(double fantaFiyat) {
        this.fantaFiyat = fantaFiyat;
    }

    public String getFantaAdi() {
        return fantaAdi;
    }

}
