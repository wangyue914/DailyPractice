/**
 * ����һ������n���1 ��n��n��������ʮ���Ʊ�ʾ��1 ���ֵĴ�����
 */
package com.ToOffer.test4;

public class test32 {

	/**
	 * @param args
	 * 
	 */
	
	//����������ת��������
	public static int findOneBefore(int n){
		if(n<=0){
			return 0;
		}
		Integer num=n;
		String str=num.toString();
		int[]arrnum=new int[str.length()];
		for(int i=0;i<str.length();i++){
			arrnum[i]=str.charAt(i)-'0';
		}
		
		return findOne(arrnum,0);
	}
	
	/**
	 * 
	 * @param c ��Ҫ���������
	 * @param current  ��ʼ�����λ��
	 * @return 1���ֵĴ���
	 */
	public static int findOne(int[]c,int current){
		
		if(c==null||c.length<=current||current<0){
			return 0;
		}
		
		//����n�ĵ�һλ
		int first=c[current];
		
		//��ȥ��һλʣ�µ�λ��
		int length=c.length-current;
		
		if(length==1&&first==0){
			return 0;
		}
		
		if(length==1&&first>0){
			return 1;
		}
		//1�ڵ�һλ�г��ֵĴ���
		int oneInFirst=0;
		if(first>1){
			oneInFirst=powerBase10(length-1);
		}
		else if(first==1){
			oneInFirst=atoi(c,current+1)+1;
		}
		
		//1��ʣ�µ�λ���г��ֵ�λ��
		int oneInOther=first*(length-1)*powerBase10(length-2);
		
		//�ݹ鴦��
		int oneInRecursive=findOne(c,current+1);
		
		return oneInFirst+oneInOther+oneInRecursive;
	}
	
	//��10Ϊ�׵�N�η�
	private static int powerBase10(int n){
		
		int result=1;
		for(int i=0;i<n;i++){
			result*=10;
		}
		
		return result;
	}
	
	//������ת����int����
	
	private static int atoi(int[]c,int n){
		
		int result=0;
		for(int i=n;i<c.length;i++){
			result=result*10+c[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findOneBefore(10));

	}

}
