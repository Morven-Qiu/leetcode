package src.leetcode.no136;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author fhqiu
 * @since 2020-09-04 16:57
 */
public class Solution1 {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1, 5};
        System.out.println(singleNumber(a));
    }

    public static int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (map.get(temp) == null) {
                map.put(temp, 1);
            } else {
                map.put(temp, 2);
            }
        }

        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            if (set.getValue() == 1) {
                return set.getKey();
            }
        }
        return 0;

    }
}
