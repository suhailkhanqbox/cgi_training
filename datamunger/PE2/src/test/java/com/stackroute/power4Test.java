package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class power4Test extends power4 {

    private power4 power;

    @Before
    public void setUp() throws Exception {
        power = new power4();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1()
    {
        boolean expected= true;
        boolean actual;
        actual=power.checkpower(64);
        Assert.assertEquals(actual,expected);
    }

}