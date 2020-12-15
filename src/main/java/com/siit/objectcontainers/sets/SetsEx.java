package com.siit.objectcontainers.sets;

import java.util.HashSet;
import java.util.Set;

public class SetsEx {


    public static void main(String[] args) {

        Person employee1 = new Employee("Dorel", "1934545454545454545");
        Person employee1Prim = employee1;
        Person employee2 = new Employee("Dorel", "1934545454545454545");
        Person somer = new Unemployed("Dorel somer");
        Person student = new Student("Dorel student");

        Set<Person> personHashSet = new HashSet<>();
//        Set<Person> personLinkedHashSet = new LinkedHashSet<>();

        // set foloseste hasCode() si equals() pentru a determina daca obiectul de adaugat exista deja sau nu
        System.out.println(personHashSet.add(employee1)); // returneaza true daca reuseste sa adauge
        System.out.println(personHashSet.add(employee1Prim));
        System.out.println(personHashSet.add(employee2));
        System.out.println(personHashSet.add(null));
        System.out.println(personHashSet.add(null)); // permite un singur null
        personHashSet.add(somer);
        personHashSet.add(somer);
        personHashSet.add(student);

//        Set.of();

        for(Person person : personHashSet) {
            System.out.println(person);
//            person.test();
        }

        System.out.println(employee1.equals(employee2));

    }
}
