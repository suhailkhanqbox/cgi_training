package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest extends Student {
    private Student s1;
    @Before
    public void setUp() throws Exception {
         s1= new Student();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1()
    {
        float expected= 25;
        float actual;
        float [] arr={10,20,30,40};
        int num=arr.length;
        actual=s1.average(arr,num);

        assertEquals(actual,expected,0.1);
    }
    @Test
    public void testcase2()
    {
        float expected= 10;
        float actual;
        float [] arr={10,20,30,40};
        int num=arr.length;
        actual=s1.min(arr,num);

        assertEquals(actual,expected,0.1);
    }
    @Test
    public void testcase3()
    {
        float expected= 40;
        float actual;
        float [] arr={10,20,30,40};
        int num=arr.length;
        actual=s1.max(arr,num);

        assertEquals(actual,expected,0.1);
    }

}