package com.LeetCode.HashMap;

import java.util.*;

/**
 * Created by Yue on 2017/6/23 0023.
 */
public class test347 {
    public static List<Integer> topKFrequent(int[] nums, int k){
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> result[]=new ArrayList [nums.length+1];
        for(int n:map.keySet()){
            if(result[map.get(n)]==null){
                result[map.get(n)]=new ArrayList<>();
            }
            result[map.get(n)].add(n);
        }



        for(int i=result.length-1;i>=0&&list.size()<k;i--){
            if(result[i]!=null){
                list.addAll(result[i]);

            }

        }
        return list;

    }

    public static void main(String[] args) {
        int nums[]={4,1,-1,2,-1,2,3};
        int k=2;
        List<Integer> list=topKFrequent(nums,k);
        for(int i=0;i<k;i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
