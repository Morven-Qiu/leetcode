package src.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author fhqiu
 * @since 2020-08-18 16:16
 */
public class StreamTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5, 9);

        System.out.println(list.stream().limit(3).collect(Collectors.toList()));

        System.out.println(list.stream().distinct().collect(Collectors.toList()));

        System.out.println(list.stream().map(item -> {
            return item + 1;
        }).collect(Collectors.toList()));


        List<String> words = Arrays.asList("Hel", "Word");
        List<String[]> w = words.stream().map(word -> word.split("")).collect(Collectors.toList());
        System.out.println(w);

        List<Stream<String>> w1 = words.stream().map(word -> word.split("")).map(Arrays::stream).collect(Collectors.toList());
        System.out.println(w1);

        List<String> w3 = words.stream().map(word -> word.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(w3);

        List<Integer> meta = Arrays.asList(1, 2, 3, 4);
        int sum = meta.stream().reduce(0, (a, b) -> {
            return a + b;
        });
        int sum1 = meta.stream().reduce(0, Integer::sum);
        System.out.println("sum ," + sum1);

    }
}
