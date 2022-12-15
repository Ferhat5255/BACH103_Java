package day04ifstatement;


import java.util.Locale;
import java.util.Scanner;

public class SccDenemeler {

    public static void main(String[] args) {

        // Kullanicidan ilk, orta ve soy bismini aliniz ve asagidaki formatta ekrana yaziniz
        // Ali Mert Can
        // 123456789
//
//        Scanner input = new Scanner(System.in);

//        System.out.println( "Ilk adinizi giriniz...");
//        String ilkAd = input.next();
//        System.out.println("Orta adinizi giriniz...");
//        String ortaAd = input.next();
//        System.out.println("Soy adinizi giriniz...");
//        String soyAd = input.next();
//        System.out.println("Kimlik no giriniz...");
//        String kimlikNo = input.next();
//        System.out.println("Ad Soyad : " + ilkAd+ " "+ ortaAd+" "+  soyAd );
//        System.out.println("Kimlik no :"+ kimlikNo);

//        System.out.println("Ilk , Orta , Soy Adinizi  ve Kimlik Numaranizi Giriniz...");
//        String ilkAd = input.next();
//        String ortaAd = input.next();
//        String soyAd = input.next();
//        String kimlikNo = input.next();
//        System.out.println(ilkAd + "  " + ortaAd + " " + soyAd );
//        System.out.println( kimlikNo);

//        System.out.println("Ilk ,Orta ve Soy Isminizi giriniz...");
//        String tamIsim = input.nextLine();
//        System.out.println("Kimlik Numarasi giriniz...");
//        String kimlikNo = input.next();

        //Kullanicidan ilk ve soy ismini aliniz , ilk ve soy isminin ilk harflerini ekrana yazdiriniz
        // Ali Can ==>

//        System.out.println("Ilk isminizi giriniz...");
//        char ilk = input.next().charAt(0);
//        System.out.println("Soy isminizi giriniz...");
//        char son = input.next().charAt(0);
//        System.out.println(" "+ ilk+son);

//
//        System.out.println("tam isminizi giriniz...");
//        String tamIsim = input.nextLine();
//
//        char ilkHarf = tamIsim.charAt(0);
//        System.out.println(ilkHarf);
//
//        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
//        System.out.println(soyIsminIlkHarfi);

        //Example 1: Sayi pozitive ise ekrana pozitive yazdirin

//        int sayi= 34;
//
//        if (sayi>0){
//            System.out.println("positive");
//        }

        //Example 2 : Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdirir

//        char ch= 'A';
//
//        if (ch>='A' && ch <= 'Z'){
//            System.out.println("Buyuk Harf");
//
//        }

        //Example 3: Verilen bir sayi uc basamakli ise ekrana "Uc basamakli" yazdiriniz.
//    int a = -345;
//    a= Math.abs(a);
//
//     if (a>99 && a<1000){
//         System.out.println("uc basamakli");
//     }

        // Example 4 : Verilen  bir sayi cift sayi ise ekrana cift sayi yazdiriniz

//        int b= 14;
//        b=Math.abs(b);
//
//        if (b%2==0) {
//            System.out.println("cift sayi");
//        }

        //Exampe 5 : Verile sayi 300 den kucuk veya 1200 den buyuk ise ekrana "Harika Sayi" yazdirin

        /* int sayi = -250;
        sayi= Math.abs(sayi);

        if (sayi<300 || sayi>1200){
            System.out.println("Harika Sayi");
        }*/


       /*

        System.out.println("Gun adinin ilk harfini yaziniz...");
        char ilkHarf = input.next().charAt(0);
        if (ilkHarf=='c' || ilkHarf=='C') {
            System.out.println("cuma , cumartesi veya carsamba");
        } else if
         (ilkHarf=='p' || ilkHarf=='P') {
            System.out.println("pazar, pazartesi veya persembe");

        } else if (ilkHarf=='s' || ilkHarf=='S') {
            System.out.println("sali");

        }else {
            System.out.println("yanlis girdiniz...");
        }
        */

//        System.out.println("ilk kenari giriniz...");
//        double kenar1 = input.nextDouble();
//
//        System.out.println("ikinci kenari giriniz...");
//
//        double kenar2 = input.nextDouble();
//
//        kenar1= Math.abs(kenar1);
//        kenar2= Math.abs(kenar2);
//        if (kenar1> kenar2)
//        {
//            System.out.println("dikdortgen");
//        }
//        else if (kenar1==kenar2) {
//            System.out.println("kare");
//        }
//        else if (kenar1<kenar2) {
//            System.out.println("dikdortgen");
//        }
//        else
//        {
//            System.out.println("yanlis uzunluk girdiniz");
//
//            }

        // Kullanıcının girdiği 4 basamaklı sayının ilk ve son rakamının toplamını
        //ekrana yazdıran bir program yazınız.

//        Scanner input = new Scanner(System.in);
//        int str5= '4'+4+'d';
//        System.out.println(str5);
//
//        char s ='A';
//        int a =2;
//        int b =3;
//        System.out.println(""+ a+s);
//        System.out.println(""+s+a);
//        System.out.println(s+""+a);
//        System.out.println(s+a+"");
//
//        System.out.println(b+a+s+ ""+a+ b+s);
//        System.out.println(a+b+""+a+b);
        /*
        1) Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        yazdırınız.*/

//        String sehirIsmi= "mIamI";
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("tam adinizi giriniz ");
//        String gun = input.nextLine();
//        System.out.print(""+gun.toUpperCase().charAt(0)+gun.toUpperCase().charAt(8));


        String sehirIsim = " mIAMI ";
        String konsolSehirIsım = sehirIsim.trim().toLowerCase();
        konsolSehirIsım = konsolSehirIsım.substring(0,1).toUpperCase() + konsolSehirIsım.substring(1);
        System.out.println(konsolSehirIsım);
    }


}
