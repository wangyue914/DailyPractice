package com.Tree;

import sun.awt.image.DataBufferNative;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Yue on 2017/6/15 0015.
 */
public class BinaryTree {
    public static class BinaryTreeNode {
        int data;
        BinaryTreeNode left;
        BinaryTreeNode right;
        public BinaryTreeNode(){}
        public BinaryTreeNode(int data){
            this.data=data;
        }

    }
    //前序遍历
    public static void printPre(BinaryTreeNode root){
        if(root==null){
            return;
        }
        Stack<BinaryTreeNode> stack=new Stack<>();
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                System.out.print(root.data+" ");
                root=root.left;
            }
            if(!stack.isEmpty()){
                root=stack.pop();
                root=root.right;
            }
        }
    }
    //中序遍历
    public static void printIn(BinaryTreeNode root){
        if(root==null){
            return;
        }
        Stack<BinaryTreeNode> stack=new Stack<>();
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            if(!stack.isEmpty()){
                root=stack.pop();
                System.out.print(root.data+" ");
                root=root.right;
            }
        }
    }

    //后续遍历
    public static void printPa(BinaryTreeNode root){
        if(root==null){
            return;
        }
        BinaryTreeNode pre=root;
        Stack<BinaryTreeNode> stack=new Stack<>();
        while(root!=null){
            while(root.left!=null){
                stack.push(root);
                root=root.left;
            }

            while(root!=null&&(root.right==null||root.right==pre)){
                System.out.print(root.data+" ");
                pre=root;
                if(stack.isEmpty()){
                    return;
                }
                root=stack.pop();
            }

            stack.push(root);
            root=root.right;
        }
    }

    //广度遍历
    public static void printLine(BinaryTreeNode root){
        if(root==null){
            return;
        }
        Queue<BinaryTreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            root=queue.poll();
            System.out.print(root.data+" ");
            if(root.left!=null){
                queue.add(root.left);
            }
            if(root.right!=null){
                queue.add(root.right);
            }
        }
    }

    //获取第k层二叉树的节点数
    public static int getNumOfK(BinaryTreeNode root,int k){
        if(root==null||k<1){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return getNumOfK(root.left,k-1)+getNumOfK(root.right,k-1);
    }

    //求数的高度(只有一个根节点时为1)
    public static int getHigh(BinaryTreeNode root){
        if(root==null){
            return 0;
        }
        int left=getHigh(root.left)+1;
        int right=getHigh(root.right)+1;
        return left>right?left:right;
    }

    //求两个子节点的最低公共节点 最低公共祖先，即LCA(Lowest Common Ancestor）
    // 不在同一层级时一定会先找到靠近上面的那个节点
    public static BinaryTreeNode getLCA (BinaryTreeNode root,BinaryTreeNode node1,BinaryTreeNode node2){
        if(root==null){
            return null;
        }
        if(root==node1||root==node2){
            return root;
        }

        BinaryTreeNode left=getLCA(root.left,node1,node2);
        BinaryTreeNode right=getLCA(root.right,node1,node2);
        //两个子节点刚好是一个节点的左右子树
        if(left!=null&&right!=null){
            return root;
        }


        return left!=null?left:right;
    }


    public static void main(String[] args) {
        BinaryTreeNode root=new BinaryTreeNode(1);
        root.left=new BinaryTreeNode(2);
        root.right=new BinaryTreeNode(3);
        root.left.left=new BinaryTreeNode(4);
        root.left.right=new BinaryTreeNode(5);
        printLine(root);
    }
}
