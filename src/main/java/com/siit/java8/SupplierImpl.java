package com.siit.java8;

import com.siit.oop.Car;

import java.util.function.Supplier;

public class SupplierImpl implements Supplier<Car> {

    @Override
    public Car get() {
        return new Car();
    }
}
