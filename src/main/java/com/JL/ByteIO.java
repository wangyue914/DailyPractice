/**
 * �ֽ�������
 */
package com.JL;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ByteIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		File f=new File("E:"+File.separator+"test.txt");
		
		OutputStream out=null;
		out=new FileOutputStream(f,true);
		//out=new FileOutputStream(f,true);   //����true�������������ں���������
		
		
		String str="Hello World!";
		byte b[]=str.getBytes();
		
		out.write(b);
		
		out.close();

	}

}
