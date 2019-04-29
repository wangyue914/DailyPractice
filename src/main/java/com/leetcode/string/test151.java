package com.leetcode.string;

/**
 * Created by Yue on 2017/6/8 0008.
 */
public class test151 {
    public static String reverseWords(String s) {

        if(s==null||s.length()<1||s.trim().equals("")){
            return s;
        }
        String []str=s.split(" ");
        int left=0;
        int right=str.length-1;
        while(left<right){
            String temp=str[left];
            str[left]=str[right];
            str[right]=temp;
            left++;
            right--;
        }
        for(String x:str){
            System.out.println("*"+x+"*");
        }
        String result="";
        int count=0;
        for(String x:str){
            if(!x.isEmpty()){
                result=result+x+" ";
                count++;
            }
        }
        System.out.println(count);
        if(count!=0){
            return result.substring(0,result.length()-1);
        }
        return result;


    }

    public static void main(String[] args) {
        String s=" ";
        System.out.println("*"+reverseWords(s)+"*");
    }
}
