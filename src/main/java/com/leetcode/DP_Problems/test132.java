package com.leetcode.DP_Problems;

/**
 * Created by Yue on 2017/7/2 0002.
 * 最少回文切割次数
 */
public class test132 {
    public static int minCut(String s){
        int len=s.length();
        char []c=s.toCharArray();
        boolean [][]isPo=new boolean[len][len];
        int []cut=new int [len];
        for(int i=0;i<len;i++){
            cut[i]=i;
        }

        for(int i=0;i<len;i++){
            for(int j=0;j<=i;j++){
                if(c[i]==c[j]&&(j+1>i-1||isPo[j+1][i-1])){
                    isPo[j][i]=true;
                    cut[i]=j==0?0:Math.min(cut[i],cut[j-1]+1);
                }
            }
        }
        return cut[len-1];

    }

    public static void main(String[] args) {
        String s="abacc";
        System.out.println(minCut(s));
    }
}
