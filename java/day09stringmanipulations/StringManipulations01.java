package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {


        String str = "Kara kara dusunme Ankara";

        //indexOf() method'u verilen character veya character'lerin "ilk gorunumunun" index'ini verir.

       int idxA= str.indexOf("kara");
        System.out.println(idxA);  //1

        //lastIndexOf method'u verilen character veya character'lerin "son gorunumunun" index'ini verir.
       int idxA2= str.lastIndexOf("kara");
        System.out.println(idxA2);  //2

        String s = "Mississippi";
        int inxI = s.indexOf('i');    //indexOf() hem String  hem de char ile kullanilabilir
        System.out.println(inxI); //1

        int idxIss1= s.indexOf("iss");   // ilk gorunumun ilk karakterinin indexini verir
        System.out.println(idxIss1);

        int idxIss2= s.lastIndexOf("iss"); // son gorunumun "ilk karakterini " indexini verir
        System.out.println(idxIss2);

        // Example  1 : bir String'deki bir character'in tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz
        //              "Heloooo" ==> H-> Tekrarsiz    e -->Tekrarsiz    l--> Tekrarli  o-->Tekrarli

        String t ="Heloooo";
        char c = 'H';

        if (t.indexOf('H')==t.lastIndexOf('H') ) {
            System.out.println("Tekrarsiz");

        }else {
            System.out.println("Tekrarli");
        }


        String u = "Learn Java earn money";

        //indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar character'i gectikten sonra istenen character'in
        // ilk gorunumun index'ini return eder
        int sonuc = u.indexOf("e",4);
        System.out.println(sonuc); //


       int son =  u.lastIndexOf("a",5);
        System.out.println(son);//2



        //lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi index olarak kabule edip en bastan
        // bu indexe kadar olan karakterleri bir kutu icine aliniz ve lastIndexOf() method'unu sadece bu kutu icindeki String icin kullaniniz.
        String m = "Hello everyone!";
        int e = m.lastIndexOf("e", 10);
        System.out.println(e);//


        String v = " ";
        //isEmpty() method'u bir String'in bos olup olmadigini kontrol eder
        //Eger String'de hic character yoksa isEmpty() "true" return eder' her hangi bir character varsa "false" return eder.
        //lenght() ==0 demek  isEmpty()true verir demektir.
        //bir String'in bos olup olmadigini anlamak icin lenght() ==0 kullanmayin, "isEmpty()" kullanin

        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);

        String x = " ";
        //isBlank() hem bos String icin hem de "sadece space" iceren string'ler icin true return eder

        boolean blankMi = x.isBlank();

        System.out.println(blankMi);

        //Example 2 : Kullanicidan alinan isim mutlaka space'den farkli en az 1 character icermelidir

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz");
        String ilk = input.nextLine();

        if (ilk.isBlank()) {
            System.out.println("Sana ismini gir dedim...");

        }else{
            System.out.println(ilk);
        }









    }
}
