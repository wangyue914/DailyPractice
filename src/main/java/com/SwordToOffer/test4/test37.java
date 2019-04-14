package com.SwordToOffer.test4;

import javax.sound.midi.Soundbank;

/**
 * Created by Yue on 2017/6/3 0003.
 */
public class test37 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null){
            return null;
        }
        ListNode h1=pHead1;
        ListNode h2=pHead2;
        int len1=0,len2=0;
        while(pHead1!=null){
            len1++;
            pHead1=pHead1.next;
        }
        System.out.println(len1);
        while (pHead2!=null){
            len2++;
            pHead2=pHead2.next;
        }
        System.out.println(len2);
        if(len1>len2){
            for(int i=0;i<len1-len2;i++){
                h1=h1.next;
            }
        }else{
            for(int i=0;i<len2-len1;i++){
                h2=h2.next;
            }
        }
        while(h1!=null&&h2!=null){
            if(h1==h2){
                return h1;
            }
            h1=h1.next;
            h2=h2.next;
        }
        return null;

    }

    public static void main(String[] args) {
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
        ListNode n6=new ListNode(6);
        ListNode n7=new ListNode(7);
        ListNode n8=new ListNode(8);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n7;
        n7.next=n8;
        n5.next=n6;
        n6.next=n4;
        System.out.println(FindFirstCommonNode(n1,n5).val);





    }
}
