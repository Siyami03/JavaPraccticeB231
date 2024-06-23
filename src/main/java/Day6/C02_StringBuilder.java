package Day6;

public class C02_StringBuilder {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        /*      - Kapasitesi 7 olan bir StringBuilder objesi oluşturun.
                - Capacity ve Length değerlerini yazdırın.
                - Bu objeye "hava güzel" verisini ekleyin ve yazdırın.
                - Aradaki boşluğu siliniz.
                - Veriyi ters çeviriniz.
                - Verinin son 4 karakterini siliniz.
                - Veriyi tekrar ters çevirin.
                - Verinin basina "Java " verisini ekleyin    */

        //--------------------------------------------------------------------------------------------------------------

        StringBuilder sb = new StringBuilder(7);
        System.out.println(sb.capacity());                 //7
        System.out.println(sb.length());                   //0

        sb.append("Hava guzel");
        System.out.println(sb);                            //Hava guzel
        int boslukIndex = sb.indexOf(" ");
        sb.deleteCharAt(boslukIndex);
        System.out.println(sb);                              //Havaguzel

        System.out.println(sb.length());                    //9
        System.out.println(sb.capacity());                  //16

        System.out.println(sb.reverse());                    //lezugavaH

        sb.delete(sb.length()-4,sb.length());
        System.out.println(sb);                             //lezug
        System.out.println(sb.reverse());                  //guzel

        sb.insert(0,"Java ");
        System.out.println(sb);                            //Java guzel

        //--------------------------------------------------------------------------------------------------------------

    }
}
