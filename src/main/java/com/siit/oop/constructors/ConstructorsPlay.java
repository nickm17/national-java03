package com.siit.oop.constructors;

public class ConstructorsPlay {


    public static void main(String[] args) {

        Car carReferenceDefaultFieldValues = new Car();
        Car carReferenceExplicitInitialFieldValues = new Car("Buggie", 250, 200, 5);

        System.out.println(carReferenceDefaultFieldValues);
        System.out.println(carReferenceExplicitInitialFieldValues);


        Dacia logan = new Dacia();
        Dacia loganWithGPL = new Dacia(true);
        System.out.println(logan.getNameInstanceVariable());
        System.out.println(logan.getNumberOfWheels());
        System.out.println(logan.getNumberOfHorsePowerInstanceVariable());
        System.out.println(loganWithGPL);



        // GC

        Dacia dacia1310 = new Dacia(); // devine eligibil pentru stergere la linia 28 cand se pierde singura referinta catre el
        Dacia dacia1410 = new Dacia();
        dacia1310 = null; // din acest moment obiect referentiat de dacia1310 este eligibil pentru colectare
        dacia1310 = dacia1410; // similar
        dacia1410 = null;
        dacia1310 = null;
    }
}
