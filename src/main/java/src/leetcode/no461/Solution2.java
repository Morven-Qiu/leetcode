package src.leetcode.no461;

/**
 * Created by morven on 2018/6/8.
 */
public class Solution2 {

    public static void main(String[] args) {
        int x = 1, y = 4;
        System.out.println(  hammingDistance(x, y));
    }


    public static int hammingDistance(int x, int y) {
        String  result  =  Integer.toBinaryString (x^y);
        int count = 0;
        for(int i = 0; i < result.toCharArray().length ; i++){
            if(result.toCharArray()[i] == '1'){
                count ++;
            }
        }
        return count;
    }
}
