package com.LeetCode.string;

/**
 * Created by Yue on 2017/6/10 0010.
 */
public class test583 {
    public static int minDistance(String word1, String word2) {

        int len1=word1.length();
        int len2=word2.length();
        if(len1>len2){
            return findMaxSame(word1,word2);
        }
        return findMaxSame(word2,word1);

    }
    public static int findMaxSame(String str1,String str2){
        char[] c1=str1.toCharArray();
        char[] c2=str2.toCharArray();
        int count=0;
        int k=0,j=0;
        for(int i=0;i<c1.length;i++){

            k=i;
            for(j=0;j<c2.length;j++){
                if(c1[k]==c2[j]){
                    break;
                }
            }


            int temp=0;
            while(k<c1.length&&j<c2.length&&c1[k]==c2[j]){

                k++;
                j++;
                temp++;


            }


            j=0;
            count=count>temp?count:temp;
        }
        return c1.length-count+c2.length-count;
    }

    public static void main(String[] args) {
        String str1="sea";
        String str2="eat";
        System.out.println(minDistance(str1,str2));
    }
}
