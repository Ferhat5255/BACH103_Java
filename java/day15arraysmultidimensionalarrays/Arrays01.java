package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {


        //binarySearch() Method: Bu mehod'u kullanarak bir elemanin Array'de olup olmadigini anlariz.
        //                      binarySearch() method'unu kullanmadan once mutlaka "Arrays.sort()" kullanilmalidir.
        //                      binarySearch() method'u aradiginiz eleman Array'de varsa o elemanin indexini return eder.'

        //                      binarySearch() method'u aradiginiz eleman Array'de yoksa "-a" seklinde bir negatif sayi alirsiniz.
        //                       Bu sayidaki "-" isaretinin anlami bu eleman Array'de yok demektir, "a" nin anlami olsaydi kacinci sirada olurdu demektir.
         //                      not: binarySearch() method'u tekrarlayan elemanlar icin kullanilmaz.


        int arr[] = {12, 31, 43, 14};

        int sayi = 43;

        Arrays.sort(arr);  //[ 12, 14, 31, 43]

        int idx1 = Arrays.binarySearch(arr, sayi);
        System.out.println(idx1);  //43


        int sayi2 = 58;
        int sonuc = Arrays.binarySearch(arr, sayi2);
        System.out.println(sonuc);// -5  // - eleman yok demek   // 5 ise olsaydi hangi sirada olurdu ya da kacinci eleman olurdu , index manasinda degil
        // Bu sayi yok ama olsaydi bu sirada olurdu
        // eger olmayan bir elementi aratirsak
        // Java bulamadigini gostermek icin - isareti koyar
        // sonrada o sayi olsaydi siralamasi ne olacak ise o sirayi bize verir


    }
}
