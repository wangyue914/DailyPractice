package com.leetcode.array;

/**
 * Created by Yue on 2017/6/5 0005.
 */
public class test167 {
    public static int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=0;
        int []result=new int[2];
        for(int i=0;i<numbers.length-1;i++){
            end++;
            if(numbers[i]==target||(numbers[i+1]>target&&numbers[i]<target)){
                break;
            }

        }
        while(end>=start){
            if(numbers[start]+numbers[end]>target){
                end--;
            }else if(numbers[start]+numbers[end]<target){
                start++;
            }else{
                result[0]=start+1;
                result[1]=end+1;
                break;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int num[]={2,7,11,15};
        int re[]=twoSum(num,9);
        for(int i:re){
            System.out.println(i);
        }
    }
}
