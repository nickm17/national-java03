package com.siit.flowcontrol;

import java.awt.print.Book;
import java.util.Arrays;

public class ForEachEx {

    private Book [] arrayOfBooks = new Book[10];

    // getters / setters
    public void importBooks(){
        arrayOfBooks[0] = new Book();
        arrayOfBooks[1] = new Book();
        arrayOfBooks[0] = new Book();
        arrayOfBooks[0] = new Book();
        arrayOfBooks[0] = new Book();
        arrayOfBooks[0] = new Book();

    }

    public void importOneBook(Book book){
        arrayOfBooks[0] = book;
    }

    public Book[] deleteOneBookIfPresent(Book book){

        // iterati

        if (arrayOfBooks[0].equals(book)){
            // retinem i si facem o copie a array-ului fara acel index/obiect
            // sau setam la null
        }
        return null;
    }

    public void listBooks(){
        for (Book book : arrayOfBooks) {
//            System.out.println(book.printBook());
            // if null, sari peste
            System.out.println(book.toString());
        }

    }






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
