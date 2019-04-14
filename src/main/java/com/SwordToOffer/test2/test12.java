package com.SwordToOffer.test2;

public class test12 {
    public static void printOneToN(int n) {
        // 输入的数字不能为小于1
        if (n < 1) {
            throw new RuntimeException("The input number must larger than 0");
        }
        // 创建一个数组用于打印存放值
        int[] arr = new int[n];
        printOneToN(0, arr);
    }
    public static void printOneToN(int n,int[]arr){

        if(n>=arr.length){
            printarr(arr);
        }else {
            for(int i=0;i<=9;i++){
                //对n位数的每一位开始赋值
                arr[n]=i;
                printOneToN(n+1, arr);
            }
        }


    }
    public static void printarr(int[]arr){

        int index=0;
        while(index<arr.length&&arr[index]==0){
            index++;
        }
        for(int i=index;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        if(index<arr.length){
            System.out.println();
        }

    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        printOneToN(2);


    }
}
