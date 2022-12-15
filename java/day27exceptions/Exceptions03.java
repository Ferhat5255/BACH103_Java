package day27exceptions;

public class Exceptions03 {

    /*
    1) Java Exception'lar olusturarark Developer'larin Java kurallarian uymalarini temin etmistir.
    2)Biz de Application uretirken kendi Exception'larimizi olusturarak diger developer'larin bizim ortaya koydugumuz kurallara uymalarini teminn ederiz
    3) Bizim urettigimiz Exception'LARA "Custom Exception" denir.
    4)Custom Exception'lar da "RuntimeException" ve "CompileTimeException" olabilir
    5) Custom "RuntimeException" uretmek icin "extends Exception" deriz
    6)Custom "CompileTimeException" üretmek için "extends Exception" deriz
     */

    public static void main(String[] args) throws IllegalGradeException {

        printGrades(60);

        checkNameFormat("ali");
    }

    //Ogrenci notlarini yazdiran bir method olusturunuz
    public static void printGrades(double grade) throws IllegalGradeException {

        if (grade<0 || grade>100){
            throw new IllegalGradeException("grade 0 dan az 100 den cok olamaz");
        }else {
            System.out.println(grade);
        }
    }

    //Verilen ismin ilk harfinin buyuk harf olmamasi durumunda Exception atan method yaziniz
    public static boolean checkNameFormat(String name){

        if (name.charAt(0)>='A' && name.charAt(0)<='Z'){
            return true;
        }else {
            throw new IllegalNameException("Isimler buyuk harfle baslamalidir");
        }


    }
}
