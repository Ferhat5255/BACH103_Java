package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {
          //Example 1: "Anlik tarihi " (Current Date) vekrana yazdiran kodu yaziniz.

        LocalDate currentDate =LocalDate.now();
        System.out.println(currentDate);  //2022-10-21

        //Example 2: "Anlik zamani " (Current Time) vekrana yazdiran kodu yaziniz.
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);     //20:42:07.069900400

        //Example 3: "Anlik tarihi " (Current Date) ve "Anlik zamani " (Current Time) vekrana yazdiran kodu yaziniz.
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);  //2022-10-21T20:45:18.816971300

        //Example 4: Japonya 'daki "Anlik tarihi " (Current Date) ve "Anlik zamani " (Current Time) vekrana yazdiran kodu yaziniz.

        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(currentDateTimeInJapan);  //2022-10-22T02:50:57.232426600

        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));

        System.out.println(currentDateTimeInIstanbul);  //2022-10-21T20:52:38.305760800

        //Example 6:Bugnden 789 sonra emekli olacaginiza gore emeklilik tarihini hesaplayan kodu yaziniz.
        LocalDate countDate = LocalDate.of(2022,10,21);
        LocalDate retireDate =  countDate.plusDays(789);
        System.out.println(retireDate); //2024-12-18

        //Example 7:Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz
        LocalDate dobAli =  LocalDate.of(2005,5,17);
        LocalDate dobVeli =  LocalDate.of(2013,2,8);
        LocalDate ferhat = LocalDate.of(1985,1,11);

        //between (dobAli,dobVeli) method'u kullanildiginda daha eski olan tarih once yazilmalidir.
        Long diff = ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println(diff);   //2824


        //Example 8: Istanbul'un fethi ile Cumhuriyet'in kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz

        LocalDate istanbulunFethi = LocalDate.of(1453,5,29);
        LocalDate cumhuriyetKurulus = LocalDate.of(1923,10,29);

       Long aySayisi = ChronoUnit.MONTHS.between(istanbulunFethi,cumhuriyetKurulus);
        System.out.println(aySayisi); //5645

        //Example 9: Verilen tarih'in hangi burcta oldugunu gosteren kodu yaziniz
        LocalDate myDate = LocalDate.of(1989, 5, 13);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        //1.Yol:
        if(day>=21 && month==3){
            System.out.println("Koc");
        }else if(day<=20 && month==4){
            System.out.println("Koc");
        }else if(day>=21 && month==4){
            System.out.println("Boga");
        }else if(day<=20 && month==5){
            System.out.println("Boga");
        }
        //2.Yol:
        if((day>=21 && month==3) || (day<=20 && month==4) ){
            System.out.println("Koc");
        }else if((day>=21 && month==4) || (day<=20 && month==5)){
            System.out.println("Boga");
        }


    }
}
