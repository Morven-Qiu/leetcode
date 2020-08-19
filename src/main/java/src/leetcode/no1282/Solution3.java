package src.leetcode.no1282;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author fhqiu
 * @since 2020-08-18 15:40
 */
public class Solution3 {

    public static void main(String[] args) {
        int[] a = {2, 1, 3, 3, 3, 2};
        Solution3 solution1 = new Solution3();
        //System.out.println(solution1.groupThePeople(a));


        int[] b = {3, 3, 3, 3, 3, 1, 3};
        //System.out.println(solution1.groupThePeople(b));


        int[] c = {1, 1, 1, 1, 1, 1};
        System.out.println(solution1.groupThePeople(c));

        Map<Integer, List<Integer>> result = IntStream.range(0, c.length)
                .boxed()
                .collect(Collectors.groupingBy(i -> c[i]));
        System.out.println(result);

        System.out.println(1 / 3);

    }


    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        return IntStream.range(0, groupSizes.length)
                .boxed()
                .collect(Collectors.groupingBy(i -> groupSizes[i]))
                .entrySet()
                .stream()
                .flatMap(entry ->
                        Stream.iterate(0, i ->
                                {
                                    System.out.println("===================== iiiiiiiiiiiiiiiiiii is " + i);
                                    return i + entry.getKey();
                                }

                        ).limit(entry.getValue().size() / entry.getKey())
                                .map(j -> {
                                            System.out.println("===================== j is " + j);
                                            return entry.getValue().subList(j, j + entry.getKey());
                                        }
                                )
                )
                .collect(Collectors.toList());
    }
}
