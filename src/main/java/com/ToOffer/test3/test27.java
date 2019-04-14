/**
 * ����һ�ö��������������ö���������ת����һ�������˫������
 * Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
 * ע�⣺��������һ�����⣬treeToList�����ڶ�������Ҫ��Ϊ���ô��ݣ������ں������ڲ��ܸı�����ֵ
 */
package com.ToOffer.test3;

public class test27 {

	/**
	 * @param args
	 */
	
	public static class TreeNode{
		TreeNode left;
		TreeNode right;
		int value;
	}
	
	public static TreeNode treeToList1(TreeNode head){
		TreeNode[] temp=new TreeNode[1];
		treeToList(head,temp);
		
		TreeNode node=temp[0];
		while(node!=null&&node.left!=null){
			node=node.left;
		}
		
		return node;
	}
	public static void treeToList(TreeNode head,TreeNode []temp){
		
		if(head==null){
			return ;
		}
		
		//�����������Ϊ�գ��ݹ����
		if(head.left!=null){
			treeToList(head.left,temp);
		}
		
		//���øýڵ��ǰ��Ϊ˫����������һ���ڵ�
		head.left=temp[0];
		
		if(temp[0]!=null){
			//����˫���������һ���ڵ�ĺ��Ϊ�ýڵ�
			temp[0].right=head;
		}
		//���ýڵ����˫��������
		temp[0]=head;
		
		if(head.right!=null){
			treeToList(head.right,temp);
		}
		
		
	}
	
	public static void printList(TreeNode head){
		while(head!=null){
			System.out.print(head.value+"->");
			head=head.right;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    TreeNode node10 = new TreeNode();
	        node10.value = 10;

	        TreeNode node6 = new TreeNode();
	        node6.value = 6;

	        TreeNode node14 = new TreeNode();
	        node14.value = 14;

	        TreeNode node4 = new TreeNode();
	        node4.value = 4;

	        TreeNode node8 = new TreeNode();
	        node8.value = 8;

	       TreeNode node12 = new TreeNode();
	        node12.value = 12;

	        TreeNode node16 = new TreeNode();
	        node16.value = 16;

	        node10.left = node6;
	        node10.right = node14;

	        node6.left = node4;
	        node6.right = node8;

	        node14.left = node12;
	        node14.right = node16;
	        
	        TreeNode node=treeToList1(node10);
	        printList(node);
	        

	}

}
