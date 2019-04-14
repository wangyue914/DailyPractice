/**
 * дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ�ã�����������������������š�
 * ��˼��λ����
 */
package com.ToOffer.test5;

public class test46 {

	/**
	 * @param args
	 */
	public static int noSymbolSum(int a,int b){
		
		int sum;
		int carry;
		do{
			sum=a^b;
			//carry������¼��λ��ֵ������һλ����ԭ���ĺ����
			carry=(a&b)<<1;
			
			a=sum;
			b=carry;
		}while(b!=0);
		
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(noSymbolSum(5, 17));
		

	}

}
