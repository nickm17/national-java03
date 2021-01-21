package com.siit.nio;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerReadingFileEx {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("src/main/resources/text.txt"))) {
            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
