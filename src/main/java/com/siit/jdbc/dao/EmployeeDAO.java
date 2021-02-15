package com.siit.jdbc.dao;

import com.siit.jdbc.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    void insertEmployee(Employee employee);
    Employee findEmployeeByNameContaining(String name);
    void delete(int no);

}
