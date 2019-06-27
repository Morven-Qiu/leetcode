package src.leetcode.no503;

import java.util.Arrays;
import java.util.Stack;

public class Solution2 {

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length, next[] = new int[n];
        Arrays.fill(next, -1);
        Stack<Integer> stack = new Stack<>(); // index stack
        for (int i = 0; i < n * 2; i++) {
            int num = nums[i % n];
            System.out.print("index = [ " + i % n + " ] , current value  = [" + num + "] ");
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                next[stack.pop()] = num;
            }
            if (i < n) {
                stack.push(i);
            }
            System.out.println("and  stack's index value is = [" + stack + "] ");
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
