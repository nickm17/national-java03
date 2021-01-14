package com.siit.enums;

import java.util.Arrays;

import static com.siit.enums.Gender.FEMALE;
import static com.siit.enums.Gender.valueOf;
import static java.lang.System.out;

public class EnumsPlay {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setGender(FEMALE);
        employee.setGender(valueOf("MALE"));// stringul furnizat trebuie sa aiba acelasi case ca si in enum
//        employee.setGender(Gender.valueOf("male"));

        Gender[] values = Gender.values();
        Arrays.asList(values).forEach( gender -> {
            out.println(gender instanceof Enum);//true
            out.println(gender instanceof Object);//true
            out.println(gender.name() + ": index : " + gender.ordinal());
        });


    }

}
