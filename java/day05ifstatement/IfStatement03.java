package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        /* Iki tane String'in birbirine esit olup olmadigini anlamak icin "==" degil, "equals()" kullaniniz

        Iki tane String 'in birbirine esit olup olmadigini kntrol etmek icin iki tane method kullanilabilir
        i) equals() ==> Buyuk harf ve kucuk harfi onemser. "A" ile "a" farklidir
        ii) equalsIgnoreCase()  ==>Büyük harf küçük harfi önemsemez. "A" ile "a" aynıdır.

         */

        // Example 1: Kullanicidan gun isimlerini aliniz, o gunu hafta sonu mu hafta ici mi olduguna kullaniciya soyleyiniz
        // Pazartesi ==> hafta ici   Cumartesi ==>hafta sonu

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gun ismi girininiz...");
        String gun = input.next();

        if (gun.equalsIgnoreCase("Pazar")) {
            System.out.println("Hafta Sonu...");
        } else if (gun.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Hafta ici...");

        } else if (gun.equalsIgnoreCase("Sali")) {
            System.out.println("Hafta ici...");
        } else if (gun.equalsIgnoreCase("Carsamba")) {
            System.out.println("Hafta ici...");
        }else if (gun.equalsIgnoreCase("Persembe")) {
            System.out.println("Hafta ici...");}
        else if (gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici...");}
        else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");}
        else {
            System.out.println("Gecerli bir gun ismi giriniz...");
        }

        // 2. Yol:

        if (gun.equalsIgnoreCase("pazar")  || gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");
        }else if (gun.equalsIgnoreCase("Pazartesi") ||
                   gun.equalsIgnoreCase("Sali")||
                    gun.equalsIgnoreCase("Carsamba")||
                   gun.equalsIgnoreCase("Persembe")||
                     gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta ici...");
        }else {
            System.out.println("Gecerli bir gun ismi giriniz...");

            }

        //3.yol

        boolean  haftaSonu = gun.equalsIgnoreCase("pazar")  || gun.equalsIgnoreCase("Cumartesi");

               boolean haftaIci = gun.equalsIgnoreCase("Pazartesi") ||
                                  gun.equalsIgnoreCase("Sali")||
                                  gun.equalsIgnoreCase("Carsamba")||
                                  gun.equalsIgnoreCase("Persembe")||
                                  gun.equalsIgnoreCase("Cuma");
        if(haftaSonu) {
            System.out.println("Hafta sonu...");
        }else if (haftaIci) {

            System.out.println("Hafta ici...");
        }else {
            System.out.println("Gecerli bir gun ismi giriniz...");

        }
    }
}
