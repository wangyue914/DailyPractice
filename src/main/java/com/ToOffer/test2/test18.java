/**
 * �������ö�����A ��B���ж�B �ǲ���A ���ӽṹ��
 */
package com.ToOffer.test2;

public class test18 {


	public static class BinaryTreeNode{
		BinaryTreeNode left;
		BinaryTreeNode right;
		int value;
		
	}
	
	//�ж�root2�ǲ���root1���ӽṹ
	public static boolean hasChild(BinaryTreeNode root1,BinaryTreeNode root2){
		//��������ڵ�����ͬ�ģ�����true
		if(root1==root2){
			return true;
		}
		
		if(root2==null){
			return true;
		}
		//root2��Ϊ�ն�root1Ϊ�գ�����false
		if(root1==null){
			return false;
		}
		
		boolean result=false;
		//���root1��ֵ��root2��ֵ��ȣ��ٶ�����Ľṹ�����ж�
		if(root1.value==root2.value){
			System.out.println("�ҵ�һ����ͬ�ڵ�");
			result=hasSame(root1,root2);
			
		}
		if(result){
			return true;
		}
		return hasChild(root1.left,root2) || hasSame(root1.right,root2);
		
	}
	public static boolean hasSame(BinaryTreeNode root1,BinaryTreeNode root2){
		if(root1==root2){
			return true;
		}
		if(root2==null){
			return true;
		}
		if(root1==null){
			return false;
		}
		if(root1.value==root2.value){
			
			return hasSame(root1.left,root2.left) && hasSame(root1.right,root2.right);
			
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode root1 = new BinaryTreeNode();
        root1.value = 8;
        root1.right = new BinaryTreeNode();
        root1.right.value = 7;
        root1.left = new BinaryTreeNode();
        root1.left.value = 8;
        root1.left.left = new BinaryTreeNode();
        root1.left.left.value = 9;
        root1.left.right = new BinaryTreeNode();
        root1.left.right.value = 2;
        root1.left.right.left = new BinaryTreeNode();
        root1.left.right.left.left = new BinaryTreeNode();
        root1.left.right.left.left.value = 4;
        root1.left.right.left.right = new BinaryTreeNode();
        root1.left.right.left.right.value = 7;

        BinaryTreeNode root2 = new BinaryTreeNode();
        root2.value = 8;
        root2.left = new BinaryTreeNode();
        root2.left.value = 9;
        root2.right = new BinaryTreeNode();
        root2.right.value = 2;
        
        System.out.println(hasChild(root1, root2));
       // System.out.println(hasChild(root2, root1));
        System.out.println(hasChild(root1, root1.left));

	}

}
