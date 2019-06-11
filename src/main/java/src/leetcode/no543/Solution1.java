package src.leetcode.no543;

import src.leetcode.util.TreeNode;

public class Solution1 {

    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        maxLength(root);
        return max;
    }

    public int maxLength(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxLength(root.left);
        int right = maxLength(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(1);
        TreeNode a3 = new TreeNode(1);
        a1.left = a2;
        a2.left = a3;

        a1.right = new TreeNode(1);

        Solution1 s = new Solution1();


        System.out.println(s.diameterOfBinaryTree(a1));

    }
}
