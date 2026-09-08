package phase_01;

import java.util.Scanner;

public class InitializationAndAccessing {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        // Initialization
        // 1. Static initialization
        int[] arr = {2, 4, 56, 3, 2};

        // 2. Dynamic initialization
        int[] brr = new int[5];
        brr[0] = 43;
        brr[1] = 52;
        brr[2] = 99;
        brr[3] = 78;
        brr[4] = 33;

        // 3. Initialization using loops
        int[] crr = new int[5];
//        for(int i = 0; i < crr.length; i++){
//            System.out.print("Enter array element: ");
//            crr[i] = scanner.nextInt();
//        }

        // 4. Partial initialization
        int[] arr2 = new int[5];
        arr2[3] = 454;
        arr[1] = 534;
        // now: arr2 = [0, 534, 0, 454, 0]

        // Accessing the array elements
        // 1. Using index
        int[] a = {2, 432, 566, 354, 2};
//        System.out.println(a[3]);
//        System.out.println(a[1]);
//        System.out.println(a[5]); // index 5 doesn't exist for a

        // 2. Using loops
        // for loop
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // while loop
        int x = 0;
        while(x < a.length){
            System.out.print(a[x++] + " ");
        }
        System.out.println();

        // 3. Using for each loop
        for(int num : a){
            System.out.print(num + " ");
        }
    }
}
