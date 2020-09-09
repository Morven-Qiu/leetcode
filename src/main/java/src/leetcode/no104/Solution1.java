package src.leetcode.no104;

import src.leetcode.util.TreeNode;

/**
 * @author fhqiu
 * @since 2020-09-04 16:44
 */
public class Solution1 {

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        treeNode.left = left;
        treeNode.right = right;

        right.right = new TreeNode(5);

        Solution1 solution1 = new Solution1();

        System.out.println(solution1.maxDepth(treeNode));

    }

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int l = maxDepth(root.left);

        int r = maxDepth(root.right);

        return l > r ? l + 1 : r + 1;


    }
}
