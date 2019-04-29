package com.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yue on 2017/6/13 0013.
 */
public class test13 {
    public static int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('X',10);
        map.put('C',100);
        map.put('M',1000);
        map.put('V',5);
        map.put('L',50);
        map.put('D',500);
        char c[]=s.toCharArray();
        int i=0;
        int sum=0;
        while(i<c.length-1){
            if(map.get(c[i])<map.get(c[i+1])){
                sum+=map.get(c[i+1])-map.get(c[i]);
                i=i+2;
            }else {
                sum+=map.get(c[i]);
                i++;
            }
        }
        if(i==c.length-1){
            sum+=map.get(c[i]);
        }
        return sum;


    }

    public static void main(String[] args) {
        String s="MCMLXXX";
        System.out.println(romanToInt(s));
    }
}
