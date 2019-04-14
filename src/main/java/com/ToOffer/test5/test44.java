/**
 * ���˿����������5���ƣ��ж��ǲ���һ��˳�ӣ� ����5�����ǲ��������ġ�
 * 2��10Ϊ���ֱ��� AΪ1�� JΪ11��QΪ12�� Ϊ13����С�����Կ����������֡�
 */
package com.ToOffer.test5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test44 {

	/**
	 * @param args
	 */
	
	private static boolean isOrder(int []arr){
		
		if(arr==null||arr.length<1){
			return false;
		}
		
		Arrays.sort(arr);
		int numOfOne=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				numOfOne++;
			}
			
		}
		System.out.println("numOfOne"+numOfOne);
		int start=numOfOne;
		int end=start+1;
		int numOfGrap=0;
		while(start<arr.length-1){
			if(start==end){
				return false;
			}
			numOfGrap+=arr[end]-arr[start]-1;
			start=end;
			end++;
			
		}
		System.out.println();
		return numOfGrap<=numOfOne;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers1 = {0, 3, 2, 6, 4};
		System.out.println(isOrder(numbers1));

	}

}
