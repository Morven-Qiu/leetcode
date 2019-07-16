package src.leetcode.no665;

import java.util.Arrays;

/**
 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
 * <p>
 * We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 * <p>
 * Example 1:
 * Input: [4,2,3]
 * Output: True
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 * Example 2:
 * Input: [4,2,1]
 * Output: False
 * Explanation: You can't get a non-decreasing array by modify at most one element.
 * Note: The n belongs to [1, 10,000].
 */
public class Solution1 {

    public static void main(String[] args) {
        int[] temp = new int[]{3,4,2,3};
        Solution1 solution1 = new Solution1();
        System.out.println("args = [" + solution1.checkPossibility(temp) == false + "]");
        System.out.println("args = [" + (solution1.checkPossibility(new int[]{2,2,3,2,4}) == true) + "]");
    }

    public boolean checkPossibility(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length - 1 && num < 2; i++) {
            if (nums[i] > nums[i + 1]) {
                num++;
                if(i - 1 < 0 || nums[i-1] <= nums[i+1]){
                    nums[i] = nums[i+1];
                }else{
                    nums[i +1 ] =  nums[i];
                }
            }
        }
        return num < 2;
    }
}
