package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class sortedWordsTest {

    sortedWords c1= new sortedWords();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCase2(){
        String s="Write a program";
        String [] s2=s.split(" ", 0);
        String s1="eirtw a agmoprr";
        int i=11;
        assertEquals(s1, c1.sor(s));

    }

    @Test
    public void testCase1(){
        String s="Write a abzdsd Proqwcd";
        String [] s2=s.split(" ", 0);
        String s1="eirtw a abddsz cdopqrw";
        int i=11;
        assertEquals(s1, c1.sor(s));

    }
}