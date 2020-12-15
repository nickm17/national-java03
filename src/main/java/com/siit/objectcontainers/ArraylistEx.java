package com.siit.objectcontainers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistEx {

    public static void main(String[] args) {
        String inputString = "ce vreti voi";

//        System.out.println(StringHomeworkUtils.reverse(inputString));
//        StringHomeworkUtils.printDuplicates("un intput pentru duplicateiiddd");


        long current = System.currentTimeMillis();
        List<Person> personArrayList = new ArrayList<>();
        List<Person> personLinkedList = new LinkedList<>();

        List<Person> immutableList = List.of(new Student(), new Student(), new Employee());
        System.out.println(immutableList.getClass());
//        immutableList.set(0, new Employee());
//        immutableList.remove(0);
//        immutableList.add(studentul_ion);

        var studentul_ion = new Student("Studentul Ion");
        personLinkedList.add(studentul_ion);
        personLinkedList.add(new Employee("Studentul Mihai"));
        personLinkedList.add(new Unemployed("Studentul Ludovic"));

        personArrayList.add(studentul_ion);
        personArrayList.add(new Employee("Studentul Mihai"));
        personArrayList.add(new Unemployed("Studentul Ludovic"));

        System.out.println(personLinkedList.get(0));
        System.out.println(((LinkedList)personLinkedList).peekFirst());

        for (Person person : personLinkedList){
            System.out.println(person.getName());
        }

        personLinkedList.forEach(p -> System.out.println(p.getName()));

        System.out.println(personLinkedList.size());
        System.out.println(personLinkedList.containsAll(personLinkedList));
        System.out.println(personLinkedList.indexOf(studentul_ion));
        System.out.println(System.currentTimeMillis() - current);

        System.out.println(personArrayList.subList(0,2));// returneaza alta lista
        System.out.println(personArrayList.size());// returneaza dimensiunea listei
        System.out.println(personArrayList.remove(studentul_ion)); // sterge un element avand chiar elementul ca argument--> equals()
        System.out.println(personArrayList.remove(1));// sterge elementul de la indexul respectiv
        System.out.println(personArrayList.isEmpty());// vefifica daca lista este goala
        personArrayList.clear();// sterge toate elementele listei
    }

}
