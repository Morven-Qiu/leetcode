package src.leetcode.no515;

import src.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution1 {

    private static Map<Integer, Integer> map = new TreeMap<>();

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(1);

        treeNode.left = treeNode1;
        TreeNode treeNode5 = new TreeNode(5);
        treeNode.right = treeNode5;
        TreeNode treeNode6 = new TreeNode(6);
        treeNode5.right = treeNode6;
        treeNode5.left = new TreeNode(4);

        TreeNode treeNode0= new TreeNode(0);
        treeNode1.left = treeNode0;

        TreeNode treeNode2= new TreeNode(2);

        treeNode1.right = treeNode2;


        TreeNode treeNode3= new TreeNode(3);
        treeNode2.right = treeNode3;

        System.out.printf(largestValues(treeNode).toString());
    }

    public static List<Integer> largestValues(TreeNode root) {
        map = new TreeMap<Integer, Integer>();

        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        getDepth(root.left,1);
        getDepth(root.right,1);
        list.add(root.val);
        for (Integer item : map.values()) {
            list.add(item);
        }
        return list;
    }

    public static int getDepth(TreeNode node,int level) {
        if (node == null) {
            return 0;
        }
        int left = getDepth(node.left,level + 1);
        int right = getDepth(node.right,level +1);
        int max = Math.max(left, right);
        Integer value = map.get(level);
        if (value == null) {
            map.put(level , node.val);
        } else {
            if (node.val > value) {
                map.put(level , node.val);
            }
        }
        return 1 + max;
    }
}
