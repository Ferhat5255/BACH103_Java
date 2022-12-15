package day30collections;

import java.util.HashSet;

public class HashSet01 {

    /*
       Hash bir tekniktir,birbirine benzemeyen code'lar uretir bu code'lar data'yi unique yapar..
       Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)

        HashSet'ler eklenen elemanlarin siralamasi ile ugrasmaz. Siralam ile alakali zaman harcamaz bu yuzden cok hizli calisir.

        HashSet'ler  index kullanmazlar. Cunku siralama rastgele yapildigi icin index manali olmaz

        HashSetler:
            1)Tekrarsiz elemanlarda
            2)Sırlama onemli degilse
            3)Hız cok önemliyse
            4)Indeks kullanmazlar
    */

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<String>();

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails); //[Apple, Fig, Mango, Apricot, Orange]

        //Varolan elemani eklerseniz hata vermez, son ekleneni var olan data nin ustune yazar.(Overwrite)
        emails.add("Mango");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        emails.add(null); //
        emails.add(null); //
        emails.add(null); //
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]

    }
}
/*
 * Set --> HashSet :
 * 1) HashSet, duplicationa(tekrarli eleman) izin vermez.(tekrarsiz)
 * Eger bir elemani tekrar HashSet e eklemek isterseniz eski olan silinip, yeni olan uzerine yazilir.
 * 2) HashSet'ler Set'ler arasinda en hizli olanidir. Bir algoritmaya gore kayit eder.
 * Degerlerin giris sirasina dikkat edilmez.(LinkedHashSet haric)
 * 3) HashSet "null" object'ini eleman olarak kullanabilir.
 * Ancak birden fazla null degerini bir HashSet e eklemek isterseniz sadece bir tane null degeri olur.
 */