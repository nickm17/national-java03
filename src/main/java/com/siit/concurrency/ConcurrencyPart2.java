package com.siit.concurrency;

import java.util.Arrays;

public class ConcurrencyPart2 {


    public static void main(String[] args) throws InterruptedException {

        int [] result = new int[1];

        ThreadRandom runnableRamdom1 = new ThreadRandom();
        ThreadRandom runnableRamdom2 = new ThreadRandom();
        ThreadRandom runnableRamdom3 = new ThreadRandom();
        ThreadRandom runnableRamdom4 = new ThreadRandom();
        ThreadRandom runnableRamdom5 = new ThreadRandom();

        Thread thread1 = new Thread(runnableRamdom1);
        Thread thread2 = new Thread(runnableRamdom2);
        Thread thread3 = new Thread(runnableRamdom3);
        Thread thread4 = new Thread(runnableRamdom4);
        Thread thread5 = new Thread(runnableRamdom5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread5.start();
        thread4.start();

        thread5.join();

        int sum = runnableRamdom1.result[0] + runnableRamdom2.result[0] + runnableRamdom3.result[0]+ runnableRamdom4.result[0] +runnableRamdom5.result[0];
        System.out.println(sum);

        Arrays.asList(1,2,3,4,5,6)
              .parallelStream()
//              .sorted() // pierdem din beneficiile procesarii in paralel
              .forEach(s -> System.out.print(s+" "));

    }
}
