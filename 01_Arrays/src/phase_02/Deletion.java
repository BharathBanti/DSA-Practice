package phase_02;

import java.util.Arrays;

public class Deletion {
    public static void main(String [] args){
        // DELETION of elements in arrays
        /* ===================================================== */
        // 1. delete element at the END
        int[] arr = {2, 4, 5, 6, 7, 0, 0, 0};
        int arrlsize = 5;
//        System.out.println(Arrays.toString(arr));
        arr[arrlsize - 1] = 0;
//        System.out.println(Arrays.toString(arr));

        /* ===================================================== */
        // 2. delete element at the START
        int[] brr = {34, 53, 54, 23, 23, 0, 0};
        int brrlsize = 5;
//        System.out.println(Arrays.toString(brr));
        for(int i = 0; i < brrlsize - 1; i++){
            brr[i] = brr[i+1];
        }
        brr[brrlsize - 1] = 0;
//        System.out.println(Arrays.toString(brr));

        /* ===================================================== */
        // 3. delete element at ANY INDEX
        int[] crr = {8, 9, 6, 5, 3, 2, 0, 0, 0, 0};
        int crrlsize = 6;
        System.out.println(Arrays.toString(crr));
        int deleteIndex = 3;
        for(int i = deleteIndex; i < crrlsize - 1; i++){
            crr[i] = crr[i + 1];
        }
        crr[crrlsize - 1] = 0;
        System.out.println(Arrays.toString(crr));

    }
}
