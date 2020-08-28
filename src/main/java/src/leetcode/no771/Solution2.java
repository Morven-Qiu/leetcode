package src.leetcode.no771;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fhqiu
 * @since 2020-08-20 13:41
 */
public class Solution2 {


    public static void main(String[] args) {
        Solution2 solution1 = new Solution2();

        System.out.println(solution1.numJewelsInStones("aA", "aAAbbb"));


        System.out.println(solution1.numJewelsInStones("z", "ZZ"));
    }

    public int numJewelsInStones(String J, String S) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < J.length(); i++) {
            map.put(J.charAt(i), 0);
        }
        for (int i = 0; i < S.length(); i++) {
            if (map.containsKey(S.charAt(i))) {
                result++;
            }
        }
        return result;
    }
}
