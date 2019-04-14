package com.LeetCode.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by wangyue66 on 2017/11/7.
 */
public class test16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<nums.length-2;i++){
            int low=i+1,high=nums.length-1;
            while(low<high){
                int current=nums[i]+nums[low]+nums[high];
                if(Math.abs(current-target)<Math.abs(sum-target)){
                    sum=current;
                }
                if(current>target){
                    high--;
                }else{
                    low++;
                }
            }

        }
        return sum;
    }


    public static void main(String[] args) {
        int nums[]={0,2,1,-3};
        System.out.println(threeSumClosest(nums,1));

    }
}


