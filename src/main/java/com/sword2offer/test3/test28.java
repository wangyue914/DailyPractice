/**
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * 例如输入字符串abc。则打印出由字符a、b、c 所能排列出来的所有字符串abc、acb、bac 、bca、cab 和cba 。
 * -----该题的递归模式可以和test12一起对比看
 */
package com.sword2offer.test3;

import java.util.*;


public class test28 {

	/**
	 * @param
	 */

    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> list=new ArrayList<String>();
        if(str.length()<1||str==null){
            return list;
        }
        char []c=str.toCharArray();
        Permutation(c,0,list);
        //Collections.sort(list); //借用Collection集合进行排序
        return list;

    }
    public static void Permutation(char []c,int begin,ArrayList list){
        if(begin==c.length){
            list.add(new String(c));
            System.out.print(c);
            System.out.print(" ");
        }else{
            for(int i=begin;i<c.length;i++){
                /*if(i!=begin&&c[i]==c[begin]){    //判断重复情况跳过，也可以将ArrayList换成Set，自动去重复
                    continue;
                }*/
                swap(c,begin,i);
                //System.out.println("now"+aboutstring.valueOf(c)+" ");
                Permutation(c,begin+1,list);
                swap(c,begin,i);

            }
        }

    }
    public static void swap(char[]c ,int a,int b){
        char temp=c[a];
        c[a]=c[b];
        c[b]=temp;

    }

    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> list=Permutation(str);
        for(String s:list){
            //System.out.print(s+" ");
        }
    }
}
