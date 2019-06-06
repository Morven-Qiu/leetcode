package src.leetcode.no279;

import java.util.Arrays;

/**
 * Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 12
 * Output: 3
 * Explanation: 12 = 4 + 4 + 4.
 * Example 2:
 * <p>
 * Input: n = 13
 * Output: 2
 * Explanation: 13 = 4 + 9.
 */
public class Solution1 {

    public int numSquares(int n) {

        int[] pc = new int[n + 1];
        Arrays.fill(pc, Integer.MAX_VALUE);
        pc[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                pc[i] = Math.min(pc[i], pc[i - j * j] + 1);
            }
        }
        return pc[n];
//        int i = 0;
//        while (n != 0){
//            n = n -maxSquareNumber(n);
//            i++;
//        }
//        return i ;
    }

//    public int maxSquareNumber(int total) {
//        int sum = 0;
//        int i = 1;
//        while (sum < total) {
//            i++;
//            sum = sum + (2 * i - 1);
//
//        }
//        return (i - 1)*(i-1);
//    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.numSquares(2111));
    }
}
