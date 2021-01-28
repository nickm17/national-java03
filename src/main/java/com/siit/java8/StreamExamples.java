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

        Trader raoul = new Trader("Raoul", "Camridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambidge");

        Transaction transaction1 = new Transaction(1000, 2021, raoul);
        Transaction transaction2 = new Transaction(1500, 2021, mario);
        Transaction transaction3 = new Transaction(100, 2020, alan);
//        Transaction transaction4 = new Transaction(100, 2020);
        Transaction transaction5 = new Transaction(1200, 2021, brian);
        Transaction transaction4 = new Transaction(1200, 2021, raoul);
        Transaction transaction6 = new Transaction(1300, 2021, brian);

        Comparator<Transaction> comparator = Comparator.comparingInt(Transaction::getValue);
        Comparator<Transaction> comparator2 = (tr1, tr2) -> tr1.getValue() - tr2.getValue();
        comparator.compare(transaction1, transaction2);


        Transaction[] transactions = {transaction1, transaction2, transaction3, transaction5, transaction6, transaction4};
        Stream.of(transactions)
              .filter(transaction -> transaction.getYear() == 2021)
              .distinct()
//              .sorted()
              .sorted((tr1, tr2) -> tr1.getValue() - tr2.getValue())
              .sorted(Comparator.comparingInt(Transaction::getValue))
              .sorted(comparator2)
              .forEach(System.out::println);

//                                                  .collect(Collectors.toList());
//        transactionList.forEach(System.out::println);


//              .sorted((tr1, tr2) -> tr1.getValue() - tr2.getValue())


            Stream.of(transactions)
                  .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                  .mapToInt(transaction -> transaction.getValue())
                  .forEach(value -> System.out.println(value));
//                  .forEach(transaction -> System.out.println(transaction.getValue()));


    }

}
