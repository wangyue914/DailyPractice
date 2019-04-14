package com.LeetCode.array;

import java.util.HashSet;

/**
 * Created by Yue on 2017/6/3 0003.
 */
public class test217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i:nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;

    }

    public static void main(String[] args) {
        int []nums={5,3,9,4,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
}
