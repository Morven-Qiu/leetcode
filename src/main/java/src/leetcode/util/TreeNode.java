package src.leetcode.util;

import src.leetcode.no669.Solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public static int depth(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int l = depth(treeNode.left);
        int r = depth(treeNode.right);
        return l > r ? l + 1 : r + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(0);
        TreeNode right = new TreeNode(2);
        treeNode.left = left;
        treeNode.right = right;
        System.out.println("this tree node depth is {} and  " + TreeNode.depth(treeNode));
        System.out.println("args = [" + treeNode + "]");

    }

    public List<Integer> printTreeNodeFromTop() {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(this);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            if (treeNode.left != null) {
                queue.offer(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.offer(treeNode.right);
            }
            list.add(treeNode.val);
        }
        return list;
    }

    public String strTreeNode(List<Integer> list) {
        StringBuilder str = new StringBuilder();
        for (Integer value : list) {
            str.append(value).append(",");
        }
        return str.toString();
    }


    @Override
    public String toString() {
        return this.strTreeNode(this.printTreeNodeFromTop());
    }
}
