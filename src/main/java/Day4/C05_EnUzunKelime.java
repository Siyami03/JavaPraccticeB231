package Day4;

import java.util.Arrays;

public class C05_EnUzunKelime {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        //Kullanıcıdan alınan cümledeki en uzun kelimeyi listeleyen bir kod yazınız.
        //Örnek : "Kullanicidan alinan cumle"

        String cumle = "kullanicidan alinan cumle";
        String[] kelimeler = cumle.split(" ");
        System.out.println(Arrays.toString(kelimeler));             //[kullanicidan, alinan, cumle]

        String longestWord = "";

        for (String w: kelimeler){
            if(w.length() > longestWord.length()){
                longestWord = w;
            }
        }
        System.out.println(longestWord);

        //--------------------------------------------------------------------------------------------------------------
    }
}
