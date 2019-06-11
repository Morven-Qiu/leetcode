package src.leetcode.no461;

/**
 * Created by morven on 2018/6/8.
 */
public class Solution3 {

    public static void main(String[] args) {
        int x = 1, y = 4;
        System.out.println(  hammingDistance(x, y));
    }


    public static int hammingDistance(int x, int y) {
       return Integer.bitCount(x^y);
    }
}
