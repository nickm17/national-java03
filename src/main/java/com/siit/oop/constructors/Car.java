package com.siit.oop.constructors;

import lombok.ToString;

@ToString
public class Car {

    private static final int classVariable = 10;
    private String nameInstanceVariable;
    private int speedInstanceVariable;
    private int numberOfHorsePowerInstanceVariable;
    private final int numberOfWheels; // nu se mai modifica, i se poate atribui valoare intr-un singur loc per initializare

    public Car() {
        // pe prima linie putem avea this() sau super()
        // daca nu avem nimic explicit adaugat , compilatorul va adauga super() - fara parametrii
        this.numberOfWheels = 3;
        System.out.println("Car was constructed, default constructor");
    }

    public Car(String nameInstanceVariable, int numberOfHorsePowerInstanceVariable, int numberOfWheels) {
        this.nameInstanceVariable = nameInstanceVariable;
        this.numberOfHorsePowerInstanceVariable = numberOfHorsePowerInstanceVariable;
        this.numberOfWheels = numberOfWheels;
    }

    public Car(String nameMethodParameter, int speedParam, int numberOfHorsePowerParam, int numberOfWheels) {
        super(); // e pus implicit de compilator
        this.nameInstanceVariable = nameMethodParameter;
        this.speedInstanceVariable = speedParam;
        this.numberOfHorsePowerInstanceVariable = numberOfHorsePowerParam;
        this.numberOfWheels = numberOfWheels;
        System.out.println("Car was constructed, constructor with all params");
    }

//    public void setNumberOfWheels(int numberOfWheelsParam) {
//        this.numberOfWheels = numberOfWheelsParam;
//    }

    public void setNameInstanceVariable(String nameInstanceVariable) {
        this.nameInstanceVariable = nameInstanceVariable;
    }

    public void setSpeedInstanceVariable(int speedInstanceVariable) {
        this.speedInstanceVariable = speedInstanceVariable;
    }

    public void setNumberOfHorsePowerInstanceVariable(int numberOfHorsePowerInstanceVariable) {
        this.numberOfHorsePowerInstanceVariable = numberOfHorsePowerInstanceVariable;
    }

    public String getNameInstanceVariable() {
        return nameInstanceVariable;
    }

    public int getSpeedInstanceVariable() {
        return speedInstanceVariable;
    }

    public int getNumberOfHorsePowerInstanceVariable() {
        return numberOfHorsePowerInstanceVariable;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "nameInstanceVariable='" + nameInstanceVariable + '\'' +
//                ", speedInstanceVariable=" + speedInstanceVariable +
//                ", numberOfHorsePowerInstanceVariable=" + numberOfHorsePowerInstanceVariable +
//                ", numberOfWheels=" + numberOfWheels +
//                '}';
//    }
}
