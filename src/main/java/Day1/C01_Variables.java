package Day1;

public class C01_Variables {
    public static void main(String[] args) {

        // Bir yas variable'i olustur ve yazdir.
        byte age = 18;
        System.out.println("Yas : " + age);

        // Bir sayi olustur ve yazdir
        int number = 12345;
        System.out.println("Number " + number);
        System.out.println("number = " + number);

        /* 1.Yeni bir myAge variable'i olustur.
           2.Mevcut age variable degerini myAge'e ata.
         */

        int myAge = age;
        System.out.println("myAge = " + myAge);

        // Bir isim variable'i olustur.
        String name = "Siyami";
        System.out.println("name = " + name);

        /* 1.myName isimli bir variable olustur.
           2.Mevcut name variable degerini myName'e ata.
         */

        String myName = name;
        System.out.println("myName = " + myName);

        name = "Rumeysa";
        System.out.println("name = " + name);
        System.out.println("myName = " + myName);


    }
}
