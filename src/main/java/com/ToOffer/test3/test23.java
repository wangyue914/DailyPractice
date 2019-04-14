/**
 * �������´�ӡ����������ÿ����㣬ͬһ��Ľ�㰴�մ������ҵ�˳���ӡ��
 */
package com.ToOffer.test3;

import java.util.*;

public class test23 {

	/**
	 * @param args
	 */
	
	public static class BinaryTreeNode{
		int value;
		BinaryTreeNode left;
		BinaryTreeNode right;
		
	}
	public static void printInQueue(BinaryTreeNode root){
		Queue<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
		BinaryTreeNode head=root;
		if(root==null){
			return;
		}
		queue.add(head);
			
		while(!queue.isEmpty()){
			
			BinaryTreeNode current=queue.remove();
			System.out.print(current.value+" ");
			if(current.left!=null){
				queue.add(current.left);
			}
			
			if(current.right!=null){
				queue.add(current.right);
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode root = new BinaryTreeNode();
        root.value = 8;
        root.left = new BinaryTreeNode();
        root.left.value = 6;
        root.left.left = new BinaryTreeNode();
        root.left.left.value = 5;
        root.left.right = new BinaryTreeNode();
        root.left.right.value = 7;
        root.right = new BinaryTreeNode();
        root.right.value = 10;
        root.right.left = new BinaryTreeNode();
        root.right.left.value = 9;
        root.right.right = new BinaryTreeNode();
        root.right.right.value = 11;
        
        printInQueue(root);
        

	}

}
