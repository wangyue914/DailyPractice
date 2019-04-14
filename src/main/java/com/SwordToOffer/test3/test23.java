package com.SwordToOffer.test3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Yue on 2017/6/24 0024.
 */
public class test23 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(){}
        public TreeNode(int val){
            this.val=val;
        }
    }

    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            list.add(temp.val);
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
        return list;

    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(1);
        n1.left=new TreeNode(2);
        n1.right=new TreeNode(3);
        n1.left.left=new TreeNode(4);
        n1.left.right=new TreeNode(5);
        n1.right.left=new TreeNode(6);
        n1.right.right=new TreeNode(7);
        ArrayList<Integer> list=PrintFromTopToBottom(n1);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
