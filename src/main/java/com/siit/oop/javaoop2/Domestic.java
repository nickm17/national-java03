package com.siit.oop.javaoop2;

public interface Domestic {
    public final static int CEVA = 5; // constanta
    public abstract void play();
//    void play4();

    static void staticMethodInInterface(){
        System.out.println("O methoda ce va fi apelata cu numele interfetei - incepand cu java8");
    }

    default void defaultMethodInInterface(){
        System.out.println("O methoda ce va fi apelata cu instante ale subclaselor interfetei - incepand cu java8");
    }
}
