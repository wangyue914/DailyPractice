/**
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������ 
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и������� 
 * <p/> 
 * ���ɣ�����ѡȡ���������Ͻǵ����֡���������ֵ���Ҫ���ҵ����֣����ҹ��̽����� 
 * ��������ִ���Ҫ���ҵ����֣��޳�����������ڵ��У����������С��Ҫ���ҵ����֣��޳�����������ڵ��С� 
 * Ҳ����˵���Ҫ���ҵ����ֲ�����������Ͻǣ���ÿ���ζ�������Ĳ��ҷ�Χ���޳����л���һ�У�����ÿһ����������С 
 * ���ҵķ�Χ��ֱ���ҵ�Ҫ���ҵ����֣����߲��ҷ�ΧΪ�ա� 
 */
package com.ToOffer.test1;

public class test3 {

	/**
	 * @param args
	 */

	public static void find(int[][] matrix, int n) {
		int rows = matrix.length; // ���������
		int cols = matrix[0].length; // ��������
		int flag = 0;

		int row = 0; // ��ʼ�к�
		int col = cols - 1; // ��ʼ�к�
		while (row >= 0 && row < rows && col >= 0 && col < cols) {
			if (n == matrix[row][col]) {
				System.out.println("true,row is" + row + "col is" + col);
				flag = 1;
				break;
			} else if (n > matrix[row][col]) {
				row++;
			} else {
				col--;
			}
		}
		if (flag == 0) {
			System.out.println("not found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { 
				{ 1, 2, 8, 9 }, 
				{ 2, 4, 9, 12 }, 
				{ 4, 7, 10, 13 },
				{ 6, 8, 11, 15 }

		};
		find(matrix, 9);

	}

}
