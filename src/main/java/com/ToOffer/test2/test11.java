/**
 * ʵ�ֺ���double Power(double base, int exponent)����base��exponent�η��� 
 * ����ʹ�ÿ⺯����ͬʱ����Ҫ���Ǵ������⡣
 */
package com.ToOffer.test2;

public class test11 {
	
public static void reOrderArray(int [] array) {
        if(array==null||array.length<1){
        	return;
        }
       int i=0;
       int j;
        for(i=0;i<array.length-1;i++){
        	
        	for(j=0;j<array.length-1-i;j++){
        		if(array[j]%2==0&&array[j+1]%2==1){
        			int temp=array[j];
        			array[j]=array[j+1];
        			array[j+1]=temp;
        		}
        	}
        	
        }
       
        for(int k:array){
        	System.out.print(k+" ");
        }
    }
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={1,2,3,4,5,6,7};
		reOrderArray(array);

	}

}
