package com.siit.objectcontainers.maps;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Person {

    private String name;
//    private final String name2;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
