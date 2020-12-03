package com.siit.string;

import java.util.Arrays;

public class StringApi {

    public static void main(String[] args) {
        String hello = "Hello , %s %d world!";

        String concatResult = hello.concat("Terra");

        System.out.println(hello);
        System.out.println(concatResult);

        System.out.println(hello.toLowerCase());
        System.out.println(hello.toUpperCase());
        System.out.println("lungimea este: " + hello.length());
        System.out.println("first character: " + hello.charAt(0));
        System.out.println("3rd character: " + hello.charAt(3));
        System.out.println("contains a character sequence: " + hello.contains("wor"));
        System.out.println("substring: " + hello.substring(4));
        System.out.println("substring: " + hello.substring(2, 6));
        System.out.println("starts with: " + hello.startsWith("Hello"));
        System.out.println("replace: " + hello.replace("lo", "Bye"));
        System.out.println("replaceAll: " + hello.replaceAll("[a-zA-Z0-9]", "Bye"));


        var split = hello.split(",");
        System.out.println(Arrays.toString(split));

        //        // "[a-z]"
        //        // "[0-9]"
        //        // "[a-zA-Z]"
        //        // "[a-zA-Z0-9]"

        System.out.println(String.format(hello, "inlocuitor", 22));
        System.out.printf(hello, "inlocuitor", 22);

//        StringBuffer
//        StringBuilder
    }
}
