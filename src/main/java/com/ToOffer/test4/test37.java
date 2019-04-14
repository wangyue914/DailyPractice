/**
 * �������������ҳ����ǵĵ�һ���������
 */
package com.ToOffer.test4;

public class test37 {

	/**
	 * @param args
	 */
	
	private static class LinkNode{
		
		int data;
		LinkNode next;
		public LinkNode(){
			
		}
		public LinkNode(int data){
			this.data=data;
		}
		
		@Override
		public String toString(){
			return data+"";
		}
		
	}
	
	public static void firstCommonNode(LinkNode node1,LinkNode node2){
		
		if(node1==null||node2==null){
			return;
		}
		
		int longLength=getLength(node1);
		int shortLength=getLength(node2);
		int differ=longLength-shortLength;
		
		LinkNode longNode=node1;
		LinkNode shortNode=node2;
		if(differ<0){
			longNode=node2;
			shortNode=node1;
			differ=shortLength-longLength;
		}
		
		for(int i=0;i<differ;i++){
			longNode=longNode.next;
		}
		
		while(longNode!=null&&shortNode!=null&&longNode.data!=shortNode.data){
			longNode=longNode.next;
			shortNode=shortNode.next;
		}
		
		System.out.println(longNode.data);
		
	}
	
	public static int getLength(LinkNode node){
		int i=0;
		while(node!=null){
			i++;
			node=node.next;
		}
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkNode n1 = new LinkNode(1);
        LinkNode n2 = new LinkNode(2);
        LinkNode n3 = new LinkNode(3);
        LinkNode n4 = new LinkNode(4);
        LinkNode n5 = new LinkNode(5);
        LinkNode n6 = new LinkNode(6);
        LinkNode n7 = new LinkNode(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n6;
        n6.next = n7;

        n4.next = n5;
        n5.next = n6;
        firstCommonNode(n1, n4);
       

	}

}
