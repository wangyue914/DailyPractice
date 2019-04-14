package com.LeetCode.array;

/**
 * Created by Yue on 2017/6/4 0004.
 */
public class test283 {
    public static void moveZeroes(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
            }
        }
        for(int i=0;i<n-count;i++){

            int flag=0;
            while(nums[i]==0){
                flag++;
                for(int j=i;j<n-flag;j++){
                    nums[j]=nums[j+1];
                }
                nums[n-flag]=0;
            }
        }

    }

    public static void main(String[] args) {
        int []nums={0,1,0,3,12};
        moveZeroes(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
