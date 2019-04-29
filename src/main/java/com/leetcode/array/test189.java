package com.leetcode.array;

/**
 * Created by Yue on 2017/6/6 0006.
 */
public class test189 {
    public static void rotate(int[] nums, int k) {
        if(nums==null||nums.length<1){
            return;
        }

        k=k%nums.length;

        int []temp=new int[k];
        int j=0;
        for(int i=nums.length-k;i<nums.length;i++){
            temp[j++]=nums[i];
        }
        for(int i=nums.length-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i]=temp[i];
        }

    }
    public static void rotate2(int []nums,int k){
        if(nums==null||nums.length<1){
            return;
        }

        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k, nums.length-1);

    }
    public static void reverse(int []nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        rotate2(nums,3);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
