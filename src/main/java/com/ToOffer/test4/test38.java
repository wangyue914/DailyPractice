/**
 * ͳ��һ�����֣������������г��ֵĴ���
 * 
 * ʹ�ö��ַ���������м�����ֱ�k����ôkֻ�п��ܳ����������ǰ��Σ���һ������ֻ�������ǰ��β��ҾͿ����ˡ�
 * ����м�����ֱ�kС����ôkֻ�п��ܳ���������ĺ��Σ���һ������ֻ������ĺ���Ҳ��ҾͿ����ˡ�
 * ����м�����ֺ�k ����أ��������ж���������ǲ��ǵ�һ��k�����λ���м����ֵ�ǰ��һ�����ֲ���k,
 * ��ʱ�м�����ָպþ��ǵ�һ��k������м����ֵ�ǰ��һ������Ҳ��k��
 * Ҳ����˵��һ��k�϶��������ǰ��Σ� ��һ��������Ȼ��Ҫ�������ǰ��β���
 */
package com.ToOffer.test4;

public class test38 {

	/**
	 * @param args
	 */
	
	public static int getFirstK(int []arr,int key,int start,int end){
		
		if(arr==null||start>end||arr.length<1){
			throw new IllegalArgumentException("�Ƿ�����");
		}
		
		int min=start+(end-start)/2;
		int minNum=arr[min];
		
		if(minNum==key){
			
			if(min>0&&arr[min-1]!=key||min==0){
				return min;
			}
			else{
				end=min-1;
			}
			
		}
		else if(minNum<key){
			start=min+1;
		}
		else{
			end=min-1;
		}
		
		return getFirstK(arr, key, start, end);
	}
	
	public static int getLastK(int[] arr,int key,int start,int end){
		
		if(arr==null||arr.length<1||start>end){
			throw new IllegalArgumentException("�Ƿ�����");
		}
		
		int min=start+(end-start)/2;
		int minNum=arr[min];
		
		if(minNum==key){
			
			if(min>0&&arr[min+1]!=key||min==arr.length-1){
				return min;
			}
			else{
				start=min+1;
			}
			
		}
		else if(minNum<key){
			start=min+1;
		}
		else{
			end=min-1;
		}
		
		return getLastK(arr, key, start, end);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 3, 3, 3, 4, 5};
		int f=getFirstK(arr, 3, 0, arr.length-1);
		int l=getLastK(arr, 3, 0, arr.length-1);
		System.out.println(l-f+1);

	}

}
