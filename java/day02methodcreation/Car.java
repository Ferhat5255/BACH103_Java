package day02methodcreation;

import java.util.Scanner;

public class Car{

    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {

        //obje nasil olusturulur?
        //1) Class ismini yaziniz    2) Objeye bir isim veriniz  3) =    4) new  keyword'unu kullan    5)Class ismi parantezle beraber(constructor)
                Car                         myHonda                 =   new                                   Car();

        System.out.println(myHonda.fiyat);   //20000

        System.out.println(myHonda.marka);  //Honda
        myHonda.hareketEtMetodu();
        myHonda.dur();

        //MethodCreation class'indan object olusturduk

        MethodCreation obj = new MethodCreation();

        System.out.println(obj.toplamaYap(3,5));  //8.0
    }

    public void hareketEtMetodu(){
        System.out.println("Honda guzel hareket eder...");
    }
    public void dur(){
        System.out.println("Honda guvenli sekilde durur...");


    }
}
