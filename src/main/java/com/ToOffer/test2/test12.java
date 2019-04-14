/**
 * ��������n����˳���ӡ����1����nλʮ����������������3�����ӡ��1��2��3 һֱ������3λ����999��
 */
package com.ToOffer.test2;

public class test12 {

	/**
	 * @param args
	 */
	public static void printOneToN(int n) {  
        // ��������ֲ���ΪС��1  
        if (n < 1) {  
            throw new RuntimeException("The input number must larger than 0");  
        }  
        // ����һ���������ڴ���ֵ  
        int[] arr = new int[n];  
        printOneToN(0, arr);  
    }  
	public static void printOneToN(int n,int[]arr){
		
		if(n>=arr.length){
			printarr(arr);
		}else {
			for(int i=0;i<=9;i++){
				arr[n]=i;
				printOneToN(n+1, arr);
			}
		}
		
		
	}
public static void printarr(int[]arr){
		
	int index=0;
	while(index<arr.length&&arr[index]==0){
		index++;
	}
	for(int i=index;i<arr.length;i++){
		System.out.print(arr[i]);
	}
	if(index<arr.length){
		System.out.println();
	}
	
	}
  

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printOneToN(2);
		

	}
	

}
