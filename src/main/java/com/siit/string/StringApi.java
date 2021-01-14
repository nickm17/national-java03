package com.siit.string;

public class StringApi {
    static {
        new StringApi();
    }


    public static void run(int... nums) {
        System.out.println(nums.length);
        System.out.println(nums[1]);
    }
    public static void main(String... args) {


        run(11, 22);
        run(new int[] {4, 5});


        short aaa = 2;

        float bb = aaa;
        long l = aaa;
        int i = aaa;

//        String hello = "Hello , %s %d world!";
//
//        String concatResult = hello.concat("Terra");
//
//        System.out.println(hello);
//        System.out.println(concatResult);
//
//        System.out.println(hello.toLowerCase());
//        System.out.println(hello.toUpperCase());
//        System.out.println("lungimea este: " + hello.length());
//        System.out.println("first character: " + hello.charAt(0));
//        System.out.println("3rd character: " + hello.charAt(3));
//        System.out.println("contains a character sequence: " + hello.contains("wor"));
//        System.out.println("substring: " + hello.substring(4));
//        System.out.println("substring: " + hello.substring(2, 6));
//        System.out.println("starts with: " + hello.startsWith("Hello"));
//        System.out.println("replace: " + hello.replace("lo", "Bye"));
//        System.out.println("replaceAll: " + hello.replaceAll("[a-zA-Z0-9]", "Bye"));
//
//        java.sql.Date[] dates[] = new java.sql.Date[2][0];
//
//
//
//        var split = hello.split(",");
//        System.out.println(Arrays.toString(split));
//
//        //        // "[a-z]"
//        //        // "[0-9]"
//        //        // "[a-zA-Z]"
//        //        // "[a-zA-Z0-9]"
//
//        System.out.println(String.format(hello, "inlocuitor", 22));
//        System.out.printf(hello, "inlocuitor", 22);

//        StringBuffer
//        StringBuilder
    }


}
