/**
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ��������
 * 
 * �����Ǳ�������һ�����ֵ�ʱ�������һ�����ֺ�����֮ǰ�����������ͬ���������l ��
 * �����һ�����ֺ�����֮ǰ��������֣���ͬ���������1 ���������Ϊù��������Ҫ������һ�����֣�
 * ���Ѵ�����Ϊ1 ����������Ҫ�ҵ����ֳ��ֵĴ����������������ֳ��ֵĴ���֮�ͻ�Ҫ�࣬
 * ��ôҪ�ҵ����ֿ϶������һ�ΰѴ�����Ϊ1 ʱ��Ӧ�����֡�
 */
package com.ToOffer.test3;

public class test29 {

	/**
	 * @param args
	 */
	
	public static void findMostNum(int []num){
		if(num==null||num.length<1){
			return;
		}
		
		int result=num[0];
		int count=1;
		for(int i=1;i<num.length;i++){
			if(count==0){
				result=num[i];
				count=1;
			}
			else if(result==num[i]){
				count++;
			}
			else {
				count--;
			}
		}
		
		count=0;
		for(int i=0;i<num.length;i++){
			if(result==num[i]){
				count++;
			}
		}
		if(count>num.length/2){
			System.out.println("Ҫ�ҵ���Ϊ"+result);
		}
		else{
			System.out.println("û�з�������������");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []num={2,2,6,7,2,99,2,5,2,2};
		findMostNum(num);

	}

}
