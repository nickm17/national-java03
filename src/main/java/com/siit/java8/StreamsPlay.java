package com.siit.java8;

import com.siit.oop.inheritance.Circle;
import com.siit.oop.inheritance.Rectangle;
import com.siit.oop.inheritance.Shape;
import com.siit.oop.inheritance.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPlay {

    public static void main(String[] args) {

        List<Shape> shapes = Arrays.asList(new Triangle(), new Circle(), new Rectangle());
        Stream<Shape> shapeStream = Stream.of(new Triangle(), new Circle(), new Rectangle());

        String collect = shapeStream.filter(shape -> Objects.nonNull(shape)) // Stream<Shape>
                                    .map(shape -> shape.getColor()) // Stream<String>
                                    .collect(Collectors.joining(" / "));
//                                    .collect(Collectors.toCollection(TreeSet::new));

        TreeSet<String> stringTreeSet = shapes.stream().filter(shape -> Objects.nonNull(shape)) // Stream<Shape>
                                              .map(shape -> shape.getColor()) // Stream<String>
//                                    .collect(Collectors.joining(" / "));
                                              .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(collect);

        System.out.println(stringTreeSet);


        List<String> list = new ArrayList<>();
        list.add("Lajos");
        list.add("Bogdan");
        list.add("Roland");
        Stream<String> stream = list.stream();
        list.add("Lajos");
        list.add("Lajos");
        list.add("Lajos");
        list.add("Lajos");

        long count = stream.count();
        System.out.println(count);

        list.stream()
            .distinct()
            .forEachOrdered(s -> System.out.println(s));

        Optional<String> any = list.stream()
                                   .map(s -> {
                                       System.out.println(s);
                                       System.out.println(s);
                                       System.out.println(s);
                                       System.out.println(s);
                                       System.out.println(s);
                                       System.out.println(s);
                                       System.out.println(s);
                                       System.out.println(s);
                                       System.out.println(s);
                                       System.out.println(s);
                                       System.out.println(s);
                                       System.out.println(s);
                                       return s + " best Java developer";
                                   })
                                   .peek(s -> System.out.println(s))
                                   .findAny();
        if (any.isPresent()) {
            System.out.println(any.get());
        }

        boolean b = list.stream()
                        .map(s -> apply(s))
                        .peek(s -> System.out.println(s))
                        .allMatch(s -> s.length() > 0);

    }

    private static String apply(String s) {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        return s + " best Java developer";
    }

}


