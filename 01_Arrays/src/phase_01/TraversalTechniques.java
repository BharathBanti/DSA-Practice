package phase_01;

import java.util.Scanner;

public class TraversalTechniques {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        // Traversal Techniques

//        int[] arr = new int[10];

//        for(int i = 0; i < arr.length; i++){
//            arr[i] = scanner.nextInt();
//        }

        int[] arr = {4, 5, 6, 8, 5, 2, 1, 3, 7, 9};

        // 1. Forward traversing
        System.out.println("Forward traversing");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 2. Backward traversing
        System.out.println("Backward traversing");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        // 3. while loop
        System.out.println("while loop");
        int x = 0;
        while(x < arr.length){
            System.out.print(arr[x++] + " ");
        }
        System.out.println();

        // 4. for each loop
        System.out.println("for each loop");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        // 5. Two-Pointer technique
        System.out.println("Two-Pointer technique");
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            System.out.print(arr[left++] + " " + arr[right--] + " ");
        }
        System.out.println();

        // 6. 2D-Array traversal
        System.out.println("2D-Array traversal");
        // int[rows][columns] array;
        int[][] array2 = {{2, 4, 5, 8}, {4, 5, 9, 0}};
        for(int i = 0; i < array2.length; i++){
            for(int j = 0; j < array2[i].length; j++){
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        // 6. 3D-Array traversal
        System.out.println("3D-Array traversal");
        // int[floor][rows][columns] array;
        int[][][] array3 = {{{2, 4, 5, 8}, {4, 5, 9, 0}, {4, 3, 8, 5}},
                {{4, 3, 8, 5}, {2, 4, 5, 8}, {4, 5, 9, 0}}};
        for(int i = 0; i < array3.length; i++){
            for(int j = 0; j < array3[i].length; j++){
                for(int k = 0; k < array3[i][j].length; k++){
                    System.out.print(array3[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
