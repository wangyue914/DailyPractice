package com.JL;

import java.io.*;

public class BufferReader {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		BufferedReader buf=null;
		buf=new BufferedReader(new InputStreamReader(System.in));
		
		String str=null;
		System.out.println("����������");
		
		try {
			str=buf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("���������Ϊ"+str);

	}

}
