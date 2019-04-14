/**
 * ��ʵ�ֺ���ComplexListNode clone(ComplexListNode head),����һ����������
 * �ڸ��������У�ÿ����������һ��next ��ָ����һ������⣬����һ��sibling ָ�������е����������null
 * �������裺���ƽڵ㣬����sibling���֣���ֳ�������
 */

package com.ToOffer.test3;

public class test26 {
	
	
	public static class ComplexListNode{
		int value;
		ComplexListNode next;
		ComplexListNode sibling;
	}
	
	//���ƽڵ�
	public static void cloneNode(ComplexListNode head){
		
		if(head==null){
			return;
		}
		while(head!=null){
			ComplexListNode current=new ComplexListNode();
			current.value=head.value;
			current.next=head.next;
			head.next=current;
			head=current.next;
		}
		
	}
	
	//����sibling����
	public static void sibNode(ComplexListNode head){
		if(head==null){
			return;
		}
		
		while(head!=null){
			
			//����ڵ��sibling��Ϊ��
			if(head.sibling!=null){
				//���ƵĽڵ�(head.next)��sibling��ָ�򱻸��ƽڵ��sibling��(head.sibling)����һ���ڵ�
				head.next.sibling=head.sibling.next;
			}
			
			head=head.next.next;
		}
		
	}
	
	//������ǰ�͸�����ɵ������ֿ�
	public static ComplexListNode disconnect(ComplexListNode head){
		if(head==null){
			return null;
		}
		
		//���ƽڵ��ͷָ��
		ComplexListNode newhead=head.next;
		ComplexListNode temp=newhead;
		head.next=newhead.next;
		head=head.next;
		
		while(head!=null){
			temp.next=head.next;
			temp=temp.next;
			head.next=temp.next;
			head=temp.next;
		}
		
		return newhead;
		
	}
	
	public static void printList(ComplexListNode head){
		while(head!=null){
			System.out.print(head.value+"->");
			head=head.next;
		}
		System.out.println("null");
	}
	
	
	public static ComplexListNode clone(ComplexListNode head){
		if(head==null){
			return null;
		}
		
		cloneNode(head);
		sibNode(head);
		return disconnect(head);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComplexListNode head = new ComplexListNode();
        head.value = 1;
        head.next = new ComplexListNode();
        head.next.value = 2;
        head.next.next = new ComplexListNode();
        head.next.next.value = 3;
        head.next.next.next = new ComplexListNode();
        head.next.next.next.value = 4;
        head.next.next.next.next = new ComplexListNode();
        head.next.next.next.next.value = 5;

        head.sibling = head.next.next;
        head.next.sibling = head.next.next.next.next.next;
        head.next.next.next.sibling = head.next;
        
        printList(head);
        
        ComplexListNode temp=clone(head);
        printList(temp);

	}

}
