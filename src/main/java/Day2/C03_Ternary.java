package Day2;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        /*
                1. Kullanıcıdan bir sayı alın.
                2. Ternary kullanarak,
                    - Girilen sayı çift ise konsola "Çift Sayı" yazdırın.
                    - Girilen sayı tek ise, sayıyı 3 arttırarak konsola yazdırın.
         */

        // ternary:     expression ? (true) : (false)


        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = input.nextInt();

        Object result = (sayi%2 == 0    ? ("Çift sayı")   : (sayi + 3 ))  ;
        System.out.println("Sonuç = " + result);








    }
}
