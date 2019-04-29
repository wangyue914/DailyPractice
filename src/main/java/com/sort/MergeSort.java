package com.sort;

/**
 * Created by Administrator on 2017/3/28 0028.
 * 归并排序
 */
public class MergeSort {
    public static void merge(int [] data,int start,int mid,int end) {
        int len1=mid-start+1;
        int len2=end-mid;

        int []left=new int [len1];
        int []right=new int [len2];
        for(int i=0;i<len1;i++){
            left[i]=data[start+i];
        }
        for(int i=0;i<len2;i++){
            right[i]=data[mid+i+1];
        }

        int i=0,j=0;
        int k;
        for(k=start;k<end;k++){
            if(i==len1||j==len2){
                break;
            }
            if(left[i]<right[j]){
                data[k]=left[i];
                i++;
            }else{
                data[k]=right[j];
                j++;
            }

        }

        while(i<len1){
            data[k]=left[i];
            k++;
            i++;
        }
        while(i<len2){
            data[k]=right[j];
            k++;
            j++;
        }

    }

    public static void mergeSort(int []data,int start,int end){
       if(start<end){
           int mid=(start+end)/2;
           mergeSort(data,start,mid);
           mergeSort(data,mid+1,end);
           merge(data,start,mid,end);
       }
    }

    public static void main(String[] args) {
        int [] data={2,4,13,5,8,3,9,34,20};
        mergeSort(data,0,8);
        for(int i:data){
            System.out.print(i+" ");
        }
    }
}
