package day31maps;

import java.util.HashMap;

public class HashMap02 {
    /*
    1)"HashMap<String,Double> salaries = new HashMap<>();" kodu yazdiginizda Java memory'de 16 kutu(bucket) iceren bir yapi oluturur ve
    bu yapidaki her bir kutuya index verir. Index 'ler  0 dan 15 e kadardir.
    2) Siz " salaries.put("QA",110000.00);" kodunu yazdiginizda Java , key icin bir HashCode olusturur
        bu HashCode'u 16 e boler ve kalani index olarak kullanir.
        Ve bu elemani o index'e yerlestirir.
    3) Yerleştirirken 4'lü bir yapı oluşturur, bu yapının ilk bölümüne "HashCode"u,
         ikinci bölümüne "Key"i,
         üçüncü bölümüne "Value" u ve dördüncü bölümüne "pointer"ı koyar.
         Bu çok bölümlü yapı LinkedList'lerdeki Node'dur.
         Yani HashMap, bucket'lara koyduğu data'yı LinkedList olarak depolar.
    4)Java "null" icin hep HashCode olarak "zero" uretir, o yuzden key null oldugunda
        eleman ilk bucket'a yerlestirilir. Bundan dolayi key'si null olan elemanlar Map in icinde
        genellikle ilk sirada gozukurler.
       5)Java normalde HashCode'ları unique yapar ama bazen trafik kazası gibi farklı iki eleman için aynı HashCode üretilebilir.
          Buna "HashCollision" denir.
          HashCollision meşhur bir Java development problemidir.
          Bu problemle karşılaşıldığında developer'lar bu problemi çözmek için kodlar yazarlar,
          ama bu Core Java'nın konusu değildir.
     */

    public static void main(String[] args) {


        HashMap<String,Double> salaries = new HashMap<>();

        salaries.put("QA",110000.00);


        salaries.put("Dev",130000.00);


        salaries.put("SalesForce",125000.00);



    }
}
