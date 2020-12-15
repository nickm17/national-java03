package com.siit.objectcontainers.maps;

import lombok.ToString;

@ToString
public class Person {

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
