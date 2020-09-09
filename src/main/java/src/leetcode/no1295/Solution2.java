package src.leetcode.no1295;

/**
 * @author fhqiu
 * @since 2020-09-01 11:03
 */
public class Solution2 {

    public static void main(String[] args) {

        int[] array = {123, 345, 2, 6, 7896};
        Solution2 solution1 = new Solution2();
        System.out.println(solution1.findNumbers(array));
    }


    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int a = 1;
            while (temp / 10 > 0) {
                a++;
                temp = temp / 10;
            }
            if (a > 0 && a % 2 == 0) {
                result++;
            }
        }
        return result;
    }

}
