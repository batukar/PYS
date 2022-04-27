package DAO;

import Class.Kayit;
import DosyaIslemleri.DosyaYazma;

import java.util.ArrayList;

public class KayitDao {

    DosyaYazma dosyaYazma;

    public KayitDao() {
        dosyaYazma = new DosyaYazma();
    }

    public boolean Kaydet(Kayit kayit) {
        dosyaYazma.SatirlaraEkle(kayit.getMasaNo()+ "@" 
                                + kayit.getSecim() + "@"
                                + kayit.getHesap() + "#" 
               );

        return true;
    }

    public ArrayList<Kayit> ListeGetir() {
        ArrayList<Kayit> kayitListesi = new ArrayList<>();

        String kayitDosyaStr = dosyaYazma.TumSatirlariGetir();
        if (kayitDosyaStr.length() == 1 || kayitDosyaStr.length() == 0) {
            return kayitListesi;
        }
        String[] kayitlarStr = kayitDosyaStr.split("#");
        for (String kayitDStr : kayitlarStr) {
            String[] kayitStr = kayitDStr.split("@");

            //Kayit kayit = new Kayit(kayitStr[0], kayitStr[1]);
            kayitListesi.add(new Kayit(kayitStr[0],kayitStr[1], kayitStr[2]));
        }

        return kayitListesi;

    }

    public void Sil(Kayit kayit) {

        ArrayList<Kayit> kayitListesi = this.ListeGetir();
      
        kayitListesi.removeIf(x -> (x.getHesap() == null ? kayit.getHesap() != null : x.getHesap().equals(kayit.getHesap())));

        
        dosyaYazma.SatirlariSil();

        for (Kayit fkayit : kayitListesi) {
            this.Kaydet(fkayit);
        }

    }

}
