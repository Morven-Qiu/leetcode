package src.leetcode.no1395;

/**
 * @author fhqiu
 * @since 2020-08-21 17:03
 */
public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] rating = {2, 5, 3, 4, 1};
        System.out.println(solution1.numTeams(rating));

        int[] rating2 = {2,1,3};
        System.out.println(solution1.numTeams(rating2));

        int[] rating3 = {1,2,3,4};
        System.out.println(solution1.numTeams(rating3));
    }

    public int numTeams(int[] rating) {
        int result = 0;
        int len = rating.length;
        for (int i = 0; i < len; i++) {
            int soldier1 = rating[i];
            for (int j = i; j < len; j++) {
                int soldier2 = rating[j];

                for (int k = j; k < len; k++) {
                    int soldier3 = rating[k];

                    if (soldier1 > soldier2 && soldier2 > soldier3) {
                        result++;
                    }

                    if (soldier2 > soldier1 && soldier3 > soldier2) {
                        result++;
                    }

                }
            }

        }
        return result;
    }
}
