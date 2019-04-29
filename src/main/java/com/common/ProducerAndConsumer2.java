package com.common;

import java.util.concurrent.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Yue on 2017/5/15 0015.
 * 通过阻塞队列实现生产者和消费者模式
 */
public class ProducerAndConsumer2 {
    static class Producer implements Runnable {

        private final BlockingQueue sharedQueue;

        public Producer(BlockingQueue sharedQueue) {
            this.sharedQueue = sharedQueue;
        }

        @Override
        public void run() {
            for(int i=0; i<10; i++){
                try {
                    System.out.println("Produced: " + i);
                    sharedQueue.put(i);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                    //Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    //Consumer Class in Java
   static class Consumer implements Runnable{

        private final BlockingQueue sharedQueue;

        public Consumer (BlockingQueue sharedQueue) {
            this.sharedQueue = sharedQueue;
        }

        @Override
        public void run() {
            while(true){
                try {
                    System.out.println("Consumed: "+ sharedQueue.take());
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                    //Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
    public static void main(String args[]){

        //Creating shared object
        BlockingQueue sharedQueue = new LinkedBlockingQueue();

        //Creating Producer and Consumer Thread
        Thread prodThread = new Thread(new Producer(sharedQueue));
        Thread consThread = new Thread(new Consumer(sharedQueue));

        //Starting producer and Consumer thread
        prodThread.start();
        consThread.start();
    }
}
