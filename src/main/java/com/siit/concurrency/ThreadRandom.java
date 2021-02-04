package com.siit.concurrency;

import java.util.stream.IntStream;

public class ThreadRandom implements  Runnable {

    int [] result = new int[1];

    @Override
    public void run() {

//        Random

        IntStream.iterate(1, i -> i + 1)
                 .limit(10)
                 .forEach(i -> result[0]+=i);

    }
}
