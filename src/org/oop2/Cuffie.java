package org.oop2;

public class Cuffie extends Prodotto{
    private boolean type;
    private String color;

    public Cuffie(String name, String description, String price, String iva, String color, boolean type) {
        super(name, description, price, iva);
        this.color=color;
        this.type=type;
    }
}
