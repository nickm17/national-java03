package com.siit.oop.inheritance;

public class Shape extends AbstractShape {

    private String color;

    public Shape() {
        this.color = "Culoare intiala";
    }

    public void draw() {
        System.out.println("Shape drawing");
    }

    public void draw3() {
        System.out.println("Circle drawing3");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
