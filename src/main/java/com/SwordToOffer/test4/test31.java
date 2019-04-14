package com.SwordToOffer.test4;

/**
 * Created by Yue on 2017/6/1 0001.
 */
public class test31 {
    public static int FindGreatestSumOfSubArray(int[] array) {
        int sum=array[0];
        int current=0;
        for(int i=0;i<array.length;i++){
            current=current+array[i];
            if(current<array[i]){
                current=array[i];
            }
            if(current>sum){
                sum=current;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int []arr={1,4,54,-4,45,-3,6,9,-23,-6,9};
        System.out.println(FindGreatestSumOfSubArray(arr));
    }
}
