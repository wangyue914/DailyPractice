package com.common;

/**
 * Created by Yue on 2017/5/15 0015.
 * 使用传统的方法实现生产者和消费者
 */

public class ProducerAndConsumer {
    static class Resource{
        private int num=0;

        public synchronized void increase(){
            while(num!=0){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            num++;
            System.out.println(num);
            this.notify();
        }

        public synchronized void decrease(){
            while(num==0){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            num--;
            System.out.println(num);
            this.notify();
        }

    }

    static class Producer implements Runnable{
        private Resource r1;
        public Producer(Resource r1){
            this.r1=r1;
        }

        @Override
        public void run(){
            for(int i=0;i<10;i++){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                r1.increase();
            }

        }
    }
    static class Consumer implements Runnable{
        private Resource r2;
        public Consumer(Resource r2){
            this.r2=r2;
        }
        @Override
        public void run(){
            for(int i=0;i<10;i++){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                r2.decrease();
            }
        }
    }

    public static void main(String[] args) {
        Resource resource=new Resource();
        Producer p=new Producer(resource);
        Consumer c=new Consumer(resource);

        Thread t1=new Thread(p);
        Thread t2=new Thread(c);
        //Thread t3=new Thread(p);
        //Thread t4=new Thread(c);


        t1.start();
        t2.start();
        //t3.start();
        //t4.start();
    }
}
