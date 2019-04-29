package com.leetcode.string;

/**
 * Created by Yue on 2017/6/13 0013.
 */
public class test521 {
    public static int findLUSlength(String a, String b) {
        int len1=a.length();
        int len2=b.length();
        if(len1!=len2){
            return len1>len2?len1:len2;
        }
        if(!isSubstring(a,b)){
            return b.length();
        }
        /*if(!isSubstring(b,a)){
            return a.length();
        }*/
        return -1;



    }
    public static boolean isSubstring(String a,String b){

        int index=0;
        int count=b.length();
        for(char c1:a.toCharArray()){
            if(index<b.length()&&b.toCharArray()[index]==c1){
                index++;
                count--;
            }
        }
        System.out.println(count);
        if(count==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String a="aaa";
        String b="aaa";
        System.out.println(findLUSlength(a,b));
    }
}
