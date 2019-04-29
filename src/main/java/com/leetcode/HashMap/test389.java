package com.leetcode.HashMap;

/**
 * Created by Yue on 2017/6/21 0021.
 */
public class test389 {
    public static char findTheDifference(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        int []result=new int[26];
        for(int i=0;i<s1.length;i++){
            result[s1[i]-'a']++;
        }
        for(int i=0;i<t1.length;i++){
            result[t1[i]-'a']--;
        }
        int index=0;
        for(int i=0;i<result.length;i++){
            if(result[i]!=0){
                index=i;
                break;
            }
        }
        return (char)('a'+index);

    }

    public static void main(String[] args) {
        String s="a";
        String t="aa";
        System.out.println(findTheDifference(s,t));
    }
}
