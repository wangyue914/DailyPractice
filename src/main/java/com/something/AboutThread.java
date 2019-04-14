package com.something;

/**
 * Created by Yue on 2017/4/16 0016.
 */
public class AboutThread  {


    //中断线程时尽量使用Interrupted而不是Stop方法
    public static class ThreadDemo1 implements Runnable{
        @Override
        public void run(){
            while(true){
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("Interrupted");
                    break;
                }
                System.out.println("thread is running");
                Thread.yield();

            }

        }
    }

    //使用线程组来管理多个线程
    public static class ThreadGroupName implements Runnable{
        @Override
        public void run(){
            String groupAndName=Thread.currentThread().getThreadGroup().getName()+"-"+Thread.currentThread().getName();
            while(true){
                System.out.println("I am"+groupAndName);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }


    }

    public static void main(String[] args) throws InterruptedException{
        /*ThreadDemo1 td1=new ThreadDemo1();
        Thread t1=new Thread(td1);
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();*/

        ThreadGroup tg=new ThreadGroup("PrintGroup");
        Thread t1=new Thread(tg,new ThreadGroupName(),"T1");
        Thread t2=new Thread(tg,new ThreadGroupName(),"T2");
        t1.start();
        t2.start();
        System.out.println(tg.activeCount());
        tg.list();

    }

}
