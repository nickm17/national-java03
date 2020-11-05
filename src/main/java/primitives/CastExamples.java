package primitives;

import java.util.Scanner;

public class CastExamples {

    public static void main(String[] args) {
        float f = 1234563.3232F;
        float f1 = 1234563.33f;
        double d1 = 214748364711.22;

        int castDinFloat = (int) d1; // downcasting sau narrowing
        int castDinDouble = (int) d1; // downcasting sau narrowing
        double castDoubleDinFloat = f1; // upcasting sau widening cast
        System.out.println(castDinFloat);
        System.out.println(castDinDouble);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(++castDinFloat); // overflow , trece la MIN_VALUE (negativ)
//
////        System.out.println(castDinFloat/ 0); // java.lang.ArithmeticException
//        System.out.println(d1/ 0); // poate arunca si aici java.lang.ArithmeticException
//
        System.out.println(Double.MAX_VALUE + 1);
        System.out.println(Double.MIN_VALUE - 1);
//
//        String numberString = "11";
//        String s1 = 5 + 22 / 33 + numberString;
//        String s2 = numberString + 6 / 3 * 33 ;
//        System.out.println(s1);
//        System.out.println(s2);
//


//
//        int ternar = f1 > d1 ? 1 + 3 : 2;
        int ternar2 = (1 == 1) ? 1 + 3 : 2;
//
//        System.out.println(ternar);
//        System.out.println(ternar2);
//
//        System.out.println("un string" instanceof  String);
//        System.out.println("un string" instanceof  String);


        Scanner sc = new Scanner(System.in);

        System.out.println("introduceti numarul : ");
        double sss = sc.nextDouble();
        int sssi = sc.nextInt();
        String str = sc.next();
        double v = Math.pow(Math.sin(sss), 2) + Math.pow(Math.cos(sss), 2);
        System.out.println(v);
        System.out.println(str);



    }
}
