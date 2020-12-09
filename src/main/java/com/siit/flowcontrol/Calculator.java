package com.siit.flowcontrol;

public class Calculator {

    private SwitchEx switchEx;

    /**
     * This methods does arithmetic operations
     */
    public double calculate(double n1, double n2, String operatie) {

        if (n1 == 5.0) {
            return switchEx.extracted(n1, n2 , operatie);
        }

        switch (operatie) {
            case "+":
                System.out.println("Suma numerelor este " + (n1 + n2));
//                break;
//                Integer.parseInt(operatie);
                return n1 + n2;
            case "-":
                System.out.println("Diferenta noua numerelor este " + (n1 - n2));
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
