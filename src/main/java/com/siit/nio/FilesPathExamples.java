package com.siit.nio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Collectors;

public class FilesPathExamples {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/resources/text.txt");
        Path pathCopy = Paths.get("src/main/resources/textCopy.txt");
        Path director = Paths.get("src/main/resources");
        Path directorRoot = Paths.get("/home");


        System.out.println(path.getParent());
        System.out.println(path.isAbsolute());
        System.out.println(path.subpath(0, 1));
        System.out.println(path.toAbsolutePath());


        System.out.println(Files.exists(path));
        System.out.println(Files.copy(path, pathCopy, StandardCopyOption.REPLACE_EXISTING));
        System.out.println(Files.isDirectory(path));
        System.out.println(Files.newBufferedReader(path, Charset.forName("ASCII")));
//        System.out.println(Files.move(path, ...));

        System.out.println(Charset.availableCharsets());

//        Stream<Path> walk = Files.walk(director, 15);
        Files.walk(directorRoot, 10)
             .filter(path1 -> Files.isReadable(path))
             .filter(path1 -> Files.isWritable(path))
             .filter(path1 -> path1.toFile().isHidden())
             .forEach(System.out::println);

//        walk.filter(path1 -> !path1.toFile().isHidden())
////                .filter(pathLamba -> pathLamba.endsWith("text.txt"))
//            .forEach(System.out::println);


        List<String> allLines = Files.readAllLines(path);
        System.out.println(allLines);

        List<String> collect = Files.lines(path).filter(line -> line.length() > 12)
                                    .map(String::toUpperCase)
                                    .peek(System.out::println)
                                    .collect(Collectors.toList());

        System.out.println(collect);
    }

}
