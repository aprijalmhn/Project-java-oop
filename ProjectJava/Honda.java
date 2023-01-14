package org.example.ProjectJava;

public class Honda extends Motor {
    int year;
    int manufacturDiscount;

    double getSalesPrice() {
        regulerPrice = (int) (regulerPrice - (0.1*regulerPrice));
        return regulerPrice;
    }

}
