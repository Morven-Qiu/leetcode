package src.leetcode.no205;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by morven on 2018/6/12.
 */
public class Solution1 {

    public static void main(String[] args) {
        String s = "ac";
        String t = "aa";
        System.out.println(isIsomorphic(s,t));
        System.out.println(Period.between(LocalDate.parse("2018-06-15"),LocalDate.now()).getDays());
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map.containsKey(a)) {
                if (map.get(a).toString().equals(String.valueOf(b))) {
                    continue;
                } else {
                    return false;
                }
            }else {
                if(!map.containsValue(b)){
                    map.put(a, b);
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
