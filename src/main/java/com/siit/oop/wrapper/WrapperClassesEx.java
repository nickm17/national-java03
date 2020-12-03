package com.siit.oop.wrapper;


import com.siit.oop.javaoop2.NumberUtils;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.Fraction;

import static java.lang.Double.valueOf;
import static java.lang.Integer.max;
import static java.lang.Integer.sum;

public class WrapperClassesEx {

    public static void main(String[] args) {

        Integer integer = new Integer(11); // deprecated

        System.out.println(integer.doubleValue());

        // Boxing si Unboxing este facut automat
        int i = 10;
        Integer j = i;
        int k = j;

        System.out.println(sum(i, k));
        System.out.println(sum(i, j));

        org.apache.commons.lang3.math.NumberUtils numberUtils;
        Fraction fraction;

        StringUtils stringUtils;

        System.out.println(max(1, 5));
        System.out.println(Integer.parseInt("123"));
        System.out.println(Integer.valueOf("123"));
        int bad = Integer.valueOf("123");
        Integer good = Integer.valueOf("123"); // este indicat sa folosim metoda care returneaza tipul de data ce intentionam sa folosim
        // parseXXXXX("1111") returneaza primitiva
        // valueOf("1111") returneaza obiect Integer/Double/Long etc
        double valueOfBad = valueOf("123.111");
        double parseDoubleGood = Double.parseDouble("123.111");// este indicat sa folosim metoda care returneaza tipul de data ce intentionam sa folosim
        Double valueOfDoubleGood = valueOf("123.111");


        boolean booleanPrimitiva = true;

        System.out.println(Boolean.parseBoolean("false"));
        NumberUtils numberUtils2;
    }

}
