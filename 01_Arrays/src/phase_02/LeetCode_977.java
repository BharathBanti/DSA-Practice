package phase_02;

import java.util.Arrays;

/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares
of each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */
public class LeetCode_977 {
    public static void main(String[] args){
        int[] nums = {-4, -1, 0, 3, 10};
        int[] ans = new int[nums.length];

        int left = 0, right = nums.length - 1;
        int ansIndex = ans.length - 1;

        while(left < right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare > rightSquare){
                ans[ansIndex] = leftSquare;
                left++;
            }
            else{
                ans[ansIndex] = rightSquare;
                right--;
            }
            ansIndex--;
        }

        System.out.println(Arrays.toString(ans));
    }
}
