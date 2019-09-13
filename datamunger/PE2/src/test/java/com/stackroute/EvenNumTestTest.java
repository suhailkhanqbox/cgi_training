package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest extends EvenNumTest {
private EvenNumTest a1= new EvenNumTest();
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
        actual=a1.isEven(124);

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testcase2()
    {
        boolean expected= false;
        boolean actual;
        actual=a1.isEven(123);

        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testcase3()
    {
        boolean expected= true;
        boolean actual;
        actual=a1.isEven(0);

        Assert.assertEquals(actual,expected);
    }

}