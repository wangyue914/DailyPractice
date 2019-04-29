package com.sword2offer.test5;

/**
 * Created by Yue on 2017/6/15 0015.
 */
public class test48 {
    public static int StrToInt(String str) {
        if(str==null||str.length()<1){
            return 0;
        }
        char c[]=str.toCharArray();
        int k=1;
        int result=0;
        for(int i=str.length()-1;i>=1;i--){
            if(c[i]<'0'||c[i]>'9'){
                return 0;
            }
            result+=(c[i]-'0')*k;
            k=k*10;
        }
        System.out.println(result);
        if(c[0]=='-'){
            result=0-result;
            return result;
        }
        else if(c[0]>'0'&&c[0]<'9'){
            result+=(c[0]-'0')*k;
            return result;
        }
        else if(c[0]=='+'){
            return result;
        }
        return 0;

    }

    public static void main(String[] args) {
        String str="123";
        System.out.println(StrToInt(str));
    }
}
