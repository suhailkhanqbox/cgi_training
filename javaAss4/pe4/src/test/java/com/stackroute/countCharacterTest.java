package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class countCharacterTest {
    private countCharacter c1= new countCharacter();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCase1(){
      String s="Java is java again java again";
      char c='a';
        int i=10;
        assertEquals(i, c1.counter(s,c));

    }

    @Test
    public void testCase2(){
        String s="Java a java a java aaja";
        char c='a';
        int i=11;
        assertEquals(i, c1.counter(s,c));

    }

}