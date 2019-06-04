package src.leetcode.no515;

import src.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Solution2 {


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(1);

        treeNode.left = treeNode1;
        TreeNode treeNode5 = new TreeNode(5);
        treeNode.right = treeNode5;
        TreeNode treeNode6 = new TreeNode(6);
        treeNode5.right = treeNode6;
        treeNode5.left = new TreeNode(4);

        TreeNode treeNode0 = new TreeNode(0);
        treeNode1.left = treeNode0;

        TreeNode treeNode2 = new TreeNode(2);

        treeNode1.right = treeNode2;
        TreeNode treeNode3 = new TreeNode(3);
        treeNode2.right = treeNode3;

        //System.out.printf(largestValues(treeNode).toString());
        Integer a = new Integer(3) ;

        Integer b = 3;
        System.out.println(b==a);
    }

    public static List<Integer> largestValues(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        getDepth(root.left, list, 0);
        getDepth(root.right, list, 0);
        return list;
    }

    public static void getDepth(TreeNode node, List<Integer> list, int level) {
        if (node == null) {
            return;
        }
        if (list.size() == level) {
            list.add(level, node.val);
        }else{
            list.add(level, Math.max(list.get(level), node.val));
        }
        getDepth(node.left, list, level + 1);
        getDepth(node.right, list, level + 1);
    }
}
