package src.leetcode.no121;

public class Solution3 {

    public static void main(String[] args) {
        Solution3 solution1 = new Solution3();

        int[] arr = {7, 6, 4, 3, 1};
        int result = solution1.maxProfit(arr);
        System.out.println("args = [" + result + "]");

        int[] arr1 = {2, 4, 1};
        int result1 = solution1.maxProfit(arr1);
        System.out.println("args = [" + result1 + "]");

        int[] arr2 = {7, 1, 5, 3, 6, 4};
        int result12 = solution1.maxProfit(arr2);
        System.out.println("args = [" + result12 + "]");

    }

    public int maxProfit(int[] prices) {
        int len = prices.length;
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < len; i++) {
            if (prices[i] < min) {
                min = prices[i];
                System.out.println("current min value = [" + min + "]");
            } else {
                if (prices[i] - min > profit) {
                    profit = prices[i] - min;
                }
            }
        }
        return profit;
    }
}
