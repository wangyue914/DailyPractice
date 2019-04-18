package com.something;
/**
 * Created by Yue on 2017/4/17 0017.
 */

public class AADemo {
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
        int nums[]={1,4};
        for(int i:searchRange(nums,4)){
            System.out.println(i);
        }
    }


}



