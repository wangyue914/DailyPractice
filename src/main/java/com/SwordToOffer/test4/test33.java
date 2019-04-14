package com.SwordToOffer.test4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Yue on 2017/6/2 0002.
 */
public class test33 {
    public static String PrintMinNumber(int [] numbers) {
        ArrayList<String> str=new ArrayList<String>();
        for(int i=0;i<numbers.length;i++){
            str.add(numbers[i]+"");
        }
        String result=new String();
        Collections.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1=o1+o2;
                String s2=o2+o1;
                return s1.compareTo(s2);
            }
        });
        for(String i:str){
            result+=i;
        }

        return result;

    }
    public static String findMin(int []nums){
        String []str=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i]=nums[i]+"";
        }
        sort(str,0,str.length-1);
        String result=new String();
        for(int i=0;i<str.length;i++){
            result+=str[i];
        }
        return result;

    }
    public static void sort(String []str,int left,int right){
        if(left>=right){
            return;
        }
        int low=left;
        int high=right;
        String temp=str[low];
        while(low<high){
            while(low<high&&(str[high]+temp).compareTo(temp+str[high])>=0){
                high--;
            }
            str[low]=str[high];
            while(low<high&&(str[low]+temp).compareTo(temp+str[low])<=0){
                low++;
            }
            str[high]=str[low];
        }
        str[low]=temp;
        sort(str,left,low-1);
        sort(str,low+1,right);
    }


    public static void main(String[] args) {
        int []arr={3,32,321};
        System.out.println(findMin(arr));
    }
}
