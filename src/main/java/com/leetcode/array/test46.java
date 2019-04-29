package com.leetcode.array;

import java.util.*;

/**
 * Created by wangyue66 on 2017/11/20.
 */
public class test46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        backtracking(nums,0,list);
        Collections.sort(list, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                for(int i=0;i<o1.size();i++){
                    if(o1.get(i)==o2.get(i)){
                        continue;
                    }
                    return Integer.compare(o1.get(i),o2.get(i));
                }
                return 0;
            }
        });
        return list;
    }
    public static void backtracking(int []nums,int begin,List<List<Integer>> list){
        if(begin>=nums.length){

            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                temp.add(nums[i]);
            }
            list.add(new ArrayList<>(temp));
        }
        for(int i=begin;i<nums.length;i++){
            swap(nums,begin,i);
            backtracking(nums, begin + 1, list);
            swap(nums,begin,i);

        }
    }
    public static void swap(int []nums,int n,int m){
        int temp=nums[n];
        nums[n]=nums[m];
        nums[m]=temp;

    }

    public static void main(String[] args) {
        int []nums={1,2,3};
        System.out.println(permute(nums));
    }
}
