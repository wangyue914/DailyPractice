package com.Sort;

/**
 * Created by Administrator on 2017/3/27 0027.
 * 直接插入排序
 */
public class InsertSort {

    public static void insertSort(int[] data,int n){

        int p;
        for(p=1;p<n;p++){
            int temp=data[p];
            int i=p-1;
            while(i>=0&&temp<data[i]){
                data[i+1]=data[i];
                i--;
            }
            data[i+1]=temp;
        }
    }
    public static void main(String[] args) {

        int []data={87,45,78,32,17,65,53,9,122};
        insertSort(data,9);
        for(int i:data){
            System.out.print(i+" ");
        }


    }
}
