package com.concurrent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangyue
 * @date 2019/8/1 15:36
 **/
public class FairLock {
    private boolean isLocked = false;

    private Thread lockedThread = null;

    private List<Signal> waitingThreadList = new ArrayList<>();


    public synchronized void lock() {
        Signal signal = new Signal();
        boolean isLockedForTheThread = true;

        synchronized (this) {
            waitingThreadList.add(signal);
        }
        while (isLockedForTheThread) {
            synchronized (this) {
                isLockedForTheThread = isLocked || waitingThreadList.get(0) != signal;

            }
            if (!isLockedForTheThread) {
                isLocked = true;
                waitingThreadList.remove(signal);
                lockedThread = Thread.currentThread();
                return;
            }
        }

        try {

            signal.doWait();
        } catch (InterruptedException e) {
            synchronized (this) {
                waitingThreadList.remove(signal);
                throw new IllegalMonitorStateException("this thread is not the locked thread");
            }
        }

    }

    public synchronized void unLock() {
        if (this.lockedThread != Thread.currentThread()) {
            throw new IllegalMonitorStateException("this thread is not the locked thread");
        }

        isLocked = false;
        lockedThread = null;
        if (waitingThreadList.size() > 0) {
            waitingThreadList.get(0).doNotify();
        }
    }




    public static class Signal{

        private boolean isNotified = false;

        public synchronized void doWait() throws InterruptedException {
            while (!isNotified) {
                this.wait();
            }
            this.isNotified = false;
        }

        public synchronized void doNotify() {
            this.isNotified = true;
            this.notify();
        }

        @Override
        public boolean equals(Object o) {
            return this == o;
        }


    }


}
