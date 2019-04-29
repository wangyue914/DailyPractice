package com.sword2offer.test4;

/**
 * Created by Yue on 2017/6/5 0005.
 */
public class test38 {
    public static int GetNumberOfK(int [] array , int k) {

        int start=0;
        int end=array.length-1;
        int mid=(start+end)/2;
        while(array[mid]!=k){
            if(array[mid]>k){
                end=mid;
                mid=(start+end)/2;
            }else{
                start=mid;
                mid=(start+end)/2;
            }
        }

        int count=0;
        int i=mid;
        while(array[i]==k){
            count++;
            if(i==0){
                break;
            }
            i--;

        }
        int j=mid+1;
        while(array[j]==k){
            count++;
            if(j==array.length-1){
                break;
            }
            j++;
        }
        System.out.println(i);
        System.out.println(j);
        return count;
    }

    public static void main(String[] args) {
        int []array={1, 2, 3, 3, 3, 3, 4, 5};
        System.out.println(GetNumberOfK(array,3));
    }
}
