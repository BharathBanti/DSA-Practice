package phase_02;

import java.util.Arrays;

public class ReversingAnArray {
    public static void main(String[] args){
        // REVERSING AN ARRAY

        /* ===================================================== */
        // 1. Reversing TOTAL array
        int[] arr = {2, 4, 6, 3, 7, 1, 5, 8};
        System.out.println(Arrays.toString(arr));
        // TWO-POINTER technique
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));

        /* ===================================================== */
        // 1. Reversing 'k' elements in array
        int[] nums = {2, 4, 6, 3, 7, 1, 5, 8};
        // reverse the elements only from index 2 to 6
        int left = 2;
        int right = 6;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
