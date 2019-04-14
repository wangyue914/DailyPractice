/**
 * ʵ�ֶ��߳������ַ�����һ���Ǽ̳�Thread��(��дrun����)��
 * ��һ����ʵ��Runnable�ӿڳ�
 */
package com.JL;

class MyThread extends Thread{
	private String name;
	public MyThread(String name){
		this.name=name;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(name+"����"+"i="+i);
		}
	}
	
}

class MyThread2 implements Runnable{
	private String name;
	public MyThread2(String name){
		this.name=name;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(name+"i="+i);
		}
	}
}

class MyThread3 implements Runnable{
	private int ticket=5;
	public void run(){
		for(int i=0;i<100;i++){
			//ʹ��synchronized�ؼ���ͬ������飬��֤һ��ʱ���ֻ��һ���߳�����
			synchronized(this){
			if(ticket>0){
				System.out.println("ʣ��"+ticket+"��Ʊ");
				ticket--;
			}
			}
		}
	}
	
}

public class ThreadLearning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MyThread mt1=new MyThread("�߳�1");
		MyThread mt2=new MyThread("�߳�2");
		mt1.start();     //�˴�ͨ��start���������̡߳�
		mt2.start();*/
		
		MyThread2 mt1=new MyThread2("�߳�a");
		MyThread2 mt2=new MyThread2("�߳�b");
		
		//ʵ��Runnable�ӿں��������һ�����⣺���������߳�
		//Thread�����ṩ���������캯�����Խ���Runnable������ʵ�������󣬴Ӷ�����ʹ��Thread�е�start����
		/*Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		t1.start();
		t2.start();*/
		
		//������˵����Ȼ
		MyThread3 mt3=new MyThread3();
		Thread t3=new Thread(mt3);
		Thread t4=new Thread(mt3);
		Thread t5=new Thread(mt3);
		t3.start();
		t4.start();
		t5.start();

		
		
	

	}

}
