package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {


        // Example 1: Kullanicidan bir sayi aliniz, sayi 100 den kucuk ise ekrana "Kazandin!" yazdiriniz
        //           Aksi halde "Kaybettin!" yazdiriniz
        //           Kullanici kazandikca oyun devam etmeli

        Scanner input = new Scanner(System.in);
//        int sayi=0;
//        do {
//            System.out.println("Bir sayi giriniz");
//            sayi = input.nextInt();
//
//            if (sayi <100) {
//                System.out.println("Kazandin!");
//            }
//        }while (sayi<100);
//        System.out.println("Kaybetiniz!");


        // Example 2: Kullanicidan isimler aliniz ilk harfinin buyuk olup olmadigini kontrol ediniz



        do {
            System.out.println("Lutfen isim giriniz...");
          char ilkHarf = input.next().charAt(0);
            if (ilkHarf >='A' && ilkHarf<= 'Z') {
                System.out.println("Ismi basariyla girdiniz");

            }else {
                System.out.println("Ismi yanlis girdiginiz icin isleminiz iptal edilmistir");
                break;
            }

        }while (true);


        //Infinite loop : Sonsuz dongu

        //Arttirma azaltma kisminda hata yaparsaniz " Infinite loop" sorunsali olusur
        /*
        for(int i = 1;  i<4; i--){
            System.out.println("Hi!");
        }

        */

        /*
        // Arttirma azaltma kismini yazmazsaniz  " Infinite loop" sorunsali olusur
        for(int i = 1;  i<4; ){
            System.out.println("Hi!");
        }
        */

        /*
        // Arttirma azaltma kismini yazmazsaniz  " Infinite loop" sorunsali olusur

        int i = 12;

        while (i<15){
            System.out.println("Hi!");
        }

        */










    }

}
