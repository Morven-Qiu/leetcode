package src.leetcode.no830;

import java.util.ArrayList;
import java.util.List;

/**
 * In a string S of lowercase letters, these letters form consecutive groups of the same character.
 * <p>
 * For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".
 * <p>
 * Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.
 * <p>
 * The final answer should be in lexicographic order.
 * <p>
 * Example 1:
 * <p>
 * Input: "abbxxxxzzy"
 * Output: [[3,6]]
 * Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
 * Example 2:
 * <p>
 * Input: "abc"
 * Output: []
 * Explanation: We have "a","b" and "c" but no large group.
 * Example 3:
 * <p>
 * Input: "abcdddeeeeaabbbcd"
 * Output: [[3,5],[6,9],[12,14]]
 */
public class Solution1 {


    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<>();
        if (S == null ||  S.length() < 3) {
            return result;
        }
        char[] a = S.toCharArray();
        int k = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                k++;
            } else {
                if (k > 2) {
                    List<Integer> l = new ArrayList<>();
                    l.add(i - k);
                    l.add(i - 1);
                    result.add(l);
                }
                k = 1;
            }
        }
        if(k > 2){
            List<Integer> l = new ArrayList<>();
            l.add(a.length - k);
            l.add(a.length - 1);
            result.add(l);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        String aa = "cccckkkss  ";
        System.out.println("args = [" + solution1.largeGroupPositions(aa) + "]");
    }

}
