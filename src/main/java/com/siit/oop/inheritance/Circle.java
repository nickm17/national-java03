package com.siit.oop.inheritance;

public class Circle extends Shape {

    // clasa copil poate modifica comportamentul unei metode mostenite de la parinte = method overriding
    @Override
    public void draw() {
        System.out.println("Circle drawing");
        this.draw2();
        draw2();
        this.draw3();
        draw3();
    }

    public void draw2() {
        System.out.println("Circle drawing2");
    }
}
