package com.common;

import java.util.*;

public class houzhuibiaodashi {

	/**
	 * @param
	 */

	public static int calculate(String str){
		Stack<Integer> num=new Stack<Integer>();
		Stack<Character> op=new Stack<Character>();
		char c[]=str.toCharArray();
		for(int i=0;i<str.length();i++){
			if(c[i]>='0'&&c[i]<='9'){
				
				num.push(c[i]-'0');
			}
			else {
				switch(c[i]){
				case '+':{
					int current=num.pop();
					current=num.pop()+current;
					num.push(current);
					break;
				}
				case'-':{
					int current=num.pop();
					current=num.pop()-current;
					num.push(current);
					break;
				}
				case'*':{
					int current=num.pop();
					current=num.pop()*current;
					num.push(current);
					break;
				}
				case'/':{
					int current=num.pop();
					current=num.pop()/current;
					num.push(current);
					break;
				}
				default:{
					break;
				}
					
				}
				
			}

		}
		return num.peek();
	}
	
	public static String preToIn(String str){
		
		char[] newstr=str.toCharArray();
		ArrayList<Character> list=new ArrayList<Character>();
		Stack<Character> stack=new Stack<Character>();
		
		for(int i=0;i<str.length();i++){
			
			if(newstr[i]>='0'&&newstr[i]<='9'){
				list.add(newstr[i]);
			}else {
				
				if(stack.isEmpty()){
					stack.push(newstr[i]);
				}else{
		
					  if(newstr[i]==')'){
							while(stack.peek()!='('&&(!stack.isEmpty())){
								list.add(stack.pop());
							}
							stack.pop();
						}
					  else if(forInt(newstr[i],stack.peek())>0){
							stack.push(newstr[i]);
						}
					else if(forInt(newstr[i],stack.peek())<=0){
						while(!stack.isEmpty()&&forInt(newstr[i], stack.peek())!=0){
						list.add(stack.pop());
						}
						list.add(stack.pop());
						stack.push(newstr[i]);
					}
					
				}
				
			}
			
		}
		while(!stack.isEmpty()){
			list.add(stack.pop());
		}
		char[]ch=new char[list.size()];
		
		
		for(int i=0;i<list.size();i++){
			ch[i]=list.get(i);
			
		}
		
		return String.valueOf(ch);
	}
	public static int forInt(char c1,char c2){
		if(c1=='('||c2=='('){
			return 1;
		}
		if(c1=='*'||c1=='/'){
			if(c2=='+'||c2=='-'){
			return 1;
			}
			else {
				return 0;
			}
		}
		if(c1=='+'||c1=='-'){
			if(c2=='+'||c2=='-'){
				return 0;
			}
			else {
				return -1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=preToIn("1+2*(3-4)-5*6");
		String s="53-";
		System.out.println(str);
		System.out.println(calculate(str));

	}

}
