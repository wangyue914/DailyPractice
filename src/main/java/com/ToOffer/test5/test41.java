/**
 *��Ŀһ�� ����һ����������������һ������s���������в����������������ǵĺ�������s��
 * ����ж�����ֵĺ͵���s���������һ�Լ���
 * ��Ŀ��������һ������s����ӡ�����к�Ϊs �������������У���������������

 */
package com.ToOffer.test5;

import java.util.*;

public class test41 {

	/**
	 * @param args
	 */
	
	private static List<Integer> findTwoNum(int []arr,int sum){
		if(arr==null||arr.length<2){
			throw new IllegalArgumentException("�Ƿ�����");
		}
		
		List <Integer>result=new ArrayList<Integer>(2);
		
		int start=0;
		int end=arr.length-1;
		
		
		while(start<end){
			long currentSum=arr[start]+arr[end];
			if(currentSum==sum){
				result.add(arr[start]);
				result.add(arr[end]);
				break;
			}
			else if(currentSum<sum){
				start++;
			}
			else{
				end--;
			}
			
		}
		return result;
		
	}
	
	private static List<List<Integer>> findSum(int sum){
		
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		
		int small=1;
		int big=2;
		while(small<(sum+1)/2){
			
			int current=getSum(small, big);
			if(current==sum){
				List<Integer>list1=new ArrayList<Integer>();
				for(int i=small;i<=big;i++){
					list1.add(i);
				}
				result.add(list1);
			}
			while(current>sum&&small<(sum+1)/2){
				small++;
				current=getSum(small, big);
				if(current==sum){
					List<Integer>list=new ArrayList<Integer>();
					for(int i=small;i<=big;i++){
						list.add(i);
					}
					result.add(list);
				}
			}
			
			big++;
			
			
		}
		
		return result;
		
		
	}
	
	private static int getSum(int small,int big){
		int sum=0;
		for(int i=small;i<=big;i++){
			sum=sum+i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] data1 = {1, 2, 4, 7, 11, 15};
		List<Integer>array=findTwoNum(data1, 15);
		for(int i:array){
			System.out.print(i);
		}*/
		
		List<List<Integer>> list=findSum(15);
		for(List<Integer>i:list){
			for(int j:i){
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
		

	}

}
