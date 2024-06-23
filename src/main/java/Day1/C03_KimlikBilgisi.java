package Day1;

public class C03_KimlikBilgisi {
    public static void main(String[] args) {

    // Isim, soyisim, yas, boy, kilo ozelliklerini yalnizca bir println icerisinde, alt alta yazdirin.

        String isim = "Siyami";
        String soyIsim= "ERYILMAZ";
        int yas = 55;
        int boy = 169;
        int kilo = 71;

        // 1.Yol :
        System.out.println("Adı : " + isim);
        System.out.println("Soy Adı : " + soyIsim);
        System.out.println("Yaşı : " + yas);
        System.out.println("Boyu : " + boy);
        System.out.println("Kilosu : " + kilo);

        System.out.println("-----------------------------------");

        // 2.Yol : "Ters slaj n"

        System.out.println("Adı : " + isim +
                "\nSoy Adı : " + soyIsim +
                "\nYaşı : "+ yas +
                "\nBoyu : " + boy +
                "\nKilosu : " + kilo);








    }
}
