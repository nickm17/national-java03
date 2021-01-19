package com.siit.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BufferedStreams {

    public static void main(String[] args) {

        double before = System.currentTimeMillis();

        System.out.println(System.getProperty("user.dir")); // current directory
        String separator = File.separator; // separator specific sistemului

        String urlToResources = "src" + separator + "main" + separator + "resources" + separator;
        try (InputStream in = new BufferedInputStream(new FileInputStream(new File(urlToResources + "in.txt")));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(urlToResources + "outBuffer.txt"))
        ) {
            int val;

            byte[] buffer = new byte[4000];

            while ((val = in.read(buffer)) != -1) {
                System.out.println(val);
                out.write(buffer, 0, val);
            }

        } catch (FileNotFoundException e) {
            log.error(e.getMessage(), e);
        } catch (IOException e) {
            log.error("Error reading file", e);
        }

        System.out.println("Duration was: " + (System.currentTimeMillis() - before));
    }
}
