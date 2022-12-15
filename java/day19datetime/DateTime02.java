package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        
        //Example 1: Java'dan aldiginiz Date'i "ay/gun/yil" olarak yaziniz.
        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate); //  2022-10-21
        
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");    //"MM" 10 DAN KUCUK AYLARI 01,02, 03 ETC. SEKLINDE YAZAR
        String formatedDate1 = dtf1.format(currentDate);
        System.out.println("formatedDate = " + formatedDate1);//  10/21/2022


        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formatedDate2 = dtf2.format(currentDate);
        System.out.println("formatedDate = " + formatedDate2);//  Eki/21/2022

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formatedDate3 = dtf3.format(currentDate);
        System.out.println("formatedDate = " + formatedDate3);//  Ekim/21/2022


        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");
        String formatedDate4 = dtf4.format(currentDate);
        System.out.println("formatedDate = " + formatedDate4);//  10/21/2022  //"MM" 10 dan kucuk aylari 1,2, 3 etc. SEKLINDE YAZAR

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yy");
        String formatedDate5 = dtf5.format(currentDate);
        System.out.println("formatedDate = " + formatedDate5);//10/21/22

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yy");  //"D" 10 dan kucuk gunleri 1, 2, 3 etc. seklinde yazar , 01, 02 , 03 kullanmaz
        String formatedDate6 = dtf6.format(currentDate);
        System.out.println("formatedDate = " + formatedDate6);//10/21/22

        
        //Example 2: Java 'dan aldiginiz time'in formatini degistiriniz.

        LocalTime myTime = LocalTime.of(16,23,54,2345);
        System.out.println("myTime = " + myTime); //myTime = 16:23:54.000002345
        
        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm");  //"HH" 24 saat sistemini, "hh" 12 saat sistemini kullanir.
        String formattedMyTime1 = dtf7.format(myTime);
        System.out.println("formattedMyTime = " + formattedMyTime1);  // 16:23

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedMyTime2 = dtf8.format(myTime);
        System.out.println("formattedMyTime = " + formattedMyTime2);  //4:23 ÖS













    }
}
