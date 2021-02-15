package com.siit.jdbc;

import com.siit.jdbc.dao.EmployeeDAO;
import com.siit.jdbc.dao.EmployeeDAOImpl;

public class JdbcMain {

    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        employeeDAO.findAll();

    }

}
