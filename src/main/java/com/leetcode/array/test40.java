package com.leetcode.array;

import java.util.*;

/**
 * Created by wangyue66 on 2017/11/20.
 */
public class test40 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int sum = 0;
        backTrackink(list, temp, candidates, target, sum, 0);
        return list;

    }

    public static void backTrackink(List<List<Integer>> list, List<Integer> temp, int[] candidates, int target, int sum, int begin) {
        if (sum == target) {
            list.add(new ArrayList<>(temp));

        } else if (sum < target) {
            for (int i = begin; i < candidates.length; i++) {
                if (i > begin && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                sum += candidates[i];
                temp.add(candidates[i]);
                backTrackink(list, temp, candidates, target, sum, i + 1);
                temp.remove(temp.size() - 1);
                sum -= candidates[i];
            }
        }
    }

    public static void main(String[] args) {
        int []nums={10, 1, 2, 7, 6, 1, 5};
        System.out.println(combinationSum2(nums,8));
    }
}
