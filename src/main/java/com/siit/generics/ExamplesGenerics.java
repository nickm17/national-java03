package com.siit.generics;

import com.siit.oop.Car;

import java.util.ArrayList;
import java.util.List;

public class ExamplesGenerics {

    public static void main(String[] args) {


        Box<Integer> integerBox = new Box<Integer>();
        Box<? extends Number> numberBox = new Box<Double>();
        Box<? super Integer> numberBoxSuper = new Box<Number>();
        Box<?> numberBoxUnbounded = new Box<>();
        Box<Object> numberBoxObject = new Box<>();


        //nu e reutilizabil, ar trebui scrisa o clasa noua daca vrem sa avem alt obiect in loc de Car
        GarajCar garajCar = new GarajCar();
        garajCar.set(new Car());
        //   echivalent cu ce e mai sus , dar Box poate fi instantiata cu orice obiect/type in generica, clasa Box este scrisa o singura data
        Box<Car> carBox = new Box<>();
        carBox.set(new Car());


        Car car = carBox.get();

        new ExamplesGenerics().printBoxContent(numberBoxObject);
        new ExamplesGenerics().printBoxContent(numberBox);
        new ExamplesGenerics().printBoxContent(numberBoxSuper);
        new ExamplesGenerics().printBoxContent(numberBoxObject);
        new ExamplesGenerics().printBoxContentObject(numberBoxObject);
//        new ExamplesGenerics().printBoxContentObject(numberBoxUnbounded);

        Number number = numberBox.get();

        numberBoxSuper.set(333);
        Object x = numberBoxSuper.get();
        System.out.println(x);

        Box integerBoxWithoutGenerics = new Box();

        integerBox.set(123);

        Integer integerDinBox = integerBox.get();
        System.out.println(integerDinBox);


    }


//    public static <E> void rtti(List<E> list) {
//        if (list instanceof ArrayList<Integer>) { // compile-time error // ... }
//        }
//    }
    public static void rtti (List <?> list){
        if (list instanceof ArrayList<?>) { // OK; instanceof requires a reifiable type // ... }
        }
    }

//    public static void rtti (List <?> list){
//        if (list instanceof ArrayList<?>) { // OK; instanceof requires a reifiable type // ... }
//        }
//    }




    void printBoxContent(Box<?> box){
        Object o = box.get();
        if(o != null) {
            System.out.println(o instanceof Object);
            System.out.println(o.toString());
        }
    }

    void printBoxContentObject(Box<Object> box){

    }

}
