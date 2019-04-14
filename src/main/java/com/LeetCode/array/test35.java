package com.LeetCode.array;

/**
 * Created by Yue on 2017/6/1 0001.
 */
public class test35 {
    public static int searchInsert(int[] nums, int target) {
        return searchInsert(nums,0,nums.length,target);
    }
    public static int searchInsert(int [] nums,int left,int right,int target){
        if(left>=right){
            return left;
        }
        int mid=(left+right)/2;
        int index;
        if(target==nums[mid]){
            index=mid;
        }else if(target<nums[mid]){
            index=searchInsert(nums,left,mid,target);
        }else{
            index=searchInsert(nums,mid+1,right,target);
        }
        return index;

    }

    public static void main(String[] args) {
        int []nums={1,3,5,6};
        System.out.println(searchInsert(nums,0));
    }
}
