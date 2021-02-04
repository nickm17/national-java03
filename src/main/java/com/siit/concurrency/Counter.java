package com.siit.concurrency;

public class Counter {
    private int count = 0;

    public void increment(){
        // cod ce nu necesita sincronizare
        System.out.println(count);
        synchronized (this) {
            count = count + 1;
        }
        // cod ce nu necesita sincronizare
    }

    public int getCount() {
        // cod ce nu necesita sincronizare
        synchronized (this){
            return count;
        }
    }
}
