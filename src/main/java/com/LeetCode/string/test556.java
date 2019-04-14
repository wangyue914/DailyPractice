package com.LeetCode.string;

import java.util.Arrays;

/**
 * Created by Yue on 2017/6/11 0011.
 */
public class test556 {
    public static int nextGreaterElement(int n) {
        String str=String.valueOf(n);
        char[] c=str.toCharArray();
        if(c.length==1){
            return -1;
        }
        int index=c.length-1;
        for(int i=c.length-1;i>=1;i--){
            if(c[i]>c[i-1]){
                index=i-1;
                break;
            }
            if(i==1){
                return -1;
            }
        }
        Arrays.sort(c,index+1,c.length);
        int current=index;
        for(int i=index+1;i<c.length;i++){
            if(c[current]<c[i]){
                current=i;
                break;
            }
        }
        char temp=c[index];
        c[index]=c[current];
        c[current]=temp;
        Arrays.sort(c,index+1,c.length);

        int re=-1;
        String result=String.valueOf(c);
        try {
             re = Integer.valueOf(result);
        }catch (Exception e){
            return -1;
        }
        return re;

    }

    public static void main(String[] args) {
        int n=12;
        System.out.println(nextGreaterElement(n));
    }
}
