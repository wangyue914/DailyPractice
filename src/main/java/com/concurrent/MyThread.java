package com.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wangyue
 * @date 2019/7/5 11:28
 **/
public class MyThread implements Runnable{

    Count count;

    String name;

    public MyThread(){}

    public MyThread(Count count, String name) {
        this.count = count;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "  " + count.addCount(3));
        /*for (int i = 0; i < 10; i++) {
            System.out.println(name + "  " + count.addCount());
        }*/

    }


    public static void main(String[] args) throws Exception{
        Count count = new Count(0, new FairLock());

        ExecutorService executorService = new ThreadPoolExecutor(
                4,
                4,
                0,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<>());
        for (int i = 0; i < 10; i++) {
            executorService.submit(new MyThread(count, "thread" +" " + i));
        }

    }
}
