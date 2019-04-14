package com.LeetCode.string;

import java.util.Stack;

/**
 * Created by Yue on 2017/6/12 0012.
 */
public class test606 {
    public static class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
    }
    public static String treestr(TreeNode t){
        if(t==null){
            return "";
        }
        StringBuilder stb=new StringBuilder();
        treestr2(t,stb);
        return stb.toString();


    }
    public static void treestr2(TreeNode t,StringBuilder stb){
        if(t==null){
            return ;
        }
        stb.append(t.val);
        if(t.left!=null||t.right!=null){
            stb.append("(");
            treestr2(t.left,stb);
            stb.append(")");
            if(t.right!=null){
                stb.append("(");
                treestr2(t.right,stb);
                stb.append(")");
            }

        }


    }
    public static String tree2str(TreeNode t) {
        if(t==null){
            return "";
        }
        StringBuilder stb=new StringBuilder();
        Stack<TreeNode> stack=new Stack<>();

        stb.append(t.val);
        stack.push(t);
        t=t.left;
        while(t!=null||!stack.isEmpty()){
            int count=0;
            while(t!=null){
                stb.append("("+t.val);
                count++;
                stack.push(t);
                t=t.left;
            }
            for(int i=0;i<count;i++){
                stb.append(")");
            }
            if(!stack.isEmpty()){
                t=stack.pop();
                t=t.right;
            }
        }
        return stb.toString();


    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(1);
        n1.left=new TreeNode(2);
        n1.right=new TreeNode(3);
        n1.left.left=null;
        n1.left.right=new TreeNode(4);
        System.out.println(treestr(n1));


    }
}
