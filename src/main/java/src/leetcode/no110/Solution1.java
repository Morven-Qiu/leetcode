package src.leetcode.no110;


public class Solution1 {

    private static boolean result = true;

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(1);
        node.left = node1;
        System.out.println(isBalanced(node));
    }

    public static boolean isBalanced(TreeNode root) {
        if(root == null ){
            return true;
        }
        if(root.left ==null && root.right==null){
            return true;
        }
        getDepth(root);
        return result;

    }

    public static int getDepth(TreeNode node) {
        if (!result) return 0;
        if(node == null ){
            return 0;
        }
        int left = getDepth(node.left);
        int right = getDepth(node.right);
        if(Math.abs(left - right) > 1){
            result = false;
            return 0;
        }
        return 1 + Math.max(left, right);

    }
}
