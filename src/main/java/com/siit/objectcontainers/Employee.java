package com.siit.objectcontainers;

public class Employee extends Person implements Comparable {
    public Employee() {
    }

    public Employee(String name) {
        super(name);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
