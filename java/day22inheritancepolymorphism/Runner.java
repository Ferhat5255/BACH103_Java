package day22inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {

        //inheritance'da variable'lar secilirken Java object'in type'ina bakar
       //Onccelikle istediginiz variable'i Object'in data type'i olan Class'da arar
        //O Class'da bulamazsa Parent Class'lara bakar.
        //Hicbir Parent Class'da bulamazsa hata verir.
       Cat cat1 = new Cat();
       System.out.println(cat1.a); //14
        System.out.println(cat1.b);  //34
        System.out.println(cat1.c);
       // System.out.println(cat1.d); //hata verir

       Mammal cat2 = new Cat();
        System.out.println(cat2.a); //13

       Animal cat3 = new Cat();
        System.out.println(cat3.a); //12

        //Object olustururken Object'in data type'i Child Class'lardan secilemez

        //Inheritance'da method'lar secilirken Java Constructor'a bakar
        //Onccelikle istediginiz method'u Constructori kullanilan Class'dan alir.
        //O Class'da bulamazsa Parent Class'lara bakar
        //Hicbir yerde o method'u bulamazsa hata verir
        Cat cat4 = new Cat();
        cat4.eat();//Cat eat
        cat4.drink(); //Mammal drink

      Mammal cat5 = new Mammal();
      cat5.eat(); //Mammal eat


      Animal catt6 = new Animal();
      catt6.eat(); // Animal eat
    }
}
