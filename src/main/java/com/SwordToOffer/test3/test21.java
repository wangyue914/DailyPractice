package com.SwordToOffer.test3;

import java.util.Stack;

/**
 * Created by Yue on 2017/6/23 0023.
 */
public class test21 {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    public  void push(int node) {
        stack.push(node);
        if(minStack.isEmpty()){
            minStack.push(node);
        }else{
            minStack.push(node<minStack.peek()?node:minStack.peek());
        }
    }

    public  void pop() {

        if(!stack.isEmpty()&&!minStack.isEmpty()){
            stack.pop();
            minStack.pop();
        }
    }

    public  int top() {
        if(!stack.isEmpty()){
            return stack.peek();
        }
        return -1;

    }

    public  int min() {

        if(!minStack.isEmpty()){
            return minStack.peek();
        }
        return -1;
    }
}
