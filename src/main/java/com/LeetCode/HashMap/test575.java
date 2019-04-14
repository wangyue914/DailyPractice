package com.LeetCode.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yue on 2017/6/21 0021.
 */
public class test575 {
    public static int distributeCandies(int[] candies) {
        if(candies==null||candies.length<1){
            return 0;
        }
        Map<Integer,Integer> map=new HashMap<>();
        map.put(candies[0],0);
        int result=1;
        for(int i=1;i<candies.length;i++){
            if(!map.containsKey(candies[i])){
                map.put(candies[i],0);
                result++;
            }
        }
        int index= candies.length/2;
        if(result<index){
            return result;
        }
        return index;

    }

    public static void main(String[] args) {
        int []nums={1,1,2,3};
        System.out.println(distributeCandies(nums));
    }
}
