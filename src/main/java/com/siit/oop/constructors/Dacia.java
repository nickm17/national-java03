package com.siit.oop.constructors;

import lombok.ToString;

@ToString(callSuper = true)
public class Dacia extends Car {

    private boolean hasGPL;
    private boolean aaa;
    private final String sizeInstanceVarible = "SUV";

    public Dacia() {
        this(false);
//        super("Logan", 100, 175, 5);
        System.out.println("Dacia was constructed");
    }

    public Dacia(boolean hasGPL) {
        this(true, true); // super() nu mai poate fi adaugat atunci cand punem noi this()
        this.hasGPL = hasGPL;
        System.out.println("Dacia was constructed, constructor with params");
    }

    public Dacia(boolean hasGPL, boolean aaa) {
        // super() is added by the compiler
        this.hasGPL = hasGPL;
        System.out.println("Dacia was constructed, constructor with params");
    }
}
