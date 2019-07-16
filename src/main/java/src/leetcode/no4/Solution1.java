package src.leetcode.no4;


/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * You may assume nums1 and nums2 cannot be both empty.
 * <p>
 * Example 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * The median is 2.0
 * Example 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * The median is (2 + 3)/2 = 2.5
 */
public class Solution1 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0f;
        int m = nums1.length;
        int n = nums2.length;
        if(m + n % 2 == 0){
            //取中间两个数
            if(m > 1){
                System.out.println("nums1 = [" + nums1 + "], nums2 = [" + nums2 + "] ");


            }
        }else{
            //取一个数
        }



        return result;
    }

    public static void main(String[] args){
        int[] num1 =new int[]{1,3};
        int[] num2 =new int[]{2};


        Solution1 solution1 = new Solution1();
        double result =  solution1.findMedianSortedArrays(num1,num2);
        System.out.println("args = [" + result + "]");
    }
}
