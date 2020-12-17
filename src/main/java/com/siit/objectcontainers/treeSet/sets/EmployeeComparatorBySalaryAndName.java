package com.siit.objectcontainers.treeSet.sets;

import java.util.Comparator;

public class EmployeeComparatorBySalaryAndName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        if (o1.getSalary() < o2.getSalary()){
            return 1;
        }
        if (o1.getSalary() > o2.getSalary()){
            return -1;
        }

        return o1.getName().compareTo(o2.getName());
    }
}
