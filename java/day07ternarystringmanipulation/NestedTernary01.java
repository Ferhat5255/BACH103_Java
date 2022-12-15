package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {

        /*
        Verilen yilin "Leap Year" (Artik Yil) olup almadigini kontrol eden kodu yaziniz.
        i) Yil 100 e bolunurse 400 e de bolunmelidir  ==> 1600+    1800-
        ii) Yil 100'e bolunmezse 4 e bolunmelidir   ==> 1996+   2001-

         */


        int year = 2001;

        String leab = year%100==0 ?  (year%400==0 ? "Leap Year"   : "Leap Year Degil")  : (year%4==0  ? "Leap Year"   : "Leap Year Degil");
        System.out.println(leab);

        /*
        Asagidaki kurallara gore password'un gecerli olup olmadigini kontrol eden kodu yaziniz
        i) Sekiz karakterden fazla  veya sekiz karakter varsa ilk harfi 'i' olmalidir
        ii)Sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir

         */
        String pwd = "i2a3ed54";

        // char ilkHarf = pwd.charAt(0);   bunu da kullan

       String gecerli= pwd.length()<8  ? (pwd.charAt(0)=='K'  ? "Gecerli"  : "Gecersiz") : (pwd.charAt(0)=='i'  ?  "Gecerli"  : "Gecersiz");

        System.out.println(gecerli);
    }
}
