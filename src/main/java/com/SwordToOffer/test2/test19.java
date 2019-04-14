package com.SwordToOffer.test2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Yue on 2017/6/22 0022.
 */
public class test19 {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(){}
        public Node(int val){
            this.val=val;
        }


    }
    public static void Mirror(Node root){
        if(root==null){
            return;
        }
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        Mirror(root.left);
        Mirror(root.right);
    }

    public static void main(String[] args) {
        Node n1=new Node(8);
        n1.left=new Node(6);
        n1.right=new Node(10);
        n1.left.left=new Node(5);
        n1.left.right=new Node(7);
        n1.right.left=new Node(9);
        n1.right.right=new Node(11);
        Mirror(n1);
        Queue<Node> queue=new LinkedList<>();
        queue.add(n1);
        while(!queue.isEmpty()){
            Node temp=queue.poll();
            System.out.print(temp.val+" ");
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }

    }
}
