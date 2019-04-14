package com.LeetCode.array;

/**
 * Created by Yue on 2017/6/18 0018.
 */
public class test1 {
    public static int[] twoSum(int[] nums, int target) {
        if(nums==null){
            return null;
        }
        int result[]=new int[2];
        int i=0;
        while(i<nums.length){
            int j=i+1;
            while(j<nums.length){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
                j++;
            }
            i++;
        }
        return result;

    }

    public static void main(String[] args) {
        int nums[]={0,3,4,0};
        for(int i:twoSum(nums,0)){
            System.out.print(i+" ");
        }
    }
}
