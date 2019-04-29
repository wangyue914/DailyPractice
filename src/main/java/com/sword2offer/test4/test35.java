package com.sword2offer.test4;

/**
 * Created by Yue on 2017/6/3 0003.
 */
public class test35 {
    public static int FirstNotRepeatingChar(String str) {
        if(str==null||str.length()<1){
            return -1;
        }
        char[]c=str.toCharArray();
        char[]index=new char[60];
        int result=0;
        for(int i=0;i<str.length();i++){

            index[c[i]-'A']++;


        }
        for(int i=0;i<str.length();i++){
            if(index[c[i]-'A']==1){
                result=i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str="NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp";

        System.out.println(FirstNotRepeatingChar(str));
    }

}
