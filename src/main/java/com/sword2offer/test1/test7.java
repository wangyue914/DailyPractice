package com.sword2offer.test1;

import java.util.Stack;

/**
 * Created by yue on 17-10-13 上午10:59.
 **/
public class test7 {
    public static class NewQueue{

        private Stack<Integer> stack1=new Stack();
        private Stack<Integer> stack2=new Stack();
        public NewQueue(){

        }

        public  void appendTail(int i){
            stack1.push(i);
        }

        public int deleteHead(){

            if(stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }

            if(stack2.isEmpty()){
                throw new RuntimeException("No more element.");
            }

            return stack2.pop();


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
