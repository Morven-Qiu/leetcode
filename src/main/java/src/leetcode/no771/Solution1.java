package src.leetcode.no771;

/**
 * @author fhqiu
 * @since 2020-08-20 13:41
 */
public class Solution1 {


    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        System.out.println(solution1.numJewelsInStones("aA", "aAAbbb"));


        System.out.println(solution1.numJewelsInStones("z", "ZZ"));
    }

    public int numJewelsInStones(String J, String S) {
        int result = 0;
        //直接使用String.charAt(index)更节约时间
        char[] jChar = J.toCharArray();
        char[] sChar = S.toCharArray();

        for (int i = 0; i < jChar.length; i++) {
            for (int j = 0; j < sChar.length; j++) {
                if (jChar[i] == sChar[j]) {
                    result++;
                }
            }
        }
        return result;
    }
}
