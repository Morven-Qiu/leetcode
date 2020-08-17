package src.leetcode.no45;


/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Your goal is to reach the last index in the minimum number of jumps.
 * <p>
 * Example:
 * <p>
 * Input: [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2.
 * Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Note:
 * <p>
 * You can assume that you can always reach the last index.
 */
public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        //Assert.that(solution1.jump(new int[]{2, 3, 1, 1, 4}) == 2, "failed");
    }

    public int jump(int[] nums) {
        int len = nums.length;
        int result = 0;
        int longest = 0;
        int end = 0;
        for (int i = 0; i < len - 1; i++) {
            longest = Math.max(longest, nums[i] + i);
            System.out.println(end);
            System.out.println(i);
            if (i == end) {
                result++;
                end = longest;
            }
        }
        return result;
    }
}
