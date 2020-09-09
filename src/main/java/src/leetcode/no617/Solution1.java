package src.leetcode.no617;

import src.leetcode.util.TreeNode;

/**
 * @author fhqiu
 * @since 2020-09-04 13:21
 */
public class Solution1 {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        treeNode.left = left;
        treeNode.right = right;

        TreeNode treeNode1 = new TreeNode(2);
        TreeNode left1 = new TreeNode(3);
        TreeNode right1 = new TreeNode(4);
        treeNode1.left = left1;
        treeNode1.right = right1;
        Solution1 s = new Solution1();

        System.out.println(treeNode);

        System.out.println(treeNode1);

        System.out.println(s.mergeTrees(treeNode, treeNode1));

    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }

        if (t1 == null) {
            return t2;
        } else if (t2 == null) {
            return t1;
        } else {
            t1.val = t1.val + t2.val;
            t1.left = mergeTrees(t1.left, t2.left);
            t1.right = mergeTrees(t1.right, t2.right);
        }

        return t1;
    }
}
