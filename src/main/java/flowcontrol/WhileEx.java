package flowcontrol;

import java.util.Scanner;

public class WhileEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar intreg: ");

        int n1 = sc.nextInt();
        while (n1 != 0) {
            int ultimaCifra = n1 % 10;
            n1 = n1 / 10;
            if (ultimaCifra == 3) {
//                continue; // executia continua cu urmatoarea iteratie
                break; // intrerupe executia complet
            }

            if (IfElseEx.isEven(ultimaCifra)) {
                System.out.println("cifra " + ultimaCifra + " este par");
            } else {
                System.out.println("cifra " + ultimaCifra + " este impar");
            }
//            n1 = n1 / 10;
//            n1 /= 10;
        }
    }


}
