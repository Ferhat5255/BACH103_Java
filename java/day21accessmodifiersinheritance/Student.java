package day21accessmodifiersinheritance;

public class Student {

    /*
    Access Modifier
    1) public      2)protected      3)default(Access Modifier'i default yapmak icin access modifier yazmayiz)  4)private

    Note:  Access Modifier'lari genisten dara dogru sayiniz
           public>protected > default > private

    Note: Access Modifier' lari birer birer aciklayiniz.
            public her class'dan kullanilabilir
            protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinde kullanilabilir
            default olanlar baska package'den kullanilamazlar
            Private olanlar sadece olusturulduklari Class icinde kullanilabilirler.

   Note: "protected" ile "default" un farkini soyleyiniz.
               protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
               default olanlar baska package'den kullanilamazlar

        Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
              public, default kullanilir ama protected ve private kullanilamaz
     */

    //public her class'dan kullanilabilir
    public String stdName = "Tom Hanks";

    //protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinde kullanilabilir
    protected  String adress = "Miami";

    //default olanlar baska package'den kullanilamazlar
    String email = "th@gmail.com";

    //Private olanlar sadece olusturulduklari Class icinde kullanilabilirler.
    private String stdId = "20206517004";


}
