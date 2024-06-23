package Day7;

    /*verilen bir arrayden tekrar eden elemanları silip unique elemanlardan oluşan bir array haline dönüştüren metod
      oluşturun    int arr[]={1,2,2,3,4,4,5};          */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5};
        arr = benzersizyap(arr);
        System.out.println(Arrays.toString(arr));               //[1, 2, 3, 4, 5]

    }

    private static int[] benzersizyap(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int a : arr){
            set.add(a);                   //1,2,3,4,5
        }

        int[] uniqueArr = new int[set.size()];

        int index = 0;
        for (int s : set){
            uniqueArr[index] = s;
            index++;
        }
        return uniqueArr;
    }
}
