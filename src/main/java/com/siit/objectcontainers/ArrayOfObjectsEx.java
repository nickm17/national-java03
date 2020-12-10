package com.siit.objectcontainers;

public class ArrayOfObjectsEx {


    public static void main(String[] args) {

        Person[] persons = new Person[3];
        persons[0] = new Student();
        persons[0].setName("Studentul Ghita");

        persons[1] = new Employee();
        persons[1].setName("Angajatul Dorel");

        persons[2] = new Unemployed();
        persons[2].setName("Somerul Ludovic");

        for (Person person : persons){
            System.out.println(person.getName());
        }

    }
}
