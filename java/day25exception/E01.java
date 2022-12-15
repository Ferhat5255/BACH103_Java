package day25exception;

public class E01 {
    /*
       1)  "Exception" (istisnai hata) javada kodlarimizi calistirirken meydana gelen beklenmedik durumlardir.
       2) "Exception" lar ile calismanin iki yolu vardir
            a) try-catch blok kullanma ve exception olussa bile calismayi devam ettirme
            b) throw exception kullanarak calismayi durdurma (mesela yazdigimiz kod geregi bir dosya uzerinden okuma yapmamiz
            gerekiyor  ise bu dosyamiz eger silinmis ise java dosyayi bulamaz ve uygulamanin devam etmez gerekmez)
      3) Eger exception'i handle etmez isek (sorunu halletmezsek) java calismayi durdurur
      4)  try-catch kulanirken try kodunu bir ya da birden fazla catch ile birlikte kullanabiliriz
      5) try, catch olmaksizin yalniz kullanilmaz.
      6) Eger yazmis oldgumuz herhangi bir kod satirinda problem olabilecegini dusunuyorsaniz try-catch block icine koymali
      7) catch block parntazi icerisinde olmasi muhtemel exception class ismi yazilir
      8) e.getmessage(), methodunu kullanarak teknik mesaajlar elde edebiliriz.
         System.out.println(); burada yazmis oldugum mesajlar benim teknik olmayan aciklamalarimdir.
          e.printStackTrace(); methodu Exception ile ilgili detaylica teknik mesaj verir. kod calismaya devam eder
         System.err.println(); hata mesajini renkli olarak verir bu sayede cansolda diger mesajlardan ayırmak icin kullaniriz
      9)Eger try body icindeki kod sorunusuz calisirsa catch blok devreye girmez
     */



    public static void main(String[] args) {
//        divide(6,2);//3
//        divide(0,2);//0
//        divide(6,0);//matematikte bir sayi sifir ile bolunemez


        divide2(5,0);

    }

    //1.yol ...tavsiye edilmez.
    public static void divide (int a, int b) {
        if (b == 0) {
            System.out.println("Bir sayi sifir ile bolunemez");
        } else {
            System.out.println(a / b);
        }
    }

    //2.yol  try-catch kullanarak exception'i handle etmek tavsiye edilir.
    public static void divide2 (int a, int b){

       try{
           System.out.println(a/b);

       }catch (ArithmeticException e){
           System.out.println("Bolme islemine bir problem olustu==> " + e.getMessage());

       }
    //java matematik ile ilgili karsilasilmasi muhtemel tum istisnalari, hatalari "ArithmeticException" class'ina koymustur.
    // Matematikteki tum istisnalari detaylari bilmek zorunda degiliz
    }


}
