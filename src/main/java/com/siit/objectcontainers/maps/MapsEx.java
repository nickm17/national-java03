package com.siit.objectcontainers.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        Set<String> keySet = personMap.keySet();
        for (String key : keySet) {
            System.out.println(personMap.get(key));

            if (key.equals("Dorel")){
                System.out.println(personMap.get(key));
            }
        }

        Collection<Person> values = personMap.values();
        System.out.println(values);


        Set<Map.Entry<String, Person>> entries = personMap.entrySet();
        for (Map.Entry<String, Person> entry : entries) {

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }

    }

}
