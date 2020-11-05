package primitives;

public class IntegerOperations {

    static int a;

    public static void main(String[] args) {
        System.out.println(a); // a are valoare default
        a = 12;
        System.out.println(a);
        int b = 10;
        System.out.println(b);
        System.out.println(a + b); // operatie matematica
        System.out.println("a + b = " + a + b); // concatenare cu un String

        char c = 'a';
        char c1 = 'a';
        short s = 2;
        System.out.println(c + c1); // printeaza rezultatul codurilor ASCII aferent caracterelor
        System.out.println(c); // va printa caracterul
        System.out.println(s);
        System.out.println(c + s); // codul aferent lui c in cod ASCII
        System.out.println('A' + s); // c in cod ASCII + 2

        String string = "";
        byte byte1 = 1;
        short sh = 2;
        int result = sh + sh; // pentru short, byte , char rezultatul operatiilor este int
        int result2 = byte1 * sh;

        long l = 1234563L;
        long l1 = 1234563l;

        long l2 = result + l; // rezultatul este de tipul cel mai mare

        float f = 1234563.3232F;
        float f1 = 1234563.33f;
        double d1 = 214748364711.22;

        double d2 = d1 + f; // rezultatul dintre double si float e double


    }
}
