package com.siit.concurrency;

public class CounterThread extends Thread {

    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            counter.increment();
        }
        System.out.println(counter.getCount());
    }
}
