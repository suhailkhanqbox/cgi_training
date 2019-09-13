package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class question10Test {
    private question10 q1=new question10();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1()
    {

        String content= "hello world and kill world";

        String content1= "hello world and kwill world";
        String fileExtension=".txt";
        String fileName="p.text";
        String actual="";
        actual = q1.filesFolder(fileExtension,fileName);
        assertEquals("return true after reading file",content,actual);
        assertNotEquals("return true after reading file",content1,actual);
    }
}