package com.siit.oop.javaoop2;

public class PlayWithAnimals {


    public static void main(String[] args) {

        Animal [] animals = new Animal[10];
        animals[0] = new Beagle();
        animals[0] = new Beagle();
        animals[0] = new Lion();
        animals[0] = new Dolphin();

        for(Animal animal : animals) {
            animal.eat();
        }

        Cat cat = new Cat();
        cat.defaultMethodInInterface();
        Domestic.staticMethodInInterface();



        Dog dogReference = new Beagle();
        Animal animalDogReference = dogReference; // cast automat, compilatorul stie ca Animal e superclasa


        dogReference.createDog();
        Beagle beagle = (Beagle) dogReference; // down-casting - aici trebuie sa facem cast explicit
        beagle.createDog(1);

        Domestic domesticReference = new Beagle();

        domesticReference.play();

        Dog dog = new Beagle();
        Beagle beagle1 = new Beagle();
        beagle1.doarInBeagle();
        dog.bark();
        dog.breath();
        dog.bite();

        Animal animal = dog;
        animal.breath();
        animal.eat();

        System.out.println(dog instanceof Domestic);
        System.out.println(dog instanceof MarkerInterface);

        Animal lion = new Lion();
        doSomethingAnimal(beagle);
        doSomethingAnimal(lion);
        doSomethingAnimal(dog);
        doSomethingDomestic(beagle);
//        doSomethingDomestic(lion); bad, trebuie sa fie de tipul parametrului sau orice subtip
    }


    // metoda poate primi orice subtip al lui Domestic
    public static void doSomethingDomestic (Domestic domestic) {

    }

    // metoda poate primi orice subtip al lui Animal
    public static void doSomethingAnimal (Animal animal) {

    }
}
