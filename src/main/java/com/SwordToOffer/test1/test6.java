package com.SwordToOffer.test1;

import java.util.Stack;

/**
 * Created by yue on 17-10-12 下午5:11.
 **/
public class test6 {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(){}
        public Node(int data){
            this.data=data;
        }

    }
    public static Node construct(int []pre,int []in){
        if(pre==null||in==null||pre.length!=in.length){
            return null;
        }
        return construct(pre,0,pre.length-1,in,0,in.length-1);
    }
    public static Node construct(int []pre,int ps,int pe,int []in,int is,int ie){
        if(ps>pe){
            return null;
        }
        int index=is;
        while(index<ie&&in[index]!=pre[ps]){
            index++;
        }
        Node node=new Node(pre[ps]);
        node.left=construct(pre,ps+1,ps+index-is,in,is,index);
        node.right=construct(pre,ps+index-is+1,pe,in,index+1,ie);

        return node;
    }

    public static void printPre(Node root){
        if(root==null){
            return;
        }
        Stack<Node> stack=new Stack<>();
        while(!stack.isEmpty()||root!=null){
            while(root!=null){
                System.out.print(root.data+" ");
                stack.push(root);
                root=root.left;
            }
            if(stack.isEmpty()){
                break;
            }
            root=stack.pop();
            root=root.right;
        }
    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        Node node=construct(pre,in);
        printPre(node);
    }

}
