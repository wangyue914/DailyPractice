package com.SwordToOffer.test5;

/**
 * Created by Yue on 2017/6/14 0014.
 */
public class test46 {
    public static int Sum_Solution(int n) {

        int sum = n;
        boolean flag=n>0&&(sum+=Sum_Solution(n-1))>0;

        return sum;

    }



    public static void main(String[] args) {
        System.out.println(Sum_Solution(5));
    }


}
