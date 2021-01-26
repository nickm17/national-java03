package com.siit.java8;

import com.siit.oop.Car;

import java.util.function.Predicate;

public class ExemplePredicate {


    public static void main(String[] args) {

        Predicate<Car> predicate = (Car c) -> c.getName().equals("mercedes");

        oMetodaCarePrimesteUnPredicate(predicate);
        oMetodaCarePrimesteUnPredicate(car -> car.isFast());
        oMetodaCarePrimesteUnPredicate(Car::isFast);
        oMetodaCarePrimesteUnPredicate(car -> car.getColor().equals(""));

    }

    public static void oMetodaCarePrimesteUnPredicate(Predicate<Car> predicate){

    }

}
