package com.siit.jdbc.dao;

import com.siit.jdbc.model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        String sql = "SELECT * FROM EMP";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            connection.setAutoCommit(false);
            // inserturi care depind unele de altele

//            Statement statement = connection.createStatement();
//            statement.executeUpdate(sql);
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Employee employee = Employee.builder()
                                            .employeeNo(resultSet.getInt("EMPNO"))
                                            .employeeSalary(resultSet.getInt("SAL"))
                                            .name(resultSet.getString("ENAME"))
                                            .job(resultSet.getString("JOB"))
                                            .build();
                employeeList.add(employee);
            }

            try {
                connection.commit();
            } catch (SQLException e){
                connection.rollback();
            }
        } catch (SQLException ex) {

            log.error(ex);
        }

        return employeeList;
    }

    @Override
    public void insertEmployee(Employee employee) {
        try (Connection connection = getConnection()) {
            String sql = "INSERT INTO EMP (EMPNO, ENAME, JOB, MGR) VALUES\n" +
                    "(?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, employee.getEmployeeNo());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3, employee.getJob());
            preparedStatement.setInt(4, employee.getEmployeeManager());


            int affectedRows = preparedStatement.executeUpdate();

//            boolean isREsultSet =  preparedStatement.execute();
//            if (isREsultSet){
//                preparedStatement.getResultSet();
//            } else {
////                preparedStatement.
//            }

            System.out.println(affectedRows);

        } catch (SQLException ex) {
            log.error(ex);
        }
    }

    @Override
    public Employee findEmployeeByNameContaining(String expresie) {
        try (Connection connection = getConnection()) {
            String sql = "SELECT EMPNO, SAL, ENAME, JOB FROM EMP e WHERE e.ENAME LIKE ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, expresie);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(Employee.builder()
                                           .employeeNo(resultSet.getInt("EMPNO"))
                                           .employeeSalary(resultSet.getInt("SAL"))
                                           .name(resultSet.getString("ENAME"))
                                           .job(resultSet.getString("JOB"))
                                           .build());
            }
        } catch (SQLException ex) {
            log.error(ex);
        }
        return null;
    }

    public Employee findEmployeeNumber() {
        try (Connection connection = getConnection()) {
            String sql = "SELECT COUNT(*) as allEmpNr FROM EMP";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getInt("allEmpNr"));

            }
        } catch (SQLException ex) {
            log.error(ex);
        }
        return null;
    }

    @Override
    public void delete(int no) {
        try (Connection connection = getConnection()) {
            String sql = "DELETE FROM EMP WHERE EMPNO = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, no);

            int affectedRows = preparedStatement.executeUpdate();

            System.out.println(affectedRows);

        } catch (SQLException ex) {
            log.error(ex);
        }
    }

    private Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/hr2",
                    "root",
                    "password");

        } catch (SQLException e) {
            log.error(e);
        }
        return null;
    }
}
