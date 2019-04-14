/**
 * дһ������������n����쳲�������Fibonacci) ���еĵ�n�� 
 */
package com.ToOffer.test1;

public class test9 {
	
	public static int fibonacci(int n){
		
		if(n<=0){
			return 0;
		}
		if(n==1||n==2){
			return 1;
		}
		int a=1;
		int b=1;
		int num=2;
		
		for(int i=3;i<=n;i++){
			
			num=a+b;
			a=b;
			b=num;
			
		}
		return num;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(7));

	}

}
