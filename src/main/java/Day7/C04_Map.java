package Day7;

    /*İki fraklı Arrayde aynı indekste barındırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
      input: {"John","Mark",""Ali}, {"Steinbeck","Down","Can"};
      output: {John=Steinbeck, Mark=down,Ali=Can}                                  */

import java.util.HashMap;
import java.util.Map;

public class C04_Map {
    public static void main(String[] args) {

        String[] isimler    = {"John","Mark","Ali"};
        String[] soyisimler = {"Steinbeck","Down","Can"};

        Map<String,String> tamisim = new HashMap<>();

        for (int i = 0 ; i < isimler.length; i++){
            tamisim.put(isimler[i],soyisimler[i]);

        }

        System.out.println(tamisim);                              //{John=Steinbeck, Mark=Down, Ali=Can}



    }

}
