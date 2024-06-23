package Day4;

public class C04_OrtakIsimler {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        /* Iki array'de ortak olan isimleri yazdiriniz.
           1. Array: { Jace, John, Mark, Jack, Emma}
           2. Array: { Anna, Brad, Johnny, Mark, Emma }
              Mark, Emma */

        String [] arr1 = {"Jace","John","Mark","Jack","Emma"};
        String [] arr2 = {"Anna","Brad","Johnny","mark"," Emma"};

        for(String w : arr1){
            for(String s : arr2){
                if(w.trim().equalsIgnoreCase(s.trim())){
                    System.out.println(w);
                }
            }
        }
        //--------------------------------------------------------------------------------------------------------------
    }
}
