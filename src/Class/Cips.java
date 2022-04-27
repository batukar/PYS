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
abstract class Cips extends Kizartma {

    Kizartma kizartma = new Kizartma();

    abstract void dilimle();

    
    @Override
    public void fiyatBelirle() {

    }
    
    public Cips() {
    }

    public Kizartma getKizartma() {
        return kizartma;
    }

    public void setKizartma(Kizartma kizartma) {
        this.kizartma = kizartma;
    }

}
