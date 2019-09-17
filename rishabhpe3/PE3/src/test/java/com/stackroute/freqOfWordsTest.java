package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class freqOfWordsTest {
    private freqOfWords f1= new freqOfWords();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1() throws IOException {

        String fileName="randomText.txt";
        String content= "i am a man,i like to sleep,i have a home";
        String[] count={"i-3","am-1","a-2","man-1","like-1","to-1","sleep-1","have-1","home-1"};
        String[] count2={"i-3","am-1","a-2","man-1","like-1","to-1","sleep-1","have-1","home-0"};
        String[] actual = f1.words(fileName,content);



        assertEquals("return true after reading file",count,actual);
        assertNotEquals("return true after reading file",count2,actual);
    }
}