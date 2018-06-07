package src.leetcode.no461;

/**
 * Created by morven on 2018/6/7.
 */
public class Solution1 {

    public static void main(String[] args) {
        int x = 1, y = 4;
        System.out.println("ss" + hammingDistance(x, y));
    }


    public static int hammingDistance(int x, int y) {

        char[] a = Integer.toBinaryString(x).toCharArray();
        char[] b = Integer.toBinaryString(y).toCharArray();
        int max = Math.max(a.length, b.length);
        int count = 0;
        String c = String.valueOf(a);
        String d = String.valueOf(b);
        if(a.length > b.length){
           for(int i = 0;i < max ; i++){
               if(i > b.length -1){
                   d = "0"+d;
               }
           }
        }
        if(a.length<= b.length){
            for(int i = 0;i < max ; i++){
                if(i > a.length -1){
                    c = "0"+c;
                }
            }
        }
        for (int i = 0; i < max; i++) {
            if (c.toCharArray()[i] != d.toCharArray()[i]) {
                count++;
            }
        }
        return count;
    }
}
