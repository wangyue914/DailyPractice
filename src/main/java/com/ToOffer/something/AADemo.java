package com.ToOffer.something;

import java.util.*;

/**
 * Created by Yue on 2017/4/17 0017.
 */
public class AADemo {

    static class Node{
        private Node left;
        private Node right;
        int data;
        public Node(){

        }
        public Node(int data){
            this.data=data;
        }
    }

    public static void printPr(Node root){
        if(root==null){
            return;
        }
        Stack<Node > stack=new Stack();
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                System.out.print(root.data+" ");
                stack.push(root);
                root=root.left;
            }
            if(stack.isEmpty()){
                return;
            }
            root=stack.pop();
            root=root.right;
        }
    }
    public static void printIn(Node root){
        if(root==null){
            return;
        }
        Stack<Node> stack=new Stack();
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }

            if(stack.isEmpty()){
                return;
            }
            root=stack.pop();
            System.out.print(root.data+" ");
            root=root.right;
        }

    }
    public static void printPa(Node root){
        if(root==null){
            return;
        }
        Stack<Node> stack=new Stack();
        Node pre=root;
        while(root!=null){
            while(root.left!=null){
                stack.push(root);
                root=root.left;
            }
           while(root !=null&&(root.right==null||root.right==pre)){
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
    public static void printLi(Node root){
        if(root==null){
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        Node temp;
        queue.add(root);
        while(!queue.isEmpty()){
            temp=queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }


        }
    }



    public static void main(String[] args) {
        Node n1=new Node(1);
        n1.left=new Node(2);
        n1.right=new Node(3);
        n1.left.left=new Node(4);
        n1.left.right=new Node(5);
        n1.right.left=new Node(6);
        printLi(n1);
    }
}
