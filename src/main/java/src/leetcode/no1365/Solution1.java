package src.leetcode.no1365;

/**
 * @author fhqiu
 * @since 2020-08-28 10:39
 */
public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        int[] array = {8, 1, 2, 2, 3};
        int[] result = solution1.smallerNumbersThanCurrent(array);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }


    }


    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int k = 0;
            for (int j = 0; j < length; j++) {
                if (i != j && nums[j] < nums[i]) {
                    k++;
                }
            }
            result[i] = k;
        }
        return result;
    }
}
