/**
 * ������Ĵ����ͻ�������
 */

package com.ToOffer.test1;

import java.util.Stack;

public class Test5Add {

	/**
	 * @param args
	 */
	public static class Node{
		
		public int data;
		public Node next;
		public Node(){
			
		}
		public Node(int data){
			this.data=data;
		}
		
	}
	
	public static class LinkList{
		public Node head;
		public Node current;
		
		//������Ĵ���
		public void add(int data){
			if(head==null){
				head=new Node(data);
				current=head;
			}
			else{
				current.next=new Node(data);
				current=current.next;
			}
		}
		
		//���������
		public void show(Node node){
			if(node==null){
				System.out.println("�ڵ�Ϊ��");
				return;
			}
			else{
				current=node;
				while(current!=null){
					System.out.print(current.data+" ");
					current=current.next;
				}
				
			}
		}
		
		//��ȡ�ڵ����
		public  int getLength(Node head){
			if(head==null){
				return 0;
			}
			int length=0;
			Node tem=head;
			while(tem!=null){
				length++;
				tem=tem.next;
			}
			return length;
			
			
		}
		//��ѯ������k���ڵ�
		//�ٱ������нڵ�����
		public Node findNode(Node head,int index){
			int sum=0;
			Node node=head;
			while(node!=null){
				sum++;
				node=node.next;
			}
			node=head;
			for(int i=0;i<sum-index;i++){
				node=node.next;
			}
			
			return node;
		}
		/**
		 * ��������Ҫ��������ָ�룺����������͵ı���first��second��������first��second��ָ���һ����㣬
		 * Ȼ����second�������Ųk-1��λ�ã���ʱfirst��second�ͼ����k-1��λ�ã�
		 * Ȼ����������ƶ��������ڵ㣬ֱ��second�ڵ��ߵ����һ������ʱ��
		 * ��ʱfirst�ڵ���ָ���λ�þ��ǵ�����k���ڵ��λ�á�ʱ�临�Ӷ�ΪO��n��
		 */
		public Node findNode2(Node head,int index){
			
			if (index== 0 || head == null) {
				  return null;
				  }
			Node n1=head;
			Node n2=head;
			for(int i=0;i<index-1;i++){
				n2=n2.next;
			}
			while(n2.next!=null){  
				n1=n1.next;
				n2=n2.next;
			}
			
			return n1;
		}
		
		//����������м�ڵ㣬�����ȱ�����������
		public Node findMidNode(Node head){
			
			Node n1=head;
			Node n2=head;
			while(n2.next.next!=null){
				n2=n2.next;
				n2=n2.next;
				n1=n1.next;
			}
			return n1;
		}
		
		//�ϲ��������������ϲ�����Ȼ����
		public Node reQueue(Node head1,Node head2){
			if(head1==null&&head2==null){
				return null;
			}
			if(head1==null){
				return head2;
			}
			if(head2==null){
				return head1;
			}
			
			Node head=new Node();
			Node current=head;
			
			
			while(head1!=null&&head2!=null){
				if(head1.data<head2.data){
					current.next=head1;
					head1=head1.next;
					
				}else{
					current.next=head2;
					head2=head2.next;
				}
				current=current.next;
				
			}
			if(head1!=null){
				current.next=head1;
			}else{
				current.next=head2;
			}
			
			return head.next;
		}
		
		
		//����ת
		public Node reverseList(Node head){
			
			if(head==null||head.next==null){
				return head;
			}
			Node newhead=null;//��ʼ��Ϊ�պ���Ҫ
			Node current=head;
			Node next=null;
			
			
			while(current!=null){
				
				next=current.next;
				current.next=newhead; //��һ��ִ��ʱ����ԭhead��nextָ��null
				newhead=current;
				current=next;
			}
			return newhead;
		}
		
		
		//��β��ͷ�����ӡ����
		public void backPrint(Node head){
			
			if(head==null){
				return;
		}
			
			Stack<Node> stack=new Stack();
			Node temp=head;
			while(temp!=null){
				stack.push(temp);
				temp=temp.next;
			}
			
			while(stack.isEmpty()==false){
				System.out.println(stack.peek().data);
				stack.pop();
			}
			
		}
		
		

	
				
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkList ll=new LinkList();
		for(int i=0;i<10;i++){
			ll.add(i);
		}
		
		LinkList list1=new LinkList();
		LinkList list2=new LinkList();
		LinkList list3=new LinkList();
		 for (int i = 0; i < 4; i++) {
			  list1.add(i*2);
			  }
		 list1.add(9);

			 for (int i = 1; i < 8; i++) {
			  list2.add(i);
			 }
		//ll.show(ll.head);	 
			

	
		
		
	
		//ll.show(ll.head);
		/*System.out.println("***");
		System.out.println(ll.getLength(ll.head));
		System.out.println(ll.findNode(ll.head, 3).data);
		System.out.println(ll.findNode2(ll.head, 3).data);
		System.out.println(ll.findMidNode(ll.head).data);*/
		
		//�ϲ�����Ĳ��Բ���	 
		list3.head=list3.reQueue(list1.head,list2.head);
		list3.show(list3.head);
		
			 /*Node rehead=list1.reverseList(list1.head);
		System.out.println(rehead.data);
		System.out.println(rehead.next.data);
		System.out.println(rehead.next.next.data);
		System.out.println(rehead.next.next.next.data);*/
		//list1.backPrint(list1.head);
		
		
		
			 

	}

}
