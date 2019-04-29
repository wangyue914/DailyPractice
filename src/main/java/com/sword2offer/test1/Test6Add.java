/**
 * ������
 */
package com.sword2offer.test1;

import java.util.*;
import java.util.Stack;

public class Test6Add {

	public static class BinaryTreeNode {
		int data;
		BinaryTreeNode left;
		BinaryTreeNode right;

	}
	

	public static class BinaryTree {

		BinaryTreeNode root;

		// ͨ��ǰ�����������й���������
		public BinaryTreeNode construct(int[] preorder, int[] inorder) {

			if (preorder == null || inorder == null||preorder.length != inorder.length || preorder.length < 1) {
				return null;
			}
			return construct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);

		}

		// ͨ��ǰ�����������й���������
		public BinaryTreeNode construct(int[] preorder, int preStart,
				int preEnd, int[] inorder, int inStart, int inEnd) {

			if (preStart > preEnd) {
				return null;
			}
			int data = preorder[preStart];
			int index = inStart;
			while (data != inorder[index]) {
				index++;
			}
			if (index > inEnd) {
				throw new RuntimeException("�Ƿ�����");
			}

			BinaryTreeNode node = new BinaryTreeNode();
			node.data = data;

			node.left = construct(preorder, preStart + 1, preStart + index - inStart, inorder, inStart, index - 1);
			node.right = construct(preorder, preStart + index - inStart + 1, preEnd, inorder, index + 1, inEnd);

			return node;

		}

		//������ȱ���
		public static void levelOrder(BinaryTreeNode root){
			if(root==null){
				return;
			}
			
			Queue<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
			BinaryTreeNode temp;
			queue.add(root);
			while(!queue.isEmpty()){
				temp=queue.peek();
				System.out.print(temp.data+" ");
				queue.remove();
				if(temp.left!=null){
					queue.add(temp.left);
				}
				if(temp.right!=null){
					queue.add(temp.right);
				}
			}
		}
		// ǰ�����������
		public void printPreOrder(BinaryTreeNode root) {

			if (root == null) {
				return;
			}
			Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
			BinaryTreeNode node = root;
			while (node != null || !stack.isEmpty()) {
				if (node != null) {
					System.out.print(node.data + " ");
					stack.push(node);
					node = node.left;
				} else {
					node = stack.peek();
					node=node.right;
					stack.pop();
				}

			}

		}

		// �������������
		public void printInOrder(BinaryTreeNode root) {
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
					System.out.print(node.data + " ");
					stack.pop();
					node = node.right;
				}
			}

		}

		// �������������
		public void printPastOrder(BinaryTreeNode root) {
			if (root == null) {
				return;
			}
			Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
			BinaryTreeNode node = root;
			BinaryTreeNode pre = root;

			while (node != null) {
				while (node.left != null) {
					stack.push(node);
					node = node.left;
				}

				while (node != null
						&& (node.right == null || node.right == pre)) {

					System.out.print(node.data + " ");
					pre = node;
					if (stack.isEmpty()) {
						return;
					}
					node = stack.peek();
					stack.pop();

				}
				stack.push(node);
				node = node.right;

			}

		}
	}

	//����������
	public static class ThreadBinaryTreeNode{
		int leftTag,rightTag;
		ThreadBinaryTreeNode right;
		ThreadBinaryTreeNode left;
		int val;
		public ThreadBinaryTreeNode(){
			
		}
		public ThreadBinaryTreeNode(int val){
			this.val=val;
		}
	}
	public static class ThreadBinaryTree{
		ThreadBinaryTreeNode root;
		public ThreadBinaryTree(){
			
		}
		public ThreadBinaryTree(ThreadBinaryTreeNode root){
			this.root=root;
		}
		
		public static void inThread(ThreadBinaryTreeNode root,ThreadBinaryTreeNode pre){
			ThreadBinaryTreeNode current=root;
			if(root!=null){
				inThread(root.left,pre);
				if(root.left==null){
					root.left=pre;
					root.leftTag=1;
				}
				if(pre!=null&&pre.right==null){
					pre.right=root;
					pre.rightTag=1;
				}
				pre=current;
				inThread(root.right, pre);
				
			}
		}
		public static void inThreadOrder(ThreadBinaryTreeNode root){
			while(root.leftTag==0){
				root=root.left;
			}
			
			while(root!=null){
				System.out.print(root.val+" ");
				if(root.rightTag==1){
					root=root.right;
				}else{
					root=root.right;
					while(root!=null&&root.leftTag==0){
						root=root.left;
					}
				}
			}
		}
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree ByTree = new BinaryTree();
		int[] preorder = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] inorder = { 4, 7, 2, 1, 5, 3, 8, 6 };
		BinaryTreeNode root = ByTree.construct(preorder, inorder);
		ByTree.printPreOrder(root);
		System.out.println();
		ByTree.levelOrder(root);
		
		
	}

}
