package src.leetcode.util;

import src.leetcode.no669.Solution;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    private static int depth(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int l = depth(treeNode.left);
        int r = depth(treeNode.right);
        System.out.println("current depth is l and r : {} " + l + "," + r);
        return l > r ? l + 1 : r + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(0);
        TreeNode right = new TreeNode(2);
        treeNode.left = left;
        treeNode.right = right;
        System.out.println("this tree node depth is {} and  " + TreeNode.depth(treeNode));
    }


    @Override
    public String toString() {
        return "tree value" + val + "left is " + left + "right is " + right;
    }
}
