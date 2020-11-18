package com.siit.functions;

public class Fibonacci {

    public static int fibonacci(int n) {
        System.out.println(n);
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
//        if (n == 1){
//
//        }
    }

    public static void main(String[] args) {

        int result = fibonacci(10);
        System.out.println(result);
    }
}
