package primitives;

import java.util.Scanner;

public class SinCosExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Folosim clasa Scanner pentru a interactiona cu consola

        System.out.println("introduceti primul numar : ");
        double sss = sc.nextDouble();
        System.out.println("introduceti al doilea numar intreg : ");
        int nrIntreg = sc.nextInt();
        System.out.println("introduceti un string : ");
        String str = sc.next();

        double rezultat = Math.pow(Math.sin(sss), 2) + Math.pow(Math.cos(sss), 2);

        System.out.println(rezultat);
        System.out.println(nrIntreg);
        System.out.println(str);



    }
}
