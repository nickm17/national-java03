package com.siit.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[][][] scores = {
                {{3, 4}, {}, {3, 4}, {3, 4}},
                {{3, 4}, {3, 4}}
        };

        int[] arr = {2, 5, 8, 3, 6, 5, 5, 5};
        int[] arrFaraDuplicate = {2, 5, 8, 3, 6};
        System.out.print("Array inainte de sort " + Arrays.toString(arr));
//        Arrays.sort(arr);

        bubbleSort(arr);

        System.out.println("Array dupa sort " + Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        var n = arr.length;
        for (int i = 0; i < n ; i++) {
            System.out.println("iteration number " + (i + 1));

            for (int j = 1; j < n - i; j++) {
                System.out.println("Comparing " + arr[j-1] + " and " + arr[j] );
                if (arr[j-1] > arr[j]){
                    System.out.println(arr[j-1] + " is greater than " + arr[j]);

                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    System.out.println("Array dupa swap");
                    System.out.print(Arrays.toString(arr));
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                }
            }
        }
    }
}
