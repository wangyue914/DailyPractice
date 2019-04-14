/**
 * ����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ��
 */
package com.ToOffer.test4;

import java.util.Comparator;

public class test33 {

	/**
	 * @param args
	 */

	private static class MyComparator implements Comparator<String>{
		
		public int compare(String s1,String s2){
			if(s1==null||s2==null){
				throw new IllegalArgumentException("���벻��Ϊ��");
			}
			
			String str1=s1+s2;
			String str2=s2+s1;
			return str1.compareTo(str2);
		}
		
	}
	
	public static void quicksort(String []str,int low,int high,MyComparator  comparator){
		if(low>=high){
			return;
		}
		
		int left=low;
		int right=high;
		String key=str[low];
		while(low<high){
			
			while(low<high&&comparator.compare(str[high], key)>=0){
				high--;
			}
			str[low]=str[high];
			while(low<high&&comparator.compare(str[low], key)<=0){
				low++;
			}
			str[high]=str[low];
		}
		
		str[low]=key;
		quicksort(str, left, low-1, comparator);
		quicksort(str, low+1, right, comparator);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] data = {"3", "323", "32123"};
		MyComparator mc=new MyComparator();
		quicksort(data, 0, data.length-1, mc);
		for(String s:data){
			System.out.print(s);
		}

		

	}

}
