package com.LeetCode.string;

/**
 * Created by Yue on 2017/6/13 0013.
 */
public class test541 {
    public static String reverseStr(String s, int k) {
        char []c=s.toCharArray();
        int index=0;
        while(c.length-index>=2*k){
            reverse(c,index,index+k-1);
            index=index+2*k;
        }
        if(c.length-index>=k){
            reverse(c,index,index+k-1>c.length-1?c.length-1:index+k-1);
        }else{
            reverse(c,index,c.length-1);
        }
        return String.valueOf(c);


    }
    public static void reverse(char []c,int start,int end){
        while(start<end){
            char temp=c[end];
            c[end]=c[start];
            c[start]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String str="abcd";
        System.out.println(reverseStr(str,3));
    }
}
