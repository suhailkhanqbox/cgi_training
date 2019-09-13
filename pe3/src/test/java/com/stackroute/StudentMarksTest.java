package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
private StudentMarks s1=new StudentMarks();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1()
    {
        int [] arr1={10,20,30,40,-5,105};
        int num= arr1.length;
        String actual=s1.marks(arr1,num);
        assertEquals("passed negative value","error",actual);
        assertNotEquals("passed greater than 100","no error",actual);
//        assertNull();
    }

    @Test
    public void testcase2()
    {
        int [] arr1={10,20,30,40};
        int num= arr1.length;
        String actual=s1.marks(arr1,num);
        assertEquals("passed correct value","no error",actual);
        assertNotEquals("passed","error",actual);
//        assertNull();
    }
}