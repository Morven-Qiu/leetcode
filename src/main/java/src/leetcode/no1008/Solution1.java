package src.leetcode.no1008;

import src.leetcode.util.TreeNode;

/**
 * @author fhqiu
 * @since 2020-08-25 16:20
 */
public class Solution1 {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(8);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(10);
        treeNode.left = left;
        treeNode.right = right;

        TreeNode left1 = new TreeNode(1);
        TreeNode right1 = new TreeNode(7);

        left.left = left1;
        left.right = right1;

        right.right = new TreeNode(12);

        int[] a = {8, 5, 1, 7, 10, 12};

        Solution1 s = new Solution1();

        System.out.println(s.bstFromPreorder(a));


    }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for (int x : preorder) {
            root = insertTree(root, x);
        }
        return root;
    }

    public TreeNode insertTree(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }
        if (node.val > val) {
            node.left = insertTree(node.left, val);
        }
        if (node.val < val) {
            node.right = insertTree(node.right, val);
        }
        return node;
    }
}
