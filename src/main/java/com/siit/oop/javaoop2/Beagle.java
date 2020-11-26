package com.siit.oop.javaoop2;

public class Beagle extends Dog {


    public Beagle() {
        super("beagle");
    }

    @Override
    public void bark(){
//        new Dog().drink();
//        new Dog().bark();
//        super.bark();
        System.out.println("Beagle barking");
//        new Dog().bite();
    }

//    @Override
    Beagle createDog(int i) { // overloading atunci cand sunt diferente in lista de parametrii
//        return super.createDog();
        return new Beagle();
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
    Dog createDog() {
//        return super.createDog();
        return new Beagle();
    }
}
