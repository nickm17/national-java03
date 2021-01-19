package com.siit.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInReader {


    public static void main(String[] args) throws IOException {
        //Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        System.out.println("Enter something:");
        String name = reader.readLine();

        // Printing the line
        System.out.println(name);
    }

}
