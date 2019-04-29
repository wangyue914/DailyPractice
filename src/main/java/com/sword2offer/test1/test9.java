package com.sword2offer.test1;

/**
 * Created by yue on 17-10-13 下午2:42.
 **/
public class test9 {
    public static int Fibonacci(int n){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }

        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(7));
    }
}
