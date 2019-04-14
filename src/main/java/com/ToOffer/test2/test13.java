/**
 * �������������ͷָ���һ�����ָ�룬����һ��������0(1)ʱ��ɾ���ý��
 */
package com.ToOffer.test2;

public class test13 {

	/**
	 * @param args
	 */
	public static class ListNode{
		int data;
		ListNode next;
	    public ListNode(int data){
	    	this.data=data;
	    }
	}
	public static ListNode deleteNode(ListNode head, ListNode delete){
		if(head==null||delete==null){
			return null;
		}
		
		if(head==delete){
			return head.next;
		}
		if(delete.next==null){
			ListNode temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=null;
		}else{
			 delete.data=delete.next.data;
			 delete.next=delete.next.next;
			
			
		}
		return head;
		
	}
	
	public static void showList(ListNode head){
		ListNode temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		
		
		showList(deleteNode(head, head.next));
		
		

	}

}
