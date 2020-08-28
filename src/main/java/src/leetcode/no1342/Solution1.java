package src.leetcode.no1342;

/**
 * @author fhqiu
 * @since 2020-08-20 14:06
 */
public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        System.out.println(solution1.numberOfSteps(14));

        System.out.println(solution1.numberOfSteps(8));

        System.out.println(solution1.numberOfSteps(123));
    }

    public int numberOfSteps(int num) {
        int result = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num--;
            }
            result++;
        }
        return result;
    }
}
