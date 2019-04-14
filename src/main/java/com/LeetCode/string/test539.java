package com.LeetCode.string;

import java.lang.reflect.Array;
import java.nio.channels.Pipe;
import java.util.*;

/**
 * Created by Yue on 2017/6/10 0010.
 */
public class test539 {
    public static int findMinDifference(List<String> timePoints) {
        int len=timePoints.size();
        boolean []flag=new boolean[24*60];

        for(int i=0;i<len;i++){
            String []str=timePoints.get(i).split(":");
            int index=Integer.parseInt(str[0])*60+Integer.parseInt(str[1]);

            if(flag[index]){
                return 0;
            }
            flag[index]=true;

        }
        int result=24*60,pre=0;
        int start=24*60;
        int end=0;
        for(int i=0;i<24*60;i++){
            if(flag[i]){
                if(start!=24*60){
                    result=result<i-pre?result:i-pre;
                }
                if(i<start){
                    start=i;
                }
                if(i>end){
                    end=i;
                }
                pre=i;


            }
        }
        return (24*60-end+start)<result?(24*60-end+start):result;

    }

    public static void main(String[] args) {
        List<String > list=new ArrayList<>();
        //list.add("23:59");
        list.add("00:00");
        list.add("10:10");
        System.out.println(findMinDifference(list));
    }
}
