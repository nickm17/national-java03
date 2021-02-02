package com.siit.concurrency;

import lombok.SneakyThrows;

public class MyThreadImplementingRunnable implements Runnable {

    @SneakyThrows
    @Override
    public void run() {

        for (int i = 0; i < 100; i = i+10) {

            Thread.sleep(1000);

            System.out.println("Current thread is: " + Thread.currentThread().getName() + " i = " + i);
        }

        // invocam alte metode....

    }
}
