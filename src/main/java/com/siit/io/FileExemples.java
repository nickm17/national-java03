package com.siit.io;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;

public class FileExemples {

    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/text.txt");
        File file2 = new File("src/main/resources/text2.txt");
        File director = new File("src/main/resources");
        File newFile = new File("/src/main/resources/createdWithCreateNewFile");


        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.canExecute());
        System.out.println(LocalDateTime.ofEpochSecond(file.lastModified(), 0, ZoneOffset.UTC));
        System.out.println(file.isHidden());
        System.out.println(file.renameTo(file2));

        System.out.println("............");


        System.out.println(director.exists());
        System.out.println(director.isFile());
        System.out.println(director.isDirectory());
        System.out.println(director.getAbsolutePath());
        System.out.println(director.getName());
        System.out.println(director.getParent());
        System.out.println(director.length());
        System.out.println(director.canExecute());
        System.out.println(Arrays.toString(director.listFiles()));
//        System.out.println(director.createNewFile());
        System.out.println(Arrays.toString(director.list()));


//        System.out.println(newFile.createNewFile());

    }

}
