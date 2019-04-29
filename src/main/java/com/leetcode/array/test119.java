package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yue on 2017/6/2 0002.
 * 119 Pascal's Triangle II
 */
public class test119 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<rowIndex+1;i++){
            list.add(1);
            for(int j=i-1;j>0;j--){
                list.set(j,list.get(j-1)+list.get(j));
            }
        }
        return list;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list= (ArrayList<Integer>) getRow(4);
        for(int i:list){
            System.out.print(i+" ");
        }

    }


}
