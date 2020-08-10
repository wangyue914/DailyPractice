package com.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		BufferedReader buf=null;
		buf=new BufferedReader(new InputStreamReader(System.in));
		
		String str=null;
		System.out.println("请输入内容");
		
		try {
			str=buf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("输入内容为"+str);

	}

}
