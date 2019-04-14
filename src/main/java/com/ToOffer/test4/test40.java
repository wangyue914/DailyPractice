/**
 * һ�����������������������֮�⣬���������ֶ����������Σ�
 * ��д�����ҳ�������ֻ����һ�ε����֡�Ҫ��ʱ�临�Ӷ���O(n)���ռ临�Ӷ���O(1)��
 */
package com.ToOffer.test4;

public class test40 {

	/**
	 * @param args
	 */
	public static int findOne(int num){
		
		int index=0;
		while((num&1)==0&&index<32){
			num>>>=1;
			index++;
		}
		return index;
		
	}
	
	public static void getTwoNum(int [] arr){
		if(arr==null||arr.length<1){
			throw new IllegalArgumentException("�Ƿ�����");
		}
		
		int xor=0;
		for(int i:arr){
			xor^=i;
		}
		int n=findOne(xor);
		
		int result[]={0,0};
		
		for(int i:arr){
			
			int j=i;
			if(((j>>>=n)&1)==1){
				result[0]^=i;
				//System.out.print("1��"+i+" ");
			}
			else {
				result[1]^=i;
				//System.out.print("2��"+i+" ");
			}

		}
		
		for(int i:result){
			System.out.print(i+" ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data1 = {2, 4, 3, 6, 3, 2, 5, 5};
		getTwoNum(data1);

	}

}
