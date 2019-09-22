package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListUpdateTest {
    ArrayListUpdate a1= new ArrayListUpdate();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void test1() {
        ArrayList<String> a2 = new ArrayList<String>();
        ArrayList<String> a3 = new ArrayList<String>();
        a2.add("Apple");
        a2.add("Grape");
        a2.add("Banana");
        a2.add("Orange");

        assertEquals(a3,a1.aList(a2));


    }
}