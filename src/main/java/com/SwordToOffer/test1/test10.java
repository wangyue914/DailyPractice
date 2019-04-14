package com.SwordToOffer.test1;

/**
 * Created by yue on 17-10-13 下午2:59.
 **/
public class test10 {
    public static int getOneNum(int n){
        int count=0;
        for(int i=0;i<32;i++){
            int re=1&n;
            if(re==1){
                count++;
            }
            n>>>=1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getOneNum(0B01111111_11111111_11111111_11111111));
    }
}
