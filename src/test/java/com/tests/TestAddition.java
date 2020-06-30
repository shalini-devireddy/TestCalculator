package com.tests;

import com.apps.CalculatorApp;
import com.examples.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAddition {

    Calculator aCalculator;

    @BeforeTest
    public void setUp(){
       aCalculator = new Calculator();
    }
    @Test
    public void testTwoPostive(){
        Assert.assertEquals(aCalculator.add(5,3),8);
    }

    @Test
    public void testTwoNegative(){
        Assert.assertEquals(aCalculator.add(-5,-3),-8);
    }
    @Test
    public void testOnePositiveOneNegative(){
        Assert.assertEquals(aCalculator.add(-5,3),-2);
    }

}
