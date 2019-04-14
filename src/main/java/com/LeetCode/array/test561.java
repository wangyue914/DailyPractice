package com.LeetCode.array;

import java.util.Arrays;

/**
 * Created by Yue on 2017/6/4 0004.
 */
public class test561 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int[]sum=new int [nums.length/2];
        int result=0;
        for(int i=0;i<nums.length;i=i+2){
            result+=nums[i];
        }
        return result;

    }

    public static void main(String[] args) {
        int []arr={1,4,3,2};
        System.out.println(arrayPairSum(arr));
    }
}
