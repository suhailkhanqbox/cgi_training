package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest extends Factorial {
    private Factorial f1=new Factorial();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1()
    {
        boolean expected= true;
        boolean actual;

        actual=f1.factorialint();

        Assert.assertEquals(actual,expected);

    }

    @Test
    public void testcase2()
    {
        boolean expected= true;
        boolean actual;

        actual=f1.factorialdouble();

        Assert.assertEquals(actual,expected);

    }
}