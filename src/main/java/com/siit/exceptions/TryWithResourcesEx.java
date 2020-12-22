package com.siit.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesEx {

    public static void main(String[] args) {

        try (BufferedReader r = new BufferedReader(new FileReader("/home/nicolaes/Personale/siit/national-java03/src/main/resources/text.txt"))) {
            String firstLine = r.readLine();
            System.out.println(firstLine);
        } catch (IOException e) {
            System.out.println("Cannot read first line from text.txt: " + e.getMessage());
        }
    }

}
