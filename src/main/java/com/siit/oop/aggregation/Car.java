package com.siit.oop.aggregation;

import com.siit.oop.inheritance.Shape;

import java.io.Serializable;


// nu putem extinde mai mult de o clasa --- IS-A relationship
public class Car extends Vehicle implements Serializable, Cloneable {

    // HAS-A relationship , ne permite sa obtinem acces la metodele/behavior din alte clase
    private String name;
    private int speed;
    private Engine engine;
    private Shape shape;
    private ElectricVehicle electricVehicle;

    public void start() {
        engine.starts();
        refillTank();
        electricVehicle.chargeBattery();
        System.out.println("Car started");
    }

    public Car() {

    }

    public Car(Engine engine) {
        // obiectul din interior "has-a" POATE exista independent de obiectul ce il contine
        this.engine = engine;
    }

    public Car(String name, int speed, Engine engine, Shape shape, ElectricVehicle electricVehicle) {
        this.name = name;
        this.speed = speed;
        this.engine = engine;
        this.shape = shape;
        this.electricVehicle = electricVehicle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setElectricVehicle(ElectricVehicle electricVehicle) {
        this.electricVehicle = electricVehicle;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
