/**
 *������ջʵ��һ�����С����е��������£�
 *��ʵ��������������appendTail ��deleteHead��
 *�ֱ�����ڶ���β����������ڶ���ͷ��ɾ�����Ĺ��ܡ� 
 *
 *����ʱ��stack1��Ϊ�����ջ������ɾ��ʱ��stack1�е�Ԫ�����ε���stack1��ѹ��stack2�ͱ�֤�˲����Ԫ����
 *stack2��ջ��Ҳ���Ƕ���β����ɾ����ֻ���stack2ջ�����ε���������Ҫ��
 */
package com.ToOffer.test1;

import java.util.Stack;

public class test7 {

	
	public static class NewQueue{
		
		private Stack<Integer> stack1=new Stack();    	//�����õ���ջ
		private Stack<Integer> stack2=new Stack();		//�����õ���ջ
		public NewQueue(){
			
		}
		
		public  void appendTail(int i){
			stack1.push(i);
		}
		
		public int deleteHead(){
			
			if(stack2.isEmpty()){      //���stack2�ǿյ����stack1��ѹ��Ԫ��
				while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			    }
			}
			
			if(stack2.isEmpty()){		//�����ʱ���ǿյģ�˵���������Ѿ�û��Ԫ����
				throw new RuntimeException("No more element."); 
			}
			
			return stack2.pop();		//����ɾ����Ԫ��
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewQueue newqueue=new NewQueue();
		for(int i=0;i<5;i++){
		newqueue.appendTail(i);
		}
		System.out.println(newqueue.deleteHead());
		System.out.println(newqueue.deleteHead());

	}

}
