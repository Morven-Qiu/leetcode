package src.leetcode.no121;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * <p>
 * Note that you cannot sell a stock before you buy one.
 * <p>
 * Example 1:
 * <p>
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 * <p>
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
public class Solution2 {

    public static void main(String[] args) {
        Solution2 solution1 = new Solution2();

//        int[] arr = {7, 6, 4, 3, 1};
//        int result = solution1.maxProfit(arr);
//        System.out.println("args = [" + result + "]");
//
//        int[] arr1 = {2, 4, 1};
//        int result1 = solution1.maxProfit(arr1);
//        System.out.println("args = [" + result1 + "]");

        int[] arr2 = {7, 1, 5, 3, 6, 4};
        int result12 = solution1.maxProfit(arr2);
        System.out.println("args = [" + result12 + "]");

    }

    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for (int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i - 1]);
            System.out.print("maxCur = [" + maxCur + "] ,");
            maxSoFar = Math.max(maxCur, maxSoFar);
            System.out.println("maxSoFar [" + maxSoFar + "]");
        }
        return maxSoFar;
    }
}
