package com.leetcode.array;


import java.util.Arrays;

/**
 * Created by Yue on 2017/6/3 0003.
 */
public class test268 {
    public static int missingNumber(int[] nums) {
        int len=nums.length;
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<len;i++){
            if(nums[i]==sum){
                sum++;
            }else{
                return sum;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int []nums={0,1,3};
        System.out.println(missingNumber(nums));
    }
}
