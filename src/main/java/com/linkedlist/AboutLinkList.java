package com.linkedlist;

/**
 * Created by Yue on 2017/6/15 0015.
 */
public class AboutLinkList {
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(){}
        public ListNode(int val){
            this.val=val;
        }
    }

    //单链表的遍历
    public static void show(ListNode head){
        if(head==null){
            return;
        }
        ListNode root=head;
        while(root!=null){
            System.out.println(root.val);
            root=root.next;
        }
    }

    //单链表的反转
    public static ListNode reverse(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode newHead=null;
        ListNode current=head;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=newHead;
            newHead=current;
            current=next;
        }
        return newHead;

    }
    //查询倒数第k个节点
    public static ListNode lastK(ListNode head,int k){
        ListNode n1=head;
        ListNode n2=head;
        for(int i=0;i<k-1;i++){
            n1=n1.next;
        }
        while(n1.next!=null){
            n1=n1.next;
            n2=n2.next;
        }
        return n2;
    }

    public static void main(String[] args) {
        ListNode n1 =new ListNode(1);
        n1.next=new ListNode(2);
        n1.next.next=new ListNode(3);
        n1.next.next.next=new ListNode(4);
        n1.next.next.next.next=new ListNode(5);
        n1.next.next.next.next.next=new ListNode(6);
        ListNode head=lastK(n1,3);
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }

}
