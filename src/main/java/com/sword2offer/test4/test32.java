package com.sword2offer.test4;

/**
 * Created by Yue on 2017/6/2 0002.
 */
public class test32 {
    public static int NumberOf1Between1AndN_Solution(int n) {
        int count=0;
        for(int i=1;i<=n;i=i*10){
            int a=n/i;
            int b=n%i;
            count=count+(a+8)/10*i+(a%10==1?1:0)*(b+1);
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(21345));
    }
}
