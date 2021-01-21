package com.siit.io;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class JsonExamples {

    public static void main(String[] args) throws IOException {
        List<Employee> employees = new ArrayList<>();
        Employee employee = Employee.builder()
                                    .age(25)
                                    .firstName("Ion")
                                    .lastName("Popescu")
                                    .build();

        employees.add(employee);
        employees.add(employee);
        employees.add(employee);

        File oneEmployeeFile = new File("src/main/resources/oneEmployeeFile.json");
        File employeeListFile = new File("src/main/resources/employeeListFile.json");

        Gson gson = new Gson();
        Writer writerOne = new FileWriter(oneEmployeeFile);
        String employeeJson = gson.toJson(employee);
        writerOne.write(employeeJson);
//        gson.toJson(employee, writerOne);
        writerOne.flush();

        if (oneEmployeeFile.exists()){

        }

        String employeesJSON = gson.toJson(employees);
        System.out.println(employeesJSON);
        Writer writerMany = new FileWriter(employeeListFile);
        gson.toJson(employees, writerMany);
        writerMany.flush();


        Reader reader = new FileReader(oneEmployeeFile);
        Reader reader2 = new FileReader(employeeListFile);
        System.out.println(employee);
        System.out.println(employeeJson);

        List list = gson.fromJson(reader2, List.class);
        System.out.println("After reading back:  " + list);
//        Employee employee1 = gson.fromJson(reader, Employee.class);
        Somer somer = gson.fromJson(reader, Somer.class);
        System.out.println("After reading back:  " + somer);

    }
}
