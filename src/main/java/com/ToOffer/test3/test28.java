/**
 * ����һ���ַ�������ӡ�����ַ������ַ����������С����������ַ���abc��
 * ���ӡ�����ַ�a��b��c �������г����������ַ���abc��acb��bac ��bca��cab ��cba ��
 */
package com.ToOffer.test3;

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
        Collections.sort(list); //借用Collection集合进行排序
        return list;

    }
    public static void Permutation(char []c,int begin,ArrayList list){
        if(begin==c.length){
            list.add(new String(c));
        }else{
            for(int i=begin;i<c.length;i++){
                if(i!=begin&&c[i]==c[begin]){    //判断重复情况跳过，也可以将ArrayList换成Set，自动去重复
                    continue;
                }
                swap(c,begin,i);
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
        String str="aa";
        ArrayList<String> list=Permutation(str);
        for(String s:list){
            System.out.print(s+" ");
        }
    }
}
