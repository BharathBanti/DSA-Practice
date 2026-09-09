package phase_02;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args){
        // Insertion in arrays

        /* ===================================================== */
        // 1. Insertion at the END, when array is NOT FULL(pretend)
        int[] arr = {23, 45, 54, 65, 76, 0, 0, 0, 0, 0}; // {23, 45, 54, 65, 76, _, _, _, _, _} pretend 0's as empty
        int logicalSize = 5;
        int actualSize = arr.length;
//        System.out.println(logicalSize);
//        System.out.println(actualSize);

        // insert '66' at the end
        // this means after the logicalSize
        arr[logicalSize] = 66;
        logicalSize++; // increase the logicalSize after inserting
        System.out.println(Arrays.toString(arr));

        /* ===================================================== */
        // 2. Insertion at the END, when array is FULL
        int[] brr = {23, 45, 54, 65, 76, 23, 45, 54, 65, 76};
        // insert '88' at the end
        int[] brr2 = new int[brr.length * 2]; // creating new array with 2 * brr.length
        // copying elements from brr to brr2
        for(int i = 0; i < brr.length; i++){
            brr2[i] = brr[i];
        }
        brr2[brr.length] = 77;
        System.out.println(Arrays.toString(brr2));

        /* ===================================================== */
        // 3. Insertion at the START, don't preserve ORDER of the array elements
        int[] crr = {1, 3, 4, 5, 6, 8, 9, 8, 0, 0, 0};
        int logicSize = 8;
        int fixedSize = 11;
        // insert '33' at start
//        System.out.println(Arrays.toString(crr)); // before inserting
        crr[logicSize] = crr[0];
        crr[0] = 33;
        logicSize++;
//        System.out.println(Arrays.toString(crr)); // after inserting

        // preserve ORDER of the array elements
        int[] drr = {1, 2, 3, 4, 5, 0, 0, 0};
        int lsize = 5;
        int fsize = 8;
        System.out.println(Arrays.toString(drr));
        // insert '8' at start
        for(int i = lsize; i > 0; i--){
            drr[i] = drr[i-1];
        }
        drr[0] = 8;
        lsize++;
        System.out.println(Arrays.toString(drr));

        /* ===================================================== */
        // 3. Insertion at any index, don't preserve ORDER of the array elements
        int[] err = {2, 3, 4, 5, 6, 7, 0, 0, 0, 0};
        int errlsize = 6;
        int errfsize = 10;
        System.out.println(Arrays.toString(err));
        // insert '88' at index 3
        int temp = err[3];
        err[3] = 88;
        err[errlsize] = temp;
        System.out.println(Arrays.toString(err));

        // preserve ORDER of the array elements
        int[] frr = {2, 3, 4, 5, 6, 7, 0, 0, 0, 0};
        int frrlsize = 6;
        System.out.println(Arrays.toString(frr));
        // insert '99' at index 3
        int insertIndex = 3;
        for(int i = frrlsize; i > insertIndex; i--){
            frr[i] = frr[i - 1];
        }
        frr[insertIndex] = 99;
        frrlsize++;
        System.out.println(Arrays.toString(frr));
    }
}
