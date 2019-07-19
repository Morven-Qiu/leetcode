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
public class Solution1 {

    public static void main(String[] args) {
        int[] arr = {7, 6, 4, 3, 1};
        Solution1 solution1 = new Solution1();
        int result = solution1.maxProfit(arr);
        System.out.println("args = [" + result + "]");

        int[] arr1 = {2, 4, 1};
        int result1 = solution1.maxProfit(arr1);
        System.out.println("args = [" + result1 + "]");

        int[] arr2 = {7,1,5,3,6,4};
        int result12 = solution1.maxProfit(arr2);
        System.out.println("args = [" + result12 + "]");

    }

    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 0) {
            return 0;
        }
        int max = 0;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if(prices[i]> prices[j]){
                    max = Math.max(prices[i] - prices[j], max);
                }
            }
        }
        return max;
    }
}
