package src.leetcode.no673;

public class Solution1 {

    public int findNumberOfLIS(int[] nums) {
        int n = nums.length, res = 0, max_len = 0;
        int[] len = new int[n], cnt = new int[n];
        for (int i = 0; i < n; i++) {
            len[i] = cnt[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (len[i] == len[j] + 1) {
                        cnt[i] = cnt[i] + cnt[j];
                    } else if (len[i] < len[j] + 1) {
                        len[i] = len[j] + 1;
                        cnt[i] = cnt[j];
                    }
                }
            }
            if (max_len == len[i]) {
                res += cnt[i];
            } else if (max_len < len[i]) {
                max_len = len[i];
                res = cnt[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 4, 7};
        Solution1 solution1 = new Solution1();

        System.out.println(solution1.findNumberOfLIS(arr));
    }
}
