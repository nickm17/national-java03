package com.siit.concurrency;

public class CounterExample {

    public static void main(String[] args) {
        Counter counter = new Counter();

        double before = System.currentTimeMillis();

        CounterThread counterThread1 = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);
        CounterThread counterThread3 = new CounterThread(counter);
        CounterThread counterThread4 = new CounterThread(counter);
        CounterThread counterThread5 = new CounterThread(counter);
        CounterThread counterThread6 = new CounterThread(counter);
        CounterThread counterThread7 = new CounterThread(counter);
        CounterThread counterThread8 = new CounterThread(counter);
        CounterThread counterThread9 = new CounterThread(counter);

        counterThread1.start();
        counterThread2.start();
        counterThread3.start();
        counterThread4.start();
        counterThread5.start();
        counterThread6.start();
        counterThread7.start();
        counterThread8.start();
        counterThread9.start();

        System.out.println("After " + (System.currentTimeMillis() - before));

    }

}
