package org.oop2;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        String name;
        String description;
        String price;
        String iva;

        Scanner in = new Scanner(System.in);
        System.out.print("Inserire il nome: ");
        name = in.nextLine();

        System.out.print("Inserire la descrizione ");
        description = in.nextLine();

        System.out.print("Inserire il prezzo: ");
        price = in.nextLine();

        System.out.print("Inserire l iva: ");
        iva = in.nextLine();



        Prodotto prodotto1= new Prodotto( name , description , price, iva);
        System.out.println("codice prodotto: "+prodotto1.getCode());
        System.out.println("nome completo: "+prodotto1.getNameComplete());
        System.out.println("prezzo con iva: "+prodotto1.getPriceWithIva());
        System.out.println("prezzo senza iva: "+prodotto1.getPrice());
    }
}

