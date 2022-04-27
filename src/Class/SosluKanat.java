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
public class SosluKanat extends Kizartma {

    Kizartma kizartma = new Kizartma();

    private String sosluKanatAdi;
    private double sosluKanatFiyat;

    public SosluKanat() {
    }
    
    @Override
    public void fiyatBelirle() {

    }

    public void fiyatBelirle(int ad, int fiyat, int cesit) {
        if (cesit == 5) {
            switch (ad) {
                case 0:
                    sosluKanatAdi = "4'lü Hot Chicks";
                    if (fiyat == 0) {
                        sosluKanatFiyat = 6.95;
                    }
                    break;
                case 1:
                    sosluKanatAdi = "4'lü Fırında Tavuk Kanat";
                    if (fiyat == 0) {
                        sosluKanatFiyat = 7.95;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public SosluKanat(String sosluKanatAdi, double sosluKanatFiyat) {
        this.sosluKanatAdi = sosluKanatAdi;
        this.sosluKanatFiyat = sosluKanatFiyat;
    }

    public Kizartma getKizartma() {
        return kizartma;
    }

    public void setKizartma(Kizartma kizartma) {
        this.kizartma = kizartma;
    }

    public String getSosluKanatAdi() {
        return sosluKanatAdi;
    }

    public void setSosluKanatAdi(String sosluKanatAdi) {
        this.sosluKanatAdi = sosluKanatAdi;
    }

    public double getSosluKanatFiyat() {
        return sosluKanatFiyat;
    }

    public void setSosluKanatFiyat(double sosluKanatFiyat) {
        this.sosluKanatFiyat = sosluKanatFiyat;
    }

}
