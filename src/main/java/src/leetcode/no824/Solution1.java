package src.leetcode.no824;

public class Solution1 {


    public static void main(String[] args) {
        String input = "The quick brown fox jumped over the lazy dog";
        System.out.printf(toGoatLatin(input));
    }

    public static String toGoatLatin(String S) {
        String[] target = S.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < target.length; i++) {
            String item = target[i];
            String first = item.substring(0, 1);    
            if (first.equalsIgnoreCase("a") || first.equalsIgnoreCase("e") || first.equalsIgnoreCase("i") || 
                    first.equalsIgnoreCase("o") || first.equalsIgnoreCase("u")) {
                item = item + "ma";
            } else {
                item = item.substring(1) + first + "ma";
            }
            for (int j = 0; j <= i; j++) {
                item = item + "a";
            }
            stringBuilder.append(item).append(" ");
        }
        return stringBuilder.toString().substring(0, stringBuilder.length() - 1);
    }

}
