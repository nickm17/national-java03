package com.siit.oop;

public class TransportSystem {

    public static void main(String[] args) {

        Car car = new Car();
//        System.out.println(car.color);
//        car.color = "red"; // bad , use encapsulation
//        System.out.println(car.color);
//
        System.out.println(car.getColor());
        car.setColor("red");
        System.out.println(car.getColor());

        Car car2 = new Car("green", "buggy", 200);
        System.out.println(car2.getColor());

        Audi audi = new Audi();
        audi.accelerate();
    }

}
