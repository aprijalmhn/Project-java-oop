package org.example.ProjectJava;

public class CilsyAutoShop {

    public static void main(String[] args) {
        Motor motorku = new Motor();
        Harley harley = new Harley();
        Honda honda = new Honda();
        Yamaha yamaha = new Yamaha();

        //class Motor (Tidak ada diskon)
        motorku.speed = 200;
        motorku.regulerPrice = 2500000;
        motorku.color = "Red";

        //class Harley (Diskon 10% jika weight => 2000)
        harley.weight = 2000;
        harley.regulerPrice = 3_500_000;

        //class Honda (Diskon 10%)
        honda.year = 2010;
        honda.manufacturDiscount = 10;
        honda.regulerPrice = 2500000;

        //class Yamaha (Diskon 15% jika CC => 250)
        yamaha.cubicalCentimeter = 250;
        yamaha.regulerPrice = 3000000;

        //Ouput Motor
            System.out.println();
            System.out.println("Kecepatan Motor: " + motorku.speed);
            System.out.println("Harga Normal Motor: " + motorku.regulerPrice);
            System.out.println("Warna Motor: " + motorku.color);

            System.out.println();
        //Ouptut Harley
            System.out.println("Berat Motor Harley : " + harley.weight);
            System.out.println("Harga Motor Harley : " + harley.getSalesPrice());

            System.out.println();
        //Output Honda
            System.out.println("Tahun Motor Honda : " + honda.year );
            System.out.println("Harga Motor Honda : " + honda.getSalesPrice());

            System.out.println();
        //Output Yamaha
            System.out.println("CC Motor Yamaha : " + yamaha.cubicalCentimeter);
            System.out.println("Harga Motor Yamaha : " + yamaha.getSalesPrice());
        }
    }
