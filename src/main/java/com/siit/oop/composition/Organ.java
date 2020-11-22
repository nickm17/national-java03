package com.siit.oop.composition;

public class Organ {

    int beats;
    int bloodPressure;

    public Organ(int beats, int bloodPressure) {
        this.beats = beats;
        this.bloodPressure = bloodPressure;
    }

    @Override
    public String toString() {
        return "Organ{" +
                "beats=" + beats +
                ", bloodPressure=" + bloodPressure +
                '}';
    }
}
