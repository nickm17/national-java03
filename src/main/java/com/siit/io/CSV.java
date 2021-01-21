package com.siit.io;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class CSV {
    static BufferedWriter writer;

    public static void main(String... args) throws IOException {

        File file = new File("src/main/resources/employees.csv");

        Path path = Paths.get("src/main/resources/employees.csv");

        writer = getWriterInstance();
        BufferedWriter anotherWriter = Files.newBufferedWriter(file.toPath());

        Employee employee = Employee.builder()
                                    .age(25)
                                    .firstName("Ion")
                                    .lastName("Popescu")
                                    .build();

        writeHearer(writer);
        writeEmployeeEntry(writer, employee);
        writeEmployeeEntry(writer, employee);
        writeEmployeeEntry(writer, employee);

        writer.flush();

        List<Employee> employees = Files.lines(file.toPath())
                                        .skip(1) //skip header
                                        .filter(StringUtils::isNotBlank)
                                        .map(CSV::mapLineToEmployee)
                                        .peek(System.out::println)
                                        .collect(Collectors.toList());
//        List<Employee> employees = Files.readAllLines(file.toPath())
//                                        .stream()
//                                        .skip(1) //skip header
//                                        .filter(StringUtils::isNotBlank)
//                                        .map(CSV::mapLineToEmployee)
//                                        .peek(System.out::println)
//                                        .collect(Collectors.toList());
    }

    // singleton design pattern
    private static BufferedWriter getWriterInstance() throws IOException {

        if (writer != null) {
            return writer;
        }
        return new BufferedWriter(new FileWriter(new File("src/main/resources/employees.csv")));
    }

    private static void writeHearer(BufferedWriter writer) {
        try {
            getWriterInstance().write("firstName,lastName,age");
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Exception while writing header ");
        }
    }

    private static void writeEmployeeEntry(BufferedWriter writer, Employee employee) {
        try {
            String line = employee.getFirstName() + "," + employee.getLastName() + "," + employee.getAge();
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Exception while writing employee: " + employee);
        }
    }

    private static Employee mapLineToEmployee(String line) {
        String[] fields = line.split(",");
        return Employee.builder()
                       .firstName(fields[0])
                       .lastName(fields[1])
                       .age(Integer.parseInt(fields[2].trim()))
                       .build();
    }
}
