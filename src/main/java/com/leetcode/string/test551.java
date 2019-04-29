package com.leetcode.string;

/**
 * Created by Yue on 2017/6/7 0007.
 */
public class test551 {
    public static boolean checkRecord(String s) {
        char[]c=s.toCharArray();
        int countA=0;
        int countL=0;
        int i=0;
        while(countA<2&&countL<3&&i<c.length){
            if(c[i]=='A'){
                countA++;
                countL=0;
            }else if(c[i]=='L'){
                countL++;
            }else{
                countL=0;
            }
            i++;

        }
        if(countA>=2||countL>=3){
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        String s="PPALLL";
        System.out.println(checkRecord(s));
    }
}
