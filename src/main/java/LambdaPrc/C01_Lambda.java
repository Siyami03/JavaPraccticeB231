package LambdaPrc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C01_Lambda {
    public static void main(String[] args) {

    //------------------------------------------------------------------------------------------------------------------

        List<Integer> list= Arrays.asList(2,3,-9,-3,-4,-5,5,15,-8,9,2,-2,22,-1,87,93,4,6);
        //System.out.println("Çift ve Pozitif elemanlar");
        //printPositiveEvens(list);
        //printPositiveEvensRef(list);
        //printSquares(list);
        //orderByDesc(list);
        //printCubes(list);
        printSum(list);

    //------------------------------------------------------------------------------------------------------------------
    }

    //------------------------------------------------------------------------------------------------------------------

    //SORU1: List elemanlarının çift ve pozitif olanlarını,
    //Lambda Expression kullanarak tek satirda aralarında bosluk olacak sekilde yazdırın

    public static void printPositiveEvens(List<Integer> mylist){

        mylist.stream().filter(t -> t > 0 && t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    //------------------------------------------------------------------------------------------------------------------

    //SORU2: List elemanlarının çift ve pozitif olanlarını,
    //Method Referances kullanarak tek satirda aralarında bosluk olacak sekilde yazdırın
    public static void printPositiveEvensRef(List<Integer> mylist){
        mylist.stream().
                filter(Utils::isPositive).
                filter(Utils::isEven).
                forEach(Utils::print);
    }

    //------------------------------------------------------------------------------------------------------------------

    //SORU3 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void printSquares(List<Integer> mylist){
        mylist.stream().map(t -> t*t).distinct().forEach(Utils::print);



    }

    //------------------------------------------------------------------------------------------------------------------

    //SORU4: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void orderByDesc(List<Integer> mylist){
        mylist.stream().sorted(Comparator.reverseOrder()).forEach(Utils::print);

    }

    //------------------------------------------------------------------------------------------------------------------

    // SORU5 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void printCubes(List<Integer> mylist){
        mylist.stream().
                filter(Utils::isPositive).
                map(t -> t * t * t).
                filter(t -> t % 10 == 5).forEach(Utils::print);
    }

    //------------------------------------------------------------------------------------------------------------------

    // SORU6: List elemanlarının toplamını lambda expression ve method reference ile bulun ve yazdırın
    public static void printSum(List<Integer> mylist){

   //int total=mylist.stream().reduce((t, u) -> t + u);//Dikkat! null olabilir.
   //System.out.println(total);

        //1.yol
        try {
            int total=mylist.stream().reduce((t,u)->t+u).get();//NoSuchElementException
            System.out.println(total);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //2.yol
        int total=mylist.stream().reduce(0,(t,u)->t+u);
        System.out.println(total);

    }

    public static void printSumRef(List<Integer> mylist){

        //1.yol
        int total=mylist.stream().reduce(0,Integer::sum);
        System.out.println(total);

        //2.yol
        int total2=mylist.stream().reduce(0,Math::addExact);
        System.out.println(total2);

    }









}
