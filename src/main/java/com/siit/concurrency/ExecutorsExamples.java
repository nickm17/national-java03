package com.siit.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorsExamples {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorServiceFixedPool = Executors.newFixedThreadPool(10);
        ScheduledExecutorService executorServiceScheduled = Executors.newSingleThreadScheduledExecutor();


        System.out.println(executorService.isTerminated());
        System.out.println(executorService.isShutdown());

        Runnable runnableTask = () -> {
            System.out.println("Runnable task in single thread executor");
        };
        executorService.execute(runnableTask);
        executorService.execute(runnableTask);

        Future<?> submit = executorService.submit(runnableTask);

        System.out.println(submit.isDone());
        System.out.println(submit.isCancelled());
        System.out.println(submit.get()); // asteapta oricat pana cand task-ul se finalizeaza


        Callable<String> objectCallable = () -> {
            System.out.println("11111");
            Thread.sleep(100);
            return "Rezultatul lui Callable";
        };
        Future<String> submit1 = executorService.submit(objectCallable);
        Future<String> submit2 = executorService.submit(() -> {
            System.out.println("22222");
            return "Rezultatul lui Callable 2";
        });

        while (!submit1.isDone()){
            System.out.println(submit1.get());
        }

        System.out.println(submit2.get(100, TimeUnit.MILLISECONDS));

        try {
//            throw new RuntimeException();

        } finally {
            System.out.println("Shutting down!!!!!!!!!!!");
            executorService.shutdown();
        }


        ScheduledFuture<?> schedule = executorServiceScheduled.schedule(runnableTask, 1000, TimeUnit.MILLISECONDS);
        ScheduledFuture<?> schedule2 = executorServiceScheduled.scheduleAtFixedRate(runnableTask, 0,1, TimeUnit.SECONDS);


        final AtomicInteger counter = new AtomicInteger(10);

        counter.decrementAndGet();
    }

}
