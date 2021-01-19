package com.siit.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CharacterReaderWriter {

    public static void main(String[] args) throws IOException {
        String separator = File.separator; // separator specific OS

        String urlToResources = "src" + separator + "main" + separator + "resources" + separator;
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try { // old
            reader = new BufferedReader(new FileReader(urlToResources + "in.txt"));
            writer = new BufferedWriter(new FileWriter(urlToResources + "outWriter.txt"));

            String line;
            reader.lines().forEach(s -> System.out.println(s));

            while((line = reader.readLine()) != null){
                System.out.println(line);
                writer.write(line);
                writer.newLine();
            }

        } catch (FileNotFoundException e) {
            log.error("The file was not found", e);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        } finally {
            if (reader != null)
            reader.close();
            writer.close();
        }

    }

}
