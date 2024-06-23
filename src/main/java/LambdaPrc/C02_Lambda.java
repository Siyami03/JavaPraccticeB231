package LambdaPrc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C02_Lambda {
    public static void main(String[] args) {

        List<String> meyve = Arrays.asList("erik","portakal","uzum","cilek","greyfurt","nar",
                "mandalina","armut","elma","keciboynuzu","Elma");
        System.out.println("orderedListByCharLenght(meyve) = " + orderedListByCharLenght(meyve));
    }

    // SORU7 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
    // karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız
    public static List<String> orderedListByCharLenght(List<String> mylist){
        return mylist.stream().
                sorted(Comparator.comparing(String::length).
                        reversed()).limit(3).
                collect(Collectors.toList());
    }




}
