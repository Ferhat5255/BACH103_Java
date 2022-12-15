package day04ifstatement;

public class ScccOdevler {
    public static void main(String[] args) {

       /* Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz.
                Sonrasında bu double değişkenin değerini konsolda yazdırınız.
                Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır

        byte sayi1= 13;
        double newSayi= sayi1;
        System.out.println(newSayi);  */

        /*

        Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını
bulmak için bir kod yazınız

            byte a = Byte.MIN_VALUE;
            short b = Short.MAX_VALUE;
        System.out.println(a+b);  */

        /*

        2) Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
                yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
                değişken arasındaki farkı yazdırınız


        String a = "103";
        byte newA = Byte.valueOf(a);
        System.out.println(newA);

        String b = "2351";
        short newB = Short.valueOf(b);
        System.out.println(newB );

        System.out.println(newA+newB); */


       /* 1) Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        yazdırınız.*/

        /*
        String sehirIsim = " mIAMI ";
         */
//        String konsolSehirIsim = sehirIsim.trim().toLowerCase();
//        konsolSehirIsim = konsolSehirIsim.substring(0,1).toUpperCase() + konsolSehirIsim.substring(1);
//        System.out.println(konsolSehirIsim);


//
//            String sehirIsmi = "sAMsUn";
//            String  konsolSehirIsmi = sehirIsmi.trim().toLowerCase();
//            konsolSehirIsmi= konsolSehirIsmi.substring(0,1).toUpperCase()+konsolSehirIsmi.substring(1);
//        System.out.println(konsolSehirIsmi);




    }
}
