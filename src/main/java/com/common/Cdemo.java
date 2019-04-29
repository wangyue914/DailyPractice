package com.common;

public class Cdemo {

	/**
	 * @param
	 */
	public static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}
	public static TreeNode Convert(TreeNode pRootOfTree) {
		if(pRootOfTree==null){
			return null;
		}
		TreeNode[] lastNode=new TreeNode[1];
		convertNode(pRootOfTree,lastNode);
		TreeNode head=lastNode[0];
		while(head!=null&&head.left!=null){
			head=head.left;
		}
		return head;

	}

	public static void convertNode(TreeNode node,TreeNode []lastNode){
		if(node==null){
			return;
		}

		if(node.left!=null){
			convertNode(node.left,lastNode);
		}
		node.left=lastNode[0];

		if(lastNode[0]!=null){
			lastNode[0].right=node;
		}

		lastNode[0]=node;
		if(node.right!=null){
			convertNode(node.right,lastNode);
		}
	}



	public static void main(String[] args) {


	}


}
