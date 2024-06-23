package Day1;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // Kullanicidan kilo ve boy bilgisini alın ve vucut kitle indeksini gösterin
        // Kitle indeksi : kilo / (boy * boy)

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kilonouzu giriniz");
        double kilo = scan.nextDouble();

        System.out.println("Lütfen boyunuzu giriniz");
        double boy = scan.nextDouble();

        System.out.println(kilo / (boy * boy));





    }
}
