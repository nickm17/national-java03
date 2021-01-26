package com.siit.oop;

public class Car {

    private String color;

    private boolean fast;

    private String name;

    private int speed;

    public Car() {

    }

    public Car(String color, String name, int speed) {
        this.color = color;
        this.name = name;
        this.speed = speed;
    }

    public void accelerate(){

    }

    public void start() {

    }

    public void stop() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (null == color || color.equals("red")) {
            return;
        }
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isFast() {
        return fast;
    }

    public boolean isFast(Car c) {
        return fast;
    }

    public void setFast(boolean fast) {
        this.fast = fast;
    }
}
