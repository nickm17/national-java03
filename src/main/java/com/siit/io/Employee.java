package com.siit.io;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder // builder design pattern
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Employee {

    private int age;

    private String firstName;

    private String lastName;
}
