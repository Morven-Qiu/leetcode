package src.leetcode.no1282;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fhqiu
 * @since 2020-08-18 15:29
 */
public class Solution2 {


    public static void main(String[] args) {
        int[] a = {2, 1, 3, 3, 3, 2};
        Solution2 solution1 = new Solution2();
        //System.out.println(solution1.groupThePeople(a));


        int[] b = {3, 3, 3, 3, 3, 1, 3};
        //System.out.println(solution1.groupThePeople(b));


        int[] c = {2, 2, 1, 1, 1, 1, 1, 1};
        System.out.println(solution1.groupThePeople(c));
    }

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int temp = groupSizes[i];
            List<Integer> list = map.get(temp);
            if (list == null) {
                list = new ArrayList<>();
                map.put(temp, list);
            }
            list.add(i);
            if (list.size() == temp) {
                lists.add(list);
                map.remove(temp);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (List<Integer> value : map.values()) {
            lists.add(value);
        }
        return lists;
    }
}
