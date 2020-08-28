package src.leetcode.no1008;

import src.leetcode.util.TreeNode;

/**
 * @author fhqiu
 * @since 2020-08-26 13:54
 */
public class Solution2 {

    public static void main(String[] args) {

        int[] a = {8, 5, 1, 7, 10, 12};

        Solution2 s = new Solution2();

        System.out.println(s.bstFromPreorder(a));

    }

    public TreeNode bstFromPreorder(int[] preorder) {
        return  this.helper(preorder,0,6);
    }



    int idx=0;

    public TreeNode helper(int[] preorder, int lrange, int rrange){
        if(idx>=preorder.length || preorder[idx]<lrange || preorder[idx]>rrange){
            return null;
        }
        TreeNode node=new TreeNode(preorder[idx]);
        idx++;
        node.left=helper(preorder,lrange,node.val);
        node.right=helper(preorder,node.val,rrange);
        return node;
    }
}
