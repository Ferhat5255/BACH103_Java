package day03typecastingwrapperscanner;

public class Ferhat_Odev {

    public static void main(String[] args) {

        /*
        1) Bir karenin alanını ve çevresini hesaplayan bir program yazın
        kenar uzunluğu kullanıcı tarafından girilir.
        İpucu 1: Bir karenin alanı uzunluk x uzunluktur
        İpucu 2: Bir karenin çevresi 4x uzunluktur


        Scanner input = new Scanner(System.in);
        System.out.print("Karenin bir kenarini giriniz: ");
        int x = input.nextInt();
        System.out.println("Karenin cevresi: " + 4 * x );
        System.out.println("Karenin alani: " + x * x); */

        /*
        2) Girilen bir sayının küpünü hesaplayan bir program yazın
                kullanıcı tarafından.
            İpucu 1: Bir sayının küpü a x a x a

        Scanner input = new Scanner(System.in);
        System.out.println("Bir  sayi giriniz:");
        double a = input.nextDouble();
        System.out.println("Sayinin küpü :" + a*a*a );  */


        /*
        3) Bir dikdörtgenin alanını ve çevresini hesaplayan bir program yazın
                uzunluğu ve ile kullanıcı tarafından girilen.

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdortgenin kısa kenarini giriniz:");
        double a = input.nextDouble();
        System.out.println("Dikdortgenin uzun kenarini giriniz: ");
        double b = input.nextDouble();
        System.out.println("Dikdortgenin cevresi: " + 2*(a+b));
        System.out.println("Dikdortgenin alani: " + a*b); */

        /*
        Dikdörtgen prizmanın hacmini hesaplayan bir program yazın
            uzunluğu, genişliği ve yüksekliği kullanıcı tarafından girilir.
            ipucu 1: Dikdörtgen prizmanın hacmi genişlik x uzunluk x yüksekliktir


        Scanner input = new Scanner(System.in);
        System.out.println("Diktörtgen prizmanin genisligini giriniz: ");
        int genislik = input.nextInt();
        System.out.println("Dikdortgen prizmanin kenar uzunlugunu giriniz: ");
        int kenar = input.nextInt();
        System.out.println("Dikdortgen prizmanin yuksekligini giriniz: ");
        int yukseklik = input.nextInt();
        System.out.println("Dikdortgen prizmanin hacmi: " + genislik * kenar * yukseklik); */

        /*
        5) Bir dairenin alanını ve çevresini hesaplayan bir program yazın
            yarıçapı kullanıcı tarafından girilen. (şamandıra kullanın)
            İpucu 1: Pi sayısını 3.14159 olarak alın
            İpucu 2: Bir dairenin alanı 3.14159 x yarıçap x yarıçaptır
            İpucu 3: Bir dairenin çevresi 2 x 3.14159 x yarıçaptır
            İpucu 4: Float elde etmek için nextFloat() kullanın


        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yaricapini giriniz:");
        float yaricap = input.nextFloat();
        System.out.println("Dairenin alani: " + 3.14159 * yaricap );
        System.out.println("Dairenin cevresi: " + 2 * 3.14159 * yaricap);   */

        /*
        6) Bir üçgenin çevresini hesaplayan bir program yazın.
            Kenar uzunlukları kullanıcı tarafından girilir. (bayt kullanın)
            İpucu 1: Bir üçgenin çevresi a + b + c'dir
                İpucu 4: Bayt almak için nextByte() kullanın

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin birinci kenarini giriniz:");
        byte a = input.nextByte();
        System.out.println("Ucgenin ikinci kenarini giriniz: ");
        byte b = input.nextByte();
        System.out.println("Ucgenin ucuncu kenarini giriniz: ");
        byte c = input.nextByte();
        System.out.println("Ucgenin cevresi: " + (a + b+ c)); */

        /*
        7) Mili kilometreye çeviren bir program yazın. Mil değeri olacak
            kullanıcı tarafından girildi. (Çift kullanın)
              İpucu 1: km = mil x 1,6
            İpucu 2: Çift almak için nextDouble() kullanın


        Scanner input = new Scanner(System.in);
        System.out.println("Mil degeri giriniz: ");
        double mil = input.nextDouble();
        System.out.println("km: " + mil*1.6);   */

        /*
        8) Saatleri saniyeye çeviren bir program yazın. Saat değeri olacak
            kullanıcı tarafından girildi. (Uzun kullanın)
            İpucu 1: saniye = saat x 60 x 60
            İpucu 2: Uzatmak için nextLong() kullanın

             Scanner input = new Scanner(System.in);
           System.out.println("Lutfen saati giriniz:");
           long saat = input.nextLong();
           System.out.println("Saniye: " + saat*60*60);  */

        /*
        9)Kullanıcıdan adını ve soyadını girmesini isteyen bir program yazın,
            sonra konsolda yazdırın.
            İpucu: String almak için nextLine() kullanın


            Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz:");
        String ad = input.nextLine();
        System.out.println("Lutfen soyadinizi giriniz: ");
        String soyad = input.nextLine();
        System.out.println("Adiniz Soyadiniz: " + ad + " "+ soyad );  */

        /*

        10) Kullanıcıdan tam adını ve adresini girmesini isteyen bir program yazın.
            daha sonra tam adı ilk satırda olması gerektiği gibi konsolda yazdırın,
            ve adres ikinci satırda olacaktır.
        İpucu: String almak için nextLine() kullanın


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi giriniz:");
        String adSoyad = input.nextLine();
        System.out.println("Lutfen adresinizi giriniz: ");
        String adres = input.nextLine();
        System.out.println("Ad Soyad: " + adSoyad + " " + "Adres: " + adres); */


    }
}
