/**
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ����������λ�������ǰ�벿�֣�����ż��λ������ĺ�벿�֡�
 * ������
 * ���ǿ���ά������ָ�룬��һ��ָ���ʼ��ʱָ������ĵ�һ�����֣���ֻ����ƶ���
 * �ڶ���ָ���ʼ��ʱָ����������һ�����֣� ��ֻ��ǰ�ƶ���
 * ������ָ������֮ǰ����һ��ָ������λ�ڵڶ���ָ���ǰ�档
 * �����һ��ָ��ָ���������ż�������ҵڶ���ָ��ָ������������������Ǿͽ������������֡�
 */
package com.SwordToOffer.test2;

import java.io.PrintWriter;

public class test14 {

	/**
	 * @param args
	 */
	
	public static void changOrder(int[] arr){
		if(arr.length==0||arr.length==1){
			System.out.println("��������");
		}
		int start=0;
		int end=arr.length-1;
		while(start<end){                                     //ע��������ѭ�����޶�������ѡȡstart<end������start!=end
		while(start<end  && arr[start]%2==1){
			start++;
		}
		while(start<end  && arr[end]%2==0){
			end--;
		}
		
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		}
	}
	
	public static void printArr(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr={0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		changOrder(arr);
		printArr(arr);

	}

}
