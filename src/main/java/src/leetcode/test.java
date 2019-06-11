package src.leetcode;

import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {

    public static void main(String[] args) {
        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
        Map<String, String> a = locales.collect(Collectors.toMap(Locale::getDisplayLanguage, l -> l.getDisplayLanguage(l), (ex, ne) -> ex));
        System.out.println(a.size());
    }
}
