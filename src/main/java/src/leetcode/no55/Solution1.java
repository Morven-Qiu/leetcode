package src.leetcode.no55;


/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Determine if you are able to reach the last index.
 * <p>
 * Example 1:
 * <p>
 * Input: [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2:
 * <p>
 * Input: [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum
 * jump length is 0, which makes it impossible to reach the last index.
 */
public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] a = {2, 3, 1, 1, 4};
       // Assert.that(solution1.canJump(a), "a failed");
        int[] b = {3, 2, 1, 0, 4};
       // Assert.that(solution1.canJump(b) == false, "b failed");
        int[] c = {1};
       // Assert.that(solution1.canJump(c) == true, "c failed");
        int[] d = {1, 2};
        //Assert.that(solution1.canJump(d) == true, "d failed");
        int[] e = {2, 5, 0, 0};
       // Assert.that(solution1.canJump(e) == true, "e failed");
    }

    public boolean canJump(int[] nums) {
        int length = nums.length;
        int last = length - 1;
        for (int i = length - 2; i >= 0; i--) {
            if(i + nums[i] >= last){
                last = i;
            }
        }
        return last <= 0;
    }


}
