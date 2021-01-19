package com.siit.io;

import java.io.Console;
import java.io.IOException;

public class ConsoleReader {

    public static void main(String[] args) throws IOException {
        // Using Console to input data from user
        Console console = System.console();

        if (console != null) {
            String name = console.readLine();
//        // Printing the read line
            System.out.println(name);
        }
    }

}
