package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class question7Test {
    private question7 e1= new question7();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected = Exception.class)
    public void testcase2() throws Exception {
        e1.main();


    }
}