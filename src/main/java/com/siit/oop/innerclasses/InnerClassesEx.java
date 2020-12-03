package com.siit.oop.innerclasses;

public class InnerClassesEx {

    public static void main(String[] args) {

        // anonymous inner class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                // some code
            }
        };
        r1.run();


        OuterClass.StaticInnerMemberClass innerMemberClass = new OuterClass.StaticInnerMemberClass();
        innerMemberClass.concatenateTwoStrings("", "");
    }

}
