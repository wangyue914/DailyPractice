package com.concurrent;

/**
 * @author wangyue
 * @date 2019/8/1 15:26
 **/
public class UnfairLock {
    private boolean isLock = false;

    private Thread lockedThread = null;


    public synchronized void lock() throws InterruptedException {
        while (isLock) {
            wait();
        }
        isLock = true;
        lockedThread = Thread.currentThread();

    }

    public synchronized void unLock() {
        if (this.lockedThread != Thread.currentThread()) {
            throw new IllegalMonitorStateException("this thread is not the locked thread");
        }

        isLock = false;
        lockedThread = null;
        notify();
    }

}
