/**
 * ����������ͷ��㣬��β��ͷ��������ӡ��ÿ������ֵ��
 */
package com.sword2offer.test1;

import java.util.Stack;

public class test5 {

	public static class ListNode{
		int val;
		ListNode next;
		
	}
	
	public static void printList(ListNode root){
		
		Stack <ListNode> stack=new Stack<ListNode>();
		while(root!=null){
			stack.push(root);
			root=root.next;
		}
		
		ListNode temp;
		while(!stack.isEmpty()){
			
			temp=stack.pop();
			System.out.println(temp.val+" ");
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode root = new ListNode();  
        root.val = 1;  
        root.next = new ListNode();  
        root.next.val = 2;  
        root.next.next = new ListNode();  
        root.next.next.val = 3;  
        root.next.next.next = new ListNode();  
        root.next.next.next.val = 4;  
        root.next.next.next.next = new ListNode();  
        root.next.next.next.next.val = 5;  
  
       printList(root);
       

	}

}
