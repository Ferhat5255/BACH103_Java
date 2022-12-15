package day26exceptions;

/*
Exception'lar ikiye ayrılır
1) RunTime(Unchecked) Exception: Siz run butonuna bastıktan sonra oluşan Exception'lardır
    a)ArithmaticException
    b)NullPointerException
    c)ArrayIndexOutOfBoundsException
    d)StringIndexOutOfBoundsException
    e)NumberFormatException
2) CompileTime(Checked) Exception: Biz kod yazarken javanın kızmızı altını çizmesi.
 */

public class Exceptions01 {

    public static void main(String[] args) {

      String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5); //128

        String st = "1a2b";
        int r = convertStringToInteger(st); //NumberFormatException: Eger icinde rakamdan farkli karakter bir string'i
                                            //                       valueOf () kullanarak Integer'a cevirmek isterseniz NumberFormatException alirsiniz.
        System.out.println(r + 10);
    }

    public static int convertStringToInteger(String str){

        int i = 0;

        try {
            //Herhangi bir satirda "Exception" atlirsa Java direkt "catch" bolumune gecer try icindeki sonraki kodlari calistirmaz
           i =  Integer.valueOf(str);
            System.out.println("Burasi try bolumu");

        }catch (NumberFormatException e){

            System.out.println("Rakam olmayan karakter iceren String'ler Integer'a cevrilemez");
        }
       return i;
    }
}
