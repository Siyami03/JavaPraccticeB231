package Day6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C01_LocalDate {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        /*- Ali 29.10.1923 tarihinden 45 yıl, 8 ay ve 5 gün sonra doğdu.
        - Veli 15.09.1993 tarihinden 24 yıl, 2 ay ve 11 gün önce doğdu.
        - Ali ve Veli'nin doğum tarihini hesaplayıp, yazdırınız.
        - Ali'nin doğum tarihini DD/MM/YY formatında yazdırınız.
        - Ali ve Veli'nin doğum tarhilerinin aynı olup olmadığını kontrol eden
        bir kod yazınız.        */

        //--------------------------------------------------------------------------------------------------------------

        LocalDate ali = LocalDate.of(1923,10,29).plusYears(45).plusMonths(8)
                .plusDays(5);
        LocalDate veli = LocalDate.of(1993,9,15).minusYears(24)
                .minusMonths(2).minusDays(11);
        System.out.println(ali);                         //1969-07-04
        System.out.println(veli);                       //1969-07-04

        DateTimeFormatter aliKalib = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String aliYeni = ali.format(aliKalib);
        System.out.println(aliYeni);                    //04.07.1969

        if (ali.equals(veli)){
            System.out.println("Aynı tarihte dogmuslar");
        } else {
            System.out.println("Farklı tarihte dogmuslar");
        }
        //--------------------------------------------------------------------------------------------------------------

    }
}
