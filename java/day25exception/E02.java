package day25exception;

public class E02 {
    public static void main(String[] args) {

        String arr[] = {"Ali", "Can", "Veli", "Han"};

        getElemenFromArray(arr,2); //Veli
        getElemenFromArray(arr,0);//Ali
        getElemenFromArray(arr,4);//ArrayIndexOutOfBoundsException


    }
    //Bir String Array den index girerek eleman elde edebilmek icin bir method olusturunuz
    public static void getElemenFromArray(String arr[], int idx){
        try {
            System.out.println(arr[idx]);

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index te bir problem meydana geldi");

            //Bu benim teknik olmayan aciklamam
            System.out.println("Array index te bir problem meydana geldi====>" + e.getMessage());

            //Exception ile ilgili detaylica teknik mesaj verir
            e.printStackTrace();

            //Hata mesajini diger mesajlardan ayirmak icin kullaniriz
            System.err.println("Array index te bir problem yasandi");

        }



    }
}
