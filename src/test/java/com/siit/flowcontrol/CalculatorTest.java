package com.siit.flowcontrol;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @Test
    public void testAddition(){
        Calculator calculator = new Calculator();
        double primulOperand = 2;
        double alDoileaOperand = 5;
        String operatieInTest = "+";

        double result = calculator.calculate(primulOperand, alDoileaOperand, operatieInTest);

        Assert.assertEquals(7, result, 0);

    }

    @Test
    public void testException(){
        Calculator calculator = new Calculator();
        double primulOperand = 2;
        double alDoileaOperand = 5;
        String operatie = "++++";

        try {
            calculator.calculate(primulOperand, alDoileaOperand, operatie);
        } catch (Exception exception) {
            Assert.assertNotNull(exception);
            Assert.assertTrue(exception instanceof IllegalArgumentException);
            Assert.assertEquals("Unimplemented operation", exception.getMessage());
        }
    }
}
