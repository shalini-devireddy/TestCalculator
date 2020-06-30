package com.tests;

import com.examples.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMultiplication {

    Calculator aCalculator;

    @BeforeTest
    public void setUp(){
       aCalculator = new Calculator();
    }
    @Test
    public void testTwoPostive(){
        Assert.assertEquals(aCalculator.multiplication(5,3),15);
    }

    @Test
    public void testTwoNegative(){
        Assert.assertEquals(aCalculator.multiplication(-5,-3),15);
    }
    @Test
    public void testOnePositiveOneNegative(){
        Assert.assertEquals(aCalculator.multiplication(-5,3),-15);
    }

}
