package com.siit.oop.innerclasses;

import java.io.Serializable;

public class OuterClass {

    static int fieldStatic;
    int fieldNeStatic;

    // static inner class
    public static class StaticInnerMemberClass {

        public StaticInnerMemberClass() {

        }


        public String concatenateTwoStrings(String a, String b){
            // poate accesa membrii statici ai clasei exterioare
            return a + b + fieldStatic;
        }
    }


    // member inner class
    public class InnerMemberClass implements Serializable {

        public InnerMemberClass() {
        }

        public int addNumbers (int a, int b) {
            class LocalInnerClass {

            }
            // poate accesa membrii clasei exterioare
            return a + b + fieldNeStatic + fieldStatic;
        }
    }
}

class AltaClasaInFisier {

}
