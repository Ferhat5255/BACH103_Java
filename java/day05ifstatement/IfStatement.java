package day05ifstatement;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {

        // Example 1 : Kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazan kodu yaziniz

        Scanner input =  new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");

        int s = input.nextInt();

        // 1. yol :
        if (s%2 ==0){
            System.out.println("Cift sayi...");
        }
        if (s%2 !=0) {
            System.out.println("Tek sayi...");

            // 2.Yol:
            if (s%2 ==0){
                System.out.println("Cift sayi...");
            } else {
                System.out.println("Tek sayi...");
            }



        }


        //Example 2: bir sayinin negatif, pozitive veya notr oldugunu soyleyen kodu yaziniz

        System.out.println("Bir sayi giriniz...");

        double d = input.nextDouble();

        if (d>0){
            System.out.println("pozitive");

        } else if (d==0){
            System.out.println("Notr");
        } else{
            System.out.println("negatif");
        }
    }
}
