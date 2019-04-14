package com.LeetCode.array;

/**
 * Created by wangyue66 on 2017/11/14.
 */
public class test33 {
    public static int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;

        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>=nums[low]){
                if(nums[mid]>target&&nums[low]<target){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }

            if(nums[mid]<=nums[high]){
                if(target<=nums[high]&&target>=nums[mid]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }

        }
        return -1;

    }
}
