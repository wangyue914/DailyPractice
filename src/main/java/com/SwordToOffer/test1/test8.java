package com.SwordToOffer.test1;

/**
 * Created by yue on 17-10-13 下午2:37.
 **/
public class test8 {
    public static int findMin(int arr[]){
        int start=0;
        int end=arr.length-1;
        int mid=start;
        while(arr[start]>arr[end]){

            if(end-start==1){
                return arr[end];
            }
            mid=(start+end)/2;
            if(arr[mid]>arr[start]){
                start=mid;
            }else if(arr[mid]<arr[end]){
                end=mid;
            }

        }
        return arr[mid];
    }

    public static void main(String[] args) {
        int arr[]={3,4,5};
        System.out.println(findMin(arr));
    }
}
