package com.siit.flowcontrol;

public class Calculator {

    /**
     * This methods does arithmetic operations
     */
    public static int calculate(int n1, int n2, String operatie) {
        switch (operatie) {
            case "+":
                System.out.println("Suma numerelor este " + (n1 + n2));
//                break;
                Integer.parseInt(operatie);
                return n1 + n2;
            case "-":
                System.out.println("Diferenta numerelor este " + (n1 - n2));
//                break;
                return n1 - n2;
            case "*":
                System.out.println("Produsul numerelor este " + (n1 * n2));
//                break;
                return n1 * n2;
            case "/":
                System.out.println(n1 + " Impartit la " + n2 + " este" + (n1 / n2));
//                break;
                return n1 / n2;
            default:
                System.out.println("Operatie necunoscuta");
                throw new IllegalArgumentException("Unimplemented operation");
        }
    }

}
