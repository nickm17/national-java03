package com.siit.objectcontainers;

public class Person implements Comparable {

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
