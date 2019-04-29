package com.sword2offer.test3;

/**
 * Created by Yue on 2017/6/25 0025.
 */
public class test26 {
    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;
        public RandomListNode(){}

        public RandomListNode(int label) {
            this.label = label;
        }
    }
    public static RandomListNode Clone(RandomListNode pHead) {
        RandomListNode root=pHead;
        while(root!=null){
            RandomListNode next=root.next;
            root.next=new RandomListNode(root.label);
            root.next.next=next;
            root=next;
        }
        root=pHead;

        while (root!=null){
            if(root.random!=null){
                root.next.random=root.random.next;
            }
            root=root.next.next;
        }
        root=pHead.next;
        RandomListNode  newhead=root;
        while (pHead!=null){

            root.next=root.next.next;
            root=root.next;

            pHead=pHead.next.next;
        }
        return newhead;


    }

    public static void main(String[] args) {
        RandomListNode root=new RandomListNode(1);
        root.next=new RandomListNode(2);
        root.next.next=new RandomListNode(3);
        root.next.next.next=new RandomListNode(4);
        root.next.next.next.next=new RandomListNode(5);
        root.random=root.next.next;
        root.next.random=root.next.next.next.next;
        root.next.next.next.random=root.next;
        RandomListNode head=Clone(root);
        System.out.println(head.label);
        System.out.println(head.next.label);
        System.out.println(head.next.next.label);
        System.out.println(head.next.next.next.label);
        System.out.println(head.random.label);
        System.out.println(head.next.next.next.random.label);
    }
}
