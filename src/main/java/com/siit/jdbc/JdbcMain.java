package com.siit.jdbc;

import com.siit.jdbc.dao.EmployeeDAO;
import com.siit.jdbc.dao.EmployeeDAOImpl;
import com.siit.jdbc.model.Employee;

public class JdbcMain {

    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        employeeDAO.findAll().forEach(System.out::println);

        System.out.println("___________________________");

        employeeDAO.findEmployeeByNameContaining("%K%");

        Employee employee = Employee.builder()
                                    .job("job")
                                    .name("name")
                                    .employeeNo(1111)
                                    .employeeManager(2222)
                                    .build();

        employeeDAO.insertEmployee(employee);

        employeeDAO.delete(employee.getEmployeeNo());

        new EmployeeDAOImpl().findEmployeeNumber();
    }

}
