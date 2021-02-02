package com.siit.concurrency;

public class ConcurrencyExamples {

    public static void main(String[] args) {

        System.out.println("Current thread is: " + Thread.currentThread().getName());


        MyThreadExtendingThread myThreadExtendingThread = new MyThreadExtendingThread();
        myThreadExtendingThread.setName("myThreadExtendingThread");


        MyThreadImplementingRunnable myThreadImplementingRunnable = new MyThreadImplementingRunnable();
        Thread myThread = new Thread(myThreadImplementingRunnable);
        myThread.setName("myThreadImplementingRunnable");


        myThread.start();
        myThreadExtendingThread.start();

        System.out.println("Current thread is: " + Thread.currentThread().getName());

        extracted();

        Runnable runnableClasaAnonima = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Current thread is: " + Thread.currentThread().getName() + " i = " + i);
                }
            }
        };

        Runnable runnableLambda = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Current thread is: " + Thread.currentThread().getName() + " i = " + i);
            }
        };


        Thread threadClasaAnonima = new Thread(runnableClasaAnonima);
        Thread labmdaCreatedThread = new Thread(runnableLambda);
        Thread labmdaCreatedThread2 = new Thread(runnableLambda);

    }

    private static void extracted() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Current thread is: " + Thread.currentThread().getName() + " i = " + i);
        }
    }
}
