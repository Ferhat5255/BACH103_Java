package day02methodcreation.day01variables;

public class Variables01 {

    //Variable nasil olusturulur?
    // 1) Access Modifier     2) Data Type 3)     Variable ismi    4) =  5) Deger   6) ;
    // Java'da ";" Ingilizcedeki "." gibidir.
    //Ingilizce'de "cumle" deriz, Java'da "statement" deriz.

    // "=" sembolu "Assigment(Atama) Operator" olarak adlandirilir.
    //"Assigment(Atama) Operator" sagdaki degeri alir soldaki variable'in icine koyar.


    public int age = 13;
    public int height = 183;

    //                 Java'da Data Type'leri

    /*

                   Primitive Data Types
    1) int: Integer'in kisaltmasi.Integer tam sayi demektir. 32 bit kullanir.
            Matematik'te tam sayilarin basi ve sonu yoktur fakat java'da tam sayilarin basi ve sonu vardir.
            En kucuk int= -2,147,483,648
            En buyuk int= 2,147,483,647

     2) byte :Tam sayilar icin kullanilir.  8 bit kullanir.
              En kucuk byte= -128
              En buyuk byte= 127

     3) short  :  Tam sayilar icin.     16 bit kullanir
               En kucuk short = -32768
               En buyuk short = 32767

     4) long :Tam sayilar icindir.   64 bit kullanir.
                En kucuk long = -9,223,372,036,854,755,808
               En buyuk long = 9,223,372,036,854,755,807

     5) float  :ondalikli sayilar icindir.  32 bit kullanir
                "float" virgulden sonra 7 basamak icerir.
                "float"  degerleriinde sona "f" veya "F" koymamiz gerejir.


     6) double   : ondalikli sayilar icindir.64 bit kullanir.
                 "double" virgulden sonra 16 basamak icerir.

      7) boolean  : "true" veya "false"  degerleri icin kullanilir.  1 bit kullanir.

      8) char  : tek karakterler icin kullanilir.    16 bit kullanir
                    A, c,   2, ?  , _ =
                Note: char'lara deger verirken , degeri tek tirnak arasina koyunuz.Yoksa hata verir.

                Note: Java buyuk ve kucuk harflere duyarlidir.
                        Java icin TRUE ile true tamamen farklidir.

                 Note:  Numerik Data Types:  byte<  short < int< long  < float  < double
                        Numerik olmayan Data Types:boolean, char

                                        Non-Primitive Data Types
            String  : isim , adres , kimlik numarasi gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
                    String degerleri mutlaka cift tirnak arasina konulmalidir.
                    String non-primitive dir. Yani bir String olusturdugumuzda Java size bir suru method verir.

                 Primitive İLE Non-Primitive Data Types arasindaki farki nedir?

                 1) None-Primitive data type'larinda degerin yaninda method'lar vardir.
                    Primitive data type'larinda ise sadece deger vardir, method yoktur.

                 2) Primitive data type'lari  Java tarafindan olusturulmustur, toplam 8 tanedir, biz Primitive data olusturamayiz
                    Non-Primitve data type'lari Java tarafindan da olusturulmustur, biz de olusturabiliriz.
                    Non-Primitive sayilamayacak kadar coktur, cunku her developer Non-Primitive data type olusturabilir.

                3) Primitive data type isimleri kucuk harfle baslar.
                    None-Primitive data type isimleri buyuk harfle baslar.

                 4) Primitive data type 'lar memory'de farkli buyuklukte yerler kullanir.
                    None-Primitive'lerin hepsi memory'de ayni buyuklukte yer kullanirlar.

     */

    public byte price = 12;

    public short popilationOfVillage = 23000;

    public float priceOfShort  =  13.99F;

    public double weightOfCell  = 0.000000123456;


    //siz long demenize ragmen Java verilen sayiyi "int" kabul eder.
    //bu yuzden long bir variable'a "int" araliginin disinda bir sayi verirseniz
    // mutlaka sonuna "L" veya "l" kouyunuz

    public long populationOfWorld  = 7000000000L;

    // Burada "L" koymadigimiz halde "1234" int araligina uyar.
    public  long  x = 1234;

    public boolean  isOld  = true;
    public boolean isRİCH  = false;

    public char initial  =  'S';

    public String name = "Tom Hanks";

    //Note "main method " arabanin motoru gibidir.
    //      "main method " calismadan hicbir sey calismaz.
    public static void main(String[] args) {


    }
}
