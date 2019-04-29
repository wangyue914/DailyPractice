package com.leetcode.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yue on 2017/6/18 0018.
 */
public class test447 {
    public static int numberOfBoomerangs(int[][] points) {

        Map<Integer,Integer> map=new HashMap<>();
        int result=0;
        for(int i=0;i<points.length;i++){
            int j=0;
            for(j=0;j<points.length;j++){
                if(j!=i){
                    int dis=getDis(points[i],points[j]);
                    if(!map.containsKey(dis)){
                        map.put(dis,1);
                    }else{
                        map.put(dis,map.get(dis)+1);
                    }
                }
            }
            for(int val:map.values()){
                result+=val*(val-1);
            }
            map.clear();


        }
        return result;


    }
    public static int getDis(int []a,int []b){
        return (a[0]-b[0])*(a[0]-b[0])+(a[1]-b[1])*(a[1]-b[1]);
    }

    public static void main(String[] args) {
        int [][]nums={{0,0},
                      {1,0},
                      {2,0}};
        System.out.println(numberOfBoomerangs(nums));
    }
}
