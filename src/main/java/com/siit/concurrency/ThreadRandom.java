package com.siit.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ThreadRandom implements  Runnable {

    int [] result = new int[1];
    AtomicInteger resultAtomic = new AtomicInteger(0);

    @Override
    public void run() {

//        Random

        IntStream.iterate(1, i -> i + 1)
                 .limit(10)
                 .forEach(i -> {
                     result[0] += 10;
                     resultAtomic.addAndGet(10);
                 } );

    }
}
