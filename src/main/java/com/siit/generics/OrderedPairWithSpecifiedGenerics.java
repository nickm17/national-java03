package com.siit.generics;


import com.siit.oop.Car;


//daca suntem utilizatorul final, ne specificam tipuri concrete date in locul genericelor
// iar genericele vor fi inlocuite peste tot de aceste tipuri concrete
public class OrderedPairWithSpecifiedGenerics implements Pair<String, Car> {
    private String key;
    private Car value;

    public OrderedPairWithSpecifiedGenerics() {

    }

    public OrderedPairWithSpecifiedGenerics(String key, Car value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public Car getValue() {
        return value;
    }

    public static void main(String[] args) {
        new OrderedPair<String, Car>("", new Car());
        new OrderedPairWithSpecifiedGenerics();
    }
}
