package com.siit.functions;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FibonacciTest {

    @InjectMocks
    private Fibonacci fibonacciUnderTest;

    @Before
    public void before(){
        System.out.println("inainte de test");
    }

    @After
    public void after(){
        System.out.println("dupa test");
    }

    @Test
    public void testNFiboNumber(){

        var fibonacciActualResult = fibonacciUnderTest.fibonacci(10);

        Assert.assertEquals(55, fibonacciActualResult);

    }

}
