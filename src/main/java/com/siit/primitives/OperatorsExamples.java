package com.siit.primitives;

public class OperatorsExamples {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.println(a++); // printeaza 1 dupa care incrementeaza
        System.out.println(++b); // incrementeaza dupa care printeaza

        String numberString = "11";
        String s1 = 5 + 6 / 3 + numberString; // face operatiile matematice respectand precedenta operatorilor dupa care concateneaza rezultatul cu stringul
        String s2 = numberString + 6 / 3 * 33 ; // respecta precedenta operatorilor
        String s3 = numberString + 6 + 3 + 33 ; // deoarece operatorii au aceeasi precedenta se incepe de la stanga la dreapta concatenant totul la stringul initial
        System.out.println(s1);
        System.out.println(s2);

        float f1 = 1234563.33f;
        double d1 = 214748364711.22;

        int ternar = f1 > d1 ? 1 + 3 : 2;
        int ternar2 = (1 == 1) ? 1 + 3 : 2;

        System.out.println(ternar);
        System.out.println(ternar2);

        System.out.println("un string" instanceof  String);




    }
}
