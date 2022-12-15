package day32maps;

public class StaticBlock01 {

    public static  double pi;

    static {

        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    //static block'lar ihtiyacimiz olan variable'larin class olusturma safhasinda elimizde olmasini saglar.
    //static block'lar Class icindeki her seyden once calistirilir. "main method" dan ve diger tum method'lardan once calistirilir.
    // static block'lar icinde sadece "static variable" lara deger atanabilir.
    //Birden fazla "static blok" varsa ustteki once calistirilir

    static {
        pi=3.14;
        System.out.println("Static block 1");
    }


}
