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
public class Klasik extends Pizza {

    Pizza pizza = new Pizza();

    private String pizzaAdi;
    private String pizzaBoyu;
    private double pizzaFiyat;

    public Klasik() {
    }

    @Override
    public void fiyatBelirle() {

    }

    public void fiyatBelirle(int ad, int boy, int fiyat, int cesit) {
        if (cesit == 0) {
            switch (ad) {
                case 0:
                    pizzaAdi = "Mezzaluna";
                    if (boy == 0) {
                        pizzaBoyu = "Küçük";
                        if (fiyat == 0) {
                            pizzaFiyat = 28.95;
                        }
                    } else if (boy == 1) {
                        pizzaBoyu = "Orta";
                        if (fiyat == 1) {
                            pizzaFiyat = 31.95;
                        }
                    } else if (boy == 2) {
                        pizzaBoyu = "Büyük";
                        if (fiyat == 2) {
                            pizzaFiyat = 34.95;
                        }
                    } else if (boy == 3) {
                        pizzaBoyu = "Jumbo";
                        if (fiyat == 3) {
                            pizzaFiyat = 37.95;
                        }
                    }
                    break;
                case 1:
                    pizzaAdi = "5 Malzemeli";
                    if (boy == 0) {
                        pizzaBoyu = "Küçük";
                        if (fiyat == 0) {
                            pizzaFiyat = 28.95;
                        }
                    } else if (boy == 1) {
                        pizzaBoyu = "Orta";
                        if (fiyat == 1) {
                            pizzaFiyat = 31.95;
                        }
                    } else if (boy == 2) {
                        pizzaBoyu = "Büyük";
                        if (fiyat == 2) {
                            pizzaFiyat = 34.95;
                        }
                    } else if (boy == 3) {
                        pizzaBoyu = "Jumbo";
                        if (fiyat == 3) {
                            pizzaFiyat = 37.95;
                        }
                    }
                    break;
                case 2:
                    pizzaAdi = "Süper";
                    if (boy == 0) {
                        pizzaBoyu = "Küçük";
                        if (fiyat == 0) {
                            pizzaFiyat = 28.95;
                        }
                    } else if (boy == 1) {
                        pizzaBoyu = "Orta";
                        if (fiyat == 1) {
                            pizzaFiyat = 31.95;
                        }
                    } else if (boy == 2) {
                        pizzaBoyu = "Büyük";
                        if (fiyat == 2) {
                            pizzaFiyat = 34.95;
                        }
                    } else if (boy == 3) {
                        pizzaBoyu = "Jumbo";
                        if (fiyat == 3) {
                            pizzaFiyat = 37.95;
                        }
                    }
                    break;
                case 3:
                    pizzaAdi = "Mexico";
                    if (boy == 0) {
                        pizzaBoyu = "Küçük";
                        if (fiyat == 0) {
                            pizzaFiyat = 28.95;
                        }
                    } else if (boy == 1) {
                        pizzaBoyu = "Orta";
                        if (fiyat == 1) {
                            pizzaFiyat = 31.95;
                        }
                    } else if (boy == 2) {
                        pizzaBoyu = "Büyük";
                        if (fiyat == 2) {
                            pizzaFiyat = 34.95;
                        }
                    } else if (boy == 3) {
                        pizzaBoyu = "Jumbo";
                        if (fiyat == 3) {
                            pizzaFiyat = 37.95;
                        }
                    }
                    break;
                case 4:
                    pizzaAdi = "Delux";
                    if (boy == 0) {
                        pizzaBoyu = "Küçük";
                        if (fiyat == 0) {
                            pizzaFiyat = 28.95;
                        }
                    } else if (boy == 1) {
                        pizzaBoyu = "Orta";
                        if (fiyat == 1) {
                            pizzaFiyat = 31.95;
                        }
                    } else if (boy == 2) {
                        pizzaBoyu = "Büyük";
                        if (fiyat == 2) {
                            pizzaFiyat = 34.95;
                        }
                    } else if (boy == 3) {
                        pizzaBoyu = "Jumbo";
                        if (fiyat == 3) {
                            pizzaFiyat = 37.95;
                        }
                    }
                    break;
                case 5:
                    pizzaAdi = "Ton Balıklı";
                    if (boy == 0) {
                        pizzaBoyu = "Küçük";
                        if (fiyat == 0) {
                            pizzaFiyat = 28.95;
                        }
                    } else if (boy == 1) {
                        pizzaBoyu = "Orta";
                        if (fiyat == 1) {
                            pizzaFiyat = 31.95;
                        }
                    } else if (boy == 2) {
                        pizzaBoyu = "Büyük";
                        if (fiyat == 2) {
                            pizzaFiyat = 34.95;
                        }
                    } else if (boy == 3) {
                        pizzaBoyu = "Jumbo";
                        if (fiyat == 3) {
                            pizzaFiyat = 37.95;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public Klasik(String pizzaAdi, String pizzaBoyu, double pizzaFiyat) {
        this.pizzaAdi = pizzaAdi;
        this.pizzaBoyu = pizzaBoyu;
        this.pizzaFiyat = pizzaFiyat;
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
