package com.sword2offer.test5;

/**
 * Created by Yue on 2017/6/15 0015.
 */
public class test47 {
    public static int Add(int num1,int num2) {
        int sum=0;
        int c=0;
        while(true){
            sum=num1^num2;
            c=(num1&num2)<<1;

            num1=sum;
            num2=c;
            if(c==0){
                break;
            }
        }
        return num1;

    }

    public static void main(String[] args) {
        System.out.println(Add(1,2));
    }

}
