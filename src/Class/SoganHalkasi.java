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
public class SoganHalkasi extends Kizartma {

    Kizartma kizartma = new Kizartma();

    private String soganHalkasiAdi;
    private double soganHalkasiFiyat;

    public SoganHalkasi() {
    }
    
    @Override
    public void fiyatBelirle() {

    }

    public void fiyatBelirle(int ad, int fiyat, int cesit) {
        if (cesit == 4) {
            switch (ad) {
                case 0:
                    soganHalkasiAdi = "Soğan Halkası";
                    if (fiyat == 0) {
                        soganHalkasiFiyat = 5.95;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public SoganHalkasi(String soganHalkasiAdi, double soganHalkasiFiyat) {
        this.soganHalkasiAdi = soganHalkasiAdi;
        this.soganHalkasiFiyat = soganHalkasiFiyat;
    }

    public Kizartma getKizartma() {
        return kizartma;
    }

    public void setKizartma(Kizartma kizartma) {
        this.kizartma = kizartma;
    }

    public String getSoganHalkasiAdi() {
        return soganHalkasiAdi;
    }

    public void setSoganHalkasiAdi(String soganHalkasiAdi) {
        this.soganHalkasiAdi = soganHalkasiAdi;
    }

    public double getSoganHalkasiFiyat() {
        return soganHalkasiFiyat;
    }

    public void setSoganHalkasiFiyat(double soganHalkasiFiyat) {
        this.soganHalkasiFiyat = soganHalkasiFiyat;
    }

}
