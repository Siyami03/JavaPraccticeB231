package Day1;

public class C04_Concatination {
    public static void main(String[] args) {

        //Yalnızca asagidaki degiskenleri kullanarak, asagidaki ifadeleri olusturun.


        String  str1 = "Java";
        String  str2 = "Guzel";
        int sayi1 = 5;
        int sayi2 = 3;

        //Java5
        System.out.println(str1 + sayi1);

        //Java8Guzel
        System.out.println(str1 + (sayi1 + sayi2) + "Guzel");

        // 2Guzel15
        System.out.println((sayi1 - sayi2) + str2 + (sayi1 * sayi2));

        // Java22
        System.out.println(str1 + (sayi1 - sayi2) + (sayi1 - sayi2));



    }
}
