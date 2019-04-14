/**
 * ���������������У���һ�����б�ʾջ��ѹ��˳��
 * ���ж϶��������Ƿ�Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ�
 */
package com.ToOffer.test3;

import java.util.Stack;

public class test22 {

	/**
	 * @param args
	 */
	public static boolean isTrueOrder(int []push,int []pop){
		
		if(push==null||pop==null||push.length==0||pop.length==0||push.length!=pop.length){
			return false;
		}
		
		int pushIndex=0;		//��ջ���д���λ��
		int popIndex=0;			//��ջ���д���λ��
		Stack<Integer> stack=new Stack<Integer>();    //����ջ
		
		//�����ջ���л�δ������
		while(popIndex<pop.length){
			
			//��ջ���л�δȫ����ջʱ�����ջΪ�ջ��ߵ�ǰջ��Ԫ�ز����ڳ�ջ���е�ǰ����Ԫ��
			//��һֱ����ջ���н�����ջ����ֱ���������Ԫ�أ�����˵���ó�ջ���в���ȷ
			while(pushIndex<push.length&&(stack.isEmpty()||stack.peek()!=pop[popIndex])){
				
				stack.push(push[pushIndex]);
				pushIndex++;
			}
			
			if(stack.peek()==pop[popIndex]){
				stack.pop();
				popIndex++;
			}
			else{
				return false;
			}
			
		}
		//��ʱ˵����ջ������ȷ��ջ��Ԫ��ȫ������
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int[] push = {1, 2, 3, 4, 5};
	        int[] pop1 = {4, 5, 3, 2, 1};
	        int[] pop2 = {3, 5, 4, 2, 1};
	        int[] pop3 = {4, 3, 5, 1, 2};
	        int[] pop4 = {3, 5, 4, 1, 2};
	        
	        System.out.println(isTrueOrder(push, pop1));
	        System.out.println(isTrueOrder(push, pop2));
	        System.out.println(isTrueOrder(push, pop3));
	        System.out.println(isTrueOrder(push, pop4));
	        

	}

}
