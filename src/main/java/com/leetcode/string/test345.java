package com.leetcode.string;

/**
 * Created by Yue on 2017/6/15 0015.
 */
public class test345 {
    public static String reverseVowels(String s) {
        if(s==null||s.length()<1){
            return"";
        }
        char c[]=s.toCharArray();
        int v[]=new int[s.length()];

        int j=0;
        for(int  i=0;i<c.length;i++){
            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
                v[j]=i;
                j++;
            }

        }
        int start=0,end=j-1;
        while(end>start){
            char temp=c[v[start]];
            c[v[start]]=c[v[end]];
            c[v[end]]=temp;
            start++;
            end--;
        }
        return String.valueOf(c);

    }

    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(reverseVowels(s));
    }
}
