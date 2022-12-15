package day13loopsarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Deneme123 {
    public static void main(String[] args) {

        int arr[] = new int[5];
        arr[0] = 12;
        arr[1] = 11;
        arr[2] = 12;
        arr[3] = 13;
        arr[4] = 15;

        System.out.println(Arrays.toString(arr));

        System.out.println();

//        int sum=0;
//
//        for(int i=0; i<arr.length; i++){
//
//            sum =sum+arr[i];
//
//
//        }
//        System.out.println(sum);
////***************************************************///////////////////
//        int top=0;
//        int i = 0;
//
//        while(i<arr.length){
//
//            top =top+arr[i];
//
//            i++;
//        }
//        System.out.println(top);

        ////////////////////////*******************************///////////

        int i = 0;
        int t = 0;

        do {
            t = t + arr[i];
            i++;
        } while (i < arr.length);
        System.out.println(t);
//
//        int k=0;
//        for (int w :arr){
//            k =k+w;
//
//        }
//        System.out.println(k);

        int ii=0;
        int sum=0;

        while (ii<arr.length) {

            sum = sum + arr[ii];
            ii++;

        }System.out.println(sum);


        int sum2 =0;
        int iii=0;

        do {
            sum2 =sum2+arr[iii];
            iii++;
        }while (iii<arr.length);
        System.out.println(sum2);




        int sum4=0;
        for(int w : arr){
            sum4 = sum4 +w;
        }
        System.out.println(sum4);


        System.out.println("****");


        String str[] = new String[5];
        str[0] = "Ali";
        str[1] = "Ala";
        str[2] = "Alim";
        str[3] = "Arzu";
        str[4] = "Asu";

        int karakST = 0;

        for( String w : str){

            karakST =karakST + w.length();
        }
        System.out.println(karakST);

        String stdNames[] = new String[5];
        stdNames[0] = "Ali";
        stdNames[1] = "Tom";
        stdNames[2] = "Veli";
        stdNames[3] = "Kemal";
        stdNames[4] = "Cem";

        int karakterSayilariToplami = 0;

        for (String w : stdNames) {
            karakterSayilariToplami = karakterSayilariToplami + w.length();
        }
        System.out.println(karakterSayilariToplami); //18

        //*******/////////////
        System.out.println("****************");
        char ch [] ={'C', 'D', 'p', 's', 'K', 'l'};

        for (char w : ch){

            if( w>='A' && w<='Z'){
                System.out.print(w);
            }
        }

        System.out.println("*****************");

//        kullanicidan bir sayi aliniz, sayi 100'den kucuk ise ekrana "Kazandin!" yazdiriniz.
//        Aksi halde ekrana "Kaybettin!" yazdiriniz.
//                Kullanici kazandikca oyun devam etmeli.
//
//        Scanner input = new Scanner(System.in);
//
//        int sayi =0;
//                do {
//            System.out.println("Lutfen bir sayi giriniz ");
//            sayi = input.nextInt();
//
//            if (sayi <100) {
//                System.out.println("Kazandiniz");
//            }
//        }while (sayi <100);
//            System.out.println("Kaybettiniz");
//







    }

}
