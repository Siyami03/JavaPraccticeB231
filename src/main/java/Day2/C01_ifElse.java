package Day2;

import java.util.Scanner;

public class C01_ifElse {
    public static void main(String[] args) {

        /*Kullanıcıdan iki sayı isteyin,
            - Sayıların ikisi de pozitif ise sayıların toplamını yazdırın.
            - İkisi de negatif ise sayıların çarpımını yazdırın.
            - İkisi farklı işaretlere sahip ise sayılarla işlem yapılamadığını yazdırın.
            - Sayılarda sıfıra eşit olan var ise yutan eleman yazdırın.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz");
        int sayi1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int sayi2 = input.nextInt();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println("Toplam = " + (sayi1 + sayi2));
        } else if (sayi1 < 0 && sayi2 < 0){
            System.out.println("Çarpım = " + (sayi1 * sayi2));

        } else if ((sayi1 < 0 && sayi2 > 0) || (sayi1 > 0 && sayi2 < 0)){
            System.out.println("farklı işaretli sayılara işlem yapılamaz");

        } else {
            System.out.println("yutan eleman");

        }



    }
}
