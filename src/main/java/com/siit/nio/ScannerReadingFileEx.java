package com.siit.nio;

import com.siit.io.Employee;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ScannerReadingFileEx {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get(System.getProperty("user.dir"),"src", "main", "resources", "text.txt"))) {
            System.out.println(System.getProperty("user.dir"));

            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            log.error("", e);
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
