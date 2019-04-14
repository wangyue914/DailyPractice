package com.SwordToOffer.test2;

import java.util.Stack;

/**
 * Created by Yue on 2017/6/22 0022.
 */
public class test18 {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }
    }

    public static boolean isChild(Node root, Node child) {
        if (child == null || root == null) {
            return false;
        }
        Stack<Node> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                if (root.data == child.data) {
                    if (isSame(root, child)) {
                        return true;
                    }
                }
                root = root.left;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                root = root.right;
            }
        }
        return false;
    }

    public static boolean isSame(Node n1, Node n2) {
        if (n2 == null) {
            return true;
        }
        if(n1==null){
            return false;
        }
        if (n1.data == n2.data) {
            return isSame(n1.left, n2.left) && isSame(n1.right, n2.right);

        }
        return false;


    }

    public static void main(String[] args) {
        Node n1=new Node(8);
        n1.left=new Node(8);
        n1.right=new Node(7);
        n1.left.left=new Node(9);
        n1.left.right=new Node(2);
        n1.left.right.left=new Node(4);
        n1.left.right.right=new Node(7);

        Node n2=new Node(8);
        n2.left=new Node(9);
        n2.right=new Node(3);
        System.out.println(isChild(n1,n1.left));
    }
}
