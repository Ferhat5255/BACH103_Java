package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

import static day19datetime.Cauntries.USA;

public class DateTime03 {
    public static void main(String[] args) {


//Example 1 : Japonya ile Alamanya arasindaki zaman farkini hesaplayan kodu yaziniz.

        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        long fark = ChronoUnit.HOURS.between(germany,japan);
        System.out.println(fark);  //6


        //Example 2: Sabit bir tarih olusturunuz.
        LocalDate  myDate = LocalDate.of(2011, Month.APRIL,13);
        System.out.println("myDate = " + myDate);  //2011-04-13



        /*
        1)Java'da sbit datalari(gun isimleri,ay isimleri, Amerika'daki eyalet isimler  etc) depolamak ve gerektiginde kullanmak icin
         depolar olustururuz. Bu depolara "Enum" denir.
         */


        //Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold", "TURKEY" icin "Vatan", "GERMANY" icin "Araba", "RWANDA" icin "Cay"

        Cauntries coutry = USA;

        switch (coutry){

            case USA:
                System.out.println("Woow!");
                break;
            case UK:
                System.out.println("Big");
                break;
            case CANADA:
                System.out.println("Woow!");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Çay");
                break;
            default:
                System.out.println("Tanımlanmamış ülke...");



        }


    }
}
