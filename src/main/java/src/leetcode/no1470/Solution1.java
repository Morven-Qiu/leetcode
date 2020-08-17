package src.leetcode.no1470;

/**
 * @author fhqiu
 * @since 2020-08-17 15:14
 * <p>
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * <p>
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */
public class Solution1 {

    public static void main(String[] args) {
        int[] a = {2, 5, 1, 3, 4, 7};
        Solution1 solution1 = new Solution1();
        int[] b = solution1.shuffle(a, 3);
        for (int i = 0; i < b.length; i++) {
           // System.out.print(b[i]);
        }

        int[] c = {1,2,3,4,4,3,2,1};

        Solution1 solution2 = new Solution1();
        int[] d = solution2.shuffle(c, 4);
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i]);
        }
    }

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length / 2; i++) {
            result[i*2] = nums[i];
            result[i*2+1] = nums[n + i];
        }
        return result;
    }
}
