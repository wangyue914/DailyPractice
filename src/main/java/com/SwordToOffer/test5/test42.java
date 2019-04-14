package com.SwordToOffer.test5;

/**
 * Created by Yue on 2017/6/7 0007.
 */
public class test42 {

    //反转单词顺序
    public static String ReverseSentence(String s) {

return "";

    }

    //左旋转字符串
    public static String LeftRotateString(String str,int n) {
        int len=str.length();
        str=reverse(str,0,len-1);
        str=reverse(str,0,len-n-1);
        str=reverse(str,len-n,len-1);
        return str;


    }
    public static String reverse(String str,int i,int j){
        char[] c=str.toCharArray();
        int left=i;
        int right=j;
        while(right>left){
            char x=c[left];
            c[left]=c[right];
            c[right]=x;
            right--;
            left++;
        }
        return String.valueOf(c);

    }

    public static void main(String[] args) {
        String str="abcXYZdef";
        System.out.println(LeftRotateString(str,3));
    }
}
