package org.oop2;

import java.util.Random;

public class Smartphone extends Prodotto{
    private int codeIme;
    private String memoryQuantity;

    public Smartphone(String name, String description, String price, String iva,String memoryQuantity, int codeIme ) {
        super(name, description, price, iva);
        this.memoryQuantity=memoryQuantity;
        this.codeIme=codeIme;
    }

}
