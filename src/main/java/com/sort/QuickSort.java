package com.sort;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class QuickSort {

    public static void quickSort(int data[],int left,int right){

        if(left>=right){
            return;
        }
        int low=left;
        int high=right;
        int temp=data[low];
        while(low<high){

            while(low<high&&temp<=data[high]){
                high--;
            }
            data[low]=data[high];
            while(low<high&&temp>=data[low]){
                low++;
            }
            data[high]=data[low];

        }
        data[low]=temp;
        quickSort(data,left,low-1);
        quickSort(data,low+1,right);

    }

    public static void main(String[] args) {
        int data[]={2,4,13,5,8,3,9,34,20};
        quickSort(data,0,data.length-1);
        for(int i:data){
            System.out.print(i+" ");
        }
    }
}
