
/**
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡�
 */
package com.ToOffer.test1;


import java.util.Stack;

public class test6 {

	//�ڵ���
	public static class BinaryTreeNode{
		
		int value;
		BinaryTreeNode left;
		BinaryTreeNode right;


	}
	
	/**
	 * 
	 * @param preorder ǰ�����
	 * @param inorder  �������
	 * @return
	 */
	
	public static BinaryTreeNode construct(int []preorder,int []inorder){
		
		if(preorder==null||inorder==null||preorder.length!=inorder.length||preorder.length<1){
			return null;
		}
		return construct(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
	}
	/**
	 * 
	 * @param preStart  ǰ��������ʼλ��
	 * @param preEnd  ǰ���������λ��
	 * @param inStart  ����������ʼλ��
	 * @param inEnd  �����������λ��
	 * @return
	 */
	public static BinaryTreeNode construct(int[]preorder,int preStart,int preEnd,int[]inorder,int inStart,int inEnd){

		//�����ʼλ�ô��ڽ���λ�ã���������
		if(preStart>preEnd){
			return null;
		}

		int value=preorder[preStart];
		int index=inStart;
		while(inorder[index]!=value && index<=inEnd){
			index++;
		}
		if(index>inEnd){
			throw new RuntimeException("�Ƿ�����");
		}
		
		BinaryTreeNode node=new BinaryTreeNode();
		node.value=value;
		/**
		 * �ݹ鹹����ǰ���ڵ�������������������Ϊindex-inStart
		 */
		node.left=construct(preorder, preStart+1, preStart+index-inStart, inorder, inStart, index-1);
		/**
		 * �ݹ鹹����ǰ���ڵ�������������������ΪinEnd-index
		 */
		node.right=construct(preorder,preStart+index-inStart+1,preEnd,inorder,index+1,inEnd);

		return node;
	}
	
	
	//�������������
	public static void inOrderPrint(BinaryTreeNode root){
		Stack<BinaryTreeNode>stack=new Stack<BinaryTreeNode>();
		BinaryTreeNode temp=root;
		while(!stack.isEmpty() || temp!=null){
			if(temp!=null){
				stack.push(temp);
				temp=temp.left;
			}
			else{
				temp=stack.peek();
				System.out.print(temp.value+" ");
				temp=temp.right;
				stack.pop();
				
			}	
		}
	}
	
	//ǰ�����������
	public static void preOrderPrint(BinaryTreeNode root){
		
		BinaryTreeNode temp=root;
		Stack<BinaryTreeNode>stack=new Stack<BinaryTreeNode>();
		while(!stack.isEmpty()||temp!=null){
			
			if(temp!=null){
				System.out.print(temp.value+" ");
				if(temp.right!=null){
					stack.push(temp.right);
				}
				temp=temp.left;
			}
			else{
				temp=stack.peek();
				stack.pop();
			}
		}
		
	}
	
	
	//��������������
	public static void PostOrderPrint(BinaryTreeNode root){
		
		Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
		BinaryTreeNode temp=root;
		BinaryTreeNode pre=root;    //����ǰһ�������ʵĽڵ�
		
		while(temp!=null){
			for(;temp.left!=null;temp=temp.left){
				stack.push(temp);      //��������
			}
			
			while(temp!=null&&(temp.right==null||temp.right==pre)){      //��ǰ�ڵ�û�������������������ձ����ʹ�
				
				System.out.print(temp.value+" ");
				pre=temp;
				if(stack.isEmpty()){
					return;
				}
				
				temp=stack.peek();
				stack.pop();
				
			}
			//��������������ýڵ�ѹջ��תȥ����������
			stack.push(temp);
			temp=temp.right;
		}
	}
	
	
	private static void test1() {  
        int[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};  
        int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};  
        BinaryTreeNode root = construct(preorder, inorder);  
        inOrderPrint(root);  
        System.out.println("");
        preOrderPrint(root);
        System.out.println("");
        PostOrderPrint(root);
    }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test1();

	}

}
