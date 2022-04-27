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
public class CitirKova extends Cips {

    Kizartma kizartma = new Kizartma();

    private String citirKovaAdi;
    private double citirKovaFiyati;

    public CitirKova() {
    }
    
    @Override
    public void fiyatBelirle() {

    }

    public void fiyatBelirle(int ad, int fiyat, int cesit) {
        if (cesit == 2) {
            switch (ad) {
                case 0:
                    citirKovaAdi = "Çıtır Kova";
                    if (fiyat == 0) {
                        citirKovaFiyati = 20.95;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public CitirKova(String citirKovaAdi, double citirKovaFiyati) {
        this.citirKovaAdi = citirKovaAdi;
        this.citirKovaFiyati = citirKovaFiyati;
    }

    public Kizartma getKizartma() {
        return kizartma;
    }

    public void setKizartma(Kizartma kizartma) {
        this.kizartma = kizartma;
    }

    public String getCitirKovaAdi() {
        return citirKovaAdi;
    }

    public void setCitirKovaAdi(String citirKovaAdi) {
        this.citirKovaAdi = citirKovaAdi;
    }

    public double getCitirKovaFiyati() {
        return citirKovaFiyati;
    }

    public void setCitirKovaFiyati(double citirKovaFiyati) {
        this.citirKovaFiyati = citirKovaFiyati;
    }

    @Override
    void dilimle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
