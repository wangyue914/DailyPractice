package com.aboutstring;

/**
 * Created by Yue on 2017/6/29 0029.
 * 判断字符串a和字符串b能否组成c，c中字符在原字符串中的相对顺序要保持
 */
public class twoToOnew {
    public static boolean isSum(String str1,String str2,String str3){

        if(str1.length()+str2.length()!=str3.length()){
            return false;
        }
        char []c1=str1.toCharArray();
        char []c2=str2.toCharArray();
        char []c3=str3.toCharArray();
        boolean flag=false;
        int i=0,j=0,k=0,indexj=0,indexk=0;
        while(i<c3.length||flag){
            while (i<c3.length){
                if(j<c1.length&&k<c2.length&&c1[j]==c2[k]){
                    flag=true;
                    indexj=j;
                    indexk=k;
                }
                if(j<c1.length&&c3[i]==c1[j]){
                    j++;

                }else if(k<c2.length&&c3[i]==c2[k]){
                    k++;

                }else {
                    i=c3.length;
                    break;
                }
                i++;

            }
            System.out.println("j="+j+" k="+k);
            if(j==c1.length&&k==c2.length){
                return true;
            }
            if(flag){
                i=indexj+indexk+1;
                j=indexj;
                k=indexk+1;
                flag=false;
                System.out.println("after"+"j="+j+" k="+k);

            }

        }

        return false;
    }

    public static void main(String[] args) {
        String str1="qwer";
        String str2="1q34";
        String str3="1q3qwe4r";
        System.out.println(isSum(str1,str2,str3));
    }
}
