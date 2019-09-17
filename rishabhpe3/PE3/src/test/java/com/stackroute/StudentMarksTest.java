package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class StudentMarksTest {
    private static StudentMarks studentMarks;

    @Before
    public void setUp() throws Exception {
        studentMarks = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        studentMarks=null;
    }

    @Test
    public void testisValidMarksList(){
        int noOfStudents=5;
        studentMarks.setNoOfStudents(noOfStudents);
        int[] arr= {50,20,1,11,34};
        assertEquals(true,studentMarks.isValidMarksList(arr));


    }

    @Test
    public void testisValidMarksList1(){
        int noOfStudents=4;
        studentMarks.setNoOfStudents(noOfStudents);
        int[] arr= {50,20,1,111};
        assertFalse(studentMarks.isValidMarksList(arr));
    }

    @Test
    public void testisValidMarksList2(){
        int noOfStudents=0;
        studentMarks.setNoOfStudents(noOfStudents);
        int[] arr= {};
        assertTrue(studentMarks.isValidMarksList(arr));
    }



}