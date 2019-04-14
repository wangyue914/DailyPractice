package com.LeetCode.array;

import java.lang.annotation.ElementType;

/**
 * Created by Yue on 2017/6/6 0006.
 */
public class test169 {
    public static int majorityElement(int[] nums) {
        int count=1;
        int key=nums[0];
        for(int i=1;i<nums.length;i++){
            if(count==0){
                key=nums[i];
                count=1;
            }
            else if(nums[i]==key){
                count++;
            }else{
                count--;
            }
        }
        return key;

    }

    public static void main(String[] args) {
        int []nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
