package com.sword2offer.test4;

/**
 * Created by Yue on 2017/6/7 0007.
 */
public class test39 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    //求一棵树的深度
    public static int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return TreeDepth(root.left)>TreeDepth(root.right)?TreeDepth(root.left)+1:TreeDepth(root.right)+1;

    }
    //判断一棵树是否是平衡二叉树
    public static boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        if(Math.abs(TreeDepth(root.left)-TreeDepth(root.right))>=2){
            return false;
        }
        return IsBalanced_Solution(root.right)&&IsBalanced_Solution(root.left);

    }
}
