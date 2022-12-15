package day26exceptions;

public class Exception03 {
    public static void main(String[] args) {

        double d = divideStringByTheNumOfChar(null);
        System.out.println(d);


    }

    //String'deki character sayisini bulunuz, String'i integer'a ceviriniz, Integer'i character sayisina bolunuz

    //1.yol
    public static double divideStringByTheNumOfChar(String str) {

        int length = 0;
        int i = 0;
        double sonuc = 0;

        try {
            length = str.length(); //NullPointerException: "null" String ile "length()"kullanildiginda alinir

            i = Integer.valueOf(str);  //NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda

            sonuc = i / length;  //ArithmeticException: Bolen sayi sifir oldugunda alinir
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return sonuc;
    }
//2.yol
        public static double divideStringByTheNumOfCharacter(String str){

            int length = 0;
            int i = 0;
            double sonuc = 0;

            try {
                length = str.length(); //NullPointerException: "null" String ile "length()"kullanildiginda alinir

                i = Integer.valueOf(str);  //NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda

                sonuc = i / length;  //ArithmeticException: Bolen sayi sifir oldugunda alinir

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }

            return sonuc;


        }

//3.yol
    public static double divideStringByTheNumOfCharacters(String str){

        int length = 0;
        int i = 0;
        double sonuc = 0;

        try {
            length = str.length(); //NullPointerException: "null" String ile "length()"kullanildiginda alinir

            i = Integer.valueOf(str);  //NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda

            sonuc = i / length;  //ArithmeticException: Bolen sayi sifir oldugunda alinir

        } catch (NullPointerException e) {

            System.out.println("Null pointer exception'a ozel...");

        }catch (Exception e) {

            System.out.println("Diger tum Exception'lar icin...");
        }

        return sonuc;


    }

    /*
    Note: 1) aralarinda "parent-child" relationship olan Exception Class'lari multiple catch'lerde kullanmak isterseniz
            "child"olan once kullanilmalidir, aksi taktirde hata verir
        2) Aralarında "parent-child" relationship olmayan Exception Class'ları multiple catch'lerde kullanmak isterseniz
             sıralamanın bir önemi yoktur.
     */
}
