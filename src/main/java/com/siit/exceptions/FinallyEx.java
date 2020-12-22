package com.siit.exceptions;

import lombok.SneakyThrows;

public class FinallyEx {

    public static void main(String[] args) {
        try{
            System.out.println("Beginning of try");
            extracted();
            //return;
//            System.out.println("End of try");
        }catch(RuntimeException e){
            System.out.println("Inside catch");
        }finally {
            System.out.println("Inside finally");
        }

    }

    @SneakyThrows(Exception.class)
    private static void extracted(){
        throw new Exception();
    }
}
