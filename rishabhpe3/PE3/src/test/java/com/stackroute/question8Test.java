package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class question8Test {
    private question8 q1= new question8();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected = NullPointerException.class)
    public void testcase1()
    {

        q1.nullPointer();
    }
    @Test(expected = NegativeArraySizeException.class)
    public void testcase2()
    {

        q1.negativeArray();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testcase3()
    {

        q1.outOfBound();
    }
}