package day06_nestedifswitch;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
        Password'un ilk harfi buyuk harf ise
        'A' olursa gecerli password aksi halde gecersiz password
        Password'un ilk harfi kucuk harf ise
    'z' olursa gecerli password aksi halde gecersiz password

        NNote: Java "nested" kodlari calistirirken cok zaman harcar, buna "Time Complexity" denir.
      Bu yuzden mumkunse "nested" kod yazmamaya calisiriz.
         */



        String pwd ="zxy12!";
        char ilkHarf= pwd.charAt(0);

        if (ilkHarf>='A'  && ilkHarf<='Z') {
            
            if (ilkHarf=='A'){
                System.out.println("Gecerli Password");
            }else {
                System.out.println("Gecersiz Password");
            }
            
            
        } else if (ilkHarf>='a'  && pwd.charAt(0)<='z') {

            if (ilkHarf=='z'){
                System.out.println("Gecerli Password");
            }else {
                System.out.println("Gecersiz Password");
            }
            
        }else {
            System.out.println("ilk kaerakter harf olmalidir");
        }
    }
}
