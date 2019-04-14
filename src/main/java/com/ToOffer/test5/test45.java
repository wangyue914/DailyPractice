/**
 * 0, 1, �� , n-1 ��n�������ų�һ��ȦȦ��
 * ������0��ʼÿ�δ�Բ����ɾ����m�����֡�������ȦȦ��ʣ�µ����һ�����֡�
 */
package com.ToOffer.test5;

import java.util.*;

public class test45 {

	/**
	 * @param args
	 */
	
	private static int findLastNum(int n,int m){
		
		if(n<1||m<1){
			return -1;
		}
		
		List<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<n;i++){
			list.add(i);
		}
		
		int index=0;
		while(list.size()>1){
			
			
			for(int i=1;i<m;i++){
				
				index=(index+1)%list.size();
			}
			
			list.remove(index);
			
		}
		return list.get(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findLastNum(5, 3));

	}

}
