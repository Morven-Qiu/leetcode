package src.leetcode.no1365;

/**
 * @author fhqiu
 * @since 2020-08-28 13:56
 */
public class Solution2 {


    public static void main(String[] args) {
        Solution2 solution1 = new Solution2();

        int[] array = {8, 1, 2, 2, 3};
        int[] result = solution1.smallerNumbersThanCurrent(array);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }


    }


    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] preArray = new int[101];
        for (int i = 0; i < nums.length; i++) {
            preArray[nums[i]] = preArray[nums[i]] + 1;
        }
        int count = 0;
        for (int i = 0; i < preArray.length; i++) {
            int temp = preArray[i];
            preArray[i] = count;
            count = temp + count;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = preArray[nums[i]];
        }
        return nums;
    }
}
