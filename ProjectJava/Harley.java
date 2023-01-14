package org.example.ProjectJava;

public class Harley extends  Motor {
    int weight;
    double getSalesPrice() {
        if (weight >= 2000) {
            regulerPrice = (int) (regulerPrice - (0.1*regulerPrice));
            System.out.println("Selamat, anda mendapat diskon 10%");
        }
    else {
            regulerPrice = (int) (regulerPrice - (0.2*regulerPrice));
            System.out.println("Selamat, anda mendapatkan discount 20%");
        }
        return regulerPrice;
    }

}
