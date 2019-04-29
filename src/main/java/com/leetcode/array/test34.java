package com.leetcode.array;

/**
 * Created by wangyue66 on 2017/11/14.
 */
public class test34 {
    public static int[] searchRange(int[] nums, int target) {
        int result[]={-1,-1};
        int low=0;
        int high=nums.length-1;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                index=mid;
                break;
            }
            if(nums[mid]<target){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        if(index==-1){
            return result;
        }
        int left=index,right=index;
        while(left>=low&&nums[left]==target){
            left--;
        }
        while(right<=high&&nums[right]==target){
            right++;
        }
        result[0]=left+1;
        result[1]=right-1;
        return result;

    }

    public static void main(String[] args) {
        int nums[]={2,2};
        int resu[]=searchRange(nums,2);
        for(int i:resu){
            System.out.println(i);
        }

    }
}
