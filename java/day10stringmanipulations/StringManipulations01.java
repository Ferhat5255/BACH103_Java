package day10stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String a = "Java kolaydır.";

        //startsWith("kola", 5) kodu ilk 5 karakter'den sonraki String'e bakar ve o String'in "kola" ile başlayıp başlamadığını kontrol eder.
        //"kola" ile başlıyorsa "true" başlamıyorsa "false" return eder.
        boolean b = a.startsWith("kola", 5);
        System.out.println(b);

        //replaceFirst("a", "*"); kod String'deki ilk "a" yı "*" a çevirir.
        //replace("a","*"); kod String'deki tüm "a" ları "*" a çevirir.
        String c = a.replaceFirst("a", "*");
        System.out.println(c);//J*va kolaydır.

        //concat() method'u iki tane String'i birbirine yapıştırmaya yarar.
        //"Concatenation" işlemi iki türlü yapılabilir, i)+ ile ii)concat() ile
        //Java bir işlem için method üretmişse o method'u kullanmak "best practice"dir.
        String d = a.concat(" Anladın mı?");
        System.out.println(d);


        String e = "    Tom Hanks    ";
        System.out.println(e);//"    Tom Hanks    "

        //trim() method'u bir String'in baş ve sonundaki "space" karakterlerini siler, aradaki "space" karakterlerine dokunmaz.
        String f = e.trim();
        System.out.println(f);//"Tom Hanks"

        String h = "Java";
        String i = "java";

        //h.compareTo(i); kod iki tane String'i alfabetik(lexicographic) olarak karşılaştırır.
        //Büyük harf e duyarlıdır.
        //Büyük harf küçük harfe duyarlı olmasını istemezseniz compareToIgnoreCase(i); kullanabilirsiniz.
        //h.compareTo(i); kodda "h"nin alphabetik sırasından "i" nin alfabetik sırası çıkartılır.
        int k = h.compareToIgnoreCase(i);
        System.out.println(k);

        //a.repeat(5); kodu "a" String'ini yanyana 5 kere yapıştırır.
        //a.repeat(0); empty String return eder.
        //Java Documents'a ulaşmak için --> Windows==>Ctrl e basılı tutun ve mouse ile method ismine tıklayın.
        String n =a.repeat(3);
        System.out.println(n);




































    }
}
