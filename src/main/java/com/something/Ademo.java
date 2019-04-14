/**
 * ???????
 */
package com.something;

import java.io.ObjectInputStream.GetField;
import java.lang.*;
import java.math.BigInteger;
import java.net.SocketTimeoutException;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class Ademo {



    public static List

    public static void backTracking(List<List<Integer>> list,List<Integer> temp,int [] nums,int sum,int target,int begin){
        if (sum == target){
            list.add(temp);
            temp.clear();
        } else if(sum < target){
            for(int i = begin;i <nums.length;i++ ){
                temp.add(nums[i]);
                sum+=nums[i];
                backTracking(list,temp,nums,sum,target,i+1);
                sum-=nums[i];
                temp.remove(temp.size()-1);
            }
        }

    }

    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        int sum=0;
        int[] nums={}

    }

}


	



