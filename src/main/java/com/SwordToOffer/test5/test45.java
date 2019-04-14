package com.SwordToOffer.test5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yue on 2017/6/8 0008.
 */
public class test45 {
    public static int LastRemaining_Solution(int n, int m) {
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        int start=0;
        int index=0;
        while (list.size()>1){

            index=(m-1+index)%list.size();
            list.remove((index)%list.size());
            System.out.println(index);
        }
        return list.get(0);

    }

    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(6,7));
    }
}
