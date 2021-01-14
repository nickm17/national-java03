package com.siit.enums;

import lombok.Data;

@Data
@CustomAnnotation
public class Employee {
    enum Season { // enum poate fi si in interiorul unei clase
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


    private String name;
    private Gender gender;

}
