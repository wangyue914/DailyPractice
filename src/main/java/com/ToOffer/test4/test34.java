/**
 * ���ǰ�ֻ��������2��3 ��5 ��������������Ugly Number�������С�����˳��ĵ�1500��������
 */
package com.ToOffer.test4;

public class test34 {

	/**
	 * @param args
	 */
	
	public static int findUglyNum(int k){
		
		if(k<=0){
			return 0;
		}
		
		int p2=0;
		int p3=0;
		int p5=0;
		
		int current=1;
		int []uglyNum=new int [k];
		uglyNum[0]=1;
		while(current<k){
			
			uglyNum[current]=min(uglyNum[p2]*2,uglyNum[p3]*3,uglyNum[p5]*5);
			while(uglyNum[p2]*2<=uglyNum[current]){
				p2++;
			}
			while(uglyNum[p3]*3<=uglyNum[current]){
				p3++;
			}
			while(uglyNum[p5]*5<=uglyNum[current]){
				p5++;
			}
			
			current++;
		}
		
		return uglyNum[current-1];
	}
	
	public static int min(int a,int b,int c){
		int n=a<b?a:b;
		return n<c?n:c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findUglyNum(1500));

	}

}
