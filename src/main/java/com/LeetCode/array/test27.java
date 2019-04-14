package com.LeetCode.array;

/**
 * Created by Yue on 2017/5/31 0031.
 * 27. Remove Element
 */
public class test27 {
    public static int removeElement(int[] nums, int val) {
        if(nums==null){
            return 0;
        }
        int len=nums.length;
        for(int i=0;i<len;i++){
            while(nums[i]==val&&len>=1){

                if(i==len-1){
                    return len-1;
                }
                int temp=nums[i];
                nums[i]=nums[len-1];
                nums[len-1]=temp;
                len--;

            }
        }
        return len;

    }
    /* other way
    public static int removeElement(int[] nums, int val){
        if(nums==null){
            return 0;
        }
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }*/


    public static void main(String[] args) {
        int []nums={3,2,2,3};
        System.out.println(removeElement(nums,3));
    }
}
