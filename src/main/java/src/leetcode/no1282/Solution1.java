package src.leetcode.no1282;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fhqiu
 * @since 2020-08-18 13:45
 */
public class Solution1 {

    public static void main(String[] args) {
        int[] a = {2, 1, 3, 3, 3, 2};
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.groupThePeople(a));


        int[] b = {3, 3, 3, 3, 3, 1, 3};
        System.out.println(solution1.groupThePeople(b));


        int[] c = {2, 2, 1, 1, 1, 1, 1, 1};
        System.out.println(solution1.groupThePeople(c));
    }

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int temp = groupSizes[i];
            List<Integer> list = map.get(temp);
            if (list == null) {
                list = new ArrayList<>();
                map.put(temp, list);
            }
            list.add(i);
        }

        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> value = entry.getValue();
            if(value.size() <= entry.getKey()){
                lists.add(value);
            }else{
                for (int i = 0; i < entry.getValue().size(); i++) {
                    list.add(entry.getValue().get(i));
                    if (list.size() == entry.getKey()) {
                        lists.add(list);
                        list = new ArrayList<>();
                    }
                }
            }

        }
        return lists;
    }
}
