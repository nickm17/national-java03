package com.siit.jdbc.dao;

import com.siit.jdbc.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public List<Employee> findAll() {

        try(Connection connection = getConnection()){
            String sql = "SELECT * FROM EMP";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                System.out.println(resultSet.getString("ENAME"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


        return null;
    }

    @Override
    public void insertEmployee(Employee employee) {

    }

    @Override
    public void findEmployeeByName(String name) {

    }

    @Override
    public void delete(int no) {

    }

    private Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/hr2",
                    "root",
                    "password");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
