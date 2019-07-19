package src.leetcode.no53;


/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Example:
 * <p>
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 * <p>
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("args = [" + solution1.maxSubArray(arr) + "]");

    }

    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int max = nums[0];
        for (int i = 0; i < length; i++) {
            int temp = nums[i];
            max = Math.max(max,temp);
            for (int j = i + 1; j < length; j++) {
                temp = nums[j] + temp;
                max = Math.max(max,temp);
            }
        }
        return max;
    }
}
