package com.sword2offer.test3;

/**
 * Created by Yue on 2017/6/1 0001.
 */
public class test30 {
    public static void buidHeap(int [] array){
        int len=array.length;
        for(int i=len/2-1;i>=0;i--){
            siftDown(array,i,len);
        }
    }
    public static void siftDown(int [] array,int left,int len){
        int i=left;
        int j=i*2+1;
        int temp=array[i];
        while(j<len){
            if(j<len-1&&array[j]<array[j+1]){
                j++;
            }
            if(array[j]>temp){
                array[i]=array[j];
                i=j;
                j=j*2+1;
            }else{
                break;
            }
        }
        array[i]=temp;
    }
    public static void findK(int []array,int k){
        int []result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=array[i];
        }
        buidHeap(result);

        for(int i=k;i<array.length;i++){
            if(array[i]<result[0]){
                result[0]=array[i];
                siftDown(result,0,k);
            }
        }
        for(int i:result){
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {

        int []arr={4,5,1,6,2,7,3,8};
        findK(arr,4);
    }
}
