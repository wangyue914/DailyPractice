/**
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡÿһ������
 * 
 * ��ϸ������ӡʱÿһ����ǰ����������һ��������Ҫ�ģ� ��Ϊ��ӡһȦ������һ����
 * ���ֻ��һ�У���ô�Ͳ��õڶ����ˡ�Ҳ������Ҫ�ڶ�����ǰ����������ֹ�кŴ�����ʼ�кš�
 * ��Ҫ��������ӡ��ǰ��������Ȧ���������������У�Ҳ����˵����Ҫ����ֹ�кŴ�����ʼ�к�֮�⣬
 * ��Ҫ����ֹ�кŴ�����ʼ�кš�
 * ͬ����Ҫ��ӡ���Ĳ���ǰ���������������������У�
 * ���Ҫ����ֹ�кű���ʼ�к����ٴ�2 �� ͬʱ��ֹ�кŴ�����ʼ�кš�
 */
package com.ToOffer.test2;

public class test20 {

	/**
	 * @param args
	 */
	public static void printInOrder(int[][]num){
		if(num==null){
			return;
		}
		int x=0;   //��¼����ʼλ�õ���
		int y=0;	//��¼����ʼλ�õ���
		while((2*x<num.length)&&(2*y<num[0].length)){	//��������ʼλ���Ǿ����л���һ��ʱ˵���Ѿ�ȫ���������
			printInCircle(x,y,num);	
			x++;
			y++;
		}
		
	}
	
	public static void printInCircle(int x,int y,int[][]num){
		
		int rows=num.length;		//���������
		int cols=num[0].length;		//���������
		
		//�������������һ�У��������һ����
		for(int i=y;i<=cols-y-1;i++){		
			System.out.print(num[x][i]+" ");
		}
		
		//���������ֹ����������ʼ������˵����Ҫ����������ұ���һ��
		if(rows-x-1>x){
			for(int i=x+1;i<=rows-x-1;i++){
				System.out.print(num[i][cols-y-1]+" ");
			}
		}
		
		//���������ֹ����������ʼ����������ֹ����������ʼ����
		//˵����Ҫ���������������һ��
		if( rows-x-1>x && cols-y-1>y){
			for(int i=cols-y-2;i>=y;i--){
				System.out.print(num[rows-x-1][i]+" ");
			}
		}
		
		//���������ֹ����������ʼ����������ֹ��������ʼ�������ٴ�2
		//˵����Ҫ����������һ��
		if(cols-y-1>y && rows-x-1>x+1){
			for(int i=rows-x-2;i>=x+1;i--){
				System.out.print(num[i][y]+" ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][]={
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9},
        };
		printInOrder(num);
		System.out.println();
		int num2[][] = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {22, 23, 24, 25, 26, 27, 28, 9},
                {21, 36, 37, 38, 39, 40, 29, 10},
                {20, 35, 34, 33, 32, 31, 30, 11},
                {19, 18, 17, 16, 15, 14, 13, 12},

        };
		printInOrder(num2);

	}

}
