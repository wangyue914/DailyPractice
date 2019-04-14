package com.SwordToOffer.test3;

import java.util.ArrayList;

/**
 * Created by Yue on 2017/6/25 0025.
 */
public class test25 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(){}
        public TreeNode(int val){
            this.val=val;
        }
    }
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(root==null||root.val>target){
            return result;

        }
        ArrayList<Integer> list=new ArrayList<>();
        getSum(root,0,target,result,list);
        return result;



    }
    public static void getSum(TreeNode root,int current,int target,ArrayList<ArrayList<Integer>> result,ArrayList<Integer> list){
        if(root!=null){
            current+=root.val;
            list.add(root.val);
            if(current==target&&root.left==null&&root.right==null){
                result.add(new ArrayList<>(list));
            }
            else if(current<target){
                getSum(root.left,current,target,result,list);
                getSum(root.right,current,target,result,list);
            }
            list.remove(list.size()-1);
        }

    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(10);
        n1.left=new TreeNode(5);
        n1.right=new TreeNode(12);
        n1.left.left=new TreeNode(4);
        n1.left.right=new TreeNode(7);
        ArrayList<ArrayList<Integer>> result=FindPath(n1,22);
        for(int i=0;i<result.size();i++){
            ArrayList<Integer> list=result.get(i);
            for(int j=0;j<list.size();j++){
                System.out.print(list.get(j)+" ");
            }
            System.out.println(" ");
        }
    }
}
