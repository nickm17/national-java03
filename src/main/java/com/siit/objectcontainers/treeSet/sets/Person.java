package com.siit.objectcontainers.treeSet.sets;

import java.util.Objects;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Person {

    private String name;
    private String cnp;


    public void test() {
        System.out.println(name);
    }

//    public Person() {
//    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String cnpLocalRef) {
        this.name = name;
        this.cnp = cnpLocalRef;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCnp() {
        return cnp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(cnp, person.cnp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
