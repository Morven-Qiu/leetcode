package src.leetcode.no503;

import java.util.Arrays;
import java.util.Stack;

/**
 * Given a circular array (the next element of the last element is the first element of the array), print the Next Greater Number for every element. The Next Greater Number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, output -1 for this number.
 * <p>
 * Example 1:
 * Input: [1,2,1]
 * Output: [2,-1,2]
 * Explanation: The first 1's next greater number is 2;
 * The number 2 can't find next greater number;
 * The second 1's next greater number needs to search circularly, which is also 2.
 * Note: The length of given array won't exceed 10000.
 */
public class Solution2 {

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length, next[] = new int[n];
        Arrays.fill(next, -1);
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < n * 2; i++) {
            int value = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < value) {
                next[stack.pop()] = value;
            }
            if (i < n) {
                stack.push(i);
            }
        }
        return next;
    }


    public static void main(String[] args) {
        Solution2 solution1 = new Solution2();
        int[] array = new int[]{2, 2, 3};
        int[] result = solution1.nextGreaterElements(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println("value = [" + result[i] + "]");

        }
    }
}
