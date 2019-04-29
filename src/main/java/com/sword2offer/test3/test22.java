package com.sword2offer.test3;

import java.util.Stack;

/**
 * Created by Yue on 2017/6/24 0024.
 */
public class test22 {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack=new Stack<>();
        int i=0,j=0;

        while(i<pushA.length){
            stack.push(pushA[i++]);
            while(stack.peek()==popA[j]){
                stack.pop();
                j++;
                if(stack.isEmpty()){
                    break;
                }
            }
        }
        if(j==popA.length){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int []push={3,1,4,5,2};
        int []pop1={4,5,2,1,3};
        int []pop2={2,4,5,1,3};
        System.out.println(IsPopOrder(push,pop1));
        System.out.println(IsPopOrder(push,pop2));
    }
}
