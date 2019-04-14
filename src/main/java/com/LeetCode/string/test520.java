package com.LeetCode.string;

/**
 * Created by Yue on 2017/6/8 0008.
 */
public class test520 {
    public static boolean detectCapitalUse(String word) {
        if(word.length()==1){
            return true;
        }
        char c[]=word.toCharArray();
        boolean flag=true;
        if(c[0]>='A'&&c[0]<='Z'){
            if(c[1]>='A'&&c[1]<='Z'){
                for(int i=2;i<c.length;i++){
                    if(!(c[i]>='A'&&c[i]<='Z')){
                        return false;
                    }
                }
            }else{
                for(int i=2;i<c.length;i++){
                    if(!(c[i]>='a'&&c[i]<='z')){
                        return false;
                    }
                }
            }
        } else{
            for(int i=1;i<c.length;i++){
                if(!(c[i]>='a'&&c[i]<='z')){
                    return false;
                }
            }
        }
        return flag;

    }

    public static void main(String[] args) {
        String word="FlaG";
        System.out.println(detectCapitalUse(word));
    }
}
