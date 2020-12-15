package com.siit.objectcontainers.sets;

import java.util.Objects;

import lombok.ToString;

@ToString(callSuper = true)
//@EqualsAndHashCode(callSuper = true)
public class Employee extends Person {

    private long salary;

    private int vacationDays;

    @Override
    public void test() {
        super.test();
        System.out.println(salary);
        System.out.println(vacationDays);
    }

    public Employee() {
    }

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, String cnp) {
        super(name, cnp);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || !(o instanceof Employee)) return false;
//        if (!super.equals(o)) return false;
//        Employee employee = (Employee) o;
//        return salary == employee.salary &&
//                vacationDays == employee.vacationDays;
//    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
        if (o == null || !(o instanceof Employee)) return false;
//        if (!super.equals(o)) return false;
        // 2 angajati sunt egali daca au acelasi cnp
        return this.getCnp().equals(((Employee)o).getCnp());

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, vacationDays);
    }
}
