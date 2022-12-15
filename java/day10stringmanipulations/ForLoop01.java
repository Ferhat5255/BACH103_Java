package day10stringmanipulations;

public class   ForLoop01 {
    public static void main(String[] args) {

        //Example 1: Ekrana 5000 kere "Hi!" yazdiriniz.

        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        //Tekrarli isler icin "loop" kullaniriz
        //Dort cesit "loop" vardir; i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //i)for-loop
        //Example 2: Ekrana 5 kere "Hi" yazdiriniz.

        // Baslangic degeri ; Loop hangi sart altinda calisacak ;  Increment(Artirma) veya Decrement(Azaltma)

        for (int i = 1;       i < 6;                                 i = i + 1) {
            System.out.println("Hi");
        }


        //Example 3: 4 den 7 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 4; i < 8; i = i + 1) {
            System.out.print(i + " ");
        }

/*
"increment" kullanımı!
toplama ile arttırma;
int i = 12;
    i) i = i+3
    ii)i += 3
    iii) i++ //SADECE "1/bir" ile arttırmada kullanılır

çarpma ile de "increment" yapılabilir
    i) i = i*3
    ii) i * = 3
 */

/*
"decrement" kullanımı!
Çıkarma ile azaltma;
int k = 15;
    i) k = k-7
    ii)k -= 7
    iii) i-- //SADECE "1/bir" ile azaltmada kullanılır

Bölme ile de "decrement" yapılabilir
    i) k=k/7
    ii) k/=7
 */

        System.out.println();
        //Example 4: 14 den 5 kadar tum tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 14; i > 4; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 5: 14 den 5 e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz
        //Cift sayila: 14,12,10

        //1.yol
        for (int i = 14; i > 4; i = i - 2) {
            System.out.print(i + " ");  //14 12 10 8 6
        }

        System.out.println();

        //2.yol:

        for (int i = 14; i > 4; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Example 6: 28 den 157 e kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 28; i < 158; i++) {

            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Example 7:"Java" String'ini j*a*v*a*"  String'ine ceviren kodu yaziniz

        String str = "Java";

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "*");
        }

            System.out.println();

            //Example 8: Size verilen String'de tekrarsiz karakterleri ekrana yazdiriniz
            //           "Hellooo Ali" ==> He Ai

            String s = "Hellooo Ali";

            for (int ii = 0; ii < s.length(); ii++) {
                char c = s.charAt(ii);
                if (s.indexOf(c) == s.lastIndexOf(c)) {
                    System.out.print(c);
                    //He Ai

                }
            }



    }
}
