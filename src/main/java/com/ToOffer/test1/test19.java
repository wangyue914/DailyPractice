/***
 * �����һ������������һ�����������ú���������ľ���
 * ����Ϊ����һ��ֱ����������Գ�
 */
package com.ToOffer.test1;

import java.io.PrintStream;
import java.util.Stack;

import com.test2.test18.BinaryTreeNode;


public class test19 {

	public static class BinaryTreeNode{
		BinaryTreeNode left;
		BinaryTreeNode right;
		int value;
	}
	
	public static void printMirro(BinaryTreeNode root){
		if(root==null){
			return;
		}
		BinaryTreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		
		printMirro(root.left);
		printMirro(root.right);
		
	}
	public static void printInOrder(BinaryTreeNode root){
		
		if (root == null) {
			return;
		}
		BinaryTreeNode node = root;
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		while (node != null || !stack.isEmpty()) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				node = stack.peek();
				System.out.print(node.value + " ");
				stack.pop();
				node = node.right;
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
	        printInOrder(root);
	        System.out.println();
	        printMirro(root);
	        printInOrder(root);

	}

}
