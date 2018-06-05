package src.leetcode.no389;

/**
 * Created by morven on 2018/6/5.
 */
public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        String s = "abcd";
        String t = "abcde";
        System.out.println(solution1.findTheDifference(s, t));

    }

    public String findTheDifference(String s, String t) {
        StringBuffer st = new StringBuffer();
        t.chars().forEach(item -> {
            if (s.chars().noneMatch(target -> {
                return target == item;
            })) {
                st.append((char)item);
            }
        });
        return st.toString();
    }
}
