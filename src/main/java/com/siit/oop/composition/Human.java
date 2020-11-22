package com.siit.oop.composition;

public class Human {

    private Organ inima;

    public Human() {
        // obiectul din interior "has-a" nu poate exista independent de obiectul ce il contine
        this.inima = new Organ(85, 126); // Containment: strong composition; inner object is destroyed when outer object is destroyed
    }

    public Organ getHeart() {
        return inima;
    }



    @Override
    public String toString() {
        return "Human{" +
                "organ=" + inima +
                '}';
    }
}
