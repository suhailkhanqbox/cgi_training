package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest extends Member {
    private MemberVariable member1;
    @Before
    public void setUp() throws Exception {
        member1= new MemberVariable ();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testcase1()
    {
        boolean expected= true;
        boolean actual;
        actual=member1.setparameter("suti",23,50000);

        Assert.assertEquals(actual,expected);
    }

}