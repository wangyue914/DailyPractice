/**
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ����СԪ�ص�min������
 * �ڸ�ջ�У�����pop��push ��min��ʱ�临�Ӷȶ���o(1)
 * һ����Ҫ����ջ��һ������������ݣ���һ����ŵ�ǰ��СԪ�ض�Ӧ������ջ��λ��(Ĭ�ϴ�0��ʼ)
 */
package com.ToOffer.test3;

import java.util.Stack;

public class test21 {

	public static class MyStack<T extends Comparable<T>> {
		private Stack<T> myStack;
		private Stack<Integer> minStack;

		public MyStack() {
			myStack = new Stack();
			minStack = new Stack();

		}

		public void push(T t) {

			if (t == null) {
				throw new RuntimeException("��ջԪ��Ϊ��");
			}
			//�ʼû��Ԫ��ʱ
			if (myStack.isEmpty()) {
				myStack.push(t);
				minStack.push(0);
			} 
			//�����Ԫ��
			else {
				T e = myStack.get(minStack.peek());
				myStack.push(t);
				//�Ƚϲ���Ԫ����Ŀǰ��СԪ�صĴ�С
				if (t.compareTo(e) < 0) {
					minStack.push(myStack.size() - 1);
				} else {
					minStack.push(minStack.peek());
				}
			}

		}
		
		public T pop(){
			
			if(myStack.isEmpty()){
				throw new RuntimeException("ջΪ��");
			}
			
			minStack.pop();
			return myStack.pop();
		}
		
		public T min(){
			if(minStack.isEmpty()){
				throw new RuntimeException("ջΪ��");
			}
			return myStack.get(minStack.peek());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack<Integer> stack = new MyStack<Integer>();
	        stack.push(3);
	        System.out.println(stack.min() == 3);
	        System.out.println(stack.minStack.peek());
	        stack.push(4);
	        System.out.println(stack.min() == 3);
	        System.out.println(stack.minStack.peek());
	        stack.push(2);
	        System.out.println(stack.min() == 2);
	        System.out.println(stack.minStack.peek());
	        stack.push(3);
	        System.out.println(stack.min() == 2);
	        System.out.println(stack.minStack.peek());
	        stack.pop();
	        System.out.println(stack.min() == 2);
	        stack.pop();
	        System.out.println(stack.min() == 3);
	        stack.push(0);
	        System.out.println(stack.min() == 0);

	}

}
