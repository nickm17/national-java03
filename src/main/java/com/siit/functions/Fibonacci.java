package com.siit.functions;

public class Fibonacci {

    public int fibonacci(int n) {
        System.out.println(n);
        Integer n1 = getInteger(n);
        if (n1 != null) return n1;
        return fibonacci(n - 1) + fibonacci(n - 2);
//        if (n == 1){
//
//        }
    }

    private Integer getInteger(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return null;
    }

    public static void main(String[] args) {

        int result = new Fibonacci().fibonacci(10);
        System.out.println(result);
    }
}
