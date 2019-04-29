package com.leetcode.DP_Problems;

import java.util.List;

/**
 * Created by Yue on 2017/6/30 0030.
 */
public class test120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int []min=new int [triangle.size()+1];
        for(int i=triangle.size()-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                min[j]=Math.min(min[j],min[j+1])+triangle.get(i).get(j);

            }
        }
        return min[0];

    }

}
