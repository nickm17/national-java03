package com.siit.oop.javaoop2;

public abstract class Animal {//implements Test {


    public Animal() { // putem avea constructor intr-o clasa abstracta, dar nu o putem instantia
        System.out.println("animal");
    }

    public void breath() {
        System.out.println("Animal breathing");
    }

    public abstract void eat();

}
