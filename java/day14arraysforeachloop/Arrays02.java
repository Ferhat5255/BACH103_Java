package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz
        //            [2, 3, 12, 0,  0,  0]

        int orijinal[] = {0, 2, -3, 0, 12, 0};

        int yeni[] = new int[orijinal.length];

        int idx = 0;

        for (int i = 0; i < orijinal.length; i++) {

            if (orijinal[i] != 0) {
                yeni[idx] = orijinal[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));

        //Example 2: Bir Array 'in icinde herhandi bie elemanin olup olmadigini ve
        //           kac kere tekrarlandigini gosteren  kontrol eden kodu yaziniz
        //            [0, 1, 2, -3, 2] ==>  kullanici 2'yi sordu  ==>  2 elemani var ve 3 kere tekrarlandi
        //                              ==>  kullanici 6'yi sordu  ==>  6 array'de yok'

        int arr[] = {5, 1, 5, -3};

        int eleman = 5;

        int counter = 0;  // "flag" : Bazi durumlarin olup olmadigini kontrol etmek icin "flag" kullanilir.

        for (int w : arr) {

            if (w == eleman) {
                counter++;
            }
         }
        if (counter > 0) {
            System.out.println(eleman + "array'de" + counter + "defa var");

        } else {
            System.out.println(eleman + "array'de yok");
        }


        //Example  3: Size verilenbir cumledeki en uzun kelimeyi bulan kodu yaziniz
        //            "Java kolaydir calisana,ne kolay ki calismayana."  ==> calismayana

        String sentence = "Java kolaydir calisana, ne kolay ki calismayana.";
        System.out.println(sentence);

        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);

        String words[] = sentence.split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(words));  //[ne, ki, Java, kolay, kolaydir, calisana, calismayana]

        System.out.println(words[words.length - 1]);  //calismayana



    }
}
