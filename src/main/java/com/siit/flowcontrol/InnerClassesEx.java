package com.siit.flowcontrol;

import com.siit.oop.innerclasses.OuterClass;
import com.siit.oop.innerclasses.OuterClass.StaticInnerMemberClass;

public class InnerClassesEx {

    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                // some code
            }
        };
        r1.run();


        StaticInnerMemberClass innerMemberClass = new StaticInnerMemberClass();
        innerMemberClass.concatenateTwoStrings("", "");

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerMemberClass innerMemberClass1 = outerClass.new InnerMemberClass();
        innerMemberClass1.addNumbers(1, 2);



    }

}
