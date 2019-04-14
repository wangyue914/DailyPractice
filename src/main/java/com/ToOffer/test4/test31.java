/**
 * ����һ���������飬������������Ҳ�и�����������һ���������Ķ���������һ�������顣
 * ������������ĺ͵����ֵ��Ҫ��ʱ�临�Ӷ�ΪO(n)��
 */
package com.ToOffer.test4;

public class test31 {

	/**
	 * @param args
	 */
	public static int maxSum(int []num){
		if(num==null||num.length<1){
			throw new IllegalArgumentException("�Ƿ�����");
		}
		//Ĭ���������Ϊ��һ��Ԫ��
		int sum=num[0];
		
		//��ʼʱ��¼Ϊ0
		int current=0;
		
		for(int i=0;i<num.length;i++){
			
			if(current<=0){
				current=num[i];
			}
			else{
				current+=num[i];
			}
			
			if(current>sum){
				sum=current;
			}
			
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data={-2, -8, -1, -5, -9};
		System.out.println(maxSum(data));
		System.out.println(Integer.MIN_VALUE);

	}

}
