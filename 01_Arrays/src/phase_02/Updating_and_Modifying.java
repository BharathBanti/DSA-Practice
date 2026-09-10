package phase_02;

import java.util.Arrays;

public class Updating_and_Modifying {

    public static void main(String[] args){
        // UPDATING AND MODIFYING
        /* ===================================================== */
        // 1. Single index update
        int[] arr = {12,34,56,67,78,89,90,62,46,23};
        // update value at index '6' to '999'
        arr[6] = 999;
//        System.out.println(Arrays.toString(arr));

        // 2. Bulk/Conditional modifications
        // double every even number in an array
        int[] brr = {1,2, 3, 4, 5, 6, 7, 8, 9, 3};
        for(int i = 0; i < brr.length; i++){
            if(brr[i] % 2 == 0){
                brr[i] *= 2;
            }
        }
//        System.out.println(Arrays.toString(brr));

        // 3. Replace with running difference: Given arr = {10, 8, 15, 20, 5},
        // modify it in-place so each element (except the first) becomes
        // arr[i] - arr[i-1] (its difference from the original previous value,
        // not the already-modified one). Think carefully about traversal
        // direction and whether you need a temp variable before you code it
        int[] crr = {10, 8, 15, 20, 5};
        for(int i = crr.length - 1; i > 0; i--){
            crr[i] = crr[i] - crr[i-1];
        }
        System.out.println(Arrays.toString(crr));
    }

}
