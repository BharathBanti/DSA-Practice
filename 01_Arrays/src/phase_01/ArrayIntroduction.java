package phase_01;

public class ArrayIntroduction {
    public static void main(String[] args){
        System.out.println("Hello DSA");
        System.out.println("Arrays - An array is a collection of similar type of elements" +
                " stored in a contiguous memory locations.");

        // 1. Array declaration - object in heap isn't created yet.
        int[] arr; // valid
        int brr[]; // valid
//        []int crr; // invalid
//        [4]int drr; // invalid

        int[][] err; // valid
        int frr[][]; // valid
//        [][]int grr; // invalid
//        [3][3]int hrr; // invalid

        int[] irr[][]; // valid
        int[][] jrr[]; // valid
        int[][][] krr[]; // valid
        int lrr[][][]; // valid

        // 2. Array creation - object in heap is created now
        int[] mrr = new int[5]; // size is mandatory and default values are zero(int type)
        int[] nrr = new int[0]; // empty array, length = 0;
        System.out.println(nrr.length); // 0
        System.out.println(mrr.length); // 5


    }
}
