package org.oop2;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {


   protected String name;
   protected String description;
   protected BigDecimal  price ;
   protected BigDecimal iva ;
   protected String code;
   protected BigDecimal  pricewithiva ;

    /* Costruttore*/
    public Prodotto(String name, String description, String price, String iva){
        this.name=name;
        this.description=description;
        this.price=new BigDecimal(price);
        this.iva= new BigDecimal(iva);
        /*formatto una stringa a 6 numeri*/
        this.code=String.format("%06d", generateCode());;
        this.pricewithiva=generatetPriceWithIva();
    }

    /*metodo che genera il codice */
    public int generateCode(){
        Random random = new Random();
        int barcode=random.nextInt(1000000);
        return barcode;
    }

    /*metodo che imposta il prezzo con l'aggiuunta dell'iva*/
    private BigDecimal generatetPriceWithIva(){
        BigDecimal oneundred = new BigDecimal("100");
        BigDecimal added =(this.price.multiply(this.iva)).divide(oneundred, 2 , RoundingMode.HALF_UP);
        BigDecimal result=this.price.add(added);
        return result;
    }


    /*getter*/
    public String getCode(){
        return this.code;
    }

    public  String getNameComplete(){
        return (this.code+"-"+this.name);
    }

    public String getPriceWithIva(){
    return this.pricewithiva.toString();
    }

    public String getPrice(){
        return this.price.toString();
    }

/*setter*/
    public void setName(String name){
        this.name=name;
    }

}













