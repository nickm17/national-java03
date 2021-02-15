package com.siit.jdbc.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class Employee {
    private String job;
    private String name;
    private int employeeNo;
    private int employeeManager;
    private int employeeSalary;
    private int employeeComm;
    private int employeeDepartmentNo;
    private LocalDate hireDate;
}
