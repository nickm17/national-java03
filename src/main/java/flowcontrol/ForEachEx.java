package flowcontrol;

import java.util.Arrays;

public class ForEachEx {

    public static void main(String[] args) {
//        int [] array = new int[3];
//
//        for ( int i : array ) {
//            System.out.println(i);
//        }

//        int [][] arrayBi = new int[3][3];
//
//        System.out.println(Arrays.toString(arrayBi));
//
//        for ( int[] i : arrayBi ) {
//            System.out.print(Arrays.toString(i));
//        }

        // un array de dimensiune 3 cu valori default (null)
        int [][] arrayBiNesimetric = new int[3][]; //{null, null, null}
//        int length = arrayBiNesimetric[0].length;// NullPointerException
        arrayBiNesimetric[0] = new int[2]; // //{{0,0}}, null, null}
        int lengthBun = arrayBiNesimetric[0].length;//2
        arrayBiNesimetric[1] = new int[1];
        arrayBiNesimetric[2] = new int[3];

        System.out.println(Arrays.toString(arrayBiNesimetric));

        for ( int[] arrayFromArray : arrayBiNesimetric ) {
            System.out.print(Arrays.toString(arrayFromArray) + ",");
            for (int i : arrayFromArray) {
                System.out.print(i + " , ");
            }
        }
        // numarul de dimensiuni este egal cu nr de acolade imbricate
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8}
        };
        int[] array = {1, 2, 3};

        int[][][] matrix3dim = {
                {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}},
                {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}},
                {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}}
        };
        int primulElementDinPrimulArray = matrix3dim[0][0][0];//1
    }
}
