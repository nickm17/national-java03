package com.siit.flowcontrol;

public class ForEx {

    static int classVariable = 22;
    int instanceVariable = 33;

    public static void main(String[] args) {
        int i = 0; // i intra in scop aici , pana la finalul metodei
        for ( int j = 1; i < 10 ; i++) { // j este in scop doar in for
            System.out.println(i);
            System.out.println(i);
            System.out.println(i);
        }
        System.out.println(i);
        System.out.println(classVariable);
//        System.out.println(instanceVariable);// in context static nu putem accesa variabile nestatice/de instanta
//        System.out.println(j);

//        int [] array = new int[3];
//
//        for (int k = 0 ; k < array.length ; k++){
//            System.out.println(array[k]);
//        }

        int [][] arrayBi = new int[3][3];

        for (int k = 0 ; k < arrayBi.length ; k++){
//            System.out.println(array[k]);
            for (int l = 0 ; l < arrayBi[k].length ; l++){
                arrayBi[k][l] = l + k; // suprascriem valorile default
                System.out.print(arrayBi[k][l]);
            }
            System.out.println();
        }
    }
}
