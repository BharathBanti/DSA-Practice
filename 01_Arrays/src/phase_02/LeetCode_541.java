package phase_02;

/*
Given a string s and an integer k, reverse the first k characters for every 2k characters
counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less
than 2k but greater than or equal to k characters, then reverse the first k characters
and leave the other as original.

Example 1:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"

Example 2:
Input: s = "abcd", k = 2
Output: "bacd"
 */

import java.util.Arrays;

public class LeetCode_541 {
    public static void main(String[] args){
        String s = "abcdefg";
        int k = 8;
        char[] letters = s.toCharArray();
        System.out.println(Arrays.toString(letters));
        for(int i = 0; i < letters.length; i += (2*k)){
            int left = i;
            int right = Math.min(i + k - 1, letters.length - 1);
            while(left < right){
                char c = letters[left];
                letters[left] = letters[right];
                letters[right] = c;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(letters));
    }
}
