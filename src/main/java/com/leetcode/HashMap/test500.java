package com.leetcode.HashMap;


import java.util.*;

/**
 * Created by Yue on 2017/6/17 0017.
 */
public class test500 {
    public static String[] findWords(String[] words) {
        char row1[]={'q','w','e','r','t','y','u','i','o','p'};
        char row2[]={'a','s','d','f','g','h','j','k','l'};
        char row3[]={'z','x','c','v','b','n','m'};
        Map<Character,Integer> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            map.put(row1[i],1);
        }
        for(int i=0;i<9;i++){
            map.put(row2[i],2);
        }
        for(int i=0;i<7;i++){
            map.put(row3[i],3);
        }

        for(String str:words){
            char[] c=str.toLowerCase().toCharArray();
            int index=map.get(c[0]);
            int i=1;
            for(i=1;i<c.length;i++){
                if(index!=map.get(c[i])){
                    break;
                }
            }
            if(i==c.length){
                list.add(str);
            }
        }
        String []result=new String [list.size()];
        for(int j=0;j<list.size();j++){
            result[j]=list.get(j);
        }
        return result;

    }

    public static void main(String[] args) {
        String[] words={"Hello", "Alaska", "Dad", "Peace"};
        String[] strs=findWords(words);
        for(String str:strs){
            System.out.print(str+" ");
        }
    }
}
