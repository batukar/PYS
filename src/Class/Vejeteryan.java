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
public class Vejeteryan extends Pizza {

    Pizza pizza = new Pizza();

    private String pizzaAdi;
    private String pizzaBoyu;
    private double pizzaFiyat;

    public Vejeteryan() {
    }
    
    @Override
    public void fiyatBelirle() {

    }

    public void fiyatBelirle(int ad, int boy, int fiyat, int cesit) {
        if (cesit == 1) {
            switch (ad) {
                case 0:
                    pizzaAdi = "Margarita";
                    if (boy == 0) {
                        pizzaBoyu = "Küçük";
                        if (fiyat == 0) {
                            pizzaFiyat = 24.95;
                        }
                    } else if (boy == 1) {
                        pizzaBoyu = "Orta";
                        if (fiyat == 1) {
                            pizzaFiyat = 27.95;
                        }
                    } else if (boy == 2) {
                        pizzaBoyu = "Büyük";
                        if (fiyat == 2) {
                            pizzaFiyat = 30.95;
                        }
                    } else if (boy == 3) {
                        pizzaBoyu = "Jumbo";
                        if (fiyat == 3) {
                            pizzaFiyat = 33.95;
                        }
                    }
                    break;
                case 1:
                    pizzaAdi = "Fiesta";
                    if (boy == 0) {
                        pizzaBoyu = "Küçük";
                        if (fiyat == 0) {
                            pizzaFiyat = 24.95;
                        }
                    } else if (boy == 1) {
                        pizzaBoyu = "Orta";
                        if (fiyat == 1) {
                            pizzaFiyat = 27.95;
                        }
                    } else if (boy == 2) {
                        pizzaBoyu = "Büyük";
                        if (fiyat == 2) {
                            pizzaFiyat = 30.95;
                        }
                    } else if (boy == 3) {
                        pizzaBoyu = "Jumbo";
                        if (fiyat == 3) {
                            pizzaFiyat = 33.95;
                        }
                    }
                    break;
                case 2:
                    pizzaAdi = "Vejeteryan";
                    if (boy == 0) {
                        pizzaBoyu = "Küçük";
                        if (fiyat == 0) {
                            pizzaFiyat = 24.95;
                        }
                    } else if (boy == 1) {
                        pizzaBoyu = "Orta";
                        if (fiyat == 1) {
                            pizzaFiyat = 27.95;
                        }
                    } else if (boy == 2) {
                        pizzaBoyu = "Büyük";
                        if (fiyat == 2) {
                            pizzaFiyat = 30.95;
                        }
                    } else if (boy == 3) {
                        pizzaBoyu = "Jumbo";
                        if (fiyat == 3) {
                            pizzaFiyat = 33.95;
                        }
                    }
                    break;
                case 3:
                    pizzaAdi = "4 Peynirli";
                    if (boy == 0) {
                        pizzaBoyu = "Küçük";
                        if (fiyat == 0) {
                            pizzaFiyat = 24.95;
                        }
                    } else if (boy == 1) {
                        pizzaBoyu = "Orta";
                        if (fiyat == 1) {
                            pizzaFiyat = 27.95;
                        }
                    } else if (boy == 2) {
                        pizzaBoyu = "Büyük";
                        if (fiyat == 2) {
                            pizzaFiyat = 30.95;
                        }
                    } else if (boy == 3) {
                        pizzaBoyu = "Jumbo";
                        if (fiyat == 3) {
                            pizzaFiyat = 33.95;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
    
    public Vejeteryan(String pizzaAdi, String pizzaBoyu, double pizzaFiyat) {
        this.pizzaAdi = pizzaAdi;
        this.pizzaBoyu = pizzaBoyu;
        this.pizzaFiyat = pizzaFiyat;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getPizzaAdi() {
        return pizzaAdi;
    }

    public void setPizzaAdi(String pizzaAdi) {
        this.pizzaAdi = pizzaAdi;
    }

    public String getPizzaBoyu() {
        return pizzaBoyu;
    }

    public void setPizzaBoyu(String pizzaBoyu) {
        this.pizzaBoyu = pizzaBoyu;
    }

    public double getPizzaFiyat() {
        return pizzaFiyat;
    }

    public void setPizzaFiyat(double pizzaFiyat) {
        this.pizzaFiyat = pizzaFiyat;
    }

}
