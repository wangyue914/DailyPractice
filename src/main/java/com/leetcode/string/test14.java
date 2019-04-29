package com.leetcode.string;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Yue on 2017/6/14 0014.
 */
public class test14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length<1){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        String sub=strs[0];
        for(int i=0;i<strs[0].length();i++){
            if(sub.length()==0){
                return "";
            }
            int j=1;
            for(j=1;j<strs.length;j++){
                if(!isSubstring(sub,strs[j])){
                    break;
                }
            }
            if(j==strs.length){
                break;
            }
            sub=sub.substring(0,sub.length()-1);
        }
        return "*"+sub+"*";


    }
    public static boolean isSubstring(String str1,String str2){

        int index=0;
        for(char c:str1.toCharArray()){
            if(str2.toCharArray()[index]!=c){
                return false;
            }
            index++;
        }
        return true;
    }

    public static void main(String[] args) {
        String []str={"c","c"};
        System.out.println(longestCommonPrefix(str));
    }
}
