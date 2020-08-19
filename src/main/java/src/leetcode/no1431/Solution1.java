package src.leetcode.no1431;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhqiu
 * @since 2020-08-18 10:13
 */
public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] a = {2, 3, 5, 1, 3};
        List<Boolean> result = solution1.kidsWithCandies(a, 3);

        System.out.println(result);


        int[] b = {4, 2, 1, 1, 2};
        List<Boolean> result1 = solution1.kidsWithCandies(b, 1);

        System.out.println(result1);
    }


    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();

        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                list.add(Boolean.TRUE);
            } else {
                list.add(Boolean.FALSE);
            }
        }

        return list;

    }
}
