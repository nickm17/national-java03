package com.siit.objectcontainers.treeSet.sets;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetsEx {


    public static void main(String[] args) {

        Employee employee1 = new Employee("Dorel", 10);
        Employee.EmployeeBuilder employeeBuilder = Employee.builder();
        Employee employeeWithBuilder = employeeBuilder
                                               .name("Cu builder")
                                               .salary(1234)
                                               .build();
        String andreea = "Andreea";
        Employee employee2 = new Employee(andreea, 3500);
        Employee employee3 = new Employee("Ion", 50);
        Employee employee4 = new Employee("Tiriac" , 3500);

//        Set<Employee> personTreeSet = new TreeSet<>();
        Comparator<Employee> employeeComparator = new Comparator<>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName().length() > o2.getName().length()){
                    return 1;
                }
                if (o1.getName().length() < o2.getName().length()){
                    return -1;
                }
                return 0;
            }
        };
//        Set<Employee> personTreeSetWithComparator = new TreeSet<>(employeeComparator);\
        Comparator<Employee> employeeComparatorBySalary = Comparator.comparing(employee -> employee.getSalary());
//        Comparator<Employee> employeeComparatorByVC = Comparator.comparing(employee -> employee.getVacationDays());

//        TreeSet<Employee> personTreeSetWithComparator = new TreeSet<>(employeeComparator);
        TreeSet<Employee> personTreeSetWithComparator = new TreeSet<>(new EmployeeComparatorBySalaryAndName());


        System.out.println(personTreeSetWithComparator.add(employee1)); // returneaza true daca reuseste sa adauge
        System.out.println(personTreeSetWithComparator.add(employee2));
        System.out.println(personTreeSetWithComparator.add(employee4));
        System.out.println(personTreeSetWithComparator.add(employee3));
        System.out.println(personTreeSetWithComparator.add(employee3));

        for (Employee employee : personTreeSetWithComparator) {
            System.out.println(employee);
        }
        System.out.println("........");
        System.out.println(personTreeSetWithComparator.higher(employee3)); // > Dorel
        System.out.println(personTreeSetWithComparator.ceiling(employee3)); // >= Ion
        System.out.println(personTreeSetWithComparator.floor(employee3));  // <= Ion
        System.out.println(personTreeSetWithComparator.lower(employee3)); // < null pentru ca e primul element si nu mai e nimic mai mic
        System.out.println(personTreeSetWithComparator.first()); //
        System.out.println(personTreeSetWithComparator.last()); //

        personTreeSetWithComparator.iterator();

    }
}
