package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);// [Tom, Thomas, Tahsin, Trump, Taceddin]

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");


        names.removeAll(cities);//removeAll() kullandiginizda sadece ilk list degisir, parantezin icindeki list degismez
        System.out.println(names);//[Thomas, Tahsin]
        System.out.println(cities);// [Trump, Tom, Taceddin]


        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");

        boolean sonuc1 = names.containsAll(myNames);  //Bir listin icinde coklu elemanlarin var olup olmadigini kontrl eder
        System.out.println(sonuc1);// true              // Hepsi varsa true, en az biri yoksa false verir


        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        //Example 1: "a" listinde "Shoes" elemaninin ilk gorunumunu siliniz
        a.remove("Shoes");
        System.out.println(a);

        //Example 2: "a" listinde "Shoes" elemaninin tum gorunumunu siliniz
        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");
        a.removeAll(silinecekler);
        System.out.println(a);

        //EXAMPLE 3: Bir tane salary listi olusturun, eger salary 10000'den az ise %20; 10000 ve 10000'den cok ise %10 zam yapiniz
        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);

        for (Double w : salary) {

            if (w < 10000) {
                salary.set(salary.indexOf(w), w * 1.2);

            } else {
                salary.set(salary.indexOf(w), w * 1.1);
            }

        }
        System.out.println(salary);

        //Example 4: Iki ArrayList'in esit olup olmadigini kontrol eden kodu yaziniz
        //Note: Iki ArrayList'in esitolabilmesi icin, elemanlar esit olmali ve ayni elemanlar ayni index'te olmali
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        m.add('t');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.Way:
        int counter = 0;  //Flag

        for (int i = 0; i < m.size(); i++) {

            if (m.size() != n.size()) {
                counter++;
                System.out.println("Listler esit degildir");
                break;
            } else if (m.get(i) != n.get(i)) {
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }
        }
        if (counter == 0) {
            System.out.println("Listler esittir");
        }

/*

ilk olarak ??nce eleman say??lar?? e??it mi diye bak??yoruz()e??it de??ilse loop'u k??r??yoruz ve ekledi??imiz counter'?? bir artt??r diyoruz,   e??er eleman say??lar?? e??itse,
 ikinici olarak da  her iki ArrayList' de  ayn?? indexteki karakterler birbirine e??it mi diye bak??yoruz. e??it de??ilse gene loopu k??r diyip olu??turdu??umuz counter'?? bir artt??r diyoruz,
ve loop bitince  counter s??f??rdan b??y??k olursa demek ki e??it olmayan eleman??n var oldu??unu anlam???? oluyoruz e??er counter s??f??r ise buda demek oluyor iki ArrayList birbirine e??it bunuda for-loop d????ar??s??nda bir if-elseif kullanarak yaz??yoruz
yanl???? anlamad??ysam tam olarak b??yle (edited)
 */

        //2.yol:
        boolean esitMi = m.equals(n);

        if (esitMi) {
            System.out.println("Listler esittir");
        } else {
            System.out.println("Listler esit degildir");
        }


    }
}
