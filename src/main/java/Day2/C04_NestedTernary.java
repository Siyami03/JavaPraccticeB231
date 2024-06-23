package Day2;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        /*1. Kullanıcıdan iki sayı alın. Ternary kullanarak,
            - Sayılar birbirine eşit ise, konsola "Sayılar birbirine eşit" yazdırın.
            - Sayılar birbirine eşit değil ise, büyük olan sayının karesini ekrana yazdırın.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Sayıyı giriniz");
        int s1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int s2 = input.nextInt();

        Object result = ((s1 == s2) ? ("sayılar birbirine eşit") : ((s1 > s2) ? (s1*s1) : (s2*s2)));
        System.out.println(result);

        Object result2 = s1 == s2 ? "sayılar birbirine eşit" : s1 > s2 ? s1*s1 : s2*s2; // Parantez olmayabilir.
        System.out.println(result2);



    }
}
