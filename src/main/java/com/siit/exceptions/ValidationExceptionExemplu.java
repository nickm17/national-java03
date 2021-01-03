package com.siit.exceptions;

public class ValidationExceptionExemplu {


    public static void main(String[] args) {

        Employee employee = new Employee();
        System.out.println("in main inainte de set");

        employee.setAge(1);
        employee.setAge(1);
        employee.setAge(1);
        employee.setAge(1);
        employee.setAge(1);
        employee.setAge(2);
        employee.setAge(1);

        System.out.println("in main dupa set");

    }

}

class Employee {

    private int age;

    public void setAge(int age) {
        if (age < 0){
            throw new CustomRuntimeException("age < 0");
        }
        this.age = age;
    }
}