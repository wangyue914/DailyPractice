package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yue on 2017/5/31 0031.
 */
public class test448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        if(nums==null){
            return null;
        }
        List<Integer> list =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index]=-nums[index];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int []nums={4,3,2,7,8,2,3,1};
        for(int i:findDisappearedNumbers(nums)){
            System.out.print(i+" ");
        }

    }
}
