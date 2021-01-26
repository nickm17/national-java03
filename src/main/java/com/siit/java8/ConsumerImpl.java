package com.siit.java8;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }

    void ometoda(){

    }

    public static void main(String[] args) {

    }
}
