package com.siit.concurrency;

public class MyThreadExtendingThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println("Current thread is: " + Thread.currentThread().getName() + " i = " + i);
        }

    }
}
