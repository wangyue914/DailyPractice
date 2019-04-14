package com.LeetCode.string;

/**
 * Created by Yue on 2017/6/14 0014.
 */
public class test383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        char ma[]=magazine.toCharArray();
        char ra[]=ransomNote.toCharArray();
        int temp[]=new int[60];
        for(int i=0;i<ma.length;i++){
            if(ma[i]>'A'&&ma[i]<'Z'){
                temp[ma[i]-'A']++;

            }else{
                temp[ma[i]-'a'+26]++;

            }
        }
        for(int i=0;i<ra.length;i++){
            if(ra[i]>'A'&&ra[i]<'Z'){
                temp[ra[i]-'A']--;
                if(temp[ra[i]-'A']<0){
                    return false;
                }
            }else{
                temp[ra[i]-'a'+26]--;
                if(temp[ra[i]-'a'+26]<0){
                    return false;
                }
            }

        }
        return true;

    }

    public static void main(String[] args) {
        String a="aa";
        String b="aab";
        System.out.println(canConstruct(a,b));
    }
}
