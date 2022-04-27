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
public class Kampanya extends Pizza {

    Pizza pizza = new Pizza();

    private String kampanyaAdi;
    private double kampanyaFiyat;

    public Kampanya() {

    }

    @Override
    public void fiyatBelirle() {

    }

    public void fiyatBelirle(int ad, int fiyat, int cesit) {
        if (cesit == 0) {
            switch (ad) {
                case 0:
                    kampanyaAdi = "Orta Klasik Menü";
                    if (fiyat == 0) {
                        kampanyaFiyat = 31.95;
                    }
                    break;
                case 1:
                    kampanyaAdi = "Orta Gurme Menü";
                    if (fiyat == 1) {
                        kampanyaFiyat = 35.95;
                    }
                    break;
                case 2:
                    kampanyaAdi = "2 Orta Boy Klasik Pizza";
                    if (fiyat == 2) {
                        kampanyaFiyat = 39.95;
                    }
                    break;
                case 3:
                    kampanyaAdi = "2 Orta Boy Gurme Pizza";
                    if (fiyat == 3) {
                        kampanyaFiyat = 41.95;
                    }
                    break;
                case 4:
                    kampanyaAdi = "3 Orta Boy Klasik Pizza";
                    if (fiyat == 4) {
                        kampanyaFiyat = 50.95;
                    }
                    break;
                case 5:
                    kampanyaAdi = "10 Numara";
                    if (fiyat == 5) {
                        kampanyaFiyat = 79.95;
                    }
                    break;
            }
        }
    }

    public Kampanya(String kampanyaAdi, double kampanyaFiyat) {
        this.kampanyaAdi = kampanyaAdi;
        this.kampanyaFiyat = kampanyaFiyat;
    }

    public String getKampanyaAdi() {
        return kampanyaAdi;
    }

    public void setKampanyaAdi(String kampanyaAdi) {
        this.kampanyaAdi = kampanyaAdi;
    }

    public double getKampanyaFiyat() {
        return kampanyaFiyat;
    }

    public void setKampanyaFiyat(double kampanyaFiyat) {
        this.kampanyaFiyat = kampanyaFiyat;
    }

}
