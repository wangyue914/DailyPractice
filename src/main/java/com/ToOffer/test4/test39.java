/**
 * ��Ŀһ������һ�ö������ĸ���㣬���������ȡ�
 * �Ӹ���㵽Ҷ�ӵ����ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
 * ��Ŀ��������һ�ö������ĸ���㣬�жϸ����ǲ���ƽ���������
 * ���ĳ����������������������������������1 ����ô������һ��ƽ���������
 */
package com.ToOffer.test4;

public class test39 {

	/**
	 * @param args
	 */
	
	private static class BinaryTreeNode{
		int data;
		BinaryTreeNode left;
		BinaryTreeNode right;
		public BinaryTreeNode(int data){
			this.data=data;
		}
	}
	
	public static int getDeepth(BinaryTreeNode root){
		if(root==null){
			return 0;
		}
		return getDeepth(root.left)>getDeepth(root.right)?getDeepth(root.left)+1:getDeepth(root.right)+1;
		
	}
	
	public static boolean isBalance(BinaryTreeNode root,int[] deepth){
		
		if(root==null){
			deepth[0]=0;
			return true;
		}
		
		int []left=new int [1];
		int []right=new int [1];
		
		if(isBalance(root.left, left)&&isBalance(root.right, right)){
			int differ=left[0]-right[0];
			if(differ<=1||differ>=-1){
				deepth[0]=1+(left[0]>right[0]?left[0]:right[0]);
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode n1 = new BinaryTreeNode(1);
        BinaryTreeNode n2 = new BinaryTreeNode(1);
        BinaryTreeNode n3 = new BinaryTreeNode(1);
        BinaryTreeNode n4 = new BinaryTreeNode(1);
        BinaryTreeNode n5 = new BinaryTreeNode(1);
        BinaryTreeNode n6 = new BinaryTreeNode(1);
        BinaryTreeNode n7 = new BinaryTreeNode(1);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        
        int []deepth=new int [1];
        System.out.println(isBalance(n1, deepth));

		 
	}

}
