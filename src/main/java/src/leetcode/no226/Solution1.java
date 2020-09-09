package src.leetcode.no226;

import src.leetcode.util.TreeNode;

/**
 * @author fhqiu
 * @since 2020-09-09 14:44
 */
public class Solution1 {

    public static void main(String[] args) {


        TreeNode treeNode = new TreeNode(1);

        TreeNode treeNode2 = new TreeNode(2);


        TreeNode treeNode3 = new TreeNode(3);


        treeNode.right = treeNode2;
        treeNode.left = treeNode3;

        treeNode3.left = new TreeNode(4);
        treeNode3.right = new TreeNode(5);
        System.out.println(treeNode);
        System.out.println(invertTree(treeNode));


    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode treeNode = new TreeNode(root.val);
        treeNode.left = invertTree(root.right);
        treeNode.right = invertTree(root.left);
        return treeNode;
    }

}
