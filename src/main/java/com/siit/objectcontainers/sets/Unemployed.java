package com.siit.objectcontainers.sets;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Unemployed extends Person {
    public Unemployed() {
    }

    public Unemployed(String name) {
        super(name);
    }
}
