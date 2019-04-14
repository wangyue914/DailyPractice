/**
 * ����n���������ҳ�������С��k������
 * 
 * ���ڿ�����partition����
 */
package com.ToOffer.test3;

public class test30 {

	/**
	 * @param args
	 */
	
	public static void smallNum(int []input,int []output){
		if(input==null||output==null||input.length<output.length||output.length<=0){
			return;
		}
		
		int start=0;
		int end=input.length-1;
		int k=output.length;
		int index=partition(input, start, end);
		while(index!=k){
			
			if(index<k){
				index=partition(input, index+1, end);
			}
			else{
				index=partition(input, start, index-1);
			}
			
			
		}
		
		System.arraycopy(input, 0, output, 0, k);
		
	}
	
	private static int partition(int []input,int start,int end){
		
		int temp=input[start];
		while(start<end){
			
			while(start<end&&input[end]>=temp){
				end--;
			}
			input[start]=input[end];
			while(start<end&&input[start]<=temp){
				start++;
			}
			input[end]=input[start];
			
		}
		
		input[start]=temp;
		return start;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []input={4, 5, 1, 6, 2, 7, 3, 8};
		int []output=new int [5];
		smallNum(input, output);
		for(int i=0;i<output.length;i++){
			System.out.print(output[i]+" ");
		}

	}

}
