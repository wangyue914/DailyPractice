package com.sword2offer.test5;

import java.util.ArrayList;

/**
 * Created by Yue on 2017/6/7 0007.
 */
public class test41 {
    //递增排序数组中和为s的两个数字
    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int left=0;
        int right=array.length-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(right>left){
            if(array[left]+array[right]==sum){
                list.add(array[left]);
                list.add(array[right]);
                break;
            }else if(array[left]+array[right]<sum){
                left++;
            }else{
                right--;
            }
        }
        return list;

    }
    //和为s的连续正整数序列
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();

        int n=sum/2+1;

        int left=1,right=2;
        while(right<=n&&left<right){
            int temp=0;
            for(int i=left;i<=right;i++){
                temp+=i;
            }
            if(temp==sum){
                ArrayList<Integer> list=new ArrayList<>();
                for(int i=left;i<=right;i++){
                    list.add(i);
                }
                result.add(list);
                right++;


            }else if(temp<sum){
                right++;

            }else{
                left++;

            }
        }
        return result;

    }

    public static void main(String[] args) {
        int []nums={1 ,2 ,4,7 ,11 ,15};
        ArrayList<Integer> list=FindNumbersWithSum(nums,15);
        for(int i:list){
            System.out.print(i+" ");
        }
        /*ArrayList<ArrayList<Integer>> result=FindContinuousSequence(15);
        for(ArrayList<Integer> list:result){
            for(int i:list){
                System.out.print(i+" ");
            }
            System.out.println();
        }*/
    }
}
