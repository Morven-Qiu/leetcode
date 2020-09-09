package src.leetcode.no1295;

/**
 * @author fhqiu
 * @since 2020-09-01 11:03
 */
public class Solution1 {

    public static void main(String[] args) {

        int[] array = {12,345,2,6,7896};
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.findNumbers(array));
    }


    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (String.valueOf(temp).length()% 2 == 0) {
                result++;
            }
        }
        return result;
    }

}
