package com.siit.objectcontainers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistEx {

    public static void main(String[] args) {

        long current = System.currentTimeMillis();
        List<Person> personArrayList = new ArrayList<>();
        List<Person> personLinkedList = new LinkedList<>();

        List<Person> immutableList = List.of(new Student());
        var studentul_ion = new Student("Studentul Ion");
//        immutableList.add(studentul_ion);
        personLinkedList.add(studentul_ion);
        personLinkedList.add(new Employee("Studentul Mihai"));
        personLinkedList.add(new Unemployed("Studentul Ludovic"));

        for (Person person : personLinkedList){
            System.out.println(person.getName());
        }

        personLinkedList.forEach(p -> System.out.println(p.getName()));

        System.out.println(personLinkedList.size());
        System.out.println(personLinkedList.containsAll(personLinkedList));
        System.out.println(personLinkedList.indexOf(studentul_ion));
        System.out.println(System.currentTimeMillis() - current);
    }

}
