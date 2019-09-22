package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class transposeStringTest {

    transposeString c1= new transposeString();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testCase1(){
        String s="a quick brown fox jumps over the lazy dog";
        String [] s2=s.split(" ", 0);
        String s1="a kciuq nworb xof spmuj revo eht yzal god";
        int i=11;
        assertEquals(s1, c1.trans(s));

    }

    @Test
    public void testCase2(){
        String s="my name is anthony";
        String [] s2=s.split(" ", 0);
        String s1="ym eman si ynohtna";
        int i=11;
        assertEquals(s1, c1.trans(s));

    }
}