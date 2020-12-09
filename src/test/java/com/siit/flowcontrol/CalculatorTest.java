package com.siit.flowcontrol;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @InjectMocks
    private Calculator calculator;

    @Mock
    private SwitchEx switchEx;

    @Before
    public void before(){
        System.out.println("inainte de fiecare test");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("inainte de a executa vreun test, o singura data");
    }

    @After
    public void after(){
        System.out.println("dupa fiecare test");
    }

    @Test
    public void testAddition(){
//        Calculator calculator = new Calculator();
        double primulOperand = 2;
        double alDoileaOperand = 5;
        String operatieInTest = "+";

        double result = calculator.calculate(primulOperand, alDoileaOperand, operatieInTest);

        Assert.assertEquals(7, result, 0);

    }

    @Test
    public void testDiv(){
//        Calculator calculator = new Calculator();
        double primulOperand = 15;
        double alDoileaOperand = 5;
        String operatieInTest = "/";

        double result = calculator.calculate(primulOperand, alDoileaOperand, operatieInTest);

        Assert.assertEquals(3, result, 0);

    }

    @Test
    public void test(){
//        Calculator calculator = new Calculator();
        double primulOperand = 15;
        double alDoileaOperand = 5;
        String operatieInTest = "-";

        double result = calculator.calculate(primulOperand, alDoileaOperand, operatieInTest);

        Assert.assertEquals(10, result, 0);

    }

    @Test
    public void testMultiply(){
//        Calculator calculator = new Calculator();
        double primulOperand = 4;
        double alDoileaOperand = 5;
        String operatieInTest = "*";

        double result = calculator.calculate(primulOperand, alDoileaOperand, operatieInTest);

        Assert.assertEquals(20, result, 0);

    }

    @Test
    public void testException(){
//        Calculator calculator = new Calculator();
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

    @Test
    public void testAdditionCallingSwitchExCalculator(){
//        Calculator calculator = new Calculator();
        double primulOperand = 5;
        double alDoileaOperand = 5;
        String operatieInTest = "+";

        SwitchEx mock = Mockito.mock(SwitchEx.class);
        SwitchEx instanta = new SwitchEx();

        // izolam apelul la alte clase
//        when(switchEx.extracted(primulOperand, alDoileaOperand, operatieInTest)).thenReturn(110.0);
        when(switchEx.extracted(anyDouble(), anyDouble(), any())).thenReturn(10.0);

//        doNothing().when()

        double result = calculator.calculate(primulOperand, alDoileaOperand, operatieInTest);

        Assert.assertEquals(10.0, result, 0);

    }
}
