package com.sort;

/**
 * Created by Administrator on 2017/3/27 0027.
 * 堆排序
 */
public class HeapSort {

    public static void buildHeap(int []array){
        int len=array.length;
        for(int i=len/2-1;i>=0;i--){
            siftDown(array,i,len);
        }

    }

    public static void siftDown(int []array,int left,int len){
        int i=left;
        int j=2*i+1;
        int temp=array[i];
        while(j<len){
            if(j<(len-1)&&array[j+1]>array[j]){
                j++;
            }
            if(array[j]>temp){
                array[i]=array[j];
                i=j;
                j=2*j+1;
            }
            else{
                break;
            }
        }
        array[i]=temp;

    }
    public static void heapSort(int []array){
        buildHeap(array);
        int n=array.length;
        for(int i=n-1;i>0;i--){
            int temp=array[0];
            array[0]=array[i];
            array[i]=temp;
            siftDown(array,0,i);

        }
    }

    //插入操作:向大根堆array中插入数据data
    public static  int[] insertData(int[] array, int data){
        array[array.length-1] = data; //将新节点放在堆的末端
        int k = array.length-1;  //需要调整的节点
        int parent = (k-1)/2;    //双亲节点
        while(parent >=0 && data>array[parent]){
            array[k] = array[parent];  //双亲节点下调
            k = parent;
            if(parent != 0){
                parent = (parent-1)/2;  //继续向上比较
            }else{  //根节点已调整完毕，跳出循环
                break;
            }
        }
        array[k] = data;  //将插入的结点放到正确的位置
        return array;
    }

    public static void main(String[] args) {
        int array[]={20,12,35,15,10,80,30,17,2,1};
        heapSort(array);
        for(int i:array){
            System.out.print(i+" ");
        }
    }
}
