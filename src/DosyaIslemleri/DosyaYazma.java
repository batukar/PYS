package DosyaIslemleri;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DosyaYazma {

    String directory = System.getProperty("user.dir");
    String fileName = "pizzadata.txt";
    String absolutePath = directory + File.separator + fileName;

    //Dosya Okuma
    public String TumSatirlariGetir() {
        String str = "";
        try {
            File file = new File(absolutePath);
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            fis.close();

            str = new String(data, "UTF-8");
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
        return str;
    }
    
    //Dosya yazma
    public void SatirlaraEkle(String content) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            fw = new FileWriter(absolutePath, true);
            bw = new BufferedWriter(fw);
            bw.write(content);

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null) {
                    bw.close();
                }

                if (fw != null) {
                    fw.close();
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
    }

    public void SatirlariSil() {
                FileWriter fwOb = null; 
        try {
            fwOb = new FileWriter(absolutePath, false);
            PrintWriter pwOb = new PrintWriter(fwOb, false);
            pwOb.flush();
            pwOb.close();
            fwOb.close();
        } catch (IOException ex) {
            Logger.getLogger(DosyaYazma.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fwOb.close();
            } catch (IOException ex) {
                Logger.getLogger(DosyaYazma.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
