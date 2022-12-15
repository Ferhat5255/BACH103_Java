package day06_nestedifswitch;

import java.util.Scanner;

public class DenemeFb {
    public static void main(String[] args) {


        //Kulanicidan dort basamakli bir sayi isteyin   sayi bese bolunuyor ve son rakam sifir ise
        // bese bolunebilen cift sayi
        // son rakam sifir degilse bese bolunen tek sayi
        //bese bolunmuyorsa tekrar deneyin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int sayi = input.nextInt();


        if (sayi<100000 && sayi>9999) {
            if ( sayi%5==0 ){

            } if (sayi%10==0){
                System.out.println("Beşe bolunebilen cift sayi");

            }
                if ( sayi%5==0 ){

                } if (sayi%10!=0){

            }

            
        }




    }
}
