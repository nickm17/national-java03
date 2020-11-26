package com.siit.oop.javaoop2;

public class Dog extends Animal implements Domestic, MarkerInterface {

    private String raceType;
    private final int age = 6;

    protected Dog(String raceType) {
        this.raceType = raceType;
    }

    /**
     * Rules for method overriding
     *
     * 1. The method in the child class must have the same signature as the method in the parentclass.
     * 2. The method in the child class must be at least as accessible or more accessible than the
     * method in the parent class.
     * 3. The method in the child class may not throw a checked exception that is new or
     * broader than the class of any exception thrown in the parent class method.
     * 4. If the method returns a value, it must be the same or a subclass of the method in the
     * parent class, known as covariant return types.
     */
    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    public void eat2() {
        if ("beagle".equals(this.raceType)) {
            System.out.println("beagle eating");
        } else if (this.raceType != null && this.raceType.equals("ogar")) {
            System.out.println("ogar eating");
        }
    }

    @Override
    public void play() {
        System.out.println("playing with Dog");
    }

    void drink(){
        System.out.println("Dog drinking");
    }

    public void bite(){
        System.out.println("Dog biting");
    }

    protected void bark(){
        System.out.println("Dog barking");
    }

    Dog createDog(){
        System.out.println("Dog drinking");
        return new Dog("dog");
    }
}
