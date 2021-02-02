package com.siit.io;

import com.siit.nio.ScannerReadingFileEx;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Scanner;

@RunWith(MockitoJUnitRunner.class)
public class ExempluTest {

    @InjectMocks
    private ScannerReadingFileEx scannerReadingFileEx;

    @Test
    public void given_valid_csv_when_parsing_then_athlet_is_returned(){
        // Given
        String csv = "11,Umar Jorgson,SK,30:27,xxxox,xxxxx,xxoxo\n" +
                "1,Jimmy Smiles,UK,29:15,xxoox,xooxo,xxxxo\n" +
                "27,Piotr Smitzer,CZ,30:10,xxxxx,xxxxx,xxxxx";

        String csvLine1 = "Ion,Popescu,25";

        Scanner scanner = Mockito.mock(Scanner.class);
        Mockito.when(scanner.nextLine()).thenReturn(csvLine1);

        // When
        // parser.parseSkiers(List<String>)
        Employee employee = scannerReadingFileEx.mapLineToEmployee(csvLine1);

        // Then
        Assert.assertEquals(employee.getAge(), 25);
        Assert.assertEquals(employee.getFirstName(), "Ion");
        Assert.assertEquals(employee.getLastName(), "Popescu");
    }

    @Test
    public void given_valid_csv_when_parsing_then_athlet_list_is_returned(){
        // Given
        String csv = "11,Umar Jorgson,SK,30:27,xxxox,xxxxx,xxoxo\n" +
                "1,Jimmy Smiles,UK,29:15,xxoox,xooxo,xxxxo\n" +
                "27,Piotr Smitzer,CZ,30:10,xxxxx,xxxxx,xxxxx";

        String csvLine1 = "Ion,Popescu,25";

        List<String> lines = List.of(csvLine1, csvLine1, csvLine1);

        // When
        // parser.parseSkiers(List<String>)
        List<Employee> employees = scannerReadingFileEx.mapLinesToEmployees(lines);

        // Then
        Assert.assertEquals(employees.size() , 3);

        employees.forEach(employee -> {

            Assert.assertEquals(employee.getAge(), 25);
            Assert.assertEquals(employee.getFirstName(), "Ion");
            Assert.assertEquals(employee.getLastName(), "Popescu");

        });
    }


    @Test
    public void given_valid_csv_when_parsing_then_athlet_row_is_returned(){
        // Given
        String csv = "11,Umar Jorgson,SK,30:27,xxxox,xxxxx,xxoxo\n" +
                "1,Jimmy Smiles,UK,29:15,xxoox,xooxo,xxxxo\n" +
                "27,Piotr Smitzer,CZ,30:10,xxxxx,xxxxx,xxxxx";

        String csvLine1 = "Ion,Popescu,25";

        Scanner scanner = Mockito.mock(Scanner.class);
        Mockito.when(scanner.hasNextLine()).thenReturn(true);
        Mockito.when(scanner.nextLine()).thenReturn(csvLine1);

        // When
        // parser.parseSkiers(List<String>)
        String row = scannerReadingFileEx.logicaCitireEmployee(scanner);

        // Then
        Assert.assertEquals(row, csvLine1);
//        Assert.assertEquals(employee.getFirstName(), "Ion");
//        Assert.assertEquals(employee.getLastName(), "Popescu");


    }

}
