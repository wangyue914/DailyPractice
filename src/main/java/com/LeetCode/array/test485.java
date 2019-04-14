package com.LeetCode.array;

/**
 * Created by Yue on 2017/6/1 0001.
 * 485 Max Consecutive Ones
 */
public class test485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int current=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                temp++;
            }else{
                if(temp>current){
                    current=temp;
                }
                temp=0;
            }
        }
        return (current>temp)?current:temp;

    }

    public static void main(String[] args) {
        int []arr={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
