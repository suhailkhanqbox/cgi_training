package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {

    private static ConsecutiveNumbers c;

    @Before
    public void setUp() throws Exception {
        c=new ConsecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
        c=null;
    }

    @Test
    public void testConsecutiveNumbers(){
        String s="1,2,3,4,5";
        assertEquals("true",c.checkConsecutive(s));
    }

    @Test
    public void testConsecutiveNumbers1(){
        String s="9,8,7,6,5,4";
        assertEquals("true",c.checkConsecutive(s));
    }

    @Test
    public void testConsecutiveNumbers2(){
        String s="1,2,-3,4,5";
        assertEquals("false",c.checkConsecutive(s));
    }

    @Test
    public void testConsecutiveNumbers3(){
        String s="1,2,yo,4,5";
        assertEquals("invalid string",c.checkConsecutive(s));
    }
}