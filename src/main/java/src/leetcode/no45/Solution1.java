package src.leetcode.no45;

import sun.jvm.hotspot.utilities.Assert;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        Assert.that(solution1.jump(new int[]{2,3,1,1,4}) == 2,"failed");
    }

    public int jump(int[] nums) {
        int len = nums.length;
        int result= 0;
        int longest = 0;
        int end = 0;
        for(int i = 0 ; i< len-1; i ++){
            longest = Math.max(longest,nums[i]+i);
            if(i ==  end){
                result ++;
                end = longest;
            }
        }
        return result;
    }
}
