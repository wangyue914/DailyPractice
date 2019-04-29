package com.leetcode.array;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangyue66 on 2017/11/20.
 */
public class test78 {
    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backtracking(nums,0,temp,list);
        return list;
    }

    public static void backtracking(int []nums,int begin,List<Integer> temp,List<List<Integer>> list){
        list.add(new ArrayList<>(temp));
        for(int i=begin;i<nums.length;i++){
            temp.add(nums[i]);
            backtracking(nums, i + 1, temp, list);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        int []nums={1,2,3};
        System.out.println(subsets(nums));
    }
}
