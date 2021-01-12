package com.siit.generics;

public class Main {

    public static void main(String[] args) {

        Pair<String, String> pairString = new OrderedPair<>("arg 1", "arg 2");
        Pair<String, Integer> pairStringInteger = new OrderedPair<>("arg 1", 1);

        new OrderedPair<>("", 789);

        String key = pairString.getKey();
        String value = pairString.getValue();


    }

}
