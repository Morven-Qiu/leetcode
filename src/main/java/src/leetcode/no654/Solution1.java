package src.leetcode.no654;

import src.leetcode.util.TreeNode;

/**
 * @author fhqiu
 * @since 2020-08-26 14:02
 */
public class Solution1 {

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 6, 0, 5};
        Solution1 solution1 = new Solution1();

        System.out.println(solution1.constructMaximumBinaryTree(nums));


    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return new TreeNode(1);
    }
}
