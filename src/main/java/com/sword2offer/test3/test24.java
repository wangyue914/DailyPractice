package com.sword2offer.test3;

/**
 * Created by Yue on 2017/6/24 0024.
 */
public class test24 {
    public static boolean VerifySquenceOfBST(int [] sequence) {

        if(sequence==null||sequence.length<1){
            return false;

        }
        return getOrder(sequence,0,sequence.length-1);

    }
    public static boolean getOrder(int []nums,int start,int end){
        if(start>=end){
            return true;
        }
        int k=nums[end];
        int index=start;
        for(int i=start;i<end;i++){
            if(nums[i]<k){
                index++;
            }
        }
        int j=index;
        for(j=index;j<end;j++){
            if(nums[j]<k){
                return false;
            }
        }
        boolean flag1= getOrder(nums,start,index-1);
        boolean flag2=getOrder(nums,index,j-1);
        return flag1&&flag2;
    }


    public static void main(String[] args) {
        int []nums={1, 2, 3, 4, 5};
        System.out.println(VerifySquenceOfBST(nums));
    }
}
