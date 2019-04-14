package com.LeetCode.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yue on 2017/6/17 0017.
 */
public class test525 {
    public static int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxlen=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum)){
                maxlen=maxlen>i-map.get(sum)?maxlen:i-map.get(sum);
            }else {
                map.put(sum,i);
            }
        }
        return maxlen;

    }

    public static void main(String[] args) {
        int []nums={0,1,0};
        System.out.println(findMaxLength(nums));
    }
}
