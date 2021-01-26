package com.siit.java8;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamExamples {


    /*

            Find all transactions in the year 2021 and sort them by value (small to high).
            What are all the unique cities where the traders work?
            Find all traders from Cambridge and sort them by name.
            Return a string of all traders names sorted alphabetically.
            Are any traders based in Milan?
            Print all transactions values from the traders living in Cambridge.
            Whats the highest value of all the transactions?
            Find the transaction with the smallest value.

     */

    public static void main(String[] args) {

        Transaction transaction1 = new Transaction(1000, 2021);
        Transaction transaction2 = new Transaction(1500, 2021);
        Transaction transaction3 = new Transaction(100, 2020);
//        Transaction transaction4 = new Transaction(100, 2020);
        Transaction transaction5 = new Transaction(1200, 2021);
        Transaction transaction4 = new Transaction(1200, 2021);
        Transaction transaction6 = new Transaction(1300, 2021);

        Stream.of(transaction1, transaction2, transaction3, transaction5, transaction6, transaction4)
              .filter(transaction -> transaction.getYear() == 2021)
              .distinct()
              .sorted(Comparator.comparingInt(Transaction::getValue))
              .forEach(System.out::println);

//                                                  .collect(Collectors.toList());
//        transactionList.forEach(System.out::println);


//              .sorted((tr1, tr2) -> tr1.getValue() - tr2.getValue())


    }

}
