package com.leetcode.string;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Yue on 2017/6/12 0012.
 */
public class test522 {
    public static int findLUSlength(String[] strs) {
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        int len=strs.length;

        for(int i=0;i<len;i++){
            int index=len-1;
            for(int j=0;j<len;j++){
                if(i!=j&&!isSubstring(strs[i],strs[j])){
                    index--;
                }
            }
            if(index==0){
                return strs[i].length();
            }
        }
        return -1;


    }
    public static boolean isSubstring(String s1,String s2){
        int index=0;
        for(char c:s2.toCharArray()){
            if(index<s1.length()&&s1.charAt(index)==c){
                index++;
            }
        }
        return index==s1.length();
    }

    public static void main(String[] args) {
        String [] strs={"aaa","aaa","a"};
        System.out.println(findLUSlength(strs));
    }
}
