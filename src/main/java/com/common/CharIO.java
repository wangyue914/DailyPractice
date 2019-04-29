/**
 * 字符操作
 */
package com.common;

import java.io.*;


public class CharIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		File f=new File("E:"+File.separator+"test.txt");

		Writer out=null;
		out=new FileWriter(f);

		String str="mike";

		out.write(str);

		out.close();


	}

}
