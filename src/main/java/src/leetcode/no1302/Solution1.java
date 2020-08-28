package src.leetcode.no1302;

import src.leetcode.util.TreeNode;

import javax.xml.soap.Node;

/**
 * @author fhqiu
 * @since 2020-08-20 16:34
 */
public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(0);
        TreeNode right = new TreeNode(2);
        TreeNode left2 = new TreeNode(4);
        treeNode.left = left;
        treeNode.right = right;
        left.left = left2;
        System.out.println("this tree node depth sum is {} " + solution1.deepestLeavesSum(treeNode));
    }

    class Node {
        private int height;
        private int sum;

        Node(int height, int sum) {
            this.height = height;
            this.sum = sum;
        }
    }

    public int deepestLeavesSum(TreeNode root) {
        return this.getDeepestSum(root).sum;

    }


    public Node getDeepestSum(TreeNode root) {
        if (root == null) {
            return new Node(0, 0);
        }
        if (root.left == null && root.right == null) {
            return new Node(1, root.val);
        }
        Node left = getDeepestSum(root.left);
        Node right = getDeepestSum(root.right);

        if (left.height == right.height) {
            return new Node(left.height++, left.sum + right.sum);
        }

        if (left.height > right.height) {
            left.height++;

            return left;
        } else {
            right.height++;
            return right;
        }

    }
}
