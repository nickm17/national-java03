package com.siit.jdbc.dao;

import com.siit.jdbc.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    void insertEmployee(Employee employee);
    void findEmployeeByName(String name);
    void delete(int no);

}
