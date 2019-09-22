package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpTest {
    RegularExp c1= new RegularExp();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCase2(){
        String s="This is Harry";
        String s1="ym eman si ynohtna";
        int i=11;
        assertEquals(true, c1.reg(s));

    }
}