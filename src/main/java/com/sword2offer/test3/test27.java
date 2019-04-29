package com.sword2offer.test3;

/**
 * Created by Yue on 2017/6/27 0027.
 */
public class test27 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public static TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        TreeNode[] tail = new TreeNode[1];
        ConverNode(pRootOfTree, tail);
        TreeNode head = tail[0];
        while (head.left != null) {
            head = head.left;

        }
        return head;

    }

    public static void ConverNode(TreeNode root, TreeNode[] tail) {
        if (root != null) {
            if (root.left != null) {
                ConverNode(root.left, tail);
            }

            if (tail[0] != null) {
                tail[0].right = root;
            }
            root.left = tail[0];
            tail[0] = root;
            if (root.right != null) {
                ConverNode(root.right, tail);
            }


        }
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(10);
        n1.left = new TreeNode(5);
        n1.right = new TreeNode(12);
        n1.left.left = new TreeNode(4);
        n1.left.right = new TreeNode(7);

        TreeNode head = Convert(n1);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.right;
        }
    }
}
