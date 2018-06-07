package src.leetcode.no829;

/**
 * Created by morven on 2018/6/6.
 */
public class Solution1 {

    public static void main(String[] args) {
        int reuslt = consecutiveNumbersSum(15);
        System.out.print(reuslt);
    }


    public static int consecutiveNumbersSum(int N) {
        int result = 0;
        for (int k = 1; k * (k + 1) <= 2 * N; k++) {
            if ((N - k * (k + 1) / 2) % k == 0) {
                result++;
            }
        }
        return result;
    }
}
