/**
 * ��n���������ڵ��ϣ��������ӳ���һ��ĵ���֮��Ϊs��
 * ����n����ӡ��s �����п��ܵ�ֵ���ֵĸ��ʡ�
 */
package com.sword2offer.test5;

public class test43 {

	/**
	 * @param args
	 */
	private static void getProbability(int num,int max){
		
		if(num<1||max<1){
			return;
		}
		
		int [][]arr=new int[2][max*num+1];
		
		for(int i=0;i<max*num+1;i++){
			arr[0][i]=0;
			arr[1][i]=0;
		}
		
		int flag=0;
		for(int i=1;i<=max;i++){
			arr[flag][i]=1;
		}
		
		for(int k=2;k<=num;k++){
			
			for(int i=0;i<k;i++){
				arr[1-flag][i]=0;
			}
			
			for(int i=k;i<=k*max;i++){
				
				arr[1-flag][i]=0;
				for(int j=1;j<=max&&j<=i;j++){
					
					arr[1-flag][i]+=arr[flag][i-j];
					
				}
			}
			flag=1-flag;
			
		}
		
		double total=1;
		for(int i=0;i<num;i++){
			total=total*max;
		}
		
		for(int i=num;i<=max*num;i++){
			
			System.out.print(i+":"+arr[flag][i]/total);
			System.out.println(" ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getProbability(3, 4);

	}

}
