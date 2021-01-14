package com.siit.enums;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

import static com.siit.enums.Season.AUTUMN;
import static com.siit.enums.Season.SPRING;
import static com.siit.enums.Season.SUMMER;
import static com.siit.enums.Season.WINTER;

public enum Season {
    SUMMER(36),
    AUTUMN(20),
    WINTER(0),
    SPRING(15);

    private final int average;

    Season(int i) {
        average = i;
    }

    public int getAverage() {
        return average;
    }
}


class Play {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a season to get the average temperature! ");
        Season season = Season.valueOf(scanner.next().toUpperCase());

        //   https://stackoverflow.com/questions/13387742/compare-two-objects-with-equals-and-operator

        //  https://www.infoworld.com/article/3305792/comparing-java-objects-with-equals-and-hashcode.html

        Season a2aReferintaCatreSPRING = Season.valueOf("SPRING");
        System.out.println(a2aReferintaCatreSPRING.toString());
        Season spring = SPRING;
        System.out.println(a2aReferintaCatreSPRING == spring); // true
        System.out.println(a2aReferintaCatreSPRING.equals(SPRING)); // true

        switch (season) {
            case AUTUMN:
                System.out.println("Fall avg = " + AUTUMN.getAverage());
                break;
            case SPRING:
                System.out.println("Spring avg = " + SPRING.getAverage());
                break;
            case SUMMER:
                System.out.println("Summer avg = " + SUMMER.getAverage());
                break;
            case WINTER:
                System.out.println("Winter avg = " + WINTER.getAverage());
                break;
        }


        Employee employee = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = employee;
        System.out.println(employee == employee3); // true

        LocalDate localDate = LocalDate.of(1999, Month.JANUARY, 1);
        Month month = localDate.getMonth();
    }

}
