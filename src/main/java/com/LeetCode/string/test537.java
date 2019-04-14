package com.LeetCode.string;

/**
 * Created by Yue on 2017/6/7 0007.
 */
public class test537 {
    public static String complexNumberMultiply(String a, String b) {
        String[]str1=a.split("\\+");
        String[]str2=b.split("\\+");
        int x1=Integer.valueOf(str1[0]);
        int y1;
        if(str1[1].charAt(0)=='-'){
            y1=0-Integer.valueOf(str1[1].substring(1,str1[1].length()-1));
        }else{
            y1=Integer.valueOf(str1[1].substring(0,str1[1].length()-1));
        }
        int x2=Integer.valueOf(str2[0]);
        int y2;
        if(str2[1].charAt(0)=='-'){
            y2=0-Integer.valueOf(str2[1].substring(1,str2[1].length()-1));
        }else{
            y2=Integer.valueOf(str2[1].substring(0,str2[1].length()-1));
        }
        int re1=x1*x2-y1*y2;
        int re2=x2*y1+x1*y2;
        String result=null;
        result=String.valueOf(re1)+"+"+String.valueOf(re2)+"i";


        return result;

    }

    public static void main(String[] args) {
        String a="1+-1i";
        String b="1+-1i";
        System.out.println(complexNumberMultiply(a,b));
    }
}
