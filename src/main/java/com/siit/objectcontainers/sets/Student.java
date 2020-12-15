package com.siit.objectcontainers.sets;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
//@AllArgsConstructor
//@NoArgsConstructor
public class Student extends Person {


    public Student() {
    }

    public Student(String name) {
        super(name);
        //....
    }
}
