package com.sword2offer.test4;

/**
 * Created by Yue on 2017/6/2 0002.
 */
public class test34 {
    public static int GetUglyNumber_Solution(int index) {
        int []result=new int[index];
        result[0]=1;
        int nextIndex=1;
        int p2=0,p3=0,p5=0;
        while(nextIndex<index){
            result[nextIndex]=min(result[p2]*2,result[p3]*3,result[p5]*5);

            while (result[p2]*2<=result[nextIndex]){
                p2++;
            }
            while (result[p3]*3<=result[nextIndex]){
                p3++;
            }
            while (result[p5]*5<=result[nextIndex]){
                p5++;
            }
            nextIndex++;

        }
        return result[index-1];
    }
    public static int min(int a,int b,int c){
        int temp=a<b?a:b;
        return temp<c?temp:c;

    }

    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(13));
    }
}
