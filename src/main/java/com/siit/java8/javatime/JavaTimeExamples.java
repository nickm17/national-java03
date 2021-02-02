package com.siit.java8.javatime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class JavaTimeExamples {

    public static void main(String[] args) {
//        Year.MIN_VALUE;

        System.out.println(LocalDate.of(1999 , 8 , 1));
        System.out.println(LocalDate.of(1999 , 8 , 1).getDayOfWeek());
        System.out.println(LocalDate.of(-1 , 1 , 1).getDayOfWeek());
        System.out.println(LocalDate.of(1999 , Month.AUGUST , 1));

        System.out.println(LocalTime.of(10, 10 , 30));

        System.out.println(LocalDateTime.of(1999, 8, 10 , 10 , 10));


        String localDateString = "1999-10/10";
        String localDateTimeString = "1999/10/10 11:11";

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        LocalDate parsedDate = null;
        try {
            parsedDate = LocalDate.parse(localDateString, dateFormatter);
        } catch (DateTimeParseException e){
            log.error(e.getMessage() , e);
            System.out.println("Invalid date format!!!!!!");
//            throw new ValidationExceptionExemplu();
        }

        LocalDateTime parsedDateTime = LocalDateTime.parse(localDateTimeString, dateTimeFormatter);


        System.out.println(parsedDate);
        System.out.println(parsedDateTime);


        LocalDateTime now = LocalDateTime.now();

        System.out.println(now.plus(Period.of(1, 2, 3)));
        System.out.println(now.plusDays(30));
        System.out.println(now.plusMonths(1));

        String skierTime = "10:30.99;99-88";
        String[] split = skierTime.split("[:.;-]");
        Duration x = Duration.ofMinutes(Long.parseLong(split[0])).plusSeconds(Long.parseLong(split[1]));

        LocalTime plus = LocalTime.of(0, 0).plus(x);
        LocalTime directDinString = LocalTime.of(Integer.parseInt(split[0]), Integer.parseInt(split[1]));


        System.out.println(x);

        System.out.println(plus);
        System.out.println(directDinString);
        System.out.println("plus intarziere  " + directDinString.plusMinutes(10));
        System.out.println(directDinString.plusSeconds(1));
    }

}
