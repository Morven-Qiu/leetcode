package src.leetcode.no1480;

/**
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * <p>
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * <p>
 * How many possible unique paths are there?
 *
 * @author fhqiu
 * @since 2020-08-17 14:14
 */


public class Solution1 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 1,1};
        Solution1 solution1 = new Solution1();
        int[] result = solution1.runningSum(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(result[i]);
        }

    }

    public int[] runningSum(int[] nums) {
        int k = nums.length;
        int[] result = new int[k];
        int temp = 0;
        for (int i = 0; i < k; i++) {
            temp  =result[i] = temp  + nums[i];
        }
        return result;
    }
}
