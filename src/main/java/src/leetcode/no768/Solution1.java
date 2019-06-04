package src.leetcode.no768;


import java.util.Arrays;

/**
 * This question is the same as "Max Chunks to Make Sorted" except the integers of the given array are not necessarily distinct, the input array could be up to length 2000, and the elements could be up to 10**8.
 * <p>
 * Given an array arr of integers (not necessarily distinct), we split the array into some number of "chunks" (partitions), and individually sort each chunk.  After concatenating them, the result equals the sorted array.
 * <p>
 * What is the most number of chunks we could have made?
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [5,4,3,2,1]
 * Output: 1
 * Explanation:
 * Splitting into two or more chunks will not return the required result.
 * For example, splitting into [5, 4], [3, 2, 1] will result in [4, 5, 1, 2, 3], which isn't sorted.
 * Example 2:
 * <p>
 * Input: arr = [2,1,3,4,4]
 * Output: 4
 * Explanation:
 * We can split into two chunks, such as [2, 1], [3, 4, 4].
 * However, splitting into [2, 1], [3], [4], [4] is the highest number of chunks possible.
 */
public class Solution1 {

    public int maxChunksToSorted(int[] arr) {

        int n = arr.length;
        int[] minOfRight = new int[n];
        minOfRight[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            minOfRight[i] = Math.min(arr[i], minOfRight[i + 1]);

        }
        System.out.println("arr = [" + Arrays.toString(minOfRight) + "]");
        int k = 0,max = 0;
        for (int i = 0; i < n - 1; i++) {
            max = Math.max(max, arr[i]);
            if (max <= minOfRight[i + 1]) {
                k++;
            }
        }
        return k + 1;

    }

    public static void main(String[] args) {
        Solution1 ins = new Solution1();
        int[] arr = {2, 1, 3, 4, 4};
        int result = ins.maxChunksToSorted(arr);
        System.out.println("@@ " + result);
    }
}
