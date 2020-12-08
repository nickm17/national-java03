package com.siit.string;

import java.util.Arrays;

public class PassByValueEx {

    public static void main(String[] args) {
        int[] arr = new int[2];
        // vreau apelez o metoda care adauga valori
        methodWithParamArray(arr);

        // folosesti ce ai adaugat
        System.out.println(Arrays.toString(arr));

    }

    private static int[] methodWithParamArray(int [] arrLocalReference){
        arrLocalReference[0] = 1;
        arrLocalReference = null;
        return arrLocalReference;
    }

    private static void methodWithParamString(String string){
        string.concat("Third");
    }

}
