package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yue on 2017/6/2 0002.
 * 118 Pascal's Triangle
 */
public class test118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList();
        for(int i=0;i<numRows;i++){
            list.add(new ArrayList<Integer>());
        }
        for(int i=0;i<numRows;i++){
            if(i==0){
                list.get(i).add(1);
            }else{
                list.get(i).add(1);
                int j=1;
                while(j<i){
                    list.get(i).add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                    j++;

                }
                list.get(i).add(1);
            }

        }
        return list;

    }

    public static void main(String[] args) {
        List<List<Integer>> list=generate(5);
        for(int i=0;i<list.size();i++){
            for(int j:list.get(i)){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
