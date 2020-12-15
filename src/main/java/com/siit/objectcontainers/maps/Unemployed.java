package com.siit.objectcontainers.maps;

import lombok.ToString;

@ToString(callSuper = true)
public class Unemployed extends Person {
    public Unemployed() {
    }

    public Unemployed(String name) {
        super(name);
    }
}
