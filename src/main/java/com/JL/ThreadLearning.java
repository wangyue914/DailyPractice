/**
 *
 */
package com.JL;

class MyThread extends Thread{
	private String name;
	public MyThread(String name){
		this.name=name;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(name+"thread"+"i="+i);
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
			//使用synchronized关键字同步代码块，保证一个时间段只有一个线程运行
			synchronized(this){
			if(ticket>0){
				System.out.println("thread"+ticket+"ticket");
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
		/*MyThread mt1=new MyThread("thread1");
		MyThread mt2=new MyThread("thread2");
		mt1.start();
		mt2.start();*/
		
		MyThread2 mt1=new MyThread2("t1");
		MyThread2 mt2=new MyThread2("t2");
		
		/*Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		t1.start();
		t2.start();*/
		
		MyThread3 mt3=new MyThread3();
		Thread t3=new Thread(mt3);
		Thread t4=new Thread(mt3);
		Thread t5=new Thread(mt3);
		t3.start();
		t4.start();
		t5.start();

		
		
	

	}

}
