package com.sword2offer.test5;

import java.util.Arrays;

/**
 * Created by Yue on 2017/6/8 0008.
 */
public class test44 {
    public static boolean isContinuous(int [] numbers) {
        if(numbers==null||numbers.length<1){
            return false;
        }
        Arrays.sort(numbers);
        int count0=0;
        int temp=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                count0++;
            }
            if(i>=1&&numbers[i]!=0){
                if(temp==numbers[i]){
                    return false;
                }
                temp=numbers[i];
            }
        }
        int countX=0;
        for(int i=count0;i<numbers.length-1;i++){
            countX=countX+numbers[i+1]-numbers[i]-1;
        }
        if(count0>=countX){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 7, 0};
        System.out.println(isContinuous(nums));
    }
}
