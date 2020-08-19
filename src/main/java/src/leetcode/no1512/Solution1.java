package src.leetcode.no1512;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author fhqiu
 * @since 2020-08-19 16:22
 */
public class Solution1 {


    public static Stack<Integer> stack = new Stack<Integer>();

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        int[] a = {1, 2, 3, 1, 1, 3};

        //System.out.println(solution1.numIdenticalPairs(a));


        int[] b = {1, 1, 1, 1};

        System.out.println(solution1.numIdenticalPairs2(b));


        int[] c = {1, 2, 3};

        System.out.println(solution1.numIdenticalPairs2(c));



    }


    public int numIdenticalPairs(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result++;
                }
            }
        }
        return result;

    }

    public int numIdenticalPairs2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            Integer a = map.get(nums[i]);
            if (a == null) {
                map.put(nums[i], 1);
            } else {
                result += a;
                map.put(nums[i], a+1);
            }
        }
        return result;

    }


    private static void f(int[] shu, int targ, int cur) {
        // TODO Auto-generated method stub


        if (cur == targ) {
            //System.out.println(stack);
            return;
        }

        for (int i = 0; i < shu.length; i++) {
            System.out.println("ss");
            stack.add(shu[i]);
            f(shu, targ, cur + 1);
            stack.pop();

        }
    }
}
