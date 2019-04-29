package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wangyue66 on 2017/11/20.
 */
public class test90 {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backtracking(nums,0,list,temp);
        return list;


    }

    public static void backtracking(int []nums,int begin,List<List<Integer>> list,List<Integer> temp){
        list.add(new ArrayList<>(temp));
        for(int i=begin;i<nums.length;i++){

            //排序之后相同的数字都处于连续的位置
            if(i>begin&&nums[i]==nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            backtracking(nums, i + 1, list, temp);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        int []nums={4,4,4,1,4};
        System.out.println(subsetsWithDup(nums));
    }
}
