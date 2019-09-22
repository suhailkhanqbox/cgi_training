package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceDToFTest {

    ReplaceDToF r1= new ReplaceDToF();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testCase1(){
        String s="daily dry";

        assertEquals("faity fry", r1.rep(s));

    }

    @Test
    public void testCase2(){
        String s="fatehgarh and Suhail";

        assertEquals("fatehgarh anf Suhait", r1.rep(s));

    }
}