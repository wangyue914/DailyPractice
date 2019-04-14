package com.JL;

import java.io.IOException;

public class RunTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime run=Runtime.getRuntime();
		/*System.out.println("����ڴ�"+run.maxMemory());
		System.out.println("�����ڴ�"+run.freeMemory());
		
		String str="hello world";
		for(int i=0;i<100;i++){
			str=str+i;
		}
		System.out.println(str);
		System.out.println("�ַ���������"+run.freeMemory());
		run.gc();
		System.out.println("�������պ�"+run.freeMemory());*/
		Process pro=null;
		try {
			pro=run.exec("notepad.exe");        	//����һ�����±����򲢴���5����
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		pro.destroy();

	}

}
