package org.example.ProjectJava;

public class Yamaha extends Motor{
    int cubicalCentimeter;

    double getSalesPrice() {
        if (cubicalCentimeter >= 250) {
            regulerPrice = (int) (regulerPrice - (0.15*regulerPrice));
            System.out.println("Selamat, anda mendapat diskon 15% karna membeli motor di atas 250cc");
        }
        else {
            regulerPrice = (int) (regulerPrice - (0.1*regulerPrice));
            System.out.println("Selamat, anda mendapatkan discount 10%");
        }
        return regulerPrice;
    }

}