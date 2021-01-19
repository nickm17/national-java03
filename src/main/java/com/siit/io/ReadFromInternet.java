package com.siit.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ReadFromInternet {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://www.google.com/");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/google.html", true))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
            }
        }
    }

}
