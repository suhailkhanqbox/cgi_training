package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class multiStringOccurencesTest {

    multiStringOccurences c2= new multiStringOccurences();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCase2(){
        String s="She sells seashells by the seashore";
        String s1="se";
        String s2= "Found at: 4 - 6, Found at: 10 - 12, Found at: 27 - 29,";
        assertEquals(s2, c2.mso(s,s1));

    }

}