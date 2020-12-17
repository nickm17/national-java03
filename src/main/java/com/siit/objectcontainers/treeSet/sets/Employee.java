package com.siit.objectcontainers.treeSet.sets;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Employee implements Comparable<Employee> {

    private String name;

    private long salary;

//    private int vacationDays;

    public Employee(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }


}
