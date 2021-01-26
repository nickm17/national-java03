package com.siit.java8;

import com.siit.oop.Car;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ExempleSupplier {


    public static void main(String[] args) {

        Supplier<Car> supplier = () -> new Car();
        Consumer<Car> carConsumer = (c) -> System.out.println(c);

        Supplier<Car> supplierImpl = new SupplierImpl();


        oMetodaCarePrimesteUnSupplier(() -> new Car());
        oMetodaCarePrimesteUnSupplier(new SupplierImpl());

    }

    public static void oMetodaCarePrimesteUnSupplier(Supplier<Car> supplier){

    }

}
