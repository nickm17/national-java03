package com.siit.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ByteStreams {

    public static void main(String[] args) {

        double before = System.currentTimeMillis();

        String separator = File.separator;

        String urlToResources = "src" + separator + "main" + separator + "resources" + separator;
        try (InputStream in = new FileInputStream(urlToResources + "in.txt");
             OutputStream out = new FileOutputStream(urlToResources + "out.txt")
        ) {
            int val;

            while ((val = in.read()) != -1) {
                System.out.println((char)val);
                out.write(val);
            }

        } catch (FileNotFoundException e) {
            log.error(e.getMessage(), e);
        } catch (IOException e) {
            log.error("Error reading file", e);
        }

        System.out.println("Duration was: " + (System.currentTimeMillis() - before));
    }
}
