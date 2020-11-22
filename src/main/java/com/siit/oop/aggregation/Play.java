package com.siit.oop.aggregation;

public class Play {

    public static void main(String[] args) {
        Engine engine = new Engine(); //
        // obiectul din interior "has-a" POATE exista independent de obiectul ce il contine
        // cream mai multe obiecte de tipul Car folosind acelasi "engine", observam ca "engine" este independent si poate fi refolosit
        Car car1 = new Car(engine);
        Car car2 = new Car(engine);
        Car car3 = new Car(engine);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        car1.start();
    }
}
