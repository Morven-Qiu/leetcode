package src.leetcode.no1302;

import src.leetcode.util.TreeNode;

/**
 * @author fhqiu
 * @since 2020-08-20 16:34
 */
public class Solution2 {

    public static void main(String[] args) {
        Solution2 solution1 = new Solution2();
        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(0);
        TreeNode right = new TreeNode(2);
        TreeNode left2 = new TreeNode(4);
        treeNode.left = left;
        treeNode.right = right;
        left.left = left2;
        System.out.println("this tree node depth sum is {} " + solution1.deepestLeavesSum(treeNode));
    }


    private int sum, maxLevel;


    public int deepestLeavesSum(TreeNode root) {
        getDeepestSum(root, 1);
        return this.sum;

    }


    public void getDeepestSum(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level > maxLevel) {
            maxLevel = level;
            sum = 0;
        }
        if(level == maxLevel){
            sum = sum + root.val;
        }
        getDeepestSum(root.left, level + 1);
        getDeepestSum(root.right, level + 1);

    }
}
