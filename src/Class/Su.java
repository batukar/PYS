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
public class Su extends Icecek {

    Icecek icecek = new Icecek();

    private final String suAdi = "Su";
    private String suLitresi;
    private double suFiyat;

    public Su() {
    }
    
    @Override
    public void fiyatBelirle() {

    }
    
    public void fiyatBelirle(int litre, int fiyat, int cesit) {
        if (cesit == 4) {
            switch(litre){
                case 0:
                    suLitresi="500 cl";
                    if(fiyat==0){
                        suFiyat= 0.95;
                    }break;
                default:
                    break;
            }
        }
    }

    public Su(String suLitresi, double suFiyat) {
        this.suLitresi = suLitresi;
        this.suFiyat = suFiyat;
    }

    public Icecek getIcecek() {
        return icecek;
    }

    public void setIcecek(Icecek icecek) {
        this.icecek = icecek;
    }

    public String getSuLitresi() {
        return suLitresi;
    }

    public void setSuLitresi(String suLitresi) {
        this.suLitresi = suLitresi;
    }

    public double getSuFiyat() {
        return suFiyat;
    }

    public void setSuFiyat(double suFiyat) {
        this.suFiyat = suFiyat;
    }

    public String getSuAdi() {
        return suAdi;
    }
    
    

}
