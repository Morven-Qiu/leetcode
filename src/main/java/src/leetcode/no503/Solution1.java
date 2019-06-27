package src.leetcode.no503;

public class Solution1 {

    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp = result[i] =  nums[i] ;
            for (int k = i; k < nums.length; k++) {
                if (nums[k] > temp) {
                    result[i] = nums[k];
                    break;
                }
            }
            if (result[i] ==temp) {
                for (int k = 0; k < i; k++) {
                    if (nums[k] > temp) {
                        result[i] = nums[k];
                        break;
                    }
                }
            }
            if(result[i] == temp){
                result[i] = -1;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] array = new int[]{2, 2, 3};
        int[] result = solution1.nextGreaterElements(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println("value = [" + result[i] + "]");
        }
    }
}
