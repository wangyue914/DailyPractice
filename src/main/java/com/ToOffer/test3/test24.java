/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����������򷵻�true��
 * ���򷵻�false���������������������������ֶ�������ͬ��
 */
package com.ToOffer.test3;

public class test24 {

	/**
	 * @param args
	 */
	
	public static boolean charge(int arr[]){
		if(arr==null||arr.length<=0){
			return false;
		}
		else return charge(arr,0,arr.length-1);			//���������жϺϸ��������صķ���
	}
	
	public static boolean charge(int arr[],int start,int end){
		//��ʼλ�ô��ڵ��ڽ���λ��˵������ȫ���������
		if(start>=end){
			return true;
		}
		
		int index=start;
		//��Ѱ������������С�ڸ��ڵ��
		while(index<end&&arr[index]<arr[end]){
			
			index++;
		}
		
		int right=index;
		//����������
		while(index<end&&arr[index]>arr[end]){
			index++;
		}
		
		//�����������ȷindexֵһ��Ϊend
		if(index!=end){
			return false;
		}
		
		index=right;
		//�ݹ鴦��ʣ�µ�����
		return charge(arr,0,index-1)&&charge(arr,index,end-1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //           10
        //         /   \
        //        6     14
        //       /\     /\
        //      4  8  12  16
        int[] data = {4, 8, 6, 12, 16, 14, 10};
        System.out.println("true: " + charge(data));

        //           5
        //          / \
        //         4   7
        //            /
        //           6
        int[] data2 = {4, 6, 7, 5};
        System.out.println("true: " + charge(data2));

        //               5
        //              /
        //             4
        //            /
        //           3
        //          /
        //         2
        //        /
        //       1
        int[] data3 = {1, 2, 3, 4, 5};
        System.out.println("true: " + charge(data3));

        // 1
        //  \
        //   2
        //    \
        //     3
        //      \
        //       4
        //        \
        //         5
        int[] data4 = {5, 4, 3, 2, 1};
        System.out.println("true: " + charge(data4));
        
        int[] data6 = {7, 4, 6, 5};
        System.out.println("false: " + charge(data6));

	}

}
