/**
 * ����һ�ö�������һ�������� ��ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * �����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 */
package com.ToOffer.test3;

import java.util.*;

public class test25 {

	/**
	 * @param args
	 */
	public static class BinaryTreeNode{
		int value;
		BinaryTreeNode left;
		BinaryTreeNode right;
		
	}
	
	public static void findPath(BinaryTreeNode root,int sum){
		
		if(root==null){
			return;
		}
		List<Integer> arr=new ArrayList<Integer>();
		findPath(root,arr,0,sum);
	}
	
	public static void findPath(BinaryTreeNode root,List arr,int cursum,int sum){
		
		//�ڵ�Ϊ��ʱ����
		if(root==null){
			return;
		}
		
		//ÿ����һ���ڵ�ͽ�ֵ�ۼӽ�ȥ
		cursum=cursum+root.value;
		arr.add(root.value);
		if(cursum<sum){
			findPath(root.left,arr,cursum,sum);
			findPath(root.right,arr,cursum,sum);
			
		}
		
		else if(cursum==sum){
			if(root.left==null&&root.right==null){
				System.out.println(arr);
			}
		}
		
		//ִ����һ����֧��ȥ��������ڵ�
		arr.remove(arr.size()-1);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 BinaryTreeNode root = new BinaryTreeNode();
	        root.value = 10;
	        root.left = new BinaryTreeNode();
	        root.left.value = 5;
	        root.left.left = new BinaryTreeNode();         
	        root.left.left.value = 4;
	        root.left.right = new BinaryTreeNode();
	        root.left.right.value = 7;
	        root.right = new BinaryTreeNode();
	        root.right.value = 12;

	        // ������·���ϵĽ���Ϊ22
	        System.out.println("findPath(root, 19);");
	        findPath(root, 19);

	}

}
