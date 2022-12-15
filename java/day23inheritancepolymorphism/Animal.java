package day23inheritancepolymorphism;

public class Animal  {

    public void eat() {
        System.out.println("Animals eat");
    }


    public  int add(int a, int b){
        return a+b;
    }

    public Integer multpy (int a, int b){
        return a+b;
    }


    //Asagidaki method "Overridden Method"
    public Animal create (){
        return  new Mammal();
    }

   // public final double divide(int a, int b){    //final methodlar override edilemez
     //   return a/b;
    //}




}
