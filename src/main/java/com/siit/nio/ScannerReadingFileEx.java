package com.siit.nio;

import com.siit.io.Employee;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ScannerReadingFileEx {

    public static void main(String[] args) {
        Path source = Paths.get(System.getProperty("user.dir"), "src", "main", "resources", "text.txt");
        try (Scanner scanner = new Scanner(source)) {
            System.out.println(System.getProperty("user.dir"));

            new ScannerReadingFileEx().logicaCitireEmployee(scanner);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            log.error("", e);
        }
    }

    public String logicaCitireEmployee(Scanner scanner) {
        // we read the file until all lines have been read
        while (scanner.hasNextLine()) {
            // we read one line
            String row = scanner.nextLine();
            // we print the line that we read
            System.out.println(row);
            return row;
        }
        return "";
    }

    public Employee mapLineToEmployee(String line) {
        String[] fields = line.split(",");
        return Employee.builder()
                       .firstName(fields[0])
                       .lastName(fields[1])
                       .age(Integer.parseInt(fields[2].trim()))
                       .build();
    }

    public List<Employee> mapLinesToEmployees(List<String> lines) {
        List<Employee> employees = new ArrayList<>();

        lines.forEach(line -> {
            String[] fields = line.split(",");
            employees.add(Employee.builder()
                                  .firstName(fields[0])
                                  .lastName(fields[1])
                                  .age(Integer.parseInt(fields[2].trim()))
                                  .build());

        });

        return employees;
    }

}
