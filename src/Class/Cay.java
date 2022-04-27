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
public class Cay extends Icecek {

   Icecek icecek = new Icecek();

    private final String cayAdi = "Çay";
    private double cayFiyat;

    public Cay() {
    }

    @Override
    public void fiyatBelirle() {

    }
    
    public void fiyatBelirle(int cesit) {
        if (cesit == 3) {
            cayFiyat= 0;
        }
    }
    
    public Cay(double cayFiyat) {
        this.cayFiyat = cayFiyat;
    }

    public Icecek getIcecek() {
        return icecek;
    }

    public void setIcecek(Icecek icecek) {
        this.icecek = icecek;
    }

    public double getCayFiyat() {
        return cayFiyat;
    }

    public void setCayFiyat(double cayFiyat) {
        this.cayFiyat = cayFiyat;
    }

    public String getCayAdi() {
        return cayAdi;
    }
    
    

}
