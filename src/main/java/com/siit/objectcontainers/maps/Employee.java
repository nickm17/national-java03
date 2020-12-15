package com.siit.objectcontainers.maps;

import lombok.ToString;

@ToString(callSuper = true)
public class Employee extends Person {
    public Employee() {
    }

    public Employee(String name) {
        super(name);
    }
}
