package phase_02;

/*
Write a function that reverses a string. The input string is given as an
array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */

import java.util.Arrays;

public class LeetCode_344 {
    public static void main(String[] args){
        String str = "hello";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        int left = 0, right = chars.length - 1;
        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(chars));
    }
}
