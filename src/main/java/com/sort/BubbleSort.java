package com.sort;

/**
 * Created by Administrator on 2017/3/27 0027.
 * 冒泡排序
 */
public class BubbleSort {
    //原始版冒泡排序
    public static void bubbleSort(int []data,int n){
        for(int i=0;i<n;i++){

            for(int j=0;j<n-i-1;j++){
                if(data[j]>data[j+1]){
                    int temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;

                }
            }

        }
    }
    //改进版冒泡排序
    public static void bubbleSort2(int arr[]){
        int len=arr.length;

        for(int i=0;i<len;i++){

            boolean flag=false;
            for(int j=0;j<len-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }

            }
            if(!flag){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int data[]={2,4,13,5,8,3,9,34,20};
        bubbleSort(data,data.length);
        for(int i:data){
            System.out.print(i+" ");
        }
    }
}
