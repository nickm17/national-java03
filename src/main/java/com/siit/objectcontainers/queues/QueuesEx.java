package com.siit.objectcontainers.queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class QueuesEx {

    public static void main(String[] args) {

        Deque<Employee> employeeQueue = new LinkedList<>();
        Queue<Employee> arrayDeque = new ArrayDeque<>();

        Employee employee1 = new Employee("Dorel", 12, 222222232);
        Employee employee2 = new Employee("Dorel", 12, 222222232);
        Employee employee3 = new Employee("Stefan", 12, 222222232);

//        System.out.println(employee1.equals(employee2));
//        System.out.println(employee1.equals(employee3));


        employeeQueue.add(employee1);
        employeeQueue.offer(employee1);

        arrayDeque.add(employee1);// adauga in coada

        arrayDeque.offer(employee3);// adauga la coada listei

        arrayDeque.forEach(System.out::println);
        System.out.println("Before peek:    ");

        System.out.println(arrayDeque.peek()); // nu sterge, doar il afiseaza
        System.out.println(arrayDeque.element()); // nu sterge, arunca exceptie daca e goala

        System.out.println(arrayDeque.poll()); // // Returneaza si sterge urmatorul element din coada, null daca e empty
        System.out.println(arrayDeque.remove()); // Returneaza si sterge urmatorul element din coada, NoSuchElementException daca e empty


        for (Employee employee : arrayDeque) {
            System.out.println(employee);
        }
    }

}


@AllArgsConstructor
@NoArgsConstructor
@ToString
class Employee {
    private String nameIntanceVariable;
    private int age;
    private int salary;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age
                && salary == employee.salary
                && nameIntanceVariable.equals(employee.nameIntanceVariable);
    }

    @Override
    public int hashCode() {
        return age + salary * 13;
    }
}
