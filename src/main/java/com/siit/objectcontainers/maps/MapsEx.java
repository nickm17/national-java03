package com.siit.objectcontainers.maps;

import java.util.HashMap;
import java.util.Map;

public class MapsEx {

    public static void main(String[] args) {

        Map<String, Person> personMap = new HashMap<>();
        personMap.put("Dorel", new Employee("Angajat"));
        System.out.println(personMap.get("Dorel"));

        personMap.put("Dorel", new Unemployed("Somer"));

        System.out.println(personMap.get("Dorel"));

        System.out.println(personMap.size());

        System.out.println(personMap.putIfAbsent("Dorel", new Employee()));

        personMap.forEach((k, v) -> System.out.println(k + "= " + v.toString()));

    }

}
