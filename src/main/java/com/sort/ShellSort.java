package com.sort;

/**
 * Created by Administrator on 2017/3/27 0027.
 * 希尔排序
 */
public class ShellSort {

    public static void shellSort(int data[],int n){
        int d=n/2;

        while(d>1){
            for(int k=0;k<d;k++){

                for(int i=k+d;i<n;i=i+d){
                    int temp=data[i];
                    int j=i-d;
                    while(j>=k&&data[j]>temp){
                        data[j+d]=data[j];
                        j=j-d;
                    }
                    data[j+d]=temp;
                }
            }
            d=d/2;

        }

    }



    public static void main(String[] args) {
        int []data={87,45,78,32,17,65,53,9,122};
        shellSort(data,9);
        for(int i:data){
            System.out.print(i+" ");
        }

    }
}
