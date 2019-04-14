package com.SwordToOffer.test4;

import jdk.nashorn.internal.ir.BlockLexicalContext;

/**
 * Created by Yue on 2017/6/7 0007.
 */
public class test40 {
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int temp=array[0];
        for(int i=1;i<array.length;i++){
            temp=temp^array[i];
        }
        System.out.println(temp);
        int count=0;
        while((temp&1)!=1&&count<32){
            count++;
            temp>>>=1;

        }
        System.out.println(count);
        for(int i=0;i<array.length;i++){
            if(isBitOne(array[i],count)){

                num1[0]=num1[0]^array[i];
            }else {

                num2[0]=num2[0]^array[i];
            }
        }

    }
    public static boolean isBitOne(int n,int index){
        n>>>=index;
        return (n&1)==1;
    }

    public static void main(String[] args) {
        int[]array={2, 4, 3, 6, 3, 2, 5,5};
        int []num1={0};
        int []num2={0};
        FindNumsAppearOnce(array,num1,num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);

    }
}
