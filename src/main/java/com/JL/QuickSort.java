package com.JL;

public class QuickSort {

	/**
	 * @param args
	 */
	public static void quickSort(int []array,int low,int high){
		
		if(low>=high){
			return;
		}
		int key=array[low];
		int left=low;
		int right=high;
		
		while(low<high){
			
			while(low<high&&array[high]>=key){
				high--;
			}
			array[low]=array[high];
			while(low<high&&array[low]<=key){
				low++;
			}
			array[high]=array[low];
		}
		
		array[low]=key;
		quickSort(array, left,low-1);
		quickSort(array, low+1, right);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 49, 38, 65, 97, 76, 13, 27, 49 };

		quickSort(arr, 0, 7);
		for (int i :arr) {
			System.out.print(i + " ");
		}

	}

}
