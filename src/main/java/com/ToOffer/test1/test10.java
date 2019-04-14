/**
 * ��ʵ��һ�������� ����һ��������������������Ʊ�ʾ��1�ĸ����� 
 * �����9��ʾ�ɶ�������1001 ����2λ��1. ����������9���ó�2�� 
 */
package com.ToOffer.test1;

public class test10 {
	//����1
	public static void printBiNum(int n){
		int result=0;
		for(int i=0;i<=32;i++){
			result+=(n&1);
			n>>>=1;       //�޷������ƣ����Է���λ����λ����0����
		}
		System.out.println(result);
	}
	
	//����2
	public static void printBiNum2(int n){
		int result=0;
		while(n!=0){
			result++;
			n=(n-1)&n;  //ÿ�β�������n�����Ҳ��һ��1���0
		}
		System.out.println(result);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printBiNum(-1);
		printBiNum2(-1);
		

	}

}
