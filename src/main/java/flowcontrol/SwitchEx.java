package flowcontrol;

import java.util.Scanner;

public class SwitchEx {


    public static void main(String[] args) {

//        boolean expression = true; //Incompatible types. Found: 'boolean', required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
//        switch(expression) {
//            case true:
//                // do something
//                break; // optional
//            case false:
//                // do something else
//                break; // optional
//            default: // optional
//                // do something if value is none of the cases above
//        }
//        String expression = "2";
//        switch(expression) {
//            default: // optional
//                // do something if value is none of the cases above
//                System.out.println("Argumentul cu indexul 0 nu este nici 1, nici 0");
//                break;
//            case "1":
//                // do something
//                System.out.println("Argumentul cu indexul 0 este 1");
//                break; // optional
//            case "0":
//                // do something else
//                System.out.println("Argumentul cu indexul 0 este 0");
//                break; // optional
//
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("introduceti primul numar:");
        int n1 = sc.nextInt();
        System.out.println("introduceti al doilea numar:");
        int n2 = sc.nextInt();
        System.out.println("introduceti operatia dorita pentru cele doua numere");
        String operatie = sc.next();

        switch (operatie) {
            case "+":
                System.out.println("Suma numerelor este " + (n1 + n2));
                break;
            case "-":
                System.out.println("Diferenta numerelor este " + (n1 - n2));
                break;
            case "*":
                System.out.println("Produsul numerelor este " + (n1 * n2));
                break;
            case "/":
                System.out.println(n1 + " Impartit la " + n2 + " este" + (n1 / n2));
                break;
            default:
                System.out.println("Operatie necunoscuta");
        }



        int result = calculate(n1, n2, operatie);
        System.out.println("result = " + result);
    }

    /**
     *
     * @param n1
     * @param n2
     * @param operatie
     * @return
     */
    private static int calculate(int n1, int n2, String operatie) {
        switch (operatie) {
            case "+":
                System.out.println("Suma numerelor este " + (n1 + n2));
//                break;
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
                return 0;
        }
    }

}
