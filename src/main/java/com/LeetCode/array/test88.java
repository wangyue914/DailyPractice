package com.LeetCode.array;

/**
 * Created by Yue on 2017/6/5 0005.
 */
public class test88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m-1;i>=0;i--){
            nums1[n+i]=nums1[i];
        }
        int i=0,j=0;
        int k=n;
        while(j<n&&k<n+m){
            if(nums1[k]<nums2[j]){
                nums1[i]=nums1[k];
                k++;
            }else {
                nums1[i]=nums2[j];
                j++;
            }
            i++;
        }
        if(j==n){
            while(k<n+m){
                nums1[i++]=nums1[k++];

            }

        }
        if(k==n+m){
            while(j<n){
                nums1[i++]=nums2[j++];
            }
        }

    }

    public static void main(String[] args) {
        int []nums1={1,2,4,5,6,0};
        int []nums2={3};
        merge(nums1,5,nums2,1);
        for(int i:nums1){
            System.out.print(i+" ");
        }

    }
}
