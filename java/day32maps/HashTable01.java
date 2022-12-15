package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
        1)HashTable bir map'tir.
        2)HashTable entrySet'leri herhangi bir siralamaya tabi tutmaz.
        3)HashTable, HashMap'lerden daha yavastir. Cunku HashTable'ler thread-safe(aynı andan birden fazla iş yapabilme becerisi)
         ve synchronized'dir(çoklu işlerin zaman kazandıracak şekilde sıralanabilmesidir).
          4)HashTable'larda key null olamaz. Key'i null yaparsaniz NullPointerException atar.
            5)HashTable'larda value null olamaz. Value'yu null yaparsaniz NullPointerException atar.

         Note: toString() method'u obje'leri console'da detaylari ile gorebilmek icin class'larin icinde olusturulur.
         toString() method'unu oluşturmadan object'i console'a yazdırırsanız Java o object'in adresini yazdırır.

     */

    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey", 90000000);
        System.out.println(countryPopulations);// {USA=400000000, Germany=83000000, Turkey=90000000}

        //countryPopulations.put(null, 90000000);// HashTable'larda key null olamaz. NullPointerException
        //countryPopulations.put("France", null);// HashTable'larda value null olamaz. NullPointerException


        Hashtable<String,Students> myStudents = new Hashtable<>();

        myStudents.put("Math", new Students("Tom Hanks", "t@gmail.com", 21, true));
        myStudents.put("Science", new Students("Mary Star", "t@gmail.com", 32, false));

        System.out.println(myStudents);

        String name = myStudents.get("Math").name;
        System.out.println(name);

       int age =  myStudents.get("Math").age;
        System.out.println(age);

    }

}