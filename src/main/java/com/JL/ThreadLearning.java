/**
 * 实现多线程有两种方法，一种是继承Thread类(覆写run函数)，
 * 另一种是实现Runnable接口承
 */
package com.JL;

class MyThread extends Thread{
	private String name;
	public MyThread(String name){
		this.name=name;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(name+"运行"+"i="+i);
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
				System.out.println("剩余"+ticket+"张票");
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
		/*MyThread mt1=new MyThread("线程1");
		MyThread mt2=new MyThread("线程2");
		mt1.start();     //此处通过start方法启动线程。
		mt2.start();*/
		
		MyThread2 mt1=new MyThread2("线程a");
		MyThread2 mt2=new MyThread2("线程b");
		
		//实现Runnable接口后出现这样一个问题：怎样启动线程
		//Thread类中提供了两个构造函数用以接收Runnable子类来实例化对象，从而可以使用Thread中的start方法
		/*Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		t1.start();
		t2.start();*/
		
		//该例子说明虽然
		MyThread3 mt3=new MyThread3();
		Thread t3=new Thread(mt3);
		Thread t4=new Thread(mt3);
		Thread t5=new Thread(mt3);
		t3.start();
		t4.start();
		t5.start();

		
		
	

	}

}
