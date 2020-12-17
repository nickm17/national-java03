package com.siit.objectcontainers.treeSet.sets;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Student extends Person {


//    public Student() {
//        super();
//    }

    public Student(String name) {
        super(name);
        //....
    }
}
