package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wangyue66 on 2017/11/15.
 */
public class test39 {


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        int sum=0;
        backTrackink(list, temp, candidates, target, sum,0);
        System.out.println(list);
        return  list;

    }

    public static void backTrackink(List<List<Integer>> list,List<Integer> temp,int []candidates, int target,int sum,int begin){
        if(sum==target){
            list.add(new ArrayList<>(temp));

        }

        else if(sum<target){
            for(int i=begin;i<candidates.length;i++){
                sum+=candidates[i];
                temp.add(candidates[i]);
                backTrackink(list,temp,candidates,target, sum, i);
                temp.remove(temp.size()-1);
                sum-=candidates[i];

            }
        }


    }
    public static void main(String[] args) {
        int nums[]={2,3,6,7};
        System.out.println(combinationSum(nums,7));

    }

}
