package com.siit.exceptions;

public class ExceptionInInitializerErrorExamples {

    private static int age = 5;
    private int age2 = 3;

    static {
        System.out.println("in static block");
        if(age == 5) {
//            throw new CustomRuntimeException("in static initializer");
        }
    }

    {
        System.out.println("in ne static block");
        if (age2 == 3){
//            throw new CustomRuntimeException("in instance initializer/ ne-static");
        }
    }

}
