package com.siit.concurrency;

class Buffer {

    private volatile int number = -1;
    private boolean available = false;



    public int get() {
        synchronized (this) {
            while (!available) {
                try {
                    wait(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            available = false;
            notify();
            return number;
        }
    }

    public synchronized void put(int number) {
        while (available){
            try {
                wait();
            } catch (InterruptedException e) {
                // inghitim exceptia
            }
        }

        this.number = number;
        available = true;
        notifyAll();
    }
}

class Consumator extends Thread {

    private Buffer buffer;

    public Consumator(Buffer b) {
        buffer = b;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = buffer.get();
            System.out.println("Consumatorul a primit:\t" + value);
        }
    }
}

class Producator extends Thread {

    private Buffer buffer;

    public Producator(Buffer b) {
        buffer = b;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.put(i);
            System.out.println("Producatorul a pus:\t" + i);
            try {
                sleep((int) (Math.random() * 1000)); // simulam ca operatia de put dureaza mai mult decat cea de get
            } catch (InterruptedException e) {

            }
        }
    }
}

public class ProducerConsumerEx {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Producator(buffer);
        Thread consumer = new Consumator(buffer);

        producer.start();
        consumer.start();
//        consumer.setPriority(3);


    }

}
