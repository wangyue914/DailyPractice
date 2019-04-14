/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�� ���ǳ�֮�������ת�� 
 * ����һ����������������һ����ת�������ת�������СԪ�ء� 
 * ��������{3, 4, 5, 1, 2��Ϊ��l ,2, 3, 4, 5}��һ����ת�����������СֵΪ1
 */
package com.ToOffer.test1;

public class test8 {

	public static int min(int[] arr) {
		if (arr.length == 0) {
			System.out.println("��������Ϊ��");
		}

		int start = 0;
		int end = arr.length - 1;
		int mid = start;

		while (arr[start] >= arr[end]) {

			if (end - start == 1) {

				return arr[end];

			}
			mid = start + (end - start) / 2;
			if (arr[start] == arr[mid] && arr[mid] == arr[end]) {        //��ȵ��ж�Ҫ����ǰ��
				return findMid(arr, start, end); 									//��Ϊ�����if�������=�������
			}
			if (arr[start] <= arr[mid]) {
				start = mid;
			} else if (arr[mid] <= arr[end]) {
				end = mid;
			}

		}
		return arr[mid];

	}

	public static int findMid(int[] arr, int start, int end) {

		int result = arr[start];
		for (int i = start + 1; i <= end; i++) {
			if (result > arr[i]) {
				result = arr[i];
			}
		}
		return result;

	}

	/**
	 * @param args
	 */
	
	
	//�������������뵽��
	public static int min2(int[] array){
		if(array==null||array.length<1){
			return 0;
		}
		int a = array[0];
	
		for (int i = 1; i < array.length - 1; i++) {
			if (a > array[i]) {
				
				return array[i];
			}
		}
		
		
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2 };
		System.out.println(min(arr));

	}

}
