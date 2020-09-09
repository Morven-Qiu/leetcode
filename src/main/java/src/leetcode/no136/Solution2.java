package src.leetcode.no136;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fhqiu
 * @since 2020-09-04 16:57
 */
public class Solution2 {

    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(singleNumber(a));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1){
            return nums[0];
        }
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        if (nums[nums.length - 2] != nums[nums.length-1]) {
            return nums[nums.length-1];
        }
        for (int i = 1; i < nums.length - 1; i++) {
            int temp = nums[i];
            if (temp != nums[i + 1] && temp != nums[i - 1]) {
                return temp;
            }
        }
        return 0;
    }
}
