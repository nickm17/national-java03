package com.siit.flowcontrol;

import java.util.Scanner;

/**
 * ExempleSupplier cu if
 */
public class IfElseEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti un numar intreg: ");
        int numar = sc.nextInt();

        if (isEven(numar)) {
            System.out.println("Numarul " + numar + " este par");
        } else if (numar % 2 == 1) {
            System.out.println("Numarul " + numar + "este impar");
        } else {
            // nu ajunge niciodata
        }

//        int i = 1;
//        if (i) {
//
//        }

        boolean b = true;
        if (b) {
            b = false; // b este in scop
        }

    }

    /* multi
    line comment
    dasndkas
    skadnksjd
    jdanskdn

     */



    /** Javadoc
     * Metoda care verifica daca un numar este par
     *
     * @author nick
     *
     * @param numar numar intreg d everificat
     *
     * @return true if the number is even
     */
    public static boolean isEven(int numar) {
        return numar % 2 == 0;
    }
}
